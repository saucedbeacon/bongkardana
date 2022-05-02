package com.alipay.iap.android.aplog.util;

import android.text.TextUtils;
import java.io.File;

public class ZipUtil {
    private static final int BUFFER_LENGTH = 8192;

    public interface ZipFileHandler {
        String handleFileNameInZip(File file);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:36|37|38|39|40|41|42|80) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0091 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0094 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00a4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zipFile(java.util.List<java.io.File> r10, java.lang.String r11, java.io.File r12, com.alipay.iap.android.aplog.util.ZipUtil.ZipFileHandler r13) throws java.lang.Exception {
        /*
            if (r10 == 0) goto L_0x00da
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x00da
            if (r11 == 0) goto L_0x00d1
            int r0 = r11.length()
            if (r0 == 0) goto L_0x00d1
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L_0x00c0
            java.io.File r0 = r0.getParentFile()     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x002a
            boolean r1 = r0.exists()     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x002a
            r0.mkdirs()     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = 0
            java.util.zip.ZipOutputStream r1 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x00aa }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00aa }
            r2.<init>(r11)     // Catch:{ all -> 0x00aa }
            r1.<init>(r2)     // Catch:{ all -> 0x00aa }
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x00a8 }
            r2 = 0
            r3 = 0
        L_0x003b:
            int r4 = r10.size()     // Catch:{ all -> 0x00a8 }
            if (r3 >= r4) goto L_0x009f
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x00a8 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x009c
            boolean r5 = r4.exists()     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x009c
            boolean r5 = r4.isFile()     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x009c
            long r5 = r4.length()     // Catch:{ all -> 0x00a8 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x009c
            java.lang.String r5 = getAbsFileName(r12, r4, r13)     // Catch:{ all -> 0x00a8 }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00a8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00a8 }
            long r7 = r4.length()     // Catch:{ all -> 0x00a8 }
            r6.setSize(r7)     // Catch:{ all -> 0x00a8 }
            long r7 = r4.lastModified()     // Catch:{ all -> 0x00a8 }
            r6.setTime(r7)     // Catch:{ all -> 0x00a8 }
            r1.putNextEntry(r6)     // Catch:{ all -> 0x00a8 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00a8 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x00a8 }
            r6.<init>(r4)     // Catch:{ all -> 0x00a8 }
            r5.<init>(r6)     // Catch:{ all -> 0x00a8 }
        L_0x0083:
            int r0 = r5.read(r11)     // Catch:{ all -> 0x0099 }
            r4 = -1
            if (r0 == r4) goto L_0x008e
            r1.write(r11, r2, r0)     // Catch:{ all -> 0x0099 }
            goto L_0x0083
        L_0x008e:
            r5.close()     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1.flush()     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r1.closeEntry()     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = r5
            goto L_0x009c
        L_0x0099:
            r10 = move-exception
            r0 = r5
            goto L_0x00ac
        L_0x009c:
            int r3 = r3 + 1
            goto L_0x003b
        L_0x009f:
            if (r0 == 0) goto L_0x00a4
            r0.close()     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r1.close()     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            return
        L_0x00a8:
            r10 = move-exception
            goto L_0x00ac
        L_0x00aa:
            r10 = move-exception
            r1 = r0
        L_0x00ac:
            java.lang.Exception r11 = new java.lang.Exception     // Catch:{ all -> 0x00b2 }
            r11.<init>(r10)     // Catch:{ all -> 0x00b2 }
            throw r11     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r10 = move-exception
            if (r0 == 0) goto L_0x00ba
            r0.close()     // Catch:{ all -> 0x00b9 }
            goto L_0x00ba
        L_0x00b9:
        L_0x00ba:
            if (r1 == 0) goto L_0x00bf
            r1.close()     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            throw r10
        L_0x00c0:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "zipFilePath is directory: "
            java.lang.String r11 = r12.concat(r11)
            r10.<init>(r11)
            throw r10
        L_0x00d1:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = "zipFilePath is none"
            r10.<init>(r11)
            throw r10
        L_0x00da:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = "willZipList is empty"
            r10.<init>(r11)
            goto L_0x00e4
        L_0x00e3:
            throw r10
        L_0x00e4:
            goto L_0x00e3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.ZipUtil.zipFile(java.util.List, java.lang.String, java.io.File, com.alipay.iap.android.aplog.util.ZipUtil$ZipFileHandler):void");
    }

    private static String getAbsFileName(File file, File file2, ZipFileHandler zipFileHandler) {
        String str = null;
        if (file2 == null) {
            return null;
        }
        if (file == null) {
            file = file2.getParentFile();
        }
        if (zipFileHandler != null) {
            try {
                str = zipFileHandler.handleFileNameInZip(file2);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = file2.getName();
        }
        while (true) {
            file2 = file2.getParentFile();
            if (file2 == null || file2.equals(file)) {
                break;
            }
            String name = file2.getName();
            if (TextUtils.isEmpty(name)) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        return str;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[SYNTHETIC, Splitter:B:22:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] unCompressGzip(java.io.InputStream r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0025 }
            r2.<init>(r4)     // Catch:{ all -> 0x0025 }
            r4 = 256(0x100, float:3.59E-43)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0024 }
        L_0x0012:
            int r0 = r2.read(r4)     // Catch:{ all -> 0x0024 }
            if (r0 < 0) goto L_0x001d
            r3 = 0
            r1.write(r4, r3, r0)     // Catch:{ all -> 0x0024 }
            goto L_0x0012
        L_0x001d:
            r1.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2.close()     // Catch:{ all -> 0x002f }
            goto L_0x002f
        L_0x0024:
            r0 = r2
        L_0x0025:
            r1.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ all -> 0x002f }
        L_0x002f:
            byte[] r4 = r1.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.ZipUtil.unCompressGzip(java.io.InputStream):byte[]");
    }
}
