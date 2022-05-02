package com.google.android.gms.internal.firebase_ml;

import android.annotation.TargetApi;
import android.media.Image;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class zzqk {
    private static final zzqk zzbhu = new zzqk();

    private zzqk() {
    }

    public static zzqk zzph() {
        return zzbhu;
    }

    public static byte[] zza(@NonNull ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        zza(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] zza(@androidx.annotation.NonNull byte[] r7, int r8, int r9) {
        /*
            android.graphics.YuvImage r6 = new android.graphics.YuvImage
            r2 = 17
            r5 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x002e }
            r0.<init>()     // Catch:{ IOException -> 0x002e }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ all -> 0x0027 }
            r2 = 0
            r1.<init>(r2, r2, r8, r9)     // Catch:{ all -> 0x0027 }
            r8 = 100
            r6.compressToJpeg(r1, r8, r0)     // Catch:{ all -> 0x0027 }
            byte[] r8 = r0.toByteArray()     // Catch:{ all -> 0x0027 }
            zza(r7, r0)     // Catch:{ IOException -> 0x0025 }
            goto L_0x0036
        L_0x0025:
            r7 = r8
            goto L_0x002e
        L_0x0027:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r9 = move-exception
            zza(r8, r0)     // Catch:{ IOException -> 0x002e }
            throw r9     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            java.lang.String r8 = "ImageConvertUtils"
            java.lang.String r9 = "Error closing ByteArrayOutputStream"
            android.util.Log.w(r8, r9)
            r8 = r7
        L_0x0036:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqk.zza(byte[], int, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        zza(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] zza(@androidx.annotation.NonNull android.graphics.Bitmap r4) {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x001e }
            r1.<init>()     // Catch:{ IOException -> 0x001e }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0017 }
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch:{ all -> 0x0017 }
            byte[] r4 = r1.toByteArray()     // Catch:{ all -> 0x0017 }
            zza(r0, r1)     // Catch:{ IOException -> 0x0015 }
            goto L_0x0026
        L_0x0015:
            r0 = r4
            goto L_0x001e
        L_0x0017:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            zza(r4, r1)     // Catch:{ IOException -> 0x001e }
            throw r2     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            java.lang.String r4 = "ImageConvertUtils"
            java.lang.String r1 = "Error closing ByteArrayOutputStream"
            android.util.Log.w(r4, r1)
            r4 = r0
        L_0x0026:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqk.zza(android.graphics.Bitmap):byte[]");
    }

    @TargetApi(19)
    public static ByteBuffer zza(Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr = new byte[(((i3 / 4) * 2) + i3)];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i4 = (i3 * 2) / 4;
        boolean z = buffer2.remaining() == i4 + -2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i4 - 1);
        } else {
            int i5 = i;
            int i6 = i2;
            byte[] bArr2 = bArr;
            zza(planeArr[0], i5, i6, bArr2, 0, 1);
            zza(planeArr[1], i5, i6, bArr2, i3 + 1, 2);
            zza(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }

    @TargetApi(19)
    private static void zza(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        int position = buffer.position();
        int remaining = ((buffer.remaining() + plane.getRowStride()) - 1) / plane.getRowStride();
        int i5 = i / (i2 / remaining);
        int i6 = 0;
        for (int i7 = 0; i7 < remaining; i7++) {
            int i8 = i6;
            for (int i9 = 0; i9 < i5; i9++) {
                bArr[i3] = buffer.get(i8);
                i3 += i4;
                i8 += plane.getPixelStride();
            }
            i6 += plane.getRowStride();
        }
        buffer.position(position);
    }

    public static byte[] zzf(byte[] bArr) {
        int length = bArr.length;
        int i = length / 6;
        byte[] bArr2 = new byte[length];
        int i2 = i << 2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (int i3 = 0; i3 < (i << 1); i3++) {
            bArr2[i2 + i3] = bArr[((i3 % 2) * i) + i2 + (i3 / 2)];
        }
        return bArr2;
    }

    private static /* synthetic */ void zza(Throwable th, ByteArrayOutputStream byteArrayOutputStream) {
        if (th != null) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                zzmj.zza(th, th2);
            }
        } else {
            byteArrayOutputStream.close();
        }
    }
}
