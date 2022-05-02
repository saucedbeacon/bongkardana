package com.alibaba.griver.image.framework.decode;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.meta.APImageInfo;
import com.alibaba.griver.image.framework.utils.FileUtils;
import java.io.File;

public class SystemImageDecoder {
    public static DecodeResult decodeBitmap(File file, DecodeOptions decodeOptions, APImageInfo aPImageInfo) {
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult decodeResult = new DecodeResult();
        if (FileUtils.checkFile(file)) {
            decodeResult = InnerDecoder.decodeFile(file, decodeOptions, aPImageInfo);
            a(decodeResult, decodeOptions, aPImageInfo);
            decodeResult.srcInfo = aPImageInfo;
        } else {
            decodeResult.code = -1;
        }
        StringBuilder sb = new StringBuilder("decodeBitmap file: ");
        sb.append(file);
        sb.append(", options: ");
        sb.append(decodeOptions);
        sb.append(", result: ");
        sb.append(decodeResult);
        sb.append(", cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("SystemImageDecoder", sb.toString());
        return decodeResult;
    }

    public static DecodeResult decodeBitmap(byte[] bArr, DecodeOptions decodeOptions) {
        long currentTimeMillis = System.currentTimeMillis();
        DecodeResult decodeResult = new DecodeResult();
        if (bArr == null || bArr.length <= 0) {
            decodeResult.code = -1;
        } else {
            APImageInfo imageInfo = APImageInfo.getImageInfo(bArr);
            DecodeResult decodeByteArray = InnerDecoder.decodeByteArray(bArr, imageInfo, decodeOptions);
            a(decodeByteArray, decodeOptions, imageInfo);
            decodeByteArray.srcInfo = imageInfo;
            decodeResult = decodeByteArray;
        }
        StringBuilder sb = new StringBuilder("decodeBitmap data: ");
        sb.append(bArr);
        sb.append(", options: ");
        sb.append(decodeOptions);
        sb.append(", result: ");
        sb.append(decodeResult);
        sb.append(", cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("SystemImageDecoder", sb.toString());
        return decodeResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.alibaba.griver.image.framework.decode.DecodeResult r11, com.alibaba.griver.image.framework.decode.DecodeOptions r12, com.alibaba.griver.image.framework.meta.APImageInfo r13) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "doImageDecodeProcess result: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = ", options: "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", info: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SystemImageDecoder"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r0)
            boolean r0 = r11.isSuccess()
            if (r0 == 0) goto L_0x00dc
            android.graphics.Bitmap r0 = r11.bitmap
            int r2 = r13.rotation
            int r13 = r13.rotation
            r9 = 0
            if (r13 > 0) goto L_0x0043
            java.lang.Integer r13 = r12.forceRotate
            if (r13 == 0) goto L_0x003e
            java.lang.Integer r13 = r12.forceRotate
            int r13 = r13.intValue()
            if (r13 != 0) goto L_0x0043
        L_0x003e:
            r11.code = r9
            r11.bitmap = r0
            return
        L_0x0043:
            android.graphics.Matrix r13 = new android.graphics.Matrix
            r13.<init>()
            java.lang.Integer r3 = r12.forceRotate
            if (r3 == 0) goto L_0x0052
            java.lang.Integer r12 = r12.forceRotate
            int r2 = r12.intValue()
        L_0x0052:
            float r12 = (float) r2
            r13.postRotate(r12)
            r12 = 0
        L_0x0057:
            int r10 = r12 + 1
            r2 = 5
            if (r12 >= r2) goto L_0x00dc
            r3 = 0
            r4 = 0
            int r5 = r0.getWidth()     // Catch:{ all -> 0x0075 }
            int r6 = r0.getHeight()     // Catch:{ all -> 0x0075 }
            r8 = 1
            r2 = r0
            r7 = r13
            android.graphics.Bitmap r12 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0075 }
            r11.code = r9     // Catch:{ all -> 0x0075 }
            r11.bitmap = r12     // Catch:{ all -> 0x0075 }
            r0.recycle()     // Catch:{ all -> 0x0075 }
            return
        L_0x0075:
            r12 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r2 = "processBitmap process bitmap error, t: "
            java.lang.String r12 = r2.concat(r12)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r12)
            r12 = -1
            r11.code = r12
            java.lang.String r12 = "processBitmap degrade, scale: 0.5"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r12)
            r12 = 1056964608(0x3f000000, float:0.5)
            r13.postScale(r12, r12)
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = (double) r10
            double r2 = java.lang.Math.pow(r2, r4)
            float r12 = (float) r2
            int r2 = r0.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r12
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00cb
            int r2 = r0.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r12
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00b0
            goto L_0x00cb
        L_0x00b0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "doImageDecodeProcess targetScale: "
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r12 = ", times: "
            r2.append(r12)
            r2.append(r10)
            java.lang.String r12 = r2.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r12)
            r12 = r10
            goto L_0x0057
        L_0x00cb:
            android.graphics.Bitmap r12 = r11.bitmap
            if (r12 == 0) goto L_0x00dc
            android.graphics.Bitmap r12 = r11.bitmap
            boolean r12 = r12.isRecycled()
            if (r12 != 0) goto L_0x00dc
            android.graphics.Bitmap r11 = r11.bitmap
            r11.recycle()
        L_0x00dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.decode.SystemImageDecoder.a(com.alibaba.griver.image.framework.decode.DecodeResult, com.alibaba.griver.image.framework.decode.DecodeOptions, com.alibaba.griver.image.framework.meta.APImageInfo):void");
    }
}
