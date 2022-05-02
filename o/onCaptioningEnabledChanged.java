package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;
import o.RatingCompat;
import o.onQueueTitleChanged;

final class onCaptioningEnabledChanged extends onQueueChanged implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    private static final int setMin = ITrustedWebActivityCallback.Stub.equals.FastBitmap$CoordinateSystem;
    private PopupWindow.OnDismissListener FastBitmap$CoordinateSystem;
    private View Grayscale$Algorithm;
    private int Mean$Arithmetic;
    private int create = 0;
    private final onEvent equals;
    final MenuPopupWindow getMax;
    final ViewTreeObserver.OnGlobalLayoutListener getMin = new ViewTreeObserver.OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (onCaptioningEnabledChanged.this.getMin() && !onCaptioningEnabledChanged.this.getMax.equals()) {
                View view = onCaptioningEnabledChanged.this.setMax;
                if (view == null || !view.isShown()) {
                    onCaptioningEnabledChanged.this.length();
                } else {
                    onCaptioningEnabledChanged.this.getMax.b_();
                }
            }
        }
    };
    private final int hashCode;
    private onQueueTitleChanged.setMax invoke;
    private boolean invokeSuspend;
    private final RatingCompat.StarStyle isInside;
    ViewTreeObserver length;
    private boolean onNavigationEvent;
    View setMax;
    private final View.OnAttachStateChangeListener toDoubleRange = new View.OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (onCaptioningEnabledChanged.this.length != null) {
                if (!onCaptioningEnabledChanged.this.length.isAlive()) {
                    onCaptioningEnabledChanged.this.length = view.getViewTreeObserver();
                }
                onCaptioningEnabledChanged.this.length.removeGlobalOnLayoutListener(onCaptioningEnabledChanged.this.getMin);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final Context toFloatRange;
    private final boolean toIntRange;
    private final int toString;
    private boolean valueOf;
    private final int values;

    public final boolean flagActionItems() {
        return false;
    }

    public final void length(onEvent onevent) {
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public onCaptioningEnabledChanged(Context context, onEvent onevent, View view, int i, int i2, boolean z) {
        this.toFloatRange = context;
        this.equals = onevent;
        this.toIntRange = z;
        this.isInside = new RatingCompat.StarStyle(onevent, LayoutInflater.from(context), this.toIntRange, setMin);
        this.toString = i;
        this.values = i2;
        Resources resources = context.getResources();
        this.hashCode = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.getMin));
        this.Grayscale$Algorithm = view;
        this.getMax = new MenuPopupWindow(this.toFloatRange, this.toString, this.values);
        onevent.addMenuPresenter(this, context);
    }

    public final void length(boolean z) {
        this.isInside.setMin = z;
    }

    public final void getMax(int i) {
        this.create = i;
    }

    private boolean IsOverlapping() {
        View view;
        if (getMin()) {
            return true;
        }
        if (this.valueOf || (view = this.Grayscale$Algorithm) == null) {
            return false;
        }
        this.setMax = view;
        this.getMax.length((PopupWindow.OnDismissListener) this);
        this.getMax.setMax((AdapterView.OnItemClickListener) this);
        this.getMax.setMin(true);
        View view2 = this.setMax;
        boolean z = this.length == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.length = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.getMin);
        }
        view2.addOnAttachStateChangeListener(this.toDoubleRange);
        this.getMax.setMax(view2);
        this.getMax.toFloatRange(this.create);
        if (!this.invokeSuspend) {
            this.Mean$Arithmetic = length(this.isInside, (ViewGroup) null, this.toFloatRange, this.hashCode);
            this.invokeSuspend = true;
        }
        this.getMax.equals(this.Mean$Arithmetic);
        this.getMax.isInside(2);
        this.getMax.length(this.IsOverlapping);
        this.getMax.b_();
        ListView c_ = this.getMax.c_();
        c_.setOnKeyListener(this);
        if (this.onNavigationEvent && this.equals.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.toFloatRange).inflate(ITrustedWebActivityCallback.Stub.equals.values, c_, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.equals.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            c_.addHeaderView(frameLayout, (Object) null, false);
        }
        this.getMax.setMax((ListAdapter) this.isInside);
        this.getMax.b_();
        return true;
    }

    public final void b_() {
        if (!IsOverlapping()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public final void length() {
        if (getMin()) {
            this.getMax.length();
        }
    }

    public final boolean getMin() {
        return !this.valueOf && this.getMax.getMin();
    }

    public final void onDismiss() {
        this.valueOf = true;
        this.equals.close();
        ViewTreeObserver viewTreeObserver = this.length;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.length = this.setMax.getViewTreeObserver();
            }
            this.length.removeGlobalOnLayoutListener(this.getMin);
            this.length = null;
        }
        this.setMax.removeOnAttachStateChangeListener(this.toDoubleRange);
        PopupWindow.OnDismissListener onDismissListener = this.FastBitmap$CoordinateSystem;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void updateMenuView(boolean z) {
        this.invokeSuspend = false;
        RatingCompat.StarStyle starStyle = this.isInside;
        if (starStyle != null) {
            starStyle.notifyDataSetChanged();
        }
    }

    public final void setCallback(onQueueTitleChanged.setMax setmax) {
        this.invoke = setmax;
    }

    public final boolean onSubMenuSelected(onExtrasChanged onextraschanged) {
        if (onextraschanged.hasVisibleItems()) {
            onMetadataChanged onmetadatachanged = new onMetadataChanged(this.toFloatRange, onextraschanged, this.setMax, this.toIntRange, this.toString, this.values);
            onQueueTitleChanged.setMax setmax = this.invoke;
            onmetadatachanged.setMin = setmax;
            if (onmetadatachanged.setMax != null) {
                onmetadatachanged.setMax.setCallback(setmax);
            }
            boolean max = onQueueChanged.getMax((onEvent) onextraschanged);
            onmetadatachanged.length = max;
            if (onmetadatachanged.setMax != null) {
                onmetadatachanged.setMax.length(max);
            }
            onmetadatachanged.getMax = this.FastBitmap$CoordinateSystem;
            this.FastBitmap$CoordinateSystem = null;
            this.equals.close(false);
            int IsOverlapping = this.getMax.IsOverlapping();
            int max2 = this.getMax.setMax();
            if ((Gravity.getAbsoluteGravity(this.create, ViewCompat.IsOverlapping(this.Grayscale$Algorithm)) & 7) == 5) {
                IsOverlapping += this.Grayscale$Algorithm.getWidth();
            }
            if (onmetadatachanged.setMin(IsOverlapping, max2)) {
                onQueueTitleChanged.setMax setmax2 = this.invoke;
                if (setmax2 == null) {
                    return true;
                }
                setmax2.setMax(onextraschanged);
                return true;
            }
        }
        return false;
    }

    public final void onCloseMenu(onEvent onevent, boolean z) {
        if (onevent == this.equals) {
            length();
            onQueueTitleChanged.setMax setmax = this.invoke;
            if (setmax != null) {
                setmax.getMax(onevent, z);
            }
        }
    }

    public final void setMin(View view) {
        this.Grayscale$Algorithm = view;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        length();
        return true;
    }

    public final void getMax(PopupWindow.OnDismissListener onDismissListener) {
        this.FastBitmap$CoordinateSystem = onDismissListener;
    }

    public final ListView c_() {
        return this.getMax.c_();
    }

    public final void length(int i) {
        this.getMax.getMin(i);
    }

    public final void getMin(int i) {
        this.getMax.setMax(i);
    }

    public final void getMin(boolean z) {
        this.onNavigationEvent = z;
    }
}
