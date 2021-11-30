import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dto.Message;
import model.MerchantLinkData;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.Base64;

public class LinkIntegration {

    public static String encode(MerchantLinkData merchantLinkData) {
        try {
            // convert merchant link to json and signs with tenants private key
            String merchantInfo = toJson(merchantLinkData);
            final Message message = Message.builder()
                    .merchantInfo(merchantInfo)
                    .signature(sign(merchantInfo))
                    .build();

            System.out.println();

            // compress
            byte[] compressedJsonBlob = Compressor.compress(toJson(message));

            // encrypt compressed blob with random key
            byte[] ivspec = generateIvParameterSpec();
            System.out.println("IV: " + Base64.getEncoder().encodeToString(ivspec));
            SecretKey skey = generateRandomKey();
            System.out.println("KEY: " + Base64.getEncoder().encodeToString(skey.getEncoded()));

            byte[] encryptedJsonWithSymmetricKey = EncryptionUtils.encrypt(compressedJsonBlob, skey, ivspec); // TODO
            String encryptedJsonWithSymmetricKeyString = Base64.getEncoder().encodeToString(encryptedJsonWithSymmetricKey);

//            String encryptedJsonWithSymmetricKeyString = new String(Base64.getEncoder().encode(encryptedJsonWithSymmetricKey));
            String symetricKeyAsString = Base64.getEncoder().encodeToString(skey.getEncoded());
            String ivParameterSpecString = Base64.getEncoder().encodeToString(ivspec);

            String encryptedJsonWithSymmetricKeyPlusIvParameter = symetricKeyAsString + "$" + ivParameterSpecString;
//            System.out.println("encryptedJsonWithSymmetricKeyPlusIvParameter: " + encryptedJsonWithSymmetricKeyPlusIvParameter); // TODO REMOVE ME

            // encrypt symmetric key with banxware pub key
            PublicKey publicKey = EncryptionUtils.readPublicKey();
            byte[] encryptedJsonWithSymmetricKeyPlusIvParameterEncryptedWithBanxwarePubKey = EncryptionUtils.encrypt(encryptedJsonWithSymmetricKeyPlusIvParameter, publicKey);

            String symmetricKeyEncryptedWithBanxwarePubKeyString = Base64.getEncoder().encodeToString(encryptedJsonWithSymmetricKeyPlusIvParameterEncryptedWithBanxwarePubKey);
            System.out.println("symmetricKeyEncryptedWithBanxwarePubKeyString: " + symmetricKeyEncryptedWithBanxwarePubKeyString);

            return encryptedJsonWithSymmetricKeyString + "$" + symmetricKeyEncryptedWithBanxwarePubKeyString;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private static byte[] generateIvParameterSpec() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);

        return iv;
    }

    private static SecretKey generateRandomKey() {
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        return new SecretKeySpec(key, "AES");
    }

    private static String sign(String merchantInfo) throws Exception {
        byte[] merchantInfoBytes = merchantInfo.getBytes(StandardCharsets.UTF_8);

        final PrivateKey privateKey = EncryptionUtils.readPrivateKey();

        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initSign(privateKey);
        signature.update(merchantInfoBytes);

        byte[] signatureBytes = signature.sign();

        return Base64.getEncoder().encodeToString(signatureBytes);
    }

    private static String toJson(Object o) {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();
        return gson.toJson(o);
    }
}
