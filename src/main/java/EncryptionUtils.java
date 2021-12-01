import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class EncryptionUtils {

    public static byte[] encrypt(String input, Key key) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
        OAEPParameterSpec oaepParams = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-256"), PSource.PSpecified.DEFAULT);

        cipher.init(Cipher.ENCRYPT_MODE, key, oaepParams);

        return cipher.doFinal(input.getBytes(StandardCharsets.UTF_16));
    }

    public static byte[] encrypt(byte[] input, Key key, byte[] ivspec) throws Exception {
        Cipher ci = Cipher.getInstance("AES/GCM/NoPadding");
        ci.init(Cipher.ENCRYPT_MODE, key, new GCMParameterSpec(128, ivspec));

        return ci.doFinal(input);
    }

    public static PublicKey readPublicKey() throws Exception {
        InputStream inputStream = EncryptionUtils.class.getResourceAsStream("resources/banxware-pub.key");
        String rawKey = FileUtils.readFromInputStream(inputStream);

        String privateKeyPEM = rawKey
                .replace("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END PUBLIC KEY-----", "");

        byte[] decode = Base64.getDecoder().decode(privateKeyPEM);

        X509EncodedKeySpec spec = new X509EncodedKeySpec(decode);
        KeyFactory kf = KeyFactory.getInstance("RSA");

        return kf.generatePublic(spec);
    }

    public static byte[] generateIvParameterSpec() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);

        return iv;
    }

    public static SecretKey generateRandomKey() {
        byte[] key = new byte[32];
        new SecureRandom().nextBytes(key);
        return new SecretKeySpec(key, "AES");
    }

    public static String sign(String merchantInfo, String key) throws Exception {
        byte[] merchantInfoBytes = merchantInfo.getBytes(StandardCharsets.UTF_8);

        String privateKeyPEM = key
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END PRIVATE KEY-----", "");

        byte[] decode = Base64.getDecoder().decode(privateKeyPEM);

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decode);
        KeyFactory kf = KeyFactory.getInstance("RSA");

        final PrivateKey privateKey = kf.generatePrivate(spec);

        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initSign(privateKey);
        signature.update(merchantInfoBytes);

        byte[] signatureBytes = signature.sign();

        return Base64.getEncoder().encodeToString(signatureBytes);
    }
}

