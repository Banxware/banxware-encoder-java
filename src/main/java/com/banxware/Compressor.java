package com.banxware;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

class Compressor {
    public static byte[] compress(String data) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DeflaterOutputStream def = new DeflaterOutputStream(out, new Deflater(Deflater.DEFLATED, true));
        def.write(data.getBytes(StandardCharsets.UTF_8));
        def.close();

        return out.toByteArray();
    }
}
