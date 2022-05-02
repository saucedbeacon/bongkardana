package com.alipay.iap.android.aplog.util.zip;

import com.alipay.iap.android.aplog.core.LoggerFactory;

public class LzmaAlone {
    private static final String TAG = LzmaAlone.class.getSimpleName();

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8 A[SYNTHETIC, Splitter:B:67:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f2 A[SYNTHETIC, Splitter:B:72:0x00f2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean sevenZipFile(boolean r12, boolean r13, java.lang.String r14, java.lang.String r15) {
        /*
            r0 = 0
            if (r14 == 0) goto L_0x0111
            int r1 = r14.length()
            if (r1 == 0) goto L_0x0111
            if (r15 == 0) goto L_0x0111
            int r1 = r15.length()
            if (r1 != 0) goto L_0x0013
            goto L_0x0111
        L_0x0013:
            java.io.File r1 = new java.io.File
            r1.<init>(r14)
            java.io.File r14 = new java.io.File
            r14.<init>(r15)
            boolean r15 = r1.exists()
            if (r15 == 0) goto L_0x0111
            boolean r15 = r1.isFile()
            if (r15 == 0) goto L_0x0111
            boolean r15 = r14.isDirectory()
            if (r15 == 0) goto L_0x0031
            goto L_0x0111
        L_0x0031:
            r15 = 0
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e1 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00e1 }
            r2.<init>(r1)     // Catch:{ all -> 0x00e1 }
            r10.<init>(r2)     // Catch:{ all -> 0x00e1 }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00dd }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00dd }
            r2.<init>(r14)     // Catch:{ all -> 0x00dd }
            r11.<init>(r2)     // Catch:{ all -> 0x00dd }
            r14 = 8
            if (r12 == 0) goto L_0x0079
            com.alipay.iap.android.aplog.util.zip.LZMA_Encoder r2 = new com.alipay.iap.android.aplog.util.zip.LZMA_Encoder     // Catch:{ all -> 0x00db }
            r2.<init>()     // Catch:{ all -> 0x00db }
            r2.SetEndMarkerMode(r13)     // Catch:{ all -> 0x00db }
            r2.WriteCoderProperties(r11)     // Catch:{ all -> 0x00db }
            if (r13 == 0) goto L_0x005a
            r12 = -1
            goto L_0x005e
        L_0x005a:
            long r12 = r1.length()     // Catch:{ all -> 0x00db }
        L_0x005e:
            r15 = 0
        L_0x005f:
            if (r15 >= r14) goto L_0x006e
            int r1 = r15 * 8
            long r3 = r12 >>> r1
            int r1 = (int) r3     // Catch:{ all -> 0x00db }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r11.write(r1)     // Catch:{ all -> 0x00db }
            int r15 = r15 + 1
            goto L_0x005f
        L_0x006e:
            r5 = -1
            r7 = -1
            r9 = 0
            r3 = r10
            r4 = r11
            r2.Code(r3, r4, r5, r7, r9)     // Catch:{ all -> 0x00db }
            goto L_0x00ae
        L_0x0079:
            r12 = 5
            byte[] r13 = new byte[r12]     // Catch:{ all -> 0x00db }
            int r15 = r10.read(r13, r0, r12)     // Catch:{ all -> 0x00db }
            if (r15 != r12) goto L_0x00d3
            com.alipay.iap.android.aplog.util.zip.LZMA_Decoder r12 = new com.alipay.iap.android.aplog.util.zip.LZMA_Decoder     // Catch:{ all -> 0x00db }
            r12.<init>()     // Catch:{ all -> 0x00db }
            r1 = 0
            boolean r13 = r12.SetDecoderProperties(r13)     // Catch:{ all -> 0x00db }
            if (r13 == 0) goto L_0x00cb
            r13 = 0
        L_0x0090:
            if (r13 >= r14) goto L_0x00a8
            int r15 = r10.read()     // Catch:{ all -> 0x00db }
            if (r15 < 0) goto L_0x00a0
            long r3 = (long) r15     // Catch:{ all -> 0x00db }
            int r15 = r13 * 8
            long r3 = r3 << r15
            long r1 = r1 | r3
            int r13 = r13 + 1
            goto L_0x0090
        L_0x00a0:
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x00db }
            java.lang.String r13 = "Can't read stream size"
            r12.<init>(r13)     // Catch:{ all -> 0x00db }
            throw r12     // Catch:{ all -> 0x00db }
        L_0x00a8:
            boolean r12 = r12.Code(r10, r11, r1)     // Catch:{ all -> 0x00db }
            if (r12 == 0) goto L_0x00c3
        L_0x00ae:
            r11.flush()     // Catch:{ all -> 0x00db }
            r10.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r12 = move-exception
            printThrowableLog(r12)
        L_0x00b9:
            r11.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00c1
        L_0x00bd:
            r12 = move-exception
            printThrowableLog(r12)
        L_0x00c1:
            r12 = 1
            return r12
        L_0x00c3:
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x00db }
            java.lang.String r13 = "Error in data stream"
            r12.<init>(r13)     // Catch:{ all -> 0x00db }
            throw r12     // Catch:{ all -> 0x00db }
        L_0x00cb:
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x00db }
            java.lang.String r13 = "Incorrect stream properties"
            r12.<init>(r13)     // Catch:{ all -> 0x00db }
            throw r12     // Catch:{ all -> 0x00db }
        L_0x00d3:
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x00db }
            java.lang.String r13 = "input .lzma file is too short"
            r12.<init>(r13)     // Catch:{ all -> 0x00db }
            throw r12     // Catch:{ all -> 0x00db }
        L_0x00db:
            r12 = move-exception
            goto L_0x00df
        L_0x00dd:
            r12 = move-exception
            r11 = r15
        L_0x00df:
            r15 = r10
            goto L_0x00e3
        L_0x00e1:
            r12 = move-exception
            r11 = r15
        L_0x00e3:
            printThrowableLog(r12)     // Catch:{ all -> 0x00fb }
            if (r15 == 0) goto L_0x00f0
            r15.close()     // Catch:{ all -> 0x00ec }
            goto L_0x00f0
        L_0x00ec:
            r12 = move-exception
            printThrowableLog(r12)
        L_0x00f0:
            if (r11 == 0) goto L_0x00fa
            r11.close()     // Catch:{ all -> 0x00f6 }
            goto L_0x00fa
        L_0x00f6:
            r12 = move-exception
            printThrowableLog(r12)
        L_0x00fa:
            return r0
        L_0x00fb:
            r12 = move-exception
            if (r15 == 0) goto L_0x0106
            r15.close()     // Catch:{ all -> 0x0102 }
            goto L_0x0106
        L_0x0102:
            r13 = move-exception
            printThrowableLog(r13)
        L_0x0106:
            if (r11 == 0) goto L_0x0110
            r11.close()     // Catch:{ all -> 0x010c }
            goto L_0x0110
        L_0x010c:
            r13 = move-exception
            printThrowableLog(r13)
        L_0x0110:
            throw r12
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.zip.LzmaAlone.sevenZipFile(boolean, boolean, java.lang.String, java.lang.String):boolean");
    }

    private static void printThrowableLog(Throwable th) {
        LoggerFactory.getTraceLogger().error(TAG, "sevenZipFile", th);
    }
}
