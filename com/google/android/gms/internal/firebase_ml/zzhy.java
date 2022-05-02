package com.google.android.gms.internal.firebase_ml;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.nio.charset.Charset;

public final class zzhy {
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset UTF_8 = Charset.forName(length(new char[]{1, 2, 0, 5, 147}, 4 - TextUtils.indexOf("", '0'), (byte) (91 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
    private static int getMax = 0;
    private static int getMin = 1;
    private static char[] length;
    private static char setMax;

    static {
        setMin();
        int i = getMin + 33;
        getMax = i % 128;
        if (i % 2 != 0) {
            int i2 = 13 / 0;
        }
    }

    static void setMin() {
        setMax = 3;
        length = new char[]{'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (r6 == r7) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if ((r6 != r7) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r2[r5] = (char) (r6 - r14);
        r2[r5 + 1] = (char) (r7 - r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(char[] r12, int r13, byte r14) {
        /*
            int r0 = getMax
            int r0 = r0 + 47
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            char[] r0 = length
            char r1 = setMax
            char[] r2 = new char[r13]
            int r3 = r13 % 2
            if (r3 == 0) goto L_0x001c
            int r13 = r13 + -1
            char r3 = r12[r13]
            int r3 = r3 - r14
            char r3 = (char) r3
            r2[r13] = r3
        L_0x001c:
            r3 = 1
            if (r13 <= r3) goto L_0x00d3
            r4 = 0
            r5 = 0
        L_0x0021:
            if (r5 >= r13) goto L_0x00d3
            int r6 = getMax
            int r6 = r6 + 111
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0039
            char r6 = r12[r5]
            int r7 = r5 >>> 0
            char r7 = r12[r7]
            if (r6 != r7) goto L_0x0046
            goto L_0x00c5
        L_0x0039:
            char r6 = r12[r5]
            int r7 = r5 + 1
            char r7 = r12[r7]
            if (r6 != r7) goto L_0x0043
            r8 = 0
            goto L_0x0044
        L_0x0043:
            r8 = 1
        L_0x0044:
            if (r8 == 0) goto L_0x00c5
        L_0x0046:
            int r8 = o.onActivityPreStopped.setMin(r6, r1)
            int r6 = o.onActivityPreStopped.length(r6, r1)
            int r9 = o.onActivityPreStopped.setMin(r7, r1)
            int r7 = o.onActivityPreStopped.length(r7, r1)
            if (r6 != r7) goto L_0x007f
            int r8 = o.onActivityPreStopped.setMax(r8, r1)
            int r9 = o.onActivityPreStopped.setMax(r9, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            int r6 = r5 + 1
            char r7 = r0[r7]
            r2[r6] = r7
            int r6 = getMax     // Catch:{ Exception -> 0x007d }
            int r6 = r6 + 101
            int r7 = r6 % 128
            getMin = r7     // Catch:{ Exception -> 0x007d }
            int r6 = r6 % 2
            goto L_0x00cf
        L_0x007d:
            r12 = move-exception
            goto L_0x00c4
        L_0x007f:
            r10 = 37
            if (r8 != r9) goto L_0x0086
            r11 = 37
            goto L_0x0088
        L_0x0086:
            r11 = 93
        L_0x0088:
            if (r11 == r10) goto L_0x009d
            int r7 = o.onActivityPreStopped.getMax(r8, r7, r1)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)
            char r7 = r0[r7]
            r2[r5] = r7
            int r7 = r5 + 1
            char r6 = r0[r6]
            r2[r7] = r6
            goto L_0x00cf
        L_0x009d:
            int r10 = getMax     // Catch:{ Exception -> 0x007d }
            int r10 = r10 + 103
            int r11 = r10 % 128
            getMin = r11     // Catch:{ Exception -> 0x00c2 }
            int r10 = r10 % 2
            int r6 = o.onActivityPreStopped.setMax(r6, r1)
            int r7 = o.onActivityPreStopped.setMax(r7, r1)
            int r6 = o.onActivityPreStopped.getMax(r8, r6, r1)
            int r7 = o.onActivityPreStopped.getMax(r9, r7, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            int r6 = r5 + 1
            char r7 = r0[r7]
            r2[r6] = r7
            goto L_0x00cf
        L_0x00c2:
            r12 = move-exception
            throw r12
        L_0x00c4:
            throw r12
        L_0x00c5:
            int r6 = r6 - r14
            char r6 = (char) r6
            r2[r5] = r6
            int r6 = r5 + 1
            int r7 = r7 - r14
            char r7 = (char) r7
            r2[r6] = r7
        L_0x00cf:
            int r5 = r5 + 2
            goto L_0x0021
        L_0x00d3:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzhy.length(char[], int, byte):java.lang.String");
    }
}
