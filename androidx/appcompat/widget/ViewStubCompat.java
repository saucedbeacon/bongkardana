package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import o.ITrustedWebActivityCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat extends View {
    private WeakReference<View> getMax;
    private setMin getMin;
    private int length;
    private LayoutInflater setMax;
    private int setMin;

    public interface setMin {
        void setMax(ViewStubCompat viewStubCompat, View view);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setMin = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.FontRes, i, 0);
        this.length = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.value, -1);
        this.setMin = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.FractionRes, 0);
        setId(obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.fromInclusive, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final int getInflatedId() {
        return this.length;
    }

    public final void setInflatedId(int i) {
        this.length = i;
    }

    public final int getLayoutResource() {
        return this.setMin;
    }

    public final void setLayoutResource(int i) {
        this.setMin = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.setMax = layoutInflater;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.getMax;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            inflate();
        }
    }

    public final View inflate() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.setMin != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.setMax;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.setMin, viewGroup, false);
            int i = this.length;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.getMax = new WeakReference<>(inflate);
            setMin setmin = this.getMin;
            if (setmin != null) {
                setmin.setMax(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void setOnInflateListener(setMin setmin) {
        this.getMin = setmin;
    }
}
