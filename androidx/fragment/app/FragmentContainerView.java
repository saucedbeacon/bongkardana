package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import o.setAlpha;
import o.setColorFilter;

public final class FragmentContainerView extends FrameLayout {
    private ArrayList<View> getMin;
    private boolean length;
    private ArrayList<View> setMax;
    private View.OnApplyWindowInsetsListener setMin;

    @RequiresApi(20)
    @NonNull
    public final WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        return windowInsets;
    }

    public FragmentContainerView(@NonNull Context context) {
        super(context);
        this.length = true;
    }

    public FragmentContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.length = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAlpha.setMin.toFloatRange);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(setAlpha.setMin.isInside);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
                sb.append(str);
                sb.append("=\"");
                sb.append(classAttribute);
                sb.append("\"");
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    public FragmentContainerView(@NonNull Context context, @NonNull AttributeSet attributeSet, @NonNull FragmentManager fragmentManager) {
        super(context, attributeSet);
        this.length = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAlpha.setMin.toFloatRange);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(setAlpha.setMin.isInside) : classAttribute;
        String string = obtainStyledAttributes.getString(setAlpha.setMin.toIntRange);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment findFragmentById = fragmentManager.findFragmentById(id2);
        if (classAttribute != null && findFragmentById == null) {
            if (id2 <= 0) {
                String concat = string != null ? " with tag ".concat(String.valueOf(string)) : "";
                StringBuilder sb = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb.append(classAttribute);
                sb.append(concat);
                throw new IllegalStateException(sb.toString());
            }
            Fragment max = fragmentManager.ICustomTabsCallback().getMax(context.getClassLoader(), classAttribute);
            max.onInflate(context, attributeSet, (Bundle) null);
            setColorFilter setcolorfilter = new setColorFilter(fragmentManager);
            setcolorfilter.Grayscale$Algorithm = true;
            max.mContainer = this;
            setcolorfilter.length(getId(), max, string, 1);
            setcolorfilter.getMin();
        }
        fragmentManager.setMax(this);
    }

    public final void setLayoutTransition(@Nullable LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final void setOnApplyWindowInsetsListener(@NonNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.setMin = onApplyWindowInsetsListener;
    }

    @RequiresApi(20)
    @NonNull
    public final WindowInsets dispatchApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat;
        WindowInsetsCompat min = WindowInsetsCompat.getMin(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.setMin;
        if (onApplyWindowInsetsListener != null) {
            windowInsetsCompat = WindowInsetsCompat.getMin(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            windowInsetsCompat = ViewCompat.setMin((View) this, min);
        }
        if (!windowInsetsCompat.IsOverlapping()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewCompat.length(getChildAt(i), windowInsetsCompat);
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(@NonNull Canvas canvas) {
        if (this.length && this.setMax != null) {
            for (int i = 0; i < this.setMax.size(); i++) {
                super.drawChild(canvas, this.setMax.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final boolean drawChild(@NonNull Canvas canvas, @NonNull View view, long j) {
        ArrayList<View> arrayList;
        if (!this.length || (arrayList = this.setMax) == null || arrayList.size() <= 0 || !this.setMax.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public final void startViewTransition(@NonNull View view) {
        if (view.getParent() == this) {
            if (this.getMin == null) {
                this.getMin = new ArrayList<>();
            }
            this.getMin.add(view);
        }
        super.startViewTransition(view);
    }

    public final void endViewTransition(@NonNull View view) {
        ArrayList<View> arrayList = this.getMin;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.setMax;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.length = true;
            }
        }
        super.endViewTransition(view);
    }

    /* access modifiers changed from: package-private */
    public final void setDrawDisappearingViewsLast(boolean z) {
        this.length = z;
    }

    public final void addView(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.length(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean addViewInLayout(@NonNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.length(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    public final void removeViewAt(int i) {
        setMin(getChildAt(i));
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(@NonNull View view) {
        setMin(view);
        super.removeViewInLayout(view);
    }

    public final void removeView(@NonNull View view) {
        setMin(view);
        super.removeView(view);
    }

    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            setMin(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            setMin(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            setMin(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public final void removeDetachedView(@NonNull View view, boolean z) {
        if (z) {
            setMin(view);
        }
        super.removeDetachedView(view, z);
    }

    private void setMin(@NonNull View view) {
        ArrayList<View> arrayList = this.getMin;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.setMax == null) {
                this.setMax = new ArrayList<>();
            }
            this.setMax.add(view);
        }
    }
}
