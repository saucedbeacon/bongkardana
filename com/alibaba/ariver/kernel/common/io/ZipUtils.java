package com.alibaba.ariver.kernel.common.io;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ZipUtils {
    public static final String TAG = "AriverRes:ZipUtils";

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unZip(java.util.zip.ZipFile r19, java.lang.String r20) {
        /*
            r1 = r19
            java.lang.String r2 = "unzip Exception!"
            java.lang.String r3 = "AriverRes:ZipUtils"
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r0)
            r5 = 0
            java.util.Enumeration r6 = r19.entries()     // Catch:{ Exception -> 0x016e }
            r7 = 0
            r8 = r7
        L_0x0013:
            boolean r0 = r6.hasMoreElements()     // Catch:{ Exception -> 0x016e }
            if (r0 == 0) goto L_0x015b
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x016e }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = r0.getName()     // Catch:{ Exception -> 0x016e }
            java.lang.String r10 = "../"
            boolean r10 = r9.contains(r10)     // Catch:{ Exception -> 0x016e }
            if (r10 != 0) goto L_0x0141
            java.lang.String r10 = "\\"
            boolean r10 = r9.contains(r10)     // Catch:{ Exception -> 0x016e }
            if (r10 != 0) goto L_0x0141
            java.lang.String r10 = "%"
            boolean r10 = r9.contains(r10)     // Catch:{ Exception -> 0x016e }
            if (r10 == 0) goto L_0x003d
            goto L_0x0141
        L_0x003d:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x016e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016e }
            r11.<init>()     // Catch:{ Exception -> 0x016e }
            r12 = r20
            r11.append(r12)     // Catch:{ Exception -> 0x016e }
            r11.append(r9)     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x016e }
            r10.<init>(r9)     // Catch:{ Exception -> 0x016e }
            boolean r9 = r0.isDirectory()     // Catch:{ Exception -> 0x016e }
            if (r9 == 0) goto L_0x005d
            r10.mkdirs()     // Catch:{ Exception -> 0x016e }
            goto L_0x0013
        L_0x005d:
            java.io.File r9 = r10.getParentFile()     // Catch:{ Exception -> 0x016e }
            boolean r11 = r9.exists()     // Catch:{ Exception -> 0x016e }
            if (r11 != 0) goto L_0x006a
            r9.mkdirs()     // Catch:{ Exception -> 0x016e }
        L_0x006a:
            long r13 = r0.getSize()     // Catch:{ Exception -> 0x016e }
            r15 = 65536(0x10000, double:3.2379E-319)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x0106
            long r13 = r0.getSize()     // Catch:{ Exception -> 0x016e }
            r15 = 5242880(0x500000, double:2.590327E-317)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x0082
            goto L_0x0106
        L_0x0082:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016e }
            java.lang.String r11 = "unzip "
            r9.<init>(r11)     // Catch:{ Exception -> 0x016e }
            java.lang.String r11 = r10.getName()     // Catch:{ Exception -> 0x016e }
            r9.append(r11)     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r9)     // Catch:{ Exception -> 0x016e }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00e6 }
            java.lang.String r11 = "rw"
            r9.<init>(r10, r11)     // Catch:{ all -> 0x00e6 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x00e3 }
            java.nio.channels.FileChannel$MapMode r14 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x00e0 }
            r15 = 0
            long r17 = r0.getSize()     // Catch:{ all -> 0x00e0 }
            r13 = r10
            java.nio.MappedByteBuffer r11 = r13.map(r14, r15, r17)     // Catch:{ all -> 0x00e0 }
            java.io.InputStream r8 = r1.getInputStream(r0)     // Catch:{ all -> 0x00de }
            long r13 = r0.getSize()     // Catch:{ all -> 0x00de }
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            if (r11 == 0) goto L_0x00cb
            if (r8 == 0) goto L_0x00cb
        L_0x00c1:
            int r0 = r8.read(r4)     // Catch:{ all -> 0x00de }
            if (r0 <= 0) goto L_0x00d0
            r11.put(r4, r5, r0)     // Catch:{ all -> 0x00de }
            goto L_0x00c1
        L_0x00cb:
            java.lang.String r0 = " invalid ZipEntry size or mapped buffer!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r0)     // Catch:{ all -> 0x00de }
        L_0x00d0:
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r10)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x016e }
        L_0x00d9:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x016e }
            goto L_0x0013
        L_0x00de:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e0:
            r0 = move-exception
            r11 = r7
            goto L_0x00ea
        L_0x00e3:
            r0 = move-exception
            r10 = r7
            goto L_0x00e9
        L_0x00e6:
            r0 = move-exception
            r9 = r7
            r10 = r9
        L_0x00e9:
            r11 = r10
        L_0x00ea:
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00f7 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r10)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x016e }
            goto L_0x00d9
        L_0x00f7:
            r0 = move-exception
            r6 = r0
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r10)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x016e }
            throw r6     // Catch:{ Exception -> 0x016e }
        L_0x0106:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016e }
            java.lang.String r11 = "file size: "
            r9.<init>(r11)     // Catch:{ Exception -> 0x016e }
            long r13 = r0.getSize()     // Catch:{ Exception -> 0x016e }
            r9.append(r13)     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r9)     // Catch:{ Exception -> 0x016e }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0139 }
            r9.<init>(r10)     // Catch:{ all -> 0x0139 }
            java.io.InputStream r8 = r1.getInputStream(r0)     // Catch:{ all -> 0x0136 }
        L_0x0124:
            int r0 = r8.read(r4)     // Catch:{ all -> 0x0136 }
            if (r0 <= 0) goto L_0x012e
            r9.write(r4, r5, r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0124
        L_0x012e:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x016e }
            goto L_0x0013
        L_0x0136:
            r0 = move-exception
            r7 = r9
            goto L_0x013a
        L_0x0139:
            r0 = move-exception
        L_0x013a:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x016e }
            throw r0     // Catch:{ Exception -> 0x016e }
        L_0x0141:
            r12 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016e }
            java.lang.String r10 = "entryName "
            r0.<init>(r10)     // Catch:{ Exception -> 0x016e }
            r0.append(r9)     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = " not safe!"
            r0.append(r9)     // Catch:{ Exception -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r0)     // Catch:{ Exception -> 0x016e }
            goto L_0x0013
        L_0x015b:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            if (r1 == 0) goto L_0x0169
            r19.close()     // Catch:{ IOException -> 0x0164 }
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            r1 = r0
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r1)
        L_0x0169:
            r5 = 1
            goto L_0x0180
        L_0x016b:
            r0 = move-exception
            r5 = r0
            goto L_0x0181
        L_0x016e:
            r0 = move-exception
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x016b }
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            if (r1 == 0) goto L_0x0180
            r19.close()     // Catch:{ IOException -> 0x017b }
            goto L_0x0180
        L_0x017b:
            r0 = move-exception
            r1 = r0
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r1)
        L_0x0180:
            return r5
        L_0x0181:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            if (r1 == 0) goto L_0x018f
            r19.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x018f
        L_0x018a:
            r0 = move-exception
            r1 = r0
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r1)
        L_0x018f:
            goto L_0x0191
        L_0x0190:
            throw r5
        L_0x0191:
            goto L_0x0190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.io.ZipUtils.unZip(java.util.zip.ZipFile, java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unZip(java.io.InputStream r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "AriverRes:ZipUtils"
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r1 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r1)
            r2 = 0
            r3 = 0
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x0095 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0095 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x0095 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0095 }
        L_0x0014:
            java.util.zip.ZipEntry r7 = r4.getNextEntry()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r7 == 0) goto L_0x0085
            java.lang.String r5 = r7.getName()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.lang.String r6 = "../"
            boolean r6 = r5.contains(r6)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r6 != 0) goto L_0x006e
            java.lang.String r6 = "\\"
            boolean r6 = r5.contains(r6)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r6 != 0) goto L_0x006e
            java.lang.String r6 = "%"
            boolean r6 = r5.contains(r6)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r6 == 0) goto L_0x0037
            goto L_0x006e
        L_0x0037:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            r6.<init>(r8, r5)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            boolean r7 = r7.isDirectory()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r7 == 0) goto L_0x0046
            r6.mkdirs()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            goto L_0x0014
        L_0x0046:
            java.io.File r7 = r6.getParentFile()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            boolean r5 = r7.exists()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            if (r5 != 0) goto L_0x0053
            r7.mkdirs()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
        L_0x0053:
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ all -> 0x0069 }
            r7.<init>(r6)     // Catch:{ all -> 0x0069 }
        L_0x0058:
            int r5 = r4.read(r1)     // Catch:{ all -> 0x0066 }
            if (r5 <= 0) goto L_0x0062
            r7.write(r1, r2, r5)     // Catch:{ all -> 0x0066 }
            goto L_0x0058
        L_0x0062:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            goto L_0x0014
        L_0x0066:
            r8 = move-exception
            r3 = r7
            goto L_0x006a
        L_0x0069:
            r8 = move-exception
        L_0x006a:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            throw r8     // Catch:{ Exception -> 0x0090, all -> 0x008d }
        L_0x006e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.lang.String r6 = "entryName "
            r7.<init>(r6)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            r7.append(r5)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.lang.String r5 = " not safe!"
            r7.append(r5)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r7)     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            goto L_0x0014
        L_0x0085:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
            r2 = 1
            goto L_0x00a1
        L_0x008d:
            r7 = move-exception
            r3 = r4
            goto L_0x00a2
        L_0x0090:
            r7 = move-exception
            r3 = r4
            goto L_0x0096
        L_0x0093:
            r7 = move-exception
            goto L_0x00a2
        L_0x0095:
            r7 = move-exception
        L_0x0096:
            java.lang.String r8 = "unZip exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r8, r7)     // Catch:{ all -> 0x0093 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
        L_0x00a1:
            return r2
        L_0x00a2:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            goto L_0x00aa
        L_0x00a9:
            throw r7
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.io.ZipUtils.unZip(java.io.InputStream, java.lang.String):boolean");
    }

    public static boolean unZip(String str, String str2) {
        try {
            return unZip((InputStream) new FileInputStream(str), str2);
        } catch (FileNotFoundException e) {
            RVLogger.e("AriverRes:ZipUtils", "exception", e);
            return false;
        }
    }
}
