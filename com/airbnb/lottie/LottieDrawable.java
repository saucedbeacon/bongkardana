package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.ScrollingTabContainerView;
import o.getNextLocationOffset;
import o.getTitleMarginTop;
import o.isIconfiedByDefault;
import o.onPopulateAccessibilityEvent;
import o.onSuggestionsKey;
import o.setChildFrame;
import o.setGravity;
import o.setMaxWidth;
import o.setOrientation;
import o.setSuggestionsAdapter;
import o.setSwitchTypefaceByIndex;
import o.setTitleMargin;
import o.setTitleMarginEnd;
import o.setVerticalGravity;

public final class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {
    boolean FastBitmap$CoordinateSystem;
    boolean Grayscale$Algorithm;
    private boolean ICustomTabsCallback;
    final ValueAnimator.AnimatorUpdateListener IsOverlapping;
    boolean Mean$Arithmetic;
    private final Matrix b = new Matrix();
    boolean equals = false;
    private int getCause;
    boolean getMax = true;
    boolean getMin = false;
    @Nullable
    public isIconfiedByDefault hashCode;
    @Nullable
    setSwitchTypefaceByIndex invoke;
    boolean invokeSuspend;
    @Nullable
    String isInside;
    public setVerticalGravity length;
    final setTitleMarginEnd setMax = new setTitleMarginEnd();
    float setMin = 1.0f;
    @Nullable
    public ScrollingTabContainerView toDoubleRange;
    @Nullable
    setSuggestionsAdapter toFloatRange;
    final ArrayList<length> toIntRange = new ArrayList<>();
    @Nullable
    getNextLocationOffset toString;
    boolean valueOf;
    @Nullable
    public setOrientation values;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    interface length {
        void setMax();
    }

    public final int getOpacity() {
        return -3;
    }

