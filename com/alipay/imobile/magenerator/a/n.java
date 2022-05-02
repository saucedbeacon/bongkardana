package com.alipay.imobile.magenerator.a;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f10706a = new n(4201, 4096, 1);
    public static final n b = new n(1033, 1024, 1);
    public static final n c = new n(67, 64, 1);
    public static final n d = new n(19, 16, 1);
    public static final n e = new n(285, 256, 0);
    public static final n f;
    public static final n g;
    public static final n h = c;
    private final int[] i;
    private final int[] j;
    private final o k;
    private final o l;
    private final int m;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private final int f10707o;

    static {
        n nVar = new n(301, 256, 1);
        f = nVar;
        g = nVar;
    }

    public n(int i2, int i3, int i4) {
        this.n = i2;
        this.m = i3;
        this.f10707o = i4;
        this.i = new int[i3];
        this.j = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.i[i6] = i5;
            i5 *= 2;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.j[this.i[i7]] = i7;
        }
        this.k = new o(this, new int[]{0});
        this.l = new o(this, new int[]{1});
    }

    static int b(int i2, int i3) {
        return i2 ^ i3;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        return this.i[i2];
    }

    /* access modifiers changed from: package-private */
    public final o a() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public final o a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.k;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new o(this, iArr);
        }
    }

    public final int b() {
        return this.f10707o;
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        if (i2 != 0) {
            return this.j[i2];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final int c(int i2) {
        if (i2 != 0) {
            return this.i[(this.m - this.j[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public final int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.m - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.n));
        sb.append(',');
        sb.append(this.m);
        sb.append(')');
        return sb.toString();
    }
}
