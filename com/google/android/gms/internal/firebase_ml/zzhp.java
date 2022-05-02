package com.google.android.gms.internal.firebase_ml;

import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;

public final class zzhp {
    @Deprecated
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    @Deprecated
    private static final Charset US_ASCII = Charset.forName(C.ASCII_NAME);
    @Deprecated
    private static final Charset UTF_16 = Charset.forName(C.UTF16_NAME);
    @Deprecated
    private static final Charset UTF_16BE = Charset.forName("UTF-16BE");
    @Deprecated
    private static final Charset UTF_16LE = Charset.forName("UTF-16LE");
    @Deprecated
    public static final Charset UTF_8 = Charset.forName(setMax(new char[]{46279, 57986, 16330, 18435, 34081, 53707}).intern());
    private static int length = 1;
    private static long setMax;
    private static int setMin;

    static {
        getMax();
        int i = setMin + 43;
        length = i % 128;
        int i2 = i % 2;
    }

    static void getMax() {
        setMax = 8244506484582929936L;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(char[] r8) {
        /*
            int r0 = length     // Catch:{ Exception -> 0x0068 }
            int r0 = r0 + 53
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x0068 }
            int r0 = r0 % 2
            r0 = 0
            char r0 = r8[r0]
            int r1 = r8.length
            r2 = 1
            int r1 = r1 - r2
            char[] r1 = new char[r1]
        L_0x0012:
            int r3 = r8.length
            r4 = 61
            r5 = 30
            if (r2 >= r3) goto L_0x001c
            r3 = 61
            goto L_0x001e
        L_0x001c:
            r3 = 30
        L_0x001e:
            if (r3 == r5) goto L_0x0058
            int r3 = length
            int r3 = r3 + r4
            int r4 = r3 % 128
            setMin = r4
            int r3 = r3 % 2
            r4 = 98
            if (r3 == 0) goto L_0x0030
            r3 = 98
            goto L_0x0032
        L_0x0030:
            r3 = 88
        L_0x0032:
            if (r3 == r4) goto L_0x0046
            int r3 = r2 + -1
            char r4 = r8[r2]
            int r5 = r2 * r0
            r4 = r4 ^ r5
            long r4 = (long) r4
            long r6 = setMax
            long r4 = r4 ^ r6
            int r5 = (int) r4
            char r4 = (char) r5
            r1[r3] = r4
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0046:
            int r3 = r2 * 0
            char r4 = r8[r2]
            int r5 = r2 >>> r0
            r4 = r4 ^ r5
            long r4 = (long) r4
            long r6 = setMax
            long r4 = r4 & r6
            int r5 = (int) r4
            char r4 = (char) r5
            r1[r3] = r4
            int r2 = r2 + 104
            goto L_0x0012
        L_0x0058:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1)
            int r0 = length     // Catch:{ Exception -> 0x0068 }
            int r0 = r0 + 25
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x0068 }
            int r0 = r0 % 2
            return r8
        L_0x0068:
            r8 = move-exception
            goto L_0x006b
        L_0x006a:
            throw r8
        L_0x006b:
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzhp.setMax(char[]):java.lang.String");
    }
}
