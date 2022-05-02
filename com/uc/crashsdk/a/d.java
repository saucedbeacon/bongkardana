package com.uc.crashsdk.a;

import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9867a = {126, 147, 115, 241, 101, 198, 215, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO};
    public static final int[] b = {125, WSContextConstant.HANDSHAKE_RECEIVE_SIZE, 233, 226, TsExtractor.TS_STREAM_TYPE_AC3, 142, 151, 176};
    public static final int[] c = {238, WSContextConstant.HANDSHAKE_RECEIVE_SIZE, 233, 179, TsExtractor.TS_STREAM_TYPE_AC3, 142, 151, 167};

    public static String a(String str) {
        FileInputStream fileInputStream;
        File file = new File(str);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[((int) file.length())];
                fileInputStream.read(bArr);
                fileInputStream.close();
                byte[] a2 = a(bArr, f9867a);
                if (a2 == null || a2.length <= 0) {
                    b.a((Closeable) fileInputStream);
                    return null;
                }
                int length = a2.length - 1;
                String str2 = a2[length] == 10 ? new String(a2, 0, length) : new String(a2);
                b.a((Closeable) fileInputStream);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    a.a(e, false);
                    b.a((Closeable) fileInputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    b.a((Closeable) fileInputStream2);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            a.a(e, false);
            b.a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            b.a((Closeable) fileInputStream2);
            throw th;
        }
    }

    private static byte[] a(File file) {
        FileInputStream fileInputStream;
        if (!file.exists()) {
            return null;
        }
        try {
            byte[] bArr = new byte[((int) file.length())];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr);
                b.a((Closeable) fileInputStream);
                return bArr;
            } catch (Throwable th) {
                th = th;
                try {
                    a.a(th, false);
                    return null;
                } finally {
                    b.a((Closeable) fileInputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            a.a(th, false);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0064 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            if (r9 != 0) goto L_0x0003
            return r7
        L_0x0003:
            boolean r0 = com.uc.crashsdk.a.h.a((java.lang.String) r7)
            if (r0 == 0) goto L_0x000a
            return r7
        L_0x000a:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x00bf
            long r1 = r0.length()
            r3 = 3145728(0x300000, double:1.554196E-317)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0022
            goto L_0x00bf
        L_0x0022:
            byte[] r1 = a((java.io.File) r0)
            if (r1 == 0) goto L_0x00bf
            int r2 = r1.length
            if (r2 > 0) goto L_0x002d
            goto L_0x00bf
        L_0x002d:
            r2 = 1
            r3 = 0
            if (r9 == 0) goto L_0x0084
            r9 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004a }
            r4.<init>()     // Catch:{ all -> 0x004a }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0045 }
            r5.<init>(r4)     // Catch:{ all -> 0x0045 }
            r5.write(r1)     // Catch:{ all -> 0x0043 }
            r4.flush()     // Catch:{ all -> 0x0043 }
            goto L_0x0051
        L_0x0043:
            r9 = move-exception
            goto L_0x004e
        L_0x0045:
            r5 = move-exception
            r6 = r5
            r5 = r9
            r9 = r6
            goto L_0x004e
        L_0x004a:
            r4 = move-exception
            r5 = r9
            r9 = r4
            r4 = r5
        L_0x004e:
            com.uc.crashsdk.a.a.a(r9, r3)     // Catch:{ all -> 0x007c }
        L_0x0051:
            com.uc.crashsdk.a.b.a((java.io.Closeable) r4)
            com.uc.crashsdk.a.b.a((java.io.Closeable) r5)
            byte[] r1 = r4.toByteArray()     // Catch:{ all -> 0x005d }
            r9 = 1
            goto L_0x0062
        L_0x005d:
            r9 = move-exception
            com.uc.crashsdk.a.a.a(r9, r3)
            r9 = 0
        L_0x0062:
            if (r9 == 0) goto L_0x007b
            if (r1 == 0) goto L_0x007b
            int r9 = r1.length
            if (r9 > 0) goto L_0x006a
            goto L_0x007b
        L_0x006a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = 1
            goto L_0x0086
        L_0x007b:
            return r7
        L_0x007c:
            r7 = move-exception
            com.uc.crashsdk.a.b.a((java.io.Closeable) r4)
            com.uc.crashsdk.a.b.a((java.io.Closeable) r5)
            throw r7
        L_0x0084:
            r8 = r7
            r9 = 0
        L_0x0086:
            if (r9 == 0) goto L_0x00bf
            java.lang.String r9 = r0.getName()
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00a5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r4 = ".tmp"
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r4 = 1
            goto L_0x00a7
        L_0x00a5:
            r9 = r8
            r4 = 0
        L_0x00a7:
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            boolean r9 = com.uc.crashsdk.a.b.a((java.io.File) r5, (byte[]) r1)
            if (r9 != 0) goto L_0x00b4
            r2 = 0
            goto L_0x00bc
        L_0x00b4:
            if (r4 == 0) goto L_0x00bc
            r0.delete()
            r5.renameTo(r0)
        L_0x00bc:
            if (r2 == 0) goto L_0x00bf
            return r8
        L_0x00bf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.crashsdk.a.d.a(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    private static byte[] a(byte[] bArr, int[] iArr) {
        if (bArr.length - 0 >= 2 && iArr != null && iArr.length == 8) {
            int length = (bArr.length - 2) - 0;
            try {
                byte[] bArr2 = new byte[length];
                byte b2 = 0;
                for (int i = 0; i < length; i++) {
                    byte b3 = (byte) (bArr[i + 0] ^ iArr[i % 8]);
                    bArr2[i] = b3;
                    b2 = (byte) (b2 ^ b3);
                }
                if (bArr[length + 0] == ((byte) ((iArr[0] ^ b2) & 255)) && bArr[length + 1 + 0] == ((byte) ((iArr[1] ^ b2) & 255))) {
                    return bArr2;
                }
                return null;
            } catch (Exception e) {
                a.a(e, false);
            }
        }
        return null;
    }

    private static byte[] b(byte[] bArr, int[] iArr) {
        if (!(bArr == null || iArr == null || iArr.length != 8)) {
            int length = bArr.length;
            try {
                byte[] bArr2 = new byte[(length + 2)];
                byte b2 = 0;
                for (int i = 0; i < length; i++) {
                    byte b3 = bArr[i];
                    bArr2[i] = (byte) (iArr[i % 8] ^ b3);
                    b2 = (byte) (b2 ^ b3);
                }
                bArr2[length] = (byte) (iArr[0] ^ b2);
                bArr2[length + 1] = (byte) (iArr[1] ^ b2);
                return bArr2;
            } catch (Exception e) {
                a.a(e, false);
            }
        }
        return null;
    }

    public static boolean a(String str, String str2) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            a.a(th, false);
            fileOutputStream = null;
        }
        if (fileOutputStream == null) {
            return false;
        }
        byte[] b2 = b(str2.getBytes(), f9867a);
        if (b2 == null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                a.a(th2, false);
            }
            return false;
        }
        try {
            fileOutputStream.write(b2);
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                a.a(th3, false);
            }
            return true;
        } catch (Throwable th4) {
            a.a(th4, false);
            return false;
        }
    }
}
