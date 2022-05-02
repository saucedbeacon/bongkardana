package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.lang.ref.WeakReference;

public final class getBottomDecorationHeight extends AsyncTask<Void, Void, Throwable> {
    private final getTransformedBoundingBox FastBitmap$CoordinateSystem;
    private final Bitmap.CompressFormat IsOverlapping;
    private int Mean$Arithmetic;
    private float equals;
    private final WeakReference<Context> getMax;
    private Bitmap getMin;
    private final String hashCode;
    private int invoke;
    private final int isInside;
    private final RectF length;
    private final RectF setMax;
    private float setMin;
    private int toDoubleRange;
    private final int toFloatRange;
    private final int toIntRange;
    private final getDecoratedRight toString;
    private int valueOf;
    private final String values;

    /* access modifiers changed from: protected */
    @Nullable
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return getMin();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(@Nullable Object obj) {
        Throwable th = (Throwable) obj;
        getTransformedBoundingBox gettransformedboundingbox = this.FastBitmap$CoordinateSystem;
        if (gettransformedboundingbox == null) {
            return;
        }
        if (th == null) {
            this.FastBitmap$CoordinateSystem.getMin(Uri.fromFile(new File(this.values)), this.invoke, this.valueOf, this.toDoubleRange, this.Mean$Arithmetic);
            return;
        }
        gettransformedboundingbox.getMin(th);
    }

    public getBottomDecorationHeight(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull calculateItemDecorationsForChild calculateitemdecorationsforchild, @NonNull getDecoratedBottom getdecoratedbottom, @Nullable getTransformedBoundingBox gettransformedboundingbox) {
        this.getMax = new WeakReference<>(context);
        this.getMin = bitmap;
        this.setMax = calculateitemdecorationsforchild.length;
        this.length = calculateitemdecorationsforchild.setMax;
        this.setMin = calculateitemdecorationsforchild.getMin;
        this.equals = calculateitemdecorationsforchild.setMin;
        this.toFloatRange = getdecoratedbottom.setMax;
        this.isInside = getdecoratedbottom.getMax;
        this.IsOverlapping = getdecoratedbottom.getMin;
        this.toIntRange = getdecoratedbottom.setMin;
        this.hashCode = getdecoratedbottom.length;
        this.values = getdecoratedbottom.equals;
        this.toString = getdecoratedbottom.isInside;
        this.FastBitmap$CoordinateSystem = gettransformedboundingbox;
    }

