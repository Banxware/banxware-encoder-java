package com.banxware;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class Compressor {
    public static byte[] compress(String in) throws IOException {
        InputStream inFile = new ByteArrayInputStream(in.getBytes());
        ByteArrayOutputStream outFile = new ByteArrayOutputStream();

        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outFile);

        int read = inFile.read();
        while (read > -1) { // -1 means EOF
            gzipOutputStream.write(read);
            read = inFile.read();
        }

        gzipOutputStream.close();
        inFile.close();

        return outFile.toByteArray();
    }
}
