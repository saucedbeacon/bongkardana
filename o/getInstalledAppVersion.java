package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.pinwithface.ChallengePinWithFaceModule;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.PinChallengeModule;
import o.AppxPrerunChecker;
import o.BluetoothCrashResolver;
import o.DebugMonitor;
import o.GriverMonitor;
import o.PrepareException;
import o.ShareRecyclerAdapter;
import o.b;
import o.inTransaction;
import o.isMainThread;
import o.setParallaxDistance;

public final class getInstalledAppVersion implements AppxPrerunChecker.AnonymousClass1 {
    private b.C0007b<inTransaction.getMin> FastBitmap$CoordinateSystem;
    private b.C0007b<getPerformanceTracker> Grayscale$Algorithm;
    private b.C0007b<isMainThread.getMin> ICustomTabsCallback;
    private b.C0007b<sendData> ICustomTabsCallback$Default;
    private b.C0007b<GriverMonitor.AnonymousClass2> ICustomTabsCallback$Stub;
    private b.C0007b<createSplashFragment> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<GriverSplashFragmentExtension> ICustomTabsService;
    private b.C0007b<isMainThread.getMax> ICustomTabsService$Stub;
    private b.C0007b<getCommonResources> IsOverlapping;
    private b.C0007b<onWebViewDestory> Mean$Arithmetic;
    private b.C0007b<onValidateSchema> asBinder;
    private b.C0007b<ShareRecyclerAdapter.ShareViewHolder> asInterface;
    private b.C0007b<createAllTables> b;
    private b.C0007b<GriverMonitorAnalyticsConfigManager> create;
    private b.C0007b<setParallaxDistance.setMin> equals;
    private b.C0007b<getCursiveFontFamily> extraCallback;
    private b.C0007b<UpdateAppCallback> extraCallbackWithResult;
    private b.C0007b<SavedStateRegistry$1> extraCommand;
    private b.C0007b<inTransaction.getMax> getCause;
    private b.C0007b<handleTinyAppKeyEvent> getDefaultImpl;
    private b.C0007b<createQuery> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<setDefaultFontSize> getMin;
    private b.C0007b<Context> hashCode;
    private b.C0007b<success> invoke;
    private b.C0007b<GriverMonitor> invokeSuspend;
    private b.C0007b<appxLoadFailed> isInside;
    private b.C0007b<setDomStorageEnabled> length;
    private b.C0007b<GriverFileAbilityImpl> mayLaunchUrl;
    private b.C0007b<onBatchScanResults> newSession;
    private b.C0007b<release> newSessionWithExtras;
    private b.C0007b<setDatabasePath> onMessageChannelReady;
    private b.C0007b<DebugMonitor> onNavigationEvent;
    private b.C0007b<onDescriptorWrite> onPostMessage;
    private b.C0007b<clearCache> onRelationshipValidationResult;
    private b.C0007b<createNewStatement> onTransact;
    private b.C0007b<onGeolocationPermissionsHidePrompt> postMessage;
    private b.C0007b<SkipQueryVerification> requestPostMessageChannel;
    private b.C0007b<TypeConverters> requestPostMessageChannelWithExtras;
    private b.C0007b<H5Utils> setDefaultImpl;
    private b.C0007b<AccelerometerForH5SensorService> setMax;
    private b.C0007b<Embedded> setMin;
    private b.C0007b<setCoveredFadeColor> toDoubleRange;
    private b.C0007b<GriverCreateDialogParam> toFloatRange;
    private b.C0007b<getScheme> toIntRange;
    private b.C0007b<GriverLogger> toString;
    private b.C0007b<forceFlush> updateVisuals;
    private b.C0007b<getIconDrawable> validateRelationship;
    private b.C0007b<setToolbarMenus> valueOf;
    private b.C0007b<setParallaxDistance.length> values;
    private b.C0007b<queryLocalIdByPath> warmup;

    public /* synthetic */ getInstalledAppVersion(PinChallengeModule pinChallengeModule, AuthenticationModule authenticationModule, ChallengePinWithFaceModule challengePinWithFaceModule, LogoutModule logoutModule, PrepareException.AnonymousClass1 r5, byte b2) {
        this(pinChallengeModule, authenticationModule, challengePinWithFaceModule, logoutModule, r5);
    }

