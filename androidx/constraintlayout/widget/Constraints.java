package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import o.from;
import o.to;

public class Constraints extends ViewGroup {
    public static final String TAG = "Constraints";
    from myConstraintSet;

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float INotificationSideChannel;
        public float INotificationSideChannel$Default;
        public float INotificationSideChannel$Stub;
        public float INotificationSideChannel$Stub$Proxy;
        public float ITrustedWebActivityService$Default;
        public float ITrustedWebActivityService$Stub;
        public float ITrustedWebActivityService$Stub$Proxy;
        public float cancel;
        public float cancelAll;
        public boolean getActiveNotifications;
        public float getSmallIconBitmap;
        public float notify;
        public float notifyNotificationWithChannel;

        public LayoutParams() {
            this.getSmallIconBitmap = 1.0f;
            this.getActiveNotifications = false;
            this.notifyNotificationWithChannel = 0.0f;
            this.notify = 0.0f;
            this.ITrustedWebActivityService$Default = 0.0f;
            this.ITrustedWebActivityService$Stub = 0.0f;
            this.INotificationSideChannel = 1.0f;
            this.ITrustedWebActivityService$Stub$Proxy = 1.0f;
            this.INotificationSideChannel$Default = 0.0f;
            this.INotificationSideChannel$Stub$Proxy = 0.0f;
            this.cancelAll = 0.0f;
            this.INotificationSideChannel$Stub = 0.0f;
            this.cancel = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.getSmallIconBitmap = 1.0f;
            this.getActiveNotifications = false;
            this.notifyNotificationWithChannel = 0.0f;
            this.notify = 0.0f;
            this.ITrustedWebActivityService$Default = 0.0f;
            this.ITrustedWebActivityService$Stub = 0.0f;
            this.INotificationSideChannel = 1.0f;
            this.ITrustedWebActivityService$Stub$Proxy = 1.0f;
            this.INotificationSideChannel$Default = 0.0f;
            this.INotificationSideChannel$Stub$Proxy = 0.0f;
            this.cancelAll = 0.0f;
            this.INotificationSideChannel$Stub = 0.0f;
            this.cancel = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.addContentView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == to.length.onRetainNonConfigurationInstance) {
                    this.getSmallIconBitmap = obtainStyledAttributes.getFloat(index, this.getSmallIconBitmap);
                } else if (index == to.length.onRequestPermissionsResult) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.notifyNotificationWithChannel = obtainStyledAttributes.getFloat(index, this.notifyNotificationWithChannel);
                        this.getActiveNotifications = true;
                    }
                } else if (index == to.length.getDefaultViewModelProviderFactory) {
                    this.ITrustedWebActivityService$Default = obtainStyledAttributes.getFloat(index, this.ITrustedWebActivityService$Default);
                } else if (index == to.length.ensureViewModelStore) {
                    this.ITrustedWebActivityService$Stub = obtainStyledAttributes.getFloat(index, this.ITrustedWebActivityService$Stub);
                } else if (index == to.length.getOnBackPressedDispatcher) {
                    this.notify = obtainStyledAttributes.getFloat(index, this.notify);
                } else if (index == to.length.addOnContextAvailableListener) {
                    this.INotificationSideChannel = obtainStyledAttributes.getFloat(index, this.INotificationSideChannel);
                } else if (index == to.length.onBackPressed) {
                    this.ITrustedWebActivityService$Stub$Proxy = obtainStyledAttributes.getFloat(index, this.ITrustedWebActivityService$Stub$Proxy);
                } else if (index == to.length.initViewTreeOwners) {
                    this.INotificationSideChannel$Default = obtainStyledAttributes.getFloat(index, this.INotificationSideChannel$Default);
                } else if (index == to.length.removeOnContextAvailableListener) {
                    this.INotificationSideChannel$Stub$Proxy = obtainStyledAttributes.getFloat(index, this.INotificationSideChannel$Stub$Proxy);
                } else if (index == to.length.peekAvailableContext) {
                    this.cancelAll = obtainStyledAttributes.getFloat(index, this.cancelAll);
                } else if (index == to.length.getLifecycle) {
                    this.INotificationSideChannel$Stub = obtainStyledAttributes.getFloat(index, this.INotificationSideChannel$Stub);
                } else if (index == to.length.getViewModelStore && Build.VERSION.SDK_INT >= 21) {
                    this.cancel = obtainStyledAttributes.getFloat(index, this.cancel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public from getConstraintSet() {
        if (this.myConstraintSet == null) {
            this.myConstraintSet = new from();
        }
        from from = this.myConstraintSet;
        int childCount = getChildCount();
        from.setMax.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!from.getMax || id2 != -1) {
                if (!from.setMax.containsKey(Integer.valueOf(id2))) {
                    from.setMax.put(Integer.valueOf(id2), new from.length());
                }
                from.length length = from.setMax.get(Integer.valueOf(id2));
                if (childAt instanceof ConstraintHelper) {
                    from.length.getMax(length, (ConstraintHelper) childAt, id2, layoutParams);
                }
                length.length(id2, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.myConstraintSet;
    }
}
