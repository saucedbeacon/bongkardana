package o;

final class onRequestChildRectangleOnScreen {
    private static short[] IsOverlapping = null;
    private static int getMax = 0;
    private static String getMin = null;
    private static int length = 0;
    private static byte[] setMax = null;
    private static int setMin = 0;
    private static int toFloatRange = 1;
    private static int toIntRange;

    static void getMax() {
        setMin = 759389024;
        length = 84048734;
        setMax = new byte[]{-32, -68, -57, -44, 0};
        getMax = 29;
    }

    onRequestChildRectangleOnScreen() {
    }

    static int getMin() {
        int i = toFloatRange + 27;
        toIntRange = i % 128;
        return i % 2 == 0 ? getMin(setMin(), 0, 8089) : getMin(setMin(), 1, 14186);
    }

    static int setMax() {
        try {
            int i = toIntRange + 61;
            toFloatRange = i % 128;
            boolean z = true;
            int min = i % 2 == 0 ? getMin(setMin(), 0, 16538) : getMin(setMin(), 1, 8088);
            int i2 = toIntRange + 49;
            toFloatRange = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            }
            if (z) {
                return min;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return min;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if ((r6 != null) != true) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0028, code lost:
        if ((r6 != null ? (char) 25 : 7) != 7) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003b, code lost:
        if (r6.isEmpty() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0044, code lost:
        if (r6.isEmpty() == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getMin(java.lang.String r6, int r7, int r8) {
        /*
            int r0 = toFloatRange     // Catch:{ Exception -> 0x0084 }
            int r0 = r0 + 55
            int r1 = r0 % 128
            toIntRange = r1     // Catch:{ Exception -> 0x0084 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            r4 = 7
            if (r0 == 0) goto L_0x0022
            super.hashCode()     // Catch:{ all -> 0x0020 }
            if (r6 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == r2) goto L_0x002a
            goto L_0x0079
        L_0x0020:
            r6 = move-exception
            throw r6
        L_0x0022:
            if (r6 == 0) goto L_0x0027
            r0 = 25
            goto L_0x0028
        L_0x0027:
            r0 = 7
        L_0x0028:
            if (r0 == r4) goto L_0x0079
        L_0x002a:
            int r0 = toFloatRange     // Catch:{ Exception -> 0x0084 }
            int r0 = r0 + 93
            int r5 = r0 % 128
            toIntRange = r5     // Catch:{ Exception -> 0x0077 }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0040
            boolean r0 = r6.isEmpty()
            int r4 = r4 / r1
            if (r0 != 0) goto L_0x0079
            goto L_0x0046
        L_0x003e:
            r6 = move-exception
            throw r6
        L_0x0040:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0079
        L_0x0046:
            java.lang.String r0 = ","
            java.lang.String[] r6 = r6.split(r0)     // Catch:{ NumberFormatException -> 0x0079 }
            int r0 = r6.length     // Catch:{ NumberFormatException -> 0x0079 }
            if (r0 <= r7) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            if (r0 == 0) goto L_0x0079
            int r0 = toIntRange
            int r0 = r0 + 91
            int r4 = r0 % 128
            toFloatRange = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = 1
        L_0x0062:
            if (r1 == r2) goto L_0x0070
            r6 = r6[r7]     // Catch:{ NumberFormatException -> 0x0079 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0079 }
            super.hashCode()     // Catch:{ all -> 0x006e }
            return r6
        L_0x006e:
            r6 = move-exception
            throw r6
        L_0x0070:
            r6 = r6[r7]     // Catch:{ NumberFormatException -> 0x0079 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0079 }
            return r6
        L_0x0077:
            r6 = move-exception
            throw r6
        L_0x0079:
            int r6 = toFloatRange
            int r6 = r6 + 47
            int r7 = r6 % 128
            toIntRange = r7
            int r6 = r6 % 2
            return r8
        L_0x0084:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestChildRectangleOnScreen.getMin(java.lang.String, int, int):int");
    }

    static {
        getMax();
        try {
            int i = toFloatRange + 61;
            try {
                toIntRange = i % 128;
                int i2 = i % 2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[SYNTHETIC, Splitter:B:53:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ba A[SYNTHETIC, Splitter:B:59:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c6 A[SYNTHETIC, Splitter:B:67:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cd A[SYNTHETIC, Splitter:B:71:0x00cd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String setMin() {
        /*
            java.lang.Class<o.onRequestChildRectangleOnScreen> r0 = o.onRequestChildRectangleOnScreen.class
            monitor-enter(r0)
            int r1 = toFloatRange     // Catch:{ Exception -> 0x00d5 }
            int r1 = r1 + 17
            int r2 = r1 % 128
            toIntRange = r2     // Catch:{ Exception -> 0x00d1 }
            int r1 = r1 % 2
            java.lang.String r1 = getMin     // Catch:{ all -> 0x00d3 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0015
            r1 = 0
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            if (r1 == r2) goto L_0x001c
            java.lang.String r1 = getMin     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x00a8, all -> 0x00a3 }
            java.lang.String r5 = "/system/bin/getprop"
            java.lang.String r6 = "flipper.ports"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ IOException -> 0x00a8, all -> 0x00a3 }
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ IOException -> 0x00a8, all -> 0x00a3 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x00a9 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x00a9 }
            java.io.InputStream r7 = r4.getInputStream()     // Catch:{ IOException -> 0x00a9 }
            int r8 = android.os.Process.getThreadPriority(r3)     // Catch:{ IOException -> 0x00a9 }
            int r8 = r8 + 20
            int r8 = r8 >> 6
            int r8 = r8 + -24
            int r9 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch:{ IOException -> 0x00a9 }
            int r9 = r9 >> 16
            byte r9 = (byte) r9     // Catch:{ IOException -> 0x00a9 }
            r10 = -84048738(0xfffffffffafd849e, float:-6.5817045E35)
            r11 = 48
            int r11 = android.text.AndroidCharacter.getEastAsianWidth(r11)     // Catch:{ IOException -> 0x00a9 }
            int r11 = r11 + r10
            r10 = -759388939(0xffffffffd2bca4f5, float:-4.05110686E11)
            int r12 = android.view.View.combineMeasuredStates(r3, r3)     // Catch:{ IOException -> 0x00a9 }
            int r10 = r10 - r12
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            int r12 = android.text.TextUtils.indexOf(r12, r13, r3)     // Catch:{ IOException -> 0x00a9 }
            int r12 = 43 - r12
            short r12 = (short) r12     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r8 = setMax(r8, r9, r11, r10, r12)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r8 = r8.intern()     // Catch:{ IOException -> 0x00a9 }
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)     // Catch:{ IOException -> 0x00a9 }
            r6.<init>(r7, r8)     // Catch:{ IOException -> 0x00a9 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x00a9 }
            java.lang.String r1 = ""
        L_0x0077:
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x00a1, all -> 0x009f }
            r7 = 63
            if (r6 == 0) goto L_0x0082
            r8 = 63
            goto L_0x0084
        L_0x0082:
            r8 = 77
        L_0x0084:
            if (r8 == r7) goto L_0x0093
            getMin = r1     // Catch:{ IOException -> 0x00a1, all -> 0x009f }
            r5.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x008d
        L_0x008c:
        L_0x008d:
            if (r4 == 0) goto L_0x00bd
            r4.destroy()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00bd
        L_0x0093:
            int r1 = toFloatRange     // Catch:{ all -> 0x00d3 }
            int r1 = r1 + 61
            int r7 = r1 % 128
            toIntRange = r7     // Catch:{ all -> 0x00d3 }
            int r1 = r1 % 2
            r1 = r6
            goto L_0x0077
        L_0x009f:
            r1 = move-exception
            goto L_0x00c4
        L_0x00a1:
            r1 = r5
            goto L_0x00a9
        L_0x00a3:
            r2 = move-exception
            r4 = r1
            r5 = r4
        L_0x00a6:
            r1 = r2
            goto L_0x00c4
        L_0x00a8:
            r4 = r1
        L_0x00a9:
            java.lang.String r5 = ""
            getMin = r5     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x00b4
            r1.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x00b4
        L_0x00b3:
        L_0x00b4:
            if (r4 == 0) goto L_0x00b7
            r3 = 1
        L_0x00b7:
            if (r3 == r2) goto L_0x00ba
            goto L_0x00bd
        L_0x00ba:
            r4.destroy()     // Catch:{ all -> 0x00d3 }
        L_0x00bd:
            java.lang.String r1 = getMin     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            return r1
        L_0x00c1:
            r2 = move-exception
            r5 = r1
            goto L_0x00a6
        L_0x00c4:
            if (r5 == 0) goto L_0x00cb
            r5.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
        L_0x00cb:
            if (r4 == 0) goto L_0x00d0
            r4.destroy()     // Catch:{ all -> 0x00d3 }
        L_0x00d0:
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r1 = move-exception
            goto L_0x00d7
        L_0x00d5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d7:
            monitor-exit(r0)
            goto L_0x00da
        L_0x00d9:
            throw r1
        L_0x00da:
            goto L_0x00d9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestChildRectangleOnScreen.setMin():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r1 != false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if ((r1 ? '+' : kotlin.text.Typography.greater) != '>') goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, int r8, int r9, short r10) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = getMax
            int r6 = r6 + r1
            r1 = -1
            r2 = 0
            r3 = 1
            if (r6 != r1) goto L_0x000f
            r1 = 1
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            if (r1 == 0) goto L_0x0014
            r4 = 1
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            if (r4 == r3) goto L_0x0018
            goto L_0x0042
        L_0x0018:
            byte[] r6 = setMax     // Catch:{ Exception -> 0x00be }
            if (r6 == 0) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            if (r6 == r3) goto L_0x002d
            short[] r6 = IsOverlapping
            int r4 = length
            int r4 = r4 + r8
            short r6 = r6[r4]
            int r4 = getMax
            int r6 = r6 + r4
            short r6 = (short) r6
            goto L_0x0042
        L_0x002d:
            int r6 = toFloatRange
            int r6 = r6 + 41
            int r4 = r6 % 128
            toIntRange = r4
            int r6 = r6 % 2
            byte[] r6 = setMax
            int r4 = length
            int r4 = r4 + r8
            byte r6 = r6[r4]
            int r4 = getMax
            int r6 = r6 + r4
            byte r6 = (byte) r6
        L_0x0042:
            if (r6 <= 0) goto L_0x00b7
            int r4 = toFloatRange
            int r4 = r4 + 71
            int r5 = r4 % 128
            toIntRange = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x005a
            int r8 = r8 * r6
            int r8 = r8 >>> 4
            int r4 = length
            int r8 = r8 / r4
            if (r1 == 0) goto L_0x006c
            goto L_0x006b
        L_0x005a:
            int r8 = r8 + r6
            int r8 = r8 + -2
            int r4 = length
            int r8 = r8 + r4
            r4 = 62
            if (r1 == 0) goto L_0x0067
            r1 = 43
            goto L_0x0069
        L_0x0067:
            r1 = 62
        L_0x0069:
            if (r1 == r4) goto L_0x006c
        L_0x006b:
            r2 = 1
        L_0x006c:
            int r8 = r8 + r2
            int r1 = setMin
            int r9 = r9 + r1
            char r9 = (char) r9
            r0.append(r9)
        L_0x0074:
            if (r3 >= r6) goto L_0x00b7
            int r1 = toFloatRange
            int r1 = r1 + 29
            int r2 = r1 % 128
            toIntRange = r2
            int r1 = r1 % 2
            byte[] r1 = setMax     // Catch:{ Exception -> 0x00be }
            if (r1 == 0) goto L_0x00a4
            int r1 = toFloatRange
            int r1 = r1 + 41
            int r2 = r1 % 128
            toIntRange = r2
            int r1 = r1 % 2
            byte[] r1 = setMax     // Catch:{ Exception -> 0x00be }
            int r2 = r8 + -1
            byte r8 = r1[r8]
            int r8 = r8 + r10
            byte r8 = (byte) r8
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
            int r9 = toFloatRange
            int r9 = r9 + 95
            int r1 = r9 % 128
            toIntRange = r1
            int r9 = r9 % 2
            goto L_0x00af
        L_0x00a4:
            short[] r1 = IsOverlapping
            int r2 = r8 + -1
            short r8 = r1[r8]
            int r8 = r8 + r10
            short r8 = (short) r8
            r8 = r8 ^ r7
            int r9 = r9 + r8
            char r8 = (char) r9
        L_0x00af:
            r9 = r8
            r8 = r2
            r0.append(r9)     // Catch:{ Exception -> 0x00be }
            int r3 = r3 + 1
            goto L_0x0074
        L_0x00b7:
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x00bc }
            return r6
        L_0x00bc:
            r6 = move-exception
            throw r6
        L_0x00be:
            r6 = move-exception
            goto L_0x00c1
        L_0x00c0:
            throw r6
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onRequestChildRectangleOnScreen.setMax(int, byte, int, int, short):java.lang.String");
    }
}
