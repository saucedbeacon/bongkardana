package o;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

public abstract class getSupportParentActivityIntent implements View.OnTouchListener {
    private static final int Mean$Arithmetic = ViewConfiguration.getTapTimeout();
    private int FastBitmap$CoordinateSystem;
    private boolean Grayscale$Algorithm;
    private float[] IsOverlapping = {0.0f, 0.0f};
    private final Interpolator equals = new AccelerateInterpolator();
    public boolean getMax;
    boolean getMin;
    private int hashCode;
    private boolean invokeSuspend;
    private Runnable isInside;
    public final length length = new length();
    final View setMax;
    public boolean setMin;
    private float[] toDoubleRange = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] toFloatRange = {Float.MAX_VALUE, Float.MAX_VALUE};
    public boolean toIntRange;
    private float[] toString = {0.0f, 0.0f};
    private float[] values = {0.0f, 0.0f};

    static int getMax(int i, int i2) {
        if (i > i2) {
            return i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    static float length(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public abstract boolean getMin(int i);

    public abstract void setMin(int i);

    public getSupportParentActivityIntent(@NonNull View view) {
        this.setMax = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float[] fArr = this.toDoubleRange;
        float f = ((float) ((int) ((displayMetrics.density * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.toString;
        float f2 = ((float) ((int) ((displayMetrics.density * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.hashCode = 1;
        float[] fArr3 = this.toFloatRange;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.IsOverlapping;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.values;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.FastBitmap$CoordinateSystem = Mean$Arithmetic;
        this.length.getMax = 500;
        this.length.setMax = 500;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.toIntRange
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0027
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0086
        L_0x0016:
            boolean r6 = r5.getMax
            if (r6 == 0) goto L_0x001d
            r5.setMin = r1
            goto L_0x0086
        L_0x001d:
            o.getSupportParentActivityIntent$length r6 = r5.length
            r6.getMin()
            goto L_0x0086
        L_0x0023:
            r5.getMin = r2
            r5.Grayscale$Algorithm = r1
        L_0x0027:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.setMax
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.setMin(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.setMax
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.setMin(r2, r7, r6, r3)
            o.getSupportParentActivityIntent$length r7 = r5.length
            r7.setMin = r0
            r7.getMin = r6
            boolean r6 = r5.setMin
            if (r6 != 0) goto L_0x0086
            boolean r6 = r5.setMin()
            if (r6 == 0) goto L_0x0086
            java.lang.Runnable r6 = r5.isInside
            if (r6 != 0) goto L_0x006a
            o.getSupportParentActivityIntent$getMax r6 = new o.getSupportParentActivityIntent$getMax
            r6.<init>()
            r5.isInside = r6
        L_0x006a:
            r5.setMin = r2
            r5.getMax = r2
            boolean r6 = r5.Grayscale$Algorithm
            if (r6 != 0) goto L_0x007f
            int r6 = r5.FastBitmap$CoordinateSystem
            if (r6 <= 0) goto L_0x007f
            android.view.View r7 = r5.setMax
            java.lang.Runnable r0 = r5.isInside
            long r3 = (long) r6
            androidx.core.view.ViewCompat.getMin((android.view.View) r7, (java.lang.Runnable) r0, (long) r3)
            goto L_0x0084
        L_0x007f:
            java.lang.Runnable r6 = r5.isInside
            r6.run()
        L_0x0084:
            r5.Grayscale$Algorithm = r2
        L_0x0086:
            boolean r6 = r5.invokeSuspend
            if (r6 == 0) goto L_0x008f
            boolean r6 = r5.setMin
            if (r6 == 0) goto L_0x008f
            return r2
        L_0x008f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getSupportParentActivityIntent.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin() {
        length length2 = this.length;
        int abs = (int) (length2.getMin / Math.abs(length2.getMin));
        int abs2 = (int) (length2.setMin / Math.abs(length2.setMin));
        return abs != 0 && getMin(abs);
    }

    private float setMin(int i, float f, float f2, float f3) {
        float length2 = length(this.IsOverlapping[i], f2, this.toFloatRange[i], f);
        if (length2 == 0.0f) {
            return 0.0f;
        }
        float f4 = this.values[i];
        float f5 = this.toString[i];
        float f6 = this.toDoubleRange[i];
        float f7 = f4 * f3;
        if (length2 > 0.0f) {
            float f8 = length2 * f7;
            if (f8 > f6) {
                return f6;
            }
            return f8 < f5 ? f5 : f8;
        }
        float f9 = (-length2) * f7;
        if (f9 > f6) {
            f5 = f6;
        } else if (f9 >= f5) {
            f5 = f9;
        }
        return -f5;
    }

    private float length(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f * f2;
        if (f6 <= f3) {
            f3 = f6 < 0.0f ? 0.0f : f6;
        }
        float min = setMin(f2 - f4, f3) - setMin(f4, f3);
        if (min < 0.0f) {
            f5 = -this.equals.getInterpolation(-min);
        } else if (min <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.equals.getInterpolation(min);
        }
        if (f5 > 1.0f) {
            return 1.0f;
        }
        if (f5 < -1.0f) {
            return -1.0f;
        }
        return f5;
    }

    private float setMin(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.hashCode;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                return (!this.setMin || this.hashCode != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    class getMax implements Runnable {
        getMax() {
        }

        public final void run() {
            if (getSupportParentActivityIntent.this.setMin) {
                if (getSupportParentActivityIntent.this.getMax) {
                    getSupportParentActivityIntent.this.getMax = false;
                    length length = getSupportParentActivityIntent.this.length;
                    length.length = AnimationUtils.currentAnimationTimeMillis();
                    length.IsOverlapping = -1;
                    length.toIntRange = length.length;
                    length.isInside = 0.5f;
                    length.toFloatRange = 0;
                    length.equals = 0;
                }
                length length2 = getSupportParentActivityIntent.this.length;
                if (length2.getMax() || !getSupportParentActivityIntent.this.setMin()) {
                    getSupportParentActivityIntent.this.setMin = false;
                    return;
                }
                if (getSupportParentActivityIntent.this.getMin) {
                    getSupportParentActivityIntent.this.getMin = false;
                    getSupportParentActivityIntent getsupportparentactivityintent = getSupportParentActivityIntent.this;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    getsupportparentactivityintent.setMax.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (length2.toIntRange != 0) {
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    float min = length2.setMin(currentAnimationTimeMillis);
                    length2.toIntRange = currentAnimationTimeMillis;
                    float f = ((float) (currentAnimationTimeMillis - length2.toIntRange)) * ((-4.0f * min * min) + (min * 4.0f));
                    length2.toFloatRange = (int) (length2.setMin * f);
                    length2.equals = (int) (f * length2.getMin);
                    getSupportParentActivityIntent.this.setMin(length2.equals);
                    ViewCompat.getMax(getSupportParentActivityIntent.this.setMax, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public static class length {
        long IsOverlapping = -1;
        int equals = 0;
        int getMax;
        float getMin;
        float isInside;
        long length = Long.MIN_VALUE;
        int setMax;
        float setMin;
        int toFloatRange = 0;
        long toIntRange = 0;
        private int toString;

        length() {
        }

        public final void getMin() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.toString = getSupportParentActivityIntent.getMax((int) (currentAnimationTimeMillis - this.length), this.setMax);
            this.isInside = setMin(currentAnimationTimeMillis);
            this.IsOverlapping = currentAnimationTimeMillis;
        }

        public final boolean getMax() {
            return this.IsOverlapping > 0 && AnimationUtils.currentAnimationTimeMillis() > this.IsOverlapping + ((long) this.toString);
        }

        /* access modifiers changed from: package-private */
        public final float setMin(long j) {
            if (j < this.length) {
                return 0.0f;
            }
            long j2 = this.IsOverlapping;
            if (j2 < 0 || j < j2) {
                return getSupportParentActivityIntent.length(((float) (j - this.length)) / ((float) this.getMax)) * 0.5f;
            }
            long j3 = j - j2;
            float f = this.isInside;
            return (1.0f - f) + (f * getSupportParentActivityIntent.length(((float) j3) / ((float) this.toString)));
        }
    }
}
