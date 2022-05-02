package com.google.android.gms.internal.firebase_ml;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class zzfx extends BufferedOutputStream {
    zzfx(zzfu zzfu, OutputStream outputStream) {
        super(outputStream);
    }

    public final void close() throws IOException {
        try {
            flush();
        } catch (IOException unused) {
        }
    }
}
