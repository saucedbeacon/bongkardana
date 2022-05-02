package o;

import android.graphics.BitmapFactory;

public final class getUniqueKey {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getMax(java.io.File r9, int r10, int r11, android.graphics.Bitmap.CompressFormat r12, int r13, java.lang.String r14) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r14)
            java.io.File r0 = r0.getParentFile()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0012
            r0.mkdirs()
        L_0x0012:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0088 }
            r1.<init>(r14)     // Catch:{ all -> 0x0088 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0085 }
            r0.<init>()     // Catch:{ all -> 0x0085 }
            r2 = 1
            r0.inJustDecodeBounds = r2     // Catch:{ all -> 0x0085 }
            java.lang.String r2 = r9.getAbsolutePath()     // Catch:{ all -> 0x0085 }
            android.graphics.BitmapFactory.decodeFile(r2, r0)     // Catch:{ all -> 0x0085 }
            int r10 = length(r0, r10, r11)     // Catch:{ all -> 0x0085 }
            r0.inSampleSize = r10     // Catch:{ all -> 0x0085 }
            r10 = 0
            r0.inJustDecodeBounds = r10     // Catch:{ all -> 0x0085 }
            java.lang.String r11 = r9.getAbsolutePath()     // Catch:{ all -> 0x0085 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r11, r0)     // Catch:{ all -> 0x0085 }
            android.media.ExifInterface r11 = new android.media.ExifInterface     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = r9.getAbsolutePath()     // Catch:{ all -> 0x0085 }
            r11.<init>(r9)     // Catch:{ all -> 0x0085 }
            java.lang.String r9 = "Orientation"
            int r9 = r11.getAttributeInt(r9, r10)     // Catch:{ all -> 0x0085 }
            android.graphics.Matrix r7 = new android.graphics.Matrix     // Catch:{ all -> 0x0085 }
            r7.<init>()     // Catch:{ all -> 0x0085 }
            r10 = 6
            if (r9 != r10) goto L_0x0055
            r9 = 1119092736(0x42b40000, float:90.0)
            r7.postRotate(r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0067
        L_0x0055:
            r10 = 3
            if (r9 != r10) goto L_0x005e
            r9 = 1127481344(0x43340000, float:180.0)
            r7.postRotate(r9)     // Catch:{ all -> 0x0085 }
            goto L_0x0067
        L_0x005e:
            r10 = 8
            if (r9 != r10) goto L_0x0067
            r9 = 1132920832(0x43870000, float:270.0)
            r7.postRotate(r9)     // Catch:{ all -> 0x0085 }
        L_0x0067:
            r3 = 0
            r4 = 0
            int r5 = r2.getWidth()     // Catch:{ all -> 0x0085 }
            int r6 = r2.getHeight()     // Catch:{ all -> 0x0085 }
            r8 = 1
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0085 }
            r9.compress(r12, r13, r1)     // Catch:{ all -> 0x0085 }
            r1.flush()
            r1.close()
            java.io.File r9 = new java.io.File
            r9.<init>(r14)
            return r9
        L_0x0085:
            r9 = move-exception
            r0 = r1
            goto L_0x0089
        L_0x0088:
            r9 = move-exception
        L_0x0089:
            if (r0 == 0) goto L_0x0091
            r0.flush()
            r0.close()
        L_0x0091:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getUniqueKey.getMax(java.io.File, int, int, android.graphics.Bitmap$CompressFormat, int, java.lang.String):java.io.File");
    }

    private static int length(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
