package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

final class bd extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f10858a;
    private long b;

    bd(InputStream inputStream, long j) {
        this.f10858a = inputStream;
        this.b = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f10858a.close();
        this.b = 0;
    }

    public final int read() throws IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        this.b = j - 1;
        return this.f10858a.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int read = this.f10858a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.b -= (long) read;
        }
        return read;
    }
}
