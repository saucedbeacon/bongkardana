package o;

import android.graphics.Color;
import java.nio.charset.Charset;
import kotlin.UShort;
import kotlin.text.Typography;

public final class MonitorModel {
    public static final Charset getMax = Charset.forName(getMin(new byte[]{-123, -124, -125, -126, -127}, -16777089 - Color.rgb(0, 0, 0), (int[]) null, (char[]) null).intern());
    private static int getMin = 0;
    private static boolean length = false;
    private static char[] setMax = null;
    private static boolean setMin = false;
    private static int toFloatRange = 1;
    private static int toIntRange;

    static void getMax() {
        getMin = 207;
        length = true;
        setMin = true;
        setMax = new char[]{292, 291, 277, 252, 263};
    }

    static {
        getMax();
        int i = toFloatRange + 79;
        toIntRange = i % 128;
        if (i % 2 != 0) {
            int i2 = 19 / 0;
        }
    }

    public static void getMax(long j, long j2, long j3) {
        int i = toFloatRange + 89;
        toIntRange = i % 128;
        int i2 = i % 2;
        if (!((j2 | j3) < 0)) {
            if (!(j2 > j)) {
                int i3 = toFloatRange + 93;
                toIntRange = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    if (j % j2 >= j3) {
                        return;
                    }
                } else if (j - j2 >= j3) {
                    return;
                }
            }
        }
        throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
    }

    public static short length(short s) {
        int i = toFloatRange + 31;
        toIntRange = i % 128;
        int i2 = i % 2;
        short s2 = s & UShort.MAX_VALUE;
        short s3 = (short) (((s2 & 255) << 8) | ((65280 & s2) >>> 8));
        int i3 = toIntRange + 105;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        return s3;
    }

    public static int getMax(int i) {
        int i2;
        int i3;
        int i4 = toIntRange + 25;
        toFloatRange = i4 % 128;
        if (i4 % 2 != 0) {
            i3 = ((i & -16777216) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
            i2 = (i & 255) << 24;
        } else {
            i3 = (((i | -16777216) << 29) ^ ((16711680 & i) >>> 90)) | ((65280 ^ i) << 125);
            i2 = (i | 5359) >>> 3;
        }
        return i2 | i3;
    }

    public static long getMax(long j) {
        int i = toIntRange + 5;
        toFloatRange = i % 128;
        int i2 = i % 2;
        long j2 = ((j & 255) << 56) | ((-72057594037927936L & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
        int i3 = toIntRange + 61;
        toFloatRange = i3 % 128;
        if (i3 % 2 != 0) {
            return j2;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return j2;
    }

    public static void length(Throwable th) {
        int i = toIntRange + 117;
        toFloatRange = i % 128;
        int i2 = i % 2;
        throw th;
    }

    public static boolean getMin(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = toIntRange + 59;
        toFloatRange = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if ((i6 < i3 ? 17 : Typography.amp) == '&') {
                return true;
            }
            int i7 = toFloatRange + 63;
            toIntRange = i7 % 128;
            int i8 = i7 % 2;
            if (bArr[i6 + i] != bArr2[i6 + i2]) {
                int i9 = toIntRange + 57;
                toFloatRange = i9 % 128;
                if ((i9 % 2 == 0 ? ' ' : '.') != ' ') {
                    return false;
                }
                Object obj = null;
                super.hashCode();
                return false;
            }
            i6++;
            try {
                int i10 = toFloatRange + 63;
                toIntRange = i10 % 128;
                int i11 = i10 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (setMin != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (length == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r6 = toFloatRange + 57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        toIntRange = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
        if ((r6 % 2) == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0067, code lost:
        r6 = r9.length;
        r8 = new char[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006a, code lost:
        if (r1 >= r6) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
        r8[r1] = (char) (r0[r9[(r6 - 1) - r1] - r7] - r3);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return new java.lang.String(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        r6 = r8.length;
        r9 = new char[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        if (r1 >= r6) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        r2 = toIntRange + 83;
        toFloatRange = r2 % 128;
        r2 = r2 % 2;
        r9[r1] = (char) (r0[r8[(r6 - 1) - r1] - r7] - r3);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a6, code lost:
        return new java.lang.String(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (setMin != false) goto L_0x0029;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0054=Splitter:B:26:0x0054, B:13:0x0029=Splitter:B:13:0x0029} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(byte[] r6, int r7, int[] r8, char[] r9) {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 125
            int r1 = r0 % 128
            toIntRange = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x0021
            char[] r0 = setMax
            int r3 = getMin
            boolean r4 = setMin
            r5 = 97
            int r5 = r5 / r1
            if (r4 == 0) goto L_0x0054
            goto L_0x0029
        L_0x001f:
            r6 = move-exception
            throw r6
        L_0x0021:
            char[] r0 = setMax
            int r3 = getMin
            boolean r4 = setMin
            if (r4 == 0) goto L_0x0054
        L_0x0029:
            int r8 = toIntRange     // Catch:{ Exception -> 0x00a7 }
            int r8 = r8 + 23
            int r9 = r8 % 128
            toFloatRange = r9     // Catch:{ Exception -> 0x00a7 }
            int r8 = r8 % 2
            if (r8 != 0) goto L_0x003a
            int r8 = r6.length
            char[] r9 = new char[r8]
            r1 = 1
            goto L_0x003d
        L_0x003a:
            int r8 = r6.length
            char[] r9 = new char[r8]
        L_0x003d:
            if (r1 >= r8) goto L_0x004e
            int r2 = r8 + -1
            int r2 = r2 - r1
            byte r2 = r6[r2]
            int r2 = r2 + r7
            char r2 = r0[r2]
            int r2 = r2 - r3
            char r2 = (char) r2
            r9[r1] = r2
            int r1 = r1 + 1
            goto L_0x003d
        L_0x004e:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r9)
            return r6
        L_0x0054:
            boolean r6 = length     // Catch:{ Exception -> 0x00a7 }
            if (r6 == 0) goto L_0x0083
            int r6 = toFloatRange     // Catch:{ Exception -> 0x0081 }
            int r6 = r6 + 57
            int r8 = r6 % 128
            toIntRange = r8     // Catch:{ Exception -> 0x0081 }
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0066
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            int r6 = r9.length
            char[] r8 = new char[r6]
        L_0x006a:
            if (r1 >= r6) goto L_0x007b
            int r2 = r6 + -1
            int r2 = r2 - r1
            char r2 = r9[r2]
            int r2 = r2 - r7
            char r2 = r0[r2]
            int r2 = r2 - r3
            char r2 = (char) r2
            r8[r1] = r2
            int r1 = r1 + 1
            goto L_0x006a
        L_0x007b:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
            return r6
        L_0x0081:
            r6 = move-exception
            throw r6
        L_0x0083:
            int r6 = r8.length
            char[] r9 = new char[r6]
        L_0x0086:
            if (r1 >= r6) goto L_0x00a1
            int r2 = toIntRange
            int r2 = r2 + 83
            int r4 = r2 % 128
            toFloatRange = r4
            int r2 = r2 % 2
            int r2 = r6 + -1
            int r2 = r2 - r1
            r2 = r8[r2]
            int r2 = r2 - r7
            char r2 = r0[r2]
            int r2 = r2 - r3
            char r2 = (char) r2
            r9[r1] = r2
            int r1 = r1 + 1
            goto L_0x0086
        L_0x00a1:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r9)
            return r6
        L_0x00a7:
            r6 = move-exception
            goto L_0x00aa
        L_0x00a9:
            throw r6
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MonitorModel.getMin(byte[], int, int[], char[]):java.lang.String");
    }
}
