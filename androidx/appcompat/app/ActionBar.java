package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.ITrustedWebActivityCallback;
import o.IconCompatParcelizer;

public abstract class ActionBar {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface DisplayOptions {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface NavigationMode {
    }

    @Deprecated
    public static abstract class getMin {
        public abstract CharSequence getMax();

        public abstract CharSequence getMin();

        public abstract View length();

        public abstract Drawable setMin();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean IsOverlapping() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean equals() {
        return false;
    }

    public Context getMax() {
        return null;
    }

    public void getMax(@StringRes int i) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMax(boolean z) {
    }

    public abstract int getMin();

    public abstract void getMin(CharSequence charSequence);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMin(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean getMin(KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isInside() {
        return false;
    }

    public abstract int length();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IconCompatParcelizer length(IconCompatParcelizer.getMin getmin) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void length(Configuration configuration) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void length(boolean z) {
    }

    public abstract void setMax();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMin(CharSequence charSequence) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean setMin(int i, KeyEvent keyEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void toFloatRange() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean toIntRange() {
        return false;
    }

    public void setMin() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int setMin;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setMin = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.invoke);
            this.setMin = obtainStyledAttributes.getInt(ITrustedWebActivityCallback.Stub.toIntRange.b, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-2, -2);
            this.setMin = 0;
            this.setMin = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.setMin = 0;
            this.setMin = layoutParams.setMin;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.setMin = 0;
        }
    }
}
