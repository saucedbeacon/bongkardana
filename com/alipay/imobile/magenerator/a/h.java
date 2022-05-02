package com.alipay.imobile.magenerator.a;

import java.util.ArrayList;
import java.util.Map;

public final class h extends u {
    private static boolean a(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int length = charSequence.length();
        while (i < i3 && i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < '0' || charAt > '9') {
                if (charAt != 241) {
                    return false;
                }
                i3++;
            }
            i++;
        }
        return i3 <= length;
    }

    public final c a(String str, a aVar, int i, int i2, Map map) {
        if (aVar == a.CODE_128) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(aVar)));
    }

    public final boolean[] a(String str) {
        int i;
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < ' ' || charAt > '~') {
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                }
            }
        }
        ArrayList<int[]> arrayList = new ArrayList<>();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i4 < length) {
            int i8 = 99;
            int i9 = 100;
            if (!a(str, i4, i6 == 99 ? 2 : 4)) {
                i8 = 100;
            }
            if (i8 == i6) {
                switch (str.charAt(i4)) {
                    case 241:
                        i9 = 102;
                        break;
                    case 242:
                        i9 = 97;
                        break;
                    case 243:
                        i9 = 96;
                        break;
                    case 244:
                        break;
                    default:
                        if (i6 != 100) {
                            i9 = Integer.parseInt(str.substring(i4, i4 + 2));
                            i4++;
                            break;
                        } else {
                            i9 = str.charAt(i4) - ' ';
                            break;
                        }
                }
                i4++;
            } else {
                i = i6 == 0 ? i8 == 100 ? 104 : 105 : i8;
                i6 = i8;
            }
            arrayList.add(g.f10701a[i]);
            i5 += i * i7;
            if (i4 != 0) {
                i7++;
            }
        }
        arrayList.add(g.f10701a[i5 % 103]);
        arrayList.add(g.f10701a[106]);
        int i10 = 0;
        for (int[] iArr : arrayList) {
            for (int i11 : (int[]) r13.next()) {
                i10 += i11;
            }
        }
        boolean[] zArr = new boolean[i10];
        for (int[] a2 : arrayList) {
            i2 += a(zArr, i2, a2, true);
        }
        return zArr;
    }
}