    private getInstalledAppVersion(PinChallengeModule pinChallengeModule, AuthenticationModule authenticationModule, ChallengePinWithFaceModule challengePinWithFaceModule, LogoutModule logoutModule, PrepareException.AnonymousClass1 r20) {
        PrepareException.AnonymousClass1 r1 = r20;
        this.getMax = r1;
        equals equals2 = new equals(r1);
        this.getMin = equals2;
        this.length = setAppCachePath.create(equals2);
        b.C0007b<Embedded> min = isScrap.getMin(CollectionCodec.getMax(authenticationModule));
        this.setMin = min;
        this.setMax = access$608.getMin(this.length, min);
        this.equals = isScrap.getMin(SlidingPaneLayout.getMin(challengePinWithFaceModule));
        this.isInside = new valueOf(r1);
        this.toIntRange = new values(r1);
        getMax getmax = new getMax(r1);
        this.IsOverlapping = getmax;
        GVLoadingView create2 = GVLoadingView.create(this.isInside, this.toIntRange, getmax);
        this.toFloatRange = create2;
        setPanelSlideListener max = setPanelSlideListener.setMax(this.setMax, this.equals, create2);
        this.toDoubleRange = max;
        this.values = isScrap.getMin(setSliderFadeColor.setMax(challengePinWithFaceModule, max));
        this.hashCode = new setMin(r1);
        this.FastBitmap$CoordinateSystem = isScrap.getMin(StringCodec.length(logoutModule));
        this.toString = new hashCode(r1);
        toIntRange tointrange = new toIntRange(r1);
        this.Mean$Arithmetic = tointrange;
        this.invokeSuspend = getCommonExceptionMap.create(this.isInside, this.toIntRange, this.toString, tointrange);
        this.Grayscale$Algorithm = new toFloatRange(r1);
        isInside isinside = new isInside(r1);
        this.invoke = isinside;
        ToolbarMenuOption create3 = ToolbarMenuOption.create(isinside);
        this.valueOf = create3;
        b.C0007b<createAllTables> min2 = isScrap.getMin(dropAllTables.getMin(this.hashCode, this.FastBitmap$CoordinateSystem, this.invokeSuspend, this.Grayscale$Algorithm, create3));
        this.b = min2;
        this.getCause = isScrap.getMin(getClazz.setMin(logoutModule, min2));
        this.ICustomTabsCallback = isScrap.getMin(setExtensionImpl.setMin(pinChallengeModule));
        this.onNavigationEvent = DebugMonitor.AnonymousClass2.create(this.isInside, this.toIntRange, this.toString);
        this.create = GriverMonitor.AnonymousClass7.create(this.isInside, this.toIntRange, this.toString);
        this.onMessageChannelReady = setAllowFileAccessFromFileURLs.create(this.isInside, this.toIntRange, this.getMin);
        length length2 = new length(r1);
        this.extraCallback = length2;
        this.onRelationshipValidationResult = clearFormData.create(this.isInside, this.toIntRange, length2);
        this.extraCallbackWithResult = new toDoubleRange(r1);
        invoke invoke2 = new invoke(r1);
        this.onPostMessage = invoke2;
        this.ICustomTabsCallback$Default = onConnectionStateChange.create(this.isInside, this.toIntRange, invoke2);
        ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1 min3 = ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1.setMin(setAllBucketName.setMax());
        this.asInterface = min3;
        this.asBinder = isScrap.getMin(validateMigration.length(this.ICustomTabsCallback, this.onNavigationEvent, this.create, this.onMessageChannelReady, this.onRelationshipValidationResult, this.hashCode, this.Grayscale$Algorithm, this.length, this.extraCallbackWithResult, this.toFloatRange, this.ICustomTabsCallback$Default, min3));
        analyticsMonitorEnabled create4 = analyticsMonitorEnabled.create(this.isInside, this.toIntRange, this.toString);
        this.ICustomTabsCallback$Stub = create4;
        this.onTransact = isScrap.getMin(acquire.length(this.hashCode, this.ICustomTabsCallback, create4, this.onMessageChannelReady, this.toFloatRange));
        getInstalledAppVersion$FastBitmap$CoordinateSystem getinstalledappversion_fastbitmap_coordinatesystem = new getInstalledAppVersion$FastBitmap$CoordinateSystem(r1);
        this.setDefaultImpl = getinstalledappversion_fastbitmap_coordinatesystem;
        needAddHeader create5 = needAddHeader.create(this.isInside, this.toIntRange, getinstalledappversion_fastbitmap_coordinatesystem);
        this.getDefaultImpl = create5;
        this.getInterfaceDescriptor = onPreMigrate.setMax(this.hashCode, this.ICustomTabsCallback, create5);
        IsOverlapping isOverlapping = new IsOverlapping(r1);
        this.ICustomTabsService = isOverlapping;
        fail create6 = fail.create(isOverlapping);
        this.ICustomTabsCallback$Stub$Proxy = create6;
        this.newSessionWithExtras = Transaction.setMin(this.hashCode, create6, this.toFloatRange, this.setMin, this.ICustomTabsCallback);
        toString tostring = new toString(r1);
        this.mayLaunchUrl = tostring;
        isLocalIdRes create7 = isLocalIdRes.create(tostring);
        this.warmup = create7;
        this.extraCommand = getParallaxDistance.getMax(this.hashCode, this.ICustomTabsCallback, create7);
        getInstalledAppVersion$Grayscale$Algorithm getinstalledappversion_grayscale_algorithm = new getInstalledAppVersion$Grayscale$Algorithm(r1);
        this.newSession = getinstalledappversion_grayscale_algorithm;
        BluetoothCrashResolver.AnonymousClass1 create8 = BluetoothCrashResolver.AnonymousClass1.create(this.isInside, this.toIntRange, getinstalledappversion_grayscale_algorithm);
        this.updateVisuals = create8;
        this.requestPostMessageChannelWithExtras = Recreator.length(create8, this.ICustomTabsCallback);
        setMax setmax = new setMax(r1);
        this.postMessage = setmax;
        GriverBackButtonStyleExtension create9 = GriverBackButtonStyleExtension.create(setmax);
        this.validateRelationship = create9;
        getStmt length3 = getStmt.length(this.hashCode, create9, this.ICustomTabsCallback);
        this.requestPostMessageChannel = length3;
        this.ICustomTabsService$Stub = isScrap.getMin(getExtensionImpl.getMax(pinChallengeModule, this.asBinder, this.onTransact, this.getInterfaceDescriptor, this.newSessionWithExtras, this.extraCommand, this.requestPostMessageChannelWithExtras, length3));
    }

