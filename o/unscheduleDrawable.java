package o;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.Lifecycle;
import o.setAlpha;

public final class unscheduleDrawable {
    @NonNull
    public final Fragment getMax;
    public final scheduleDrawable getMin;
    private boolean length = false;
    public final getMinimumHeight setMax;
    public int setMin = -1;

    public unscheduleDrawable(@NonNull getMinimumHeight getminimumheight, @NonNull scheduleDrawable scheduledrawable, @NonNull Fragment fragment) {
        this.setMax = getminimumheight;
        this.getMin = scheduledrawable;
        this.getMax = fragment;
    }

    public unscheduleDrawable(@NonNull getMinimumHeight getminimumheight, @NonNull scheduleDrawable scheduledrawable, @NonNull ClassLoader classLoader, @NonNull setVisible setvisible, @NonNull FragmentState fragmentState) {
        this.setMax = getminimumheight;
        this.getMin = scheduledrawable;
        this.getMax = setvisible.getMax(classLoader, fragmentState.getMin);
        if (fragmentState.IsOverlapping != null) {
            fragmentState.IsOverlapping.setClassLoader(classLoader);
        }
        this.getMax.setArguments(fragmentState.IsOverlapping);
        this.getMax.mWho = fragmentState.getMax;
        this.getMax.mFromLayout = fragmentState.setMin;
        this.getMax.mRestored = true;
        this.getMax.mFragmentId = fragmentState.setMax;
        this.getMax.mContainerId = fragmentState.length;
        this.getMax.mTag = fragmentState.equals;
        this.getMax.mRetainInstance = fragmentState.toFloatRange;
        this.getMax.mRemoving = fragmentState.isInside;
        this.getMax.mDetached = fragmentState.toIntRange;
        this.getMax.mHidden = fragmentState.FastBitmap$CoordinateSystem;
        this.getMax.mMaxState = Lifecycle.State.values()[fragmentState.toString];
        if (fragmentState.toDoubleRange != null) {
            this.getMax.mSavedFragmentState = fragmentState.toDoubleRange;
        } else {
            this.getMax.mSavedFragmentState = new Bundle();
        }
        FragmentManager.getMin(2);
    }

    public unscheduleDrawable(@NonNull getMinimumHeight getminimumheight, @NonNull scheduleDrawable scheduledrawable, @NonNull Fragment fragment, @NonNull FragmentState fragmentState) {
        this.setMax = getminimumheight;
        this.getMin = scheduledrawable;
        this.getMax = fragment;
        fragment.mSavedViewState = null;
        this.getMax.mSavedViewRegistryState = null;
        this.getMax.mBackStackNesting = 0;
        this.getMax.mInLayout = false;
        this.getMax.mAdded = false;
        Fragment fragment2 = this.getMax;
        fragment2.mTargetWho = fragment2.mTarget != null ? this.getMax.mTarget.mWho : null;
        this.getMax.mTarget = null;
        if (fragmentState.toDoubleRange != null) {
            this.getMax.mSavedFragmentState = fragmentState.toDoubleRange;
        } else {
            this.getMax.mSavedFragmentState = new Bundle();
        }
    }