    public LottieDrawable() {
        AnonymousClass2 r2 = new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (LottieDrawable.this.invoke != null) {
                    LottieDrawable.this.invoke.getMax(LottieDrawable.this.setMax.getMin());
                }
            }
        };
        this.IsOverlapping = r2;
        this.getCause = 255;
        this.Grayscale$Algorithm = true;
        this.ICustomTabsCallback = false;
        this.setMax.addUpdateListener(r2);
    }

    public final boolean getMin() {
        setSwitchTypefaceByIndex setswitchtypefacebyindex = this.invoke;
        return setswitchtypefacebyindex != null && setswitchtypefacebyindex.getMin();
    }

    public final boolean setMax() {
        setSwitchTypefaceByIndex setswitchtypefacebyindex = this.invoke;
        return setswitchtypefacebyindex != null && setswitchtypefacebyindex.equals();
    }

    public final boolean length() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final boolean setMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final boolean setMax(setVerticalGravity setverticalgravity) {
        boolean z = false;
        if (this.length == setverticalgravity) {
            return false;
        }
        this.ICustomTabsCallback = false;
        equals();
        this.length = setverticalgravity;
        isInside();
        setTitleMarginEnd settitlemarginend = this.setMax;
        if (settitlemarginend.getMax == null) {
            z = true;
        }
        settitlemarginend.getMax = setverticalgravity;
        if (z) {
            settitlemarginend.getMin((float) ((int) Math.max(settitlemarginend.setMin, setverticalgravity.values)), (float) ((int) Math.min(settitlemarginend.setMax, setverticalgravity.toDoubleRange)));
        } else {
            settitlemarginend.getMin((float) ((int) setverticalgravity.values), (float) ((int) setverticalgravity.toDoubleRange));
        }
        float f = settitlemarginend.getMin;
        settitlemarginend.getMin = 0.0f;
        settitlemarginend.getMax((float) ((int) f));
        settitlemarginend.length();
        getMin(this.setMax.getAnimatedFraction());
        this.setMin = this.setMin;
        Iterator it = new ArrayList(this.toIntRange).iterator();
        while (it.hasNext()) {
            length length2 = (length) it.next();
            if (length2 != null) {
                length2.setMax();
            }
            it.remove();
        }
        this.toIntRange.clear();
        setverticalgravity.setMin.getMax = this.invokeSuspend;
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final boolean getMax() {
        return this.Mean$Arithmetic;
    }

    /* access modifiers changed from: package-private */
    public final void isInside() {
        setSwitchTypefaceByIndex setswitchtypefacebyindex = new setSwitchTypefaceByIndex(this, onPopulateAccessibilityEvent.length(this.length), this.length.toIntRange, this.length);
        this.invoke = setswitchtypefacebyindex;
        if (this.valueOf) {
            setswitchtypefacebyindex.length(true);
        }
    }

    public final void equals() {
        if (this.setMax.isRunning()) {
            this.setMax.cancel();
        }
        this.length = null;
        this.invoke = null;
        this.toFloatRange = null;
        setTitleMarginEnd settitlemarginend = this.setMax;
        settitlemarginend.getMax = null;
        settitlemarginend.setMin = -2.14748365E9f;
        settitlemarginend.setMax = 2.14748365E9f;
        invalidateSelf();
    }

    public final void invalidateSelf() {
        if (!this.ICustomTabsCallback) {
            this.ICustomTabsCallback = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.getCause = i;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.getCause;
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        setTitleMargin.setMax("Use addColorFilter instead.");
    }

    public final void draw(@NonNull Canvas canvas) {
        this.ICustomTabsCallback = false;
        setChildFrame.getMin("Drawable#draw");
        if (this.equals) {
            try {
                if (!FastBitmap$CoordinateSystem()) {
                    getMax(canvas);
                } else {
                    setMin(canvas);
                }
            } catch (Throwable unused) {
                setTitleMargin.setMax();
            }
        } else if (!FastBitmap$CoordinateSystem()) {
            getMax(canvas);
        } else {
            setMin(canvas);
        }
        setChildFrame.length("Drawable#draw");
    }

    private boolean FastBitmap$CoordinateSystem() {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null || getBounds().isEmpty()) {
            return true;
        }
        Rect bounds = getBounds();
        Rect rect = setverticalgravity.equals;
        if (((float) bounds.width()) / ((float) bounds.height()) == ((float) rect.width()) / ((float) rect.height())) {
            return true;
        }
        return false;
    }

    @MainThread
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            toFloatRange();
        }
    }

    public final boolean isRunning() {
        return IsOverlapping();
    }

    @MainThread
    public final void toFloatRange() {
        if (this.invoke == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.toFloatRange();
                }
            });
            return;
        }
        if (invoke() || this.setMax.getRepeatCount() == 0) {
            this.setMax.setMin();
        }
        if (!invoke()) {
            float f = 0.0f;
            if (this.setMax.length < 0.0f) {
                setTitleMarginEnd settitlemarginend = this.setMax;
                if (settitlemarginend.getMax != null) {
                    f = settitlemarginend.setMin == -2.14748365E9f ? settitlemarginend.getMax.values : settitlemarginend.setMin;
                }
            } else {
                setTitleMarginEnd settitlemarginend2 = this.setMax;
                if (settitlemarginend2.getMax != null) {
                    f = settitlemarginend2.setMax == 2.14748365E9f ? settitlemarginend2.getMax.toDoubleRange : settitlemarginend2.setMax;
                }
            }
            getMax((int) f);
            this.setMax.IsOverlapping();
        }
    }

    @MainThread
    public final void toIntRange() {
        if (this.invoke == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.toIntRange();
                }
            });
            return;
        }
        if (invoke() || this.setMax.getRepeatCount() == 0) {
            this.setMax.isInside();
        }
        if (!invoke()) {
            float f = 0.0f;
            if (this.setMax.length < 0.0f) {
                setTitleMarginEnd settitlemarginend = this.setMax;
                if (settitlemarginend.getMax != null) {
                    f = settitlemarginend.setMin == -2.14748365E9f ? settitlemarginend.getMax.values : settitlemarginend.setMin;
                }
            } else {
                setTitleMarginEnd settitlemarginend2 = this.setMax;
                if (settitlemarginend2.getMax != null) {
                    f = settitlemarginend2.setMax == 2.14748365E9f ? settitlemarginend2.getMax.toDoubleRange : settitlemarginend2.setMax;
                }
            }
            getMax((int) f);
            this.setMax.IsOverlapping();
        }
    }

    public final void length(final int i) {
        if (this.length == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.length(i);
                }
            });
            return;
        }
        setTitleMarginEnd settitlemarginend = this.setMax;
        settitlemarginend.getMin((float) i, (float) ((int) settitlemarginend.setMax));
    }

    public final void getMax(final float f) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMax(f);
                }
            });
        } else {
            length((int) getTitleMarginTop.getMin(setverticalgravity.values, this.length.toDoubleRange, f));
        }
    }

    public final void setMin(final int i) {
        if (this.length == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.setMin(i);
                }
            });
            return;
        }
        setTitleMarginEnd settitlemarginend = this.setMax;
        settitlemarginend.getMin(settitlemarginend.setMin, ((float) i) + 0.99f);
    }

    public final void setMax(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.setMax(f);
                }
            });
        } else {
            setMin((int) getTitleMarginTop.getMin(setverticalgravity.values, this.length.toDoubleRange, f));
        }
    }

    public final void length(final String str) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.length(str);
                }
            });
            return;
        }
        onSuggestionsKey max = setverticalgravity.getMax(str);
        if (max != null) {
            length((int) max.getMax);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void setMax(final String str) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.setMax(str);
                }
            });
            return;
        }
        onSuggestionsKey max = setverticalgravity.getMax(str);
        if (max != null) {
            setMin((int) (max.getMax + max.setMin));
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void getMax(final String str) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMax(str);
                }
            });
            return;
        }
        onSuggestionsKey max = setverticalgravity.getMax(str);
        if (max != null) {
            int i = (int) max.getMax;
            getMin(i, ((int) max.setMin) + i);
            return;
        }
        StringBuilder sb = new StringBuilder("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void getMin(final String str, final String str2, final boolean z) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMin(str, str2, z);
                }
            });
            return;
        }
        onSuggestionsKey max = setverticalgravity.getMax(str);
        if (max != null) {
            int i = (int) max.getMax;
            onSuggestionsKey max2 = this.length.getMax(str2);
            if (max2 != null) {
                getMin(i, (int) (max2.getMax + (z ? 1.0f : 0.0f)));
                return;
            }
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str2);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot find marker with name ");
        sb2.append(str);
        sb2.append(".");
        throw new IllegalArgumentException(sb2.toString());
    }

    public final void getMin(final int i, final int i2) {
        if (this.length == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMin(i, i2);
                }
            });
        } else {
            this.setMax.getMin((float) i, ((float) i2) + 0.99f);
        }
    }

    public final void getMax(@FloatRange(from = 0.0d, to = 1.0d) final float f, @FloatRange(from = 0.0d, to = 1.0d) final float f2) {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMax(f, f2);
                }
            });
        } else {
            getMin((int) getTitleMarginTop.getMin(setverticalgravity.values, this.length.toDoubleRange, f), (int) getTitleMarginTop.getMin(this.length.values, this.length.toDoubleRange, f2));
        }
    }

    public final void getMax(final int i) {
        if (this.length == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMax(i);
                }
            });
        } else {
            this.setMax.getMax((float) i);
        }
    }

    public final void getMin(@FloatRange(from = 0.0d, to = 1.0d) final float f) {
        if (this.length == null) {
            this.toIntRange.add(new length() {
                public final void setMax() {
                    LottieDrawable.this.getMin(f);
                }
            });
            return;
        }
        setChildFrame.getMin("Drawable#setProgress");
        setTitleMarginEnd settitlemarginend = this.setMax;
        setVerticalGravity setverticalgravity = this.length;
        settitlemarginend.getMax(getTitleMarginTop.getMin(setverticalgravity.values, setverticalgravity.toDoubleRange, f));
        setChildFrame.length("Drawable#setProgress");
    }

    public final boolean IsOverlapping() {
        setTitleMarginEnd settitlemarginend = this.setMax;
        if (settitlemarginend == null) {
            return false;
        }
        return settitlemarginend.isRunning();
    }

    private boolean invoke() {
        return this.getMax || this.getMin;
    }

    public final boolean toDoubleRange() {
        return this.toDoubleRange == null && this.length.toFloatRange.getMin() > 0;
    }

    public final int getIntrinsicWidth() {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            return -1;
        }
        return (int) (((float) setverticalgravity.equals.width()) * this.setMin);
    }

    public final int getIntrinsicHeight() {
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            return -1;
        }
        return (int) (((float) setverticalgravity.equals.height()) * this.setMin);
    }

    public final List<setMaxWidth> setMin(setMaxWidth setmaxwidth) {
        if (this.invoke == null) {
            setTitleMargin.setMax("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.invoke.setMax(setmaxwidth, 0, arrayList, new setMaxWidth(new String[0]));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r5.isEmpty() == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> void setMin(final o.setMaxWidth r5, final T r6, @androidx.annotation.Nullable final o.setTitleMarginBottom<T> r7) {
        /*
            r4 = this;
            o.setSwitchTypefaceByIndex r0 = r4.invoke
            if (r0 != 0) goto L_0x000f
            java.util.ArrayList<com.airbnb.lottie.LottieDrawable$length> r0 = r4.toIntRange
            com.airbnb.lottie.LottieDrawable$6 r1 = new com.airbnb.lottie.LottieDrawable$6
            r1.<init>(r5, r6, r7)
            r0.add(r1)
            return
        L_0x000f:
            o.setMaxWidth r0 = o.setMaxWidth.length
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L_0x001c
            o.setSwitchTypefaceByIndex r5 = r4.invoke
            r5.length(r6, r7)
        L_0x001a:
            r1 = 1
            goto L_0x0046
        L_0x001c:
            o.getMaxWidth r0 = r5.getMin
            if (r0 == 0) goto L_0x0026
            o.getMaxWidth r5 = r5.getMin
            r5.length(r6, r7)
            goto L_0x001a
        L_0x0026:
            java.util.List r5 = r4.setMin((o.setMaxWidth) r5)
            r0 = 0
        L_0x002b:
            int r3 = r5.size()
            if (r0 >= r3) goto L_0x003f
            java.lang.Object r3 = r5.get(r0)
            o.setMaxWidth r3 = (o.setMaxWidth) r3
            o.getMaxWidth r3 = r3.getMin
            r3.length(r6, r7)
            int r0 = r0 + 1
            goto L_0x002b
        L_0x003f:
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0046
            goto L_0x001a
        L_0x0046:
            if (r1 == 0) goto L_0x0058
            r4.invalidateSelf()
            java.lang.Float r5 = o.MenuPopupWindow$MenuDropDownListView.extraCallbackWithResult
            if (r6 != r5) goto L_0x0058
            o.setTitleMarginEnd r5 = r4.setMax
            float r5 = r5.getMin()
            r4.getMin((float) r5)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieDrawable.setMin(o.setMaxWidth, java.lang.Object, o.setTitleMarginBottom):void");
    }

    @Nullable
    public final Bitmap getMin(String str) {
        setGravity setgravity;
        setSuggestionsAdapter values2 = values();
        if (values2 != null) {
            return values2.getMin(str);
        }
        setVerticalGravity setverticalgravity = this.length;
        if (setverticalgravity == null) {
            setgravity = null;
        } else {
            setgravity = setverticalgravity.setMax.get(str);
        }
        if (setgravity != null) {
            return setgravity.setMin;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final setSuggestionsAdapter values() {
        if (getCallback() == null) {
            return null;
        }
        setSuggestionsAdapter setsuggestionsadapter = this.toFloatRange;
        if (setsuggestionsadapter != null) {
            Drawable.Callback callback = getCallback();
            if (!setsuggestionsadapter.setMax((callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext())) {
                this.toFloatRange = null;
            }
        }
        if (this.toFloatRange == null) {
            this.toFloatRange = new setSuggestionsAdapter(getCallback(), this.isInside, this.toString, this.length.setMax);
        }
        return this.toFloatRange;
    }

    public final void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    private float getMin(@NonNull Canvas canvas) {
        return Math.min(((float) canvas.getWidth()) / ((float) this.length.equals.width()), ((float) canvas.getHeight()) / ((float) this.length.equals.height()));
    }

    private void getMax(Canvas canvas) {
        float f;
        if (this.invoke != null) {
            int i = -1;
            Rect bounds = getBounds();
            float width = ((float) bounds.width()) / ((float) this.length.equals.width());
            float height = ((float) bounds.height()) / ((float) this.length.equals.height());
            if (this.Grayscale$Algorithm) {
                float min = Math.min(width, height);
                if (min < 1.0f) {
                    f = 1.0f / min;
                    width /= f;
                    height /= f;
                } else {
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    i = canvas.save();
                    float width2 = ((float) bounds.width()) / 2.0f;
                    float height2 = ((float) bounds.height()) / 2.0f;
                    float f2 = width2 * min;
                    float f3 = min * height2;
                    canvas.translate(width2 - f2, height2 - f3);
                    canvas.scale(f, f, f2, f3);
                }
            }
            this.b.reset();
            this.b.preScale(width, height);
            this.invoke.setMax(canvas, this.b, this.getCause);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    private void setMin(Canvas canvas) {
        float f;
        if (this.invoke != null) {
            float f2 = this.setMin;
            float min = getMin(canvas);
            if (f2 > min) {
                f = this.setMin / min;
            } else {
                min = f2;
                f = 1.0f;
            }
            int i = -1;
            if (f > 1.0f) {
                i = canvas.save();
                float width = ((float) this.length.equals.width()) / 2.0f;
                float height = ((float) this.length.equals.height()) / 2.0f;
                float f3 = width * min;
                float f4 = height * min;
                float f5 = this.setMin;
                canvas.translate((width * f5) - f3, (f5 * height) - f4);
                canvas.scale(f, f, f3, f4);
            }
            this.b.reset();
            this.b.preScale(min, min);
            this.invoke.setMax(canvas, this.b, this.getCause);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    @MainThread
    public final void stop() {
        this.toIntRange.clear();
        this.setMax.IsOverlapping();
    }
}
