package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

final class zzhz extends OutputStream {
    long zzabh;

    zzhz() {
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.zzabh += (long) i2;
    }

    public final void write(int i) throws IOException {
        this.zzabh++;
    }
}
