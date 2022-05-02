package com.alipay.multimedia.adjuster.utils;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUilts {
    public static void close(InputStream inputStream) {
        close((Closeable) inputStream);
    }

    public static void close(OutputStream outputStream) {
        close((Closeable) outputStream);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
