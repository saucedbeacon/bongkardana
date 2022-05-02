package o;

import android.content.Context;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;
import java.nio.LongBuffer;

public final class executePendingTask {
    private static byte[] getMax = {8, Ascii.SUB, 22, -122, Ascii.DLE, -7, 17, 0, -3, -2, -51, 56, Ascii.SI, 2, 9, -12, Ascii.FF, 9, -67, Ascii.CAN, 47, 2, 9, -12, 22, -1, Ascii.DLE, -7, 17, 0, -3, -2, -51, 56, Ascii.SI, 2, 9, -12, Ascii.FF, 9, -67, 69, 0, -60, 37, Ascii.DC4, 5, Ascii.VT, -7, 9, 1, -21, Ascii.ETB, Ascii.DLE, -10, 9, 1, Ascii.DLE, -6, Ascii.CAN, -18, -48, ImageFileType.HEAD_HEVC_0, -11, 1, Ascii.NAK, 0, -6, Ascii.SO, 8, -72, 34, Ascii.ESC, 17, 3, -15, 9, 1, -30, 40, 1, 1, 17, 4, Ascii.DLE, -7, 17, 0, -3, -2, -51, 56, Ascii.SI, 2, 9, -12, Ascii.FF, 9, -67, 69, 0, -60, 37, Ascii.DC4, 5, Ascii.VT, -7, 9, 1, -25, 40, -5, Ascii.FF, -7, 1, 10, -10, 22, 4, 0, -10, 17, 8, 1, 1, 17, 4, 1, Ascii.DC2, -33, Ascii.DC4, 5, Ascii.VT, -7, 9, 1, -25, 40, -5, Ascii.FF, -2, -42, 58, -2, -12, -33, 52, 3, -14, Ascii.ESC, -8, -4, -17, 8, 6, 4, 1, Ascii.DC2, -33, Ascii.DC4, 5, Ascii.VT, -7, 9, 1, -21, Ascii.ETB, Ascii.DLE, -10, 9, 1, Ascii.DLE, 1, Ascii.DC2, -33, Ascii.DC4, 5, Ascii.VT, -7, 9, 1, -20, 22, Ascii.SI, -5, 1, Ascii.DC2, -40, 40, 8, 4, -16, Ascii.DLE, -8, 5, -6, -12, Ascii.DLE, -7, 17, 0, -3, -2, -51, 56, Ascii.SI, 2, 9, -12, Ascii.FF, 9, -67, 69, 0, -60, 40, Ascii.EM, 1, 10, -10, 22, 4, 0, -10};
    private static int length = 1;
    private static int setMax;
    public static final int setMin = 54;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r6, int r7, short r8) {
        /*
            int r0 = setMax
            int r0 = r0 + 75
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            int r8 = r8 + 1
            int r7 = r7 + 58
            byte[] r0 = getMax
            int r6 = 196 - r6
            byte[] r1 = new byte[r8]
            r2 = 62
            if (r0 == 0) goto L_0x001b
            r3 = 62
            goto L_0x001d
        L_0x001b:
            r3 = 64
        L_0x001d:
            r4 = 0
            if (r3 == r2) goto L_0x002e
            int r2 = setMax
            int r2 = r2 + 93
            int r3 = r2 % 128
            length = r3
            int r2 = r2 % 2
            r3 = r7
            r2 = 0
            r7 = r6
            goto L_0x0043
        L_0x002e:
            r2 = 0
        L_0x002f:
            int r6 = r6 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            int r2 = r2 + 1
            if (r2 != r8) goto L_0x003e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r4)
            return r6
        L_0x003e:
            byte r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0043:
            int r6 = r6 + r3
            int r6 = r6 + -3
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: o.executePendingTask.setMin(int, int, short):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0061, code lost:
        if (r2 != 64) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0072, code lost:
        r1 = getMin(r17, new java.math.BigInteger(r1.substring(0, 16), 16).longValue(), new java.math.BigInteger(r1.substring(16, 32), 16).longValue(), new java.math.BigInteger(r1.substring(32, 48), 16).longValue(), new java.math.BigInteger(r1.substring(48), 16).longValue());
        r2 = length;
        r3 = (r2 & 63) + (r2 | 63);
        setMax = r3 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if ((r3 % 2) != 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00be, code lost:
        r2 = 'Z';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c1, code lost:
        r2 = ')';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c3, code lost:
        if (r2 == ')') goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c6, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ca, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r2 != 64) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMin(android.content.Context r17, java.lang.String r18) {
        /*
            int r0 = length
            r1 = r0 & 117(0x75, float:1.64E-43)
            r0 = r0 | 117(0x75, float:1.64E-43)
            int r1 = r1 + r0
            int r0 = r1 % 128
            setMax = r0
            r0 = 2
            int r1 = r1 % r0
            r2 = 78
            if (r1 != 0) goto L_0x0014
            r1 = 78
            goto L_0x0016
        L_0x0014:
            r1 = 15
        L_0x0016:
            r3 = 0
            r4 = 64
            java.lang.String r5 = ""
            r6 = 32
            r7 = 16
            if (r1 == r2) goto L_0x0043
            java.lang.String r1 = r18.toLowerCase()
            byte[] r2 = getMax
            r8 = 5753(0x1679, float:8.062E-42)
            byte r8 = r2[r8]
            short r8 = (short) r8
            r9 = 85
            byte r2 = r2[r9]
            byte r2 = (byte) r2
            byte r9 = (byte) r2
            java.lang.String r2 = setMin((int) r8, (int) r2, (short) r9)
            java.lang.String r1 = r1.replaceAll(r2, r5)
            int r2 = r1.length()
            if (r2 == r6) goto L_0x00ce
            if (r2 == r4) goto L_0x0072
            goto L_0x0063
        L_0x0043:
            java.lang.String r1 = r18.toLowerCase()
            byte[] r2 = getMax
            r8 = 216(0xd8, float:3.03E-43)
            byte r8 = r2[r8]
            short r8 = (short) r8
            r9 = 7
            byte r2 = r2[r9]
            byte r2 = (byte) r2
            byte r9 = (byte) r2
            java.lang.String r2 = setMin((int) r8, (int) r2, (short) r9)
            java.lang.String r1 = r1.replaceAll(r2, r5)
            int r2 = r1.length()
            if (r2 == r6) goto L_0x00ce
            if (r2 == r4) goto L_0x0072
        L_0x0063:
            int r1 = setMax
            r2 = r1 ^ 101(0x65, float:1.42E-43)
            r1 = r1 & 101(0x65, float:1.42E-43)
            int r1 = r1 << 1
            int r2 = r2 + r1
            int r1 = r2 % 128
            length = r1
            int r2 = r2 % r0
            return r0
        L_0x0072:
            java.math.BigInteger r2 = new java.math.BigInteger
            java.lang.String r3 = r1.substring(r3, r7)
            r2.<init>(r3, r7)
            long r9 = r2.longValue()
            java.math.BigInteger r2 = new java.math.BigInteger
            java.lang.String r3 = r1.substring(r7, r6)
            r2.<init>(r3, r7)
            long r11 = r2.longValue()
            java.math.BigInteger r2 = new java.math.BigInteger
            r3 = 48
            java.lang.String r4 = r1.substring(r6, r3)
            r2.<init>(r4, r7)
            long r13 = r2.longValue()
            java.math.BigInteger r2 = new java.math.BigInteger
            java.lang.String r1 = r1.substring(r3)
            r2.<init>(r1, r7)
            long r15 = r2.longValue()
            r8 = r17
            int r1 = getMin(r8, r9, r11, r13, r15)
            int r2 = length
            r3 = r2 & 63
            r2 = r2 | 63
            int r3 = r3 + r2
            int r2 = r3 % 128
            setMax = r2
            int r3 = r3 % r0
            r0 = 41
            if (r3 != 0) goto L_0x00c1
            r2 = 90
            goto L_0x00c3
        L_0x00c1:
            r2 = 41
        L_0x00c3:
            if (r2 == r0) goto L_0x00c6
            return r1
        L_0x00c6:
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x00cb }
            return r1
        L_0x00cb:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00ce:
            java.math.BigInteger r2 = new java.math.BigInteger
            java.lang.String r3 = r1.substring(r3, r7)
            r2.<init>(r3, r7)
            long r2 = r2.longValue()
            java.math.BigInteger r4 = new java.math.BigInteger
            java.lang.String r1 = r1.substring(r7, r6)
            r4.<init>(r1, r7)
            long r4 = r4.longValue()
            r1 = r17
            int r1 = setMin((android.content.Context) r1, (long) r2, (long) r4)
            int r2 = setMax
            int r2 = r2 + 5
            int r3 = r2 % 128
            length = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.executePendingTask.getMin(android.content.Context, java.lang.String):int");
    }

    private static int getMin(Context context, long j, long j2, long j3, long j4) {
        int i = setMax + 9;
        length = i % 128;
        int i2 = i % 2;
        int max = getMax(context, LongBuffer.allocate(4).put(j).put(j2).put(j3).put(j4));
        int i3 = length;
        int i4 = (i3 & 43) + (i3 | 43);
        setMax = i4 % 128;
        int i5 = i4 % 2;
        return max;
    }

    @Deprecated
    private static int setMin(Context context, long j, long j2) {
        int i = setMax;
        int i2 = (i & 101) + (i | 101);
        length = i2 % 128;
        int i3 = i2 % 2;
        int max = getMax(context, LongBuffer.allocate(2).put(j).put(j2));
        int i4 = setMax;
        int i5 = ((i4 | 125) << 1) - (i4 ^ 125);
        length = i5 % 128;
        int i6 = i5 % 2;
        return max;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getMax(android.content.Context r19, java.nio.LongBuffer r20) {
        /*
            r0 = r19
            int r1 = length
            r2 = r1 | 11
            r3 = 1
            int r2 = r2 << r3
            r1 = r1 ^ 11
            int r2 = r2 - r1
            int r1 = r2 % 128
            setMax = r1
            r1 = 2
            int r2 = r2 % r1
            r2 = 3
            int r4 = r20.capacity()     // Catch:{ all -> 0x02c8 }
            r5 = 216(0xd8, float:3.03E-43)
            r6 = 13
            r7 = 4
            r8 = 0
            if (r4 == r7) goto L_0x0033
            byte[] r4 = getMax     // Catch:{ all -> 0x02c8 }
            byte r4 = r4[r6]     // Catch:{ all -> 0x02c8 }
            short r4 = (short) r4     // Catch:{ all -> 0x02c8 }
            r9 = r4 ^ 17
            r10 = r4 & 17
            r9 = r9 | r10
            byte r9 = (byte) r9     // Catch:{ all -> 0x02c8 }
            byte[] r10 = getMax     // Catch:{ all -> 0x02c8 }
            byte r10 = r10[r6]     // Catch:{ all -> 0x02c8 }
        L_0x002d:
            byte r10 = (byte) r10     // Catch:{ all -> 0x02c8 }
            java.lang.String r4 = setMin((int) r4, (int) r9, (short) r10)     // Catch:{ all -> 0x02c8 }
            goto L_0x006f
        L_0x0033:
            int r4 = length
            int r4 = r4 + 65
            int r9 = r4 % 128
            setMax = r9
            int r4 = r4 % r1
            if (r4 != 0) goto L_0x0040
            r4 = 0
            goto L_0x0041
        L_0x0040:
            r4 = 1
        L_0x0041:
            if (r4 == r3) goto L_0x0056
            byte[] r4 = getMax     // Catch:{ all -> 0x02c8 }
            r9 = 20
            byte r4 = r4[r9]     // Catch:{ all -> 0x02c8 }
            short r4 = (short) r4     // Catch:{ all -> 0x02c8 }
            byte[] r9 = getMax     // Catch:{ all -> 0x02c8 }
            byte r9 = r9[r5]     // Catch:{ all -> 0x02c8 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x02c8 }
            byte[] r10 = getMax     // Catch:{ all -> 0x02c8 }
            r11 = 154(0x9a, float:2.16E-43)
            byte r10 = r10[r11]     // Catch:{ all -> 0x02c8 }
            goto L_0x002d
        L_0x0056:
            byte[] r4 = getMax     // Catch:{ all -> 0x02c8 }
            r9 = 53
            byte r4 = r4[r9]     // Catch:{ all -> 0x02c8 }
            short r4 = (short) r4     // Catch:{ all -> 0x02c8 }
            byte[] r9 = getMax     // Catch:{ all -> 0x02c8 }
            r10 = 2736(0xab0, float:3.834E-42)
            byte r9 = r9[r10]     // Catch:{ all -> 0x02c8 }
            byte r9 = (byte) r9     // Catch:{ all -> 0x02c8 }
            byte[] r10 = getMax     // Catch:{ all -> 0x02c8 }
            r11 = 24275(0x5ed3, float:3.4017E-41)
            byte r10 = r10[r11]     // Catch:{ all -> 0x02c8 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02c8 }
            java.lang.String r4 = setMin((int) r4, (int) r9, (short) r10)     // Catch:{ all -> 0x02c8 }
        L_0x006f:
            int r9 = setMax
            r10 = r9 & 37
            r9 = r9 | 37
            int r10 = r10 + r9
            int r9 = r10 % 128
            length = r9
            int r10 = r10 % r1
            byte[] r9 = getMax     // Catch:{ all -> 0x02bf }
            r10 = 79
            byte r9 = r9[r10]     // Catch:{ all -> 0x02bf }
            int r9 = r9 - r3
            byte r9 = (byte) r9     // Catch:{ all -> 0x02bf }
            byte[] r11 = getMax     // Catch:{ all -> 0x02bf }
            byte r11 = r11[r1]     // Catch:{ all -> 0x02bf }
            byte r11 = (byte) r11     // Catch:{ all -> 0x02bf }
            r12 = 193(0xc1, float:2.7E-43)
            java.lang.String r9 = setMin((int) r12, (int) r9, (short) r11)     // Catch:{ all -> 0x02bf }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x02bf }
            byte[] r11 = getMax     // Catch:{ all -> 0x02bf }
            byte r11 = r11[r10]     // Catch:{ all -> 0x02bf }
            r13 = r11 ^ 1
            r11 = r11 & r3
            int r11 = r11 << r3
            int r13 = r13 + r11
            short r11 = (short) r13     // Catch:{ all -> 0x02bf }
            r13 = r11 | 4
            int r13 = r13 << r3
            r14 = r11 ^ 4
            int r13 = r13 - r14
            byte r13 = (byte) r13     // Catch:{ all -> 0x02bf }
            byte[] r14 = getMax     // Catch:{ all -> 0x02bf }
            byte r14 = r14[r7]     // Catch:{ all -> 0x02bf }
            byte r14 = (byte) r14     // Catch:{ all -> 0x02bf }
            java.lang.String r11 = setMin((int) r11, (int) r13, (short) r14)     // Catch:{ all -> 0x02bf }
            r13 = 0
            java.lang.reflect.Method r9 = r9.getMethod(r11, r13)     // Catch:{ all -> 0x02bf }
            java.lang.Object r9 = r9.invoke(r0, r13)     // Catch:{ all -> 0x02bf }
            int r11 = setMax
            int r11 = r11 + 88
            int r11 = r11 - r3
            int r14 = r11 % 128
            length = r14
            int r11 = r11 % r1
            byte[] r11 = getMax     // Catch:{ all -> 0x02b6 }
            byte r11 = r11[r10]     // Catch:{ all -> 0x02b6 }
            int r11 = r11 - r8
            int r11 = r11 - r3
            byte r11 = (byte) r11     // Catch:{ all -> 0x02b6 }
            byte[] r14 = getMax     // Catch:{ all -> 0x02b6 }
            byte r14 = r14[r1]     // Catch:{ all -> 0x02b6 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x02b6 }
            java.lang.String r11 = setMin((int) r12, (int) r11, (short) r14)     // Catch:{ all -> 0x02b6 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x02b6 }
            byte[] r12 = getMax     // Catch:{ all -> 0x02b6 }
            byte r5 = r12[r5]     // Catch:{ all -> 0x02b6 }
            short r5 = (short) r5     // Catch:{ all -> 0x02b6 }
            r12 = 45
            java.lang.String r5 = setMin((int) r5, (int) r12, (short) r6)     // Catch:{ all -> 0x02b6 }
            java.lang.reflect.Method r5 = r11.getMethod(r5, r13)     // Catch:{ all -> 0x02b6 }
            java.lang.Object r0 = r5.invoke(r0, r13)     // Catch:{ all -> 0x02b6 }
            r5 = 64
            int r11 = length
            r14 = r11 & 125(0x7d, float:1.75E-43)
            r11 = r11 | 125(0x7d, float:1.75E-43)
            int r14 = r14 + r11
            int r11 = r14 % 128
            setMax = r11
            int r14 = r14 % r1
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x02ad }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x02ad }
            r11[r3] = r5     // Catch:{ all -> 0x02ad }
            r11[r8] = r0     // Catch:{ all -> 0x02ad }
            r0 = 171(0xab, float:2.4E-43)
            byte[] r5 = getMax     // Catch:{ all -> 0x02ad }
            byte r5 = r5[r10]     // Catch:{ all -> 0x02ad }
            int r5 = r5 - r3
            byte r5 = (byte) r5     // Catch:{ all -> 0x02ad }
            r14 = r5 & 248(0xf8, float:3.48E-43)
            byte r14 = (byte) r14     // Catch:{ all -> 0x02ad }
            java.lang.String r0 = setMin((int) r0, (int) r5, (short) r14)     // Catch:{ all -> 0x02ad }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x02ad }
            byte[] r5 = getMax     // Catch:{ all -> 0x02ad }
            r14 = 41
            byte r5 = r5[r14]     // Catch:{ all -> 0x02ad }
            r14 = r5 | 1
            int r14 = r14 << r3
            r5 = r5 ^ r3
            int r14 = r14 - r5
            short r5 = (short) r14     // Catch:{ all -> 0x02ad }
            java.lang.String r5 = setMin((int) r5, (int) r12, (short) r6)     // Catch:{ all -> 0x02ad }
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x02ad }
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r6[r8] = r12     // Catch:{ all -> 0x02ad }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x02ad }
            r6[r3] = r12     // Catch:{ all -> 0x02ad }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x02ad }
            java.lang.Object r0 = r0.invoke(r9, r11)     // Catch:{ all -> 0x02ad }
            r5 = 113(0x71, float:1.58E-43)
            byte[] r6 = getMax     // Catch:{ all -> 0x02c8 }
            byte r6 = r6[r10]     // Catch:{ all -> 0x02c8 }
            r9 = r6 ^ -1
            r6 = r6 & -1
            int r6 = r6 << r3
            int r9 = r9 + r6
            byte r6 = (byte) r9     // Catch:{ all -> 0x02c8 }
            r9 = 29
            java.lang.String r5 = setMin((int) r5, (int) r6, (short) r9)     // Catch:{ all -> 0x02c8 }
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ all -> 0x02c8 }
            r6 = 84
            int r9 = setMin     // Catch:{ all -> 0x02c8 }
            r10 = r9 ^ 3
            r9 = r9 & r2
            int r9 = r9 << r3
            int r10 = r10 + r9
            byte r9 = (byte) r10     // Catch:{ all -> 0x02c8 }
            byte[] r10 = getMax     // Catch:{ all -> 0x02c8 }
            r11 = 14
            byte r10 = r10[r11]     // Catch:{ all -> 0x02c8 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02c8 }
            java.lang.String r6 = setMin((int) r6, (int) r9, (short) r10)     // Catch:{ all -> 0x02c8 }
            java.lang.reflect.Field r5 = r5.getField(r6)     // Catch:{ all -> 0x02c8 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x02c8 }
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch:{ all -> 0x02c8 }
            int r5 = r0.length     // Catch:{ all -> 0x02c8 }
            r6 = 0
        L_0x016b:
            if (r6 < r5) goto L_0x016f
            r9 = 1
            goto L_0x0170
        L_0x016f:
            r9 = 0
        L_0x0170:
            if (r9 == r3) goto L_0x02a0
            int r9 = setMax
            int r9 = r9 + 95
            int r10 = r9 % 128
            length = r10
            int r9 = r9 % r1
            r10 = 67
            if (r9 == 0) goto L_0x0182
            r9 = 44
            goto L_0x0184
        L_0x0182:
            r9 = 67
        L_0x0184:
            if (r9 == r10) goto L_0x0189
            r9 = r0[r6]     // Catch:{ all -> 0x02c8 }
            goto L_0x018b
        L_0x0189:
            r9 = r0[r6]     // Catch:{ all -> 0x02c8 }
        L_0x018b:
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0297 }
            r10[r8] = r4     // Catch:{ all -> 0x0297 }
            byte[] r11 = getMax     // Catch:{ all -> 0x0297 }
            r12 = 61
            byte r11 = r11[r12]     // Catch:{ all -> 0x0297 }
            int r11 = -r11
            byte r11 = (byte) r11     // Catch:{ all -> 0x0297 }
            byte[] r14 = getMax     // Catch:{ all -> 0x0297 }
            byte r14 = r14[r3]     // Catch:{ all -> 0x0297 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0297 }
            r15 = 139(0x8b, float:1.95E-43)
            java.lang.String r11 = setMin((int) r15, (int) r11, (short) r14)     // Catch:{ all -> 0x0297 }
            java.lang.Class r11 = java.lang.Class.forName(r11)     // Catch:{ all -> 0x0297 }
            byte[] r14 = getMax     // Catch:{ all -> 0x0297 }
            r16 = 16
            byte r14 = r14[r16]     // Catch:{ all -> 0x0297 }
            short r14 = (short) r14     // Catch:{ all -> 0x0297 }
            r7 = r14 | 33
            byte r7 = (byte) r7     // Catch:{ all -> 0x0297 }
            byte[] r17 = getMax     // Catch:{ all -> 0x0297 }
            r18 = 115(0x73, float:1.61E-43)
            byte r15 = r17[r18]     // Catch:{ all -> 0x0297 }
            byte r15 = (byte) r15     // Catch:{ all -> 0x0297 }
            java.lang.String r7 = setMin((int) r14, (int) r7, (short) r15)     // Catch:{ all -> 0x0297 }
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ all -> 0x0297 }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r14[r8] = r15     // Catch:{ all -> 0x0297 }
            java.lang.reflect.Method r7 = r11.getMethod(r7, r14)     // Catch:{ all -> 0x0297 }
            java.lang.Object r7 = r7.invoke(r13, r10)     // Catch:{ all -> 0x0297 }
            int r10 = setMax
            r11 = r10 ^ 87
            r10 = r10 & 87
            int r10 = r10 << r3
            int r11 = r11 + r10
            int r10 = r11 % 128
            length = r10
            int r11 = r11 % r1
            byte[] r10 = getMax     // Catch:{ all -> 0x028e }
            r11 = 7
            byte r10 = r10[r11]     // Catch:{ all -> 0x028e }
            short r10 = (short) r10     // Catch:{ all -> 0x028e }
            r11 = r10 ^ 39
            r14 = r10 & 39
            r11 = r11 | r14
            byte r11 = (byte) r11     // Catch:{ all -> 0x028e }
            byte[] r14 = getMax     // Catch:{ all -> 0x028e }
            r15 = 72
            byte r14 = r14[r15]     // Catch:{ all -> 0x028e }
            byte r14 = (byte) r14     // Catch:{ all -> 0x028e }
            java.lang.String r10 = setMin((int) r10, (int) r11, (short) r14)     // Catch:{ all -> 0x028e }
            java.lang.Class r10 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x028e }
            int r11 = setMin     // Catch:{ all -> 0x028e }
            int r11 = r11 + r2
            short r11 = (short) r11     // Catch:{ all -> 0x028e }
            byte[] r14 = getMax     // Catch:{ all -> 0x028e }
            r15 = 142(0x8e, float:1.99E-43)
            byte r14 = r14[r15]     // Catch:{ all -> 0x028e }
            byte r14 = (byte) r14     // Catch:{ all -> 0x028e }
            byte[] r15 = getMax     // Catch:{ all -> 0x028e }
            byte r15 = r15[r18]     // Catch:{ all -> 0x028e }
            byte r15 = (byte) r15     // Catch:{ all -> 0x028e }
            java.lang.String r11 = setMin((int) r11, (int) r14, (short) r15)     // Catch:{ all -> 0x028e }
            java.lang.reflect.Method r10 = r10.getMethod(r11, r13)     // Catch:{ all -> 0x028e }
            java.lang.Object r9 = r10.invoke(r9, r13)     // Catch:{ all -> 0x028e }
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ all -> 0x0285 }
            r10[r8] = r9     // Catch:{ all -> 0x0285 }
            byte[] r9 = getMax     // Catch:{ all -> 0x0285 }
            byte r9 = r9[r12]     // Catch:{ all -> 0x0285 }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{ all -> 0x0285 }
            byte[] r11 = getMax     // Catch:{ all -> 0x0285 }
            byte r11 = r11[r3]     // Catch:{ all -> 0x0285 }
            byte r11 = (byte) r11     // Catch:{ all -> 0x0285 }
            r12 = 139(0x8b, float:1.95E-43)
            java.lang.String r9 = setMin((int) r12, (int) r9, (short) r11)     // Catch:{ all -> 0x0285 }
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ all -> 0x0285 }
            r11 = 75
            byte[] r12 = getMax     // Catch:{ all -> 0x0285 }
            r14 = 141(0x8d, float:1.98E-43)
            byte r12 = r12[r14]     // Catch:{ all -> 0x0285 }
            int r12 = -r12
            byte r12 = (byte) r12     // Catch:{ all -> 0x0285 }
            byte[] r14 = getMax     // Catch:{ all -> 0x0285 }
            r15 = 46
            byte r14 = r14[r15]     // Catch:{ all -> 0x0285 }
            byte r14 = (byte) r14     // Catch:{ all -> 0x0285 }
            java.lang.String r11 = setMin((int) r11, (int) r12, (short) r14)     // Catch:{ all -> 0x0285 }
            java.lang.Class[] r12 = new java.lang.Class[r3]     // Catch:{ all -> 0x0285 }
            java.lang.Class<byte[]> r14 = byte[].class
            r12[r8] = r14     // Catch:{ all -> 0x0285 }
            java.lang.reflect.Method r9 = r9.getMethod(r11, r12)     // Catch:{ all -> 0x0285 }
            java.lang.Object r7 = r9.invoke(r7, r10)     // Catch:{ all -> 0x0285 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0285 }
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)     // Catch:{ all -> 0x02c8 }
            java.nio.LongBuffer r7 = r7.asLongBuffer()     // Catch:{ all -> 0x02c8 }
            java.nio.Buffer r9 = r20.rewind()     // Catch:{ all -> 0x02c8 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x02c8 }
            if (r7 != 0) goto L_0x025f
            r7 = 4
            goto L_0x0261
        L_0x025f:
            r7 = 21
        L_0x0261:
            r9 = 4
            if (r7 == r9) goto L_0x0272
            int r0 = length
            r2 = r0 | 15
            int r2 = r2 << r3
            r0 = r0 ^ 15
            int r2 = r2 - r0
            int r0 = r2 % 128
            setMax = r0
            int r2 = r2 % r1
            return r3
        L_0x0272:
            r7 = r6 ^ 1
            r6 = r6 & 1
            int r6 = r6 << r3
            int r6 = r6 + r7
            int r7 = setMax
            int r7 = r7 + 110
            int r7 = r7 - r3
            int r10 = r7 % 128
            length = r10
            int r7 = r7 % r1
            r7 = 4
            goto L_0x016b
        L_0x0285:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x028d
            throw r1     // Catch:{ all -> 0x02c8 }
        L_0x028d:
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x028e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x0296
            throw r1     // Catch:{ all -> 0x02c8 }
        L_0x0296:
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x0297:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x029f
            throw r1     // Catch:{ all -> 0x02c8 }
        L_0x029f:
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02a0:
            int r0 = setMax
            r2 = r0 & 97
            r0 = r0 | 97
            int r2 = r2 + r0
            int r0 = r2 % 128
            length = r0
            int r2 = r2 % r1
            return r8
        L_0x02ad:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x02b5
            throw r1     // Catch:{ all -> 0x02c8 }
        L_0x02b5:
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02b6:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x02be
            throw r1     // Catch:{ all -> 0x02c8 }
        L_0x02be:
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02bf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()     // Catch:{ all -> 0x02c8 }
            if (r1 == 0) goto L_0x02c7
            throw r1     // Catch:{ all -> 0x02c8 }
        L_0x02c7:
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.executePendingTask.getMax(android.content.Context, java.nio.LongBuffer):int");
    }
}
