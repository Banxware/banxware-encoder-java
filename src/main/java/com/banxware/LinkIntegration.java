package com.banxware;

import com.banxware.model.MerchantLinkData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import javax.crypto.SecretKey;
import java.security.PublicKey;
import java.time.Instant;
import java.util.Base64;

public class LinkIntegration {

    public static String encode(MerchantLinkData merchantLinkData, String publicKey, String privateKey) {
        try {
            // convert merchant link to json and signs with tenants' private key
            String merchantInfo = toJsonWithEncryptionTime(merchantLinkData);
            final Message message = Message.builder()
                    .merchantInfo(merchantInfo)
                    .signature(EncryptionUtils.sign(merchantInfo, privateKey))
                    .build();

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
            PublicKey pubKey = EncryptionUtils.readPublicKey(publicKey);
            byte[] encryptedJsonWithSymmetricKeyPlusIvParameterEncryptedWithBanxwarePubKey = EncryptionUtils.encrypt(encryptedJsonWithSymmetricKeyPlusIvParameter, pubKey);
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

    private static String toJsonWithEncryptionTime(MerchantLinkData data) {
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .create();

        // Attach the field 'encryptionTime' to the json output
        String currentIsoTime = Instant.now().toString();
        JsonElement jsonElement = gson.toJsonTree(data);
        jsonElement.getAsJsonObject().addProperty("encryptionTime", currentIsoTime);

        return gson.toJson(jsonElement);
    }
}
