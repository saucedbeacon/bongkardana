package com.alipay.imobile.magenerator.a;

import java.lang.reflect.Array;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final byte[][] f10698a;
    private final int b;
    private final int c;

    public e(int i, int i2) {
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = i2;
        this.f10698a = (byte[][]) Array.newInstance(byte.class, iArr);
        this.b = i;
        this.c = i2;
    }

    public final byte a(int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1921605947, oncanceled);
            onCancelLoad.getMin(-1921605947, oncanceled);
        }
        return this.f10698a[i2][i];
    }

    public final int a() {
        return this.c;
    }

    public final void a(byte b2) {
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.f10698a[i][i2] = b2;
            }
        }
    }

    public final void a(int i, int i2, int i3) {
        this.f10698a[i2][i] = (byte) i3;
    }

    public final void a(int i, int i2, boolean z) {
        this.f10698a[i2][i] = z ? (byte) 1 : 0;
    }

    public final int b() {
        return this.b;
    }

    public final byte[][] c() {
        return this.f10698a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b2 = this.f10698a[i][i2];
                sb.append(b2 != 0 ? b2 != 1 ? "  " : " 1" : " 0");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
