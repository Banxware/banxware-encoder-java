import com.nixxcode.jvmbrotli.enc.BrotliOutputStream;
import com.nixxcode.jvmbrotli.enc.Encoder;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class Compressor {
    public static byte[] compress(String in) throws IOException {
        InputStream inFile = IOUtils.toInputStream(in, Charset.defaultCharset());
        ByteArrayOutputStream outFile = new ByteArrayOutputStream();

        Encoder.Parameters params = new Encoder.Parameters().setQuality(4).setWindow(16);

        BrotliOutputStream brotliOutputStream = new BrotliOutputStream(outFile, params);

        int read = inFile.read();
        while (read > -1) { // -1 means EOF
            brotliOutputStream.write(read);
            read = inFile.read();
        }

        brotliOutputStream.close();
        inFile.close();

        return outFile.toByteArray();
    }
}
