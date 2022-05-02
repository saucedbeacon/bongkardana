package com.google.android.gms.internal.firebase_ml;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzin extends FilterOutputStream {
    private final zzil zzadb;

    public zzin(OutputStream outputStream, Logger logger, Level level, int i) {
        super(outputStream);
        this.zzadb = new zzil(logger, level, i);
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        this.zzadb.write(i);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        this.zzadb.write(bArr, i, i2);
    }

    public final void close() throws IOException {
        this.zzadb.close();
        super.close();
    }

    public final zzil zzhs() {
        return this.zzadb;
    }
}
