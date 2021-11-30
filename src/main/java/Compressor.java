import com.nixxcode.jvmbrotli.dec.BrotliInputStream;
import com.nixxcode.jvmbrotli.enc.BrotliOutputStream;
import com.nixxcode.jvmbrotli.enc.Encoder;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;

import java.io.ByteArrayInputStream;
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

    public static String decompress(byte[] in) throws Exception {
        // Init file input and output
        InputStream inFile = new ByteArrayInputStream(in);

        ByteArrayOutputStream outFile = new ByteArrayOutputStream();

        // Initialize decompressor by binding it to our file input stream
        BrotliInputStream brotliInputStream = new BrotliInputStream(inFile);

        int read = brotliInputStream.read();
        while (read > -1) { // -1 means EOF
            outFile.write(read);
            read = brotliInputStream.read();
        }

        // It's important to close the BrotliInputStream object. This also closes the underlying FileInputStream
        brotliInputStream.close();
        outFile.close();

        return new String(outFile.toByteArray());
    }
}
