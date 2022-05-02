package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.setFirstVerticalStyle;

public abstract class recordLastChildRect<T extends View, Z> implements layoutChildWithAnchor<Z> {
    @IdRes
    private static final int getMax = setFirstVerticalStyle.getMax.setMin;
    private boolean equals;
    @Nullable
    private View.OnAttachStateChangeListener getMin;
    private final setMin length;
    private boolean setMax;
    protected final T setMin;

    public final void getMin() {
    }

    public final void setMax() {
    }

    public void setMax(@Nullable Drawable drawable) {
    }

    public final void setMin() {
    }

    /* access modifiers changed from: protected */
    public abstract void setMin(@Nullable Drawable drawable);

    public recordLastChildRect(@NonNull T t) {
        if (t != null) {
            this.setMin = (View) t;
            this.length = new setMin(t);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final void getMin(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
        setMin setmin = this.length;
        int min = setmin.setMin();
        int min2 = setmin.getMin();
        if (setMin.getMax(min, min2)) {
            getdesiredanchoredchildrectwithoutconstraints.getMax(min, min2);
            return;
        }
        if (!setmin.setMin.contains(getdesiredanchoredchildrectwithoutconstraints)) {
            setmin.setMin.add(getdesiredanchoredchildrectwithoutconstraints);
        }
        if (setmin.setMax == null) {
            ViewTreeObserver viewTreeObserver = setmin.getMin.getViewTreeObserver();
            setmin.setMax = new setMin.length(setmin);
            viewTreeObserver.addOnPreDrawListener(setmin.setMax);
        }
    }

    public final void setMax(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
        this.length.setMin.remove(getdesiredanchoredchildrectwithoutconstraints);
    }

    public final void getMax(@Nullable Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        this.length.length();
        setMin(drawable);
        if (!this.setMax && (onAttachStateChangeListener = this.getMin) != null && this.equals) {
            this.setMin.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.equals = false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target for: ");
        sb.append(this.setMin);
        return sb.toString();
    }

    @VisibleForTesting
    static final class setMin {
        @VisibleForTesting
        @Nullable
        static Integer getMax;
        final View getMin;
        boolean length;
        @Nullable
        length setMax;
        final List<getDesiredAnchoredChildRectWithoutConstraints> setMin = new ArrayList();

        private static boolean setMax(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        setMin(@NonNull View view) {
            this.getMin = view;
        }

        private static int getMax(@NonNull Context context) {
            if (getMax == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    getMax = Integer.valueOf(Math.max(point.x, point.y));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            return getMax.intValue();
        }

        /* access modifiers changed from: package-private */
        public final void length() {
            ViewTreeObserver viewTreeObserver = this.getMin.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.setMax);
            }
            this.setMax = null;
            this.setMin.clear();
        }

        static boolean getMax(int i, int i2) {
            return setMax(i) && setMax(i2);
        }

        /* access modifiers changed from: package-private */
        public final int getMin() {
            int paddingTop = this.getMin.getPaddingTop() + this.getMin.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.getMin.getLayoutParams();
            return getMin(this.getMin.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* access modifiers changed from: package-private */
        public final int setMin() {
            int paddingLeft = this.getMin.getPaddingLeft() + this.getMin.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.getMin.getLayoutParams();
            return getMin(this.getMin.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private int getMin(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.length && this.getMin.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.getMin.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return getMax(this.getMin.getContext());
        }

        static final class length implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<setMin> setMax;

            length(@NonNull setMin setmin) {
                this.setMax = new WeakReference<>(setmin);
            }

            public final boolean onPreDraw() {
                setMin setmin = this.setMax.get();
                if (setmin == null || setmin.setMin.isEmpty()) {
                    return true;
                }
                int min = setmin.setMin();
                int min2 = setmin.getMin();
                if (!setMin.getMax(min, min2)) {
                    return true;
                }
                Iterator it = new ArrayList(setmin.setMin).iterator();
                while (it.hasNext()) {
                    ((getDesiredAnchoredChildRectWithoutConstraints) it.next()).getMax(min, min2);
                }
                setmin.length();
                return true;
            }
        }
    }

    public final void getMin(@Nullable Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.getMin;
        if (onAttachStateChangeListener != null && !this.equals) {
            this.setMin.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.equals = true;
        }
        setMax(drawable);
    }

    public final void setMin(@Nullable getResolvedLayoutParams getresolvedlayoutparams) {
        this.setMin.setTag(getMax, getresolvedlayoutparams);
    }

    @Nullable
    public final getResolvedLayoutParams getMax() {
        Object tag = this.setMin.getTag(getMax);
        if (tag == null) {
            return null;
        }
        if (tag instanceof getResolvedLayoutParams) {
            return (getResolvedLayoutParams) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }
}
