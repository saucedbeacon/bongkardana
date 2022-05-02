package com.alipay.imobile.magenerator.a;

import java.util.Map;

public abstract class u implements ab {
    protected static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    private static c a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        c cVar = new c(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                cVar.a(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return cVar;
    }

    public int a() {
        return 10;
    }

    public c a(String str, a aVar, int i, int i2, Map map) {
        Integer num;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int a2 = a();
            if (!(map == null || (num = (Integer) map.get(j.MARGIN)) == null)) {
                a2 = num.intValue();
            }
            return a(a(str), i, i2, a2);
        }
    }

    public abstract boolean[] a(String str);
}
