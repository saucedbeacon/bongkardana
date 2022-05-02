package com.alipay.a.a.a.a;

import java.io.Closeable;
import java.io.IOException;

public final class m {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
