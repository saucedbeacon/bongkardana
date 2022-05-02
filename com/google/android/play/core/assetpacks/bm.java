package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

final class bm extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final dd f10867a = new dd();
    private byte[] b = new byte[4096];
    private long c;
    private boolean d = false;
    private boolean e = false;

    bm(InputStream inputStream) {
        super(inputStream);
    }

    private final int a(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    private final boolean a(int i) throws IOException {
        int a2 = a(this.b, 0, i);
        if (a2 != i) {
            int i2 = i - a2;
            if (a(this.b, a2, i2) != i2) {
                this.f10867a.a(this.b, 0, a2);
                return false;
            }
        }
        this.f10867a.a(this.b, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final dx a() throws IOException {
        byte[] bArr;
        if (this.c > 0) {
            do {
                bArr = this.b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.d || this.e) {
            return new dx((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!a(30)) {
            this.d = true;
            return this.f10867a.a();
        }
        dx a2 = this.f10867a.a();
        if (a2.g()) {
            this.e = true;
            return a2;
        } else if (a2.d() != 4294967295L) {
            int b2 = this.f10867a.b() - 30;
            long j = (long) b2;
            int length = this.b.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.b = Arrays.copyOf(this.b, length);
            }
            if (!a(b2)) {
                this.d = true;
                return this.f10867a.a();
            }
            dx a3 = this.f10867a.a();
            this.c = a3.d();
            return a3;
        } else {
            throw new bv("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    public final long d() {
        return this.c;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.c;
        if (j <= 0 || this.d) {
            return -1;
        }
        int a2 = a(bArr, i, (int) Math.min(j, (long) i2));
        this.c -= (long) a2;
        if (a2 != 0) {
            return a2;
        }
        this.d = true;
        return 0;
    }
}
