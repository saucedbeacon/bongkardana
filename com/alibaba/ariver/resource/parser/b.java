package com.alibaba.ariver.resource.parser;

import android.util.Base64;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

class b {
    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.nio.MappedByteBuffer} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "AriverRes:Rsa"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0085 }
            r2.<init>(r10)     // Catch:{ all -> 0x0085 }
            java.nio.channels.FileChannel r9 = r2.getChannel()     // Catch:{ all -> 0x0080 }
            long r3 = r9.size()     // Catch:{ all -> 0x007d }
            r5 = 65536(0x10000, double:3.2379E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0062
            r5 = 5242880(0x500000, double:2.590327E-317)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x001f
            goto L_0x0062
        L_0x001f:
            java.lang.String r10 = "NIO verify size="
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x007d }
            java.lang.String r10 = r10.concat(r3)     // Catch:{ all -> 0x007d }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r10)     // Catch:{ all -> 0x007d }
            r10 = 2
            byte[] r11 = android.util.Base64.decode(r11, r10)     // Catch:{ all -> 0x007d }
            java.security.spec.X509EncodedKeySpec r3 = new java.security.spec.X509EncodedKeySpec     // Catch:{ all -> 0x007d }
            r3.<init>(r11)     // Catch:{ all -> 0x007d }
            java.lang.String r11 = "RSA"
            java.security.KeyFactory r11 = java.security.KeyFactory.getInstance(r11)     // Catch:{ all -> 0x007d }
            java.security.PublicKey r11 = r11.generatePublic(r3)     // Catch:{ all -> 0x007d }
            byte[] r10 = android.util.Base64.decode(r12, r10)     // Catch:{ all -> 0x007d }
            java.lang.String r12 = "SHA1withRSA"
            java.security.Signature r12 = java.security.Signature.getInstance(r12)     // Catch:{ all -> 0x007d }
            r12.initVerify(r11)     // Catch:{ all -> 0x007d }
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x007d }
            r5 = 0
            long r7 = r9.size()     // Catch:{ all -> 0x007d }
            r3 = r9
            java.nio.MappedByteBuffer r1 = r3.map(r4, r5, r7)     // Catch:{ all -> 0x007d }
            r12.update(r1)     // Catch:{ all -> 0x007d }
            boolean r10 = r12.verify(r10)     // Catch:{ all -> 0x007d }
            goto L_0x0073
        L_0x0062:
            java.lang.String r5 = "verify size="
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = r5.concat(r3)     // Catch:{ all -> 0x007d }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r3)     // Catch:{ all -> 0x007d }
            boolean r10 = c(r10, r11, r12)     // Catch:{ all -> 0x007d }
        L_0x0073:
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r2)
            goto L_0x009f
        L_0x007d:
            r10 = move-exception
            r11 = r1
            goto L_0x0083
        L_0x0080:
            r10 = move-exception
            r11 = r1
            r9 = r11
        L_0x0083:
            r1 = r2
            goto L_0x0088
        L_0x0085:
            r10 = move-exception
            r11 = r1
            r9 = r11
        L_0x0088:
            java.lang.String r12 = "verify exception"
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x00a0 }
            java.lang.String r10 = r12.concat(r10)     // Catch:{ all -> 0x00a0 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r10)     // Catch:{ all -> 0x00a0 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
            r10 = 0
        L_0x009f:
            return r10
        L_0x00a0:
            r10 = move-exception
            com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(r11)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r9)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.parser.b.b(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private static boolean c(String str, String str2, String str3) {
        byte[] buf = IOUtils.getBuf(1024);
        boolean z = false;
        BufferedInputStream bufferedInputStream = null;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(SuperGwUtils.SIGN_TYPE).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
            byte[] decode = Base64.decode(str3, 2);
            Signature instance = Signature.getInstance("SHA1withRSA");
            instance.initVerify(generatePublic);
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            int i = 0;
            while (bufferedInputStream2.available() != 0) {
                try {
                    int read = bufferedInputStream2.read(buf);
                    i += read;
                    instance.update(buf, 0, read);
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        RVLogger.e("AriverRes:Rsa", "verify exception", th);
                        return z;
                    } finally {
                        IOUtils.returnBuf(buf);
                        IOUtils.closeQuietly(bufferedInputStream);
                    }
                }
            }
            RVLogger.d("AriverRes:Rsa", "Stream verify size=".concat(String.valueOf(i)));
            z = instance.verify(decode);
            IOUtils.returnBuf(buf);
            IOUtils.closeQuietly(bufferedInputStream2);
        } catch (Throwable th2) {
            th = th2;
            RVLogger.e("AriverRes:Rsa", "verify exception", th);
            return z;
        }
        return z;
    }

    static boolean a(String str, String str2, String str3) {
        if (IOUtils.isNIOEnabled()) {
            RVLogger.d("AriverRes:Rsa", "verify with NIO ".concat(String.valueOf(str)));
            return b(str, str2, str3);
        }
        RVLogger.d("AriverRes:Rsa", "verify with stream ".concat(String.valueOf(str)));
        return c(str, str2, str3);
    }
}
