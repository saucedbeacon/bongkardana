package com.alibaba.griver.base.common.utils;

import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.monitor.GriverMonitor;
import com.alibaba.griver.base.common.monitor.MonitorMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

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
            java.util.Enumeration r6 = r19.entries()     // Catch:{ Exception -> 0x0170 }
            r7 = 0
            r8 = r7
        L_0x0014:
            boolean r0 = r6.hasMoreElements()     // Catch:{ Exception -> 0x0170 }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r0 = r6.nextElement()     // Catch:{ Exception -> 0x0170 }
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch:{ Exception -> 0x0170 }
            java.lang.String r9 = r0.getName()     // Catch:{ Exception -> 0x0170 }
            java.lang.String r10 = "../"
            boolean r10 = r9.contains(r10)     // Catch:{ Exception -> 0x0170 }
            if (r10 != 0) goto L_0x0143
            java.lang.String r10 = "\\"
            boolean r10 = r9.contains(r10)     // Catch:{ Exception -> 0x0170 }
            if (r10 != 0) goto L_0x0143
            java.lang.String r10 = "%"
            boolean r10 = r9.contains(r10)     // Catch:{ Exception -> 0x0170 }
            if (r10 == 0) goto L_0x003e
            goto L_0x0143
        L_0x003e:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0170 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            r11.<init>()     // Catch:{ Exception -> 0x0170 }
            r12 = r20
            r11.append(r12)     // Catch:{ Exception -> 0x0170 }
            r11.append(r9)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x0170 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0170 }
            boolean r9 = r0.isDirectory()     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x005e
            r10.mkdirs()     // Catch:{ Exception -> 0x0170 }
            goto L_0x0014
        L_0x005e:
            java.io.File r9 = r10.getParentFile()     // Catch:{ Exception -> 0x0170 }
            boolean r11 = r9.exists()     // Catch:{ Exception -> 0x0170 }
            if (r11 != 0) goto L_0x006b
            r9.mkdirs()     // Catch:{ Exception -> 0x0170 }
        L_0x006b:
            long r13 = r0.getSize()     // Catch:{ Exception -> 0x0170 }
            r15 = 65536(0x10000, double:3.2379E-319)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x0108
            long r13 = r0.getSize()     // Catch:{ Exception -> 0x0170 }
            r15 = 5242880(0x500000, double:2.590327E-317)
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L_0x0083
            goto L_0x0108
        L_0x0083:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            java.lang.String r11 = "unzip "
            r9.<init>(r11)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r11 = r10.getName()     // Catch:{ Exception -> 0x0170 }
            r9.append(r11)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r9)     // Catch:{ Exception -> 0x0170 }
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "rw"
            r9.<init>(r10, r11)     // Catch:{ all -> 0x00e8 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x00e5 }
            java.nio.channels.FileChannel$MapMode r14 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x00e2 }
            r15 = 0
            long r17 = r0.getSize()     // Catch:{ all -> 0x00e2 }
            r13 = r10
            java.nio.MappedByteBuffer r11 = r13.map(r14, r15, r17)     // Catch:{ all -> 0x00e2 }
            java.io.InputStream r8 = r1.getInputStream(r0)     // Catch:{ all -> 0x00e0 }
            long r13 = r0.getSize()     // Catch:{ all -> 0x00e0 }
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
            if (r11 == 0) goto L_0x00cd
            if (r8 == 0) goto L_0x00cd
        L_0x00c3:
            int r0 = r8.read(r4)     // Catch:{ all -> 0x00e0 }
            if (r0 <= 0) goto L_0x00d2
            r11.put(r4, r5, r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00c3
        L_0x00cd:
            java.lang.String r0 = " invalid ZipEntry size or mapped buffer!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r0)     // Catch:{ all -> 0x00e0 }
        L_0x00d2:
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r10)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x0170 }
        L_0x00db:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0014
        L_0x00e0:
            r0 = move-exception
            goto L_0x00ec
        L_0x00e2:
            r0 = move-exception
            r11 = r7
            goto L_0x00ec
        L_0x00e5:
            r0 = move-exception
            r10 = r7
            goto L_0x00eb
        L_0x00e8:
            r0 = move-exception
            r9 = r7
            r10 = r9
        L_0x00eb:
            r11 = r10
        L_0x00ec:
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x00f9 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r10)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x0170 }
            goto L_0x00db
        L_0x00f9:
            r0 = move-exception
            r6 = r0
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r10)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x0170 }
            throw r6     // Catch:{ Exception -> 0x0170 }
        L_0x0108:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            java.lang.String r11 = "file size: "
            r9.<init>(r11)     // Catch:{ Exception -> 0x0170 }
            long r13 = r0.getSize()     // Catch:{ Exception -> 0x0170 }
            r9.append(r13)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r9)     // Catch:{ Exception -> 0x0170 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x013b }
            r9.<init>(r10)     // Catch:{ all -> 0x013b }
            java.io.InputStream r8 = r1.getInputStream(r0)     // Catch:{ all -> 0x0138 }
        L_0x0126:
            int r0 = r8.read(r4)     // Catch:{ all -> 0x0138 }
            if (r0 <= 0) goto L_0x0130
            r9.write(r4, r5, r0)     // Catch:{ all -> 0x0138 }
            goto L_0x0126
        L_0x0130:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0014
        L_0x0138:
            r0 = move-exception
            r7 = r9
            goto L_0x013c
        L_0x013b:
            r0 = move-exception
        L_0x013c:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ Exception -> 0x0170 }
            throw r0     // Catch:{ Exception -> 0x0170 }
        L_0x0143:
            r12 = r20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0170 }
            java.lang.String r10 = "entryName "
            r0.<init>(r10)     // Catch:{ Exception -> 0x0170 }
            r0.append(r9)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r9 = " not safe!"
            r0.append(r9)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0170 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r0)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0014
        L_0x015d:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            if (r1 == 0) goto L_0x016b
            r19.close()     // Catch:{ IOException -> 0x0166 }
            goto L_0x016b
        L_0x0166:
            r0 = move-exception
            r1 = r0
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r1)
        L_0x016b:
            r5 = 1
            goto L_0x0182
        L_0x016d:
            r0 = move-exception
            r5 = r0
            goto L_0x0183
        L_0x0170:
            r0 = move-exception
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x016d }
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            if (r1 == 0) goto L_0x0182
            r19.close()     // Catch:{ IOException -> 0x017d }
            goto L_0x0182
        L_0x017d:
            r0 = move-exception
            r1 = r0
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r1)
        L_0x0182:
            return r5
        L_0x0183:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r4)
            if (r1 == 0) goto L_0x0191
            r19.close()     // Catch:{ IOException -> 0x018c }
            goto L_0x0191
        L_0x018c:
            r0 = move-exception
            r1 = r0
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r2, r1)
        L_0x0191:
            goto L_0x0193
        L_0x0192:
            throw r5
        L_0x0193:
            goto L_0x0192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.ZipUtils.unZip(java.util.zip.ZipFile, java.lang.String):boolean");
    }

    public static boolean unZip(InputStream inputStream, String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] buf = IOUtils.getBuf(2048);
        ZipInputStream zipInputStream = null;
        try {
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(inputStream));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        if (!name.contains("../") && !name.contains("\\")) {
                            if (!name.contains("%")) {
                                File file = new File(str, name);
                                if (nextEntry.isDirectory()) {
                                    file.mkdirs();
                                } else {
                                    File parentFile = file.getParentFile();
                                    if (!parentFile.exists()) {
                                        parentFile.mkdirs();
                                    }
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        while (true) {
                                            try {
                                                int read = zipInputStream2.read(buf);
                                                if (read <= 0) {
                                                    break;
                                                }
                                                fileOutputStream.write(buf, 0, read);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                IOUtils.closeQuietly(fileOutputStream);
                                                throw th;
                                            }
                                        }
                                        IOUtils.closeQuietly(fileOutputStream);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                        IOUtils.closeQuietly(fileOutputStream);
                                        throw th;
                                    }
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder("entryName ");
                        sb.append(name);
                        sb.append(" not safe!");
                        RVLogger.d("AriverRes:ZipUtils", sb.toString());
                    } else {
                        IOUtils.returnBuf(buf);
                        IOUtils.closeQuietly(zipInputStream2);
                        return true;
                    }
                } catch (Exception e) {
                    e = e;
                    zipInputStream = zipInputStream2;
                    try {
                        RVLogger.e("AriverRes:ZipUtils", "unZip exception", e);
                        GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_DETAIL_FAIL, "GriverAppContainer", new MonitorMap.Builder().message("unzip flow fail").append("filePath", str).exception(e).build());
                        IOUtils.returnBuf(buf);
                        IOUtils.closeQuietly(zipInputStream);
                        return false;
                    } catch (Throwable th4) {
                        th = th4;
                        IOUtils.returnBuf(buf);
                        IOUtils.closeQuietly(zipInputStream);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    zipInputStream = zipInputStream2;
                    IOUtils.returnBuf(buf);
                    IOUtils.closeQuietly(zipInputStream);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            RVLogger.e("AriverRes:ZipUtils", "unZip exception", e);
            GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_DETAIL_FAIL, "GriverAppContainer", new MonitorMap.Builder().message("unzip flow fail").append("filePath", str).exception(e).build());
            IOUtils.returnBuf(buf);
            IOUtils.closeQuietly(zipInputStream);
            return false;
        }
    }

    public static boolean unZip(String str, String str2) {
        try {
            return unZip((InputStream) new FileInputStream(str), str2);
        } catch (FileNotFoundException e) {
            RVLogger.e("AriverRes:ZipUtils", "exception", e);
            GriverMonitor.error(GriverMonitorConstants.ERROR_UNZIP_DETAIL_FAIL, "GriverAppContainer", new MonitorMap.Builder().append("fileName", str).append("filePath", str2).message("unzip file exception").exception(e).build());
            return false;
        }
    }
}
