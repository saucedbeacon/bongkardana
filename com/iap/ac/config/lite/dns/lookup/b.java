package com.iap.ac.config.lite.dns.lookup;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f9805a;
    private int b;

    public b(int i) {
        this.f9805a = new byte[i];
        this.b = 0;
    }

    private void a(long j, int i) {
        long j2 = 1 << i;
        if (j < 0 || j > j2) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(" out of range for ");
            sb.append(i);
            sb.append(" bit value");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void c(int i) {
        byte[] bArr = this.f9805a;
        int length = bArr.length;
        int i2 = this.b;
        if (length - i2 < i) {
            int length2 = bArr.length * 2;
            int i3 = i2 + i;
            if (length2 < i3) {
                length2 = i3;
            }
            byte[] bArr2 = new byte[length2];
            System.arraycopy(this.f9805a, 0, bArr2, 0, this.b);
            this.f9805a = bArr2;
        }
    }

    public void b(int i) {
        a((long) i, 8);
        c(1);
        byte[] bArr = this.f9805a;
        int i2 = this.b;
        this.b = i2 + 1;
        bArr[i2] = (byte) (i & 255);
    }

    public void a(int i) {
        a((long) i, 16);
        c(2);
        byte[] bArr = this.f9805a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        this.b = i3 + 1;
        bArr[i3] = (byte) (i & 255);
    }

    public b() {
        this(32);
    }

    public void a(byte[] bArr, int i, int i2) {
        c(i2);
        System.arraycopy(bArr, i, this.f9805a, this.b, i2);
        this.b += i2;
    }

    public byte[] a() {
        int i = this.b;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f9805a, 0, bArr, 0, i);
        return bArr;
    }
}
