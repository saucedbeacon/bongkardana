package o;

public final class findLastVisibleItemPosition {
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap length(android.app.Activity r5) {
        /*
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r5 = r5.findViewById(r0)
            android.view.View r5 = r5.getRootView()
            boolean r0 = r5.isDrawingCacheEnabled()
            r1 = 1
            r5.setDrawingCacheEnabled(r1)
            r5.buildDrawingCache(r1)
            android.graphics.Bitmap r2 = r5.getDrawingCache()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            int r4 = r2.getWidth()
            if (r4 <= 0) goto L_0x0031
            int r4 = r2.getHeight()
            if (r4 <= 0) goto L_0x0031
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r2, r1, r1, r3)     // Catch:{ OutOfMemoryError -> 0x002e }
            goto L_0x0032
        L_0x002e:
            o.findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping()
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r0 != 0) goto L_0x0037
            r5.setDrawingCacheEnabled(r3)
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.findLastVisibleItemPosition.length(android.app.Activity):android.graphics.Bitmap");
    }
}
