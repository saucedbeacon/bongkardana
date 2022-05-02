package com.alibaba.griver.image.framework.utils;

import android.media.ExifInterface;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alibaba.griver.image.framework.meta.StaticOptions;
import java.io.File;
import java.io.RandomAccessFile;

public class Exif {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f10480a;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (r3 <= 8) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0067, code lost:
        r2 = a(r11, r1, 4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        if (r2 == 1229531648) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        if (r2 == 1296891946) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.e("CameraExif", "Invalid byte order");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007b, code lost:
        if (r2 != 1229531648) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        r2 = a(r11, r1 + 4, 4, r5) + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0088, code lost:
        if (r2 < 10) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008a, code lost:
        if (r2 <= r3) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
        r1 = r1 + r2;
        r3 = r3 - r2;
        r2 = a(r11, r1 - 2, 2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0095, code lost:
        r4 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        if (r2 <= 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
        if (r3 < 12) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a3, code lost:
        if (a(r11, r1, 2, r5) != 274) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a5, code lost:
        r11 = a(r11, r1 + 8, 2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        switch(r11) {
            case 1: goto L_0x00b3;
            case 2: goto L_0x00b3;
            case 3: goto L_0x00b3;
            case 4: goto L_0x00b3;
            case 5: goto L_0x00b3;
            case 6: goto L_0x00b3;
            case 7: goto L_0x00b3;
            case 8: goto L_0x00b3;
            default: goto L_0x00ad;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ad, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("CameraExif", "Unsupported rotation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b2, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b3, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b4, code lost:
        r1 = r1 + 12;
        r3 = r3 - 12;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ba, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.e("CameraExif", "Invalid offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bf, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c0, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.w("CameraExif", "Orientation not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c5, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getOrientation(byte[] r11) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
        L_0x0005:
            int r2 = r1 + 3
            int r3 = r11.length
            r4 = 4
            r5 = 1
            r6 = 8
            java.lang.String r7 = "CameraExif"
            r8 = 2
            if (r2 >= r3) goto L_0x0064
            int r2 = r1 + 1
            byte r1 = r11[r1]
            r3 = 255(0xff, float:3.57E-43)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x0063
            byte r1 = r11[r2]
            r1 = r1 & r3
            if (r1 == r3) goto L_0x0061
            int r2 = r2 + 1
            r3 = 216(0xd8, float:3.03E-43)
            if (r1 == r3) goto L_0x0061
            if (r1 == r5) goto L_0x0061
            r3 = 217(0xd9, float:3.04E-43)
            if (r1 == r3) goto L_0x0063
            r3 = 218(0xda, float:3.05E-43)
            if (r1 == r3) goto L_0x0063
            int r3 = a((byte[]) r11, (int) r2, (int) r8, (boolean) r0)
            if (r3 < r8) goto L_0x005b
            int r9 = r2 + r3
            int r10 = r11.length
            if (r9 <= r10) goto L_0x003b
            goto L_0x005b
        L_0x003b:
            r10 = 225(0xe1, float:3.15E-43)
            if (r1 != r10) goto L_0x0059
            if (r3 < r6) goto L_0x0059
            int r1 = r2 + 2
            int r1 = a((byte[]) r11, (int) r1, (int) r4, (boolean) r0)
            r10 = 1165519206(0x45786966, float:3974.5874)
            if (r1 != r10) goto L_0x0059
            int r1 = r2 + 6
            int r1 = a((byte[]) r11, (int) r1, (int) r8, (boolean) r0)
            if (r1 != 0) goto L_0x0059
            int r1 = r2 + 8
            int r3 = r3 + -8
            goto L_0x0065
        L_0x0059:
            r1 = r9
            goto L_0x0005
        L_0x005b:
            java.lang.String r11 = "Invalid length"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r7, (java.lang.String) r11)
            return r0
        L_0x0061:
            r1 = r2
            goto L_0x0005
        L_0x0063:
            r1 = r2
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 <= r6) goto L_0x00c0
            int r2 = a((byte[]) r11, (int) r1, (int) r4, (boolean) r0)
            r9 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r9) goto L_0x007b
            r10 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r2 == r10) goto L_0x007b
            java.lang.String r11 = "Invalid byte order"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r7, (java.lang.String) r11)
            return r0
        L_0x007b:
            if (r2 != r9) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r5 = 0
        L_0x007f:
            int r2 = r1 + 4
            int r2 = a((byte[]) r11, (int) r2, (int) r4, (boolean) r5)
            int r2 = r2 + r8
            r4 = 10
            if (r2 < r4) goto L_0x00ba
            if (r2 <= r3) goto L_0x008d
            goto L_0x00ba
        L_0x008d:
            int r1 = r1 + r2
            int r3 = r3 - r2
            int r2 = r1 + -2
            int r2 = a((byte[]) r11, (int) r2, (int) r8, (boolean) r5)
        L_0x0095:
            int r4 = r2 + -1
            if (r2 <= 0) goto L_0x00c0
            r2 = 12
            if (r3 < r2) goto L_0x00c0
            int r2 = a((byte[]) r11, (int) r1, (int) r8, (boolean) r5)
            r9 = 274(0x112, float:3.84E-43)
            if (r2 != r9) goto L_0x00b4
            int r1 = r1 + r6
            int r11 = a((byte[]) r11, (int) r1, (int) r8, (boolean) r5)
            switch(r11) {
                case 1: goto L_0x00b3;
                case 2: goto L_0x00b3;
                case 3: goto L_0x00b3;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00b3;
                case 7: goto L_0x00b3;
                case 8: goto L_0x00b3;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            java.lang.String r11 = "Unsupported rotation"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r11)
            return r0
        L_0x00b3:
            return r11
        L_0x00b4:
            int r1 = r1 + 12
            int r3 = r3 + -12
            r2 = r4
            goto L_0x0095
        L_0x00ba:
            java.lang.String r11 = "Invalid offset"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r7, (java.lang.String) r11)
            return r0
        L_0x00c0:
            java.lang.String r11 = "Orientation not found"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r7, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.Exif.getOrientation(byte[]):int");
    }

