package o;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;

public final class MockView implements setTranslationY<Bitmap> {
    public static final setTranslationX<Integer> getMax = setTranslationX.setMin("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    public static final setTranslationX<Bitmap.CompressFormat> setMax = setTranslationX.getMax("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    @Nullable
    private final setOnHide setMin;

    public MockView(@NonNull setOnHide setonhide) {
        this.setMin = setonhide;
    }

    @Deprecated
    public MockView() {
        this.setMin = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|33|(0)|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0079 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076 A[SYNTHETIC, Splitter:B:38:0x0076] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setMax(@androidx.annotation.NonNull o.fireTrigger<android.graphics.Bitmap> r8, @androidx.annotation.NonNull java.io.File r9, @androidx.annotation.NonNull o.MotionHelper r10) {
        /*
            r7 = this;
            java.lang.Object r8 = r8.setMin()
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            o.setTranslationX<android.graphics.Bitmap$CompressFormat> r0 = setMax
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r1 = r10.length
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L_0x0017
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r1 = r10.length
            java.lang.Object r0 = r1.get(r0)
            goto L_0x0019
        L_0x0017:
            T r0 = r0.getMax
        L_0x0019:
            android.graphics.Bitmap$CompressFormat r0 = (android.graphics.Bitmap.CompressFormat) r0
            if (r0 == 0) goto L_0x001e
            goto L_0x0029
        L_0x001e:
            boolean r0 = r8.hasAlpha()
            if (r0 == 0) goto L_0x0027
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0029
        L_0x0027:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0029:
            r8.getWidth()
            r8.getHeight()
            long r1 = o.getDependencySortedChildren.setMax()     // Catch:{ all -> 0x00d0 }
            o.setTranslationX<java.lang.Integer> r3 = getMax     // Catch:{ all -> 0x00d0 }
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r4 = r10.length     // Catch:{ all -> 0x00d0 }
            boolean r4 = r4.containsKey(r3)     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x0044
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r4 = r10.length     // Catch:{ all -> 0x00d0 }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x00d0 }
            goto L_0x0046
        L_0x0044:
            T r3 = r3.getMax     // Catch:{ all -> 0x00d0 }
        L_0x0046:
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00d0 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x00d0 }
            r4 = 0
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006c, all -> 0x0073 }
            r6.<init>(r9)     // Catch:{ IOException -> 0x006c, all -> 0x0073 }
            o.setOnHide r9 = r7.setMin     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            if (r9 == 0) goto L_0x0060
            o.getProgress r9 = new o.getProgress     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            o.setOnHide r5 = r7.setMin     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r9.<init>(r6, r5)     // Catch:{ IOException -> 0x0071, all -> 0x006e }
            r5 = r9
            goto L_0x0061
        L_0x0060:
            r5 = r6
        L_0x0061:
            r8.compress(r0, r3, r5)     // Catch:{ IOException -> 0x006c, all -> 0x0073 }
            r5.close()     // Catch:{ IOException -> 0x006c, all -> 0x0073 }
            r4 = 1
        L_0x0068:
            r5.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x007d
        L_0x006c:
            goto L_0x007a
        L_0x006e:
            r8 = move-exception
            r5 = r6
            goto L_0x0074
        L_0x0071:
            r5 = r6
            goto L_0x007a
        L_0x0073:
            r8 = move-exception
        L_0x0074:
            if (r5 == 0) goto L_0x0079
            r5.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            throw r8     // Catch:{ all -> 0x00d0 }
        L_0x007a:
            if (r5 == 0) goto L_0x007d
            goto L_0x0068
        L_0x007d:
            java.lang.String r9 = "BitmapEncoder"
            r3 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r3)     // Catch:{ all -> 0x00d0 }
            if (r9 == 0) goto L_0x00cf
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Compressed with type: "
            r9.<init>(r3)     // Catch:{ all -> 0x00d0 }
            r9.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = " of size "
            r9.append(r0)     // Catch:{ all -> 0x00d0 }
            int r0 = o.getDependents.getMin((android.graphics.Bitmap) r8)     // Catch:{ all -> 0x00d0 }
            r9.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = " in "
            r9.append(r0)     // Catch:{ all -> 0x00d0 }
            double r0 = o.getDependencySortedChildren.length(r1)     // Catch:{ all -> 0x00d0 }
            r9.append(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = ", options format: "
            r9.append(r0)     // Catch:{ all -> 0x00d0 }
            o.setTranslationX<android.graphics.Bitmap$CompressFormat> r0 = setMax     // Catch:{ all -> 0x00d0 }
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r1 = r10.length     // Catch:{ all -> 0x00d0 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00be
            o.PlaybackStateCompat<o.setTranslationX<?>, java.lang.Object> r10 = r10.length     // Catch:{ all -> 0x00d0 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c0
        L_0x00be:
            T r10 = r0.getMax     // Catch:{ all -> 0x00d0 }
        L_0x00c0:
            r9.append(r10)     // Catch:{ all -> 0x00d0 }
            java.lang.String r10 = ", hasAlpha: "
            r9.append(r10)     // Catch:{ all -> 0x00d0 }
            boolean r8 = r8.hasAlpha()     // Catch:{ all -> 0x00d0 }
            r9.append(r8)     // Catch:{ all -> 0x00d0 }
        L_0x00cf:
            return r4
        L_0x00d0:
            r8 = move-exception
            goto L_0x00d3
        L_0x00d2:
            throw r8
        L_0x00d3:
            goto L_0x00d2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MockView.setMax(o.fireTrigger, java.io.File, o.MotionHelper):boolean");
    }

    @NonNull
    public final EncodeStrategy getMax(@NonNull MotionHelper motionHelper) {
        return EncodeStrategy.TRANSFORMED;
    }
}
