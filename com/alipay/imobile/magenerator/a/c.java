package com.alipay.imobile.magenerator.a;

import java.util.Arrays;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final int f10696a;
    private final int b;
    private final int c;
    private final int[] d;

    public c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f10696a = i;
        this.b = i2;
        int i3 = (i + 31) / 32;
        this.c = i3;
        this.d = new int[(i3 * i2)];
    }

    private c(int i, int i2, int i3, int[] iArr) {
        this.f10696a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public final int a() {
        return this.f10696a;
    }

    public final void a(int i, int i2, int i3, int i4) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1566230519, oncanceled);
            onCancelLoad.getMin(-1566230519, oncanceled);
        }
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.b || i5 > this.f10696a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    public final boolean a(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final int b() {
        return this.b;
    }

    /* renamed from: c */
    public final c clone() {
        return new c(this.f10696a, this.b, this.c, (int[]) this.d.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10696a == cVar.f10696a && this.b == cVar.b && this.c == cVar.c && Arrays.equals(this.d, cVar.d);
    }

    public final int hashCode() {
        int i = this.f10696a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b * (this.f10696a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.f10696a; i2++) {
                sb.append(a(i2, i) ? "X " : "  ");
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
