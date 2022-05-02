package com.google.android.gms.internal.firebase_ml;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzio extends FilterInputStream {
    private final zzil zzadb;

    public zzio(InputStream inputStream, Logger logger, Level level, int i) {
        super(inputStream);
        this.zzadb = new zzil(logger, level, i);
    }

    public final int read() throws IOException {
        int read = super.read();
        this.zzadb.write(read);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1846834490, oncanceled);
            onCancelLoad.getMin(1846834490, oncanceled);
        }
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.zzadb.write(bArr, i, read);
        }
        return read;
    }

    public final void close() throws IOException {
        this.zzadb.close();
        super.close();
    }
}
