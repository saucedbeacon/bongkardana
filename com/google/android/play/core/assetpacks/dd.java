package com.google.android.play.core.assetpacks;

import androidx.annotation.Nullable;
import java.util.Arrays;

final class dd {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f10909a = new byte[4096];
    private int b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    @Nullable
    private String i;

    public dd() {
        c();
    }

    private final int a(int i2, byte[] bArr, int i3, int i4) {
        int i5 = this.b;
        if (i5 >= i2) {
            return 0;
        }
        int min = Math.min(i4, i2 - i5);
        System.arraycopy(bArr, i3, this.f10909a, this.b, min);
        int i6 = this.b + min;
        this.b = i6;
        if (i6 < i2) {
            return -1;
        }
        return min;
    }

    public final int a(byte[] bArr, int i2, int i3) {
        int a2 = a(30, bArr, i2, i3);
        if (a2 == -1) {
            return -1;
        }
        if (this.c == -1) {
            long b2 = db.b(this.f10909a, 0);
            this.c = b2;
            if (b2 == 67324752) {
                this.h = false;
                this.d = db.b(this.f10909a, 18);
                this.g = db.c(this.f10909a, 8);
                this.e = db.c(this.f10909a, 26);
                int c2 = this.e + 30 + db.c(this.f10909a, 28);
                this.f = c2;
                int length = this.f10909a.length;
                if (length < c2) {
                    do {
                        length += length;
                    } while (length < c2);
                    this.f10909a = Arrays.copyOf(this.f10909a, length);
                }
            } else {
                this.h = true;
            }
        }
        int a3 = a(this.f, bArr, i2 + a2, i3 - a2);
        if (a3 == -1) {
            return -1;
        }
        int i4 = a2 + a3;
        if (!this.h && this.i == null) {
            this.i = new String(this.f10909a, 30, this.e);
        }
        return i4;
    }

    public final dx a() {
        int i2 = this.b;
        int i3 = this.f;
        if (i2 < i3) {
            return dx.a(this.i, this.d, this.g, true, Arrays.copyOf(this.f10909a, i2), this.h);
        }
        dx a2 = dx.a(this.i, this.d, this.g, false, Arrays.copyOf(this.f10909a, i3), this.h);
        c();
        return a2;
    }

    public final int b() {
        return this.f;
    }

    public final void c() {
        this.b = 0;
        this.e = -1;
        this.c = -1;
        this.h = false;
        this.f = 30;
        this.d = -1;
        this.g = -1;
        this.i = null;
    }
}
