package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.GmsLogger;

public final class zzql {
    private static final GmsLogger zzayb = new GmsLogger("MLKitImageUtils", "");
    private static zzql zzbhv = new zzql();

    private zzql() {
    }

    public static zzql zzpi() {
        return zzbhv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r5 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        r8 = android.graphics.Bitmap.createBitmap(r7, 0, 0, r3, r4, r5, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7 == r8) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r5 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap zza(android.content.ContentResolver r8, android.net.Uri r9) throws java.io.IOException {
        /*
            android.graphics.Bitmap r7 = android.provider.MediaStore.Images.Media.getBitmap(r8, r9)     // Catch:{ FileNotFoundException -> 0x005e }
            int r8 = zzb(r8, r9)     // Catch:{ FileNotFoundException -> 0x005e }
            android.graphics.Matrix r0 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x005e }
            r0.<init>()     // Catch:{ FileNotFoundException -> 0x005e }
            int r3 = r7.getWidth()     // Catch:{ FileNotFoundException -> 0x005e }
            int r4 = r7.getHeight()     // Catch:{ FileNotFoundException -> 0x005e }
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r2 = 1119092736(0x42b40000, float:90.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            switch(r8) {
                case 2: goto L_0x0044;
                case 3: goto L_0x003d;
                case 4: goto L_0x0039;
                case 5: goto L_0x0032;
                case 6: goto L_0x002e;
                case 7: goto L_0x0027;
                case 8: goto L_0x0023;
                default: goto L_0x0020;
            }     // Catch:{ FileNotFoundException -> 0x005e }
        L_0x0020:
            r8 = 0
        L_0x0021:
            r5 = r8
            goto L_0x004d
        L_0x0023:
            r0.postRotate(r1)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0042
        L_0x0027:
            r0.postRotate(r1)     // Catch:{ FileNotFoundException -> 0x005e }
            r0.postScale(r5, r6)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0042
        L_0x002e:
            r0.postRotate(r2)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0042
        L_0x0032:
            r0.postRotate(r2)     // Catch:{ FileNotFoundException -> 0x005e }
            r0.postScale(r5, r6)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0042
        L_0x0039:
            r0.postScale(r6, r5)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0042
        L_0x003d:
            r8 = 1127481344(0x43340000, float:180.0)
            r0.postRotate(r8)     // Catch:{ FileNotFoundException -> 0x005e }
        L_0x0042:
            r5 = r0
            goto L_0x004d
        L_0x0044:
            android.graphics.Matrix r8 = new android.graphics.Matrix     // Catch:{ FileNotFoundException -> 0x005e }
            r8.<init>()     // Catch:{ FileNotFoundException -> 0x005e }
            r8.postScale(r5, r6)     // Catch:{ FileNotFoundException -> 0x005e }
            goto L_0x0021
        L_0x004d:
            if (r5 == 0) goto L_0x005d
            r1 = 0
            r2 = 0
            r6 = 1
            r0 = r7
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ FileNotFoundException -> 0x005e }
            if (r7 == r8) goto L_0x005d
            r7.recycle()     // Catch:{ FileNotFoundException -> 0x005e }
            r7 = r8
        L_0x005d:
            return r7
        L_0x005e:
            r8 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = zzayb
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r1 = java.lang.String.valueOf(r9)
            int r1 = r1.length()
            int r1 = r1 + 21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Could not open file: "
            r2.append(r1)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r1 = "MLKitImageUtils"
            r0.e(r1, r9, r8)
            goto L_0x0087
        L_0x0086:
            throw r8
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzql.zza(android.content.ContentResolver, android.net.Uri):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r5 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        throw r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.ContentResolver r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = r6.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r6.getScheme()
            java.lang.String r2 = "file"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x001a
            return r1
        L_0x001a:
            r0 = 0
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch:{ IOException -> 0x003b }
            androidx.exifinterface.media.ExifInterface r2 = new androidx.exifinterface.media.ExifInterface     // Catch:{ all -> 0x002d }
            r2.<init>(r5)     // Catch:{ all -> 0x002d }
            if (r5 == 0) goto L_0x0063
            r5.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r5 = move-exception
            r0 = r2
            goto L_0x003c
        L_0x002d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x002f }
        L_0x002f:
            r3 = move-exception
            if (r5 == 0) goto L_0x003a
            r5.close()     // Catch:{ all -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r5 = move-exception
            com.google.android.gms.internal.firebase_ml.zzmj.zza(r2, r5)     // Catch:{ IOException -> 0x003b }
        L_0x003a:
            throw r3     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            r5 = move-exception
        L_0x003c:
            com.google.android.gms.common.internal.GmsLogger r2 = zzayb
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r3 = java.lang.String.valueOf(r6)
            int r3 = r3.length()
            int r3 = r3 + 48
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "failed to open file to read rotation meta data: "
            r4.append(r3)
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            java.lang.String r3 = "MLKitImageUtils"
            r2.e(r3, r6, r5)
            r2 = r0
        L_0x0063:
            if (r2 != 0) goto L_0x0066
            return r1
        L_0x0066:
            r5 = 1
            java.lang.String r6 = "Orientation"
            int r5 = r2.length((java.lang.String) r6, (int) r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzql.zzb(android.content.ContentResolver, android.net.Uri):int");
    }
}
