package com.iap.ac.config.lite.dns.lookup;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.Serializable;
import java.text.DecimalFormat;

public class Name implements Serializable {
    private static final byte[] c = {0};
    private static final DecimalFormat d;
    private static final byte[] e = new byte[256];

    /* renamed from: a  reason: collision with root package name */
    private byte[] f9803a;
    private long b;

    static {
        int i = 0;
        DecimalFormat decimalFormat = new DecimalFormat();
        d = decimalFormat;
        decimalFormat.setMinimumIntegerDigits(3);
        while (true) {
            byte[] bArr = e;
            if (i < bArr.length) {
                if (i < 65 || i > 90) {
                    e[i] = (byte) i;
                } else {
                    bArr[i] = (byte) ((i - 65) + 97);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public Name(String str) throws Exception {
        byte[] bArr = new byte[64];
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            byte charAt = (byte) str.charAt(i2);
            if (charAt == 46) {
                bArr[0] = (byte) (i - 1);
                b(bArr, 0, 1);
                i = 1;
            } else if (i <= 63) {
                bArr[i] = charAt;
                i++;
            } else {
                throw new DNSException("label too long");
            }
        }
        b(c, 0, 1);
    }

    private void a(int i, int i2) {
        if (i < 7) {
            int i3 = (7 - i) * 8;
            long j = this.b & ((255 << i3) ^ -1);
            this.b = j;
            this.b = (((long) i2) << i3) | j;
        }
    }

    private void b(int i) {
        long j = this.b & -256;
        this.b = j;
        this.b = j | ((long) i);
    }

    private int c() {
        return (int) (this.b & 255);
    }

    public String toString() {
        byte[] bArr = this.f9803a;
        return bArr == null ? "" : new String(bArr);
    }

    private int a(int i) {
        if (i == 0 && c() == 0) {
            return 0;
        }
        if (i < 0 || i >= c()) {
            throw new IllegalArgumentException("label out of range");
        } else if (i < 7) {
            return ((int) (this.b >>> ((7 - i) * 8))) & 255;
        } else {
            int a2 = a(6);
            for (int i2 = 6; i2 < i; i2++) {
                a2 += this.f9803a[a2] + 1;
            }
            return a2;
        }
    }

    private void b(byte[] bArr, int i, int i2) throws Exception {
        a(bArr, i, i2);
    }

    public int b() {
        return c();
    }

    private void a(byte[] bArr, int i, int i2) throws Exception {
        byte[] bArr2 = this.f9803a;
        int length = bArr2 == null ? 0 : bArr2.length - a(0);
        int i3 = i;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            byte b2 = bArr[i3];
            if (b2 <= 63) {
                int i6 = b2 + 1;
                i3 += i6;
                i5 += i6;
                i4++;
            } else {
                throw new IllegalStateException("invalid label");
            }
        }
        int i7 = length + i5;
        if (i7 <= 255) {
            int c2 = c();
            int i8 = c2 + i2;
            if (i8 <= 128) {
                byte[] bArr3 = new byte[i7];
                if (length != 0) {
                    System.arraycopy(this.f9803a, a(0), bArr3, 0, length);
                }
                System.arraycopy(bArr, i, bArr3, length, i5);
                this.f9803a = bArr3;
                for (int i9 = 0; i9 < i2; i9++) {
                    a(c2 + i9, length);
                    length += bArr3[length] + 1;
                }
                b(i8);
                return;
            }
            throw new IllegalStateException("too many labels");
        }
        throw new DNSException("name too long!");
    }

    public Name(a aVar) throws Exception {
        byte[] bArr = new byte[64];
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            int f = aVar.f();
            int i = f & PsExtractor.AUDIO_STREAM;
            if (i != 0) {
                if (i == 192) {
                    int f2 = aVar.f() + ((f & -193) << 8);
                    if (f2 < aVar.b() - 2) {
                        if (!z2) {
                            aVar.i();
                            z2 = true;
                        }
                        aVar.a(f2);
                    } else {
                        throw new DNSException("bad compression");
                    }
                } else {
                    throw new DNSException("bad label type");
                }
            } else if (c() >= 128) {
                throw new DNSException("too many labels");
            } else if (f == 0) {
                a(c, 0, 1);
                z = true;
            } else {
                bArr[0] = (byte) f;
                aVar.a(bArr, 1, f);
                a(bArr, 0, 1);
            }
        }
        if (z2) {
            aVar.h();
        }
    }

    public static Name a(String str) throws Exception {
        return new Name(str);
    }

    public boolean a() {
        int b2 = b();
        if (b2 != 0 && this.f9803a[a(b2 - 1)] == 0) {
            return true;
        }
        return false;
    }

    public void a(b bVar) {
        if (a()) {
            int b2 = b();
            for (int i = 0; i < b2 - 1; i++) {
                int a2 = a(i);
                byte[] bArr = this.f9803a;
                bVar.a(bArr, a2, bArr[a2] + 1);
            }
            bVar.b(0);
            return;
        }
        throw new IllegalArgumentException("toWire() called on non-absolute name");
    }
}
