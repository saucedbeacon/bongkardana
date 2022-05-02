package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController;
import o.setAlpha;

public final class getState implements LayoutInflater.Factory2 {
    final FragmentManager setMin;

    public getState(FragmentManager fragmentManager) {
        this.setMin = fragmentManager;
    }

    @Nullable
    public final View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    @Nullable
    public final View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        final unscheduleDrawable unscheduledrawable;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.setMin);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAlpha.setMin.setMin);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(setAlpha.setMin.setMax);
        }
        int resourceId = obtainStyledAttributes.getResourceId(setAlpha.setMin.IsOverlapping, -1);
        String string = obtainStyledAttributes.getString(setAlpha.setMin.equals);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !setVisible.setMax(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id2 = view != null ? view.getId() : 0;
        if (id2 == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            fragment = this.setMin.findFragmentById(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.setMin.findFragmentByTag(string);
        }
        if (fragment == null && id2 != -1) {
            fragment = this.setMin.findFragmentById(id2);
        }
        if (fragment == null) {
            fragment = this.setMin.ICustomTabsCallback().getMax(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id2;
            fragment.mContainerId = id2;
            fragment.mTag = string;
            fragment.mInLayout = true;
            fragment.mFragmentManager = this.setMin;
            fragment.mHost = this.setMin.hashCode;
            fragment.onInflate(this.setMin.hashCode.setMax, attributeSet, fragment.mSavedFragmentState);
            unscheduledrawable = this.setMin.isInside(fragment);
            FragmentManager.getMin(2);
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            fragment.mFragmentManager = this.setMin;
            fragment.mHost = this.setMin.hashCode;
            fragment.onInflate(this.setMin.hashCode.setMax, attributeSet, fragment.mSavedFragmentState);
            unscheduledrawable = this.setMin.toIntRange(fragment);
            FragmentManager.getMin(2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(attributeSet.getPositionDescription());
            sb2.append(": Duplicate id 0x");
            sb2.append(Integer.toHexString(resourceId));
            sb2.append(", tag ");
            sb2.append(string);
            sb2.append(", or parent id 0x");
            sb2.append(Integer.toHexString(id2));
            sb2.append(" with another fragment for ");
            sb2.append(attributeValue);
            throw new IllegalArgumentException(sb2.toString());
        }
        fragment.mContainer = (ViewGroup) view;
        unscheduledrawable.setMax();
        unscheduledrawable.length();
        if (fragment.mView != null) {
            if (resourceId != 0) {
                fragment.mView.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                public final void onViewDetachedFromWindow(View view) {
                }

                public final void onViewAttachedToWindow(View view) {
                    Fragment fragment = unscheduledrawable.getMax;
                    unscheduledrawable.setMax();
                    SpecialEffectsController.length((ViewGroup) fragment.mView.getParent(), getState.this.setMin.extraCallback()).length();
                }
            });
            return fragment.mView;
        }
        StringBuilder sb3 = new StringBuilder("Fragment ");
        sb3.append(attributeValue);
        sb3.append(" did not create a view.");
        throw new IllegalStateException(sb3.toString());
    }
}