    public static final class getMin {
        public ChallengePinWithFaceModule getMax;
        public PinChallengeModule getMin;
        public PrepareException.AnonymousClass1 length;
        public AuthenticationModule setMax;
        public LogoutModule setMin;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class equals implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMax;

        equals(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMax;

        values(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.setMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.setMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<GriverLogger> {
        private final PrepareException.AnonymousClass1 setMin;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverLogger Mean$Arithmetic = this.setMin.Mean$Arithmetic();
            if (Mean$Arithmetic != null) {
                return Mean$Arithmetic;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 setMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.setMin.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.length.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<success> {
        private final PrepareException.AnonymousClass1 getMin;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            success MediaMetadataCompat$TextKey = this.getMin.MediaMetadataCompat$TextKey();
            if (MediaMetadataCompat$TextKey != null) {
                return MediaMetadataCompat$TextKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<getCursiveFontFamily> {
        private final PrepareException.AnonymousClass1 setMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCursiveFontFamily onExtraCallback = this.setMin.onExtraCallback();
            if (onExtraCallback != null) {
                return onExtraCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<UpdateAppCallback> {
        private final PrepareException.AnonymousClass1 setMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            UpdateAppCallback onRepeatModeChanged = this.setMax.onRepeatModeChanged();
            if (onRepeatModeChanged != null) {
                return onRepeatModeChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invoke implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 length;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.length.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<GriverSplashFragmentExtension> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverSplashFragmentExtension MediaDescriptionCompat = this.setMax.MediaDescriptionCompat();
            if (MediaDescriptionCompat != null) {
                return MediaDescriptionCompat;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<GriverFileAbilityImpl> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverFileAbilityImpl RatingCompat = this.setMax.RatingCompat();
            if (RatingCompat != null) {
                return RatingCompat;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<onGeolocationPermissionsHidePrompt> {
        private final PrepareException.AnonymousClass1 getMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            onGeolocationPermissionsHidePrompt onVolumeInfoChanged = this.getMin.onVolumeInfoChanged();
            if (onVolumeInfoChanged != null) {
                return onVolumeInfoChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(challengePinWithFaceActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub2 = this.getMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub2 != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub2;
                appxLoadFailed length2 = this.getMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals2 = this.getMax.updateVisuals();
                        if (updateVisuals2 != null) {
                            matchInfo.length(challengePinWithFaceActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            clearAllTables.setMin(challengePinWithFaceActivity, this.values.get());
                            getShortName ITrustedWebActivityCallback$Default = this.getMax.ITrustedWebActivityCallback$Default();
                            if (ITrustedWebActivityCallback$Default != null) {
                                clearAllTables.getMax(challengePinWithFaceActivity, ITrustedWebActivityCallback$Default);
                                clearAllTables.getMin(challengePinWithFaceActivity, this.getCause.get());
                                clearAllTables.setMax(challengePinWithFaceActivity, this.ICustomTabsService$Stub.get());
                                return;
                            }
                            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                        }
                        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
