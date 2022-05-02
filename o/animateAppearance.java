package o;

import android.opengl.GLES20;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.video.encoding.EncoderThread;
import o.didChildRangeChange;
import o.ensureRightGlow;

@RequiresApi(api = 18)
public class animateAppearance extends clearOldPositions<animateDisappearance> {
    private static final String toFloatRange;
    private static final CameraLogger toIntRange;
    private isLayoutSuppressed FastBitmap$CoordinateSystem;
    public ensureRightGlow<getMin> getMin = new ensureRightGlow<>(Integer.MAX_VALUE, new ensureRightGlow.getMin<getMin>() {
        public final /* synthetic */ Object setMax() {
            return new getMin((byte) 0);
        }
    });
    private considerReleasingGlowsOnScroll hashCode;
    private int toDoubleRange;
    private getMinFlingVelocity toString;
    private long values = Long.MIN_VALUE;

    static {
        String simpleName = animateAppearance.class.getSimpleName();
        toFloatRange = simpleName;
        toIntRange = CameraLogger.setMin(simpleName);
    }

    public static class getMin {
        public long getMax;
        public long getMin;
        public float[] setMin;

        /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
            this.setMin = new float[16];
        }
    }

    /* access modifiers changed from: protected */
    @EncoderThread
    public final void length(@NonNull didChildRangeChange.setMin setmin, long j) {
        this.toDoubleRange = ((animateDisappearance) this.isInside).values;
        ((animateDisappearance) this.isInside).values = 0;
        super.length(setmin, j);
        this.FastBitmap$CoordinateSystem = new isLayoutSuppressed(((animateDisappearance) this.isInside).IsOverlapping, 1);
        considerReleasingGlowsOnScroll considerreleasingglowsonscroll = new considerReleasingGlowsOnScroll(this.FastBitmap$CoordinateSystem, this.IsOverlapping);
        this.hashCode = considerreleasingglowsonscroll;
        considerreleasingglowsonscroll.length();
        this.toString = new getMinFlingVelocity();
    }

    /* access modifiers changed from: protected */
    public final boolean setMax(long j) {
        if (!super.setMax(j)) {
            toIntRange.getMax(1, "shouldRenderFrame - Dropping frame because of super()");
            return false;
        } else if (this.equals <= 10 || getMin("frame") <= 2) {
            return true;
        } else {
            toIntRange.getMax(1, "shouldRenderFrame - Dropping, we already have too many pending events:", Integer.valueOf(getMin("frame")));
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0283  */
    @com.otaliastudios.cameraview.video.encoding.EncoderThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(@androidx.annotation.NonNull java.lang.String r28, @androidx.annotation.Nullable java.lang.Object r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            int r2 = r28.hashCode()
            r3 = -1274492040(0xffffffffb408cb78, float:-1.2740009E-7)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x001f
            r3 = 97692013(0x5d2a96d, float:1.9810542E-35)
            if (r2 == r3) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r2 = "frame"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x002a
        L_0x001f:
            java.lang.String r2 = "filter"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0029
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = -1
        L_0x002a:
            if (r1 == 0) goto L_0x0283
            if (r1 == r4) goto L_0x0030
            goto L_0x0282
        L_0x0030:
            r1 = r29
            o.animateAppearance$getMin r1 = (o.animateAppearance.getMin) r1
            long r2 = r1.getMax
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r6
            boolean r2 = r0.setMax(r2)
            if (r2 != 0) goto L_0x0045
            o.ensureRightGlow<o.animateAppearance$getMin> r2 = r0.getMin
            r2.getMin(r1)
            return
        L_0x0045:
            int r2 = r0.equals
            if (r2 != r4) goto L_0x004d
            long r2 = r1.getMin
            r0.setMax = r2
        L_0x004d:
            long r2 = r0.values
            r8 = -9223372036854775808
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x005a
            long r2 = r1.getMax
            long r2 = r2 / r6
            r0.values = r2
        L_0x005a:
            boolean r2 = r27.equals()
            r3 = 9
            java.lang.String r13 = "timestampUs:"
            r14 = 3
            java.lang.String r15 = "frameNumber:"
            java.lang.String r16 = "onEvent -"
            r8 = 2
            if (r2 != 0) goto L_0x00be
            long r9 = r1.getMax
            long r9 = r9 / r6
            long r11 = r0.values
            long r9 = r9 - r11
            long r11 = r0.length
            int r17 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r17 <= 0) goto L_0x0078
            r9 = 1
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            if (r9 == 0) goto L_0x00be
            com.otaliastudios.cameraview.CameraLogger r9 = toIntRange
            java.lang.Object[] r10 = new java.lang.Object[r3]
            r10[r5] = r16
            r10[r4] = r15
            int r11 = r0.equals
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            r10[r14] = r13
            long r11 = r1.getMax
            long r11 = r11 / r6
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r12 = 4
            r10[r12] = r11
            java.lang.String r11 = "firstTimeUs:"
            r12 = 5
            r10[r12] = r11
            long r11 = r0.values
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r2 = 6
            r10[r2] = r11
            java.lang.String r11 = "- reached max length! deltaUs:"
            r12 = 7
            r10[r12] = r11
            long r11 = r1.getMax
            long r11 = r11 / r6
            long r2 = r0.values
            long r11 = r11 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r3 = 8
            r10[r3] = r2
            r9.getMax(r8, r10)
            r27.isInside()
        L_0x00be:
            com.otaliastudios.cameraview.CameraLogger r3 = toIntRange
            r9 = 10
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r5] = r16
            r10[r4] = r15
            int r2 = r0.equals
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r8] = r2
            r10[r14] = r13
            long r11 = r1.getMax
            long r11 = r11 / r6
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r11 = 4
            r10[r11] = r2
            java.lang.String r11 = "hasReachedMaxLength:"
            r2 = 5
            r10[r2] = r11
            boolean r2 = r27.equals()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r12 = 6
            r10[r12] = r2
            java.lang.String r12 = "thread:"
            r18 = 7
            r10[r18] = r12
            java.lang.Thread r18 = java.lang.Thread.currentThread()
            r19 = 8
            r10[r19] = r18
            java.lang.String r18 = "- draining."
            r17 = 9
            r10[r17] = r18
            r3.getMax(r4, r10)
            r0.setMin((boolean) r5)
            com.otaliastudios.cameraview.CameraLogger r3 = toIntRange
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r5] = r16
            r10[r4] = r15
            int r2 = r0.equals
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10[r8] = r2
            r10[r14] = r13
            r20 = r15
            long r14 = r1.getMax
            long r14 = r14 / r6
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r14 = 4
            r10[r14] = r2
            r2 = 5
            r10[r2] = r11
            boolean r2 = r27.equals()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r14 = 6
            r10[r14] = r2
            r14 = 7
            r10[r14] = r12
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r15 = 8
            r10[r15] = r14
            java.lang.String r14 = "- drawing."
            r15 = 9
            r10[r15] = r14
            r3.getMax(r4, r10)
            float[] r3 = r1.setMin
            o.markItemDecorInsetsDirty r10 = r0.isInside
            o.animateDisappearance r10 = (o.animateDisappearance) r10
            float r10 = r10.getMin
            o.markItemDecorInsetsDirty r14 = r0.isInside
            o.animateDisappearance r14 = (o.animateDisappearance) r14
            float r14 = r14.toIntRange
            r15 = 1065353216(0x3f800000, float:1.0)
            float r18 = r15 - r10
            r21 = 1073741824(0x40000000, float:2.0)
            float r2 = r18 / r21
            float r18 = r15 - r14
            float r6 = r18 / r21
            r7 = 0
            android.opengl.Matrix.translateM(r3, r5, r2, r6, r7)
            android.opengl.Matrix.scaleM(r3, r5, r10, r14, r15)
            r2 = 1056964608(0x3f000000, float:0.5)
            android.opengl.Matrix.translateM(r3, r5, r2, r2, r7)
            r22 = 0
            int r6 = r0.toDoubleRange
            float r6 = (float) r6
            r24 = 0
            r25 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
            r21 = r3
            r23 = r6
            android.opengl.Matrix.rotateM(r21, r22, r23, r24, r25, r26)
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            android.opengl.Matrix.translateM(r3, r5, r6, r6, r7)
            o.markItemDecorInsetsDirty r10 = r0.isInside
            o.animateDisappearance r10 = (o.animateDisappearance) r10
            boolean r10 = r10.length()
            if (r10 == 0) goto L_0x01d0
            o.markItemDecorInsetsDirty r10 = r0.isInside
            o.animateDisappearance r10 = (o.animateDisappearance) r10
            o.addOnItemTouchListener r10 = r10.length
            o.markItemDecorInsetsDirty r14 = r0.isInside
            o.animateDisappearance r14 = (o.animateDisappearance) r14
            com.otaliastudios.cameraview.overlay.Overlay$Target r14 = r14.getMax
            r10.setMin(r14)
            o.markItemDecorInsetsDirty r10 = r0.isInside
            o.animateDisappearance r10 = (o.animateDisappearance) r10
            o.addOnItemTouchListener r10 = r10.length
            float[] r10 = r10.length
            android.opengl.Matrix.translateM(r10, r5, r2, r2, r7)
            o.markItemDecorInsetsDirty r2 = r0.isInside
            o.animateDisappearance r2 = (o.animateDisappearance) r2
            o.addOnItemTouchListener r2 = r2.length
            float[] r2 = r2.length
            r22 = 0
            o.markItemDecorInsetsDirty r10 = r0.isInside
            o.animateDisappearance r10 = (o.animateDisappearance) r10
            int r10 = r10.setMax
            float r10 = (float) r10
            r24 = 0
            r25 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
            r21 = r2
            r23 = r10
            android.opengl.Matrix.rotateM(r21, r22, r23, r24, r25, r26)
            o.markItemDecorInsetsDirty r2 = r0.isInside
            o.animateDisappearance r2 = (o.animateDisappearance) r2
            o.addOnItemTouchListener r2 = r2.length
            float[] r2 = r2.length
            android.opengl.Matrix.translateM(r2, r5, r6, r6, r7)
        L_0x01d0:
            com.otaliastudios.cameraview.CameraLogger r6 = toIntRange
            java.lang.Object[] r7 = new java.lang.Object[r9]
            r7[r5] = r16
            r7[r4] = r20
            int r2 = r0.equals
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r8] = r2
            r2 = 3
            r7[r2] = r13
            long r14 = r1.getMax
            r21 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r21
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            r10 = 4
            r7[r10] = r2
            r2 = 5
            r7[r2] = r11
            boolean r2 = r27.equals()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r10 = 6
            r7[r10] = r2
            r10 = 7
            r7[r10] = r12
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r14 = 8
            r7[r14] = r10
            java.lang.String r10 = "- gl rendering."
            r14 = 9
            r7[r14] = r10
            r6.getMax(r4, r7)
            o.getMinFlingVelocity r6 = r0.toString
            o.markItemDecorInsetsDirty r7 = r0.isInside
            o.animateDisappearance r7 = (o.animateDisappearance) r7
            int r7 = r7.setMin
            r6.setMax(r7, r3)
            o.markItemDecorInsetsDirty r3 = r0.isInside
            o.animateDisappearance r3 = (o.animateDisappearance) r3
            boolean r3 = r3.length()
            if (r3 == 0) goto L_0x0230
            o.markItemDecorInsetsDirty r3 = r0.isInside
            o.animateDisappearance r3 = (o.animateDisappearance) r3
            o.addOnItemTouchListener r3 = r3.length
            r3.length()
        L_0x0230:
            o.considerReleasingGlowsOnScroll r3 = r0.hashCode
            long r6 = r1.getMax
            r3.length((long) r6)
            o.considerReleasingGlowsOnScroll r3 = r0.hashCode
            r3.getMax()
            o.ensureRightGlow<o.animateAppearance$getMin> r3 = r0.getMin
            r3.getMin(r1)
            com.otaliastudios.cameraview.CameraLogger r3 = toIntRange
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r5] = r16
            r6[r4] = r20
            int r5 = r0.equals
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r8] = r5
            r5 = 3
            r6[r5] = r13
            long r7 = r1.getMax
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r5 = 4
            r6[r5] = r1
            r1 = 5
            r6[r1] = r11
            boolean r1 = r27.equals()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 6
            r6[r2] = r1
            r1 = 7
            r6[r1] = r12
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r2 = 8
            r6[r2] = r1
            java.lang.String r1 = "- gl rendered."
            r2 = 9
            r6[r2] = r1
            r3.getMax(r4, r6)
        L_0x0282:
            return
        L_0x0283:
            r1 = r29
            o.setChildDrawingOrderCallback r1 = (o.setChildDrawingOrderCallback) r1
            o.getMinFlingVelocity r2 = r0.toString
            r2.setMin = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.animateAppearance.getMin(java.lang.String, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void getMax() {
        super.getMax();
        ensureRightGlow<getMin> ensurerightglow = this.getMin;
        synchronized (ensurerightglow.setMin) {
            ensurerightglow.length.clear();
        }
        considerReleasingGlowsOnScroll considerreleasingglowsonscroll = this.hashCode;
        if (considerreleasingglowsonscroll != null) {
            considerreleasingglowsonscroll.getMin();
            if (considerreleasingglowsonscroll.getMin != null) {
                if (considerreleasingglowsonscroll.setMax) {
                    considerreleasingglowsonscroll.getMin.release();
                }
                considerreleasingglowsonscroll.getMin = null;
            }
            this.hashCode = null;
        }
        getMinFlingVelocity getminflingvelocity = this.toString;
        if (getminflingvelocity != null) {
            if (getminflingvelocity.length != -1) {
                getminflingvelocity.setMax.getMax();
                GLES20.glDeleteProgram(getminflingvelocity.length);
                getminflingvelocity.length = -1;
            }
            this.toString = null;
        }
        isLayoutSuppressed islayoutsuppressed = this.FastBitmap$CoordinateSystem;
        if (islayoutsuppressed != null) {
            islayoutsuppressed.setMax();
            this.FastBitmap$CoordinateSystem = null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public animateAppearance(@androidx.annotation.NonNull o.animateDisappearance r3) {
        /*
            r2 = this;
            o.animateDisappearance r0 = new o.animateDisappearance
            r0.<init>()
            int r1 = r3.equals
            r0.equals = r1
            int r1 = r3.isInside
            r0.isInside = r1
            int r1 = r3.toFloatRange
            r0.toFloatRange = r1
            int r1 = r3.hashCode
            r0.hashCode = r1
            int r1 = r3.values
            r0.values = r1
            java.lang.String r1 = r3.toDoubleRange
            r0.toDoubleRange = r1
            java.lang.String r1 = r3.FastBitmap$CoordinateSystem
            r0.FastBitmap$CoordinateSystem = r1
            int r1 = r3.setMin
            r0.setMin = r1
            o.addOnItemTouchListener r1 = r3.length
            r0.length = r1
            com.otaliastudios.cameraview.overlay.Overlay$Target r1 = r3.getMax
            r0.getMax = r1
            int r1 = r3.setMax
            r0.setMax = r1
            float r1 = r3.getMin
            r0.getMin = r1
            float r1 = r3.toIntRange
            r0.toIntRange = r1
            android.opengl.EGLContext r3 = r3.IsOverlapping
            r0.IsOverlapping = r3
            r2.<init>(r0)
            o.ensureRightGlow r3 = new o.ensureRightGlow
            o.animateAppearance$4 r0 = new o.animateAppearance$4
            r0.<init>()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.<init>(r1, r0)
            r2.getMin = r3
            r0 = -9223372036854775808
            r2.values = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.animateAppearance.<init>(o.animateDisappearance):void");
    }
}
