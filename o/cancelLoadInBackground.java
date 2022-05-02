package o;

import com.google.common.base.Ascii;
import java.io.OutputStream;
import java.io.PrintStream;

public class cancelLoadInBackground extends isStarted {
    private static int getMax = 0;
    public static final int getMin = 86;
    private static int length = 1;
    private static byte[] setMax = {Ascii.GS, -115, 96, -60, -1, 48, -41, 40, 3, -47, 44, -49, 2, -1, -3, 1, 43, 1, -51, 48, -53, 0, -56, 67, -4, -14, 19, -73, Framer.STDERR_FRAME_PREFIX, Ascii.FF, -11, 13, -4, -7, -6, -55, 73, -9, -2, 3, -15, -2, -55, 41, -22, Ascii.ESC, -19, Ascii.ETB, Ascii.SO, -13, 6, -12, -29, 38, -1, -5, 0, -56, 67, -4, -14, 19, -73, Framer.STDERR_FRAME_PREFIX, Ascii.FF, -11, 13, -4, -7, -6, -55, 73, -9, -2, 3, -15, -2, -55, 41, Ascii.ETB, -2, 3, -15, -2, -35, 47, -10, -6, 2, -3, -1, 7, -3, 43, -50, 0, 0, 0, Framer.STDIN_FRAME_PREFIX, -40, -39, 8, -12, 17, -1, -46, 40, 2, -37, Ascii.DC2, Ascii.VT, -9};

