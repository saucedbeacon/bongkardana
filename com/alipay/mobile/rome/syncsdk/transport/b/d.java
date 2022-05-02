package com.alipay.mobile.rome.syncsdk.transport.b;

import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.k;
import java.util.Arrays;

public class d extends a {
    private static final String h = d.class.getSimpleName();

    public d() {
        this.f9434a = (byte) b.b;
        this.f = new byte[7];
    }

    public final void c(byte[] bArr) {
        c.b(h, "initPacketFromHeadBytes: ");
        this.f9434a = bArr[0];
        this.b = bArr[1];
        this.c = bArr[2];
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 3, 7);
        this.d = ((((((copyOfRange[0] & 255) << 8) | (copyOfRange[1] & 255)) << 8) | (copyOfRange[2] & 255)) << 8) | (copyOfRange[3] & 255);
        this.e = bArr[7];
        this.f = Arrays.copyOfRange(bArr, 8, 15);
    }

    public final byte[] g() {
        int i;
        byte[] bArr = this.g;
        int length = this.g != null ? this.g.length : 0;
        if (this.g == null || this.g.length <= 512) {
            i = 0;
        } else {
            bArr = k.a(this.g);
            length = bArr.length;
            i = 1;
        }
        byte[] bArr2 = new byte[(b.c + length)];
        bArr2[0] = this.f9434a;
        bArr2[1] = this.b;
        bArr2[2] = this.c;
        System.arraycopy(new byte[]{(byte) (length >>> 24), (byte) (length >>> 16), (byte) (length >>> 8), (byte) length}, 0, bArr2, 3, 4);
        bArr2[7] = (byte) i;
        System.arraycopy(this.f, 0, bArr2, 8, 7);
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 15, length);
        }
        return bArr2;
    }
}
