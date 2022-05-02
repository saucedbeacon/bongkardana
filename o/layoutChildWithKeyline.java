package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.setFirstVerticalStyle;

@Deprecated
public abstract class layoutChildWithKeyline<T extends View, Z> extends getSuggestedMinimumHeight<Z> {
    private static boolean getMin;
    private static int setMin = setFirstVerticalStyle.getMax.setMin;
    private boolean IsOverlapping;
    protected final T getMax;
    private boolean isInside;
    private final getMin length;
    @Nullable
    private View.OnAttachStateChangeListener setMax;

    public layoutChildWithKeyline(@NonNull T t) {
        if (t != null) {
            this.getMax = (View) t;
            this.length = new getMin(t);
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @CallSuper
    public void getMin(@Nullable Drawable drawable) {
        super.getMin(drawable);
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.setMax;
        if (onAttachStateChangeListener != null && !this.IsOverlapping) {
            this.getMax.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.IsOverlapping = true;
        }
    }

    @NonNull
    public final T length() {
        return this.getMax;
    }

    @CallSuper
    public final void getMin(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
        getMin getmin = this.length;
        int length2 = getmin.length();
        int max = getmin.getMax();
        if (getMin.setMax(length2, max)) {
            getdesiredanchoredchildrectwithoutconstraints.getMax(length2, max);
            return;
        }
        if (!getmin.getMax.contains(getdesiredanchoredchildrectwithoutconstraints)) {
            getmin.getMax.add(getdesiredanchoredchildrectwithoutconstraints);
        }
        if (getmin.getMin == null) {
            ViewTreeObserver viewTreeObserver = getmin.setMax.getViewTreeObserver();
            getmin.getMin = new getMin.C0044getMin(getmin);
            viewTreeObserver.addOnPreDrawListener(getmin.getMin);
        }
    }

    @CallSuper
    public final void setMax(@NonNull getDesiredAnchoredChildRectWithoutConstraints getdesiredanchoredchildrectwithoutconstraints) {
        this.length.getMax.remove(getdesiredanchoredchildrectwithoutconstraints);
    }

    @CallSuper
    public void getMax(@Nullable Drawable drawable) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        super.getMax(drawable);
        this.length.getMin();
        if (!this.isInside && (onAttachStateChangeListener = this.setMax) != null && this.IsOverlapping) {
            this.getMax.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.IsOverlapping = false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target for: ");
        sb.append(this.getMax);
        return sb.toString();
    }

    @VisibleForTesting
    static final class getMin {
        @VisibleForTesting
        @Nullable
        static Integer length;
        final List<getDesiredAnchoredChildRectWithoutConstraints> getMax = new ArrayList();
        @Nullable
        C0044getMin getMin;
        final View setMax;
        boolean setMin;

        private static boolean setMax(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        getMin(@NonNull View view) {
            this.setMax = view;
        }

        private static int getMin(@NonNull Context context) {
            if (length == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    length = Integer.valueOf(Math.max(point.x, point.y));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            return length.intValue();
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            ViewTreeObserver viewTreeObserver = this.setMax.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.getMin);
            }
            this.getMin = null;
            this.getMax.clear();
        }

        static boolean setMax(int i, int i2) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1924173827, oncanceled);
                onCancelLoad.getMin(-1924173827, oncanceled);
            }
            return setMax(i) && setMax(i2);
        }

        /* access modifiers changed from: package-private */
        public final int getMax() {
            int paddingTop = this.setMax.getPaddingTop() + this.setMax.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.setMax.getLayoutParams();
            return length(this.setMax.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* access modifiers changed from: package-private */
        public final int length() {
            int paddingLeft = this.setMax.getPaddingLeft() + this.setMax.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.setMax.getLayoutParams();
            return length(this.setMax.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private int length(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.setMin && this.setMax.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.setMax.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return getMin(this.setMax.getContext());
        }

        /* renamed from: o.layoutChildWithKeyline$getMin$getMin  reason: collision with other inner class name */
        static final class C0044getMin implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<getMin> setMin;

            C0044getMin(@NonNull getMin getmin) {
                this.setMin = new WeakReference<>(getmin);
            }

            public final boolean onPreDraw() {
                getMin getmin = this.setMin.get();
                if (getmin == null || getmin.getMax.isEmpty()) {
                    return true;
                }
                int length = getmin.length();
                int max = getmin.getMax();
                if (!getMin.setMax(length, max)) {
                    return true;
                }
                Iterator it = new ArrayList(getmin.getMax).iterator();
                while (it.hasNext()) {
                    ((getDesiredAnchoredChildRectWithoutConstraints) it.next()).getMax(length, max);
                }
                getmin.getMin();
                return true;
            }
        }
    }

    public final void setMin(@Nullable getResolvedLayoutParams getresolvedlayoutparams) {
        getMin = true;
        this.getMax.setTag(setMin, getresolvedlayoutparams);
    }

    @Nullable
    public final getResolvedLayoutParams getMax() {
        Object tag = this.getMax.getTag(setMin);
        if (tag == null) {
            return null;
        }
        if (tag instanceof getResolvedLayoutParams) {
            return (getResolvedLayoutParams) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }
}
