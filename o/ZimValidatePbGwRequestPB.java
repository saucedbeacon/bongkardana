package o;

import java.util.Arrays;

public class ZimValidatePbGwRequestPB {
    static final /* synthetic */ boolean getMax = (!ZimValidatePbGwRequestPB.class.desiredAssertionStatus());

    private static boolean getMax(long j, long j2) {
        if (j != j2) {
            return (((j > 0 ? 1 : (j == 0 ? 0 : -1)) < 0) ^ ((j > j2 ? 1 : (j == j2 ? 0 : -1)) < 0)) ^ ((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)) < 0);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        r6 = (((long) r13) << 32) | (((long) r5) & 4294967295L);
        r5 = (int) ((r6 >>> 32) & 4294967295L);
        r7 = ((int) (r6 & 4294967295L)) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r7 <= 0) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0117, code lost:
        r9 = r3.setMax;
        r10 = r3.setMin;
        r3.setMin = r10 + 1;
        r9[r10] = (char) ((r8 / r5) + 48);
        r8 = r8 % r5;
        r7 = r7 - 1;
        r9 = (((long) r8) << (-r4.getMin)) + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0133, code lost:
        if (r9 >= r2.setMax) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0135, code lost:
        r3.length = (r3.setMin - r26) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
        return setMin(r25, o.validateStandard.getMax(r0, r1).setMax, r2.setMax, r9, ((long) r5) << (-r4.getMin), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0158, code lost:
        r5 = r5 / 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015b, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015d, code lost:
        r11 = r11 * 5;
        r13 = r5 * 5;
        r2.setMax *= 5;
        r2.getMin++;
        r4.setMax >>>= 1;
        r4.getMin++;
        r5 = (char) (((int) ((r11 >>> (-r4.getMin)) & 4294967295L)) + 48);
        r6 = r3.setMax;
        r10 = r3.setMin;
        r3.setMin = r10 + 1;
        r6[r10] = r5;
        r11 = r11 & (r4.setMax - 1);
        r7 = r7 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a0, code lost:
        if (r11 >= r2.setMax) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a2, code lost:
        r3.length = (r3.setMin - r26) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c0, code lost:
        return setMin(r25, o.validateStandard.getMax(r0, r1).setMax * r13, r2.setMax, r11, r4.setMax, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c1, code lost:
        r5 = r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(o.validateStandard r22, o.validateStandard r23, o.validateStandard r24, o.BisMetaInfo r25, int r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            boolean r4 = getMax
            if (r4 != 0) goto L_0x001f
            int r4 = r0.getMin
            int r5 = r1.getMin
            if (r4 != r5) goto L_0x0019
            int r4 = r1.getMin
            int r5 = r2.getMin
            if (r4 != r5) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x001f:
            boolean r4 = getMax
            r5 = 1
            if (r4 != 0) goto L_0x0038
            long r7 = r0.setMax
            long r7 = r7 + r5
            long r9 = r2.setMax
            long r9 = r9 - r5
            boolean r4 = getMax(r7, r9)
            if (r4 == 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0038:
            boolean r4 = getMax
            if (r4 != 0) goto L_0x004f
            r4 = -60
            int r7 = r1.getMin
            if (r4 > r7) goto L_0x0049
            int r4 = r1.getMin
            r7 = -32
            if (r4 > r7) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x004f:
            o.validateStandard r4 = new o.validateStandard
            long r7 = r0.setMax
            long r7 = r7 - r5
            int r0 = r0.getMin
            r4.<init>(r7, r0)
            o.validateStandard r0 = new o.validateStandard
            long r7 = r2.setMax
            long r7 = r7 + r5
            int r2 = r2.getMin
            r0.<init>(r7, r2)
            o.validateStandard r2 = o.validateStandard.getMax(r0, r4)
            o.validateStandard r4 = new o.validateStandard
            int r7 = r1.getMin
            int r7 = -r7
            long r7 = r5 << r7
            int r9 = r1.getMin
            r4.<init>(r7, r9)
            long r7 = r0.setMax
            int r9 = r4.getMin
            int r9 = -r9
            long r7 = r7 >>> r9
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            int r8 = (int) r7
            long r11 = r0.setMax
            long r13 = r4.setMax
            long r13 = r13 - r5
            long r11 = r11 & r13
            int r7 = r4.getMin
            int r7 = -r7
            int r7 = 64 - r7
            r13 = 1000000000(0x3b9aca00, float:0.0047237873)
            r14 = 100000000(0x5f5e100, float:2.3122341E-35)
            r15 = 10000000(0x989680, float:1.4012985E-38)
            r5 = 1000000(0xf4240, float:1.401298E-39)
            r6 = 100000(0x186a0, float:1.4013E-40)
            r9 = 10000(0x2710, float:1.4013E-41)
            r10 = 10
            r19 = -1
            r20 = 0
            r21 = 1
            switch(r7) {
                case 0: goto L_0x00fc;
                case 1: goto L_0x00f7;
                case 2: goto L_0x00f7;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f1;
                case 5: goto L_0x00f1;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e7;
                case 8: goto L_0x00e7;
                case 9: goto L_0x00e7;
                case 10: goto L_0x00dd;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00dd;
                case 13: goto L_0x00dd;
                case 14: goto L_0x00d5;
                case 15: goto L_0x00d5;
                case 16: goto L_0x00d5;
                case 17: goto L_0x00cc;
                case 18: goto L_0x00cc;
                case 19: goto L_0x00cc;
                case 20: goto L_0x00c3;
                case 21: goto L_0x00c3;
                case 22: goto L_0x00c3;
                case 23: goto L_0x00c3;
                case 24: goto L_0x00ba;
                case 25: goto L_0x00ba;
                case 26: goto L_0x00ba;
                case 27: goto L_0x00b0;
                case 28: goto L_0x00b0;
                case 29: goto L_0x00b0;
                case 30: goto L_0x00a9;
                case 31: goto L_0x00a9;
                case 32: goto L_0x00a9;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r5 = 0
            goto L_0x00fd
        L_0x00a9:
            if (r13 > r8) goto L_0x00b0
            r20 = 9
            r5 = 9
            goto L_0x00fe
        L_0x00b0:
            if (r14 > r8) goto L_0x00ba
            r20 = 8
            r5 = 8
            r13 = 100000000(0x5f5e100, float:2.3122341E-35)
            goto L_0x00fe
        L_0x00ba:
            if (r15 > r8) goto L_0x00c3
            r20 = 7
            r5 = 7
            r13 = 10000000(0x989680, float:1.4012985E-38)
            goto L_0x00fe
        L_0x00c3:
            if (r5 > r8) goto L_0x00cc
            r20 = 6
            r5 = 6
            r13 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x00fe
        L_0x00cc:
            if (r6 > r8) goto L_0x00d5
            r20 = 5
            r5 = 5
            r13 = 100000(0x186a0, float:1.4013E-40)
            goto L_0x00fe
        L_0x00d5:
            if (r9 > r8) goto L_0x00dd
            r20 = 4
            r5 = 4
            r13 = 10000(0x2710, float:1.4013E-41)
            goto L_0x00fe
        L_0x00dd:
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r5 > r8) goto L_0x00e7
            r20 = 3
            r5 = 3
            r13 = 1000(0x3e8, float:1.401E-42)
            goto L_0x00fe
        L_0x00e7:
            r5 = 100
            if (r5 > r8) goto L_0x00f1
            r20 = 2
            r5 = 2
            r13 = 100
            goto L_0x00fe
        L_0x00f1:
            if (r10 > r8) goto L_0x00f7
            r5 = 1
            r13 = 10
            goto L_0x00fe
        L_0x00f7:
            if (r8 <= 0) goto L_0x00fc
            r5 = 0
            r13 = 1
            goto L_0x00fe
        L_0x00fc:
            r5 = -1
        L_0x00fd:
            r13 = 0
        L_0x00fe:
            long r6 = (long) r13
            r9 = 32
            long r6 = r6 << r9
            long r13 = (long) r5
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r17
            long r6 = r6 | r13
            long r9 = r6 >>> r9
            long r9 = r9 & r17
            int r5 = (int) r9
            long r6 = r6 & r17
            int r7 = (int) r6
            int r7 = r7 + 1
        L_0x0115:
            if (r7 <= 0) goto L_0x015b
            int r6 = r8 / r5
            int r6 = r6 + 48
            char r6 = (char) r6
            char[] r9 = r3.setMax
            int r10 = r3.setMin
            int r13 = r10 + 1
            r3.setMin = r13
            r9[r10] = r6
            int r8 = r8 % r5
            int r7 = r7 + -1
            long r9 = (long) r8
            int r6 = r4.getMin
            int r6 = -r6
            long r9 = r9 << r6
            long r9 = r9 + r11
            long r13 = r2.setMax
            int r6 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0158
            int r6 = r3.setMin
            int r6 = r6 - r26
            int r6 = r6 + r7
            r3.length = r6
            o.validateStandard r0 = o.validateStandard.getMax(r0, r1)
            long r6 = r0.setMax
            long r11 = r2.setMax
            long r0 = (long) r5
            int r2 = r4.getMin
            int r2 = -r2
            long r13 = r0 << r2
            r15 = 1
            r0 = r25
            r1 = r6
            r3 = r11
            r5 = r9
            r7 = r13
            r9 = r15
            boolean r0 = setMin(r0, r1, r3, r5, r7, r9)
            return r0
        L_0x0158:
            int r5 = r5 / 10
            goto L_0x0115
        L_0x015b:
            r5 = 1
        L_0x015d:
            r8 = 5
            long r11 = r11 * r8
            long r13 = r5 * r8
            long r5 = r2.setMax
            long r5 = r5 * r8
            r2.setMax = r5
            int r5 = r2.getMin
            int r5 = r5 + 1
            r2.getMin = r5
            long r5 = r4.setMax
            long r5 = r5 >>> r21
            r4.setMax = r5
            int r5 = r4.getMin
            int r5 = r5 + 1
            r4.getMin = r5
            int r5 = r4.getMin
            int r5 = -r5
            long r5 = r11 >>> r5
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r8
            int r6 = (int) r5
            int r6 = r6 + 48
            char r5 = (char) r6
            char[] r6 = r3.setMax
            int r10 = r3.setMin
            int r15 = r10 + 1
            r3.setMin = r15
            r6[r10] = r5
            long r5 = r4.setMax
            r15 = 1
            long r5 = r5 - r15
            long r11 = r11 & r5
            int r7 = r7 + -1
            long r5 = r2.setMax
            int r10 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c1
            int r5 = r3.setMin
            int r5 = r5 - r26
            int r5 = r5 + r7
            r3.length = r5
            o.validateStandard r0 = o.validateStandard.getMax(r0, r1)
            long r0 = r0.setMax
            long r5 = r0 * r13
            long r7 = r2.setMax
            long r9 = r4.setMax
            r0 = r25
            r1 = r5
            r3 = r7
            r5 = r11
            r7 = r9
            r9 = r13
            boolean r0 = setMin(r0, r1, r3, r5, r7, r9)
            return r0
        L_0x01c1:
            r5 = r13
            goto L_0x015d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ZimValidatePbGwRequestPB.getMax(o.validateStandard, o.validateStandard, o.validateStandard, o.BisMetaInfo, int):boolean");
    }

    private static boolean getMin(double d, BisMetaInfo bisMetaInfo) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        validateStandard min = ZimInitGwResponse.getMin(doubleToLongBits);
        validateStandard validatestandard = new validateStandard();
        validateStandard validatestandard2 = new validateStandard();
        ZimInitGwResponse.setMax(doubleToLongBits, validatestandard, validatestandard2);
        if (getMax || validatestandard2.getMin == min.getMin) {
            validateStandard validatestandard3 = new validateStandard();
            int min2 = ZimInitGwRequestPB.getMin(min.getMin + 64, validatestandard3);
            if (getMax || (-60 <= min.getMin + validatestandard3.getMin + 64 && -32 >= min.getMin + validatestandard3.getMin + 64)) {
                validateStandard length = validateStandard.length(min, validatestandard3);
                if (getMax || length.getMin == validatestandard2.getMin + validatestandard3.getMin + 64) {
                    return getMax(validateStandard.length(validatestandard, validatestandard3), length, validateStandard.length(validatestandard2, validatestandard3), bisMetaInfo, min2);
                }
                throw new AssertionError();
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    private static boolean length(double d, BisMetaInfo bisMetaInfo) {
        if (!getMax && d <= 0.0d) {
            throw new AssertionError();
        } else if (!getMax && Double.isNaN(d)) {
            throw new AssertionError();
        } else if (getMax || !Double.isInfinite(d)) {
            return getMin(d, bisMetaInfo);
        } else {
            throw new AssertionError();
        }
    }

    public static String getMin(double d) {
        BisMetaInfo bisMetaInfo = new BisMetaInfo();
        if (!setMin(d, bisMetaInfo)) {
            return null;
        }
        if (!bisMetaInfo.getMin) {
            char c = '-';
            int i = bisMetaInfo.setMax[0] == '-' ? 1 : 0;
            int i2 = bisMetaInfo.length - i;
            if (i2 < -5 || i2 > 21) {
                if (bisMetaInfo.setMin - i > 1) {
                    int i3 = i + 1;
                    char[] cArr = bisMetaInfo.setMax;
                    System.arraycopy(cArr, i3, cArr, i3 + 1, bisMetaInfo.setMin - i3);
                    bisMetaInfo.setMax[i3] = '.';
                    bisMetaInfo.setMin++;
                }
                char[] cArr2 = bisMetaInfo.setMax;
                int i4 = bisMetaInfo.setMin;
                bisMetaInfo.setMin = i4 + 1;
                cArr2[i4] = 'e';
                int i5 = i2 - 1;
                if (i5 < 0) {
                    i5 = -i5;
                } else {
                    c = '+';
                }
                char[] cArr3 = bisMetaInfo.setMax;
                int i6 = bisMetaInfo.setMin;
                bisMetaInfo.setMin = i6 + 1;
                cArr3[i6] = c;
                int i7 = i5 > 99 ? bisMetaInfo.setMin + 2 : i5 > 9 ? bisMetaInfo.setMin + 1 : bisMetaInfo.setMin;
                bisMetaInfo.setMin = i7 + 1;
                while (true) {
                    int i8 = i7 - 1;
                    bisMetaInfo.setMax[i7] = BisMetaInfo.getMax[i5 % 10];
                    i5 /= 10;
                    if (i5 == 0) {
                        break;
                    }
                    i7 = i8;
                }
            } else if (bisMetaInfo.length < bisMetaInfo.setMin) {
                if (i2 > 0) {
                    System.arraycopy(bisMetaInfo.setMax, bisMetaInfo.length, bisMetaInfo.setMax, bisMetaInfo.length + 1, bisMetaInfo.setMin - bisMetaInfo.length);
                    bisMetaInfo.setMax[bisMetaInfo.length] = '.';
                    bisMetaInfo.setMin++;
                } else {
                    int i9 = i + 2;
                    int i10 = i9 - i2;
                    char[] cArr4 = bisMetaInfo.setMax;
                    System.arraycopy(cArr4, i, cArr4, i10, bisMetaInfo.setMin - i);
                    bisMetaInfo.setMax[i] = '0';
                    bisMetaInfo.setMax[i + 1] = '.';
                    if (i2 < 0) {
                        Arrays.fill(bisMetaInfo.setMax, i9, i10, '0');
                    }
                    bisMetaInfo.setMin += 2 - i2;
                }
            } else if (bisMetaInfo.length > bisMetaInfo.setMin) {
                Arrays.fill(bisMetaInfo.setMax, bisMetaInfo.setMin, bisMetaInfo.length, '0');
                bisMetaInfo.setMin += bisMetaInfo.length - bisMetaInfo.setMin;
            }
            bisMetaInfo.getMin = true;
        }
        return new String(bisMetaInfo.setMax, 0, bisMetaInfo.setMin);
    }

    private static boolean setMin(BisMetaInfo bisMetaInfo, long j, long j2, long j3, long j4, long j5) {
        BisMetaInfo bisMetaInfo2 = bisMetaInfo;
        long j6 = j - j5;
        long j7 = j + j5;
        long j8 = j3;
        while (j8 < j6 && j2 - j8 >= j4) {
            long j9 = j8 + j4;
            if (j9 >= j6 && j6 - j8 < j9 - j6) {
                break;
            }
            char[] cArr = bisMetaInfo2.setMax;
            int i = bisMetaInfo2.setMin - 1;
            cArr[i] = (char) (cArr[i] - 1);
            j8 = j9;
        }
        if (j8 < j7 && j2 - j8 >= j4) {
            long j10 = j8 + j4;
            if (j10 < j7 || j7 - j8 > j10 - j7) {
                return false;
            }
        }
        return 2 * j5 <= j8 && j8 <= j2 - (4 * j5);
    }

    private static boolean setMin(double d, BisMetaInfo bisMetaInfo) {
        bisMetaInfo.setMin = 0;
        bisMetaInfo.getMin = false;
        if (d < 0.0d) {
            char[] cArr = bisMetaInfo.setMax;
            int i = bisMetaInfo.setMin;
            bisMetaInfo.setMin = i + 1;
            cArr[i] = '-';
            d = -d;
        }
        return length(d, bisMetaInfo);
    }
}
