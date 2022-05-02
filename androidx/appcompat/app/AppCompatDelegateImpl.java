package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.lang.Thread;
import java.util.List;
import o.AppCompatActivity;
import o.INotificationSideChannel;
import o.ITrustedWebActivityCallback;
import o.ITrustedWebActivityService;
import o.IconCompatParcelizer;
import o.IntRange;
import o.MediaBrowserCompat$ItemReceiver;
import o.MediaBrowserCompat$MediaItem;
import o.MediaDescriptionCompat;
import o.MediaMetadataCompat;
import o.OptIn;
import o.PlaybackStateCompat;
import o.RatingCompat;
import o.cancelNotification;
import o.getPlaybackState;
import o.getSmallIconBitmap;
import o.getTag;
import o.invalidateOptionsMenu;
import o.notifyNotificationWithChannel;
import o.onEvent;
import o.onQueueTitleChanged;
import o.onSessionDestroyed;
import o.onTitleChanged;
import o.playFromSearch;
import o.prepareFromUri;
import o.setCursor;
import o.setNegativeButtonIcon;
import o.setOnKeyListener;
import o.supportInvalidateOptionsMenu;
import o.unregisterCallbackListener;
import o.valueType;

@RestrictTo({RestrictTo.Scope.LIBRARY})
class AppCompatDelegateImpl extends AppCompatDelegate implements onEvent.length, LayoutInflater.Factory2 {
    private static final boolean ICustomTabsCallback = (Build.VERSION.SDK_INT < 21);
    private static final boolean b = (!"robolectric".equals(Build.FINGERPRINT));
    private static final int[] create = {16842836};
    private static final boolean getCause;
    private static final PlaybackStateCompat.RepeatMode<String, Integer> onNavigationEvent = new PlaybackStateCompat.RepeatMode<>();
    private static boolean onPostMessage = true;
    boolean FastBitmap$CoordinateSystem;
    boolean Grayscale$Algorithm;
    private boolean ICustomTabsCallback$Default;
    private TextView ICustomTabsCallback$Stub;
    private boolean ICustomTabsCallback$Stub$Proxy;
    private PanelFeatureState[] ICustomTabsService;
    private Rect ICustomTabsService$Default;
    private boolean ICustomTabsService$Stub;
    private cancelNotification ICustomTabsService$Stub$Proxy;
    private Rect IPostMessageService;
    private INotificationSideChannel ITrustedWebActivityCallback;
    MenuInflater IsOverlapping;
    int Mean$Arithmetic;
    private View asBinder;
    private boolean asInterface;
    IconCompatParcelizer equals;
    private getTag extraCallback;
    private isInside extraCallbackWithResult;
    private boolean extraCommand;
    private PanelFeatureState getDefaultImpl;
    private boolean getInterfaceDescriptor;
    final Object getMax;
    final Context getMin;
    ViewGroup hashCode;
    boolean invoke;
    boolean invokeSuspend;
    Runnable isInside;
    final getSmallIconBitmap length;
    private int mayLaunchUrl;
    private boolean newSession;
    private boolean newSessionWithExtras;
    private getMax onMessageChannelReady;
    private CharSequence onRelationshipValidationResult;
    private toString onTransact;
    private IsOverlapping postMessage;
    private final Runnable receiveFile;
    private IsOverlapping requestPostMessageChannel;
    private int requestPostMessageChannelWithExtras;
    private boolean setDefaultImpl;
    ActionBar setMax;
    Window setMin;
    boolean toDoubleRange;
    PopupWindow toFloatRange;
    ActionBarContextView toIntRange;
    invalidateOptionsMenu toString;
    private boolean updateVisuals;
    private boolean validateRelationship;
    boolean valueOf;
    boolean values;
    private boolean warmup;

