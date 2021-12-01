import com.nixxcode.jvmbrotli.enc.BrotliOutputStream;
import com.nixxcode.jvmbrotli.enc.Encoder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

class Compressor {
    public static byte[] compress(String in) throws IOException {
        InputStream inFile = new ByteArrayInputStream(in.getBytes());
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
