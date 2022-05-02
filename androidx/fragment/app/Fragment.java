package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.CascadingMenuPopup$HorizPosition;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.ListMenuItemView;
import o.addMenuPresenter;
import o.adjustListItemSelectionBounds;
import o.areNotificationsEnabled;
import o.dispatchSubMenuSelected;
import o.generateLayoutParams;
import o.getOpacity;
import o.getSubtitle;
import o.getTransparentRegion;
import o.getWindowAnimations;
import o.getWrappedDrawable;
import o.hasText;
import o.initForMode;
import o.jumpToCurrentState;
import o.mask;
import o.name;
import o.next;
import o.onFinishInflate;
import o.onInitializeAccessibilityEvent;
import o.setChecked;
import o.setCursor;
import o.setForceShowIcon;
import o.setPopupCallback;
import o.setTint;
import o.setVisible;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ListMenuItemView, onInitializeAccessibilityEvent {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    public boolean mAdded;
    getMin mAnimationInfo;
    Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    @NonNull
    FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    @LayoutRes
    private int mContentLayoutId;
    onFinishInflate.setMax mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public getOpacity<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    hasText mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<getMax> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    getSubtitle mSavedStateRegistryController;
    @Nullable
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    @Nullable
    public setTint mViewLifecycleOwner;
    public CascadingMenuPopup$HorizPosition<setChecked> mViewLifecycleOwnerLiveData;
    @NonNull
    public String mWho;

    public interface length {
        void length();

        void setMax();
    }

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @MainThread
    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    @Nullable
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @MainThread
    @Nullable
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @MainThread
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    @MainThread
    public void onDestroyOptionsMenu() {
    }

    @MainThread
    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @MainThread
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    @MainThread
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @MainThread
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    @MainThread
    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @MainThread
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    static abstract class getMax {
        /* access modifiers changed from: package-private */
        public abstract void getMax();

        private getMax() {
        }

        /* synthetic */ getMax(byte b) {
            this();
        }
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @MainThread
    @NonNull
    public setChecked getViewLifecycleOwner() {
        setTint settint = this.mViewLifecycleOwner;
        if (settint != null) {
            return settint;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @NonNull
    public LiveData<setChecked> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @NonNull
    public adjustListItemSelectionBounds getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.setMin(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    private int getMinimumMaxLifecycleState() {
        if (this.mMaxState == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return this.mMaxState.ordinal();
        }
        return Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @NonNull
    public onFinishInflate.setMax getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.getMin(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new getWindowAnimations(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @NonNull
    public final initForMode getSavedStateRegistry() {
        return this.mSavedStateRegistryController.setMin();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        final Bundle getMax;

        public int describeContents() {
            return 0;
        }

        SavedState(Bundle bundle) {
            this.getMax = bundle;
        }

        SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.getMax = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeBundle(this.getMax);
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@NonNull String str, @Nullable Exception exc) {
            super(str, exc);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new getTransparentRegion();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() {
            public final void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new CascadingMenuPopup$HorizPosition<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    @ContentView
    public Fragment(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new hasText(this);
        this.mSavedStateRegistryController = getSubtitle.getMin((onInitializeAccessibilityEvent) this);
        this.mDefaultFactory = null;
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, (Bundle) null);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragment = (Fragment) setVisible.length(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.setMin(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.getMin(Lifecycle.Event.ON_CREATE);
        }
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(@Nullable Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.IsOverlapping();
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (savedState == null || savedState.getMax == null) ? null : savedState.getMax;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    @Nullable
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.getMin(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @Nullable
    public Context getContext() {
        getOpacity<?> getopacity = this.mHost;
        if (getopacity == null) {
            return null;
        }
        return getopacity.IsOverlapping();
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Nullable
    public final FragmentActivity getActivity() {
        getOpacity<?> getopacity = this.mHost;
        if (getopacity == null) {
            return null;
        }
        return (FragmentActivity) getopacity.equals();
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Nullable
    public final Object getHost() {
        getOpacity<?> getopacity = this.mHost;
        if (getopacity == null) {
            return null;
        }
        return getopacity.getMin();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @NonNull
    public final CharSequence getText(@StringRes int i) {
        return getResources().getText(i);
    }

    @NonNull
    public final String getString(@StringRes int i) {
        return getResources().getString(i);
    }

    @NonNull
    public final String getString(@StringRes int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @Deprecated
    @Nullable
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    /* access modifiers changed from: package-private */
    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFragmentManager;
     */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMenuVisible() {
        /*
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.length((androidx.fragment.app.Fragment) r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isMenuVisible():boolean");
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.getMax(this);
        } else {
            fragmentManager.setMax(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.length();
            }
        }
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.length();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.getMax(fragmentManager.toIntRange(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @NonNull
    @Deprecated
    public dispatchSubMenuSelected getLoaderManager() {
        return dispatchSubMenuSelected.length(this);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @Nullable Bundle bundle) {
        getOpacity<?> getopacity = this.mHost;
        if (getopacity != null) {
            getopacity.setMin(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().getMin(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.getMin(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(this);
                sb.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i5 = i;
                sb.append(i);
                sb.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb.append(intentSender);
                sb.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb.append(intent);
                sb.append(" options: ");
                sb.append(bundle);
                Log.v("FragmentManager", sb.toString());
            } else {
                IntentSender intentSender3 = intentSender;
                int i6 = i;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().getMin(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (FragmentManager.getMin(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().setMin(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        getOpacity<?> getopacity = this.mHost;
        if (getopacity != null) {
            return getopacity.setMax(str);
        }
        return false;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    @NonNull
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        getOpacity<?> getopacity = this.mHost;
        if (getopacity != null) {
            LayoutInflater max = getopacity.getMax();
            setCursor.setMin(max, this.mChildFragmentManager.onMessageChannelReady());
            return max;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @CallSuper
    @UiThread
    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        getOpacity<?> getopacity = this.mHost;
        Activity equals = getopacity == null ? null : getopacity.equals();
        if (equals != null) {
            this.mCalled = false;
            onInflate(equals, attributeSet, bundle);
        }
    }

    @CallSuper
    @UiThread
    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        getOpacity<?> getopacity = this.mHost;
        Activity equals = getopacity == null ? null : getopacity.equals();
        if (equals != null) {
            this.mCalled = false;
            onAttach(equals);
        }
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.length(1)) {
            this.mChildFragmentManager.FastBitmap$CoordinateSystem();
        }
    }

    public void restoreChildFragmentState(@Nullable Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.setMin(parcelable);
            this.mChildFragmentManager.FastBitmap$CoordinateSystem();
        }
    }

    @MainThread
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @CallSuper
    @MainThread
    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStart() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onResume() {
        this.mCalled = true;
    }

    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onPause() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onStop() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onLowMemory() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDestroyView() {
        this.mCalled = true;
    }

    @CallSuper
    @MainThread
    public void onDestroy() {
        this.mCalled = true;
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new getTransparentRegion();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    @CallSuper
    @MainThread
    public void onDetach() {
        this.mCalled = true;
    }

    @MainThread
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public void setEnterSharedElementCallback(@Nullable mask mask) {
        ensureAnimationInfo().valueOf = mask;
    }

    public void setExitSharedElementCallback(@Nullable mask mask) {
        ensureAnimationInfo().invoke = mask;
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().toString = obj;
    }

    @Nullable
    public Object getEnterTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.toString;
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().toDoubleRange = obj;
    }

    @Nullable
    public Object getReturnTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        if (getmin.toDoubleRange == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.toDoubleRange;
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().values = obj;
    }

    @Nullable
    public Object getExitTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.values;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().hashCode = obj;
    }

    @Nullable
    public Object getReenterTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        if (getmin.hashCode == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.hashCode;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().FastBitmap$CoordinateSystem = obj;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.FastBitmap$CoordinateSystem;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().Mean$Arithmetic = obj;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        if (getmin.Mean$Arithmetic == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.Mean$Arithmetic;
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().Grayscale$Algorithm = Boolean.valueOf(z);
    }

    public boolean getAllowEnterTransitionOverlap() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null || getmin.Grayscale$Algorithm == null) {
            return true;
        }
        return this.mAnimationInfo.Grayscale$Algorithm.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().invokeSuspend = Boolean.valueOf(z);
    }

    public boolean getAllowReturnTransitionOverlap() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null || getmin.invokeSuspend == null) {
            return true;
        }
        return this.mAnimationInfo.invokeSuspend.booleanValue();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().create = true;
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().create = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.equals().isInside();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().create) {
            if (this.mHost == null) {
                ensureAnimationInfo().create = false;
            } else if (Looper.myLooper() != this.mHost.isInside().getLooper()) {
                this.mHost.isInside().postAtFrontOfQueue(new Runnable() {
                    public final void run() {
                        Fragment.this.callStartTransitionListener(false);
                    }
                });
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        getMin getmin = this.mAnimationInfo;
        length length2 = null;
        if (getmin != null) {
            getmin.create = false;
            length length3 = this.mAnimationInfo.getCause;
            this.mAnimationInfo.getCause = null;
            length2 = length3;
        }
        if (length2 != null) {
            length2.length();
        } else if (FragmentManager.getMax && this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            final SpecialEffectsController min = SpecialEffectsController.getMin(viewGroup, fragmentManager);
            min.getMin();
            if (z) {
                this.mHost.isInside().post(new Runnable() {
                    public final void run() {
                        min.getMax();
                    }
                });
            } else {
                min.getMax();
            }
        }
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            dispatchSubMenuSelected.length(this).setMin(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.getMin(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.length(str);
    }

    @NonNull
    public jumpToCurrentState createFragmentContainer() {
        return new jumpToCurrentState() {
            @Nullable
            public final View getMin(int i) {
                if (Fragment.this.mView != null) {
                    return Fragment.this.mView.findViewById(i);
                }
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(Fragment.this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }

            public final boolean setMin() {
                return Fragment.this.mView != null;
            }
        };
    }

    public void performAttach() {
        Iterator<getMax> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().getMax();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.getMax(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.IsOverlapping());
        if (this.mCalled) {
            this.mFragmentManager.Grayscale$Algorithm(this);
            this.mChildFragmentManager.toDoubleRange();
            return;
        }
        throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.toIntRange();
        this.mState = 1;
        this.mCalled = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.setMax(new setPopupCallback() {
                public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP && Fragment.this.mView != null) {
                        Fragment.this.mView.cancelPendingInputEvents();
                    }
                }
            });
        }
        this.mSavedStateRegistryController.getMin(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.setMin(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onCreate()");
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.toIntRange();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new setTint(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.setMin();
            setForceShowIcon.getMax(this.mView, this.mViewLifecycleOwner);
            addMenuPresenter.getMax(this.mView, this.mViewLifecycleOwner);
            generateLayoutParams.setMin(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.getMax(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.setMax()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.values();
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.toIntRange();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.Mean$Arithmetic();
            return;
        }
        throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    private void restoreViewState() {
        if (FragmentManager.getMin(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public void performStart() {
        this.mChildFragmentManager.toIntRange();
        this.mChildFragmentManager.setMax(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.setMin(Lifecycle.Event.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.getMin(Lifecycle.Event.ON_START);
            }
            this.mChildFragmentManager.invoke();
            return;
        }
        throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performResume() {
        this.mChildFragmentManager.toIntRange();
        this.mChildFragmentManager.setMax(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.setMin(Lifecycle.Event.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.getMin(Lifecycle.Event.ON_RESUME);
            }
            this.mChildFragmentManager.invokeSuspend();
            return;
        }
        throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.toIntRange();
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean min = this.mFragmentManager.getMin(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != min) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(min);
            onPrimaryNavigationFragmentChanged(min);
            this.mChildFragmentManager.create();
        }
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.getMin(z);
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.getMax(z);
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.setMax(configuration);
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.getCause();
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.getMin(menu, menuInflater);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.getMin(menu);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.getMax(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.length(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.setMin(menu);
        }
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.length(bundle);
        Parcelable isInside = this.mChildFragmentManager.isInside();
        if (isInside != null) {
            bundle.putParcelable("android:support:fragments", isInside);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.valueOf();
        if (this.mView != null) {
            this.mViewLifecycleOwner.getMin(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.setMin(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performStop() {
        this.mChildFragmentManager.Grayscale$Algorithm();
        if (this.mView != null) {
            this.mViewLifecycleOwner.getMin(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.setMin(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.b();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().length().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.getMin(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            dispatchSubMenuSelected.length(this).getMax();
            this.mPerformedCreateView = false;
            return;
        }
        throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDestroy() {
        this.mChildFragmentManager.onNavigationEvent();
        this.mLifecycleRegistry.setMin(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new getWrappedDrawable("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.setMin()) {
            this.mChildFragmentManager.onNavigationEvent();
            this.mChildFragmentManager = new getTransparentRegion();
        }
    }

    public void setOnStartEnterTransitionListener(length length2) {
        ensureAnimationInfo();
        if (length2 != this.mAnimationInfo.getCause) {
            if (length2 == null || this.mAnimationInfo.getCause == null) {
                if (this.mAnimationInfo.create) {
                    this.mAnimationInfo.getCause = length2;
                }
                if (length2 != null) {
                    length2.setMax();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    private getMin ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new getMin();
        }
        return this.mAnimationInfo;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().setMin = i;
            ensureAnimationInfo().setMax = i2;
            ensureAnimationInfo().isInside = i3;
            ensureAnimationInfo().toFloatRange = i4;
        }
    }

    public int getEnterAnim() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return 0;
        }
        return getmin.setMin;
    }

    public int getExitAnim() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return 0;
        }
        return getmin.setMax;
    }

    public int getPopEnterAnim() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return 0;
        }
        return getmin.isInside;
    }

    public int getPopExitAnim() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return 0;
        }
        return getmin.toFloatRange;
    }

    /* access modifiers changed from: package-private */
    public boolean getPopDirection() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return false;
        }
        return getmin.getMax;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().getMax = z;
        }
    }

    public int getNextTransition() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return 0;
        }
        return getmin.toIntRange;
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.toIntRange = i;
        }
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null || getmin.equals == null) {
            return new ArrayList<>();
        }
        return this.mAnimationInfo.equals;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null || getmin.IsOverlapping == null) {
            return new ArrayList<>();
        }
        return this.mAnimationInfo.IsOverlapping;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        this.mAnimationInfo.equals = arrayList;
        this.mAnimationInfo.IsOverlapping = arrayList2;
    }

    public mask getEnterTransitionCallback() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.valueOf;
    }

    public mask getExitTransitionCallback() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.invoke;
    }

    public View getAnimatingAway() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.length;
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().length = view;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().getMin = animator;
    }

    public Animator getAnimator() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.getMin;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().ICustomTabsCallback = f;
    }

    /* access modifiers changed from: package-private */
    public float getPostOnViewCreatedAlpha() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return 1.0f;
        }
        return getmin.ICustomTabsCallback;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().b = view;
    }

    public View getFocusedView() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return null;
        }
        return getmin.b;
    }

    public boolean isPostponed() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return false;
        }
        return getmin.create;
    }

    /* access modifiers changed from: package-private */
    public boolean isHideReplaced() {
        getMin getmin = this.mAnimationInfo;
        if (getmin == null) {
            return false;
        }
        return getmin.onNavigationEvent;
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().onNavigationEvent = z;
    }

    @MainThread
    @NonNull
    public final <I, O> ITrustedWebActivityCallback<I> registerForActivityResult(@NonNull areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull IPostMessageService.Default<O> defaultR) {
        return prepareCallInternal(arenotificationsenabled, new next<Void, IPostMessageService.Stub.Proxy>() {
            public final /* synthetic */ Object length(Object obj) {
                if (Fragment.this.mHost instanceof ITrustedWebActivityCallback.Default) {
                    return ((ITrustedWebActivityCallback.Default) Fragment.this.mHost).getActivityResultRegistry();
                }
                return Fragment.this.requireActivity().getActivityResultRegistry();
            }
        }, defaultR);
    }

    @MainThread
    @NonNull
    public final <I, O> ITrustedWebActivityCallback<I> registerForActivityResult(@NonNull areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull final IPostMessageService.Stub.Proxy proxy, @NonNull IPostMessageService.Default<O> defaultR) {
        return prepareCallInternal(arenotificationsenabled, new next<Void, IPostMessageService.Stub.Proxy>() {
            public final /* bridge */ /* synthetic */ Object length(Object obj) {
                return proxy;
            }
        }, defaultR);
    }

    @NonNull
    private <I, O> ITrustedWebActivityCallback<I> prepareCallInternal(@NonNull final areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull next<Void, IPostMessageService.Stub.Proxy> next, @NonNull IPostMessageService.Default<O> defaultR) {
        if (this.mState <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            final next<Void, IPostMessageService.Stub.Proxy> next2 = next;
            final AtomicReference atomicReference2 = atomicReference;
            final areNotificationsEnabled<I, O> arenotificationsenabled2 = arenotificationsenabled;
            final IPostMessageService.Default<O> defaultR2 = defaultR;
            registerOnPreAttachListener(new getMax() {
                /* access modifiers changed from: package-private */
                public final void getMax() {
                    atomicReference2.set(((IPostMessageService.Stub.Proxy) next2.length(null)).getMax(Fragment.this.generateActivityResultKey(), Fragment.this, arenotificationsenabled2, defaultR2));
                }
            });
            return new ITrustedWebActivityCallback<I>() {
                public final void getMin(I i, @Nullable name name) {
                    ITrustedWebActivityCallback iTrustedWebActivityCallback = (ITrustedWebActivityCallback) atomicReference.get();
                    if (iTrustedWebActivityCallback != null) {
                        iTrustedWebActivityCallback.getMin(i, name);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }

                public final void setMax() {
                    ITrustedWebActivityCallback iTrustedWebActivityCallback = (ITrustedWebActivityCallback) atomicReference.getAndSet((Object) null);
                    if (iTrustedWebActivityCallback != null) {
                        iTrustedWebActivityCallback.setMax();
                    }
                }
            };
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(@NonNull getMax getmax) {
        if (this.mState >= 0) {
            getmax.getMax();
        } else {
            this.mOnPreAttachedListeners.add(getmax);
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    static class getMin {
        Object FastBitmap$CoordinateSystem = null;
        Boolean Grayscale$Algorithm;
        float ICustomTabsCallback = 1.0f;
        ArrayList<String> IsOverlapping;
        Object Mean$Arithmetic = Fragment.USE_DEFAULT_TRANSITION;
        View b = null;
        boolean create;
        ArrayList<String> equals;
        length getCause;
        boolean getMax;
        Animator getMin;
        Object hashCode = Fragment.USE_DEFAULT_TRANSITION;
        mask invoke = null;
        Boolean invokeSuspend;
        int isInside;
        View length;
        boolean onNavigationEvent;
        int setMax;
        int setMin;
        Object toDoubleRange = Fragment.USE_DEFAULT_TRANSITION;
        int toFloatRange;
        int toIntRange;
        Object toString = null;
        mask valueOf = null;
        Object values = null;

        getMin() {
        }
    }
}