    private int toIntRange(int i) {
        if (i == 8) {
            return 108;
        }
        if (i == 9) {
            return 109;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public void getMax(ViewGroup viewGroup) {
    }

    public void length(Bundle bundle) {
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        getCause = z;
        if (ICustomTabsCallback && !onPostMessage) {
            final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
                    if (getMin(th)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getMessage());
                        sb.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                private boolean getMin(Throwable th) {
                    String message;
                    if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null || (!message.contains("drawable") && !message.contains("Drawable"))) {
                        return false;
                    }
                    return true;
                }
            });
        }
    }

    AppCompatDelegateImpl(Activity activity, getSmallIconBitmap getsmalliconbitmap) {
        this(activity, (Window) null, getsmalliconbitmap, activity);
    }

    AppCompatDelegateImpl(Dialog dialog, getSmallIconBitmap getsmalliconbitmap) {
        this(dialog.getContext(), dialog.getWindow(), getsmalliconbitmap, dialog);
    }

    private AppCompatDelegateImpl(Context context, Window window, getSmallIconBitmap getsmalliconbitmap, Object obj) {
        Integer num;
        AppCompatActivity onMessageChannelReady2;
        this.toString = null;
        this.ICustomTabsCallback$Default = true;
        this.mayLaunchUrl = -100;
        this.receiveFile = new Runnable() {
            public void run() {
                if ((AppCompatDelegateImpl.this.Mean$Arithmetic & 1) != 0) {
                    AppCompatDelegateImpl.this.equals(0);
                }
                if ((AppCompatDelegateImpl.this.Mean$Arithmetic & 4096) != 0) {
                    AppCompatDelegateImpl.this.equals(108);
                }
                AppCompatDelegateImpl.this.valueOf = false;
                AppCompatDelegateImpl.this.Mean$Arithmetic = 0;
            }
        };
        this.getMin = context;
        this.length = getsmalliconbitmap;
        this.getMax = obj;
        if (this.mayLaunchUrl == -100 && (obj instanceof Dialog) && (onMessageChannelReady2 = onMessageChannelReady()) != null) {
            this.mayLaunchUrl = onMessageChannelReady2.getDelegate().IsOverlapping();
        }
        if (this.mayLaunchUrl == -100 && (num = onNavigationEvent.get(this.getMax.getClass().getName())) != null) {
            this.mayLaunchUrl = num.intValue();
            onNavigationEvent.remove(this.getMax.getClass().getName());
        }
        if (window != null) {
            length(window);
        }
        unregisterCallbackListener.setMax();
    }

    @CallSuper
    @NonNull
    public Context getMin(@NonNull Context context) {
        boolean z = true;
        this.newSessionWithExtras = true;
        int max = getMax(context, ICustomTabsCallback$Default());
        Configuration configuration = null;
        if (getCause && (context instanceof ContextThemeWrapper)) {
            try {
                toDoubleRange.getMin((ContextThemeWrapper) context, getMax(context, max, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof MediaBrowserCompat$MediaItem) {
            try {
                ((MediaBrowserCompat$MediaItem) context).getMin(getMax(context, max, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!b) {
            return super.getMin(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = setMin.getMin(context, configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = setMax(configuration3, configuration4);
            }
        }
        Configuration max2 = getMax(context, max, configuration);
        MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(context, ITrustedWebActivityCallback.Stub.isInside.setMin);
        mediaBrowserCompat$MediaItem.getMin(max2);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            OptIn.getMin.length(mediaBrowserCompat$MediaItem.getTheme());
        }
        return super.getMin((Context) mediaBrowserCompat$MediaItem);
    }

    @RequiresApi(17)
    static class toDoubleRange {
        static void getMin(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public void getMin(Bundle bundle) {
        this.newSessionWithExtras = true;
        length(false);
        extraCallback();
        Object obj = this.getMax;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = valueType.getMax((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar doubleRange = toDoubleRange();
                if (doubleRange == null) {
                    this.ICustomTabsService$Stub = true;
                } else {
                    doubleRange.getMax(true);
                }
            }
            getMax((AppCompatDelegate) this);
        }
        this.newSession = true;
    }

    public void setMax(Bundle bundle) {
        extraCallbackWithResult();
    }

    public ActionBar setMax() {
        getCause();
        return this.setMax;
    }

    /* access modifiers changed from: package-private */
    public final ActionBar toDoubleRange() {
        return this.setMax;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback FastBitmap$CoordinateSystem() {
        return this.setMin.getCallback();
    }

    private void getCause() {
        extraCallbackWithResult();
        if (this.toDoubleRange && this.setMax == null) {
            Object obj = this.getMax;
            if (obj instanceof Activity) {
                this.setMax = new INotificationSideChannel.Default((Activity) this.getMax, this.FastBitmap$CoordinateSystem);
            } else if (obj instanceof Dialog) {
                this.setMax = new INotificationSideChannel.Default((Dialog) this.getMax);
            }
            ActionBar actionBar = this.setMax;
            if (actionBar != null) {
                actionBar.getMax(this.ICustomTabsService$Stub);
            }
        }
    }

    public void getMin(Toolbar toolbar) {
        if (this.getMax instanceof Activity) {
            ActionBar max = setMax();
            if (!(max instanceof INotificationSideChannel.Default)) {
                this.IsOverlapping = null;
                if (max != null) {
                    max.toFloatRange();
                }
                if (toolbar != null) {
                    ITrustedWebActivityService.Stub.Proxy proxy = new ITrustedWebActivityService.Stub.Proxy(toolbar, invokeSuspend(), this.extraCallbackWithResult);
                    this.setMax = proxy;
                    this.setMin.setCallback(proxy.getMax);
                } else {
                    this.setMax = null;
                    this.setMin.setCallback(this.extraCallbackWithResult);
                }
                equals();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context valueOf() {
        ActionBar max = setMax();
        Context max2 = max != null ? max.getMax() : null;
        return max2 == null ? this.getMin : max2;
    }

    public MenuInflater getMin() {
        if (this.IsOverlapping == null) {
            getCause();
            ActionBar actionBar = this.setMax;
            this.IsOverlapping = new MediaDescriptionCompat(actionBar != null ? actionBar.getMax() : this.getMin);
        }
        return this.IsOverlapping;
    }

    @Nullable
    public <T extends View> T setMax(@IdRes int i) {
        extraCallbackWithResult();
        return this.setMin.findViewById(i);
    }

    public void getMin(Configuration configuration) {
        ActionBar max;
        if (this.toDoubleRange && this.asInterface && (max = setMax()) != null) {
            max.length(configuration);
        }
        unregisterCallbackListener.getMax().length(this.getMin);
        length(false);
    }

    public void length() {
        this.extraCommand = true;
        onNavigationEvent();
    }

    public void setMin() {
        this.extraCommand = false;
        ActionBar max = setMax();
        if (max != null) {
            max.getMin(false);
        }
    }

    public void getMax() {
        ActionBar max = setMax();
        if (max != null) {
            max.getMin(true);
        }
    }

    public void setMax(View view) {
        extraCallbackWithResult();
        ViewGroup viewGroup = (ViewGroup) this.hashCode.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.extraCallbackWithResult.getMin().onContentChanged();
    }

    public void length(int i) {
        extraCallbackWithResult();
        ViewGroup viewGroup = (ViewGroup) this.hashCode.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.getMin).inflate(i, viewGroup);
        this.extraCallbackWithResult.getMin().onContentChanged();
    }

    public void setMin(View view, ViewGroup.LayoutParams layoutParams) {
        extraCallbackWithResult();
        ViewGroup viewGroup = (ViewGroup) this.hashCode.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.extraCallbackWithResult.getMin().onContentChanged();
    }

    public void getMin(View view, ViewGroup.LayoutParams layoutParams) {
        extraCallbackWithResult();
        ((ViewGroup) this.hashCode.findViewById(16908290)).addView(view, layoutParams);
        this.extraCallbackWithResult.getMin().onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void isInside() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.getMax
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            length((androidx.appcompat.app.AppCompatDelegate) r3)
        L_0x0009:
            boolean r0 = r3.valueOf
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.setMin
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.receiveFile
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.extraCommand = r0
            r0 = 1
            r3.invoke = r0
            int r0 = r3.mayLaunchUrl
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.getMax
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            o.PlaybackStateCompat$RepeatMode<java.lang.String, java.lang.Integer> r0 = onNavigationEvent
            java.lang.Object r1 = r3.getMax
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.mayLaunchUrl
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            o.PlaybackStateCompat$RepeatMode<java.lang.String, java.lang.Integer> r0 = onNavigationEvent
            java.lang.Object r1 = r3.getMax
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.ActionBar r0 = r3.setMax
            if (r0 == 0) goto L_0x005e
            r0.toFloatRange()
        L_0x005e:
            r3.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.isInside():void");
    }

    private void b() {
        IsOverlapping isOverlapping = this.postMessage;
        if (isOverlapping != null) {
            isOverlapping.setMax();
        }
        IsOverlapping isOverlapping2 = this.requestPostMessageChannel;
        if (isOverlapping2 != null) {
            isOverlapping2.setMax();
        }
    }

    public void setMin(@StyleRes int i) {
        this.requestPostMessageChannelWithExtras = i;
    }

    private void extraCallback() {
        if (this.setMin == null) {
            Object obj = this.getMax;
            if (obj instanceof Activity) {
                length(((Activity) obj).getWindow());
            }
        }
        if (this.setMin == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void length(@NonNull Window window) {
        if (this.setMin == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof isInside)) {
                isInside isinside = new isInside(callback);
                this.extraCallbackWithResult = isinside;
                window.setCallback(isinside);
                prepareFromUri min = prepareFromUri.setMin(this.getMin, (AttributeSet) null, create);
                Drawable max = min.getMax(0);
                if (max != null) {
                    window.setBackgroundDrawable(max);
                }
                min.setMin.recycle();
                this.setMin = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void extraCallbackWithResult() {
        if (!this.asInterface) {
            this.hashCode = onPostMessage();
            CharSequence invokeSuspend2 = invokeSuspend();
            if (!TextUtils.isEmpty(invokeSuspend2)) {
                getTag gettag = this.extraCallback;
                if (gettag != null) {
                    gettag.setWindowTitle(invokeSuspend2);
                } else if (toDoubleRange() != null) {
                    toDoubleRange().setMin(invokeSuspend2);
                } else {
                    TextView textView = this.ICustomTabsCallback$Stub;
                    if (textView != null) {
                        textView.setText(invokeSuspend2);
                    }
                }
            }
            onRelationshipValidationResult();
            getMax(this.hashCode);
            this.asInterface = true;
            PanelFeatureState max = getMax(0, false);
            if (this.invoke) {
                return;
            }
            if (max == null || max.IsOverlapping == null) {
                toFloatRange(108);
            }
        }
    }

    private ViewGroup onPostMessage() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.getMin.obtainStyledAttributes(ITrustedWebActivityCallback.Stub.toIntRange.cancel);
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.IconCompatParcelizer)) {
            if (obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.MediaMetadataCompat$LongKey, false)) {
                getMin(1);
            } else if (obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.IconCompatParcelizer, false)) {
                getMin(108);
            }
            if (obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$ItemReceiver, false)) {
                getMin(109);
            }
            if (obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$MediaItem$Flags, false)) {
                getMin(10);
            }
            this.invokeSuspend = obtainStyledAttributes.getBoolean(ITrustedWebActivityCallback.Stub.toIntRange.write, false);
            obtainStyledAttributes.recycle();
            extraCallback();
            this.setMin.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.getMin);
            if (this.Grayscale$Algorithm) {
                viewGroup = this.values ? (ViewGroup) from.inflate(ITrustedWebActivityCallback.Stub.equals.invokeSuspend, (ViewGroup) null) : (ViewGroup) from.inflate(ITrustedWebActivityCallback.Stub.equals.Grayscale$Algorithm, (ViewGroup) null);
            } else if (this.invokeSuspend) {
                viewGroup = (ViewGroup) from.inflate(ITrustedWebActivityCallback.Stub.equals.IsOverlapping, (ViewGroup) null);
                this.FastBitmap$CoordinateSystem = false;
                this.toDoubleRange = false;
            } else if (this.toDoubleRange) {
                TypedValue typedValue = new TypedValue();
                this.getMin.getTheme().resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.toFloatRange, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new MediaBrowserCompat$MediaItem(this.getMin, typedValue.resourceId);
                } else {
                    context = this.getMin;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(ITrustedWebActivityCallback.Stub.equals.invoke, (ViewGroup) null);
                getTag gettag = (getTag) viewGroup.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.Mean$Arithmetic);
                this.extraCallback = gettag;
                gettag.setWindowCallback(FastBitmap$CoordinateSystem());
                if (this.FastBitmap$CoordinateSystem) {
                    this.extraCallback.initFeature(109);
                }
                if (this.getInterfaceDescriptor) {
                    this.extraCallback.initFeature(2);
                }
                if (this.ICustomTabsCallback$Stub$Proxy) {
                    this.extraCallback.initFeature(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    ViewCompat.setMax((View) viewGroup, (AppCompatActivity) new AppCompatActivity() {
                        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                            int max = windowInsetsCompat.setMax();
                            int length = AppCompatDelegateImpl.this.length(windowInsetsCompat, (Rect) null);
                            if (max != length) {
                                windowInsetsCompat = windowInsetsCompat.setMax(windowInsetsCompat.getMax(), length, windowInsetsCompat.setMin(), windowInsetsCompat.getMin());
                            }
                            return ViewCompat.setMin(view, windowInsetsCompat);
                        }
                    });
                } else if (viewGroup instanceof getPlaybackState) {
                    ((getPlaybackState) viewGroup).setOnFitSystemWindowsListener(new getPlaybackState.setMin() {
                        public void setMin(Rect rect) {
                            rect.top = AppCompatDelegateImpl.this.length((WindowInsetsCompat) null, rect);
                        }
                    });
                }
                if (this.extraCallback == null) {
                    this.ICustomTabsCallback$Stub = (TextView) viewGroup.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.newSession);
                }
                playFromSearch.getMin(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.getMin);
                ViewGroup viewGroup2 = (ViewGroup) this.setMin.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.setMin.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.length() {
                    public void setMin() {
                    }

                    public void setMax() {
                        AppCompatDelegateImpl.this.ICustomTabsCallback();
                    }
                });
                return viewGroup;
            }
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.toDoubleRange);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.FastBitmap$CoordinateSystem);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.invokeSuspend);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.values);
            sb.append(", windowNoTitle: ");
            sb.append(this.Grayscale$Algorithm);
            sb.append(" }");
            throw new IllegalArgumentException(sb.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void onRelationshipValidationResult() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.hashCode.findViewById(16908290);
        View decorView = this.setMin.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.getMin.obtainStyledAttributes(ITrustedWebActivityCallback.Stub.toIntRange.cancel);
        obtainStyledAttributes.getValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaMetadataCompat$RatingKey, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaMetadataCompat$BitmapKey, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$SearchResultReceiver)) {
            obtainStyledAttributes.getValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$SearchResultReceiver, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaMetadataCompat)) {
            obtainStyledAttributes.getValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaMetadataCompat, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaDescriptionCompat)) {
            obtainStyledAttributes.getValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaDescriptionCompat, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$MediaItem)) {
            obtainStyledAttributes.getValue(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$MediaItem, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public boolean getMin(int i) {
        int intRange = toIntRange(i);
        if (this.Grayscale$Algorithm && intRange == 108) {
            return false;
        }
        if (this.toDoubleRange && intRange == 1) {
            this.toDoubleRange = false;
        }
        if (intRange == 1) {
            ICustomTabsCallback$Stub();
            this.Grayscale$Algorithm = true;
            return true;
        } else if (intRange == 2) {
            ICustomTabsCallback$Stub();
            this.getInterfaceDescriptor = true;
            return true;
        } else if (intRange == 5) {
            ICustomTabsCallback$Stub();
            this.ICustomTabsCallback$Stub$Proxy = true;
            return true;
        } else if (intRange == 10) {
            ICustomTabsCallback$Stub();
            this.values = true;
            return true;
        } else if (intRange == 108) {
            ICustomTabsCallback$Stub();
            this.toDoubleRange = true;
            return true;
        } else if (intRange != 109) {
            return this.setMin.requestFeature(intRange);
        } else {
            ICustomTabsCallback$Stub();
            this.FastBitmap$CoordinateSystem = true;
            return true;
        }
    }

    public final void setMin(CharSequence charSequence) {
        this.onRelationshipValidationResult = charSequence;
        getTag gettag = this.extraCallback;
        if (gettag != null) {
            gettag.setWindowTitle(charSequence);
        } else if (toDoubleRange() != null) {
            toDoubleRange().setMin(charSequence);
        } else {
            TextView textView = this.ICustomTabsCallback$Stub;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence invokeSuspend() {
        Object obj = this.getMax;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.onRelationshipValidationResult;
    }

    /* access modifiers changed from: package-private */
    public void getMax(int i) {
        if (i == 108) {
            ActionBar max = setMax();
            if (max != null) {
                max.length(false);
            }
        } else if (i == 0) {
            PanelFeatureState max2 = getMax(i, true);
            if (max2.FastBitmap$CoordinateSystem) {
                getMin(max2, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void IsOverlapping(int i) {
        ActionBar max;
        if (i == 108 && (max = setMax()) != null) {
            max.length(true);
        }
    }

    public boolean onMenuItemSelected(@NonNull onEvent onevent, @NonNull MenuItem menuItem) {
        PanelFeatureState length2;
        Window.Callback FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
        if (FastBitmap$CoordinateSystem2 == null || this.invoke || (length2 = length((Menu) onevent.getRootMenu())) == null) {
            return false;
        }
        return FastBitmap$CoordinateSystem2.onMenuItemSelected(length2.length, menuItem);
    }

    public void onMenuModeChange(@NonNull onEvent onevent) {
        getMax(true);
    }

    public IconCompatParcelizer getMax(@NonNull IconCompatParcelizer.getMin getmin) {
        getSmallIconBitmap getsmalliconbitmap;
        if (getmin != null) {
            IconCompatParcelizer iconCompatParcelizer = this.equals;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.getMin();
            }
            length length2 = new length(getmin);
            ActionBar max = setMax();
            if (max != null) {
                IconCompatParcelizer length3 = max.length((IconCompatParcelizer.getMin) length2);
                this.equals = length3;
                if (!(length3 == null || (getsmalliconbitmap = this.length) == null)) {
                    getsmalliconbitmap.onSupportActionModeStarted(length3);
                }
            }
            if (this.equals == null) {
                this.equals = setMax((IconCompatParcelizer.getMin) length2);
            }
            return this.equals;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void equals() {
        ActionBar max = setMax();
        if (max == null || !max.IsOverlapping()) {
            toFloatRange(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.IconCompatParcelizer setMax(@androidx.annotation.NonNull o.IconCompatParcelizer.getMin r8) {
        /*
            r7 = this;
            r7.Grayscale$Algorithm()
            o.IconCompatParcelizer r0 = r7.equals
            if (r0 == 0) goto L_0x000a
            r0.getMin()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.length
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$length r0 = new androidx.appcompat.app.AppCompatDelegateImpl$length
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            o.getSmallIconBitmap r0 = r7.length
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.invoke
            if (r2 != 0) goto L_0x0022
            o.IconCompatParcelizer r0 = r0.onWindowStartingSupportActionMode(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.equals = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.toIntRange
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.invokeSuspend
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.getMin
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = o.ITrustedWebActivityCallback.Stub.getMin.toFloatRange
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.getMin
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            o.MediaBrowserCompat$MediaItem r4 = new o.MediaBrowserCompat$MediaItem
            android.content.Context r6 = r7.getMin
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.getMin
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.toIntRange = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = o.ITrustedWebActivityCallback.Stub.getMin.isInside
            r5.<init>(r4, r1, r6)
            r7.toFloatRange = r5
            r6 = 2
            o.dispatchKeyEvent.getMin(r5, r6)
            android.widget.PopupWindow r5 = r7.toFloatRange
            androidx.appcompat.widget.ActionBarContextView r6 = r7.toIntRange
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.toFloatRange
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = o.ITrustedWebActivityCallback.Stub.getMin.getMin
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.toIntRange
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.toFloatRange
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$8 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$8
            r0.<init>()
            r7.isInside = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.hashCode
            int r4 = o.ITrustedWebActivityCallback.Stub.toFloatRange.equals
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.valueOf()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.inflate()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.toIntRange = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.toIntRange
            if (r0 == 0) goto L_0x0162
            r7.Grayscale$Algorithm()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.toIntRange
            r0.killMode()
            o.MediaBrowserCompat$MediaItem$Flags r0 = new o.MediaBrowserCompat$MediaItem$Flags
            androidx.appcompat.widget.ActionBarContextView r4 = r7.toIntRange
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.toIntRange
            android.widget.PopupWindow r6 = r7.toFloatRange
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.getMax()
            boolean r8 = r8.setMax(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.length()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            r8.initForMode(r0)
            r7.equals = r0
            boolean r8 = r7.invoke()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            o.invalidateOptionsMenu r8 = androidx.core.view.ViewCompat.Grayscale$Algorithm(r8)
            o.invalidateOptionsMenu r8 = r8.getMin((float) r0)
            r7.toString = r8
            androidx.appcompat.app.AppCompatDelegateImpl$6 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$6
            r0.<init>()
            r8.length(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.toIntRange
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.ViewCompat.b(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.toFloatRange
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.setMin
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.isInside
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.equals = r1
        L_0x0162:
            o.IconCompatParcelizer r8 = r7.equals
            if (r8 == 0) goto L_0x016d
            o.getSmallIconBitmap r0 = r7.length
            if (r0 == 0) goto L_0x016d
            r0.onSupportActionModeStarted(r8)
        L_0x016d:
            o.IconCompatParcelizer r8 = r7.equals
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.setMax(o.IconCompatParcelizer$getMin):o.IconCompatParcelizer");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.hashCode;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean invoke() {
        /*
            r1 = this;
            boolean r0 = r1.asInterface
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.hashCode
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.ViewCompat.asInterface(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.invoke():boolean");
    }

    public boolean Mean$Arithmetic() {
        return this.ICustomTabsCallback$Default;
    }

    /* access modifiers changed from: package-private */
    public void Grayscale$Algorithm() {
        invalidateOptionsMenu invalidateoptionsmenu = this.toString;
        if (invalidateoptionsmenu != null) {
            invalidateoptionsmenu.getMax();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean create() {
        IconCompatParcelizer iconCompatParcelizer = this.equals;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.getMin();
            return true;
        }
        ActionBar max = setMax();
        if (max == null || !max.isInside()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean getMin(int i, KeyEvent keyEvent) {
        ActionBar max = setMax();
        if (max != null && max.setMin(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.getDefaultImpl;
        if (panelFeatureState == null || !getMax(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.getDefaultImpl == null) {
                PanelFeatureState max2 = getMax(0, true);
                setMin(max2, keyEvent);
                boolean max3 = getMax(max2, keyEvent.getKeyCode(), keyEvent, 1);
                max2.values = false;
                if (max3) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.getDefaultImpl;
        if (panelFeatureState2 != null) {
            panelFeatureState2.toString = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean getMax(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.getMax;
        boolean z = true;
        if (((obj instanceof setOnKeyListener.length) || (obj instanceof notifyNotificationWithChannel)) && (decorView = this.setMin.getDecorView()) != null && setOnKeyListener.getMin(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.extraCallbackWithResult.getMin().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? setMax(keyCode, keyEvent) : setMin(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public boolean setMin(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.warmup;
            this.warmup = false;
            PanelFeatureState max = getMax(0, false);
            if (max != null && max.FastBitmap$CoordinateSystem) {
                if (!z) {
                    getMin(max, true);
                }
                return true;
            } else if (create()) {
                return true;
            }
        } else if (i == 82) {
            length(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean setMax(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.warmup = z;
        } else if (i == 82) {
            getMax(0, keyEvent);
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View setMax(android.view.View r12, java.lang.String r13, @androidx.annotation.NonNull android.content.Context r14, @androidx.annotation.NonNull android.util.AttributeSet r15) {
        /*
            r11 = this;
            o.cancelNotification r0 = r11.ICustomTabsService$Stub$Proxy
            r1 = 0
            if (r0 != 0) goto L_0x0039
            android.content.Context r0 = r11.getMin
            int[] r2 = o.ITrustedWebActivityCallback.Stub.toIntRange.cancel
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = o.ITrustedWebActivityCallback.Stub.toIntRange.read
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            o.cancelNotification r0 = new o.cancelNotification
            r0.<init>()
            r11.ICustomTabsService$Stub$Proxy = r0
            goto L_0x0039
        L_0x001d:
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ all -> 0x0032 }
            o.cancelNotification r0 = (o.cancelNotification) r0     // Catch:{ all -> 0x0032 }
            r11.ICustomTabsService$Stub$Proxy = r0     // Catch:{ all -> 0x0032 }
            goto L_0x0039
        L_0x0032:
            o.cancelNotification r0 = new o.cancelNotification
            r0.<init>()
            r11.ICustomTabsService$Stub$Proxy = r0
        L_0x0039:
            boolean r0 = ICustomTabsCallback
            if (r0 == 0) goto L_0x006b
            o.INotificationSideChannel r0 = r11.ITrustedWebActivityCallback
            if (r0 != 0) goto L_0x0048
            o.INotificationSideChannel r0 = new o.INotificationSideChannel
            r0.<init>()
            r11.ITrustedWebActivityCallback = r0
        L_0x0048:
            o.INotificationSideChannel r0 = r11.ITrustedWebActivityCallback
            boolean r0 = r0.getMax(r15)
            r2 = 1
            if (r0 == 0) goto L_0x0053
        L_0x0051:
            r1 = 1
            goto L_0x0069
        L_0x0053:
            boolean r0 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r0 == 0) goto L_0x0061
            r0 = r15
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            int r0 = r0.getDepth()
            if (r0 <= r2) goto L_0x0069
            goto L_0x0051
        L_0x0061:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.getMin((android.view.ViewParent) r0)
            r1 = r0
        L_0x0069:
            r7 = r1
            goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            o.cancelNotification r2 = r11.ICustomTabsService$Stub$Proxy
            boolean r8 = ICustomTabsCallback
            r9 = 1
            boolean r10 = o.playFromMediaId.getMin()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.createView(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.setMax(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private boolean getMin(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.setMin.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ViewCompat.ICustomTabsService((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public void toIntRange() {
        LayoutInflater from = LayoutInflater.from(this.getMin);
        if (from.getFactory() == null) {
            setCursor.setMin(from, this);
        } else {
            from.getFactory2();
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return setMax(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    @Nullable
    private AppCompatActivity onMessageChannelReady() {
        Context context = this.getMin;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    private void length(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.FastBitmap$CoordinateSystem && !this.invoke) {
            if (panelFeatureState.length == 0) {
                if ((this.getMin.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem2 == null || FastBitmap$CoordinateSystem2.onMenuOpened(panelFeatureState.length, panelFeatureState.IsOverlapping)) {
                WindowManager windowManager = (WindowManager) this.getMin.getSystemService("window");
                if (windowManager != null && setMin(panelFeatureState, keyEvent)) {
                    if (panelFeatureState.toIntRange == null || panelFeatureState.Grayscale$Algorithm) {
                        if (panelFeatureState.toIntRange == null) {
                            if (!getMin(panelFeatureState) || panelFeatureState.toIntRange == null) {
                                return;
                            }
                        } else if (panelFeatureState.Grayscale$Algorithm && panelFeatureState.toIntRange.getChildCount() > 0) {
                            panelFeatureState.toIntRange.removeAllViews();
                        }
                        if (!setMin(panelFeatureState) || !panelFeatureState.setMin()) {
                            panelFeatureState.Grayscale$Algorithm = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.equals.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.toIntRange.setBackgroundResource(panelFeatureState.getMax);
                        ViewParent parent = panelFeatureState.equals.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.equals);
                        }
                        panelFeatureState.toIntRange.addView(panelFeatureState.equals, layoutParams2);
                        if (!panelFeatureState.equals.hasFocus()) {
                            panelFeatureState.equals.requestFocus();
                        }
                    } else if (!(panelFeatureState.toFloatRange == null || (layoutParams = panelFeatureState.toFloatRange.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        panelFeatureState.toString = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.setMin, panelFeatureState.setMax, 1002, 8519680, -3);
                        layoutParams3.gravity = panelFeatureState.getMin;
                        layoutParams3.windowAnimations = panelFeatureState.isInside;
                        windowManager.addView(panelFeatureState.toIntRange, layoutParams3);
                        panelFeatureState.FastBitmap$CoordinateSystem = true;
                        return;
                    }
                    i = -2;
                    panelFeatureState.toString = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.setMin, panelFeatureState.setMax, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.getMin;
                    layoutParams32.windowAnimations = panelFeatureState.isInside;
                    windowManager.addView(panelFeatureState.toIntRange, layoutParams32);
                    panelFeatureState.FastBitmap$CoordinateSystem = true;
                    return;
                }
                return;
            }
            getMin(panelFeatureState, true);
        }
    }

    private boolean getMin(PanelFeatureState panelFeatureState) {
        panelFeatureState.getMax(valueOf());
        panelFeatureState.toIntRange = new AppCompatDelegateImpl$FastBitmap$CoordinateSystem(this, panelFeatureState.hashCode);
        panelFeatureState.getMin = 81;
        return true;
    }

    private void getMax(boolean z) {
        getTag gettag = this.extraCallback;
        if (gettag == null || !gettag.canShowOverflowMenu() || (ViewConfiguration.get(this.getMin).hasPermanentMenuKey() && !this.extraCallback.isOverflowMenuShowPending())) {
            PanelFeatureState max = getMax(0, true);
            max.Grayscale$Algorithm = true;
            getMin(max, false);
            length(max, (KeyEvent) null);
            return;
        }
        Window.Callback FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
        if (this.extraCallback.isOverflowMenuShowing() && z) {
            this.extraCallback.hideOverflowMenu();
            if (!this.invoke) {
                FastBitmap$CoordinateSystem2.onPanelClosed(108, getMax(0, true).IsOverlapping);
            }
        } else if (FastBitmap$CoordinateSystem2 != null && !this.invoke) {
            if (this.valueOf && (this.Mean$Arithmetic & 1) != 0) {
                this.setMin.getDecorView().removeCallbacks(this.receiveFile);
                this.receiveFile.run();
            }
            PanelFeatureState max2 = getMax(0, true);
            if (max2.IsOverlapping != null && !max2.invoke && FastBitmap$CoordinateSystem2.onPreparePanel(0, max2.toFloatRange, max2.IsOverlapping)) {
                FastBitmap$CoordinateSystem2.onMenuOpened(108, max2.IsOverlapping);
                this.extraCallback.showOverflowMenu();
            }
        }
    }

    private boolean setMax(PanelFeatureState panelFeatureState) {
        Context context = this.getMin;
        if ((panelFeatureState.length == 0 || panelFeatureState.length == 108) && this.extraCallback != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.toFloatRange, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.IsOverlapping, typedValue, true);
            } else {
                theme.resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.IsOverlapping, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(context, 0);
                mediaBrowserCompat$MediaItem.getTheme().setTo(theme2);
                context = mediaBrowserCompat$MediaItem;
            }
        }
        onEvent onevent = new onEvent(context);
        onevent.setCallback(this);
        panelFeatureState.setMax(onevent);
        return true;
    }

    private boolean setMin(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.toFloatRange != null) {
            panelFeatureState.equals = panelFeatureState.toFloatRange;
            return true;
        } else if (panelFeatureState.IsOverlapping == null) {
            return false;
        } else {
            if (this.onTransact == null) {
                this.onTransact = new toString();
            }
            panelFeatureState.equals = (View) panelFeatureState.setMin(this.onTransact);
            if (panelFeatureState.equals != null) {
                return true;
            }
            return false;
        }
    }

    private boolean setMin(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        getTag gettag;
        getTag gettag2;
        getTag gettag3;
        if (this.invoke) {
            return false;
        }
        if (panelFeatureState.values) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.getDefaultImpl;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            getMin(panelFeatureState2, false);
        }
        Window.Callback FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
        if (FastBitmap$CoordinateSystem2 != null) {
            panelFeatureState.toFloatRange = FastBitmap$CoordinateSystem2.onCreatePanelView(panelFeatureState.length);
        }
        boolean z = panelFeatureState.length == 0 || panelFeatureState.length == 108;
        if (z && (gettag3 = this.extraCallback) != null) {
            gettag3.setMenuPrepared();
        }
        if (panelFeatureState.toFloatRange == null && (!z || !(toDoubleRange() instanceof ITrustedWebActivityService.Stub.Proxy))) {
            if (panelFeatureState.IsOverlapping == null || panelFeatureState.invoke) {
                if (panelFeatureState.IsOverlapping == null && (!setMax(panelFeatureState) || panelFeatureState.IsOverlapping == null)) {
                    return false;
                }
                if (z && this.extraCallback != null) {
                    if (this.onMessageChannelReady == null) {
                        this.onMessageChannelReady = new getMax();
                    }
                    this.extraCallback.setMenu(panelFeatureState.IsOverlapping, this.onMessageChannelReady);
                }
                panelFeatureState.IsOverlapping.stopDispatchingItemsChanged();
                if (!FastBitmap$CoordinateSystem2.onCreatePanelMenu(panelFeatureState.length, panelFeatureState.IsOverlapping)) {
                    panelFeatureState.setMax((onEvent) null);
                    if (z && (gettag2 = this.extraCallback) != null) {
                        gettag2.setMenu((Menu) null, this.onMessageChannelReady);
                    }
                    return false;
                }
                panelFeatureState.invoke = false;
            }
            panelFeatureState.IsOverlapping.stopDispatchingItemsChanged();
            if (panelFeatureState.valueOf != null) {
                panelFeatureState.IsOverlapping.restoreActionViewStates(panelFeatureState.valueOf);
                panelFeatureState.valueOf = null;
            }
            if (!FastBitmap$CoordinateSystem2.onPreparePanel(0, panelFeatureState.toFloatRange, panelFeatureState.IsOverlapping)) {
                if (z && (gettag = this.extraCallback) != null) {
                    gettag.setMenu((Menu) null, this.onMessageChannelReady);
                }
                panelFeatureState.IsOverlapping.startDispatchingItemsChanged();
                return false;
            }
            panelFeatureState.invokeSuspend = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.IsOverlapping.setQwertyMode(panelFeatureState.invokeSuspend);
            panelFeatureState.IsOverlapping.startDispatchingItemsChanged();
        }
        panelFeatureState.values = true;
        panelFeatureState.toString = false;
        this.getDefaultImpl = panelFeatureState;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void getMax(@NonNull onEvent onevent) {
        if (!this.setDefaultImpl) {
            this.setDefaultImpl = true;
            this.extraCallback.dismissPopups();
            Window.Callback FastBitmap$CoordinateSystem2 = FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem2 != null && !this.invoke) {
                FastBitmap$CoordinateSystem2.onPanelClosed(108, onevent);
            }
            this.setDefaultImpl = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void isInside(int i) {
        getMin(getMax(i, true), true);
    }

    /* access modifiers changed from: package-private */
    public void getMin(PanelFeatureState panelFeatureState, boolean z) {
        getTag gettag;
        if (!z || panelFeatureState.length != 0 || (gettag = this.extraCallback) == null || !gettag.isOverflowMenuShowing()) {
            WindowManager windowManager = (WindowManager) this.getMin.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.FastBitmap$CoordinateSystem || panelFeatureState.toIntRange == null)) {
                windowManager.removeView(panelFeatureState.toIntRange);
                if (z) {
                    setMin(panelFeatureState.length, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.values = false;
            panelFeatureState.toString = false;
            panelFeatureState.FastBitmap$CoordinateSystem = false;
            panelFeatureState.equals = null;
            panelFeatureState.Grayscale$Algorithm = true;
            if (this.getDefaultImpl == panelFeatureState) {
                this.getDefaultImpl = null;
                return;
            }
            return;
        }
        getMax(panelFeatureState.IsOverlapping);
    }

    private boolean getMax(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState max = getMax(i, true);
        if (!max.FastBitmap$CoordinateSystem) {
            return setMin(max, keyEvent);
        }
        return false;
    }

    private boolean length(int i, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z;
        getTag gettag;
        if (this.equals != null) {
            return false;
        }
        boolean z2 = true;
        PanelFeatureState max = getMax(i, true);
        if (i == 0 && (gettag = this.extraCallback) != null && gettag.canShowOverflowMenu() && !ViewConfiguration.get(this.getMin).hasPermanentMenuKey()) {
            if (this.extraCallback.isOverflowMenuShowing()) {
                z2 = this.extraCallback.hideOverflowMenu();
            } else if (!this.invoke && setMin(max, keyEvent)) {
                z2 = this.extraCallback.showOverflowMenu();
            }
            audioManager.playSoundEffect(0);
            return z2;
        } else if (max.FastBitmap$CoordinateSystem || max.toString) {
            boolean z3 = max.FastBitmap$CoordinateSystem;
            getMin(max, true);
            z2 = z3;
            if (z2 && (audioManager = (AudioManager) this.getMin.getApplicationContext().getSystemService("audio")) != null) {
                audioManager.playSoundEffect(0);
            }
            return z2;
        } else if (max.values) {
            if (max.invoke) {
                max.values = false;
                z = setMin(max, keyEvent);
            } else {
                z = true;
            }
            if (z) {
                length(max, keyEvent);
                audioManager.playSoundEffect(0);
                return z2;
            }
        }
        z2 = false;
        audioManager.playSoundEffect(0);
        return z2;
    }

    /* access modifiers changed from: package-private */
    public void setMin(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.ICustomTabsService;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.IsOverlapping;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.FastBitmap$CoordinateSystem) && !this.invoke) {
            this.extraCallbackWithResult.getMin().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public PanelFeatureState length(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.ICustomTabsService;
        int length2 = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length2; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.IsOverlapping == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public PanelFeatureState getMax(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.ICustomTabsService;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.ICustomTabsService = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    private boolean getMax(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.values || setMin(panelFeatureState, keyEvent)) && panelFeatureState.IsOverlapping != null) {
            z = panelFeatureState.IsOverlapping.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.extraCallback == null) {
            getMin(panelFeatureState, true);
        }
        return z;
    }

    private void toFloatRange(int i) {
        this.Mean$Arithmetic = (1 << i) | this.Mean$Arithmetic;
        if (!this.valueOf) {
            ViewCompat.getMax(this.setMin.getDecorView(), this.receiveFile);
            this.valueOf = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void equals(int i) {
        PanelFeatureState max;
        PanelFeatureState max2 = getMax(i, true);
        if (max2.IsOverlapping != null) {
            Bundle bundle = new Bundle();
            max2.IsOverlapping.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                max2.valueOf = bundle;
            }
            max2.IsOverlapping.stopDispatchingItemsChanged();
            max2.IsOverlapping.clear();
        }
        max2.invoke = true;
        max2.Grayscale$Algorithm = true;
        if ((i == 108 || i == 0) && this.extraCallback != null && (max = getMax(0, false)) != null) {
            max.values = false;
            setMin(max, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final int length(@Nullable WindowInsetsCompat windowInsetsCompat, @Nullable Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4 = 0;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.setMax();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.toIntRange;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.toIntRange.getLayoutParams();
            boolean z3 = true;
            if (this.toIntRange.isShown()) {
                if (this.IPostMessageService == null) {
                    this.IPostMessageService = new Rect();
                    this.ICustomTabsService$Default = new Rect();
                }
                Rect rect2 = this.IPostMessageService;
                Rect rect3 = this.ICustomTabsService$Default;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getMax(), windowInsetsCompat.setMax(), windowInsetsCompat.setMin(), windowInsetsCompat.getMin());
                }
                playFromSearch.length(this.hashCode, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                WindowInsetsCompat create2 = ViewCompat.create(this.hashCode);
                if (create2 == null) {
                    i2 = 0;
                } else {
                    i2 = create2.getMax();
                }
                if (create2 == null) {
                    i3 = 0;
                } else {
                    i3 = create2.setMin();
                }
                if (marginLayoutParams.topMargin == i5 && marginLayoutParams.leftMargin == i6 && marginLayoutParams.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i5;
                    marginLayoutParams.leftMargin = i6;
                    marginLayoutParams.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.asBinder != null) {
                    View view = this.asBinder;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (!(marginLayoutParams2.height == marginLayoutParams.topMargin && marginLayoutParams2.leftMargin == i2 && marginLayoutParams2.rightMargin == i3)) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = i2;
                            marginLayoutParams2.rightMargin = i3;
                            this.asBinder.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.getMin);
                    this.asBinder = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.hashCode.addView(this.asBinder, -1, layoutParams);
                }
                if (this.asBinder == null) {
                    z3 = false;
                }
                if (z3 && this.asBinder.getVisibility() != 0) {
                    getMin(this.asBinder);
                }
                if (!this.values && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.toIntRange.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.asBinder;
        if (view3 != null) {
            if (!z) {
                i4 = 8;
            }
            view3.setVisibility(i4);
        }
        return i;
    }

    private void getMin(View view) {
        int i;
        if ((ViewCompat.getCause(view) & 8192) != 0) {
            i = IntRange.setMax(this.getMin, ITrustedWebActivityCallback.Stub.setMin.getMax);
        } else {
            i = IntRange.setMax(this.getMin, ITrustedWebActivityCallback.Stub.setMin.setMin);
        }
        view.setBackgroundColor(i);
    }

    private void ICustomTabsCallback$Stub() {
        if (this.asInterface) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* access modifiers changed from: package-private */
    public void ICustomTabsCallback() {
        getTag gettag = this.extraCallback;
        if (gettag != null) {
            gettag.dismissPopups();
        }
        if (this.toFloatRange != null) {
            this.setMin.getDecorView().removeCallbacks(this.isInside);
            if (this.toFloatRange.isShowing()) {
                try {
                    this.toFloatRange.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.toFloatRange = null;
        }
        Grayscale$Algorithm();
        PanelFeatureState max = getMax(0, false);
        if (max != null && max.IsOverlapping != null) {
            max.IsOverlapping.close();
        }
    }

    public boolean onNavigationEvent() {
        return length(true);
    }

    private boolean length(boolean z) {
        if (this.invoke) {
            return false;
        }
        int ICustomTabsCallback$Default2 = ICustomTabsCallback$Default();
        boolean min = setMin(getMax(this.getMin, ICustomTabsCallback$Default2), z);
        if (ICustomTabsCallback$Default2 == 0) {
            setMax(this.getMin).length();
        } else {
            IsOverlapping isOverlapping = this.postMessage;
            if (isOverlapping != null) {
                isOverlapping.setMax();
            }
        }
        if (ICustomTabsCallback$Default2 == 3) {
            setMin(this.getMin).length();
        } else {
            IsOverlapping isOverlapping2 = this.requestPostMessageChannel;
            if (isOverlapping2 != null) {
                isOverlapping2.setMax();
            }
        }
        return min;
    }

    public int IsOverlapping() {
        return this.mayLaunchUrl;
    }

    /* access modifiers changed from: package-private */
    public int getMax(@NonNull Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return setMin(context).getMax();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                return setMax(context).getMax();
            } else {
                return -1;
            }
        }
        return i;
    }

    private int ICustomTabsCallback$Default() {
        int i = this.mayLaunchUrl;
        return i != -100 ? i : values();
    }

    @NonNull
    private Configuration getMax(@NonNull Context context, int i, @Nullable Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setMin(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getMin
            r1 = 0
            android.content.res.Configuration r0 = r6.getMax(r0, r7, r1)
            boolean r2 = r6.asInterface()
            android.content.Context r3 = r6.getMin
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.newSessionWithExtras
            if (r8 == 0) goto L_0x0047
            boolean r8 = b
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.newSession
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.getMax
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.getMax
            android.app.Activity r8 = (android.app.Activity) r8
            o.FontRes.toFloatRange(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.setMax(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.getMax
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.onNightModeChanged(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.setMin(int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(int r7, boolean r8, @androidx.annotation.Nullable android.content.res.Configuration r9) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getMin
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r2 = r0.getConfiguration()
            r1.<init>(r2)
            if (r9 == 0) goto L_0x0014
            r1.updateFrom(r9)
        L_0x0014:
            android.content.res.Configuration r9 = r0.getConfiguration()
            int r9 = r9.uiMode
            r9 = r9 & -49
            r7 = r7 | r9
            r1.uiMode = r7
            r7 = 0
            r0.updateConfiguration(r1, r7)
            int r9 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 23
            r4 = 1
            if (r9 >= r2) goto L_0x00d2
            int r9 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r9 >= r2) goto L_0x00d2
            int r9 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            java.lang.String r5 = "mDrawableCache"
            if (r9 < r2) goto L_0x0080
            boolean r9 = o.ITrustedWebActivityService.Stub.length
            if (r9 != 0) goto L_0x004d
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.String r2 = "mResourcesImpl"
            java.lang.reflect.Field r9 = r9.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x004b }
            o.ITrustedWebActivityService.Stub.setMax = r9     // Catch:{ NoSuchFieldException -> 0x004b }
            r9.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x004b }
        L_0x004b:
            o.ITrustedWebActivityService.Stub.length = r4
        L_0x004d:
            java.lang.reflect.Field r9 = o.ITrustedWebActivityService.Stub.setMax
            if (r9 == 0) goto L_0x00d2
            java.lang.reflect.Field r9 = o.ITrustedWebActivityService.Stub.setMax     // Catch:{ IllegalAccessException -> 0x0058 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ IllegalAccessException -> 0x0058 }
            goto L_0x0059
        L_0x0058:
            r9 = r7
        L_0x0059:
            if (r9 == 0) goto L_0x00d2
            boolean r0 = o.ITrustedWebActivityService.Stub.setMin
            if (r0 != 0) goto L_0x006e
            java.lang.Class r0 = r9.getClass()     // Catch:{ NoSuchFieldException -> 0x006c }
            java.lang.reflect.Field r0 = r0.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x006c }
            o.ITrustedWebActivityService.Stub.getMax = r0     // Catch:{ NoSuchFieldException -> 0x006c }
            r0.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x006c }
        L_0x006c:
            o.ITrustedWebActivityService.Stub.setMin = r4
        L_0x006e:
            java.lang.reflect.Field r0 = o.ITrustedWebActivityService.Stub.getMax
            if (r0 == 0) goto L_0x007a
            java.lang.reflect.Field r0 = o.ITrustedWebActivityService.Stub.getMax     // Catch:{ IllegalAccessException -> 0x0079 }
            java.lang.Object r7 = r0.get(r9)     // Catch:{ IllegalAccessException -> 0x0079 }
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            if (r7 == 0) goto L_0x00d2
            o.ITrustedWebActivityService.Stub.length(r7)
            goto L_0x00d2
        L_0x0080:
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r3) goto L_0x00a7
            boolean r9 = o.ITrustedWebActivityService.Stub.setMin
            if (r9 != 0) goto L_0x0095
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.reflect.Field r9 = r9.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0093 }
            o.ITrustedWebActivityService.Stub.getMax = r9     // Catch:{ NoSuchFieldException -> 0x0093 }
            r9.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0093 }
        L_0x0093:
            o.ITrustedWebActivityService.Stub.setMin = r4
        L_0x0095:
            java.lang.reflect.Field r9 = o.ITrustedWebActivityService.Stub.getMax
            if (r9 == 0) goto L_0x00a1
            java.lang.reflect.Field r9 = o.ITrustedWebActivityService.Stub.getMax     // Catch:{ IllegalAccessException -> 0x00a0 }
            java.lang.Object r7 = r9.get(r0)     // Catch:{ IllegalAccessException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
        L_0x00a1:
            if (r7 == 0) goto L_0x00d2
            o.ITrustedWebActivityService.Stub.length(r7)
            goto L_0x00d2
        L_0x00a7:
            int r9 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r9 < r2) goto L_0x00d2
            boolean r9 = o.ITrustedWebActivityService.Stub.setMin
            if (r9 != 0) goto L_0x00be
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.reflect.Field r9 = r9.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x00bc }
            o.ITrustedWebActivityService.Stub.getMax = r9     // Catch:{ NoSuchFieldException -> 0x00bc }
            r9.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x00bc }
        L_0x00bc:
            o.ITrustedWebActivityService.Stub.setMin = r4
        L_0x00be:
            java.lang.reflect.Field r9 = o.ITrustedWebActivityService.Stub.getMax
            if (r9 == 0) goto L_0x00d2
            java.lang.reflect.Field r9 = o.ITrustedWebActivityService.Stub.getMax     // Catch:{ IllegalAccessException -> 0x00cc }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ IllegalAccessException -> 0x00cc }
            java.util.Map r9 = (java.util.Map) r9     // Catch:{ IllegalAccessException -> 0x00cc }
            r7 = r9
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            if (r7 == 0) goto L_0x00d2
            r7.clear()
        L_0x00d2:
            int r7 = r6.requestPostMessageChannelWithExtras
            if (r7 == 0) goto L_0x00ea
            android.content.Context r9 = r6.getMin
            r9.setTheme(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L_0x00ea
            android.content.Context r7 = r6.getMin
            android.content.res.Resources$Theme r7 = r7.getTheme()
            int r9 = r6.requestPostMessageChannelWithExtras
            r7.applyStyle(r9, r4)
        L_0x00ea:
            if (r8 == 0) goto L_0x0116
            java.lang.Object r7 = r6.getMax
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L_0x0116
            android.app.Activity r7 = (android.app.Activity) r7
            boolean r8 = r7 instanceof o.setChecked
            if (r8 == 0) goto L_0x010f
            r8 = r7
            o.setChecked r8 = (o.setChecked) r8
            androidx.lifecycle.Lifecycle r8 = r8.getLifecycle()
            androidx.lifecycle.Lifecycle$State r8 = r8.length()
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r8 = r8.isAtLeast(r9)
            if (r8 == 0) goto L_0x010e
            r7.onConfigurationChanged(r1)
        L_0x010e:
            return
        L_0x010f:
            boolean r8 = r6.extraCommand
            if (r8 == 0) goto L_0x0116
            r7.onConfigurationChanged(r1)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.setMax(int, boolean, android.content.res.Configuration):void");
    }

    private IsOverlapping setMax(@NonNull Context context) {
        if (this.postMessage == null) {
            if (ITrustedWebActivityService.Default.setMin == null) {
                Context applicationContext = context.getApplicationContext();
                ITrustedWebActivityService.Default.setMin = new ITrustedWebActivityService.Default(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.postMessage = new hashCode(ITrustedWebActivityService.Default.setMin);
        }
        return this.postMessage;
    }

    private IsOverlapping setMin(@NonNull Context context) {
        if (this.requestPostMessageChannel == null) {
            this.requestPostMessageChannel = new equals(context);
        }
        return this.requestPostMessageChannel;
    }

    private boolean asInterface() {
        int i;
        if (!this.validateRelationship && (this.getMax instanceof Activity)) {
            PackageManager packageManager = this.getMin.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 269221888;
                } else {
                    i = Build.VERSION.SDK_INT >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.getMin, this.getMax.getClass()), i);
                this.updateVisuals = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.updateVisuals = false;
            }
        }
        this.validateRelationship = true;
        return this.updateVisuals;
    }

    class length implements IconCompatParcelizer.getMin {
        private IconCompatParcelizer.getMin setMin;

        public length(IconCompatParcelizer.getMin getmin) {
            this.setMin = getmin;
        }

        public boolean setMax(IconCompatParcelizer iconCompatParcelizer, Menu menu) {
            return this.setMin.setMax(iconCompatParcelizer, menu);
        }

        public boolean getMin(IconCompatParcelizer iconCompatParcelizer, Menu menu) {
            ViewCompat.b(AppCompatDelegateImpl.this.hashCode);
            return this.setMin.getMin(iconCompatParcelizer, menu);
        }

        public boolean getMin(IconCompatParcelizer iconCompatParcelizer, MenuItem menuItem) {
            return this.setMin.getMin(iconCompatParcelizer, menuItem);
        }

        public void setMax(IconCompatParcelizer iconCompatParcelizer) {
            this.setMin.setMax(iconCompatParcelizer);
            if (AppCompatDelegateImpl.this.toFloatRange != null) {
                AppCompatDelegateImpl.this.setMin.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.isInside);
            }
            if (AppCompatDelegateImpl.this.toIntRange != null) {
                AppCompatDelegateImpl.this.Grayscale$Algorithm();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.toString = ViewCompat.Grayscale$Algorithm(appCompatDelegateImpl.toIntRange).getMin(0.0f);
                AppCompatDelegateImpl.this.toString.length(new onTitleChanged() {
                    public void length(View view) {
                        AppCompatDelegateImpl.this.toIntRange.setVisibility(8);
                        if (AppCompatDelegateImpl.this.toFloatRange != null) {
                            AppCompatDelegateImpl.this.toFloatRange.dismiss();
                        } else if (AppCompatDelegateImpl.this.toIntRange.getParent() instanceof View) {
                            ViewCompat.b((View) AppCompatDelegateImpl.this.toIntRange.getParent());
                        }
                        AppCompatDelegateImpl.this.toIntRange.killMode();
                        AppCompatDelegateImpl.this.toString.length((supportInvalidateOptionsMenu) null);
                        AppCompatDelegateImpl.this.toString = null;
                        ViewCompat.b(AppCompatDelegateImpl.this.hashCode);
                    }
                });
            }
            if (AppCompatDelegateImpl.this.length != null) {
                AppCompatDelegateImpl.this.length.onSupportActionModeFinished(AppCompatDelegateImpl.this.equals);
            }
            AppCompatDelegateImpl.this.equals = null;
            ViewCompat.b(AppCompatDelegateImpl.this.hashCode);
        }
    }

    final class toString implements onQueueTitleChanged.setMax {
        toString() {
        }

        public final void getMax(@NonNull onEvent onevent, boolean z) {
            onEvent rootMenu = onevent.getRootMenu();
            boolean z2 = rootMenu != onevent;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                onevent = rootMenu;
            }
            PanelFeatureState length = appCompatDelegateImpl.length((Menu) onevent);
            if (length == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.setMin(length.length, length, rootMenu);
                AppCompatDelegateImpl.this.getMin(length, true);
                return;
            }
            AppCompatDelegateImpl.this.getMin(length, z);
        }

        public final boolean setMax(@NonNull onEvent onevent) {
            Window.Callback FastBitmap$CoordinateSystem;
            if (onevent != onevent.getRootMenu() || !AppCompatDelegateImpl.this.toDoubleRange || (FastBitmap$CoordinateSystem = AppCompatDelegateImpl.this.FastBitmap$CoordinateSystem()) == null || AppCompatDelegateImpl.this.invoke) {
                return true;
            }
            FastBitmap$CoordinateSystem.onMenuOpened(108, onevent);
            return true;
        }
    }

    final class getMax implements onQueueTitleChanged.setMax {
        getMax() {
        }

        public final boolean setMax(@NonNull onEvent onevent) {
            Window.Callback FastBitmap$CoordinateSystem = AppCompatDelegateImpl.this.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem == null) {
                return true;
            }
            FastBitmap$CoordinateSystem.onMenuOpened(108, onevent);
            return true;
        }

        public final void getMax(@NonNull onEvent onevent, boolean z) {
            AppCompatDelegateImpl.this.getMax(onevent);
        }
    }

    protected static final class PanelFeatureState {
        boolean FastBitmap$CoordinateSystem;
        boolean Grayscale$Algorithm = false;
        onEvent IsOverlapping;
        View equals;
        int getMax;
        int getMin;
        Context hashCode;
        boolean invoke;
        public boolean invokeSuspend;
        int isInside;
        int length;
        int setMax;
        int setMin;
        RatingCompat.Style toDoubleRange;
        View toFloatRange;
        ViewGroup toIntRange;
        boolean toString;
        Bundle valueOf;
        boolean values;

        PanelFeatureState(int i) {
            this.length = i;
        }

        public final boolean setMin() {
            if (this.equals == null) {
                return false;
            }
            if (this.toFloatRange != null) {
                return true;
            }
            RatingCompat.Style style = this.toDoubleRange;
            if (style.toIntRange == null) {
                style.toIntRange = new RatingCompat.Style.setMax();
            }
            if (style.toIntRange.getCount() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void getMax(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.getMax, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(ITrustedWebActivityCallback.Stub.getMin.onTransact, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(ITrustedWebActivityCallback.Stub.isInside.getMin, true);
            }
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = new MediaBrowserCompat$MediaItem(context, 0);
            mediaBrowserCompat$MediaItem.getTheme().setTo(newTheme);
            this.hashCode = mediaBrowserCompat$MediaItem;
            TypedArray obtainStyledAttributes = mediaBrowserCompat$MediaItem.obtainStyledAttributes(ITrustedWebActivityCallback.Stub.toIntRange.cancel);
            this.getMax = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.RemoteActionCompatParcelizer, 0);
            this.isInside = obtainStyledAttributes.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.MediaBrowserCompat$CustomActionResultReceiver, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        public final void setMax(onEvent onevent) {
            RatingCompat.Style style;
            onEvent onevent2 = this.IsOverlapping;
            if (onevent != onevent2) {
                if (onevent2 != null) {
                    onevent2.removeMenuPresenter(this.toDoubleRange);
                }
                this.IsOverlapping = onevent;
                if (onevent != null && (style = this.toDoubleRange) != null) {
                    onevent.addMenuPresenter(style);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final onSessionDestroyed setMin(onQueueTitleChanged.setMax setmax) {
            if (this.IsOverlapping == null) {
                return null;
            }
            if (this.toDoubleRange == null) {
                RatingCompat.Style style = new RatingCompat.Style(this.hashCode, ITrustedWebActivityCallback.Stub.equals.hashCode);
                this.toDoubleRange = style;
                style.setCallback(setmax);
                this.IsOverlapping.addMenuPresenter(this.toDoubleRange);
            }
            RatingCompat.Style style2 = this.toDoubleRange;
            ViewGroup viewGroup = this.toIntRange;
            if (style2.setMin == null) {
                style2.setMin = (ExpandedMenuView) style2.getMax.inflate(ITrustedWebActivityCallback.Stub.equals.equals, viewGroup, false);
                if (style2.toIntRange == null) {
                    style2.toIntRange = new RatingCompat.Style.setMax();
                }
                style2.setMin.setAdapter(style2.toIntRange);
                style2.setMin.setOnItemClickListener(style2);
            }
            return style2.setMin;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                /* renamed from: setMax */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.getMax(parcel, classLoader);
                }

                /* renamed from: getMax */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.getMax(parcel, (ClassLoader) null);
                }

                /* renamed from: getMin */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            };
            Bundle getMin;
            int length;
            boolean setMax;

            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.length);
                parcel.writeInt(this.setMax ? 1 : 0);
                if (this.setMax) {
                    parcel.writeBundle(this.getMin);
                }
            }

            static SavedState getMax(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.length = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.setMax = z;
                if (z) {
                    savedState.getMin = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    class isInside extends MediaMetadataCompat.RatingKey {
        public void onContentChanged() {
        }

        isInside(Window.Callback callback) {
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.getMax(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.getMin(keyEvent.getKeyCode(), keyEvent);
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof onEvent)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            onEvent onevent = menu instanceof onEvent ? (onEvent) menu : null;
            if (i == 0 && onevent == null) {
                return false;
            }
            if (onevent != null) {
                onevent.setOverrideVisibleItems(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onevent != null) {
                onevent.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.IsOverlapping(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.getMax(i);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.Mean$Arithmetic()) {
                return getMax(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* access modifiers changed from: package-private */
        public final ActionMode getMax(ActionMode.Callback callback) {
            MediaBrowserCompat$ItemReceiver.getMax getmax = new MediaBrowserCompat$ItemReceiver.getMax(AppCompatDelegateImpl.this.getMin, callback);
            IconCompatParcelizer max = AppCompatDelegateImpl.this.getMax((IconCompatParcelizer.getMin) getmax);
            if (max != null) {
                return getmax.setMin(max);
            }
            return null;
        }

        @RequiresApi(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.Mean$Arithmetic() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return getMax(callback);
        }

        @RequiresApi(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState max = AppCompatDelegateImpl.this.getMax(0, true);
            if (max == null || max.IsOverlapping == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, max.IsOverlapping, i);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    abstract class IsOverlapping {
        private BroadcastReceiver setMin;

        /* access modifiers changed from: package-private */
        public abstract int getMax();

        /* access modifiers changed from: package-private */
        public abstract void getMin();

        /* access modifiers changed from: package-private */
        @Nullable
        public abstract IntentFilter setMin();

        IsOverlapping() {
        }

        /* access modifiers changed from: package-private */
        public void length() {
            setMax();
            IntentFilter min = setMin();
            if (min != null && min.countActions() != 0) {
                if (this.setMin == null) {
                    this.setMin = new BroadcastReceiver() {
                        public void onReceive(Context context, Intent intent) {
                            IsOverlapping.this.getMin();
                        }
                    };
                }
                AppCompatDelegateImpl.this.getMin.registerReceiver(this.setMin, min);
            }
        }

        /* access modifiers changed from: package-private */
        public void setMax() {
            if (this.setMin != null) {
                try {
                    AppCompatDelegateImpl.this.getMin.unregisterReceiver(this.setMin);
                } catch (IllegalArgumentException unused) {
                }
                this.setMin = null;
            }
        }
    }

    class hashCode extends IsOverlapping {
        private final ITrustedWebActivityService.Default length;

        hashCode(@NonNull ITrustedWebActivityService.Default defaultR) {
            super();
            this.length = defaultR;
        }

        public int getMax() {
            return this.length.setMin() ? 2 : 1;
        }

        public void getMin() {
            AppCompatDelegateImpl.this.onNavigationEvent();
        }

        /* access modifiers changed from: package-private */
        public IntentFilter setMin() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }
    }

    class equals extends IsOverlapping {
        private final PowerManager getMax;

        equals(@NonNull Context context) {
            super();
            this.getMax = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public int getMax() {
            if (Build.VERSION.SDK_INT < 21 || !setMax.setMin(this.getMax)) {
                return 1;
            }
            return 2;
        }

        public void getMin() {
            AppCompatDelegateImpl.this.onNavigationEvent();
        }

        /* access modifiers changed from: package-private */
        public IntentFilter setMin() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
    }

    public final ITrustedWebActivityService.setMin toFloatRange() {
        return new getMin();
    }

    class getMin implements ITrustedWebActivityService.setMin {
        getMin() {
        }

        public void getMin(int i) {
            ActionBar max = AppCompatDelegateImpl.this.setMax();
            if (max != null) {
                max.getMax(i);
            }
        }
    }

    @NonNull
    private static Configuration setMax(@NonNull Configuration configuration, @Nullable Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            if (configuration.fontScale != configuration2.fontScale) {
                configuration3.fontScale = configuration2.fontScale;
            }
            if (configuration.mcc != configuration2.mcc) {
                configuration3.mcc = configuration2.mcc;
            }
            if (configuration.mnc != configuration2.mnc) {
                configuration3.mnc = configuration2.mnc;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                toFloatRange.setMin(configuration, configuration2, configuration3);
            } else if (!setNegativeButtonIcon.getMax(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            if (configuration.touchscreen != configuration2.touchscreen) {
                configuration3.touchscreen = configuration2.touchscreen;
            }
            if (configuration.keyboard != configuration2.keyboard) {
                configuration3.keyboard = configuration2.keyboard;
            }
            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                configuration3.keyboardHidden = configuration2.keyboardHidden;
            }
            if (configuration.navigation != configuration2.navigation) {
                configuration3.navigation = configuration2.navigation;
            }
            if (configuration.navigationHidden != configuration2.navigationHidden) {
                configuration3.navigationHidden = configuration2.navigationHidden;
            }
            if (configuration.orientation != configuration2.orientation) {
                configuration3.orientation = configuration2.orientation;
            }
            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                configuration3.screenLayout |= configuration2.screenLayout & 15;
            }
            if ((configuration.screenLayout & PsExtractor.AUDIO_STREAM) != (configuration2.screenLayout & PsExtractor.AUDIO_STREAM)) {
                configuration3.screenLayout |= configuration2.screenLayout & PsExtractor.AUDIO_STREAM;
            }
            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                configuration3.screenLayout |= configuration2.screenLayout & 48;
            }
            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                configuration3.screenLayout |= configuration2.screenLayout & 768;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                toIntRange.setMin(configuration, configuration2, configuration3);
            }
            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                configuration3.uiMode |= configuration2.uiMode & 15;
            }
            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                configuration3.uiMode |= configuration2.uiMode & 48;
            }
            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                configuration3.screenWidthDp = configuration2.screenWidthDp;
            }
            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                configuration3.screenHeightDp = configuration2.screenHeightDp;
            }
            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                setMin.setMax(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    @RequiresApi(17)
    static class setMin {
        static void setMax(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            if (configuration.densityDpi != configuration2.densityDpi) {
                configuration3.densityDpi = configuration2.densityDpi;
            }
        }

        static Context getMin(@NonNull Context context, @NonNull Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
    }

    @RequiresApi(21)
    static class setMax {
        static boolean setMin(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    @RequiresApi(24)
    static class toFloatRange {
        static void setMin(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    @RequiresApi(26)
    static class toIntRange {
        static void setMin(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }
}
