package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.FontRes;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.ListMenuItemView;
import o.adjustListItemSelectionBounds;
import o.dispatchSubMenuSelected;
import o.getCurrent;
import o.getIntrinsicWidth;
import o.getOpacity;
import o.hasText;
import o.initForMode;
import o.mask;

public class FragmentActivity extends ComponentActivity implements FontRes.setMax, FontRes.setMin {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final hasText mFragmentLifecycleRegistry = new hasText(this);
    final getCurrent mFragments = getCurrent.getMax((getOpacity<?>) new length());
    boolean mResumed;
    boolean mStopped = true;

    @MainThread
    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentActivity() {
        init();
    }

    @ContentView
    public FragmentActivity(@LayoutRes int i) {
        super(i);
        init();
    }

    private void init() {
        initForMode savedStateRegistry = getSavedStateRegistry();
        if (savedStateRegistry.setMin.length(FRAGMENTS_TAG, new initForMode.setMax() {
            @NonNull
            public final Bundle length() {
                Bundle bundle = new Bundle();
                FragmentActivity.this.markFragmentsCreated();
                hasText hastext = FragmentActivity.this.mFragmentLifecycleRegistry;
                Lifecycle.Event event = Lifecycle.Event.ON_STOP;
                hastext.getMin("handleLifecycleEvent");
                hastext.getMax(event.getTargetState());
                Parcelable isInside = FragmentActivity.this.mFragments.getMin.getMax.isInside();
                if (isInside != null) {
                    bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, isInside);
                }
                return bundle;
            }
        }) == null) {
            addOnContextAvailableListener(new IPostMessageService.Stub() {
                public final void length(@NonNull Context context) {
                    getCurrent getcurrent = FragmentActivity.this.mFragments;
                    getcurrent.getMin.getMax.getMax(getcurrent.getMin, getcurrent.getMin, (Fragment) null);
                    Bundle min = FragmentActivity.this.getSavedStateRegistry().setMin(FragmentActivity.FRAGMENTS_TAG);
                    if (min != null) {
                        Parcelable parcelable = min.getParcelable(FragmentActivity.FRAGMENTS_TAG);
                        getCurrent getcurrent2 = FragmentActivity.this.mFragments;
                        if (getcurrent2.getMin instanceof ListMenuItemView) {
                            getcurrent2.getMin.getMax.setMin(parcelable);
                            return;
                        }
                        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    @CallSuper
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.getMin.getMax.toIntRange();
        super.onActivityResult(i, i2, intent);
    }

    public void supportFinishAfterTransition() {
        FontRes.setMax(this);
    }

    public void setEnterSharedElementCallback(@Nullable mask mask) {
        FontRes.getMin(this, mask);
    }

    public void setExitSharedElementCallback(@Nullable mask mask) {
        FontRes.setMax(this, mask);
    }

    public void supportPostponeEnterTransition() {
        FontRes.getMax(this);
    }

    public void supportStartPostponedEnterTransition() {
        FontRes.getMin(this);
    }

    @CallSuper
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.getMin.getMax.getMin(z);
    }

    @CallSuper
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.getMin.getMax.getMax(z);
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.getMin.getMax.toIntRange();
        this.mFragments.getMin.getMax.setMax(configuration);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        hasText hastext = this.mFragmentLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_CREATE;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
        FragmentManager fragmentManager = this.mFragments.getMin.getMax;
        fragmentManager.invokeSuspend = false;
        fragmentManager.invoke = false;
        fragmentManager.Mean$Arithmetic.getMax = false;
        fragmentManager.setMax(1);
    }

    public boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.length(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.getMin.getMax.setMax.onCreateView(view, str, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.getMin.getMax.onNavigationEvent();
        hasText hastext = this.mFragmentLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_DESTROY;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.getMin.getMax.getCause();
    }

    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.getMax(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.getMin(menuItem);
    }

    public void onPanelClosed(int i, @NonNull Menu menu) {
        if (i == 0) {
            this.mFragments.getMin.getMax.setMin(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.getMin.getMax.setMax(5);
        hasText hastext = this.mFragmentLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_PAUSE;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
    }

    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.getMin.getMax.toIntRange();
    }

    public void onStateNotSaved() {
        this.mFragments.getMin.getMax.toIntRange();
    }

    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.getMin.getMax.toIntRange();
        this.mFragments.setMax();
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        hasText hastext = this.mFragmentLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
        FragmentManager fragmentManager = this.mFragments.getMin.getMax;
        fragmentManager.invokeSuspend = false;
        fragmentManager.invoke = false;
        fragmentManager.Mean$Arithmetic.getMax = false;
        fragmentManager.setMax(7);
    }

    public boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.setMin(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean onPrepareOptionsPanel(@Nullable View view, @NonNull Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.getMin.getMax;
            fragmentManager.invokeSuspend = false;
            fragmentManager.invoke = false;
            fragmentManager.Mean$Arithmetic.getMax = false;
            fragmentManager.setMax(4);
        }
        this.mFragments.getMin.getMax.toIntRange();
        this.mFragments.setMax();
        hasText hastext = this.mFragmentLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
        FragmentManager fragmentManager2 = this.mFragments.getMin.getMax;
        fragmentManager2.invokeSuspend = false;
        fragmentManager2.invoke = false;
        fragmentManager2.Mean$Arithmetic.getMax = false;
        fragmentManager2.setMax(5);
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.getMin.getMax;
        fragmentManager.invoke = true;
        fragmentManager.Mean$Arithmetic.getMax = true;
        fragmentManager.setMax(4);
        hasText hastext = this.mFragmentLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_STOP;
        hastext.getMin("handleLifecycleEvent");
        hastext.getMax(event.getTargetState());
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        String obj = sb.toString();
        printWriter.print(obj);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            dispatchSubMenuSelected.length(this).setMin(obj, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.getMin.getMax.getMin(str, fileDescriptor, printWriter, strArr);
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.getMin.getMax;
    }

    @NonNull
    @Deprecated
    public dispatchSubMenuSelected getSupportLoaderManager() {
        return dispatchSubMenuSelected.length(this);
    }

    @CallSuper
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.getMin.getMax.toIntRange();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            FontRes.setMax(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            FontRes.getMin(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    class length extends getOpacity<FragmentActivity> implements ListMenuItemView, IPostMessageService, ITrustedWebActivityCallback.Default, getIntrinsicWidth {
        public length() {
            super(FragmentActivity.this);
        }

        @NonNull
        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @NonNull
        public final adjustListItemSelectionBounds getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @NonNull
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public final void setMin(@NonNull String str, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump(str, (FileDescriptor) null, printWriter, strArr);
        }

        public final boolean setMax() {
            return !FragmentActivity.this.isFinishing();
        }

        @NonNull
        public final LayoutInflater getMax() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public final void length() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        public final boolean setMax(@NonNull String str) {
            return FontRes.getMax(FragmentActivity.this, str);
        }

        public final void getMax(@NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Nullable
        public final View getMin(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        public final boolean setMin() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @NonNull
        public final IPostMessageService.Stub.Proxy getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        public final /* bridge */ /* synthetic */ Object getMin() {
            return FragmentActivity.this;
        }
    }

    /* access modifiers changed from: package-private */
    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment next : fragmentManager.getMin.getMin()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), state);
                }
                if (next.mViewLifecycleOwner != null && next.mViewLifecycleOwner.getLifecycle().length().isAtLeast(Lifecycle.State.STARTED)) {
                    hasText hastext = next.mViewLifecycleOwner.getMin;
                    hastext.getMin("setCurrentState");
                    hastext.getMax(state);
                    z = true;
                }
                if (next.mLifecycleRegistry.getMax.isAtLeast(Lifecycle.State.STARTED)) {
                    hasText hastext2 = next.mLifecycleRegistry;
                    hastext2.getMin("setCurrentState");
                    hastext2.getMax(state);
                    z = true;
                }
            }
        }
        return z;
    }
}