    private static native long b(int i, int i2);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(byte r8, int r9, int r10) {
        /*
            int r8 = r8 + 4
            int r10 = 100 - r10
            int r9 = 36 - r9
            byte[] r0 = setMax
            byte[] r1 = new byte[r9]
            int r9 = r9 + -1
            r2 = 35
            if (r0 == 0) goto L_0x0013
            r3 = 35
            goto L_0x0015
        L_0x0013:
            r3 = 97
        L_0x0015:
            r4 = 0
            if (r3 == r2) goto L_0x001d
            r10 = r9
            r3 = r10
            r2 = 0
            r9 = r8
            goto L_0x0047
        L_0x001d:
            r2 = 0
        L_0x001e:
            int r8 = r8 + 1
            byte r3 = (byte) r10
            r1[r2] = r3
            if (r2 != r9) goto L_0x0035
            java.lang.String r8 = new java.lang.String
            r8.<init>(r1, r4)
            int r9 = getMax
            int r9 = r9 + 63
            int r10 = r9 % 128
            length = r10
            int r9 = r9 % 2
            return r8
        L_0x0035:
            int r2 = r2 + 1
            byte r3 = r0[r8]
            int r5 = length
            int r5 = r5 + 47
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % 2
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r7
        L_0x0047:
            int r8 = r8 + r3
            int r8 = r8 + 1
            r7 = r10
            r10 = r8
            r8 = r9
            r9 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancelLoadInBackground.getMin(byte, int, int):java.lang.String");
    }

    public static int getMin(int i) {
        int i2 = length;
        int i3 = ((i2 | 101) << 1) - (i2 ^ 101);
        getMax = i3 % 128;
        int i4 = i3 % 2;
        int length2 = length(i, 0);
        int i5 = getMax + 57;
        length = i5 % 128;
        int i6 = i5 % 2;
        return length2;
    }

    public static int length(int i) {
        int i2 = (getMax + 42) - 1;
        length = i2 % 128;
        int i3 = i2 % 2;
        int length2 = length(i, 1);
        int i4 = getMax;
        int i5 = (i4 ^ 31) + ((i4 & 31) << 1);
        length = i5 % 128;
        int i6 = i5 % 2;
        return length2;
    }

    private static synchronized int length(int i, int i2) {
        synchronized (cancelLoadInBackground.class) {
            int i3 = length;
            boolean z = true;
            int i4 = (i3 ^ 63) + ((i3 & 63) << 1);
            getMax = i4 % 128;
            int i5 = i4 % 2;
            byte b = (byte) setMax[21];
            if (!(!getMax(getMin((byte) (-setMax[18]), (byte) setMax[15], (byte) setMax[21]), getMin((byte) (getMin & 56), b, (byte) b)))) {
                int i6 = length + 17;
                getMax = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i ^ -1;
                if (((i & -2) | (i8 & 1)) != i) {
                    int i9 = getMax;
                    int i10 = ((i9 | 35) << 1) - (i9 ^ 35);
                    length = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = (i & -1) | (i8 & 0);
                        return i11;
                    }
                    int i12 = i ^ 1;
                    return i12;
                }
            }
            setMax setmax = new setMax((byte) 0);
            new RuntimeException().printStackTrace(new PrintStream(setmax));
            long max = setMax.getMax(setmax);
            if (!(max != 1078223722248L)) {
                int i13 = getMax + 43;
                length = i13 % 128;
                if ((i13 % 2 != 0 ? 'Y' : '5') != 'Y') {
                    if ((((int) max) | i) == i) {
                    }
                } else if ((((int) max) ^ i) == i) {
                }
                int i14 = length + 113;
                getMax = i14 % 128;
                if (i14 % 2 == 0) {
                    z = false;
                }
                if (z) {
                    int i15 = i | ((int) max);
                    return i15;
                }
                int i16 = (int) max;
                int i17 = (i | i16) & ((i & i16) ^ -1);
                return i17;
            }
            int currentTimeMillis = 343337308 ^ ((int) System.currentTimeMillis());
            long max2 = setMax(b(((i ^ -1) & currentTimeMillis) | ((currentTimeMillis ^ -1) & i), i2));
            int i18 = 1437226410 & ((int) (max2 >> 32));
            int i19 = -1437226411 & ((int) max2);
            int i20 = (i19 & i18) | (i18 ^ i19);
            int i21 = (i20 | currentTimeMillis) & ((i20 & currentTimeMillis) ^ -1);
            return i21;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r11 = length;
        r0 = ((r11 | 1) << 1) - (r11 ^ 1);
        getMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        continue;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004c */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:43:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMax(java.lang.String... r11) {
        /*
            int r0 = length
            int r0 = r0 + 39
            int r1 = r0 % 128
            getMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 30
            r3 = 61
            if (r0 != 0) goto L_0x0013
            r0 = 30
            goto L_0x0015
        L_0x0013:
            r0 = 61
        L_0x0015:
            r4 = 0
            r5 = 1
            if (r0 == r2) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2 = 17
            if (r0 < r1) goto L_0x0023
            r6 = 17
            goto L_0x0025
        L_0x0023:
            r6 = 68
        L_0x0025:
            if (r6 == r2) goto L_0x00fc
            int r2 = length
            r6 = r2 & 15
            r7 = 15
            r2 = r2 | r7
            int r6 = r6 + r2
            int r2 = r6 % 128
            getMax = r2
            int r6 = r6 % r1
            r2 = r11[r0]
            java.lang.Class<o.cancelLoadInBackground> r6 = o.cancelLoadInBackground.class
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x004c }
            java.lang.Class.forName(r2, r4, r6)     // Catch:{ Exception -> 0x004c }
            int r11 = length
            r0 = r11 | 1
            int r0 = r0 << r5
            r11 = r11 ^ r5
            int r0 = r0 - r11
            int r11 = r0 % 128
            getMax = r11
            int r0 = r0 % r1
            return r5
        L_0x004c:
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0054 }
            java.lang.Class.forName(r2, r4, r6)     // Catch:{ Exception -> 0x0054 }
            return r5
        L_0x0054:
            o.cancelLoadInBackground$setMin r6 = new o.cancelLoadInBackground$setMin
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()
            r6.<init>(r8)
            boolean r6 = r6.getMax(r2)
            if (r6 == 0) goto L_0x006e
            int r11 = length
            int r11 = r11 + 13
            int r0 = r11 % 128
            getMax = r0
            int r11 = r11 % r1
            return r5
        L_0x006e:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
            r8 = 28
            r9 = 16
            if (r6 < r8) goto L_0x0079
            r6 = 72
            goto L_0x007b
        L_0x0079:
            r6 = 16
        L_0x007b:
            if (r6 == r9) goto L_0x007e
            goto L_0x00f3
        L_0x007e:
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{  }
            int r8 = getMin     // Catch:{  }
            r8 = r8 & 56
            byte r8 = (byte) r8     // Catch:{  }
            byte[] r9 = setMax     // Catch:{  }
            r10 = 84
            byte r9 = r9[r10]     // Catch:{  }
            int r9 = -r9
            byte r9 = (byte) r9     // Catch:{  }
            int r10 = getMin     // Catch:{  }
            r10 = r10 & r3
            byte r10 = (byte) r10     // Catch:{  }
            java.lang.String r8 = getMin(r8, r9, r10)     // Catch:{  }
            boolean r6 = r6.equals(r8)     // Catch:{  }
            r8 = 5
            if (r6 == 0) goto L_0x009e
            r6 = 5
            goto L_0x009f
        L_0x009e:
            r6 = 2
        L_0x009f:
            if (r6 == r8) goto L_0x00f3
            int r6 = getMax
            r8 = r6 | 85
            int r8 = r8 << r5
            r6 = r6 ^ 85
            int r8 = r8 - r6
            int r6 = r8 % 128
            length = r6
            int r8 = r8 % r1
            java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
            byte[] r8 = setMax     // Catch:{  }
            byte r8 = r8[r1]     // Catch:{  }
            byte r8 = (byte) r8     // Catch:{  }
            int r9 = r8 >>> 2
            byte r9 = (byte) r9     // Catch:{  }
            byte[] r10 = setMax     // Catch:{  }
            byte r7 = r10[r7]     // Catch:{  }
            byte r7 = (byte) r7     // Catch:{  }
            java.lang.String r7 = getMin(r8, r9, r7)     // Catch:{  }
            r8 = 3
            java.lang.Class[] r9 = new java.lang.Class[r8]     // Catch:{  }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r4] = r10     // Catch:{  }
            java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{  }
            r9[r5] = r10     // Catch:{  }
            java.lang.Class<java.lang.ClassLoader> r10 = java.lang.ClassLoader.class
            r9[r1] = r10     // Catch:{  }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r9)     // Catch:{  }
            r6.setAccessible(r5)     // Catch:{  }
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            r8[r4] = r2     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            r8[r5] = r2     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            r8[r1] = r2     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            r6.invoke(r7, r8)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00f3, IllegalAccessException | NoSuchMethodException -> 0x00f3 }
            int r11 = getMax
            int r11 = r11 + 43
            int r0 = r11 % 128
            length = r0
            int r11 = r11 % r1
            return r5
        L_0x00f3:
            r2 = r0 | 1
            int r2 = r2 << r5
            r0 = r0 ^ 1
            int r0 = r2 - r0
            goto L_0x001c
        L_0x00fc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancelLoadInBackground.getMax(java.lang.String[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r3 != true) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r6 = java.math.BigInteger.valueOf(r6 & Long.MAX_VALUE).subtract(java.math.BigInteger.valueOf(Long.MIN_VALUE));
        r7 = length;
        r1 = ((r7 | 95) << 1) - (r7 ^ 95);
        getMax = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r3 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static long setMax(long r6) {
        /*
            int r0 = getMax
            r1 = r0 | 27
            r2 = 1
            int r1 = r1 << r2
            r0 = r0 ^ 27
            int r1 = r1 - r0
            int r0 = r1 % 128
            length = r0
            int r1 = r1 % 2
            r0 = 95
            if (r1 == 0) goto L_0x0016
            r1 = 18
            goto L_0x0018
        L_0x0016:
            r1 = 95
        L_0x0018:
            r3 = 0
            r4 = 0
            if (r1 == r0) goto L_0x0025
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0022
            r3 = 1
        L_0x0022:
            if (r3 == 0) goto L_0x003c
            goto L_0x002d
        L_0x0025:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r3 = 1
        L_0x002b:
            if (r3 == r2) goto L_0x003c
        L_0x002d:
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
            int r7 = getMax
            int r7 = r7 + 113
            int r0 = r7 % 128
            length = r0
            int r7 = r7 % 2
            goto L_0x005d
        L_0x003c:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r6 = r6 & r3
            java.math.BigInteger r6 = java.math.BigInteger.valueOf(r6)
            r3 = -9223372036854775808
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r3)
            java.math.BigInteger r6 = r6.subtract(r7)
            int r7 = length
            r1 = r7 | 95
            int r1 = r1 << r2
            r7 = r7 ^ r0
            int r1 = r1 - r7
            int r7 = r1 % 128
            getMax = r7
            int r1 = r1 % 2
        L_0x005d:
            java.math.BigInteger r7 = new java.math.BigInteger
            int r0 = getMin
            r1 = r0 | -1
            int r1 = r1 << r2
            r0 = r0 ^ -1
            int r1 = r1 - r0
            byte r0 = (byte) r1
            byte[] r1 = setMax
            r3 = 45
            byte r1 = r1[r3]
            r3 = r1 ^ -1
            r1 = r1 & -1
            int r1 = r1 << r2
            int r3 = r3 + r1
            byte r1 = (byte) r3
            int r2 = r1 << 1
            byte r2 = (byte) r2
            java.lang.String r0 = getMin(r0, r1, r2)
            r1 = 16
            r7.<init>(r0, r1)
            java.math.BigInteger r0 = new java.math.BigInteger
            byte[] r2 = setMax
            r3 = 4
            byte r3 = r2[r3]
            byte r3 = (byte) r3
            r4 = 109(0x6d, float:1.53E-43)
            byte r2 = r2[r4]
            byte r2 = (byte) r2
            r4 = 52
            java.lang.String r2 = getMin(r3, r2, r4)
            r0.<init>(r2, r1)
            java.math.BigInteger r6 = r6.modPow(r7, r0)
            long r6 = r6.longValue()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.cancelLoadInBackground.setMax(long):long");
    }

    static int getMax(long j) {
        int i = getMax;
        int i2 = (i & 107) + (i | 107);
        length = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 1437226410 & ((int) (j >> 32));
        int i5 = -1437226411 & ((int) j);
        int i6 = (i5 & i4) | (i4 ^ i5);
        int i7 = length;
        int i8 = (i7 ^ 3) + ((i7 & 3) << 1);
        getMax = i8 % 128;
        int i9 = i8 % 2;
        return i6;
    }

    static class setMax extends OutputStream {
        private static int getMin = 0;
        private static int length = 1;
        private long getMax;

        private setMax() {
        }

        /* synthetic */ setMax(byte b) {
            this();
        }

        static /* synthetic */ long getMax(setMax setmax) {
            int i = length;
            int i2 = (i ^ 5) + ((i & 5) << 1);
            getMin = i2 % 128;
            int i3 = i2 % 2;
            long j = setmax.getMax;
            int i4 = length + 109;
            getMin = i4 % 128;
            int i5 = i4 % 2;
            return j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
            if ((r5 == 1078223722248L) != true) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
            if ((r5 == 1078223722248L) != true) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void write(int r8) throws java.io.IOException {
            /*
                r7 = this;
                int r0 = getMin
                int r0 = r0 + 11
                int r1 = r0 % 128
                length = r1
                int r0 = r0 % 2
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0010
                r0 = 1
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                r3 = 1078223722248(0xfb0b245708, double:5.32713299694E-312)
                long r5 = r7.getMax
                if (r0 == 0) goto L_0x0024
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x0020
                r0 = 1
                goto L_0x0021
            L_0x0020:
                r0 = 0
            L_0x0021:
                if (r0 == r2) goto L_0x0058
                goto L_0x002d
            L_0x0024:
                int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r0 != 0) goto L_0x002a
                r0 = 1
                goto L_0x002b
            L_0x002a:
                r0 = 0
            L_0x002b:
                if (r0 == r2) goto L_0x0058
            L_0x002d:
                int r0 = getMin
                r3 = r0 | 87
                int r3 = r3 << r2
                r0 = r0 ^ 87
                int r3 = r3 - r0
                int r0 = r3 % 128
                length = r0
                int r3 = r3 % 2
                if (r3 == 0) goto L_0x003f
                r0 = 1
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                r3 = 1099511627775(0xffffffffff, double:5.432309224866E-312)
                if (r0 == r2) goto L_0x0051
                long r5 = r7.getMax
                long r0 = r5 >> r1
                long r5 = (long) r8
                long r0 = r0 ^ r5
                long r0 = r0 % r3
            L_0x004e:
                r7.getMax = r0
                goto L_0x0058
            L_0x0051:
                long r0 = r7.getMax
                long r0 = r0 << r2
                long r5 = (long) r8
                long r0 = r0 ^ r5
                long r0 = r0 & r3
                goto L_0x004e
            L_0x0058:
                int r8 = getMin
                int r8 = r8 + 89
                int r0 = r8 % 128
                length = r0
                int r8 = r8 % 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cancelLoadInBackground.setMax.write(int):void");
        }
    }

    static class setMin extends ClassLoader {
        private static int getMax = 0;
        private static int length = 1;
        public static final int setMax = 193;
        private static byte[] setMin = {8, -67, Ascii.NAK, -115, -1, 1, -14, -28, Ascii.US, -18, -1, -3, -5, -37, 37, -15, Ascii.SO, -4};
        private final ClassLoader getMin;

        setMin(ClassLoader classLoader) {
            super(classLoader);
            this.getMin = classLoader;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e5, code lost:
            return false;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:? A[ExcHandler: IllegalAccessException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:18:0x0098] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean getMax(java.lang.String r14) {
            /*
                r13 = this;
                int r0 = length
                r1 = r0 | 59
                r2 = 1
                int r1 = r1 << r2
                r0 = r0 ^ 59
                int r1 = r1 - r0
                int r0 = r1 % 128
                getMax = r0
                int r1 = r1 % 2
                r0 = 0
                java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
                byte[] r3 = setMin     // Catch:{  }
                r4 = 5
                byte r3 = r3[r4]     // Catch:{  }
                int r3 = r3 - r0
                int r3 = r3 - r2
                byte r3 = (byte) r3     // Catch:{  }
                byte r4 = (byte) r3     // Catch:{  }
                byte r5 = (byte) r4     // Catch:{  }
                int r3 = r3 * 3
                int r3 = r3 + 114
                int r3 = r3 - r2
                r6 = r3 ^ -98
                r3 = r3 & -98
                int r3 = r3 << r2
                int r6 = r6 + r3
                int r5 = r5 * 4
                r3 = r5 & 11
                r5 = r5 | 11
                int r3 = r3 + r5
                int r3 = r3 + 92
                int r3 = r3 - r2
                int r4 = r4 * 3
                int r4 = -r4
                r5 = r4 ^ 3
                r4 = r4 & 3
                int r4 = r4 << r2
                int r5 = r5 + r4
                byte[] r4 = setMin     // Catch:{  }
                byte[] r7 = new byte[r6]     // Catch:{  }
                int r6 = r6 + -1
                if (r4 == 0) goto L_0x0044
                r8 = 1
                goto L_0x0045
            L_0x0044:
                r8 = 0
            L_0x0045:
                if (r8 == r2) goto L_0x0069
                int r3 = length
                r8 = r3 | 65
                int r8 = r8 << r2
                r3 = r3 ^ 65
                int r8 = r8 - r3
                int r3 = r8 % 128
                getMax = r3
                int r8 = r8 % 2
                int r3 = length
                r8 = r3 ^ 67
                r3 = r3 & 67
                int r3 = r3 << r2
                int r8 = r8 + r3
                int r3 = r8 % 128
                getMax = r3
                int r8 = r8 % 2
                r9 = r13
                r10 = r5
                r3 = r6
                r8 = 0
                goto L_0x00d6
            L_0x0069:
                r9 = r13
                r8 = 0
            L_0x006b:
                byte r10 = (byte) r3
                r7[r8] = r10     // Catch:{  }
                r10 = r5 & 53
                r5 = r5 | 53
                int r10 = r10 + r5
                int r10 = r10 + -51
                int r10 = r10 - r2
                if (r8 != r6) goto L_0x00c6
                java.lang.String r3 = new java.lang.String     // Catch:{  }
                r3.<init>(r7, r0)     // Catch:{  }
                int r4 = getMax
                r5 = r4 | 9
                int r5 = r5 << r2
                r4 = r4 ^ 9
                int r5 = r5 - r4
                int r4 = r5 % 128
                length = r4
                int r5 = r5 % 2
                java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{  }
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r4[r0] = r5     // Catch:{  }
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch:{  }
                r1.setAccessible(r2)     // Catch:{  }
                java.lang.ClassLoader r3 = r9.getMin     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00e5, IllegalAccessException | NoSuchMethodException -> 0x00e5 }
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00e5, IllegalAccessException | NoSuchMethodException -> 0x00e5 }
                r4[r0] = r14     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00e5, IllegalAccessException | NoSuchMethodException -> 0x00e5 }
                java.lang.Object r14 = r1.invoke(r3, r4)     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00e5, IllegalAccessException | NoSuchMethodException -> 0x00e5 }
                java.lang.Class r14 = (java.lang.Class) r14     // Catch:{ IllegalAccessException | NoSuchMethodException -> 0x00e5, IllegalAccessException | NoSuchMethodException -> 0x00e5 }
                if (r14 != 0) goto L_0x00a8
                r14 = 1
                goto L_0x00a9
            L_0x00a8:
                r14 = 0
            L_0x00a9:
                if (r14 == 0) goto L_0x00ac
                return r0
            L_0x00ac:
                int r14 = getMax
                r1 = r14 & 93
                r14 = r14 | 93
                int r1 = r1 + r14
                int r14 = r1 % 128
                length = r14
                int r1 = r1 % 2
                r14 = 28
                if (r1 == 0) goto L_0x00c0
                r1 = 28
                goto L_0x00c2
            L_0x00c0:
                r1 = 85
            L_0x00c2:
                if (r1 == r14) goto L_0x00c5
                return r0
            L_0x00c5:
                return r2
            L_0x00c6:
                r5 = r8 & 120(0x78, float:1.68E-43)
                r8 = r8 | 120(0x78, float:1.68E-43)
                int r5 = r5 + r8
                r8 = r5 & -119(0xffffffffffffff89, float:NaN)
                r5 = r5 | -119(0xffffffffffffff89, float:NaN)
                int r8 = r8 + r5
                byte r5 = r4[r10]     // Catch:{  }
                r12 = r5
                r5 = r3
                r3 = r6
                r6 = r12
            L_0x00d6:
                int r6 = -r6
                int r6 = -r6
                r11 = r5 & r6
                r5 = r5 | r6
                int r11 = r11 + r5
                r5 = r11 & 4
                r6 = r11 | 4
                int r5 = r5 + r6
                r6 = r3
                r3 = r5
                r5 = r10
                goto L_0x006b
            L_0x00e5:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.cancelLoadInBackground.setMin.getMax(java.lang.String):boolean");
        }
    }
}