    public final int setMin() {
        if (this.getMax.mFragmentManager == null) {
            return this.getMax.mState;
        }
        int i = this.setMin;
        int i2 = AnonymousClass5.setMax[this.getMax.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = Math.min(i, 5);
            } else if (i2 == 3) {
                i = Math.min(i, 1);
            } else if (i2 != 4) {
                i = Math.min(i, -1);
            } else {
                i = Math.min(i, 0);
            }
        }
        if (this.getMax.mFromLayout) {
            if (this.getMax.mInLayout) {
                i = Math.max(this.setMin, 2);
                if (this.getMax.mView != null && this.getMax.mView.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.setMin < 4 ? Math.min(i, this.getMax.mState) : Math.min(i, 1);
            }
        }
        if (!this.getMax.mAdded) {
            i = Math.min(i, 1);
        }
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        if (FragmentManager.getMax && this.getMax.mContainer != null) {
            lifecycleImpact = SpecialEffectsController.length(this.getMax.mContainer, this.getMax.getParentFragmentManager().extraCallback()).getMin(this);
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else if (this.getMax.mRemoving) {
            if (this.getMax.isInBackStack()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        if (this.getMax.mDeferStart && this.getMax.mState < 5) {
            i = Math.min(i, 4);
        }
        FragmentManager.getMin(2);
        return i;
    }

    /* renamed from: o.unscheduleDrawable$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] setMax;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMax = r0
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMax     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unscheduleDrawable.AnonymousClass5.<clinit>():void");
        }
    }

    public final void setMax() {
        if (this.length) {
            FragmentManager.getMin(2);
            return;
        }
        boolean z = false;
        z = true;
        try {
            while (true) {
                int min = setMin();
                if (min != this.getMax.mState) {
                    if (min <= this.getMax.mState) {
                        switch (this.getMax.mState - (z ? 1 : 0)) {
                            case -1:
                                FastBitmap$CoordinateSystem();
                                break;
                            case 0:
                                toDoubleRange();
                                break;
                            case 1:
                                values();
                                this.getMax.mState = z;
                                break;
                            case 2:
                                this.getMax.mInLayout = z;
                                this.getMax.mState = 2;
                                break;
                            case 3:
                                FragmentManager.getMin(3);
                                if (this.getMax.mView != null && this.getMax.mSavedViewState == null) {
                                    IsOverlapping();
                                }
                                if (!(this.getMax.mView == null || this.getMax.mContainer == null)) {
                                    SpecialEffectsController length2 = SpecialEffectsController.length(this.getMax.mContainer, this.getMax.getParentFragmentManager().extraCallback());
                                    FragmentManager.getMin(2);
                                    length2.setMin(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                }
                                this.getMax.mState = 3;
                                break;
                            case 4:
                                FragmentManager.getMin(3);
                                this.getMax.performStop();
                                this.setMax.equals(this.getMax);
                                break;
                            case 5:
                                this.getMax.mState = 5;
                                break;
                            case 6:
                                FragmentManager.getMin(3);
                                this.getMax.performPause();
                                this.setMax.setMax(this.getMax);
                                break;
                        }
                    } else {
                        switch (this.getMax.mState + z) {
                            case 0:
                                getMin();
                                break;
                            case 1:
                                getMax();
                                break;
                            case 2:
                                length();
                                toFloatRange();
                                break;
                            case 3:
                                toIntRange();
                                break;
                            case 4:
                                if (!(this.getMax.mView == null || this.getMax.mContainer == null)) {
                                    SpecialEffectsController length3 = SpecialEffectsController.length(this.getMax.mContainer, this.getMax.getParentFragmentManager().extraCallback());
                                    SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.getMax.mView.getVisibility());
                                    FragmentManager.getMin(2);
                                    length3.setMin(from, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                }
                                this.getMax.mState = 4;
                                break;
                            case 5:
                                FragmentManager.getMin(3);
                                this.getMax.performStart();
                                this.setMax.length(this.getMax);
                                break;
                            case 6:
                                this.getMax.mState = 6;
                                break;
                            case 7:
                                equals();
                                break;
                        }
                    }
                } else {
                    if (FragmentManager.getMax && this.getMax.mHiddenChanged) {
                        if (!(this.getMax.mView == null || this.getMax.mContainer == null)) {
                            SpecialEffectsController length4 = SpecialEffectsController.length(this.getMax.mContainer, this.getMax.getParentFragmentManager().extraCallback());
                            if (this.getMax.mHidden) {
                                FragmentManager.getMin(2);
                                length4.setMin(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            } else {
                                FragmentManager.getMin(2);
                                length4.setMin(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            }
                        }
                        if (this.getMax.mFragmentManager != null) {
                            FragmentManager fragmentManager = this.getMax.mFragmentManager;
                            Fragment fragment = this.getMax;
                            if (fragment.mAdded && FragmentManager.invoke(fragment)) {
                                fragmentManager.valueOf = z;
                            }
                        }
                        this.getMax.mHiddenChanged = z;
                        this.getMax.onHiddenChanged(this.getMax.mHidden);
                    }
                    this.length = z;
                    return;
                }
            }
        } finally {
            this.length = z;
        }
    }

    public final void length() {
        if (this.getMax.mFromLayout && this.getMax.mInLayout && !this.getMax.mPerformedCreateView) {
            FragmentManager.getMin(3);
            Fragment fragment = this.getMax;
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), (ViewGroup) null, this.getMax.mSavedFragmentState);
            if (this.getMax.mView != null) {
                this.getMax.mView.setSaveFromParentEnabled(false);
                this.getMax.mView.setTag(setAlpha.getMax.getMin, this.getMax);
                if (this.getMax.mHidden) {
                    this.getMax.mView.setVisibility(8);
                }
                this.getMax.performViewCreated();
                getMinimumHeight getminimumheight = this.setMax;
                Fragment fragment2 = this.getMax;
                getminimumheight.getMax(fragment2, fragment2.mView, this.getMax.mSavedFragmentState, false);
                this.getMax.mState = 2;
            }
        }
    }

    public final void setMin(@NonNull ClassLoader classLoader) {
        if (this.getMax.mSavedFragmentState != null) {
            this.getMax.mSavedFragmentState.setClassLoader(classLoader);
            Fragment fragment = this.getMax;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.getMax;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.getMax;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            if (this.getMax.mTargetWho != null) {
                Fragment fragment4 = this.getMax;
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            if (this.getMax.mSavedUserVisibleHint != null) {
                Fragment fragment5 = this.getMax;
                fragment5.mUserVisibleHint = fragment5.mSavedUserVisibleHint.booleanValue();
                this.getMax.mSavedUserVisibleHint = null;
            } else {
                Fragment fragment6 = this.getMax;
                fragment6.mUserVisibleHint = fragment6.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            if (!this.getMax.mUserVisibleHint) {
                this.getMax.mDeferStart = true;
            }
        }
    }

    public final void getMin() {
        FragmentManager.getMin(3);
        unscheduleDrawable unscheduledrawable = null;
        if (this.getMax.mTarget != null) {
            scheduleDrawable scheduledrawable = this.getMin;
            unscheduleDrawable unscheduledrawable2 = scheduledrawable.length.get(this.getMax.mTarget.mWho);
            if (unscheduledrawable2 != null) {
                Fragment fragment = this.getMax;
                fragment.mTargetWho = fragment.mTarget.mWho;
                this.getMax.mTarget = null;
                unscheduledrawable = unscheduledrawable2;
            } else {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this.getMax);
                sb.append(" declared target fragment ");
                sb.append(this.getMax.mTarget);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
        } else if (this.getMax.mTargetWho != null) {
            scheduleDrawable scheduledrawable2 = this.getMin;
            unscheduledrawable = scheduledrawable2.length.get(this.getMax.mTargetWho);
            if (unscheduledrawable == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(this.getMax);
                sb2.append(" declared target fragment ");
                sb2.append(this.getMax.mTargetWho);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (unscheduledrawable != null && (FragmentManager.getMax || unscheduledrawable.getMax.mState <= 0)) {
            unscheduledrawable.setMax();
        }
        Fragment fragment2 = this.getMax;
        fragment2.mHost = fragment2.mFragmentManager.hashCode;
        Fragment fragment3 = this.getMax;
        fragment3.mParentFragment = fragment3.mFragmentManager.values;
        this.setMax.setMin(this.getMax);
        this.getMax.performAttach();
        this.setMax.getMax(this.getMax);
    }

    public final void getMax() {
        FragmentManager.getMin(3);
        if (!this.getMax.mIsCreated) {
            getMinimumHeight getminimumheight = this.setMax;
            Fragment fragment = this.getMax;
            getminimumheight.setMin(fragment, fragment.mSavedFragmentState);
            Fragment fragment2 = this.getMax;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            getMinimumHeight getminimumheight2 = this.setMax;
            Fragment fragment3 = this.getMax;
            getminimumheight2.getMin(fragment3, fragment3.mSavedFragmentState);
            return;
        }
        Fragment fragment4 = this.getMax;
        fragment4.restoreChildFragmentState(fragment4.mSavedFragmentState);
        this.getMax.mState = 1;
    }

    public final void toFloatRange() {
        String str;
        if (!this.getMax.mFromLayout) {
            FragmentManager.getMin(3);
            Fragment fragment = this.getMax;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            if (this.getMax.mContainer != null) {
                viewGroup = this.getMax.mContainer;
            } else if (this.getMax.mContainerId != 0) {
                if (this.getMax.mContainerId != -1) {
                    viewGroup = (ViewGroup) this.getMax.mFragmentManager.toDoubleRange.getMin(this.getMax.mContainerId);
                    if (viewGroup == null && !this.getMax.mRestored) {
                        try {
                            str = this.getMax.getResources().getResourceName(this.getMax.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        sb.append(Integer.toHexString(this.getMax.mContainerId));
                        sb.append(" (");
                        sb.append(str);
                        sb.append(") for fragment ");
                        sb.append(this.getMax);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Cannot create fragment ");
                    sb2.append(this.getMax);
                    sb2.append(" for a container view with no id");
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            this.getMax.mContainer = viewGroup;
            Fragment fragment2 = this.getMax;
            fragment2.performCreateView(performGetLayoutInflater, viewGroup, fragment2.mSavedFragmentState);
            if (this.getMax.mView != null) {
                boolean z = false;
                this.getMax.mView.setSaveFromParentEnabled(false);
                this.getMax.mView.setTag(setAlpha.getMax.getMin, this.getMax);
                if (viewGroup != null) {
                    Mean$Arithmetic();
                }
                if (this.getMax.mHidden) {
                    this.getMax.mView.setVisibility(8);
                }
                if (ViewCompat.ICustomTabsService(this.getMax.mView)) {
                    ViewCompat.b(this.getMax.mView);
                } else {
                    final View view = this.getMax.mView;
                    view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                        public final void onViewDetachedFromWindow(View view) {
                        }

                        public final void onViewAttachedToWindow(View view) {
                            view.removeOnAttachStateChangeListener(this);
                            ViewCompat.b(view);
                        }
                    });
                }
                this.getMax.performViewCreated();
                getMinimumHeight getminimumheight = this.setMax;
                Fragment fragment3 = this.getMax;
                getminimumheight.getMax(fragment3, fragment3.mView, this.getMax.mSavedFragmentState, false);
                int visibility = this.getMax.mView.getVisibility();
                float alpha = this.getMax.mView.getAlpha();
                if (FragmentManager.getMax) {
                    this.getMax.setPostOnViewCreatedAlpha(alpha);
                    if (this.getMax.mContainer != null && visibility == 0) {
                        View findFocus = this.getMax.mView.findFocus();
                        if (findFocus != null) {
                            this.getMax.setFocusedView(findFocus);
                            FragmentManager.getMin(2);
                        }
                        this.getMax.mView.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment4 = this.getMax;
                    if (visibility == 0 && fragment4.mContainer != null) {
                        z = true;
                    }
                    fragment4.mIsNewlyAdded = z;
                }
            }
            this.getMax.mState = 2;
        }
    }

    public final void toIntRange() {
        FragmentManager.getMin(3);
        Fragment fragment = this.getMax;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        getMinimumHeight getminimumheight = this.setMax;
        Fragment fragment2 = this.getMax;
        getminimumheight.length(fragment2, fragment2.mSavedFragmentState);
    }

    public final void equals() {
        FragmentManager.getMin(3);
        View focusedView = this.getMax.getFocusedView();
        if (focusedView != null && setMax(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.getMin(2)) {
                this.getMax.mView.findFocus();
            }
        }
        this.getMax.setFocusedView((View) null);
        this.getMax.performResume();
        this.setMax.getMin(this.getMax);
        this.getMax.mSavedFragmentState = null;
        this.getMax.mSavedViewState = null;
        this.getMax.mSavedViewRegistryState = null;
    }

    private boolean setMax(@NonNull View view) {
        if (view == this.getMax.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.getMax.mView) {
                return true;
            }
        }
        return false;
    }

    public final Bundle isInside() {
        Bundle bundle = new Bundle();
        this.getMax.performSaveInstanceState(bundle);
        this.setMax.setMax(this.getMax, bundle);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.getMax.mView != null) {
            IsOverlapping();
        }
        if (this.getMax.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.getMax.mSavedViewState);
        }
        if (this.getMax.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.getMax.mSavedViewRegistryState);
        }
        if (!this.getMax.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.getMax.mUserVisibleHint);
        }
        return bundle;
    }

    public final void IsOverlapping() {
        if (this.getMax.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.getMax.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.getMax.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.getMax.mViewLifecycleOwner.setMax.length(bundle);
            if (!bundle.isEmpty()) {
                this.getMax.mSavedViewRegistryState = bundle;
            }
        }
    }

    public final void values() {
        FragmentManager.getMin(3);
        if (!(this.getMax.mContainer == null || this.getMax.mView == null)) {
            this.getMax.mContainer.removeView(this.getMax.mView);
        }
        this.getMax.performDestroyView();
        this.setMax.IsOverlapping(this.getMax);
        this.getMax.mContainer = null;
        this.getMax.mView = null;
        this.getMax.mViewLifecycleOwner = null;
        this.getMax.mViewLifecycleOwnerLiveData.getMax(null);
        this.getMax.mInLayout = false;
    }

    public final void toDoubleRange() {
        FragmentManager.getMin(3);
        boolean z = true;
        boolean z2 = this.getMax.mRemoving && !this.getMax.isInBackStack();
        Fragment fragment = null;
        if (z2 || this.getMin.getMax.setMin(this.getMax)) {
            getOpacity<?> getopacity = this.getMax.mHost;
            if (getopacity instanceof ListMenuItemView) {
                z = this.getMin.getMax.setMin();
            } else if (getopacity.setMax instanceof Activity) {
                z = true ^ ((Activity) getopacity.setMax).isChangingConfigurations();
            }
            if (z2 || z) {
                this.getMin.getMax.getMin(this.getMax);
            }
            this.getMax.performDestroy();
            this.setMax.toFloatRange(this.getMax);
            for (unscheduleDrawable next : this.getMin.length()) {
                if (next != null) {
                    Fragment fragment2 = next.getMax;
                    if (this.getMax.mWho.equals(fragment2.mTargetWho)) {
                        fragment2.mTarget = this.getMax;
                        fragment2.mTargetWho = null;
                    }
                }
            }
            if (this.getMax.mTargetWho != null) {
                Fragment fragment3 = this.getMax;
                unscheduleDrawable unscheduledrawable = this.getMin.length.get(fragment3.mTargetWho);
                if (unscheduledrawable != null) {
                    fragment = unscheduledrawable.getMax;
                }
                fragment3.mTarget = fragment;
            }
            this.getMin.getMax(this);
            return;
        }
        if (this.getMax.mTargetWho != null) {
            unscheduleDrawable unscheduledrawable2 = this.getMin.length.get(this.getMax.mTargetWho);
            if (unscheduledrawable2 != null) {
                fragment = unscheduledrawable2.getMax;
            }
            if (fragment != null && fragment.mRetainInstance) {
                this.getMax.mTarget = fragment;
            }
        }
        this.getMax.mState = 0;
    }

    public final void FastBitmap$CoordinateSystem() {
        FragmentManager.getMin(3);
        this.getMax.performDetach();
        this.setMax.isInside(this.getMax);
        this.getMax.mState = -1;
        this.getMax.mHost = null;
        this.getMax.mParentFragment = null;
        this.getMax.mFragmentManager = null;
        if ((this.getMax.mRemoving && !this.getMax.isInBackStack()) || this.getMin.getMax.setMin(this.getMax)) {
            FragmentManager.getMin(3);
            this.getMax.initState();
        }
    }

    private void Mean$Arithmetic() {
        this.getMax.mContainer.addView(this.getMax.mView, this.getMin.getMin(this.getMax));
    }
}
