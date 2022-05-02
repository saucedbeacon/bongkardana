package com.alipay.imobile.magenerator.a;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final int[][] f10709a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, -1}, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, -1}, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static int a(int i) {
        int i2 = 0;
        while (i != 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    static int a(int i, int i2) {
        if (i2 != 0) {
            int a2 = a(i2);
            int i3 = i << (a2 - 1);
            while (a(i3) >= a2) {
                i3 ^= i2 << (a(i3) - a2);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    private static void a(int i, int i2, e eVar) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (b((int) eVar.a(i4, i2))) {
                eVar.a(i4, i2, 0);
                i3++;
            } else {
                throw new ac();
            }
        }
    }

    static void a(b bVar, int i, e eVar) {
        boolean z;
        int b2 = eVar.b() - 1;
        int a2 = eVar.a() - 1;
        int i2 = 0;
        int i3 = -1;
        while (b2 > 0) {
            if (b2 == 6) {
                b2--;
            }
            while (a2 >= 0 && a2 < eVar.a()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = b2 - i4;
                    if (b((int) eVar.a(i5, a2))) {
                        if (i2 < bVar.a()) {
                            z = bVar.a(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && p.a(i, i5, a2)) {
                            z = !z;
                        }
                        eVar.a(i5, a2, z);
                    }
                }
                a2 += i3;
            }
            i3 = -i3;
            a2 += i3;
            b2 -= 2;
        }
        if (i2 != bVar.a()) {
            StringBuilder sb = new StringBuilder("Not all bits consumed: ");
            sb.append(i2);
            sb.append('/');
            sb.append(bVar.a());
            throw new ac(sb.toString());
        }
    }

    static void a(b bVar, m mVar, y yVar, int i, e eVar) {
        a(eVar);
        a(yVar, eVar);
        a(mVar, i, eVar);
        b(yVar, eVar);
        a(bVar, i, eVar);
    }

    static void a(e eVar) {
        eVar.a((byte) -1);
    }

    static void a(m mVar, int i, b bVar) {
        if (v.b(i)) {
            int a2 = (mVar.a() << 3) | i;
            bVar.a(a2, 5);
            bVar.a(a(a2, 1335), 10);
            b bVar2 = new b();
            bVar2.a(21522, 15);
            bVar.b(bVar2);
            if (bVar.a() != 15) {
                StringBuilder sb = new StringBuilder("should not happen but we got: ");
                sb.append(bVar.a());
                throw new ac(sb.toString());
            }
            return;
        }
        throw new ac("Invalid mask pattern");
    }

    static void a(m mVar, int i, e eVar) {
        b bVar = new b();
        a(mVar, i, bVar);
        for (int i2 = 0; i2 < bVar.a(); i2++) {
            boolean a2 = bVar.a((bVar.a() - 1) - i2);
            int[][] iArr = d;
            eVar.a(iArr[i2][0], iArr[i2][1], a2);
            if (i2 < 8) {
                eVar.a((eVar.b() - i2) - 1, 8, a2);
            } else {
                eVar.a(8, (eVar.a() - 7) + (i2 - 8), a2);
            }
        }
    }

    static void a(y yVar, b bVar) {
        bVar.a(yVar.a(), 6);
        bVar.a(a(yVar.a(), 7973), 12);
        if (bVar.a() != 18) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(bVar.a());
            throw new ac(sb.toString());
        }
    }

    static void a(y yVar, e eVar) {
        d(eVar);
        c(eVar);
        c(yVar, eVar);
        b(eVar);
    }

    private static void b(int i, int i2, e eVar) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (b((int) eVar.a(i, i4))) {
                eVar.a(i, i4, 0);
                i3++;
            } else {
                throw new ac();
            }
        }
    }

    private static void b(e eVar) {
        int i = 8;
        while (i < eVar.b() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (b((int) eVar.a(i, 6))) {
                eVar.a(i, 6, i3);
            }
            if (b((int) eVar.a(6, i))) {
                eVar.a(6, i, i3);
            }
            i = i2;
        }
    }

    static void b(y yVar, e eVar) {
        if (yVar.a() >= 7) {
            b bVar = new b();
            a(yVar, bVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean a2 = bVar.a(i);
                    i--;
                    eVar.a(i2, (eVar.a() - 11) + i3, a2);
                    eVar.a((eVar.a() - 11) + i3, i2, a2);
                }
            }
        }
    }

    private static boolean b(int i) {
        return i == -1;
    }

    private static void c(int i, int i2, e eVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                eVar.a(i + i4, i2 + i3, b[i3][i4]);
            }
        }
    }

    private static void c(e eVar) {
        if (eVar.a(8, eVar.a() - 8) != 0) {
            eVar.a(8, eVar.a() - 8, 1);
            return;
        }
        throw new ac();
    }

    private static void c(y yVar, e eVar) {
        if (yVar.a() >= 2) {
            int a2 = yVar.a() - 1;
            int[][] iArr = c;
            int[] iArr2 = iArr[a2];
            int length = iArr[a2].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (!(i4 == -1 || i3 == -1 || !b((int) eVar.a(i4, i3)))) {
                        c(i4 - 2, i3 - 2, eVar);
                    }
                }
            }
        }
    }

    private static void d(int i, int i2, e eVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                eVar.a(i + i4, i2 + i3, f10709a[i3][i4]);
            }
        }
    }

    private static void d(e eVar) {
        int length = f10709a[0].length;
        d(0, 0, eVar);
        d(eVar.b() - length, 0, eVar);
        d(0, eVar.b() - length, eVar);
        a(0, 7, eVar);
        a(eVar.b() - 8, 7, eVar);
        a(0, eVar.b() - 8, eVar);
        b(7, 0, eVar);
        b((eVar.a() - 7) - 1, 0, eVar);
        b(7, eVar.a() - 7, eVar);
    }
}
