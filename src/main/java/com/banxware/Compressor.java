package com.banxware;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

class Compressor {
    public static byte[] compress(String in) throws IOException {
        InputStream fis = new ByteArrayInputStream(in.getBytes());
        ByteArrayOutputStream fos = new ByteArrayOutputStream();
        GZIPOutputStream gzipOS = new GZIPOutputStream(fos);

        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            gzipOS.write(buffer, 0, len);
        }

        gzipOS.close();
        fos.close();
        fis.close();

        return fos.toByteArray();
    }
}
