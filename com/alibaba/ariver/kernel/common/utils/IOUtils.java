package com.alibaba.ariver.kernel.common.utils;

import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.io.ByteArrayPool;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOUtils {
    public static final int MAP_FILE_THRESHOLD_MIN = 65536;
    public static final int MAP_FILE_THRESHOOLD_MAX = 5242880;

    /* renamed from: a  reason: collision with root package name */
    private static final ByteArrayPool f9025a = new ByteArrayPool(CacheDataSink.DEFAULT_BUFFER_SIZE);
    public static final int getMax = 70;
    public static final byte[] getMin = {115, -111, -112, 70, Ascii.FF, -13, 0, -33, 37, 9, -13, -2, 17, -50, 51, -15, 0, -1, 13};
    private static int setMax = 0;
    private static int setMin = 1;

    public static ByteArrayPool getByteArrayPool() {
        return f9025a;
    }

    public static byte[] getBuf(int i) {
        return getByteArrayPool().getBuf(i);
    }

    public static void returnBuf(byte[] bArr) {
        getByteArrayPool().returnBuf(bArr);
    }

    public static boolean isNIOEnabled() {
        return "yes".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_nebulaUseNIO", "no"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b A[Catch:{ all -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void freeMappedBuffer(java.nio.MappedByteBuffer r10) {
        /*
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = "java.nio.NioUtils"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0056 }
            byte[] r1 = getMin     // Catch:{ all -> 0x0056 }
            r2 = 6
            byte r1 = r1[r2]     // Catch:{ all -> 0x0056 }
            byte r1 = (byte) r1     // Catch:{ all -> 0x0056 }
            byte r2 = (byte) r1     // Catch:{ all -> 0x0056 }
            byte r3 = (byte) r2     // Catch:{ all -> 0x0056 }
            int r3 = r3 * 4
            int r3 = 4 - r3
            byte[] r4 = getMin     // Catch:{ all -> 0x0056 }
            int r2 = r2 * 4
            int r2 = r2 + 16
            int r1 = r1 * 2
            int r1 = 102 - r1
            byte[] r5 = new byte[r2]     // Catch:{ all -> 0x0056 }
            r6 = -1
            int r2 = r2 + r6
            r7 = 1
            if (r4 != 0) goto L_0x0029
            r1 = r2
            r8 = r3
            goto L_0x0050
        L_0x0029:
            int r6 = r6 + r7
            byte r8 = (byte) r1     // Catch:{ all -> 0x0056 }
            r5[r6] = r8     // Catch:{ all -> 0x0056 }
            if (r6 != r2) goto L_0x004b
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0056 }
            r2 = 0
            r1.<init>(r5, r2)     // Catch:{ all -> 0x0056 }
            java.lang.Class[] r3 = new java.lang.Class[r7]     // Catch:{ all -> 0x0056 }
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            r3[r2] = r4     // Catch:{ all -> 0x0056 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch:{ all -> 0x0056 }
            r0.setAccessible(r7)     // Catch:{ all -> 0x0056 }
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0056 }
            r3[r2] = r10     // Catch:{ all -> 0x0056 }
            r0.invoke(r1, r3)     // Catch:{ all -> 0x0056 }
            return
        L_0x004b:
            byte r8 = r4[r3]     // Catch:{ all -> 0x0056 }
            r9 = r2
            r2 = r1
            r1 = r9
        L_0x0050:
            int r3 = r3 + r7
            int r2 = r2 + r8
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x0029
        L_0x0056:
            r10 = move-exception
            java.lang.String r0 = "AriverKernel"
            java.lang.String r1 = "freeMappedBuffer Exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.IOUtils.freeMappedBuffer(java.nio.MappedByteBuffer):void");
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                RVLogger.e("close stream exception", (Throwable) e);
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) {
        copy(inputStream, outputStream, 4096);
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i) {
        byte[] buf = getBuf(i);
        while (true) {
            int read = inputStream.read(buf);
            if (-1 != read) {
                outputStream.write(buf, 0, read);
            } else {
                return;
            }
        }
    }

    public static byte[] readToByte(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 2048);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Exception e) {
                RVLogger.e("read exception", (Throwable) e);
            } catch (Throwable th) {
                closeQuietly(inputStream);
                throw th;
            }
        }
        closeQuietly(inputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String read(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return new String(readToByte(inputStream));
    }

    public static String read(String str) {
        try {
            return read((InputStream) new FileInputStream(str));
        } catch (Exception e) {
            RVLogger.e("read exception", (Throwable) e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readAsset(android.content.res.Resources r8, java.lang.String r9) {
        /*
            int r0 = setMax     // Catch:{ Exception -> 0x0085 }
            int r0 = r0 + 3
            int r1 = r0 % 128
            setMin = r1     // Catch:{ Exception -> 0x0083 }
            r1 = 2
            int r0 = r0 % r1
            r0 = 0
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0067 }
            r3 = 1
            r2[r3] = r9     // Catch:{ all -> 0x0067 }
            r9 = 0
            r2[r9] = r8     // Catch:{ all -> 0x0067 }
            int r8 = android.graphics.Color.argb(r9, r9, r9, r9)     // Catch:{ all -> 0x0067 }
            int r8 = 19 - r8
            int r4 = android.graphics.Color.red(r9)     // Catch:{ all -> 0x0067 }
            r5 = 56347(0xdc1b, float:7.8959E-41)
            float r6 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x0067 }
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            int r6 = r6 + r5
            char r5 = (char) r6     // Catch:{ all -> 0x0067 }
            java.lang.Object r8 = o.upFrom.setMax(r8, r4, r5)     // Catch:{ all -> 0x0067 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = "getMin"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0067 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r5[r9] = r6     // Catch:{ all -> 0x0067 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r3] = r6     // Catch:{ all -> 0x0067 }
            java.lang.reflect.Method r8 = r8.getMethod(r4, r5)     // Catch:{ all -> 0x0067 }
            java.lang.Object r8 = r8.invoke(r0, r2)     // Catch:{ all -> 0x0067 }
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch:{ all -> 0x0067 }
            java.lang.String r2 = read((java.io.InputStream) r8)     // Catch:{ IOException -> 0x0065 }
            closeQuietly(r8)
            int r8 = setMin
            int r8 = r8 + 11
            int r4 = r8 % 128
            setMax = r4
            int r8 = r8 % r1
            if (r8 == 0) goto L_0x005c
            r9 = 1
        L_0x005c:
            if (r9 == r3) goto L_0x005f
            return r2
        L_0x005f:
            super.hashCode()     // Catch:{ all -> 0x0063 }
            return r2
        L_0x0063:
            r8 = move-exception
            throw r8
        L_0x0065:
            r9 = move-exception
            goto L_0x0074
        L_0x0067:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            if (r9 == 0) goto L_0x006f
            throw r9     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
        L_0x006f:
            throw r8     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
        L_0x0070:
            r9 = move-exception
            goto L_0x007f
        L_0x0072:
            r9 = move-exception
            r8 = r0
        L_0x0074:
            java.lang.String r1 = "read asset exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r1, (java.lang.Throwable) r9)     // Catch:{ all -> 0x007d }
            closeQuietly(r8)
            return r0
        L_0x007d:
            r9 = move-exception
            r0 = r8
        L_0x007f:
            closeQuietly(r0)
            throw r9
        L_0x0083:
            r8 = move-exception
            throw r8
        L_0x0085:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.IOUtils.readAsset(android.content.res.Resources, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[SYNTHETIC, Splitter:B:20:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.io.File r4 = r0.getParentFile()
            boolean r4 = r4.exists()
            if (r4 != 0) goto L_0x0016
            java.io.File r4 = r0.getParentFile()
            r4.mkdirs()
        L_0x0016:
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x001f
            r0.createNewFile()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r4 = 0
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x003b }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x003b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x003b }
            r3.<init>(r0, r6)     // Catch:{ all -> 0x003b }
            r2.<init>(r3)     // Catch:{ all -> 0x003b }
            r1.<init>(r2)     // Catch:{ all -> 0x003b }
            r1.write(r5)     // Catch:{ all -> 0x0039 }
            r1.flush()     // Catch:{ IOException -> 0x0038 }
            r1.close()     // Catch:{ IOException -> 0x0038 }
        L_0x0038:
            return
        L_0x0039:
            r4 = move-exception
            goto L_0x003e
        L_0x003b:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            r1.flush()     // Catch:{ IOException -> 0x0046 }
            r1.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.IOUtils.write(java.lang.String, java.lang.String, boolean):void");
    }
}
