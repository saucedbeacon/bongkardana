package com.alibaba.griver.image.photo.widget;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import net.sqlcipher.database.SQLiteDatabase;

public class OverScrollerCopyed {
    static float sViscousFluidNormalize = (1.0f / viscousFluid(1.0f));
    static float sViscousFluidScale = 8.0f;

    /* renamed from: a  reason: collision with root package name */
    private int f10510a;
    private final SplineOverScroller b;
    private final SplineOverScroller c;
    private Interpolator d;
    private final boolean e;

    public OverScrollerCopyed(Context context) {
        this(context, (Interpolator) null);
    }

    public OverScrollerCopyed(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public OverScrollerCopyed(Context context, Interpolator interpolator, boolean z) {
        this.d = interpolator;
        this.e = z;
        this.b = new SplineOverScroller(context);
        this.c = new SplineOverScroller(context);
    }

    /* access modifiers changed from: package-private */
    public void setInterpolator(Interpolator interpolator) {
        this.d = interpolator;
    }

    public final void setFriction(float f) {
        this.b.setFriction(f);
        this.c.setFriction(f);
    }

    public final boolean isFinished() {
        return this.b.k && this.c.k;
    }

    public final void forceFinished(boolean z) {
        boolean unused = this.b.k = this.c.k = z;
    }

    public final int getCurrX() {
        return this.b.b;
    }

    public final int getCurrY() {
        return this.c.b;
    }

    public float getCurrVelocity() {
        return (float) Math.sqrt((double) ((this.b.e * this.b.e) + (this.c.e * this.c.e)));
    }

    public final int getStartX() {
        return this.b.f10511a;
    }

    public final int getStartY() {
        return this.c.f10511a;
    }

    public final int getFinalX() {
        return this.b.c;
    }

    public final int getFinalY() {
        return this.c.c;
    }

    @Deprecated
    public final int getDuration() {
        return Math.max(this.b.h, this.c.h);
    }

    @Deprecated
    public void extendDuration(int i) {
        this.b.extendDuration(i);
        this.c.extendDuration(i);
    }

    @Deprecated
    public void setFinalX(int i) {
        this.b.setFinalPosition(i);
    }

    @Deprecated
    public void setFinalY(int i) {
        this.c.setFinalPosition(i);
    }

    public boolean computeScrollOffset() {
        float f;
        if (isFinished()) {
            return false;
        }
        int i = this.f10510a;
        if (i == 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.b.g;
            int access$500 = this.b.h;
            if (currentAnimationTimeMillis < ((long) access$500)) {
                float f2 = ((float) currentAnimationTimeMillis) / ((float) access$500);
                Interpolator interpolator = this.d;
                if (interpolator == null) {
                    f = viscousFluid(f2);
                } else {
                    f = interpolator.getInterpolation(f2);
                }
                this.b.updateScroll(f);
                this.c.updateScroll(f);
            } else {
                abortAnimation();
            }
        } else if (i == 1) {
            if (!this.b.k && !this.b.update() && !this.b.continueWhenFinished()) {
                this.b.finish();
            }
            if (!this.c.k && !this.c.update() && !this.c.continueWhenFinished()) {
                this.c.finish();
            }
        }
        return true;
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, SQLiteDatabase.MAX_SQL_CACHE_SIZE);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.f10510a = 0;
        this.b.startScroll(i, i3, i5);
        this.c.startScroll(i2, i4, i5);
    }

    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f10510a = 1;
        boolean springback = this.b.springback(i, i3, i4);
        boolean springback2 = this.c.springback(i2, i5, i6);
        if (springback || springback2) {
            return true;
        }
        return false;
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        fling(i, i2, i3, i4, i5, i6, i7, i8, 0, 0);
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!this.e || isFinished()) {
            i14 = i3;
        } else {
            float access$200 = this.b.e;
            float access$2002 = this.c.e;
            i14 = i3;
            float f = (float) i14;
            if (Math.signum(f) == Math.signum(access$200)) {
                i13 = i4;
                float f2 = (float) i13;
                if (Math.signum(f2) == Math.signum(access$2002)) {
                    i12 = (int) (f2 + access$2002);
                    i11 = (int) (f + access$200);
                    this.f10510a = 1;
                    this.b.fling(i, i11, i5, i6, i9);
                    this.c.fling(i2, i12, i7, i8, i10);
                }
                i12 = i13;
                i11 = i14;
                this.f10510a = 1;
                this.b.fling(i, i11, i5, i6, i9);
                this.c.fling(i2, i12, i7, i8, i10);
            }
        }
        i13 = i4;
        i12 = i13;
        i11 = i14;
        this.f10510a = 1;
        this.b.fling(i, i11, i5, i6, i9);
        this.c.fling(i2, i12, i7, i8, i10);
    }

    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.b.notifyEdgeReached(i, i2, i3);
    }

    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.c.notifyEdgeReached(i, i2, i3);
    }

    public boolean isOverScrolled() {
        if (this.b.k || this.b.n == 0) {
            return !this.c.k && this.c.n != 0;
        }
        return true;
    }

    public void abortAnimation() {
        this.b.finish();
        this.c.finish();
    }

    public int timePassed() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - Math.min(this.b.g, this.c.g));
    }

    public boolean isScrollingInDirection(float f, float f2) {
        return !isFinished() && Math.signum(f) == Math.signum((float) (this.b.c - this.b.f10511a)) && Math.signum(f2) == Math.signum((float) (this.c.c - this.c.f10511a));
    }

    static class SplineOverScroller {
        private static float p = ((float) (Math.log(0.78d) / Math.log(0.9d)));
        private static final float[] q = new float[101];
        private static final float[] r = new float[101];
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f10511a;
        /* access modifiers changed from: private */
        public int b;
        /* access modifiers changed from: private */
        public int c;
        private int d;
        /* access modifiers changed from: private */
        public float e;
        private float f;
        /* access modifiers changed from: private */
        public long g;
        /* access modifiers changed from: private */
        public int h;
        private int i;
        private int j;
        /* access modifiers changed from: private */
        public boolean k = true;
        private int l;
        private float m = ViewConfiguration.getScrollFriction();
        /* access modifiers changed from: private */
        public int n = 0;

        /* renamed from: o  reason: collision with root package name */
        private float f10512o;

        private static float a(int i2) {
            return i2 > 0 ? -2000.0f : 2000.0f;
        }

        static {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i2 = 0;
            while (true) {
                float f14 = 1.0f;
                if (i2 < 100) {
                    float f15 = ((float) i2) / 100.0f;
                    float f16 = 1.0f;
                    while (true) {
                        f2 = 2.0f;
                        f3 = ((f16 - f12) / 2.0f) + f12;
                        f4 = 3.0f;
                        f5 = f14 - f3;
                        f6 = f3 * 3.0f * f5;
                        f7 = f3 * f3 * f3;
                        float f17 = (((f5 * 0.175f) + (f3 * 0.35000002f)) * f6) + f7;
                        float f18 = f16;
                        if (((double) Math.abs(f17 - f15)) < 1.0E-5d) {
                            break;
                        }
                        if (f17 > f15) {
                            f16 = f3;
                        } else {
                            f12 = f3;
                            f16 = f18;
                        }
                        f14 = 1.0f;
                    }
                    q[i2] = (f6 * ((f5 * 0.5f) + f3)) + f7;
                    float f19 = 1.0f;
                    while (true) {
                        f8 = ((f19 - f13) / f2) + f13;
                        f9 = 1.0f - f8;
                        f10 = f8 * f4 * f9;
                        f11 = f8 * f8 * f8;
                        float f20 = (((f9 * 0.5f) + f8) * f10) + f11;
                        if (((double) Math.abs(f20 - f15)) < 1.0E-5d) {
                            break;
                        }
                        if (f20 > f15) {
                            f19 = f8;
                        } else {
                            f13 = f8;
                        }
                        f2 = 2.0f;
                        f4 = 3.0f;
                    }
                    r[i2] = (f10 * ((f9 * 0.175f) + (f8 * 0.35000002f))) + f11;
                    i2++;
                } else {
                    float[] fArr = q;
                    r[100] = 1.0f;
                    fArr[100] = 1.0f;
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setFriction(float f2) {
            this.m = f2;
        }

        SplineOverScroller(Context context) {
            this.f10512o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        /* access modifiers changed from: package-private */
        public void updateScroll(float f2) {
            int i2 = this.f10511a;
            this.b = i2 + Math.round(f2 * ((float) (this.c - i2)));
        }

        private void a(int i2, int i3, int i4) {
            float abs = Math.abs(((float) (i4 - i2)) / ((float) (i3 - i2)));
            int i5 = (int) (abs * 100.0f);
            if (i5 < 100) {
                float f2 = ((float) i5) / 100.0f;
                int i6 = i5 + 1;
                float[] fArr = r;
                float f3 = fArr[i5];
                this.h = (int) (((float) this.h) * (f3 + (((abs - f2) / ((((float) i6) / 100.0f) - f2)) * (fArr[i6] - f3))));
            }
        }

        /* access modifiers changed from: package-private */
        public void startScroll(int i2, int i3, int i4) {
            this.k = false;
            this.f10511a = i2;
            this.c = i2 + i3;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            this.h = i4;
            this.f = 0.0f;
            this.d = 0;
        }

        /* access modifiers changed from: package-private */
        public void finish() {
            this.b = this.c;
            this.k = true;
        }

        /* access modifiers changed from: package-private */
        public void setFinalPosition(int i2) {
            this.c = i2;
            this.k = false;
        }

        /* access modifiers changed from: package-private */
        public void extendDuration(int i2) {
            this.h = ((int) (AnimationUtils.currentAnimationTimeMillis() - this.g)) + i2;
            this.k = false;
        }

        /* access modifiers changed from: package-private */
        public boolean springback(int i2, int i3, int i4) {
            this.k = true;
            this.c = i2;
            this.f10511a = i2;
            this.d = 0;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            this.h = 0;
            if (i2 < i3) {
                b(i2, i3, 0);
            } else if (i2 > i4) {
                b(i2, i4, 0);
            }
            if (!this.k) {
                return true;
            }
            return false;
        }

        private void b(int i2, int i3, int i4) {
            this.k = false;
            this.n = 1;
            this.f10511a = i2;
            this.c = i3;
            int i5 = i2 - i3;
            this.f = a(i5);
            this.d = -i5;
            this.l = Math.abs(i5);
            double d2 = (double) i5;
            Double.isNaN(d2);
            double d3 = (double) this.f;
            Double.isNaN(d3);
            this.h = (int) (Math.sqrt((d2 * -2.0d) / d3) * 1000.0d);
        }

        /* access modifiers changed from: package-private */
        public void fling(int i2, int i3, int i4, int i5, int i6) {
            this.l = i6;
            this.k = false;
            this.d = i3;
            float f2 = (float) i3;
            this.e = f2;
            this.i = 0;
            this.h = 0;
            this.g = AnimationUtils.currentAnimationTimeMillis();
            this.f10511a = i2;
            this.b = i2;
            if (i2 > i5 || i2 < i4) {
                a(i2, i4, i5, i3);
                return;
            }
            this.n = 0;
            double d2 = 0.0d;
            if (i3 != 0) {
                int d3 = d(i3);
                this.i = d3;
                this.h = d3;
                d2 = c(i3);
            }
            double signum = (double) Math.signum(f2);
            Double.isNaN(signum);
            int i7 = (int) (d2 * signum);
            this.j = i7;
            int i8 = i2 + i7;
            this.c = i8;
            if (i8 < i4) {
                a(this.f10511a, i8, i4);
                this.c = i4;
            }
            int i9 = this.c;
            if (i9 > i5) {
                a(this.f10511a, i9, i5);
                this.c = i5;
            }
        }

        private double b(int i2) {
            return Math.log((double) ((((float) Math.abs(i2)) * 0.35f) / (this.m * this.f10512o)));
        }

        private double c(int i2) {
            double b2 = b(i2);
            float f2 = p;
            double d2 = (double) f2;
            Double.isNaN(d2);
            double d3 = (double) (this.m * this.f10512o);
            double d4 = (double) f2;
            Double.isNaN(d4);
            double exp = Math.exp((d4 / (d2 - 1.0d)) * b2);
            Double.isNaN(d3);
            return d3 * exp;
        }

        private int d(int i2) {
            double b2 = b(i2);
            double d2 = (double) p;
            Double.isNaN(d2);
            return (int) (Math.exp(b2 / (d2 - 1.0d)) * 1000.0d);
        }

        private void c(int i2, int i3, int i4) {
            float f2 = this.f;
            float f3 = ((float) (-i4)) / f2;
            double abs = (double) (((((float) (i4 * i4)) / 2.0f) / Math.abs(f2)) + ((float) Math.abs(i3 - i2)));
            Double.isNaN(abs);
            double abs2 = (double) Math.abs(this.f);
            Double.isNaN(abs2);
            float sqrt = (float) Math.sqrt((abs * 2.0d) / abs2);
            this.g -= (long) ((int) ((sqrt - f3) * 1000.0f));
            this.f10511a = i3;
            this.d = (int) ((-this.f) * sqrt);
        }

        private void d(int i2, int i3, int i4) {
            this.f = a(i4 == 0 ? i2 - i3 : i4);
            c(i2, i3, i4);
            a();
        }

        private void a(int i2, int i3, int i4, int i5) {
            int i6 = i2;
            int i7 = i4;
            int i8 = i5;
            boolean z = true;
            int i9 = i3;
            if (i6 <= i9 || i6 >= i7) {
                boolean z2 = i6 > i7;
                int i10 = z2 ? i7 : i9;
                int i11 = i6 - i10;
                if (i11 * i8 < 0) {
                    z = false;
                }
                if (z) {
                    d(i2, i10, i8);
                } else if (c(i8) > ((double) Math.abs(i11))) {
                    fling(i2, i5, z2 ? i9 : i6, z2 ? i6 : i7, this.l);
                } else {
                    b(i2, i10, i8);
                }
            } else {
                this.k = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void notifyEdgeReached(int i2, int i3, int i4) {
            if (this.n == 0) {
                this.l = i4;
                this.g = AnimationUtils.currentAnimationTimeMillis();
                a(i2, i3, i3, (int) this.e);
            }
        }

        private void a() {
            int i2 = this.d;
            float abs = ((float) (i2 * i2)) / (Math.abs(this.f) * 2.0f);
            float signum = Math.signum((float) this.d);
            int i3 = this.l;
            if (abs > ((float) i3)) {
                float f2 = -signum;
                int i4 = this.d;
                this.f = ((f2 * ((float) i4)) * ((float) i4)) / (((float) i3) * 2.0f);
                abs = (float) i3;
            }
            this.l = (int) abs;
            this.n = 2;
            int i5 = this.f10511a;
            if (this.d <= 0) {
                abs = -abs;
            }
            this.c = i5 + ((int) abs);
            this.h = -((int) ((((float) this.d) * 1000.0f) / this.f));
        }

        /* access modifiers changed from: package-private */
        public boolean continueWhenFinished() {
            int i2 = this.n;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                if (i2 == 2) {
                    this.g += (long) this.h;
                    b(this.c, this.f10511a, 0);
                }
            } else if (this.h >= this.i) {
                return false;
            } else {
                this.f10511a = this.c;
                int i3 = (int) this.e;
                this.d = i3;
                this.f = a(i3);
                this.g += (long) this.h;
                a();
            }
            update();
            return true;
        }

        /* access modifiers changed from: package-private */
        public boolean update() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.g;
            int i2 = this.h;
            if (currentAnimationTimeMillis > ((long) i2)) {
                return false;
            }
            double d2 = 0.0d;
            int i3 = this.n;
            if (i3 == 0) {
                float f2 = ((float) currentAnimationTimeMillis) / ((float) this.i);
                int i4 = (int) (f2 * 100.0f);
                float f3 = 1.0f;
                float f4 = 0.0f;
                if (i4 < 100) {
                    float f5 = ((float) i4) / 100.0f;
                    int i5 = i4 + 1;
                    float[] fArr = q;
                    float f6 = fArr[i4];
                    f4 = (fArr[i5] - f6) / ((((float) i5) / 100.0f) - f5);
                    f3 = f6 + ((f2 - f5) * f4);
                }
                int i6 = this.j;
                this.e = ((f4 * ((float) i6)) / ((float) this.i)) * 1000.0f;
                d2 = (double) (f3 * ((float) i6));
            } else if (i3 == 1) {
                float f7 = ((float) currentAnimationTimeMillis) / ((float) i2);
                float f8 = f7 * f7;
                float signum = Math.signum((float) this.d);
                int i7 = this.l;
                this.e = signum * ((float) i7) * 6.0f * ((-f7) + f8);
                d2 = (double) (((float) i7) * signum * ((3.0f * f8) - ((2.0f * f7) * f8)));
            } else if (i3 == 2) {
                float f9 = ((float) currentAnimationTimeMillis) / 1000.0f;
                int i8 = this.d;
                float f10 = this.f;
                this.e = ((float) i8) + (f10 * f9);
                d2 = (double) ((((float) i8) * f9) + (((f10 * f9) * f9) / 2.0f));
            }
            this.b = this.f10511a + ((int) Math.round(d2));
            return true;
        }
    }

    static float viscousFluid(float f) {
        float f2;
        float f3 = f * sViscousFluidScale;
        if (f3 < 1.0f) {
            f2 = f3 - (1.0f - ((float) Math.exp((double) (-f3))));
        } else {
            f2 = 0.36787945f + ((1.0f - ((float) Math.exp((double) (1.0f - f3)))) * 0.63212055f);
        }
        return f2 * sViscousFluidNormalize;
    }
}
