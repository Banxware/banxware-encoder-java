import com.nixxcode.jvmbrotli.common.BrotliLoader;
import model.MerchantLinkData;

import java.net.URLEncoder;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws Exception {
        BrotliLoader.isBrotliAvailable();

        MerchantLinkData build = MerchantLinkData.builder()
                .name("foo")
                .merchantId(UUID.randomUUID().toString())
                .legalForm("foooooo")
                .email("baaar")
                .build();

        String encode = LinkIntegration.encode(build);
        System.out.println("BLOB: " + encode);

        System.out.println("ENCODE: " + URLEncoder.encode(encode, "UTF-8"));
    }
}