    private static int a(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        byte b = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return b;
            }
            b = (bArr[i] & 255) | (b << 8);
            i += i3;
            i2 = i4;
        }
    }

    public static int getOrientation(String str) {
        if (!FileUtils.checkFile(str)) {
            return 1;
        }
        if (!StaticOptions.useRandomAccessFileExif || !isCanUseRandomAccessFileExif()) {
            return a(str);
        }
        return b(str);
    }

    private static int a(String str) {
        if (!ImageFileType.isJPEG(new File(str))) {
            return 1;
        }
        try {
            return new ExifInterface(str).getAttributeInt("Orientation", 1);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("getOrientationByExifInterface error, path: ");
            sb.append(str);
            sb.append(", e: ");
            sb.append(th);
            RVLogger.w("CameraExif", sb.toString());
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.e("CameraExif", "Invalid length");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b8, code lost:
        r1 = a(r3, r5 + 8, 2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bd, code lost:
        switch(r1) {
            case 1: goto L_0x00c1;
            case 2: goto L_0x00c1;
            case 3: goto L_0x00c1;
            case 4: goto L_0x00c1;
            case 5: goto L_0x00c1;
            case 6: goto L_0x00c1;
            case 7: goto L_0x00c1;
            case 8: goto L_0x00c1;
            default: goto L_0x00c0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c1, code lost:
        com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("CameraExif", "Unsupported rotation");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cd, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(java.lang.String r14) {
        /*
            java.lang.String r0 = "CameraExif"
            r1 = 1
            r2 = 0
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            java.lang.String r4 = "r"
            r3.<init>(r14, r4)     // Catch:{ Exception -> 0x00e7, all -> 0x00e5 }
            long r4 = r3.length()     // Catch:{ Exception -> 0x00e3 }
            int r2 = (int) r4     // Catch:{ Exception -> 0x00e3 }
            r4 = 0
            r5 = 0
        L_0x0012:
            int r6 = r5 + 3
            r7 = 4
            r8 = 8
            r9 = 2
            if (r6 >= r2) goto L_0x0073
            int r6 = r5 + 1
            byte r5 = a(r3, r5)     // Catch:{ Exception -> 0x00e3 }
            r10 = 255(0xff, float:3.57E-43)
            r5 = r5 & r10
            if (r5 != r10) goto L_0x0072
            byte r5 = a(r3, r6)     // Catch:{ Exception -> 0x00e3 }
            r5 = r5 & r10
            if (r5 == r10) goto L_0x0070
            int r6 = r6 + 1
            r10 = 216(0xd8, float:3.03E-43)
            if (r5 == r10) goto L_0x0070
            if (r5 == r1) goto L_0x0070
            r10 = 217(0xd9, float:3.04E-43)
            if (r5 == r10) goto L_0x0072
            r10 = 218(0xda, float:3.05E-43)
            if (r5 == r10) goto L_0x0072
            int r10 = a((java.io.RandomAccessFile) r3, (int) r6, (int) r9, (boolean) r4)     // Catch:{ Exception -> 0x00e3 }
            if (r10 < r9) goto L_0x0067
            int r11 = r6 + r10
            if (r11 <= r2) goto L_0x0047
            goto L_0x0067
        L_0x0047:
            r12 = 225(0xe1, float:3.15E-43)
            if (r5 != r12) goto L_0x0065
            if (r10 < r8) goto L_0x0065
            int r5 = r6 + 2
            int r5 = a((java.io.RandomAccessFile) r3, (int) r5, (int) r7, (boolean) r4)     // Catch:{ Exception -> 0x00e3 }
            r12 = 1165519206(0x45786966, float:3974.5874)
            if (r5 != r12) goto L_0x0065
            int r5 = r6 + 6
            int r5 = a((java.io.RandomAccessFile) r3, (int) r5, (int) r9, (boolean) r4)     // Catch:{ Exception -> 0x00e3 }
            if (r5 != 0) goto L_0x0065
            int r5 = r6 + 8
            int r10 = r10 + -8
            goto L_0x0074
        L_0x0065:
            r5 = r11
            goto L_0x0012
        L_0x0067:
            java.lang.String r2 = "Invalid length"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x00e3 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            return r4
        L_0x0070:
            r5 = r6
            goto L_0x0012
        L_0x0072:
            r5 = r6
        L_0x0073:
            r10 = 0
        L_0x0074:
            if (r10 <= r8) goto L_0x00dd
            int r2 = a((java.io.RandomAccessFile) r3, (int) r5, (int) r7, (boolean) r4)     // Catch:{ Exception -> 0x00e3 }
            r6 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r6) goto L_0x008d
            r11 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r2 == r11) goto L_0x008d
            java.lang.String r2 = "Invalid byte order"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x00e3 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            return r4
        L_0x008d:
            if (r2 != r6) goto L_0x0091
            r2 = 1
            goto L_0x0092
        L_0x0091:
            r2 = 0
        L_0x0092:
            int r6 = r5 + 4
            int r6 = a((java.io.RandomAccessFile) r3, (int) r6, (int) r7, (boolean) r2)     // Catch:{ Exception -> 0x00e3 }
            int r6 = r6 + r9
            r7 = 10
            if (r6 < r7) goto L_0x00d4
            if (r6 <= r10) goto L_0x00a0
            goto L_0x00d4
        L_0x00a0:
            int r5 = r5 + r6
            int r10 = r10 - r6
            int r6 = r5 + -2
            int r6 = a((java.io.RandomAccessFile) r3, (int) r6, (int) r9, (boolean) r2)     // Catch:{ Exception -> 0x00e3 }
        L_0x00a8:
            int r7 = r6 + -1
            if (r6 <= 0) goto L_0x00dd
            r6 = 12
            if (r10 < r6) goto L_0x00dd
            int r6 = a((java.io.RandomAccessFile) r3, (int) r5, (int) r9, (boolean) r2)     // Catch:{ Exception -> 0x00e3 }
            r11 = 274(0x112, float:3.84E-43)
            if (r6 != r11) goto L_0x00ce
            int r5 = r5 + r8
            int r1 = a((java.io.RandomAccessFile) r3, (int) r5, (int) r9, (boolean) r2)     // Catch:{ Exception -> 0x00e3 }
            switch(r1) {
                case 1: goto L_0x00c1;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00c1;
                case 8: goto L_0x00c1;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            goto L_0x00c5
        L_0x00c1:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            return r1
        L_0x00c5:
            java.lang.String r2 = "Unsupported rotation"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r2)     // Catch:{ Exception -> 0x00e3 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            return r4
        L_0x00ce:
            int r5 = r5 + 12
            int r10 = r10 + -12
            r6 = r7
            goto L_0x00a8
        L_0x00d4:
            java.lang.String r2 = "Invalid offset"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x00e3 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            return r4
        L_0x00dd:
            java.lang.String r2 = "Orientation not found"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r2)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x00f8
        L_0x00e3:
            r2 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r14 = move-exception
            goto L_0x00fe
        L_0x00e7:
            r3 = move-exception
            r13 = r3
            r3 = r2
            r2 = r13
        L_0x00eb:
            java.lang.String r4 = "parse exif error, path: "
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00fc }
            java.lang.String r14 = r4.concat(r14)     // Catch:{ all -> 0x00fc }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r14, r2)     // Catch:{ all -> 0x00fc }
        L_0x00f8:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            return r1
        L_0x00fc:
            r14 = move-exception
            r2 = r3
        L_0x00fe:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r2)
            goto L_0x0103
        L_0x0102:
            throw r14
        L_0x0103:
            goto L_0x0102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.utils.Exif.b(java.lang.String):int");
    }

    private static int a(RandomAccessFile randomAccessFile, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        byte b = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return b;
            }
            b = (a(randomAccessFile, i) & 255) | (b << 8);
            i += i3;
            i2 = i4;
        }
    }

    private static byte a(RandomAccessFile randomAccessFile, int i) {
        randomAccessFile.seek((long) i);
        return randomAccessFile.readByte();
    }

    public static boolean isCanUseRandomAccessFileExif() {
        if (f10480a == null) {
            f10480a = Boolean.TRUE;
        }
        return f10480a.booleanValue();
    }
}
