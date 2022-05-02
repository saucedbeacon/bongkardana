package com.alipay.iap.android.aplog.util;

import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import o.OnLifecycleEvent;

public class FileUtil {
    public static final String TAG = "FileUtil";
    private static int getMax = 0;
    private static int getMin = 1;
    private static long length = 0;
    private static char setMax = '᭳';
    private static int setMin;

    public static boolean sdCardAvailable() {
        int i = getMin + 125;
        getMax = i % 128;
        int i2 = i % 2;
        try {
            boolean equals = "mounted".equals(Environment.getExternalStorageState());
            int i3 = getMin + 105;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            return equals;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void writeFile(File file, String str, boolean z) throws IOException {
        int i = getMax + 49;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            byte[] bytes = str.getBytes(setMax(new char[]{58064, 24262, 2908, 43133}, 1549715170 - (ViewConfiguration.getFadingEdgeLength() >> 16), new char[]{18125, 7140, 1719, 40211, 17597}, new char[]{0, 0, 0, 0}, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 32011)).intern());
            int i3 = getMin + 49;
            getMax = i3 % 128;
            int i4 = i3 % 2;
            writeFile(file, bytes, z);
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if ((!r4.getParentFile().exists() ? 'U' : 'E') != 'E') goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeFile(java.io.File r4, byte[] r5, boolean r6) throws java.io.IOException {
        /*
            int r0 = getMin
            int r0 = r0 + 63
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 85
            r2 = 0
            if (r0 == 0) goto L_0x0024
            java.io.File r0 = r4.getParentFile()     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0059 }
            int r3 = r2.length     // Catch:{ all -> 0x0059 }
            r3 = 51
            if (r0 != 0) goto L_0x001f
            r0 = 51
            goto L_0x0021
        L_0x001f:
            r0 = 16
        L_0x0021:
            if (r0 == r3) goto L_0x0037
            goto L_0x0047
        L_0x0024:
            java.io.File r0 = r4.getParentFile()     // Catch:{ all -> 0x0059 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0059 }
            r3 = 69
            if (r0 != 0) goto L_0x0033
            r0 = 85
            goto L_0x0035
        L_0x0033:
            r0 = 69
        L_0x0035:
            if (r0 == r3) goto L_0x0047
        L_0x0037:
            int r0 = getMax
            int r0 = r0 + r1
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            java.io.File r0 = r4.getParentFile()     // Catch:{ all -> 0x0059 }
            r0.mkdirs()     // Catch:{ all -> 0x0059 }
        L_0x0047:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0059 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x0059 }
            r0.write(r5)     // Catch:{ all -> 0x0056 }
            r0.flush()     // Catch:{ all -> 0x0056 }
            r0.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            return
        L_0x0056:
            r4 = move-exception
            r2 = r0
            goto L_0x005a
        L_0x0059:
            r4 = move-exception
        L_0x005a:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0060 }
            r5.<init>(r4)     // Catch:{ all -> 0x0060 }
            throw r5     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r4 = move-exception
            if (r2 == 0) goto L_0x0070
            r2.close()     // Catch:{ all -> 0x0070 }
            int r5 = getMax
            int r5 = r5 + 47
            int r6 = r5 % 128
            getMin = r6
            int r5 = r5 % 2
        L_0x0070:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.FileUtil.writeFile(java.io.File, byte[], boolean):void");
    }

    public static String readFile(File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream2.available()];
                fileInputStream2.read(bArr);
                String str = new String(bArr, setMax(new char[]{58064, 24262, 2908, 43133}, Drawable.resolveOpacity(0, 0) + 1549715170, new char[]{18125, 7140, 1719, 40211, 17597}, new char[]{0, 0, 0, 0}, (char) (32010 - TextUtils.lastIndexOf("", '0'))).intern());
                try {
                    fileInputStream2.close();
                } catch (Throwable unused) {
                }
                int i = getMin + 41;
                getMax = i % 128;
                int i2 = i % 2;
                return str;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                try {
                    throw new IOException(th);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            throw new IOException(th);
        }
        throw th;
    }

    public static void deleteFileNotDir(File file) {
        if (file != null) {
            try {
                boolean z = false;
                if (file.exists()) {
                    if (file.isFile()) {
                        z = true;
                    }
                    if (z) {
                        try {
                            int i = getMin + 31;
                            try {
                                getMax = i % 128;
                                int i2 = i % 2;
                                file.delete();
                                int i3 = getMin + 55;
                                getMax = i3 % 128;
                                int i4 = i3 % 2;
                            } catch (Exception e) {
                                throw e;
                            }
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                }
            } catch (Throwable unused) {
                file.getAbsolutePath();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if ((r13 != null ? '-' : ':') != '-') goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        if ((!r13.isDirectory() ? '*' : 'F') != 'F') goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        if ((!r13.isDirectory()) != true) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((r13 != null ? kotlin.text.Typography.amp : 10) != '&') goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getFolderSize(java.io.File r13) {
        /*
            int r0 = getMax
            int r0 = r0 + 95
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x001f
            int r0 = r1.length     // Catch:{ all -> 0x001d }
            r0 = 38
            if (r13 == 0) goto L_0x0017
            r4 = 38
            goto L_0x0019
        L_0x0017:
            r4 = 10
        L_0x0019:
            if (r4 == r0) goto L_0x002c
            goto L_0x00c4
        L_0x001d:
            r13 = move-exception
            throw r13
        L_0x001f:
            r0 = 45
            if (r13 == 0) goto L_0x0026
            r4 = 45
            goto L_0x0028
        L_0x0026:
            r4 = 58
        L_0x0028:
            if (r4 == r0) goto L_0x002c
            goto L_0x00c4
        L_0x002c:
            int r0 = getMax
            int r0 = r0 + 35
            int r4 = r0 % 128
            getMin = r4
            int r0 = r0 % 2
            boolean r0 = r13.exists()
            if (r0 == 0) goto L_0x00c4
            int r0 = getMax
            int r0 = r0 + 55
            int r4 = r0 % 128
            getMin = r4
            int r0 = r0 % 2
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0060
            boolean r0 = r13.isDirectory()
            r6 = 61
            int r6 = r6 / r4
            r6 = 70
            if (r0 != 0) goto L_0x0058
            r0 = 42
            goto L_0x005a
        L_0x0058:
            r0 = 70
        L_0x005a:
            if (r0 == r6) goto L_0x006b
            goto L_0x00c4
        L_0x005e:
            r13 = move-exception
            throw r13
        L_0x0060:
            boolean r0 = r13.isDirectory()
            if (r0 != 0) goto L_0x0068
            r0 = 1
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 == r5) goto L_0x00c4
        L_0x006b:
            java.io.File[] r0 = r13.listFiles()     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00c0
            int r6 = r0.length     // Catch:{ all -> 0x00c1 }
            if (r6 != 0) goto L_0x0075
            goto L_0x00c0
        L_0x0075:
            int r6 = r0.length     // Catch:{ all -> 0x00c1 }
            r8 = r2
            r7 = 0
        L_0x0078:
            if (r7 >= r6) goto L_0x007c
            r10 = 1
            goto L_0x007d
        L_0x007c:
            r10 = 0
        L_0x007d:
            if (r10 == r5) goto L_0x0080
            return r8
        L_0x0080:
            r10 = r0[r7]     // Catch:{ all -> 0x00c1 }
            if (r10 == 0) goto L_0x0086
            r11 = 0
            goto L_0x0087
        L_0x0086:
            r11 = 1
        L_0x0087:
            if (r11 == 0) goto L_0x008a
            goto L_0x00bd
        L_0x008a:
            int r11 = getMin
            int r11 = r11 + 63
            int r12 = r11 % 128
            getMax = r12
            int r11 = r11 % 2
            if (r11 == 0) goto L_0x00a0
            boolean r11 = r10.exists()     // Catch:{ all -> 0x00c1 }
            super.hashCode()     // Catch:{ all -> 0x00c1 }
            if (r11 == 0) goto L_0x00bd
            goto L_0x00ac
        L_0x00a0:
            boolean r11 = r10.exists()     // Catch:{ all -> 0x00c1 }
            if (r11 == 0) goto L_0x00a8
            r11 = 1
            goto L_0x00a9
        L_0x00a8:
            r11 = 0
        L_0x00a9:
            if (r11 == r5) goto L_0x00ac
            goto L_0x00bd
        L_0x00ac:
            boolean r11 = r10.isFile()     // Catch:{ all -> 0x00c1 }
            if (r11 == 0) goto L_0x00b8
            long r10 = r10.length()     // Catch:{ all -> 0x00c1 }
        L_0x00b6:
            long r8 = r8 + r10
            goto L_0x00bd
        L_0x00b8:
            long r10 = getFolderSize(r10)     // Catch:{ all -> 0x00c1 }
            goto L_0x00b6
        L_0x00bd:
            int r7 = r7 + 1
            goto L_0x0078
        L_0x00c0:
            return r2
        L_0x00c1:
            r13.getAbsolutePath()
        L_0x00c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.FileUtil.getFolderSize(java.io.File):long");
    }

    public static void moveFile(File file, File file2) throws IOException {
        try {
            boolean z = false;
            if (!file.renameTo(file2)) {
                int i = getMax + 107;
                getMin = i % 128;
                if (i % 2 == 0) {
                    copyFile(file, file2);
                    file.delete();
                    Object[] objArr = null;
                    int length2 = objArr.length;
                } else {
                    copyFile(file, file2);
                    file.delete();
                }
                int i2 = getMin + 119;
                getMax = i2 % 128;
                int i3 = i2 % 2;
            }
            if (file.exists()) {
                z = true;
            }
            if (z || !file2.exists()) {
                throw new Exception("move file fail");
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v5, types: [java.nio.channels.spi.AbstractInterruptibleChannel, java.nio.channels.FileChannel] */
    /* JADX WARNING: type inference failed for: r10v15 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0051 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061 A[SYNTHETIC, Splitter:B:34:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b4 A[SYNTHETIC, Splitter:B:71:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00bb A[SYNTHETIC, Splitter:B:75:0x00bb] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void copyFile(java.io.File r10, java.io.File r11) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0086 }
            r1.<init>(r10)     // Catch:{ all -> 0x0086 }
            java.nio.channels.FileChannel r10 = r1.getChannel()     // Catch:{ all -> 0x0080 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x007d }
            r8.<init>(r11)     // Catch:{ all -> 0x007d }
            java.nio.channels.FileChannel r9 = r8.getChannel()     // Catch:{ all -> 0x007a }
            r3 = 0
            long r5 = r10.size()     // Catch:{ all -> 0x0078 }
            r2 = r10
            r7 = r9
            r2.transferTo(r3, r5, r7)     // Catch:{ all -> 0x0078 }
            boolean r11 = r11.exists()     // Catch:{ all -> 0x0078 }
            if (r11 == 0) goto L_0x0070
            r1.close()     // Catch:{ all -> 0x0028 }
            goto L_0x0029
        L_0x0028:
        L_0x0029:
            if (r10 == 0) goto L_0x0051
            int r11 = getMin
            int r11 = r11 + 115
            int r1 = r11 % 128
            getMax = r1
            int r11 = r11 % 2
            r1 = 1
            if (r11 == 0) goto L_0x003a
            r11 = 1
            goto L_0x003b
        L_0x003a:
            r11 = 0
        L_0x003b:
            if (r11 == r1) goto L_0x0041
            r10.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0047
        L_0x0041:
            r10.close()     // Catch:{ all -> 0x0051 }
            super.hashCode()     // Catch:{ all -> 0x0051 }
        L_0x0047:
            int r10 = getMin
            int r10 = r10 + 31
            int r11 = r10 % 128
            getMax = r11
            int r10 = r10 % 2
        L_0x0051:
            r8.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            r10 = 16
            if (r9 == 0) goto L_0x005d
            r11 = 13
            goto L_0x005f
        L_0x005d:
            r11 = 16
        L_0x005f:
            if (r11 == r10) goto L_0x0065
            r9.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            return
        L_0x0065:
            int r10 = getMin
            int r10 = r10 + 45
            int r11 = r10 % 128
            getMax = r11
            int r10 = r10 % 2
            return
        L_0x0070:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "copy file fail"
            r11.<init>(r0)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            goto L_0x0084
        L_0x007a:
            r11 = move-exception
            r9 = r0
            goto L_0x0084
        L_0x007d:
            r11 = move-exception
            r8 = r0
            goto L_0x0083
        L_0x0080:
            r11 = move-exception
            r10 = r0
            r8 = r10
        L_0x0083:
            r9 = r8
        L_0x0084:
            r0 = r1
            goto L_0x008a
        L_0x0086:
            r11 = move-exception
            r10 = r0
            r8 = r10
            r9 = r8
        L_0x008a:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0090 }
            r1.<init>(r11)     // Catch:{ all -> 0x0090 }
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r11 = move-exception
            if (r0 == 0) goto L_0x00a2
            r0.close()     // Catch:{ all -> 0x00a1 }
            int r0 = getMin
            int r0 = r0 + 23
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            goto L_0x00a2
        L_0x00a1:
        L_0x00a2:
            if (r10 == 0) goto L_0x00a9
            r10.close()     // Catch:{ all -> 0x00a8 }
            goto L_0x00a9
        L_0x00a8:
        L_0x00a9:
            r10 = 63
            if (r8 == 0) goto L_0x00b0
            r0 = 28
            goto L_0x00b2
        L_0x00b0:
            r0 = 63
        L_0x00b2:
            if (r0 == r10) goto L_0x00b9
            r8.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00b9
        L_0x00b8:
        L_0x00b9:
            if (r9 == 0) goto L_0x00be
            r9.close()     // Catch:{ all -> 0x00be }
        L_0x00be:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.FileUtil.copyFile(java.io.File, java.io.File):void");
    }

    public static boolean writeEncryptedContent(byte[] bArr, byte[] bArr2, File file) {
        BufferedOutputStream bufferedOutputStream;
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream;
        int i = getMin + 101;
        getMax = i % 128;
        int i2 = i % 2;
        DataOutputStream dataOutputStream2 = null;
        try {
            if ((!file.getParentFile().exists() ? ')' : 'B') == ')') {
                try {
                    int i3 = getMax + 87;
                    try {
                        getMin = i3 % 128;
                        int i4 = i3 % 2;
                        file.getParentFile().mkdirs();
                        int i5 = getMax + 27;
                        getMin = i5 % 128;
                        int i6 = i5 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            fileOutputStream = new FileOutputStream(file, true);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    dataOutputStream = new DataOutputStream(bufferedOutputStream);
                } catch (Throwable unused) {
                    safeClose(dataOutputStream2);
                    safeClose(bufferedOutputStream);
                    safeClose(fileOutputStream);
                    return false;
                }
                try {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.writeShort((short) bArr2.length);
                    dataOutputStream.write(bArr2);
                    dataOutputStream.write(bArr);
                    dataOutputStream.flush();
                    safeClose(dataOutputStream);
                    safeClose(bufferedOutputStream);
                    safeClose(fileOutputStream);
                    return true;
                } catch (Throwable unused2) {
                    dataOutputStream2 = dataOutputStream;
                    safeClose(dataOutputStream2);
                    safeClose(bufferedOutputStream);
                    safeClose(fileOutputStream);
                    return false;
                }
            } catch (Throwable unused3) {
                bufferedOutputStream = null;
                safeClose(dataOutputStream2);
                safeClose(bufferedOutputStream);
                safeClose(fileOutputStream);
                return false;
            }
        } catch (Throwable unused4) {
            bufferedOutputStream = null;
            fileOutputStream = null;
            safeClose(dataOutputStream2);
            safeClose(bufferedOutputStream);
            safeClose(fileOutputStream);
            return false;
        }
    }

    public static void safeClose(Closeable closeable) {
        int i = getMin + 123;
        getMax = i % 128;
        int i2 = i % 2;
        Object[] objArr = null;
        if (closeable != null) {
            int i3 = getMin + 19;
            getMax = i3 % 128;
            if ((i3 % 2 != 0 ? '\\' : 'I') != '\\') {
                try {
                    closeable.close();
                    return;
                } catch (IOException e) {
                    LoggerFactory.getInnerTraceLogger().error("FileUtil", e.getMessage());
                }
            } else {
                closeable.close();
                super.hashCode();
                return;
            }
        }
        int i4 = getMin + 75;
        getMax = i4 % 128;
        if (!(i4 % 2 == 0)) {
            int length2 = objArr.length;
        }
    }

    private static String setMax(char[] cArr, int i, char[] cArr2, char[] cArr3, char c) {
        char[] cArr4 = (char[]) cArr.clone();
        char[] cArr5 = (char[]) cArr3.clone();
        cArr4[0] = (char) (c ^ cArr4[0]);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length2 = cArr2.length;
        char[] cArr6 = new char[length2];
        int i2 = 0;
        while (true) {
            if ((i2 < length2 ? '%' : 11) == 11) {
                break;
            }
            int i3 = getMax + 29;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            OnLifecycleEvent.length(cArr4, cArr5, i2);
            cArr6[i2] = (char) ((int) (((((long) (cArr2[i2] ^ cArr4[(i2 + 3) % 4])) ^ length) ^ ((long) setMin)) ^ ((long) setMax)));
            i2++;
        }
        String str = new String(cArr6);
        int i5 = getMax + 43;
        getMin = i5 % 128;
        if ((i5 % 2 == 0 ? 5 : 'b') != 5) {
            return str;
        }
        int i6 = 46 / 0;
        return str;
    }
}
