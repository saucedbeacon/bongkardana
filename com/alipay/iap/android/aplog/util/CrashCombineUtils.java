package com.alipay.iap.android.aplog.util;

import android.text.TextUtils;
import java.io.File;
import java.util.Comparator;
import o.onActivityPostResumed;

public class CrashCombineUtils {
    public static final int DEFAULT_MAX_INFO_LEN = 1048576;
    public static final String JNI_SUFFIX = "jni.log";
    public static final String TOMB = "CrashSDK";
    private static final FlatComparator comparator;
    public static long crashTime = 0;
    private static int getMax = 0;
    private static int getMin = 1;
    private static int[] length;

    static void setMax() {
        length = new int[]{-1601954038, 1504172272, 1734353071, -1535199481, -1516045692, 751862968, 441507423, 1547763573, -2066647094, 2061061918, -1795145346, 833570575, -999825602, 324568411, -412420975, -938298267, 552722170, -1568259227};
    }

    static {
        try {
            setMax();
            comparator = new FlatComparator();
            int i = getMax + 41;
            getMin = i % 128;
            if ((i % 2 == 0 ? (char) 9 : 3) != 3) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if ((!r7) != true) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
        if ((r0.isFile() ? (char) 31 : 29) != 31) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r7 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r7 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String UserTrackReport(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = getMax
            int r0 = r0 + 51
            int r1 = r0 % 128
            getMin = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 44
            if (r0 != 0) goto L_0x0011
            r0 = 44
            goto L_0x0013
        L_0x0011:
            r0 = 43
        L_0x0013:
            r3 = 0
            if (r0 == r2) goto L_0x0019
            if (r7 == 0) goto L_0x00ab
            goto L_0x001e
        L_0x0019:
            super.hashCode()     // Catch:{ all -> 0x00ac }
            if (r7 == 0) goto L_0x00ab
        L_0x001e:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r7 = r0.exists()
            r2 = 0
            r4 = 1
            if (r7 == 0) goto L_0x002d
            r7 = 0
            goto L_0x002e
        L_0x002d:
            r7 = 1
        L_0x002e:
            if (r7 == 0) goto L_0x0031
            goto L_0x005c
        L_0x0031:
            int r7 = getMin
            int r7 = r7 + 61
            int r5 = r7 % 128
            getMax = r5
            int r7 = r7 % r1
            if (r7 == 0) goto L_0x004d
            boolean r7 = r0.isFile()
            super.hashCode()     // Catch:{ all -> 0x004b }
            if (r7 == 0) goto L_0x0047
            r7 = 0
            goto L_0x0048
        L_0x0047:
            r7 = 1
        L_0x0048:
            if (r7 == r4) goto L_0x005c
            goto L_0x005d
        L_0x004b:
            r7 = move-exception
            throw r7
        L_0x004d:
            boolean r7 = r0.isFile()
            r3 = 31
            if (r7 == 0) goto L_0x0058
            r7 = 31
            goto L_0x005a
        L_0x0058:
            r7 = 29
        L_0x005a:
            if (r7 == r3) goto L_0x005d
        L_0x005c:
            return r8
        L_0x005d:
            byte[] r7 = readFile(r0, r2)
            r0.length()
            int r0 = r7.length
            if (r0 <= 0) goto L_0x00a0
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0095 }
            int r3 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ all -> 0x0095 }
            int r3 = r3 >> 16
            int r3 = 5 - r3
            r5 = 4
            int[] r5 = new int[r5]     // Catch:{ all -> 0x0095 }
            r6 = 543228834(0x206103a2, float:1.9059443E-19)
            r5[r2] = r6     // Catch:{ all -> 0x0095 }
            r2 = 1551106735(0x5c7402af, float:2.7473138E17)
            r5[r4] = r2     // Catch:{ all -> 0x0095 }
            r2 = 640026531(0x262607a3, float:5.760317E-16)
            r5[r1] = r2     // Catch:{ all -> 0x0095 }
            r1 = 3
            r2 = 573181876(0x222a0fb4, float:2.304761E-18)
            r5[r1] = r2     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = getMin(r3, r5)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = r1.intern()     // Catch:{ all -> 0x0095 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0095 }
            return r0
        L_0x0095:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.String r8 = "error: byte to string, logType:"
            java.lang.String r7 = r8.concat(r7)
            return r7
        L_0x00a0:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.String r8 = "error: none byte, logType:"
            java.lang.String r7 = r8.concat(r7)
            return r7
        L_0x00ab:
            return r8
        L_0x00ac:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.CrashCombineUtils.UserTrackReport(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r6 <= 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r6 <= 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] readFile(java.io.File r5, int r6) {
        /*
            int r0 = getMax
            int r0 = r0 + 117
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r2 = 0
            if (r0 == 0) goto L_0x0016
            if (r6 > 0) goto L_0x001d
            goto L_0x001b
        L_0x0016:
            super.hashCode()     // Catch:{ all -> 0x0077 }
            if (r6 > 0) goto L_0x001d
        L_0x001b:
            r6 = 1048576(0x100000, float:1.469368E-39)
        L_0x001d:
            long r3 = r5.length()
            int r0 = (int) r3
            if (r0 <= r6) goto L_0x0025
            goto L_0x0030
        L_0x0025:
            int r6 = getMin
            int r6 = r6 + 85
            int r3 = r6 % 128
            getMax = r3
            int r6 = r6 % 2
            r6 = r0
        L_0x0030:
            byte[] r0 = new byte[r6]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006e }
            r3.<init>(r5)     // Catch:{ IOException -> 0x006e }
            int r5 = r3.read(r0, r1, r6)     // Catch:{ IOException -> 0x006c }
            r3.close()     // Catch:{ IOException -> 0x006c }
            r2 = 42
            if (r5 <= 0) goto L_0x0044
            r4 = 6
            goto L_0x0046
        L_0x0044:
            r4 = 42
        L_0x0046:
            if (r4 == r2) goto L_0x005c
            int r2 = getMax     // Catch:{ Exception -> 0x005a }
            int r2 = r2 + 71
            int r4 = r2 % 128
            getMin = r4     // Catch:{ Exception -> 0x005a }
            int r2 = r2 % 2
            if (r5 >= r6) goto L_0x005c
            byte[] r6 = new byte[r5]     // Catch:{ IOException -> 0x006c }
            java.lang.System.arraycopy(r0, r1, r6, r1, r5)     // Catch:{ IOException -> 0x006c }
            goto L_0x0076
        L_0x005a:
            r5 = move-exception
            throw r5
        L_0x005c:
            if (r5 == r6) goto L_0x006a
            int r5 = getMin
            int r5 = r5 + 79
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % 2
            byte[] r0 = new byte[r1]     // Catch:{ IOException -> 0x006c }
        L_0x006a:
            r6 = r0
            goto L_0x0076
        L_0x006c:
            r2 = r3
            goto L_0x006f
        L_0x006e:
        L_0x006f:
            byte[] r6 = new byte[r1]
            if (r2 == 0) goto L_0x0076
            r2.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            return r6
        L_0x0077:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.CrashCombineUtils.readFile(java.io.File, int):byte[]");
    }

    public static void deleteFileByPath(String str) {
        int i = getMax + 117;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            if (TextUtils.isEmpty(str)) {
                int i3 = getMin + 95;
                getMax = i3 % 128;
                if ((i3 % 2 != 0 ? 'R' : 'O') == 'R') {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return;
                }
                return;
            }
            try {
                File file = new File(str);
                if (file.exists()) {
                    try {
                        int i4 = getMax + 13;
                        getMin = i4 % 128;
                        int i5 = i4 % 2;
                        if (file.isFile()) {
                            file.delete();
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static class FlatComparator implements Comparator<File> {
        public int compare(File file, File file2) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.lastModified());
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file2.lastModified());
            return obj.compareTo(sb2.toString());
        }
    }

    private static String getMin(int i, int[] iArr) {
        int i2 = getMax + 125;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = new char[4];
        char[] cArr2 = new char[(iArr.length << 1)];
        int[] iArr2 = (int[]) length.clone();
        int i4 = 0;
        while (true) {
            if ((i4 < iArr.length ? 10 : ',') != ',') {
                cArr[0] = (char) (iArr[i4] >> 16);
                cArr[1] = (char) iArr[i4];
                int i5 = i4 + 1;
                cArr[2] = (char) (iArr[i5] >> 16);
                cArr[3] = (char) iArr[i5];
                onActivityPostResumed.getMin(cArr, iArr2, false);
                int i6 = i4 << 1;
                cArr2[i6] = cArr[0];
                cArr2[i6 + 1] = cArr[1];
                cArr2[i6 + 2] = cArr[2];
                cArr2[i6 + 3] = cArr[3];
                i4 += 2;
            } else {
                String str = new String(cArr2, 0, i);
                int i7 = getMax + 67;
                getMin = i7 % 128;
                int i8 = i7 % 2;
                return str;
            }
        }
    }
}
