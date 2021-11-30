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
            // convert merchant link to json and signs with tenants' private key
            String merchantInfo = toJson(merchantLinkData);
            final Message message = Message.builder()
                    .merchantInfo(merchantInfo)
                    .signature(EncryptionUtils.sign(merchantInfo))
                    .build();

            // compress using brotli
            byte[] compressedJsonBlob = Compressor.compress(toJson(message));

            // create initialization vector and a random symmetric key
            byte[] ivspec = EncryptionUtils.generateIvParameterSpec();
            SecretKey skey = EncryptionUtils.generateRandomKey();
            String symetricKeyAsString = Base64.getEncoder().encodeToString(skey.getEncoded());
            String ivParameterSpecString = Base64.getEncoder().encodeToString(ivspec);

            String encryptedJsonWithSymmetricKeyPlusIvParameter = symetricKeyAsString + "$" + ivParameterSpecString;

            // encrypt compressed blob with random key
            byte[] encryptedJsonWithSymmetricKey = EncryptionUtils.encrypt(compressedJsonBlob, skey, ivspec);
            String encryptedJsonWithSymmetricKeyString = Base64.getEncoder().encodeToString(encryptedJsonWithSymmetricKey);

            // encrypt symmetric key with banxware pub key
            PublicKey publicKey = EncryptionUtils.readPublicKey();
            byte[] encryptedJsonWithSymmetricKeyPlusIvParameterEncryptedWithBanxwarePubKey = EncryptionUtils.encrypt(encryptedJsonWithSymmetricKeyPlusIvParameter, publicKey);
            String symmetricKeyEncryptedWithBanxwarePubKeyString = Base64.getEncoder().encodeToString(encryptedJsonWithSymmetricKeyPlusIvParameterEncryptedWithBanxwarePubKey);

            return encryptedJsonWithSymmetricKeyString + "$" + symmetricKeyEncryptedWithBanxwarePubKeyString;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    private static String toJson(Object o) {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();
        return gson.toJson(o);
    }
}
