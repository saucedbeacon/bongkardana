package com.mixpanel.android.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.LruCache;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.onFocusSearchFailed;
import o.shouldMeasureTwice;

public class ImageStore {
    public static LruCache<String, Bitmap> length;
    private final shouldMeasureTwice getMax;
    private final File getMin;
    private final MessageDigest setMax;
    private final RemoteService setMin;

    public static class CantGetImageException extends Exception {
        public CantGetImageException(String str) {
            super(str);
        }

        public CantGetImageException(String str, Throwable th) {
            super(str, th);
        }
    }

    public ImageStore(Context context, String str) {
        this(context, "MixpanelAPI.Images.".concat(String.valueOf(str)), new onFocusSearchFailed());
    }

    private ImageStore(Context context, String str, RemoteService remoteService) {
        MessageDigest messageDigest;
        this.getMin = context.getDir(str, 0);
        this.setMin = remoteService;
        this.getMax = shouldMeasureTwice.getMax(context);
        try {
            messageDigest = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused) {
            findOnePartiallyOrCompletelyInvisibleChild.isInside();
            messageDigest = null;
        }
        this.setMax = messageDigest;
        if (length == null) {
            synchronized (ImageStore.class) {
                if (length == null) {
                    length = new LruCache<String, Bitmap>(((int) (Runtime.getRuntime().maxMemory() / ConvertUtils.KB)) / this.getMax.toString) {
                        /* access modifiers changed from: protected */
                        public final /* synthetic */ int sizeOf(Object obj, Object obj2) {
                            Bitmap bitmap = (Bitmap) obj2;
                            return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
                        }
                    };
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x006f A[SYNTHETIC, Splitter:B:39:0x006f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File setMin(java.lang.String r5) throws com.mixpanel.android.util.ImageStore.CantGetImageException {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0007
            int r0 = r5.length()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            int r1 = o.dispatchOnCancelled.setMax(r0)
            if (r0 == r1) goto L_0x001d
            o.onCanceled r2 = new o.onCanceled
            r3 = 1
            r2.<init>(r0, r1, r3)
            r0 = 1880417404(0x7014e47c, float:1.8432E29)
            o.onCancelLoad.setMax(r0, r2)
            o.onCancelLoad.getMin(r0, r2)
        L_0x001d:
            java.io.File r0 = r4.getMax(r5)
            if (r0 == 0) goto L_0x0029
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0077
        L_0x0029:
            o.shouldMeasureTwice r1 = r4.getMax     // Catch:{ IOException -> 0x0081, ServiceUnavailableException -> 0x0078 }
            javax.net.ssl.SSLSocketFactory r1 = r1.values()     // Catch:{ IOException -> 0x0081, ServiceUnavailableException -> 0x0078 }
            com.mixpanel.android.util.RemoteService r2 = r4.setMin     // Catch:{ IOException -> 0x0081, ServiceUnavailableException -> 0x0078 }
            r3 = 0
            byte[] r5 = r2.getMax(r5, r3, r1)     // Catch:{ IOException -> 0x0081, ServiceUnavailableException -> 0x0078 }
            if (r5 == 0) goto L_0x0077
            if (r0 == 0) goto L_0x0077
            int r1 = r5.length
            r2 = 10000000(0x989680, float:1.4012985E-38)
            if (r1 >= r2) goto L_0x0077
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x005b }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0064, IOException -> 0x005b }
            r1.write(r5)     // Catch:{ FileNotFoundException -> 0x0056, IOException -> 0x0053, all -> 0x0050 }
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0077
        L_0x004c:
            o.findOnePartiallyOrCompletelyInvisibleChild.toIntRange()
            goto L_0x0077
        L_0x0050:
            r5 = move-exception
            r3 = r1
            goto L_0x006d
        L_0x0053:
            r5 = move-exception
            r3 = r1
            goto L_0x005c
        L_0x0056:
            r5 = move-exception
            r3 = r1
            goto L_0x0065
        L_0x0059:
            r5 = move-exception
            goto L_0x006d
        L_0x005b:
            r5 = move-exception
        L_0x005c:
            com.mixpanel.android.util.ImageStore$CantGetImageException r0 = new com.mixpanel.android.util.ImageStore$CantGetImageException     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "Can't store bitmap"
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0064:
            r5 = move-exception
        L_0x0065:
            com.mixpanel.android.util.ImageStore$CantGetImageException r0 = new com.mixpanel.android.util.ImageStore$CantGetImageException     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = "It appears that ImageStore is misconfigured, or disk storage is unavailable- can't write to bitmap directory"
            r0.<init>(r1, r5)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x006d:
            if (r3 == 0) goto L_0x0076
            r3.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0076
        L_0x0073:
            o.findOnePartiallyOrCompletelyInvisibleChild.toIntRange()
        L_0x0076:
            throw r5
        L_0x0077:
            return r0
        L_0x0078:
            r5 = move-exception
            com.mixpanel.android.util.ImageStore$CantGetImageException r0 = new com.mixpanel.android.util.ImageStore$CantGetImageException
            java.lang.String r1 = "Couldn't download image due to service availability"
            r0.<init>(r1, r5)
            throw r0
        L_0x0081:
            r5 = move-exception
            com.mixpanel.android.util.ImageStore$CantGetImageException r0 = new com.mixpanel.android.util.ImageStore$CantGetImageException
            java.lang.String r1 = "Can't download bitmap"
            r0.<init>(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.util.ImageStore.setMin(java.lang.String):java.io.File");
    }

    public final Bitmap setMax(String str) throws CantGetImageException {
        Bitmap length2 = length(str);
        if (length2 != null) {
            return length2;
        }
        File min = setMin(str);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(min.getAbsolutePath(), options);
        Runtime runtime = Runtime.getRuntime();
        if (((float) options.outHeight) * ((float) options.outWidth) * 4.0f <= ((float) runtime.maxMemory()) - ((float) (runtime.totalMemory() - runtime.freeMemory()))) {
            Bitmap decodeFile = BitmapFactory.decodeFile(min.getAbsolutePath());
            if (decodeFile != null) {
                if (length(str) == null) {
                    synchronized (length) {
                        length.put(str, decodeFile);
                    }
                }
                return decodeFile;
            }
            min.delete();
            throw new CantGetImageException("Bitmap on disk can't be opened or was corrupt");
        }
        throw new CantGetImageException("Do not have enough memory for the image");
    }

    public final File getMax(String str) {
        MessageDigest messageDigest = this.setMax;
        if (messageDigest == null) {
            return null;
        }
        byte[] digest = messageDigest.digest(str.getBytes());
        StringBuilder sb = new StringBuilder("MP_IMG_");
        sb.append(Base64.encodeToString(digest, 10));
        return new File(this.getMin, sb.toString());
    }

    private static Bitmap length(String str) {
        Bitmap bitmap;
        synchronized (length) {
            bitmap = length.get(str);
        }
        return bitmap;
    }
}
