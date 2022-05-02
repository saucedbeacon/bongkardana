package com.alibaba.griver.image.framework.encode;

import android.graphics.Bitmap;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.decode.DecodeOptions;
import com.alibaba.griver.image.framework.decode.DecodeResult;
import com.alibaba.griver.image.framework.decode.SystemImageDecoder;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.mode.APMaxLenMode;
import com.alibaba.griver.image.framework.mode.APMinLenMode;
import com.alibaba.griver.image.framework.utils.FileUtils;
import java.io.File;

public class SystemImageEncoder {
    public static APEncodeResult compress(File file, APEncodeOptions aPEncodeOptions) {
        long currentTimeMillis = System.currentTimeMillis();
        APEncodeResult aPEncodeResult = new APEncodeResult();
        if (FileUtils.checkFile(file)) {
            APImageInfo imageInfo = APImageInfo.getImageInfo(file.getAbsolutePath());
            a(SystemImageDecoder.decodeBitmap(file, a(imageInfo, aPEncodeOptions), imageInfo), aPEncodeOptions, imageInfo, aPEncodeResult);
        }
        StringBuilder sb = new StringBuilder("compress file: ");
        sb.append(file);
        sb.append(", options: ");
        sb.append(aPEncodeOptions);
        sb.append(", result: ");
        sb.append(aPEncodeResult);
        sb.append(", cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("SystemImageEncoder", sb.toString());
        return aPEncodeResult;
    }

    public static APEncodeResult compress(Bitmap bitmap, APEncodeOptions aPEncodeOptions) {
        long currentTimeMillis = System.currentTimeMillis();
        APEncodeResult aPEncodeResult = new APEncodeResult();
        if (bitmap != null && !bitmap.isRecycled()) {
            DecodeResult decodeResult = new DecodeResult();
            decodeResult.code = 0;
            decodeResult.bitmap = bitmap;
            a(decodeResult, aPEncodeOptions, APImageInfo.getImageInfo(bitmap, 0), aPEncodeResult);
        }
        StringBuilder sb = new StringBuilder("compress bitmap: ");
        sb.append(bitmap);
        sb.append(", options: ");
        sb.append(aPEncodeOptions);
        sb.append(", result: ");
        sb.append(aPEncodeResult);
        sb.append(", cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("SystemImageEncoder", sb.toString());
        return aPEncodeResult;
    }

    private static DecodeOptions a(APImageInfo aPImageInfo, APEncodeOptions aPEncodeOptions) {
        DecodeOptions decodeOptions = new DecodeOptions();
        int i = aPEncodeOptions.mode.type;
        if (i == 0) {
            decodeOptions.mode = new DecodeOptions.MaxLenMode(Integer.valueOf(((APMaxLenMode) aPEncodeOptions.mode).len));
        } else if (i == 1) {
            decodeOptions.mode = new DecodeOptions.MinLenMode(Integer.valueOf(((APMinLenMode) aPEncodeOptions.mode).len));
        } else if (i != 4) {
            decodeOptions.mode = new DecodeOptions.MaxLenMode(Integer.valueOf(APEncodeOptions.DEFAULT_MAX_LEN));
        } else {
            decodeOptions.mode = new DecodeOptions.MaxLenMode(Integer.valueOf(Math.max(aPImageInfo.width, aPImageInfo.height)));
        }
        return decodeOptions;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.alibaba.griver.image.framework.decode.DecodeResult r10, com.alibaba.griver.image.framework.encode.APEncodeOptions r11, com.alibaba.griver.image.framework.meta.APImageInfo r12, com.alibaba.griver.image.framework.encode.APEncodeResult r13) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "processEncode start decodeResult: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = ", opts: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r2 = ", info: "
            r0.append(r2)
            r0.append(r12)
            java.lang.String r3 = ", encodeResult: "
            r0.append(r3)
            r0.append(r13)
            java.lang.String r4 = ", flag: "
            r0.append(r4)
            boolean r4 = r10.isSuccess()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "SystemImageEncoder"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            boolean r0 = r10.isSuccess()
            if (r0 == 0) goto L_0x00cc
            r0 = 0
            java.lang.String r5 = "processEncode start, options: "
            java.lang.String r6 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00bd }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r5)     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = r11.outputFile     // Catch:{ all -> 0x00bd }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00bd }
            if (r5 != 0) goto L_0x0067
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00bd }
            java.lang.String r6 = r11.outputFile     // Catch:{ all -> 0x00bd }
            r5.<init>(r6)     // Catch:{ all -> 0x00bd }
            java.io.File r6 = r5.getParentFile()     // Catch:{ all -> 0x00bd }
            r6.mkdirs()     // Catch:{ all -> 0x00bd }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bd }
            r6.<init>(r5)     // Catch:{ all -> 0x00bd }
            goto L_0x006c
        L_0x0067:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00bd }
            r6.<init>()     // Catch:{ all -> 0x00bd }
        L_0x006c:
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00ba }
            int r7 = r11.outFormat     // Catch:{ all -> 0x00ba }
            r8 = 1
            if (r7 != r8) goto L_0x0075
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00ba }
        L_0x0075:
            r7 = 50
            int r9 = r11.quality     // Catch:{ all -> 0x00ba }
            if (r9 != r8) goto L_0x007e
            r7 = 90
            goto L_0x008d
        L_0x007e:
            int r8 = r11.quality     // Catch:{ all -> 0x00ba }
            r9 = 4
            if (r8 != r9) goto L_0x0086
            r7 = 10
            goto L_0x008d
        L_0x0086:
            int r8 = r11.quality     // Catch:{ all -> 0x00ba }
            r9 = 3
            if (r8 != r9) goto L_0x008d
            r7 = 100
        L_0x008d:
            android.graphics.Bitmap r8 = r10.bitmap     // Catch:{ all -> 0x00ba }
            boolean r5 = r8.compress(r5, r7, r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "bitmap compress result: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r7.concat(r5)     // Catch:{ all -> 0x00ba }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r5)     // Catch:{ all -> 0x00ba }
            r5 = 0
            r13.code = r5     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r11.outputFile     // Catch:{ all -> 0x00ba }
            r13.encodeFilePath = r5     // Catch:{ all -> 0x00ba }
            boolean r5 = r6 instanceof java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ba }
            if (r5 == 0) goto L_0x00b2
            r0 = r6
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ all -> 0x00ba }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x00ba }
        L_0x00b2:
            r13.encodeData = r0     // Catch:{ all -> 0x00ba }
            r13.imageInfo = r12     // Catch:{ all -> 0x00ba }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r6)
            goto L_0x00cf
        L_0x00ba:
            r5 = move-exception
            r0 = r6
            goto L_0x00be
        L_0x00bd:
            r5 = move-exception
        L_0x00be:
            java.lang.String r6 = "processEncode error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r6, r5)     // Catch:{ all -> 0x00c7 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r0)
            goto L_0x00cf
        L_0x00c7:
            r10 = move-exception
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r0)
            throw r10
        L_0x00cc:
            r0 = -1
            r13.code = r0
        L_0x00cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "processEncode decodeResult: "
            r0.<init>(r5)
            r0.append(r10)
            r0.append(r1)
            r0.append(r11)
            r0.append(r2)
            r0.append(r12)
            r0.append(r3)
            r0.append(r13)
            java.lang.String r10 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.encode.SystemImageEncoder.a(com.alibaba.griver.image.framework.decode.DecodeResult, com.alibaba.griver.image.framework.encode.APEncodeOptions, com.alibaba.griver.image.framework.meta.APImageInfo, com.alibaba.griver.image.framework.encode.APEncodeResult):void");
    }
}
