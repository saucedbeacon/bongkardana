package o;

import java.io.BufferedInputStream;
import java.io.IOException;

final class waitForLoader {
    private static int setMax = 1;
    private static int setMin;

    waitForLoader() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if ((r9 != null) != true) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        r0 = setMax;
        r1 = ((r0 | 37) << 1) - (r0 ^ 37);
        setMin = r1 % 128;
        r1 = r1 % 2;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r0 < r9.length()) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1 == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r1 = setMax;
        r6 = (r1 & 111) + (r1 | 111);
        setMin = r6 % 128;
        r6 = r6 % 2;
        r1 = r9.charAt(r0);
        r0 = (r0 + 2) - 1;
        r2 = ((r2 << 5) ^ ((-134217728 & r2) >> 27)) ^ ((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r9 = setMin;
        r0 = (r9 ^ 63) + ((r9 & 63) << 1);
        setMax = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if ((r0 % 2) == 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        if (r4 == true) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if ((r9 != null) != true) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getMax(java.lang.String r9) {
        /*
            int r0 = setMin
            r1 = r0 & 55
            r0 = r0 | 55
            int r1 = r1 + r0
            int r0 = r1 % 128
            setMax = r0
            int r1 = r1 % 2
            r0 = 33
            if (r1 == 0) goto L_0x0014
            r1 = 13
            goto L_0x0016
        L_0x0014:
            r1 = 33
        L_0x0016:
            r2 = 0
            r4 = 0
            r5 = 1
            if (r1 == r0) goto L_0x0024
            if (r9 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0024:
            if (r9 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == r5) goto L_0x0036
        L_0x002b:
            int r9 = setMax
            int r9 = r9 + 35
            int r0 = r9 % 128
            setMin = r0
            int r9 = r9 % 2
            return r2
        L_0x0036:
            int r0 = setMax
            r1 = r0 | 37
            int r1 = r1 << r5
            r0 = r0 ^ 37
            int r1 = r1 - r0
            int r0 = r1 % 128
            setMin = r0
            int r1 = r1 % 2
            r0 = 0
        L_0x0045:
            int r1 = r9.length()
            if (r0 < r1) goto L_0x004d
            r1 = 0
            goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            if (r1 == 0) goto L_0x0071
            int r1 = setMax
            r6 = r1 & 111(0x6f, float:1.56E-43)
            r1 = r1 | 111(0x6f, float:1.56E-43)
            int r6 = r6 + r1
            int r1 = r6 % 128
            setMin = r1
            int r6 = r6 % 2
            char r1 = r9.charAt(r0)
            int r0 = r0 + 2
            int r0 = r0 - r5
            r6 = -134217728(0xfffffffff8000000, double:NaN)
            long r6 = r6 & r2
            r8 = 5
            long r2 = r2 << r8
            r8 = 27
            long r6 = r6 >> r8
            long r2 = r2 ^ r6
            long r6 = (long) r1
            long r2 = r2 ^ r6
            goto L_0x0045
        L_0x0071:
            int r9 = setMin
            r0 = r9 ^ 63
            r9 = r9 & 63
            int r9 = r9 << r5
            int r0 = r0 + r9
            int r9 = r0 % 128
            setMax = r9
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0082
            r4 = 1
        L_0x0082:
            if (r4 == r5) goto L_0x008b
            r9 = 0
            super.hashCode()     // Catch:{ all -> 0x0089 }
            return r2
        L_0x0089:
            r9 = move-exception
            throw r9
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.waitForLoader.getMax(java.lang.String):long");
    }

    public static int setMax(BufferedInputStream bufferedInputStream, long[] jArr) {
        int i;
        int i2 = setMin;
        int i3 = ((i2 | 117) << 1) - (i2 ^ 117);
        setMax = i3 % 128;
        long j = !(i3 % 2 != 0) ? 1 : 0;
        loop0:
        while (true) {
            try {
                int read = bufferedInputStream.read();
                if (read == -1) {
                    int i4 = setMax + 33;
                    setMin = i4 % 128;
                    int i5 = i4 % 2;
                    break;
                }
                int i6 = setMin + 21;
                setMax = i6 % 128;
                int i7 = i6 % 2;
                j = ((j << 5) ^ ((long) ((char) read))) & 1073741823;
                int i8 = (setMin + 122) - 1;
                setMax = i8 % 128;
                int i9 = i8 % 2;
                i = 0;
                while (true) {
                    if (i < jArr.length) {
                        int i10 = setMin;
                        int i11 = (i10 & 107) + (i10 | 107);
                        setMax = i11 % 128;
                        if ((i11 % 2 != 0 ? ']' : 'K') != 'K') {
                            if (!(j != jArr[i])) {
                                break loop0;
                            }
                            i++;
                        } else {
                            if ((j != jArr[i] ? 2 : 'L') != 2) {
                                break loop0;
                            }
                            i++;
                        }
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (i & 1) + (i | 1);
        int i12 = setMin;
        int i13 = (i12 & 19) + (i12 | 19);
        setMax = i13 % 128;
        int i14 = i13 % 2;
        return 0;
    }
}
