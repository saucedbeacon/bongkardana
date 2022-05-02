package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.AnimRes;
import o.AnyThread;
import o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.from;
import o.to;

public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private int getMin;
    private OnBackPressedDispatcher$LifecycleOnBackPressedCancellable length;
    private int setMax;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getType() {
        return this.getMin;
    }

    public void setType(int i) {
        this.getMin = i;
    }

    private void setMin(ConstraintWidget constraintWidget, int i, boolean z) {
        this.setMax = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.getMin;
            if (i2 == 5) {
                this.setMax = 0;
            } else if (i2 == 6) {
                this.setMax = 1;
            }
        } else if (z) {
            int i3 = this.getMin;
            if (i3 == 5) {
                this.setMax = 1;
            } else if (i3 == 6) {
                this.setMax = 0;
            }
        } else {
            int i4 = this.getMin;
            if (i4 == 5) {
                this.setMax = 0;
            } else if (i4 == 6) {
                this.setMax = 1;
            }
        }
        if (constraintWidget instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
            ((OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) constraintWidget).setMin = this.setMax;
        }
    }

    public void resolveRtl(ConstraintWidget constraintWidget, boolean z) {
        setMin(constraintWidget, this.getMin, z);
    }

    /* access modifiers changed from: protected */
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.length = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.onSessionDestroyed);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.getLaunchPendingIntent) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == to.length.registerCallbackListener) {
                    this.length.length = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == to.length.getTag) {
                    this.length.setMax = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.length;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.length.length = z;
    }

    public boolean allowsGoneWidget() {
        return this.length.length();
    }

    public void setDpMargin(int i) {
        this.length.setMax = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int getMargin() {
        return this.length.setMax;
    }

    public void setMargin(int i) {
        this.length.setMax = i;
    }

    public void loadParameters(from.length length2, AnyThread anyThread, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.loadParameters(length2, anyThread, layoutParams, sparseArray);
        if (anyThread instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable onBackPressedDispatcher$LifecycleOnBackPressedCancellable = (OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) anyThread;
            setMin(onBackPressedDispatcher$LifecycleOnBackPressedCancellable, length2.setMin.ICustomTabsService$Stub, ((AnimRes) anyThread.requestPostMessageChannel).toFloatRange());
            onBackPressedDispatcher$LifecycleOnBackPressedCancellable.length = length2.setMin.ITrustedWebActivityCallback$Default;
            onBackPressedDispatcher$LifecycleOnBackPressedCancellable.setMax = length2.setMin.ICustomTabsService$Stub$Proxy;
        }
    }
}