    @Nullable
    private Throwable getMin() {
        Bitmap bitmap = this.getMin;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.length.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            setMin();
            this.getMin = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: java.nio.channels.FileChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.nio.channels.FileChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setMin() throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r13.toFloatRange
            r1 = 0
            if (r0 <= 0) goto L_0x0061
            int r0 = r13.isInside
            if (r0 <= 0) goto L_0x0061
            android.graphics.RectF r0 = r13.setMax
            float r0 = r0.width()
            float r2 = r13.setMin
            float r0 = r0 / r2
            android.graphics.RectF r2 = r13.setMax
            float r2 = r2.height()
            float r3 = r13.setMin
            float r2 = r2 / r3
            int r3 = r13.toFloatRange
            float r3 = (float) r3
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x0029
            int r3 = r13.isInside
            float r3 = (float) r3
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0061
        L_0x0029:
            int r3 = r13.toFloatRange
            float r3 = (float) r3
            float r3 = r3 / r0
            int r0 = r13.isInside
            float r0 = (float) r0
            float r0 = r0 / r2
            float r0 = java.lang.Math.min(r3, r0)
            android.graphics.Bitmap r2 = r13.getMin
            int r3 = r2.getWidth()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            android.graphics.Bitmap r4 = r13.getMin
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createScaledBitmap(r2, r3, r4, r1)
            android.graphics.Bitmap r3 = r13.getMin
            if (r3 == r2) goto L_0x005a
            r3.recycle()
        L_0x005a:
            r13.getMin = r2
            float r2 = r13.setMin
            float r2 = r2 / r0
            r13.setMin = r2
        L_0x0061:
            float r0 = r13.equals
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x00a0
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            float r0 = r13.equals
            android.graphics.Bitmap r2 = r13.getMin
            int r2 = r2.getWidth()
            int r2 = r2 / 2
            float r2 = (float) r2
            android.graphics.Bitmap r3 = r13.getMin
            int r3 = r3.getHeight()
            int r3 = r3 / 2
            float r3 = (float) r3
            r7.setRotate(r0, r2, r3)
            android.graphics.Bitmap r2 = r13.getMin
            r3 = 0
            r4 = 0
            int r5 = r2.getWidth()
            android.graphics.Bitmap r0 = r13.getMin
            int r6 = r0.getHeight()
            r8 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Bitmap r2 = r13.getMin
            if (r2 == r0) goto L_0x009e
            r2.recycle()
        L_0x009e:
            r13.getMin = r0
        L_0x00a0:
            android.graphics.RectF r0 = r13.setMax
            float r0 = r0.left
            android.graphics.RectF r2 = r13.length
            float r2 = r2.left
            float r0 = r0 - r2
            float r2 = r13.setMin
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r13.invoke = r0
            android.graphics.RectF r0 = r13.setMax
            float r0 = r0.top
            android.graphics.RectF r2 = r13.length
            float r2 = r2.top
            float r0 = r0 - r2
            float r2 = r13.setMin
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r13.valueOf = r0
            android.graphics.RectF r0 = r13.setMax
            float r0 = r0.width()
            float r2 = r13.setMin
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r13.toDoubleRange = r0
            android.graphics.RectF r0 = r13.setMax
            float r0 = r0.height()
            float r2 = r13.setMin
            float r0 = r0 / r2
            int r0 = java.lang.Math.round(r0)
            r13.Mean$Arithmetic = r0
            int r2 = r13.toDoubleRange
            boolean r0 = r13.getMin(r2, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0153
            android.media.ExifInterface r0 = new android.media.ExifInterface
            java.lang.String r1 = r13.hashCode
            r0.<init>(r1)
            android.graphics.Bitmap r1 = r13.getMin
            int r3 = r13.invoke
            int r4 = r13.valueOf
            int r5 = r13.toDoubleRange
            int r6 = r13.Mean$Arithmetic
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r3, r4, r5, r6)
            java.lang.ref.WeakReference<android.content.Context> r3 = r13.getMax
            java.lang.Object r3 = r3.get()
            android.content.Context r3 = (android.content.Context) r3
            if (r3 == 0) goto L_0x013e
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0133 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0133 }
            java.lang.String r5 = r13.values     // Catch:{ all -> 0x0133 }
            r4.<init>(r5)     // Catch:{ all -> 0x0133 }
            android.net.Uri r4 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x0133 }
            java.io.OutputStream r2 = r3.openOutputStream(r4)     // Catch:{ all -> 0x0133 }
            android.graphics.Bitmap$CompressFormat r3 = r13.IsOverlapping     // Catch:{ all -> 0x0133 }
            int r4 = r13.toIntRange     // Catch:{ all -> 0x0133 }
            r1.compress(r3, r4, r2)     // Catch:{ all -> 0x0133 }
            r1.recycle()     // Catch:{ all -> 0x0133 }
            if (r2 == 0) goto L_0x013e
            boolean r1 = r2 instanceof java.io.Closeable
            if (r1 == 0) goto L_0x013e
            r2.close()     // Catch:{ IOException -> 0x0131 }
            goto L_0x013e
        L_0x0131:
            goto L_0x013e
        L_0x0133:
            r0 = move-exception
            if (r2 == 0) goto L_0x013d
            boolean r1 = r2 instanceof java.io.Closeable
            if (r1 == 0) goto L_0x013d
            r2.close()     // Catch:{ IOException -> 0x013d }
        L_0x013d:
            throw r0
        L_0x013e:
            android.graphics.Bitmap$CompressFormat r1 = r13.IsOverlapping
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0151
            int r1 = r13.toDoubleRange
            int r2 = r13.Mean$Arithmetic
            java.lang.String r3 = r13.values
            o.onRequestChildFocus.length(r0, r1, r2, r3)
        L_0x0151:
            r0 = 1
            return r0
        L_0x0153:
            java.lang.String r0 = r13.hashCode
            java.lang.String r3 = r13.values
            boolean r4 = r0.equalsIgnoreCase(r3)
            if (r4 != 0) goto L_0x01a4
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x0197 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0197 }
            r5.<init>(r0)     // Catch:{ all -> 0x0197 }
            r4.<init>(r5)     // Catch:{ all -> 0x0197 }
            java.nio.channels.FileChannel r0 = r4.getChannel()     // Catch:{ all -> 0x0197 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0192 }
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0192 }
            r5.<init>(r3)     // Catch:{ all -> 0x0192 }
            r4.<init>(r5)     // Catch:{ all -> 0x0192 }
            java.nio.channels.FileChannel r2 = r4.getChannel()     // Catch:{ all -> 0x0192 }
            r7 = 0
            long r9 = r0.size()     // Catch:{ all -> 0x0192 }
            r6 = r0
            r11 = r2
            r6.transferTo(r7, r9, r11)     // Catch:{ all -> 0x0192 }
            r0.close()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x018c
            r0.close()
        L_0x018c:
            if (r2 == 0) goto L_0x01a4
            r2.close()
            goto L_0x01a4
        L_0x0192:
            r1 = move-exception
            r12 = r2
            r2 = r0
            r0 = r12
            goto L_0x0199
        L_0x0197:
            r1 = move-exception
            r0 = r2
        L_0x0199:
            if (r2 == 0) goto L_0x019e
            r2.close()
        L_0x019e:
            if (r0 == 0) goto L_0x01a3
            r0.close()
        L_0x01a3:
            throw r1
        L_0x01a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBottomDecorationHeight.setMin():boolean");
    }

    private boolean getMin(int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1253311383, oncanceled);
            onCancelLoad.getMin(-1253311383, oncanceled);
        }
        int round = Math.round(((float) Math.max(i, i2)) / 1000.0f) + 1;
        if (this.toFloatRange <= 0 || this.isInside <= 0) {
            float f = (float) round;
            if (Math.abs(this.setMax.left - this.length.left) > f || Math.abs(this.setMax.top - this.length.top) > f || Math.abs(this.setMax.bottom - this.length.bottom) > f || Math.abs(this.setMax.right - this.length.right) > f) {
                return true;
            }
            return false;
        }
        return true;
    }
}
