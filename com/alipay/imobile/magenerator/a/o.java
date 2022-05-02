package com.alipay.imobile.magenerator.a;

final class o {

    /* renamed from: a  reason: collision with root package name */
    private final n f10708a;
    private final int[] b;

    o(n nVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f10708a = nVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i)];
            this.b = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: package-private */
    public final o a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f10708a.a();
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f10708a.c(this.b[i3], i2);
            }
            return new o(this.f10708a, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public final o a(o oVar) {
        if (!this.f10708a.equals(oVar.f10708a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (c()) {
            return oVar;
        } else {
            if (oVar.c()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = oVar.b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr4[i] = n.b(iArr2[i - length], iArr[i]);
            }
            return new o(this.f10708a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public final int[] a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public final o b(o oVar) {
        if (!this.f10708a.equals(oVar.f10708a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (c() || oVar.c()) {
            return this.f10708a.a();
        } else {
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = oVar.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = n.b(iArr3[i4], this.f10708a.c(i2, iArr2[i3]));
                }
            }
            return new o(this.f10708a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public final o[] c(o oVar) {
        if (!this.f10708a.equals(oVar.f10708a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!oVar.c()) {
            o a2 = this.f10708a.a();
            int c = this.f10708a.c(oVar.a(oVar.b()));
            o oVar2 = this;
            while (oVar2.b() >= oVar.b() && !oVar2.c()) {
                int b2 = oVar2.b() - oVar.b();
                int c2 = this.f10708a.c(oVar2.a(oVar2.b()), c);
                o a3 = oVar.a(b2, c2);
                a2 = a2.a(this.f10708a.a(b2, c2));
                oVar2 = oVar2.a(a3);
            }
            return new o[]{a2, oVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b2 = b(); b2 >= 0; b2--) {
            int a2 = a(b2);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b2 == 0 || a2 != 1) {
                    int b3 = this.f10708a.b(a2);
                    if (b3 == 0) {
                        c = '1';
                    } else if (b3 == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(b3);
                    }
                    sb.append(c);
                }
                if (b2 != 0) {
                    if (b2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b2);
                    }
                }
            }
        }
        return sb.toString();
    }
}
