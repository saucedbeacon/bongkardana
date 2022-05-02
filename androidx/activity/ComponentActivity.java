package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import o.FontRes;
import o.IPostMessageService;
import o.ITrustedWebActivityCallback;
import o.IntRange;
import o.ListMenuItemView;
import o.adjustListItemSelectionBounds;
import o.areNotificationsEnabled;
import o.dispatchPresenterUpdate;
import o.getSubtitle;
import o.getWindowAnimations;
import o.hasText;
import o.initForMode;
import o.invokeItem;
import o.killMode;
import o.name;
import o.onExtraCallback;
import o.onFinishInflate;
import o.onInitializeAccessibilityEvent;
import o.onNestedScrollAccepted;
import o.onStopNestedScroll;
import o.removeMenuPresenter;
import o.setChecked;
import o.setPopupCallback;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements setChecked, ListMenuItemView, onInitializeAccessibilityEvent, IPostMessageService, ITrustedWebActivityCallback.Default {
    private final IPostMessageService.Stub.Proxy mActivityResultRegistry;
    @LayoutRes
    private int mContentLayoutId;
    final onExtraCallback mContextAwareHelper;
    private onFinishInflate.setMax mDefaultFactory;
    private final hasText mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final getSubtitle mSavedStateRegistryController;
    private adjustListItemSelectionBounds mViewModelStore;

    @Deprecated
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    static final class setMin {
        Object setMax;
        adjustListItemSelectionBounds setMin;

        setMin() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new onExtraCallback();
        this.mLifecycleRegistry = new hasText(this);
        this.mSavedStateRegistryController = getSubtitle.getMin((onInitializeAccessibilityEvent) this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() {
            public final void run() {
                try {
                    ComponentActivity.super.onBackPressed();
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                }
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new IPostMessageService.Stub.Proxy() {
            public final <I, O> void setMin(final int i, @NonNull areNotificationsEnabled<I, O> arenotificationsenabled, I i2, @Nullable name name) {
                ComponentActivity componentActivity = ComponentActivity.this;
                final areNotificationsEnabled.setMin<O> length = arenotificationsenabled.length(componentActivity, i2);
                if (length != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            AnonymousClass1.this.setMin(i, length.getMin);
                        }
                    });
                    return;
                }
                Intent max = arenotificationsenabled.setMax(componentActivity, i2);
                Bundle bundle = null;
                if (max.getExtras() != null && max.getExtras().getClassLoader() == null) {
                    max.setExtrasClassLoader(componentActivity.getClassLoader());
                }
                if (max.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundle = max.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    max.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else if (name != null) {
                    bundle = name.length();
                }
                Bundle bundle2 = bundle;
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(max.getAction())) {
                    String[] stringArrayExtra = max.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    FontRes.getMin(componentActivity, stringArrayExtra, i);
                } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(max.getAction())) {
                    IntentSenderRequest intentSenderRequest = (IntentSenderRequest) max.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        FontRes.getMin(componentActivity, intentSenderRequest.getMin, i, intentSenderRequest.length, intentSenderRequest.setMin, intentSenderRequest.setMax, 0, bundle2);
                    } catch (IntentSender.SendIntentException e) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public final void run() {
                                AnonymousClass1.this.getMin(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", e));
                            }
                        });
                    }
                } else {
                    FontRes.setMax(componentActivity, max, i, bundle2);
                }
            }
        };
        if (getLifecycle() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                getLifecycle().setMax(new setPopupCallback() {
                    public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().setMax(new setPopupCallback() {
                public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.setMax = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().getMin();
                        }
                    }
                }
            });
            getLifecycle().setMax(new setPopupCallback() {
                public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().length(this);
                }
            });
            if (19 <= Build.VERSION.SDK_INT && Build.VERSION.SDK_INT <= 23) {
                getLifecycle().setMax(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i) {
        this();
        this.mContentLayoutId = i;
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.getMin(bundle);
        onExtraCallback onextracallback = this.mContextAwareHelper;
        onextracallback.setMax = this;
        for (IPostMessageService.Stub length : onextracallback.getMax) {
            length.length(this);
        }
        super.onCreate(bundle);
        IPostMessageService.Stub.Proxy proxy = this.mActivityResultRegistry;
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (!(stringArrayList == null || integerArrayList == null)) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    int intValue = integerArrayList.get(i).intValue();
                    String str = stringArrayList.get(i);
                    proxy.length.put(Integer.valueOf(intValue), str);
                    proxy.getMax.put(str, Integer.valueOf(intValue));
                }
                proxy.setMax = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                proxy.setMin = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                proxy.equals.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        invokeItem.setMin(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof hasText) {
            hasText hastext = (hasText) lifecycle;
            Lifecycle.State state = Lifecycle.State.CREATED;
            hastext.getMin("setCurrentState");
            hastext.getMax(state);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.getMin.setMin(bundle);
        IPostMessageService.Stub.Proxy proxy = this.mActivityResultRegistry;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(proxy.length.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(proxy.length.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(proxy.setMax));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) proxy.equals.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", proxy.setMin);
    }

    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        setMin setmin;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        adjustListItemSelectionBounds adjustlistitemselectionbounds = this.mViewModelStore;
        if (adjustlistitemselectionbounds == null && (setmin = (setMin) getLastNonConfigurationInstance()) != null) {
            adjustlistitemselectionbounds = setmin.setMin;
        }
        if (adjustlistitemselectionbounds == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        setMin setmin2 = new setMin();
        setmin2.setMax = onRetainCustomNonConfigurationInstance;
        setmin2.setMin = adjustlistitemselectionbounds;
        return setmin2;
    }

    @Deprecated
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        setMin setmin = (setMin) getLastNonConfigurationInstance();
        if (setmin != null) {
            return setmin.setMax;
        }
        return null;
    }

    public void setContentView(@LayoutRes int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(dispatchPresenterUpdate.getMin.setMin, this);
        getWindow().getDecorView().setTag(removeMenuPresenter.getMin.length, this);
        getWindow().getDecorView().setTag(killMode.setMax.length, this);
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.setMax;
    }

    public final void addOnContextAvailableListener(@NonNull IPostMessageService.Stub stub) {
        onExtraCallback onextracallback = this.mContextAwareHelper;
        if (onextracallback.setMax != null) {
            stub.length(onextracallback.setMax);
        }
        onextracallback.getMax.add(stub);
    }

    public final void removeOnContextAvailableListener(@NonNull IPostMessageService.Stub stub) {
        this.mContextAwareHelper.getMax.remove(stub);
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    public adjustListItemSelectionBounds getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: package-private */
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            setMin setmin = (setMin) getLastNonConfigurationInstance();
            if (setmin != null) {
                this.mViewModelStore = setmin.setMin;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new adjustListItemSelectionBounds();
            }
        }
    }

    @NonNull
    public onFinishInflate.setMax getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new getWindowAnimations(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @MainThread
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.getMax();
    }

    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @NonNull
    public final initForMode getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getMin;
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @CallSuper
    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (!this.mActivityResultRegistry.getMin(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (!this.mActivityResultRegistry.getMin(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @NonNull
    public final <I, O> ITrustedWebActivityCallback<I> registerForActivityResult(@NonNull areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull IPostMessageService.Stub.Proxy proxy, @NonNull IPostMessageService.Default<O> defaultR) {
        StringBuilder sb = new StringBuilder("activity_rq#");
        sb.append(this.mNextLocalRequestCode.getAndIncrement());
        return proxy.getMax(sb.toString(), this, arenotificationsenabled, defaultR);
    }

    @NonNull
    public final <I, O> ITrustedWebActivityCallback<I> registerForActivityResult(@NonNull areNotificationsEnabled<I, O> arenotificationsenabled, @NonNull IPostMessageService.Default<O> defaultR) {
        return registerForActivityResult(arenotificationsenabled, this.mActivityResultRegistry, defaultR);
    }

    @NonNull
    public final IPostMessageService.Stub.Proxy getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    /* JADX INFO: finally extract failed */
    public void reportFullyDrawn() {
        try {
            if (onNestedScrollAccepted.setMax()) {
                StringBuilder sb = new StringBuilder("reportFullyDrawn() for ");
                sb.append(getComponentName());
                String obj = sb.toString();
                if (Build.VERSION.SDK_INT >= 18) {
                    onStopNestedScroll.getMin(obj);
                }
            }
            if (Build.VERSION.SDK_INT > 19) {
                super.reportFullyDrawn();
            } else if (Build.VERSION.SDK_INT == 19 && IntRange.length((Context) this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
            if (Build.VERSION.SDK_INT >= 18) {
                onStopNestedScroll.length();
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 18) {
                onStopNestedScroll.length();
            }
            throw th;
        }
    }
}
