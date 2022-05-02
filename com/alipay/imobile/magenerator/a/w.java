package com.alipay.imobile.magenerator.a;

import java.util.Map;

public final class w implements ab {
    private static c a(v vVar, int i, int i2, int i3) {
        e b = vVar.b();
        if (b != null) {
            int b2 = b.b();
            int a2 = b.a();
            int i4 = b2 + 0;
            int i5 = a2 + 0;
            int max = Math.max(i, i4);
            int max2 = Math.max(i2, i5);
            int min = Math.min(max / i4, max2 / i5);
            int i6 = (max - (b2 * min)) / 2;
            int i7 = (max2 - (a2 * min)) / 2;
            c cVar = new c(max, max2);
            int i8 = 0;
            while (i8 < a2) {
                int i9 = i6;
                int i10 = 0;
                while (i10 < b2) {
                    if (b.a(i10, i8) == 1) {
                        cVar.a(i9, i7, min, min);
                    }
                    i10++;
                    i9 += min;
                }
                i8++;
                i7 += min;
            }
            return cVar;
        }
        throw new IllegalStateException();
    }

    public final c a(String str, a aVar, int i, int i2, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (aVar != a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            m mVar = m.L;
            int i3 = 4;
            if (map != null) {
                m mVar2 = (m) map.get(j.ERROR_CORRECTION);
                if (mVar2 != null) {
                    mVar = mVar2;
                }
                Integer num = (Integer) map.get(j.MARGIN);
                if (num != null) {
                    i3 = num.intValue();
                }
            }
            return a(k.a(str, mVar, map), i, i2, i3);
        }
    }
}
