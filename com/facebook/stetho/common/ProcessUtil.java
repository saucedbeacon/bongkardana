package com.facebook.stetho.common;

import java.io.FileInputStream;
import java.io.IOException;

public class ProcessUtil {
    private static final int CMDLINE_BUFFER_SIZE = 64;
    private static String sProcessName;
    private static boolean sProcessNameRead;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(3:5|6|7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String getProcessName() {
        /*
            java.lang.Class<com.facebook.stetho.common.ProcessUtil> r0 = com.facebook.stetho.common.ProcessUtil.class
            monitor-enter(r0)
            boolean r1 = sProcessNameRead     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0010
            r1 = 1
            sProcessNameRead = r1     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = readProcessName()     // Catch:{ IOException -> 0x0010 }
            sProcessName = r1     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            java.lang.String r1 = sProcessName     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)
            return r1
        L_0x0014:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.common.ProcessUtil.getProcessName():java.lang.String");
    }

    private static String readProcessName() throws IOException {
        byte[] bArr = new byte[64];
        FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
        boolean z = false;
        try {
            int read = fileInputStream.read(bArr);
            try {
                int indexOf = indexOf(bArr, 0, read, (byte) 0);
                if (indexOf > 0) {
                    read = indexOf;
                }
                String str = new String(bArr, 0, read);
                Util.close(fileInputStream, false);
                return str;
            } catch (Throwable th) {
                th = th;
                z = true;
                Util.close(fileInputStream, true ^ z);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            Util.close(fileInputStream, true ^ z);
            throw th;
        }
    }

    private static int indexOf(byte[] bArr, int i, int i2, byte b) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if (bArr[i3] == b) {
                return i3;
            }
        }
        return -1;
    }
}
