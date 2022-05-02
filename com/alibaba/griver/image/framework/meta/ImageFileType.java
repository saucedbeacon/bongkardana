package com.alibaba.griver.image.framework.meta;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.api.APImageFormat;
import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ImageFileType implements APImageFormat {
    public static final byte HEAD_GIF_0 = 71;
    public static final byte HEAD_HEVC_0 = 72;
    public static final byte HEAD_HEVC_ORI_0 = 0;
    public static final byte HEAD_JPG_0 = -1;
    public static final byte HEAD_WEBP_0 = 82;

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f10477a = {-119, 80, 78, HEAD_GIF_0, 13, 10, Ascii.SUB, 10};
    private static final byte[] b = {-1, -40};
    private static final byte[] c = {HEAD_GIF_0, 73, 70, 56};
    private static final byte[] d = {HEAD_WEBP_0, 73, 70, 70};
    private static final byte[] e = {HEAD_HEVC_0, 69, 86, 67};
    private static final byte[] f = {0, 0, 0, 1};
    public static final Map<Integer, String> sTypeSuffix;

    public static boolean isGif(int i) {
        return i == 2;
    }

    public static boolean isJPEG(int i) {
        return i == 0;
    }

    static {
        HashMap hashMap = new HashMap(5);
        sTypeSuffix = hashMap;
        hashMap.put(1, APImageFormat.SUFFIX_PNG);
        sTypeSuffix.put(0, APImageFormat.SUFFIX_JPG);
        sTypeSuffix.put(2, APImageFormat.SUFFIX_GIF);
        sTypeSuffix.put(4, APImageFormat.SUFFIX_WEBP);
        sTypeSuffix.put(5, APImageFormat.SUFFIX_HEVC);
    }

    public static int detectImageFileType(File file) {
        return a(6, a(file));
    }

    public static int detectImageDataType(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return 6;
        }
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, 8);
        return a(6, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (a(e, r5) != false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int r4, byte[] r5) {
        /*
            r0 = 0
            byte r1 = r5[r0]
            r2 = -119(0xffffffffffffff89, float:NaN)
            r3 = 5
            if (r1 == r2) goto L_0x001a
            r2 = 82
            if (r1 == r2) goto L_0x0038
            r2 = -1
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x004b
            r0 = 71
            if (r1 == r0) goto L_0x002e
            r0 = 72
            if (r1 == r0) goto L_0x0042
            goto L_0x0054
        L_0x001a:
            byte[] r1 = f10477a
            boolean r1 = a((byte[]) r1, (byte[]) r5)
            if (r1 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0054
        L_0x0024:
            byte[] r1 = b
            boolean r1 = a((byte[]) r1, (byte[]) r5)
            if (r1 == 0) goto L_0x002e
            r4 = 0
            goto L_0x0054
        L_0x002e:
            byte[] r0 = c
            boolean r0 = a((byte[]) r0, (byte[]) r5)
            if (r0 == 0) goto L_0x0038
            r4 = 2
            goto L_0x0054
        L_0x0038:
            byte[] r0 = d
            boolean r0 = a((byte[]) r0, (byte[]) r5)
            if (r0 == 0) goto L_0x0042
            r4 = 4
            goto L_0x0054
        L_0x0042:
            byte[] r0 = e
            boolean r0 = a((byte[]) r0, (byte[]) r5)
            if (r0 == 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            byte[] r0 = f
            boolean r5 = a((byte[]) r0, (byte[]) r5)
            if (r5 == 0) goto L_0x0054
        L_0x0053:
            r4 = 5
        L_0x0054:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.meta.ImageFileType.a(int, byte[]):int");
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        boolean z = true;
        for (int i = 1; i < bArr.length && z; i++) {
            z = bArr[i] == bArr2[i];
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.io.File r7) {
        /*
            r0 = 8
            byte[] r0 = new byte[r0]
            if (r7 == 0) goto L_0x0092
            boolean r1 = r7.exists()
            if (r1 == 0) goto L_0x0092
            boolean r1 = r7.isFile()
            if (r1 == 0) goto L_0x0092
            long r1 = r7.length()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0092
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0042, all -> 0x0040 }
            r2.read(r0)     // Catch:{ Exception -> 0x003e }
            boolean r7 = isInMainThread()
            if (r7 == 0) goto L_0x003a
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r7 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT
            java.util.concurrent.Executor r7 = com.alibaba.griver.base.common.executor.GriverExecutors.getExecutor(r7)
            com.alibaba.griver.image.framework.meta.ImageFileType$1 r1 = new com.alibaba.griver.image.framework.meta.ImageFileType$1
            r1.<init>(r2)
        L_0x0036:
            r7.execute(r1)
            goto L_0x0092
        L_0x003a:
            a((java.io.Closeable) r2)
            goto L_0x0092
        L_0x003e:
            r1 = move-exception
            goto L_0x0046
        L_0x0040:
            r7 = move-exception
            goto L_0x0079
        L_0x0042:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x0046:
            java.lang.String r3 = "ImageFileType"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            java.lang.String r5 = "read file: "
            r4.<init>(r5)     // Catch:{ all -> 0x0077 }
            r4.append(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = ", error: "
            r4.append(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = r1.getMessage()     // Catch:{ all -> 0x0077 }
            r4.append(r7)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0077 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r3, r7)     // Catch:{ all -> 0x0077 }
            boolean r7 = isInMainThread()
            if (r7 == 0) goto L_0x003a
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r7 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT
            java.util.concurrent.Executor r7 = com.alibaba.griver.base.common.executor.GriverExecutors.getExecutor(r7)
            com.alibaba.griver.image.framework.meta.ImageFileType$1 r1 = new com.alibaba.griver.image.framework.meta.ImageFileType$1
            r1.<init>(r2)
            goto L_0x0036
        L_0x0077:
            r7 = move-exception
            r1 = r2
        L_0x0079:
            boolean r0 = isInMainThread()
            if (r0 == 0) goto L_0x008e
            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r0 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT
            java.util.concurrent.Executor r0 = com.alibaba.griver.base.common.executor.GriverExecutors.getExecutor(r0)
            com.alibaba.griver.image.framework.meta.ImageFileType$1 r2 = new com.alibaba.griver.image.framework.meta.ImageFileType$1
            r2.<init>(r1)
            r0.execute(r2)
            goto L_0x0091
        L_0x008e:
            a((java.io.Closeable) r1)
        L_0x0091:
            throw r7
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.meta.ImageFileType.a(java.io.File):byte[]");
    }

    public static int detectImageFileType(String str) {
        if (!TextUtils.isEmpty(str)) {
            return detectImageFileType(new File(str));
        }
        return 6;
    }

    public static boolean isJPEG(File file) {
        return detectImageFileType(file) == 0;
    }

    public static boolean isJPEG(byte[] bArr) {
        return detectImageDataType(bArr) == 0;
    }

    public static boolean isGif(byte[] bArr) {
        return detectImageDataType(bArr) == 2;
    }

    public static boolean isGif(File file) {
        return detectImageFileType(file) == 2;
    }

    public static boolean isInMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* access modifiers changed from: private */
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                RVLogger.w("ImageFileType", "closeQuietly error, ".concat(String.valueOf(th)));
            }
        }
    }
}
