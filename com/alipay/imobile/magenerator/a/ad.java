package com.alipay.imobile.magenerator.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.fastjson.parser.JSONLexer;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;
import o.onActivityPreStopped;

public class ad extends i {

    /* renamed from: a  reason: collision with root package name */
    private static ad f10694a = new ad();
    private static final String c = ad.class.getSimpleName();
    private static int getMax = 1;
    private static char getMin;
    private static int length;
    private static char[] setMin;
    private w b = new w();

    static {
        length();
        try {
            int i = length + 119;
            try {
                getMax = i % 128;
                if (!(i % 2 != 0)) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private ad() {
    }

    private Bitmap a(c cVar) {
        int a2;
        int b2;
        int i;
        int i2 = length + 43;
        getMax = i2 % 128;
        if ((i2 % 2 == 0 ? '[' : Typography.greater) != '[') {
            a2 = cVar.a();
            b2 = cVar.b();
            i = a2 * b2;
        } else {
            try {
                a2 = cVar.a();
                b2 = cVar.b();
                i = a2 >> b2;
            } catch (Exception e) {
                throw e;
            }
        }
        int i3 = a2;
        int i4 = b2;
        int[] iArr = new int[i];
        int i5 = 0;
        while (true) {
            if (!(i5 >= i4)) {
                int i6 = i5 * i3;
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = getMax + 91;
                    length = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i6 + i7;
                    int i11 = -16777216;
                    if (cVar.a(i7, i5)) {
                        try {
                            int i12 = getMax + 47;
                            length = i12 % 128;
                            if ((i12 % 2 != 0 ? '.' : 0) != 0) {
                                Object obj = null;
                                super.hashCode();
                            } else {
                                continue;
                            }
                        } catch (Exception e2) {
                            throw e2;
                        }
                    } else {
                        i11 = -1;
                    }
                    iArr[i10] = i11;
                }
                i5++;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                createBitmap.setPixels(iArr, 0, i3, 0, 0, i3, i4);
                return createBitmap;
            }
        }
    }

    private Bitmap a(c cVar, int i, int i2) {
        int a2;
        int b2;
        int i3;
        int i4 = getMax + 71;
        length = i4 % 128;
        if ((i4 % 2 != 0 ? 17 : Typography.amp) != '&') {
            a2 = cVar.a();
            b2 = cVar.b();
            i3 = a2 << b2;
        } else {
            a2 = cVar.a();
            b2 = cVar.b();
            i3 = a2 * b2;
        }
        int i5 = a2;
        int i6 = b2;
        int[] iArr = new int[i3];
        int i7 = 0;
        while (i7 < i6) {
            try {
                int i8 = length + 83;
                getMax = i8 % 128;
                int i9 = i8 % 2;
                int i10 = i7 * i5;
                int i11 = 0;
                while (true) {
                    if ((i11 < i5 ? '*' : 'G') == 'G') {
                        break;
                    }
                    c cVar2 = cVar;
                    iArr[i10 + i11] = !(!cVar.a(i11, i7)) ? i : i2;
                    i11++;
                }
                c cVar3 = cVar;
                i7++;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i5, 0, 0, i5, i6);
            return createBitmap;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static ad a() {
        ad adVar;
        int i = getMax + 89;
        length = i % 128;
        boolean z = false;
        Object[] objArr = null;
        if (!(i % 2 != 0)) {
            adVar = f10694a;
        } else {
            adVar = f10694a;
            super.hashCode();
        }
        try {
            int i2 = getMax + 119;
            try {
                length = i2 % 128;
                if (i2 % 2 == 0) {
                    z = true;
                }
                if (z) {
                    return adVar;
                }
                int length2 = objArr.length;
                return adVar;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String a(CharSequence charSequence) {
        int i = getMax + 107;
        length = i % 128;
        int i2 = i % 2;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            int i4 = length + 125;
            getMax = i4 % 128;
            if ((i4 % 2 == 0 ? 'D' : 'Y') == 'D') {
                if ((charSequence.charAt(i3) > 10340 ? '=' : '4') == '=') {
                    return setMax(new char[]{1, 2, 0, 5, 'd'}, TextUtils.indexOf("", '0') + 6, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 43)).intern();
                }
            } else if (charSequence.charAt(i3) > 255) {
                return setMax(new char[]{1, 2, 0, 5, 'd'}, TextUtils.indexOf("", '0') + 6, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 43)).intern();
            }
        }
        return null;
    }

    private void a(Bitmap bitmap, Bitmap bitmap2, String str, int i, Map map) {
        int i2;
        try {
            v a2 = k.a(str, m.H, map);
            int a3 = a2.a().a();
            int b2 = a2.b().b();
            int i3 = i / b2;
            int i4 = b2 * i3;
            int i5 = (i - i4) / 2;
            int i6 = a3 + 5;
            int i7 = i3 * i6;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z = true;
            if (!(width <= height)) {
                i2 = (int) (((((float) i7) * 1.0f) * ((float) height)) / ((float) width));
                int i8 = getMax + 101;
                length = i8 % 128;
                int i9 = i8 % 2;
            } else {
                int i10 = (int) (((((float) i7) * 1.0f) * ((float) width)) / ((float) height));
                i2 = i7;
                i7 = i10;
            }
            int i11 = ((1 - (i6 % 2)) * i3) / 2;
            int i12 = i5 + (i4 / 2);
            int i13 = (i12 - (i7 / 2)) - i11;
            int i14 = (i12 - (i2 / 2)) - i11;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            bitmapDrawable.setBounds(i13, i14, i7 + i13, i2 + i14);
            bitmapDrawable.draw(new Canvas(bitmap2));
            try {
                int i15 = length + 61;
                getMax = i15 % 128;
                if (i15 % 2 != 0) {
                    z = false;
                }
                if (z) {
                    int i16 = 3 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (ac unused) {
        }
    }

    static void length() {
        getMin = 3;
        setMin = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    public Bitmap a(String str, int i) {
        HashMap hashMap = new HashMap();
        String a2 = a((CharSequence) str);
        if ((a2 != null ? '/' : '5') == '/') {
            int i2 = length + 71;
            getMax = i2 % 128;
            if (i2 % 2 != 0) {
                hashMap.put(j.CHARACTER_SET, a2);
                hashMap.put(j.ERROR_CORRECTION, m.b);
                hashMap.put(j.MARGIN, 0);
            } else {
                try {
                    hashMap.put(j.CHARACTER_SET, a2);
                    hashMap.put(j.ERROR_CORRECTION, m.b);
                    hashMap.put(j.MARGIN, 1);
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        c cVar = null;
        try {
            cVar = this.b.a(str, a.QR_CODE, i, i, hashMap);
            int i3 = getMax + 21;
            length = i3 % 128;
            int i4 = i3 % 2;
        } catch (ac unused) {
        }
        return a(cVar);
    }

    public Bitmap a(String str, int i, int i2) {
        int i3 = length + 87;
        getMax = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return a(str, a.CODE_128, i, i2);
        }
        try {
            try {
                Bitmap a2 = a(str, a.CODE_128, i, i2);
                int i4 = 75 / 0;
                return a2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Bitmap a(String str, int i, int i2, int i3) {
        int i4 = length + 9;
        getMax = i4 % 128;
        int i5 = i4 % 2;
        Bitmap a2 = a(str, i, i2, i3, (Bitmap) null);
        int i6 = getMax + 123;
        length = i6 % 128;
        int i7 = i6 % 2;
        return a2;
    }

    public Bitmap a(String str, int i, int i2, int i3, int i4) {
        try {
            int i5 = length + 107;
            getMax = i5 % 128;
            int i6 = i5 % 2;
            Bitmap a2 = a(str, a.CODE_128, i, i2, i3, i4);
            int i7 = getMax + 97;
            length = i7 % 128;
            if (!(i7 % 2 != 0)) {
                return a2;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return a2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.alipay.imobile.magenerator.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.alipay.imobile.magenerator.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.alipay.imobile.magenerator.a.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap a(java.lang.String r10, int r11, int r12, int r13, android.graphics.Bitmap r14) {
        /*
            r9 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.alipay.imobile.magenerator.a.j r0 = com.alipay.imobile.magenerator.a.j.ERROR_CORRECTION
            com.alipay.imobile.magenerator.a.m r1 = com.alipay.imobile.magenerator.a.m.H
            r6.put(r0, r1)
            com.alipay.imobile.magenerator.a.j r0 = com.alipay.imobile.magenerator.a.j.MARGIN
            r7 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r6.put(r0, r1)
            java.lang.String r0 = a((java.lang.CharSequence) r10)
            if (r0 == 0) goto L_0x003a
            int r1 = getMax
            int r1 = r1 + 99
            int r2 = r1 % 128
            length = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0032
            com.alipay.imobile.magenerator.a.j r1 = com.alipay.imobile.magenerator.a.j.CHARACTER_SET
            r6.put(r1, r0)
            int r0 = r7 / r7
            goto L_0x003a
        L_0x0030:
            r10 = move-exception
            throw r10
        L_0x0032:
            com.alipay.imobile.magenerator.a.j r1 = com.alipay.imobile.magenerator.a.j.CHARACTER_SET     // Catch:{ Exception -> 0x0038 }
            r6.put(r1, r0)     // Catch:{ Exception -> 0x0038 }
            goto L_0x003a
        L_0x0038:
            r10 = move-exception
            throw r10
        L_0x003a:
            r8 = 0
            com.alipay.imobile.magenerator.a.w r0 = r9.b     // Catch:{ ac -> 0x0048 }
            com.alipay.imobile.magenerator.a.a r2 = com.alipay.imobile.magenerator.a.a.QR_CODE     // Catch:{ ac -> 0x0048 }
            r1 = r10
            r3 = r11
            r4 = r11
            r5 = r6
            com.alipay.imobile.magenerator.a.c r0 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ ac -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r0 = r8
        L_0x0049:
            android.graphics.Bitmap r12 = r9.a((com.alipay.imobile.magenerator.a.c) r0, (int) r12, (int) r13)
            r13 = 1
            if (r14 == 0) goto L_0x0052
            r0 = 0
            goto L_0x0053
        L_0x0052:
            r0 = 1
        L_0x0053:
            if (r0 == r13) goto L_0x0085
            int r13 = getMax     // Catch:{ Exception -> 0x0083 }
            int r13 = r13 + 5
            int r0 = r13 % 128
            length = r0     // Catch:{ Exception -> 0x0083 }
            int r13 = r13 % 2
            r0 = 85
            if (r13 == 0) goto L_0x0066
            r13 = 85
            goto L_0x0068
        L_0x0066:
            r13 = 54
        L_0x0068:
            if (r13 == r0) goto L_0x0074
            r0 = r9
            r1 = r14
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = r6
            r0.a((android.graphics.Bitmap) r1, (android.graphics.Bitmap) r2, (java.lang.String) r3, (int) r4, (java.util.Map) r5)
            goto L_0x0085
        L_0x0074:
            r0 = r9
            r1 = r14
            r2 = r12
            r3 = r10
            r4 = r11
            r5 = r6
            r0.a((android.graphics.Bitmap) r1, (android.graphics.Bitmap) r2, (java.lang.String) r3, (int) r4, (java.util.Map) r5)
            r10 = 24
            int r10 = r10 / r7
            goto L_0x0085
        L_0x0081:
            r10 = move-exception
            throw r10
        L_0x0083:
            r10 = move-exception
            throw r10
        L_0x0085:
            int r10 = getMax
            int r10 = r10 + 31
            int r11 = r10 % 128
            length = r11
            int r10 = r10 % 2
            if (r10 == 0) goto L_0x0095
            int r10 = r8.length     // Catch:{ all -> 0x0093 }
            return r12
        L_0x0093:
            r10 = move-exception
            throw r10
        L_0x0095:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.magenerator.a.ad.a(java.lang.String, int, int, int, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public Bitmap a(String str, a aVar, int i, int i2) {
        Bitmap bitmap = null;
        try {
            bitmap = a(new s().a(str, aVar, i, i2));
            try {
                int i3 = getMax + 69;
                length = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (ac e2) {
            e2.getMessage();
        }
        return bitmap;
    }

    public Bitmap a(String str, a aVar, int i, int i2, int i3, int i4) {
        int i5;
        try {
            c a2 = new s().a(str, aVar, i, i2);
            int a3 = a2.a();
            int b2 = a2.b();
            int[] iArr = new int[(a3 * b2)];
            int i6 = 0;
            while (i6 < b2) {
                try {
                    int i7 = length + 1;
                    getMax = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = i6 * a3;
                    int i10 = 0;
                    while (true) {
                        if (!(i10 < a3)) {
                            break;
                        }
                        int i11 = getMax + 5;
                        length = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = i9 + i10;
                        if ((a2.a(i10, i6) ? Typography.dollar : '6') != '6') {
                            i5 = i3;
                        } else {
                            int i14 = getMax + 7;
                            length = i14 % 128;
                            int i15 = i14 % 2;
                            i5 = i4;
                        }
                        iArr[i13] = i5;
                        i10++;
                    }
                    i6++;
                } catch (Exception e) {
                    throw e;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(a3, b2, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, a3, 0, 0, a3, b2);
            return createBitmap;
        } catch (ac e2) {
            e2.getMessage();
            return null;
        }
    }

    private static String setMax(char[] cArr, int i, byte b2) {
        char c2;
        char c3;
        int i2 = length + 111;
        getMax = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr2 = setMin;
        char c4 = getMin;
        char[] cArr3 = new char[i];
        if ((i % 2 != 0 ? '(' : 1) != 1) {
            i--;
            cArr3[i] = (char) (cArr[i] - b2);
        }
        if (i > 1) {
            int i4 = length + 123;
            getMax = i4 % 128;
            int i5 = i4 % 2;
            int i6 = length + 33;
            getMax = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (true) {
                if ((i8 < i ? 'B' : 16) == 16) {
                    break;
                }
                int i9 = length + 63;
                getMax = i9 % 128;
                if ((i9 % 2 != 0) ? (c3 = cArr[i8]) != (c2 = cArr[i8 + 1]) : (c3 = cArr[i8]) != (c2 = cArr[i8 / 0])) {
                    int min = onActivityPreStopped.setMin(c3, c4);
                    int length2 = onActivityPreStopped.length(c3, c4);
                    int min2 = onActivityPreStopped.setMin(c2, c4);
                    int length3 = onActivityPreStopped.length(c2, c4);
                    if (length2 == length3) {
                        try {
                            int max = onActivityPreStopped.setMax(min, c4);
                            int max2 = onActivityPreStopped.setMax(min2, c4);
                            int max3 = onActivityPreStopped.getMax(max, length2, c4);
                            int max4 = onActivityPreStopped.getMax(max2, length3, c4);
                            cArr3[i8] = cArr2[max3];
                            cArr3[i8 + 1] = cArr2[max4];
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        if ((min == min2 ? JSONLexer.EOI : '5') != '5') {
                            int max5 = onActivityPreStopped.setMax(length2, c4);
                            int max6 = onActivityPreStopped.setMax(length3, c4);
                            int max7 = onActivityPreStopped.getMax(min, max5, c4);
                            int max8 = onActivityPreStopped.getMax(min2, max6, c4);
                            cArr3[i8] = cArr2[max7];
                            cArr3[i8 + 1] = cArr2[max8];
                        } else {
                            int max9 = onActivityPreStopped.getMax(min, length3, c4);
                            int max10 = onActivityPreStopped.getMax(min2, length2, c4);
                            cArr3[i8] = cArr2[max9];
                            cArr3[i8 + 1] = cArr2[max10];
                        }
                    }
                } else {
                    int i10 = length + 67;
                    getMax = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3[i8] = (char) (c3 - b2);
                    cArr3[i8 + 1] = (char) (c2 - b2);
                }
                i8 += 2;
            }
        }
        return new String(cArr3);
    }
}
