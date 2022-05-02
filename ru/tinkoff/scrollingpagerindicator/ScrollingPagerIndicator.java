package ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import o.DateChangeBroadCastReceiver;
import o.MasExceptionLogPB;
import o.shouldWrite;

public class ScrollingPagerIndicator extends View {
    @ColorInt
    private int FastBitmap$CoordinateSystem;
    private getMax<?> Grayscale$Algorithm;
    private float IsOverlapping;
    private boolean Mean$Arithmetic;
    private float equals;
    private int getMax;
    private final int getMin;
    private final ArgbEvaluator hashCode;
    private Runnable invokeSuspend;
    private SparseArray<Float> isInside;
    private int length;
    private final int setMax;
    private final int setMin;
    @ColorInt
    private int toDoubleRange;
    private int toFloatRange;
    private float toIntRange;
    private final Paint toString;
    private boolean valueOf;
    /* access modifiers changed from: private */
    public int values;

    public interface getMax<T> {
        void length();

        void length(@NonNull ScrollingPagerIndicator scrollingPagerIndicator, @NonNull T t);
    }

    public ScrollingPagerIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrollingPagerIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollingPagerIndicator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hashCode = new ArgbEvaluator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DateChangeBroadCastReceiver.getMin.length, i, DateChangeBroadCastReceiver.setMin.getMax);
        this.FastBitmap$CoordinateSystem = obtainStyledAttributes.getColor(DateChangeBroadCastReceiver.getMin.setMax, 0);
        this.toDoubleRange = obtainStyledAttributes.getColor(DateChangeBroadCastReceiver.getMin.getMax, this.FastBitmap$CoordinateSystem);
        this.setMin = obtainStyledAttributes.getDimensionPixelSize(DateChangeBroadCastReceiver.getMin.setMin, 0);
        this.getMin = obtainStyledAttributes.getDimensionPixelSize(DateChangeBroadCastReceiver.getMin.getMin, 0);
        this.setMax = obtainStyledAttributes.getDimensionPixelSize(DateChangeBroadCastReceiver.getMin.isInside, 0) + this.setMin;
        this.valueOf = obtainStyledAttributes.getBoolean(DateChangeBroadCastReceiver.getMin.toFloatRange, false);
        int i2 = obtainStyledAttributes.getInt(DateChangeBroadCastReceiver.getMin.IsOverlapping, 0);
        setVisibleDotCount(i2);
        this.toFloatRange = obtainStyledAttributes.getInt(DateChangeBroadCastReceiver.getMin.toIntRange, 2);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.toString = paint;
        paint.setAntiAlias(true);
        if (isInEditMode()) {
            setDotCount(i2);
            onPageScrolled(i2 / 2, 0.0f);
        }
    }

    public void setLooped(boolean z) {
        this.valueOf = z;
        reattach();
        invalidate();
    }

    @ColorInt
    public int getDotColor() {
        return this.FastBitmap$CoordinateSystem;
    }

    public void setDotColor(@ColorInt int i) {
        this.FastBitmap$CoordinateSystem = i;
        invalidate();
    }

    @ColorInt
    public int getSelectedDotColor() {
        return this.toDoubleRange;
    }

    public void setSelectedDotColor(@ColorInt int i) {
        this.toDoubleRange = i;
        invalidate();
    }

    public int getVisibleDotCount() {
        return this.getMax;
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.getMax = i;
            this.length = i + 2;
            if (this.invokeSuspend != null) {
                reattach();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
    }

    public int getVisibleDotThreshold() {
        return this.toFloatRange;
    }

    public void setVisibleDotThreshold(int i) {
        this.toFloatRange = i;
        if (this.invokeSuspend != null) {
            reattach();
        } else {
            requestLayout();
        }
    }

    public void attachToPager(@NonNull ViewPager viewPager) {
        attachToPager(viewPager, new MasExceptionLogPB.MasExceptionLogOrBuilder());
    }

    public void attachToRecyclerView(@NonNull RecyclerView recyclerView) {
        attachToPager(recyclerView, new shouldWrite());
    }

    public void attachToRecyclerView(@NonNull RecyclerView recyclerView, int i) {
        attachToPager(recyclerView, new shouldWrite(i));
    }

    public <T> void attachToPager(@NonNull final T t, @NonNull final getMax<T> getmax) {
        detachFromPager();
        getmax.length(this, t);
        this.Grayscale$Algorithm = getmax;
        this.invokeSuspend = new Runnable() {
            public final void run() {
                int unused = ScrollingPagerIndicator.this.values = -1;
                ScrollingPagerIndicator.this.attachToPager(t, getmax);
            }
        };
    }

    public void detachFromPager() {
        getMax<?> getmax = this.Grayscale$Algorithm;
        if (getmax != null) {
            getmax.length();
            this.Grayscale$Algorithm = null;
            this.invokeSuspend = null;
        }
        this.Mean$Arithmetic = false;
    }

    public void reattach() {
        Runnable runnable = this.invokeSuspend;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public void onPageScrolled(int i, float f) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        } else if (i < 0 || (i != 0 && i >= this.values)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        } else {
            if (!this.valueOf || ((i5 = this.values) <= this.getMax && i5 > 1)) {
                this.isInside.clear();
                if (this.isInside != null) {
                    if (!this.valueOf || this.values <= this.getMax) {
                        i4 = this.values;
                    } else {
                        i4 = this.length;
                    }
                    if (i4 != 0) {
                        float abs = 1.0f - Math.abs(f);
                        if (abs == 0.0f) {
                            this.isInside.remove(i);
                        } else {
                            this.isInside.put(i, Float.valueOf(abs));
                        }
                    }
                }
                int i6 = this.values;
                if (i < i6 - 1) {
                    int i7 = i + 1;
                    float f2 = 1.0f - f;
                    if (this.isInside != null) {
                        if (!this.valueOf || i6 <= this.getMax) {
                            i3 = this.values;
                        } else {
                            i3 = this.length;
                        }
                        if (i3 != 0) {
                            float abs2 = 1.0f - Math.abs(f2);
                            if (abs2 == 0.0f) {
                                this.isInside.remove(i7);
                            } else {
                                this.isInside.put(i7, Float.valueOf(abs2));
                            }
                        }
                    }
                } else if (i6 > 1) {
                    float f3 = 1.0f - f;
                    if (this.isInside != null) {
                        if (!this.valueOf || i6 <= this.getMax) {
                            i2 = this.values;
                        } else {
                            i2 = this.length;
                        }
                        if (i2 != 0) {
                            float abs3 = 1.0f - Math.abs(f3);
                            if (abs3 == 0.0f) {
                                this.isInside.remove(0);
                            } else {
                                this.isInside.put(0, Float.valueOf(abs3));
                            }
                        }
                    }
                }
                invalidate();
            }
            setMin(f, i);
            invalidate();
        }
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.values)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        } else if (this.values != 0) {
            setMin(0.0f, i);
            if (!this.valueOf || this.values < this.getMax) {
                this.isInside.clear();
                this.isInside.put(i, Float.valueOf(1.0f));
                invalidate();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x0012
            int r4 = r3.getMax
            int r4 = r4 + -1
            int r0 = r3.setMax
            int r4 = r4 * r0
            int r0 = r3.getMin
        L_0x0010:
            int r4 = r4 + r0
            goto L_0x0025
        L_0x0012:
            int r4 = r3.values
            int r0 = r3.getMax
            if (r4 < r0) goto L_0x001c
            float r4 = r3.IsOverlapping
            int r4 = (int) r4
            goto L_0x0025
        L_0x001c:
            int r4 = r4 + -1
            int r0 = r3.setMax
            int r4 = r4 * r0
            int r0 = r3.getMin
            goto L_0x0010
        L_0x0025:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r1 = r3.getMin
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x0039
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x003d
            r5 = r1
            goto L_0x003d
        L_0x0039:
            int r5 = java.lang.Math.min(r1, r5)
        L_0x003d:
            r3.setMeasuredDimension(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    private void setMin(float f, int i) {
        int i2;
        int i3 = this.values;
        int i4 = this.getMax;
        if (i3 <= i4) {
            this.toIntRange = 0.0f;
            return;
        }
        boolean z = this.valueOf;
        if (z || i3 <= i4) {
            float f2 = this.equals;
            int i5 = this.setMax;
            this.toIntRange = ((f2 + ((float) ((this.length / 2) * i5))) + (((float) i5) * f)) - (this.IsOverlapping / 2.0f);
            return;
        }
        float f3 = this.equals;
        int i6 = this.setMax;
        this.toIntRange = ((f3 + ((float) (i * i6))) + (((float) i6) * f)) - (this.IsOverlapping / 2.0f);
        int i7 = i4 / 2;
        if (!z || i3 <= i4) {
            i2 = this.values;
        } else {
            i2 = this.length;
        }
        float f4 = this.equals;
        int i8 = this.setMax;
        float f5 = ((float) (((i2 - 1) - i7) * i8)) + f4;
        float f6 = this.toIntRange;
        float f7 = this.IsOverlapping;
        if ((f7 / 2.0f) + f6 < ((float) (i7 * i8)) + f4) {
            this.toIntRange = (f4 + ((float) (i7 * i8))) - (f7 / 2.0f);
        } else if (f6 + (f7 / 2.0f) > f5) {
            this.toIntRange = f5 - (f7 / 2.0f);
        }
    }

    public void setDotCount(int i) {
        if (this.values != i || !this.Mean$Arithmetic) {
            this.values = i;
            this.Mean$Arithmetic = true;
            this.isInside = new SparseArray<>();
            if (i < this.toFloatRange) {
                requestLayout();
                invalidate();
                return;
            }
            this.equals = (!this.valueOf || this.values <= this.getMax) ? (float) (this.getMin / 2) : 0.0f;
            this.IsOverlapping = (float) (((this.getMax - 1) * this.setMax) + this.getMin);
            requestLayout();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cc, code lost:
        if (r9 < r8) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        if (r9 < r8) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            boolean r0 = r14.valueOf
            if (r0 == 0) goto L_0x000d
            int r0 = r14.values
            int r1 = r14.getMax
            if (r0 <= r1) goto L_0x000d
            int r0 = r14.length
            goto L_0x000f
        L_0x000d:
            int r0 = r14.values
        L_0x000f:
            int r1 = r14.toFloatRange
            if (r0 >= r1) goto L_0x0014
            return
        L_0x0014:
            int r1 = r14.setMax
            int r2 = r14.getMin
            int r3 = r14.setMin
            int r3 = r2 - r3
            int r3 = r3 / 2
            int r3 = r3 + r1
            float r3 = (float) r3
            r4 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r4
            int r2 = r2 / 2
            float r2 = (float) r2
            r4 = 1062956471(0x3f5b6db7, float:0.85714287)
            float r5 = (float) r1
            float r5 = r5 * r4
            float r4 = r14.toIntRange
            float r6 = r14.equals
            float r7 = r4 - r6
            int r7 = (int) r7
            int r7 = r7 / r1
            float r8 = r14.IsOverlapping
            float r4 = r4 + r8
            int r8 = r7 * r1
            float r8 = (float) r8
            float r6 = r6 + r8
            float r4 = r4 - r6
            int r4 = (int) r4
            int r4 = r4 / r1
            int r4 = r4 + r7
            if (r7 != 0) goto L_0x0049
            int r1 = r4 + 1
            if (r1 <= r0) goto L_0x0049
            int r4 = r0 + -1
        L_0x0049:
            if (r7 > r4) goto L_0x011e
            float r1 = r14.equals
            int r6 = r14.setMax
            int r6 = r6 * r7
            float r6 = (float) r6
            float r1 = r1 + r6
            float r6 = r14.toIntRange
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x011a
            float r8 = r14.IsOverlapping
            float r9 = r6 + r8
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x011a
            boolean r9 = r14.valueOf
            r10 = 1073741824(0x40000000, float:2.0)
            r11 = 0
            if (r9 == 0) goto L_0x0092
            int r9 = r14.values
            int r12 = r14.getMax
            if (r9 <= r12) goto L_0x0092
            float r8 = r8 / r10
            float r6 = r6 + r8
            float r8 = r6 - r5
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0080
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0080
            float r6 = r1 - r6
            float r6 = r6 + r5
            float r11 = r6 / r5
            goto L_0x00a0
        L_0x0080:
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a0
            float r8 = r6 + r5
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a0
            r8 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 - r6
            float r6 = r6 / r5
            float r11 = r8 - r6
            goto L_0x00a0
        L_0x0092:
            android.util.SparseArray<java.lang.Float> r6 = r14.isInside
            java.lang.Object r6 = r6.get(r7)
            java.lang.Float r6 = (java.lang.Float) r6
            if (r6 == 0) goto L_0x00a0
            float r11 = r6.floatValue()
        L_0x00a0:
            int r6 = r14.setMin
            float r8 = (float) r6
            int r9 = r14.getMin
            int r9 = r9 - r6
            float r6 = (float) r9
            float r6 = r6 * r11
            float r8 = r8 + r6
            int r6 = r14.values
            int r9 = r14.getMax
            if (r6 <= r9) goto L_0x00ed
            boolean r6 = r14.valueOf
            if (r6 != 0) goto L_0x00bc
            if (r7 == 0) goto L_0x00ba
            int r6 = r0 + -1
            if (r7 != r6) goto L_0x00bc
        L_0x00ba:
            r6 = r2
            goto L_0x00bd
        L_0x00bc:
            r6 = r3
        L_0x00bd:
            float r9 = r14.toIntRange
            float r12 = r1 - r9
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x00cf
            float r9 = r1 - r9
            float r9 = r9 * r8
            float r9 = r9 / r6
            int r6 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ed
            goto L_0x00ec
        L_0x00cf:
            float r9 = r1 - r9
            int r12 = r15.getWidth()
            float r12 = (float) r12
            float r12 = r12 - r6
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ed
            float r9 = -r1
            float r12 = r14.toIntRange
            float r9 = r9 + r12
            int r12 = r15.getWidth()
            float r12 = (float) r12
            float r9 = r9 + r12
            float r9 = r9 * r8
            float r9 = r9 / r6
            int r6 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ed
        L_0x00ec:
            r8 = r9
        L_0x00ed:
            android.graphics.Paint r6 = r14.toString
            android.animation.ArgbEvaluator r9 = r14.hashCode
            int r12 = r14.FastBitmap$CoordinateSystem
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r13 = r14.toDoubleRange
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r9 = r9.evaluate(r11, r12, r13)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6.setColor(r9)
            float r6 = r14.toIntRange
            float r1 = r1 - r6
            int r6 = r14.getMeasuredHeight()
            int r6 = r6 / 2
            float r6 = (float) r6
            float r8 = r8 / r10
            android.graphics.Paint r9 = r14.toString
            r15.drawCircle(r1, r6, r8, r9)
        L_0x011a:
            int r7 = r7 + 1
            goto L_0x0049
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onDraw(android.graphics.Canvas):void");
    }
}
