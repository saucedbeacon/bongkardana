package o;

import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;

public final class deliverCancellation {
    private static int getMax = 0;
    public static final int getMin = 173;
    private static int length = 1;
    private static byte[] setMin = {114, -106, -55, 87, -1, -75, 78, -1, Ascii.FF, 3, -82, ImageFileType.HEAD_WEBP_0, -13, 4, 10, -8, 8, 0, Ascii.DLE, 0, 17, -31, 40, -4, 3, -13, 10, -24, Ascii.DC4, Ascii.SI, 6, -11, -4, 4, 4, 19, -9, Ascii.SI, -11, 13, 7, -15, -17, -15, -18, -13, 4, 10, -8, 8, 0, -41, 43, Ascii.SO, 0, -61, 53, Ascii.SI, -8, Ascii.DLE, -1, -4, -3, -52, -13, 4, 10, -8, 8, 0, -41, 43, Ascii.SO, 0, -61, 59, 10, 2, -6, 7, -5, -53, -13, 4, 10, -8, 8, 0, -41, -43, Framer.STDOUT_FRAME_PREFIX, 0, 17, -34, 19, 4, 10, -8, 8, 0, -22, 22, Ascii.SI, -11, 8, 0, Ascii.SI, 0, 17, -34, 19, 4, 10, -8, 8, 0, -21, Ascii.NAK, Ascii.SO, -6, Ascii.SI, -8, Ascii.DLE, -1, -4, -3, -52, 55, Ascii.SO, 1, 8, -13, Ascii.VT, 8, -68, Ascii.ETB, 46, 1, 8, -13, Ascii.NAK, -2, 0, 17, -49, Framer.STDOUT_FRAME_PREFIX, 2, -2, -1, -4, 0, Ascii.NAK, -9, 8, 1, -35, 39, -6, Ascii.VT};

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(short r7, short r8, short r9) {
        /*
            int r0 = getMax
            int r0 = r0 + 59
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r0 = 1
            int r9 = r9 + r0
            byte[] r1 = setMin
            int r7 = r7 + 10
            int r8 = 141 - r8
            byte[] r2 = new byte[r9]
            int r9 = r9 + -1
            r3 = 0
            if (r1 == 0) goto L_0x001b
            r4 = 1
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 == 0) goto L_0x0025
            r4 = r2
            r5 = 0
            r2 = r1
            r1 = r9
            r9 = r8
        L_0x0023:
            r8 = r7
            goto L_0x0038
        L_0x0025:
            int r4 = getMax
            int r4 = r4 + 105
            int r5 = r4 % 128
            length = r5
            int r4 = r4 % 2
            r4 = r2
            r5 = 0
            r2 = r1
            r1 = r9
            r9 = r8
        L_0x0034:
            int r8 = r8 + r7
            int r7 = r8 + -2
            goto L_0x0023
        L_0x0038:
            byte r7 = (byte) r8
            r4[r5] = r7
            int r7 = r5 + 1
            if (r5 != r1) goto L_0x004f
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r3)
            int r8 = getMax
            int r8 = r8 + 53
            int r9 = r8 % 128
            length = r9
            int r8 = r8 % 2
            return r7
        L_0x004f:
            int r9 = r9 + r0
            byte r5 = r2[r9]
            r6 = r5
            r5 = r7
            r7 = r6
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deliverCancellation.setMin(short, short, short):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01bb, code lost:
        if ((((r1 & 10) ^ -1) & (r1 | 10)) == r1) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cc, code lost:
        if ((((r1 & -48) | ((r1 ^ -1) & 47)) == r1 ? 'M' : 20) != 'M') goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01a2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x016a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int length(android.content.Context r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            byte[] r2 = setMin     // Catch:{ all -> 0x02b7 }
            r3 = 3
            byte r2 = r2[r3]     // Catch:{ all -> 0x02b7 }
            byte r2 = (byte) r2     // Catch:{ all -> 0x02b7 }
            byte[] r4 = setMin     // Catch:{ all -> 0x02b7 }
            r5 = 101(0x65, float:1.42E-43)
            byte r4 = r4[r5]     // Catch:{ all -> 0x02b7 }
            short r4 = (short) r4     // Catch:{ all -> 0x02b7 }
            byte r6 = (byte) r4     // Catch:{ all -> 0x02b7 }
            java.lang.String r2 = setMin(r2, r4, r6)     // Catch:{ all -> 0x02b7 }
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x02b7 }
            byte[] r4 = setMin     // Catch:{ all -> 0x02b7 }
            r6 = 155(0x9b, float:2.17E-43)
            byte r4 = r4[r6]     // Catch:{ all -> 0x02b7 }
            int r4 = -r4
            short r4 = (short) r4     // Catch:{ all -> 0x02b7 }
            byte[] r6 = setMin     // Catch:{ all -> 0x02b7 }
            r7 = 39
            byte r6 = r6[r7]     // Catch:{ all -> 0x02b7 }
            byte r6 = (byte) r6     // Catch:{ all -> 0x02b7 }
            r7 = 93
            java.lang.String r4 = setMin(r7, r4, r6)     // Catch:{ all -> 0x02b7 }
            r6 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r4, r6)     // Catch:{ all -> 0x02b7 }
            java.lang.Object r2 = r2.invoke(r0, r6)     // Catch:{ all -> 0x02b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x02b7 }
            byte[] r4 = setMin     // Catch:{ all -> 0x02ae }
            byte r4 = r4[r3]     // Catch:{ all -> 0x02ae }
            byte r4 = (byte) r4     // Catch:{ all -> 0x02ae }
            byte[] r8 = setMin     // Catch:{ all -> 0x02ae }
            byte r8 = r8[r5]     // Catch:{ all -> 0x02ae }
            short r8 = (short) r8     // Catch:{ all -> 0x02ae }
            byte r9 = (byte) r8     // Catch:{ all -> 0x02ae }
            java.lang.String r4 = setMin(r4, r8, r9)     // Catch:{ all -> 0x02ae }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x02ae }
            r8 = 51
            byte[] r9 = setMin     // Catch:{ all -> 0x02ae }
            r10 = 18
            byte r9 = r9[r10]     // Catch:{ all -> 0x02ae }
            byte r9 = (byte) r9     // Catch:{ all -> 0x02ae }
            java.lang.String r8 = setMin(r7, r8, r9)     // Catch:{ all -> 0x02ae }
            java.lang.reflect.Method r4 = r4.getMethod(r8, r6)     // Catch:{ all -> 0x02ae }
            r4.invoke(r0, r6)     // Catch:{ all -> 0x02ae }
            int r4 = length
            int r4 = r4 + 73
            int r8 = r4 % 128
            getMax = r8
            int r4 = r4 % 2
            int r4 = getMax
            int r4 = r4 + 90
            r8 = 1
            int r4 = r4 - r8
            int r9 = r4 % 128
            length = r9
            int r4 = r4 % 2
            byte[] r4 = setMin     // Catch:{ all -> 0x02a5 }
            byte r4 = r4[r3]     // Catch:{ all -> 0x02a5 }
            byte r4 = (byte) r4     // Catch:{ all -> 0x02a5 }
            byte[] r9 = setMin     // Catch:{ all -> 0x02a5 }
            byte r9 = r9[r5]     // Catch:{ all -> 0x02a5 }
            short r9 = (short) r9     // Catch:{ all -> 0x02a5 }
            byte r10 = (byte) r9     // Catch:{ all -> 0x02a5 }
            java.lang.String r4 = setMin(r4, r9, r10)     // Catch:{ all -> 0x02a5 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x02a5 }
            byte[] r9 = setMin     // Catch:{ all -> 0x02a5 }
            r10 = 17
            byte r9 = r9[r10]     // Catch:{ all -> 0x02a5 }
            short r9 = (short) r9     // Catch:{ all -> 0x02a5 }
            byte[] r11 = setMin     // Catch:{ all -> 0x02a5 }
            r12 = 20
            byte r11 = r11[r12]     // Catch:{ all -> 0x02a5 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x02a5 }
            java.lang.String r9 = setMin(r7, r9, r11)     // Catch:{ all -> 0x02a5 }
            java.lang.reflect.Method r4 = r4.getMethod(r9, r6)     // Catch:{ all -> 0x02a5 }
            java.lang.Object r4 = r4.invoke(r0, r6)     // Catch:{ all -> 0x02a5 }
            android.content.pm.ApplicationInfo r4 = (android.content.pm.ApplicationInfo) r4     // Catch:{ all -> 0x02a5 }
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 22
            r11 = 0
            if (r6 > r9) goto L_0x00af
            r6 = 1
            goto L_0x00b0
        L_0x00af:
            r6 = 0
        L_0x00b0:
            r9 = 123(0x7b, float:1.72E-43)
            r13 = 77
            if (r6 == r8) goto L_0x01fa
            int r6 = length
            r14 = r6 & 107(0x6b, float:1.5E-43)
            r6 = r6 | 107(0x6b, float:1.5E-43)
            int r14 = r14 + r6
            int r6 = r14 % 128
            getMax = r6
            int r14 = r14 % 2
            if (r14 == 0) goto L_0x00cf
            byte[] r6 = setMin
            byte r14 = r6[r3]
            byte r14 = (byte) r14
            r15 = 79
            byte r6 = r6[r8]
            goto L_0x00da
        L_0x00cf:
            byte[] r6 = setMin
            byte r14 = r6[r3]
            byte r14 = (byte) r14
            r15 = 108(0x6c, float:1.51E-43)
            r16 = 40
            byte r6 = r6[r16]
        L_0x00da:
            byte r6 = (byte) r6
            java.lang.String r6 = setMin(r14, r15, r6)
            java.lang.Object[] r14 = new java.lang.Object[r8]     // Catch:{ all -> 0x01f1 }
            r14[r11] = r6     // Catch:{ all -> 0x01f1 }
            byte[] r6 = setMin     // Catch:{ all -> 0x01f1 }
            byte r3 = r6[r3]     // Catch:{ all -> 0x01f1 }
            byte r3 = (byte) r3     // Catch:{ all -> 0x01f1 }
            byte[] r6 = setMin     // Catch:{ all -> 0x01f1 }
            byte r5 = r6[r5]     // Catch:{ all -> 0x01f1 }
            short r5 = (short) r5     // Catch:{ all -> 0x01f1 }
            byte r6 = (byte) r5     // Catch:{ all -> 0x01f1 }
            java.lang.String r3 = setMin(r3, r5, r6)     // Catch:{ all -> 0x01f1 }
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x01f1 }
            byte[] r5 = setMin     // Catch:{ all -> 0x01f1 }
            r6 = 29
            byte r5 = r5[r6]     // Catch:{ all -> 0x01f1 }
            byte r5 = (byte) r5     // Catch:{ all -> 0x01f1 }
            java.lang.String r5 = setMin(r7, r9, r5)     // Catch:{ all -> 0x01f1 }
            java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ all -> 0x01f1 }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r7[r11] = r15     // Catch:{ all -> 0x01f1 }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r7)     // Catch:{ all -> 0x01f1 }
            java.lang.Object r0 = r3.invoke(r0, r14)     // Catch:{ all -> 0x01f1 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x01fa
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 != 0) goto L_0x011b
            r3 = 0
            goto L_0x011c
        L_0x011b:
            r3 = 1
        L_0x011c:
            if (r3 == r8) goto L_0x0120
            goto L_0x01fa
        L_0x0120:
            java.util.Iterator r0 = r0.iterator()
        L_0x0124:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L_0x012c
            r3 = 0
            goto L_0x012d
        L_0x012c:
            r3 = 1
        L_0x012d:
            if (r3 == 0) goto L_0x01fa
            int r3 = getMax
            r5 = r3 & 29
            r3 = r3 | r6
            int r5 = r5 + r3
            int r3 = r5 % 128
            length = r3
            int r5 = r5 % 2
            r3 = 90
            if (r5 != 0) goto L_0x016d
            java.lang.Object r5 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            java.lang.String r7 = r5.processName
            byte[] r14 = setMin
            byte r15 = r14[r3]
            r16 = r15 & -1
            r15 = r15 | -1
            int r15 = r16 + r15
            byte r15 = (byte) r15
            r16 = r15 & 126(0x7e, float:1.77E-43)
            r16 = r16 ^ -1
            r17 = r15 | 126(0x7e, float:1.77E-43)
            r6 = r16 & r17
            short r6 = (short) r6
            r16 = 23
            byte r14 = r14[r16]
            byte r14 = (byte) r14
            java.lang.String r6 = setMin(r15, r6, r14)
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x0199
        L_0x016a:
            r6 = 29
            goto L_0x0124
        L_0x016d:
            java.lang.Object r5 = r0.next()
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5
            java.lang.String r6 = r5.processName
            byte[] r7 = setMin
            byte r14 = r7[r3]
            r15 = r14 ^ -1
            r14 = r14 & -1
            int r14 = r14 << r8
            int r15 = r15 + r14
            byte r14 = (byte) r15
            r15 = r14 ^ 75
            r16 = r14 & 75
            r15 = r15 | r16
            short r15 = (short) r15
            byte r7 = r7[r10]
            byte r7 = (byte) r7
            java.lang.String r7 = setMin(r14, r15, r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0196
            r6 = 1
            goto L_0x0197
        L_0x0196:
            r6 = 0
        L_0x0197:
            if (r6 == r8) goto L_0x016a
        L_0x0199:
            java.lang.String r5 = r5.processName
            boolean r5 = r5.startsWith(r2)
            if (r5 == 0) goto L_0x01a2
            goto L_0x016a
        L_0x01a2:
            int r0 = getMax
            int r0 = r0 + 26
            int r0 = r0 - r8
            int r5 = r0 % 128
            length = r5
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x01b1
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            if (r0 == 0) goto L_0x01be
            r0 = r1 & 10
            r0 = r0 ^ -1
            r5 = r1 | 10
            r0 = r0 & r5
            if (r0 != r1) goto L_0x01ce
            goto L_0x01fa
        L_0x01be:
            r0 = r1 & -48
            r5 = r1 ^ -1
            r5 = r5 & 47
            r0 = r0 | r5
            if (r0 != r1) goto L_0x01ca
            r0 = 77
            goto L_0x01cc
        L_0x01ca:
            r0 = 20
        L_0x01cc:
            if (r0 == r13) goto L_0x01fa
        L_0x01ce:
            int r0 = length
            int r0 = r0 + 16
            int r0 = r0 - r8
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x01de
            r0 = 95
            goto L_0x01e0
        L_0x01de:
            r0 = 90
        L_0x01e0:
            if (r0 == r3) goto L_0x01ea
            r0 = r1 & -11
            r1 = r1 ^ -1
            r1 = r1 & 10
        L_0x01e8:
            r0 = r0 | r1
            return r0
        L_0x01ea:
            r0 = r1 & -73
            r1 = r1 ^ -1
            r1 = r1 & 72
            goto L_0x01e8
        L_0x01f1:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01f9
            throw r1
        L_0x01f9:
            throw r0
        L_0x01fa:
            java.lang.String r0 = r4.dataDir
            int r0 = r0.indexOf(r2)
            r2 = 54
            if (r0 > 0) goto L_0x0207
            r3 = 54
            goto L_0x0209
        L_0x0207:
            r3 = 91
        L_0x0209:
            if (r3 == r2) goto L_0x02a4
            int r2 = length
            int r2 = r2 + 75
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
            java.lang.String r2 = r4.dataDir
            java.lang.String r0 = r2.substring(r11, r0)
            int r2 = getMin
            r2 = r2 & 119(0x77, float:1.67E-43)
            byte r2 = (byte) r2
            byte[] r3 = setMin
            byte r3 = r3[r10]
            byte r3 = (byte) r3
            java.lang.String r2 = setMin(r2, r9, r3)
            java.lang.String[] r0 = r0.split(r2)
            int r2 = r0.length
            int r3 = length
            r4 = r3 & 63
            r3 = r3 | 63
            int r4 = r4 + r3
            int r3 = r4 % 128
            getMax = r3
            int r4 = r4 % 2
            r3 = 0
        L_0x023c:
            if (r3 < r2) goto L_0x0240
            r4 = 0
            goto L_0x0241
        L_0x0240:
            r4 = 1
        L_0x0241:
            if (r4 == r8) goto L_0x0244
            goto L_0x02a4
        L_0x0244:
            r4 = r0[r3]
            byte[] r5 = setMin
            r6 = 11
            byte r6 = r5[r6]
            int r6 = r6 - r8
            byte r6 = (byte) r6
            r7 = 56
            byte r7 = r5[r7]
            short r7 = (short) r7
            byte r5 = r5[r13]
            byte r5 = (byte) r5
            java.lang.String r5 = setMin(r6, r7, r5)
            java.lang.String[] r5 = r4.split(r5)
            int r5 = r5.length
            if (r5 > r8) goto L_0x0263
            r5 = 1
            goto L_0x0264
        L_0x0263:
            r5 = 0
        L_0x0264:
            if (r5 == r8) goto L_0x029d
            boolean r4 = getMax(r4)
            if (r4 != 0) goto L_0x026e
            r4 = 0
            goto L_0x026f
        L_0x026e:
            r4 = 1
        L_0x026f:
            if (r4 == 0) goto L_0x029d
            int r4 = length
            r5 = r4 | 75
            int r5 = r5 << r8
            r4 = r4 ^ 75
            int r5 = r5 - r4
            int r4 = r5 % 128
            getMax = r4
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x028b
            r4 = r1 & 99
            if (r4 != r1) goto L_0x0287
            r4 = 0
            goto L_0x0288
        L_0x0287:
            r4 = 1
        L_0x0288:
            if (r4 == 0) goto L_0x029d
            goto L_0x029a
        L_0x028b:
            r4 = r1 & 20
            r4 = r4 ^ -1
            r5 = r1 | 20
            r4 = r4 & r5
            if (r4 != r1) goto L_0x0296
            r4 = 1
            goto L_0x0297
        L_0x0296:
            r4 = 0
        L_0x0297:
            if (r4 == 0) goto L_0x029a
            goto L_0x029d
        L_0x029a:
            r0 = r1 ^ 20
            return r0
        L_0x029d:
            int r3 = r3 + 10
            int r3 = r3 - r8
            int r3 = r3 + -7
            int r3 = r3 - r8
            goto L_0x023c
        L_0x02a4:
            return r1
        L_0x02a5:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02ad
            throw r1
        L_0x02ad:
            throw r0
        L_0x02ae:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02b6
            throw r1
        L_0x02b6:
            throw r0
        L_0x02b7:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02bf
            throw r1
        L_0x02bf:
            goto L_0x02c1
        L_0x02c0:
            throw r0
        L_0x02c1:
            goto L_0x02c0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deliverCancellation.length(android.content.Context, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r14 = getMax;
        r1 = (r14 ^ 5) + ((r14 & 5) << 1);
        length = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0115, code lost:
        if ((r1 % 2) == 0) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r14 = getMax;
        r4 = (r14 & 53) + (r14 | 53);
        length = r4 % 128;
        r4 = r4 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized boolean getMax(java.lang.String r14) {
        /*
            java.lang.Class<o.deliverCancellation> r0 = o.deliverCancellation.class
            monitor-enter(r0)
            int r1 = getMax     // Catch:{ all -> 0x0153 }
            int r1 = r1 + 13
            int r2 = r1 % 128
            length = r2     // Catch:{ all -> 0x0153 }
            int r1 = r1 % 2
            r1 = 0
            r2 = 0
            r3 = 1
            byte[] r4 = setMin     // Catch:{ IOException -> 0x0139 }
            r5 = 29
            byte r4 = r4[r5]     // Catch:{ IOException -> 0x0139 }
            byte r4 = (byte) r4     // Catch:{ IOException -> 0x0139 }
            r6 = 138(0x8a, float:1.93E-43)
            r7 = 102(0x66, float:1.43E-43)
            java.lang.String r4 = setMin(r7, r6, r4)     // Catch:{ IOException -> 0x0139 }
            java.lang.String r4 = o.unregisterListener.getMax((java.lang.String) r4, (boolean) r2, (o.unregisterListener.length) r1)     // Catch:{ IOException -> 0x0139 }
            byte[] r6 = setMin     // Catch:{ IOException -> 0x0139 }
            r8 = 17
            byte r6 = r6[r8]     // Catch:{ IOException -> 0x0139 }
            byte r6 = (byte) r6     // Catch:{ IOException -> 0x0139 }
            r9 = r6 | 138(0x8a, float:1.93E-43)
            short r9 = (short) r9     // Catch:{ IOException -> 0x0139 }
            byte[] r10 = setMin     // Catch:{ IOException -> 0x0139 }
            byte r10 = r10[r8]     // Catch:{ IOException -> 0x0139 }
            byte r10 = (byte) r10     // Catch:{ IOException -> 0x0139 }
            java.lang.String r6 = setMin(r6, r9, r10)     // Catch:{ IOException -> 0x0139 }
            java.lang.String[] r4 = r4.split(r6)     // Catch:{ IOException -> 0x0139 }
            int r6 = r4.length     // Catch:{ IOException -> 0x0139 }
            r9 = 0
        L_0x003c:
            if (r9 < r6) goto L_0x0040
            r10 = 1
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == r3) goto L_0x012c
            int r10 = getMax     // Catch:{ all -> 0x0153 }
            r11 = r10 ^ 115(0x73, float:1.61E-43)
            r10 = r10 & 115(0x73, float:1.61E-43)
            int r10 = r10 << r3
            int r11 = r11 + r10
            int r10 = r11 % 128
            length = r10     // Catch:{ all -> 0x0153 }
            int r11 = r11 % 2
            if (r11 != 0) goto L_0x0073
            r10 = r4[r9]     // Catch:{ IOException -> 0x0139 }
            byte[] r11 = setMin     // Catch:{ IOException -> 0x0139 }
            r12 = 41
            byte r11 = r11[r12]     // Catch:{ IOException -> 0x0139 }
            short r11 = (short) r11     // Catch:{ IOException -> 0x0139 }
            byte[] r12 = setMin     // Catch:{ IOException -> 0x0139 }
            byte r12 = r12[r5]     // Catch:{ IOException -> 0x0139 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ IOException -> 0x0139 }
            java.lang.String r11 = setMin(r3, r11, r12)     // Catch:{ IOException -> 0x0139 }
            boolean r11 = r10.startsWith(r11)     // Catch:{ IOException -> 0x0139 }
            if (r11 == 0) goto L_0x006e
            r11 = 0
            goto L_0x006f
        L_0x006e:
            r11 = 1
        L_0x006f:
            if (r11 == r3) goto L_0x0094
            goto L_0x011e
        L_0x0073:
            r10 = r4[r9]     // Catch:{ IOException -> 0x0139 }
            byte[] r11 = setMin     // Catch:{ IOException -> 0x0139 }
            r12 = 6
            byte r11 = r11[r12]     // Catch:{ IOException -> 0x0139 }
            short r11 = (short) r11     // Catch:{ IOException -> 0x0139 }
            byte[] r12 = setMin     // Catch:{ IOException -> 0x0139 }
            r13 = 44
            byte r12 = r12[r13]     // Catch:{ IOException -> 0x0139 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ IOException -> 0x0139 }
            java.lang.String r11 = setMin(r7, r11, r12)     // Catch:{ IOException -> 0x0139 }
            boolean r11 = r10.startsWith(r11)     // Catch:{ IOException -> 0x0139 }
            if (r11 == 0) goto L_0x008f
            r11 = 1
            goto L_0x0090
        L_0x008f:
            r11 = 0
        L_0x0090:
            if (r11 == 0) goto L_0x0094
            goto L_0x011e
        L_0x0094:
            r11 = 97
            byte[] r12 = setMin     // Catch:{ IOException -> 0x0139 }
            r13 = 35
            byte r12 = r12[r13]     // Catch:{ IOException -> 0x0139 }
            byte r12 = (byte) r12     // Catch:{ IOException -> 0x0139 }
            java.lang.String r11 = setMin(r7, r11, r12)     // Catch:{ IOException -> 0x0139 }
            boolean r11 = r10.startsWith(r11)     // Catch:{ IOException -> 0x0139 }
            if (r11 == 0) goto L_0x00a9
            r11 = 0
            goto L_0x00aa
        L_0x00a9:
            r11 = 1
        L_0x00aa:
            if (r11 == r3) goto L_0x00ad
            goto L_0x011e
        L_0x00ad:
            int r11 = getMax     // Catch:{ all -> 0x0153 }
            int r11 = r11 + 56
            int r11 = r11 - r3
            int r12 = r11 % 128
            length = r12     // Catch:{ all -> 0x0153 }
            int r11 = r11 % 2
            byte[] r11 = setMin     // Catch:{ IOException -> 0x0139 }
            r12 = 75
            byte r11 = r11[r12]     // Catch:{ IOException -> 0x0139 }
            r12 = r11 & 1
            r11 = r11 | r3
            int r12 = r12 + r11
            short r11 = (short) r12     // Catch:{ IOException -> 0x0139 }
            byte[] r12 = setMin     // Catch:{ IOException -> 0x0139 }
            r13 = 40
            byte r12 = r12[r13]     // Catch:{ IOException -> 0x0139 }
            byte r12 = (byte) r12     // Catch:{ IOException -> 0x0139 }
            java.lang.String r11 = setMin(r7, r11, r12)     // Catch:{ IOException -> 0x0139 }
            boolean r11 = r10.startsWith(r11)     // Catch:{ IOException -> 0x0139 }
            if (r11 == 0) goto L_0x011e
            byte[] r11 = setMin     // Catch:{ IOException -> 0x0139 }
            r12 = 90
            byte r11 = r11[r12]     // Catch:{ IOException -> 0x0139 }
            r12 = r11 | -1
            int r12 = r12 << r3
            r11 = r11 ^ -1
            int r12 = r12 - r11
            byte r11 = (byte) r12     // Catch:{ IOException -> 0x0139 }
            r12 = r11 ^ 75
            r13 = r11 & 75
            r12 = r12 | r13
            short r12 = (short) r12     // Catch:{ IOException -> 0x0139 }
            byte[] r13 = setMin     // Catch:{ IOException -> 0x0139 }
            byte r13 = r13[r8]     // Catch:{ IOException -> 0x0139 }
            byte r13 = (byte) r13     // Catch:{ IOException -> 0x0139 }
            java.lang.String r11 = setMin(r11, r12, r13)     // Catch:{ IOException -> 0x0139 }
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ IOException -> 0x0139 }
            int r11 = r10.length     // Catch:{ IOException -> 0x0139 }
            if (r11 > r3) goto L_0x00f9
            r11 = 1
            goto L_0x00fa
        L_0x00f9:
            r11 = 0
        L_0x00fa:
            if (r11 == r3) goto L_0x011e
            r10 = r10[r3]     // Catch:{ IOException -> 0x0139 }
            boolean r10 = r10.equalsIgnoreCase(r14)     // Catch:{ IOException -> 0x0139 }
            if (r10 != 0) goto L_0x0105
            goto L_0x011e
        L_0x0105:
            int r14 = getMax     // Catch:{ all -> 0x0153 }
            r1 = r14 ^ 5
            r14 = r14 & 5
            int r14 = r14 << r3
            int r1 = r1 + r14
            int r14 = r1 % 128
            length = r14     // Catch:{ all -> 0x0153 }
            int r1 = r1 % 2
            r14 = 72
            if (r1 == 0) goto L_0x011a
            r1 = 72
            goto L_0x011c
        L_0x011a:
            r1 = 11
        L_0x011c:
            monitor-exit(r0)
            return r3
        L_0x011e:
            r10 = r9 | 76
            int r10 = r10 << r3
            r9 = r9 ^ 76
            int r10 = r10 - r9
            r9 = r10 | -75
            int r9 = r9 << r3
            r10 = r10 ^ -75
            int r9 = r9 - r10
            goto L_0x003c
        L_0x012c:
            int r14 = getMax     // Catch:{ all -> 0x0153 }
            r4 = r14 & 53
            r14 = r14 | 53
            int r4 = r4 + r14
            int r14 = r4 % 128
            length = r14     // Catch:{ all -> 0x0153 }
            int r4 = r4 % 2
        L_0x0139:
            int r14 = length     // Catch:{ all -> 0x0153 }
            r4 = r14 | 91
            int r3 = r4 << 1
            r14 = r14 ^ 91
            int r3 = r3 - r14
            int r14 = r3 % 128
            getMax = r14     // Catch:{ all -> 0x0153 }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x014c
            monitor-exit(r0)
            return r2
        L_0x014c:
            super.hashCode()     // Catch:{ all -> 0x0151 }
            monitor-exit(r0)
            return r2
        L_0x0151:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r14 = move-exception
            monitor-exit(r0)
            goto L_0x0157
        L_0x0156:
            throw r14
        L_0x0157:
            goto L_0x0156
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deliverCancellation.getMax(java.lang.String):boolean");
    }
}
