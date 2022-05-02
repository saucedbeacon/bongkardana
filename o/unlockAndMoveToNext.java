package o;

import android.content.Context;
import id.dana.contract.permission.PermissionStateModule;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.VerifyNumberModule;
import id.dana.onboarding.verify.VerifyNumberFragment;
import o.APWebSettings;
import o.CompassSensorService;
import o.GriverBaseManifest;
import o.GriverWebviewSetting;
import o.GyroscopeSensorService;
import o.PrepareException;
import o.ViewPager2;
import o.b;

public final class unlockAndMoveToNext implements translate {
    private b.C0007b<setDistanceCalculator> FastBitmap$CoordinateSystem;
    private b.C0007b<AccelerometerForH5SensorService> Grayscale$Algorithm;
    private b.C0007b<GriverBaseManifest> ICustomTabsCallback;
    private b.C0007b<Context> IsOverlapping;
    private b.C0007b<setWebMessageCallback> Mean$Arithmetic;
    private b.C0007b<Boolean> b;
    private b.C0007b<calculateDistance> create;
    private b.C0007b<GriverWebviewSetting.AnonymousClass1> equals;
    private b.C0007b<sendSensorResult> extraCallbackWithResult;
    private b.C0007b<APDownloadListener> getCause;
    private b.C0007b<getScheme> getMax;
    private b.C0007b<ViewPager2.OffscreenPageLimit.setMin> getMin;
    private b.C0007b<fromScanData> hashCode;
    private b.C0007b<setDomStorageEnabled> invoke;
    private b.C0007b<Embedded> invokeSuspend;
    private b.C0007b<GriverWebviewSetting> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<APHitTestResult> onMessageChannelReady;
    private b.C0007b<onPageError> onNavigationEvent;
    private b.C0007b<CompassSensorService.length> onPostMessage;
    private final PermissionStateModule setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<setDefaultFontSize> toDoubleRange;
    private b.C0007b<ViewPager2.SavedState> toFloatRange;
    private b.C0007b<dumpDir> toIntRange;
    private b.C0007b<setPageCacheCapacity> toString;
    private b.C0007b<setSupportZoom> valueOf;
    private b.C0007b<CompassSensorService.getMin> values;

    public /* synthetic */ unlockAndMoveToNext(VerifyNumberModule verifyNumberModule, PermissionStateModule permissionStateModule, AuthenticationModule authenticationModule, PrepareException.AnonymousClass1 r4, byte b2) {
        this(verifyNumberModule, permissionStateModule, authenticationModule, r4);
    }

    private unlockAndMoveToNext(VerifyNumberModule verifyNumberModule, PermissionStateModule permissionStateModule, AuthenticationModule authenticationModule, PrepareException.AnonymousClass1 r18) {
        PrepareException.AnonymousClass1 r1 = r18;
        this.setMin = r1;
        this.setMax = permissionStateModule;
        this.getMin = ViewPager2.ScrollState.getMin(permissionStateModule);
        this.length = new toIntRange(r1);
        this.getMax = new isInside(r1);
        IsOverlapping isOverlapping = new IsOverlapping(r1);
        this.equals = isOverlapping;
        this.toIntRange = getPorts.create(this.length, this.getMax, isOverlapping);
        WebViewSettingExtension create2 = WebViewSettingExtension.create(this.length, this.getMax, this.equals);
        this.isInside = create2;
        this.toFloatRange = isScrap.getMin(ArrayCreatingInputMerger.setMax(this.getMin, this.toIntRange, create2));
        this.IsOverlapping = new getMin(r1);
        this.values = isScrap.getMin(MiniProgramMetaData.getMax(verifyNumberModule));
        toFloatRange tofloatrange = new toFloatRange(r1);
        this.FastBitmap$CoordinateSystem = tofloatrange;
        this.hashCode = setRunningAverageRssi.create(tofloatrange);
        getMax getmax = new getMax(r1);
        this.toDoubleRange = getmax;
        this.toString = APWebSettings.PluginState.create(getmax);
        this.invoke = setAppCachePath.create(this.toDoubleRange);
        b.C0007b<Embedded> min = isScrap.getMin(CollectionCodec.getMax(authenticationModule));
        this.invokeSuspend = min;
        this.Grayscale$Algorithm = access$608.getMin(this.invoke, min);
        setMax setmax = new setMax(r1);
        this.valueOf = setmax;
        this.Mean$Arithmetic = hasGesture.create(setmax);
        this.b = isScrap.getMin(setExtendedInfo.setMin(verifyNumberModule));
        this.create = getHardwareEqualityEnforced.create(this.length, this.getMax, this.FastBitmap$CoordinateSystem);
        setMin setmin = new setMin(r1);
        this.ICustomTabsCallback = setmin;
        this.onNavigationEvent = APHttpAuthHandler.create(setmin);
        this.getCause = GriverBaseManifest.AnonymousClass1.create(this.length, this.getMax, this.equals);
        this.onMessageChannelReady = GriverBaseManifest.AnonymousClass2.create(this.length, this.getMax, this.equals);
        b.C0007b<sendSensorResult> min2 = isScrap.getMin(GriverOpenSettingActivity.getMax(this.IsOverlapping, this.values, this.hashCode, this.toString, this.Grayscale$Algorithm, onStatusChanged.getMax(), this.Mean$Arithmetic, this.b, this.create, this.onNavigationEvent, this.getCause, this.onMessageChannelReady));
        this.extraCallbackWithResult = min2;
        VerifyNumberModule verifyNumberModule2 = verifyNumberModule;
        this.onPostMessage = isScrap.getMin(setMiniProgramInfo.getMax(verifyNumberModule, min2));
    }

    public static final class length {
        public PermissionStateModule getMax;
        public AuthenticationModule length;
        public VerifyNumberModule setMax;
        public PrepareException.AnonymousClass1 setMin;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class toIntRange implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.setMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.length.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<GriverWebviewSetting.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWebviewSetting.AnonymousClass1 defaultImpl = this.setMin.getDefaultImpl();
            if (defaultImpl != null) {
                return defaultImpl;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class toFloatRange implements b.C0007b<setDistanceCalculator> {
        private final PrepareException.AnonymousClass1 getMax;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDistanceCalculator valueOf = this.getMax.valueOf();
            if (valueOf != null) {
                return valueOf;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.length.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 getMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setSupportZoom ICustomTabsService$Stub = this.getMax.ICustomTabsService$Stub();
            if (ICustomTabsService$Stub != null) {
                return ICustomTabsService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<GriverBaseManifest> {
        private final PrepareException.AnonymousClass1 length;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBaseManifest invokeSuspend = this.length.invokeSuspend();
            if (invokeSuspend != null) {
                return invokeSuspend;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(VerifyNumberFragment verifyNumberFragment) {
        getShortName ITrustedWebActivityCallback$Default = this.setMin.ITrustedWebActivityCallback$Default();
        if (ITrustedWebActivityCallback$Default != null) {
            GyroscopeSensorService.AnonymousClass1.setMin(verifyNumberFragment, ITrustedWebActivityCallback$Default);
            GyroscopeSensorService.AnonymousClass1.getMax(verifyNumberFragment, CoroutineWorker.setMin(this.setMax, this.toFloatRange.get()));
            isAlipayApp onExtrasChanged = this.setMin.onExtrasChanged();
            if (onExtrasChanged != null) {
                GyroscopeSensorService.AnonymousClass1.getMax(verifyNumberFragment, onExtrasChanged);
                GyroscopeSensorService.AnonymousClass1.getMax(verifyNumberFragment, this.onPostMessage.get());
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
