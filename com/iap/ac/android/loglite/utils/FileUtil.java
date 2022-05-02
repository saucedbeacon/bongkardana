package com.iap.ac.android.loglite.utils;

import android.graphics.Color;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.text.Typography;

public class FileUtil {
    private static int getMin = 1;
    private static int setMax = 33;
    private static int setMin;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r10, java.io.File r11) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x007b }
            r1.<init>(r10)     // Catch:{ all -> 0x007b }
            java.nio.channels.FileChannel r10 = r1.getChannel()     // Catch:{ all -> 0x0075 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x0073 }
            r8.<init>(r11)     // Catch:{ all -> 0x0073 }
            java.nio.channels.FileChannel r9 = r8.getChannel()     // Catch:{ all -> 0x006e }
            long r5 = r10.size()     // Catch:{ all -> 0x006b }
            r3 = 0
            r2 = r10
            r7 = r9
            r2.transferTo(r3, r5, r7)     // Catch:{ all -> 0x006b }
            boolean r11 = r11.exists()     // Catch:{ all -> 0x006b }
            r2 = 0
            r3 = 1
            if (r11 == 0) goto L_0x0028
            r11 = 0
            goto L_0x0029
        L_0x0028:
            r11 = 1
        L_0x0029:
            if (r11 == r3) goto L_0x0063
            int r11 = getMin
            int r11 = r11 + 107
            int r4 = r11 % 128
            setMin = r4
            int r11 = r11 % 2
            if (r11 == 0) goto L_0x0038
            r2 = 1
        L_0x0038:
            if (r2 == 0) goto L_0x004a
            safeClose(r1)
            safeClose(r10)
            safeClose(r8)
            safeClose(r9)
            int r10 = r0.length     // Catch:{ all -> 0x0048 }
            goto L_0x0056
        L_0x0048:
            r10 = move-exception
            throw r10
        L_0x004a:
            safeClose(r1)
            safeClose(r10)
            safeClose(r8)
            safeClose(r9)
        L_0x0056:
            int r10 = setMin     // Catch:{ Exception -> 0x0061 }
            int r10 = r10 + 49
            int r11 = r10 % 128
            getMin = r11     // Catch:{ Exception -> 0x0061 }
            int r10 = r10 % 2
            return
        L_0x0061:
            r10 = move-exception
            throw r10
        L_0x0063:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "copy file fail"
            r11.<init>(r0)     // Catch:{ all -> 0x006b }
            throw r11     // Catch:{ all -> 0x006b }
        L_0x006b:
            r11 = move-exception
            r0 = r9
            goto L_0x006f
        L_0x006e:
            r11 = move-exception
        L_0x006f:
            r2 = r1
            r1 = r0
            r0 = r8
            goto L_0x0080
        L_0x0073:
            r11 = move-exception
            goto L_0x0078
        L_0x0075:
            r10 = move-exception
            r11 = r10
            r10 = r0
        L_0x0078:
            r2 = r1
            r1 = r0
            goto L_0x0080
        L_0x007b:
            r10 = move-exception
            r11 = r10
            r10 = r0
            r1 = r10
            r2 = r1
        L_0x0080:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x0086 }
            r3.<init>(r11)     // Catch:{ all -> 0x0086 }
            throw r3     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r11 = move-exception
            safeClose(r2)
            safeClose(r10)
            safeClose(r0)
            safeClose(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.FileUtil.a(java.io.File, java.io.File):void");
    }

    public static void moveFile(File file, File file2) throws IOException {
        try {
            boolean z = true;
            if (!(file.renameTo(file2))) {
                int i = getMin + 109;
                setMin = i % 128;
                if (i % 2 != 0) {
                    a(file, file2);
                    file.delete();
                    int i2 = 2 / 0;
                } else {
                    a(file, file2);
                    file.delete();
                }
                int i3 = setMin + 85;
                getMin = i3 % 128;
                int i4 = i3 % 2;
            }
            if (file.exists() || !file2.exists()) {
                throw new Exception("move file fail");
            }
            int i5 = getMin + 69;
            setMin = i5 % 128;
            if (i5 % 2 == 0) {
                z = false;
            }
            if (z) {
                int i6 = 60 / 0;
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static void safeClose(Closeable closeable) {
        int i = getMin + 1;
        setMin = i % 128;
        if ((i % 2 != 0 ? 'M' : 3) == 'M') {
            boolean z = false;
            int i2 = 75 / 0;
            if (closeable == null) {
                z = true;
            }
            if (z) {
                return;
            }
        } else if (closeable == null) {
            return;
        }
        try {
            closeable.close();
            int i3 = setMin + 79;
            getMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (IOException e) {
            LoggerWrapper.w("FileUtil", (Throwable) e);
        }
    }

    public static void writeFile(String str, File file) throws Exception {
        FileOutputStream fileOutputStream = null;
        try {
            byte[] bytes = str.getBytes(length(101 - Color.blue(0), 3 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{2, 16, 17, 65524, 65513}, PhoneNumberUtils.isNonSeparator('0'), 5 - TextUtils.getCapsMode("", 0, 0)).intern());
            if ((!file.getParentFile().exists() ? Typography.less : '9') != '9') {
                int i = getMin + 67;
                setMin = i % 128;
                if ((i % 2 != 0 ? 'Y' : 'H') != 'Y') {
                    file.getParentFile().mkdirs();
                } else {
                    file.getParentFile().mkdirs();
                    super.hashCode();
                }
                int i2 = setMin + 121;
                getMin = i2 % 128;
                int i3 = i2 % 2;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
            try {
                fileOutputStream2.write(bytes);
                fileOutputStream2.flush();
                safeClose(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                safeClose(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            safeClose(fileOutputStream);
            throw th;
        }
    }

    public static long getFolderSize(File file) {
        long j;
        int i = 0;
        if (file != null) {
            int i2 = setMin + 117;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            try {
                if ((file.exists() ? 'R' : 'B') == 'R' && file.isDirectory()) {
                    try {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            if ((listFiles.length != 0 ? 'Z' : '=') == 'Z') {
                                int length = listFiles.length;
                                long j2 = 0;
                                while (i < length) {
                                    File file2 = listFiles[i];
                                    if (file2 != null) {
                                        if ((file2.exists() ? '\\' : '8') != '8') {
                                            if ((file2.isFile() ? 'O' : ']') != 'O') {
                                                j = getFolderSize(file2);
                                            } else {
                                                int i4 = getMin + 103;
                                                setMin = i4 % 128;
                                                int i5 = i4 % 2;
                                                j = file2.length();
                                            }
                                            j2 += j;
                                        }
                                    }
                                    i++;
                                }
                                return j2;
                            }
                        }
                        return 0;
                    } catch (Throwable th) {
                        LoggerWrapper.w("FileUtil", file.getAbsolutePath(), th);
                        return 0;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i6 = getMin + 45;
        setMin = i6 % 128;
        if (i6 % 2 == 0) {
            i = 1;
        }
        if (i != 0) {
            return 0;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeFile(java.io.File r4, byte[] r5, boolean r6) throws java.io.IOException {
        /*
            r0 = 0
            java.io.File r1 = r4.getParentFile()     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0052 }
            r2 = 51
            r3 = 71
            if (r1 != 0) goto L_0x0012
            r1 = 71
            goto L_0x0014
        L_0x0012:
            r1 = 51
        L_0x0014:
            if (r1 == r2) goto L_0x0027
            int r1 = getMin
            int r1 = r1 + 11
            int r2 = r1 % 128
            setMin = r2
            int r1 = r1 % 2
            java.io.File r1 = r4.getParentFile()     // Catch:{ all -> 0x0052 }
            r1.mkdirs()     // Catch:{ all -> 0x0052 }
        L_0x0027:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0052 }
            r1.<init>(r4, r6)     // Catch:{ all -> 0x0052 }
            r1.write(r5)     // Catch:{ all -> 0x004f }
            r1.flush()     // Catch:{ all -> 0x004f }
            safeClose(r1)     // Catch:{ Exception -> 0x004d }
            int r4 = getMin
            int r4 = r4 + 87
            int r5 = r4 % 128
            setMin = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0044
            r4 = 71
            goto L_0x0046
        L_0x0044:
            r4 = 43
        L_0x0046:
            if (r4 == r3) goto L_0x0049
            return
        L_0x0049:
            int r4 = r0.length     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r4 = move-exception
            throw r4
        L_0x004d:
            r4 = move-exception
            throw r4
        L_0x004f:
            r4 = move-exception
            r0 = r1
            goto L_0x0053
        L_0x0052:
            r4 = move-exception
        L_0x0053:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0059 }
            r5.<init>(r4)     // Catch:{ all -> 0x0059 }
            throw r5     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            safeClose(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.FileUtil.writeFile(java.io.File, byte[], boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r11.exists() != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r11.exists() != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readFile(java.io.File r11) {
        /*
            java.lang.String r0 = ""
            int r1 = setMin
            int r1 = r1 + 27
            int r2 = r1 % 128
            getMin = r2
            r2 = 2
            int r1 = r1 % r2
            r3 = 13
            r4 = 16
            if (r1 != 0) goto L_0x0015
            r1 = 13
            goto L_0x0017
        L_0x0015:
            r1 = 16
        L_0x0017:
            r5 = 0
            r6 = 0
            if (r1 == r3) goto L_0x0022
            boolean r1 = r11.exists()
            if (r1 == 0) goto L_0x0099
            goto L_0x002b
        L_0x0022:
            boolean r1 = r11.exists()
            r3 = 48
            int r3 = r3 / r6
            if (r1 == 0) goto L_0x0099
        L_0x002b:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007f, all -> 0x007d }
            r1.<init>(r11)     // Catch:{ Exception -> 0x007f, all -> 0x007d }
            int r11 = r1.available()     // Catch:{ Exception -> 0x007b }
            byte[] r11 = new byte[r11]     // Catch:{ Exception -> 0x007b }
            r1.read(r11)     // Catch:{ Exception -> 0x007b }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x007b }
            int r7 = android.text.TextUtils.indexOf(r0, r0, r6)     // Catch:{ Exception -> 0x007b }
            int r7 = r7 + 101
            int r0 = android.text.TextUtils.getOffsetBefore(r0, r6)     // Catch:{ Exception -> 0x007b }
            r8 = 3
            int r0 = 3 - r0
            r9 = 5
            char[] r10 = new char[r9]     // Catch:{ Exception -> 0x007b }
            r10[r6] = r2     // Catch:{ Exception -> 0x007b }
            r6 = 1
            r10[r6] = r4     // Catch:{ Exception -> 0x007b }
            r4 = 17
            r10[r2] = r4     // Catch:{ Exception -> 0x007b }
            r4 = 65524(0xfff4, float:9.1819E-41)
            r10[r8] = r4     // Catch:{ Exception -> 0x007b }
            r4 = 4
            r6 = 65513(0xffe9, float:9.1803E-41)
            r10[r4] = r6     // Catch:{ Exception -> 0x007b }
            r4 = 48
            boolean r4 = android.telephony.PhoneNumberUtils.isDialable(r4)     // Catch:{ Exception -> 0x007b }
            int r6 = android.os.Process.myPid()     // Catch:{ Exception -> 0x007b }
            int r6 = r6 >> 22
            int r9 = r9 - r6
            java.lang.String r0 = length(r7, r0, r10, r4, r9)     // Catch:{ Exception -> 0x007b }
            java.lang.String r0 = r0.intern()     // Catch:{ Exception -> 0x007b }
            r3.<init>(r11, r0)     // Catch:{ Exception -> 0x007b }
            safeClose(r1)
            return r3
        L_0x007b:
            r11 = move-exception
            goto L_0x0081
        L_0x007d:
            r11 = move-exception
            goto L_0x0095
        L_0x007f:
            r11 = move-exception
            r1 = r5
        L_0x0081:
            java.lang.String r0 = "FileUtil"
            com.iap.ac.android.loglite.utils.LoggerWrapper.w((java.lang.String) r0, (java.lang.Throwable) r11)     // Catch:{ all -> 0x0093 }
            safeClose(r1)
            int r11 = setMin
            int r11 = r11 + 53
            int r0 = r11 % 128
            getMin = r0
            int r11 = r11 % r2
            goto L_0x0099
        L_0x0093:
            r11 = move-exception
            r5 = r1
        L_0x0095:
            safeClose(r5)
            throw r11
        L_0x0099:
            return r5
        L_0x009a:
            r11 = move-exception
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.utils.FileUtil.readFile(java.io.File):java.lang.String");
    }

    private static String length(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        int i4 = 0;
        while (true) {
            if ((i4 < i3 ? 8 : 'F') != 8) {
                break;
            }
            cArr2[i4] = (char) (cArr[i4] + i);
            try {
                cArr2[i4] = (char) (cArr2[i4] - setMax);
                i4++;
            } catch (Exception e) {
                throw e;
            }
        }
        if (i2 > 0) {
            int i5 = getMin + 119;
            setMin = i5 % 128;
            int i6 = i5 % 2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            int i7 = i3 - i2;
            System.arraycopy(cArr3, 0, cArr2, i7, i2);
            System.arraycopy(cArr3, i2, cArr2, 0, i7);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i3];
            int i8 = 0;
            while (i8 < i3) {
                int i9 = setMin + 101;
                getMin = i9 % 128;
                if (i9 % 2 == 0) {
                    cArr4[i8] = cArr2[(i3 / i8) >>> 0];
                    i8 += 40;
                } else {
                    cArr4[i8] = cArr2[(i3 - i8) - 1];
                    i8++;
                }
            }
            cArr2 = cArr4;
        }
        return new String(cArr2);
    }
}
