package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zziq implements zziw {
    private final Logger logger;
    private final Level zzada;
    private final zziw zzwr;
    private final int zzxb;

    public zziq(zziw zziw, Logger logger2, Level level, int i) {
        this.zzwr = zziw;
        this.logger = logger2;
        this.zzada = level;
        this.zzxb = i;
    }

    /* JADX INFO: finally extract failed */
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzin zzin = new zzin(outputStream, this.logger, this.zzada, this.zzxb);
        try {
            this.zzwr.writeTo(zzin);
            zzin.zzhs().close();
            outputStream.flush();
        } catch (Throwable th) {
            zzin.zzhs().close();
            throw th;
        }
    }
}
