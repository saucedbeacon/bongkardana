package com.alipay.iap.android.common.utils;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alipay.iap.android.common.log.LoggerWrapper;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import o.onActivityPreStopped;

public class FileUtil {
    private static final int IO_BUFFER_SIZE = 16384;
    private static final String TAG = "FileUtil";
    private static int getMax = 1;
    private static int getMin = 0;
    private static char length = '\u0003';
    private static char[] setMin = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};

    private FileUtil() {
    }

    public static String getText(String str) {
        boolean z = true;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if ((!file.exists() ? (char) 27 : 23) != 27) {
                int length2 = (int) file.length();
                if (length2 <= 20480) {
                    z = false;
                }
                if (z) {
                    int i = getMax + 31;
                    getMin = i % 128;
                    int i2 = i % 2;
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length2);
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (-1 != read) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            bufferedInputStream.close();
                            byteArrayOutputStream.close();
                            return byteArrayOutputStream.toString();
                        }
                    }
                } catch (Exception e) {
                    LoggerWrapper.e("FileUtil", "exception detail", e);
                }
            }
            return null;
        }
        try {
            int i3 = getMax + 7;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return null;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r3 != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r6 = getMin + 63;
        getMax = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0071, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r3 != false) goto L_0x0067;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0058 A[SYNTHETIC, Splitter:B:33:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005e A[SYNTHETIC, Splitter:B:37:0x005e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String read(java.lang.String r6) {
        /*
            java.lang.String r0 = "exception detail"
            java.lang.String r1 = "FileUtil"
            int r2 = getMin
            int r2 = r2 + 29
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0022
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            super.hashCode()     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x001d
            r3 = 1
        L_0x001d:
            if (r3 == 0) goto L_0x002c
            goto L_0x0067
        L_0x0020:
            r6 = move-exception
            throw r6
        L_0x0022:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            if (r3 == 0) goto L_0x0067
        L_0x002c:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            r2.<init>(r6)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            java.lang.String r5 = read((java.io.InputStream) r2)     // Catch:{ Exception -> 0x004b }
            r2.close()     // Catch:{ Exception -> 0x0043 }
            int r6 = getMin
            int r6 = r6 + 69
            int r0 = r6 % 128
            getMax = r0
            int r6 = r6 % 2
            goto L_0x005b
        L_0x0043:
            r6 = move-exception
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r0, r6)
            goto L_0x005b
        L_0x0048:
            r6 = move-exception
            r5 = r2
            goto L_0x005c
        L_0x004b:
            r6 = move-exception
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            goto L_0x005c
        L_0x004f:
            r6 = move-exception
            r2 = r5
        L_0x0051:
            java.lang.String r3 = "Exception"
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r3, r6)     // Catch:{ all -> 0x0048 }
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ Exception -> 0x0043 }
        L_0x005b:
            return r5
        L_0x005c:
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r2 = move-exception
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r0, r2)
        L_0x0066:
            throw r6
        L_0x0067:
            int r6 = getMin
            int r6 = r6 + 63
            int r0 = r6 % 128
            getMax = r0
            int r6 = r6 % 2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.FileUtil.read(java.lang.String):java.lang.String");
    }

    public static String read(InputStream inputStream) {
        int i = getMin + 41;
        getMax = i % 128;
        int i2 = i % 2;
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[IO_BUFFER_SIZE];
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, length(new char[]{1, 2, 0, 5, 'A'}, 4 - TextUtils.lastIndexOf("", '0'), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 9)).intern());
            while (true) {
                int read = inputStreamReader.read(cArr, 0, IO_BUFFER_SIZE);
                if ((read >= 0 ? 'C' : 15) == 15) {
                    break;
                }
                int i3 = getMax + 29;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                sb.append(cArr, 0, read);
            }
        } catch (Exception e) {
            LoggerWrapper.e("FileUtil", "Exception", e);
        }
        return sb.toString();
    }

    private static String length(char[] cArr, int i, byte b) {
        char c;
        char c2;
        char[] cArr2 = setMin;
        char c3 = length;
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i2 = getMax + 61;
            getMin = i2 % 128;
            if ((i2 % 2 != 0 ? '(' : '`') != '(') {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            } else {
                i += 19;
                cArr3[i] = (char) (cArr[i] + b);
            }
        }
        boolean z = true;
        if (i > 1) {
            z = false;
        }
        if (!z) {
            for (int i3 = 0; i3 < i; i3 += 2) {
                int i4 = getMax + 57;
                getMin = i4 % 128;
                if (i4 % 2 == 0 ? (c2 = cArr[i3]) != (c = cArr[i3 + 1]) : (c2 = cArr[i3]) != (c = cArr[i3 + 0])) {
                    int min = onActivityPreStopped.setMin(c2, c3);
                    int length2 = onActivityPreStopped.length(c2, c3);
                    int min2 = onActivityPreStopped.setMin(c, c3);
                    int length3 = onActivityPreStopped.length(c, c3);
                    if (length2 == length3) {
                        int max = onActivityPreStopped.setMax(min, c3);
                        int max2 = onActivityPreStopped.setMax(min2, c3);
                        int max3 = onActivityPreStopped.getMax(max, length2, c3);
                        int max4 = onActivityPreStopped.getMax(max2, length3, c3);
                        cArr3[i3] = cArr2[max3];
                        cArr3[i3 + 1] = cArr2[max4];
                    } else if (min == min2) {
                        int i5 = getMin + 67;
                        getMax = i5 % 128;
                        int i6 = i5 % 2;
                        int max5 = onActivityPreStopped.setMax(length2, c3);
                        int max6 = onActivityPreStopped.setMax(length3, c3);
                        int max7 = onActivityPreStopped.getMax(min, max5, c3);
                        int max8 = onActivityPreStopped.getMax(min2, max6, c3);
                        cArr3[i3] = cArr2[max7];
                        cArr3[i3 + 1] = cArr2[max8];
                    } else {
                        int max9 = onActivityPreStopped.getMax(min, length3, c3);
                        int max10 = onActivityPreStopped.getMax(min2, length2, c3);
                        cArr3[i3] = cArr2[max9];
                        cArr3[i3 + 1] = cArr2[max10];
                    }
                } else {
                    cArr3[i3] = (char) (c2 - b);
                    cArr3[i3 + 1] = (char) (c - b);
                }
            }
        }
        return new String(cArr3);
    }
}
