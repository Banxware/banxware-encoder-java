import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class EncryptionUtils {

    public static final String BANXWARE_PUB_KEY = "src/resources/banxware-pub.key";
    public static final String TENANT_PRIVATE_KEY = "src/resources/test-tenant-private.key";

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
        String key = new String(Files.readAllBytes(Paths.get(BANXWARE_PUB_KEY)));

        String privateKeyPEM = key
                .replace("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END PUBLIC KEY-----", "");

        byte[] decode = Base64.getDecoder().decode(privateKeyPEM);

        X509EncodedKeySpec spec = new X509EncodedKeySpec(decode);
        KeyFactory kf = KeyFactory.getInstance("RSA");

        return kf.generatePublic(spec);
    }

    public static PrivateKey readPrivateKey() throws Exception {
        String key = new String(Files.readAllBytes(Paths.get(TENANT_PRIVATE_KEY)));

        String privateKeyPEM = key
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replaceAll(System.lineSeparator(), "")
                .replace("-----END PRIVATE KEY-----", "");

        byte[] decode = Base64.getDecoder().decode(privateKeyPEM);

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decode);
        KeyFactory kf = KeyFactory.getInstance("RSA");

        return kf.generatePrivate(spec);
    }
}

