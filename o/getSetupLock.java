package o;

import android.app.Activity;
import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.notification.NotificationActivity;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverPrepareInterceptor;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.Transition;
import o.b;
import o.getDuration;
import o.getRunningAnimators;
import o.onAnimationEnd;
import o.style;

public final class getSetupLock implements createSocketSession {
    private b.C0007b<getTinyLocalStorageInfo> FastBitmap$CoordinateSystem;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> Grayscale$Algorithm;
    private b.C0007b<AndroidModel> ICustomTabsCallback;
    private b.C0007b<addChooseImageCrossOrigin> ICustomTabsCallback$Default;
    private b.C0007b<getEpicenter> ICustomTabsCallback$Stub;
    private b.C0007b<applySettingsToScheduledJob> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<updateFootState> ICustomTabsService;
    private b.C0007b<getUniqueId> ICustomTabsService$Default;
    private b.C0007b<toUuidString> ICustomTabsService$Stub;
    private b.C0007b<enableBackButton> ICustomTabsService$Stub$Proxy;
    private b.C0007b<style.getMin> INotificationSideChannel;
    private b.C0007b<toByteArray> INotificationSideChannel$Default;
    private b.C0007b<Region$1> INotificationSideChannel$Stub;
    private b.C0007b<onWebViewDestory> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<OrientationDetector.OrientationListener> IPostMessageService;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IPostMessageService$Default;
    private b.C0007b<getAllInstallFiles> IPostMessageService$Stub;
    private b.C0007b<getBlockNetworkImage> IPostMessageService$Stub$Proxy;
    private b.C0007b<setEpicenterCallback> ITrustedWebActivityCallback;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Default;
    private b.C0007b<getCommonResources> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<shouldShowRevokeOpenAuthItem> ITrustedWebActivityService;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Default;
    private b.C0007b<onAnimationEnd.length> ITrustedWebActivityService$Stub;
    private b.C0007b<onConnect> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> IconCompatParcelizer;
    private b.C0007b<GriverPrepareInterceptor> IsOverlapping;
    private b.C0007b<R.styleable> Mean$Arithmetic;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<setSupportZoom> MediaDescriptionCompat;
    private b.C0007b<getDuration.length> MediaMetadataCompat;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$LongKey;
    private b.C0007b<setStartDelay> MediaMetadataCompat$RatingKey;
    private b.C0007b<onCharacteristicChanged> RemoteActionCompatParcelizer;
    private b.C0007b<getTargets> areNotificationsEnabled;
    private b.C0007b<getAppPerfKey> asBinder;
    private b.C0007b<onJsBeforeUnload> asInterface;
    private b.C0007b<BindView.setMin> b;
    private b.C0007b<convertIntentsToCallbacks> cancel;
    private b.C0007b<hasSameIdentifiers> cancelAll;
    private b.C0007b<GriverCreatePromptParam> cancelNotification;
    private b.C0007b<OnFocusChange> create;
    private b.C0007b<getScheme> equals;
    private b.C0007b<MovableFrameLayout> extraCallback;
    private b.C0007b<setBackButton> extraCallbackWithResult;
    private b.C0007b<queryAppInfo> extraCommand;
    private b.C0007b<checkBitmap> getActiveNotifications;
    private b.C0007b<DataProviderException> getCause;
    private b.C0007b<getScanJobRuntimeMillis> getDefaultImpl;
    private b.C0007b<setInitTextColor> getInterfaceDescriptor;
    private b.C0007b<method> getMax;
    private b.C0007b<Activity> getMin;
    private b.C0007b<KitUtils> getSmallIconBitmap;
    private b.C0007b<notifyCharacteristicValue> getSmallIconId;
    private b.C0007b<setDataRequestNotifier> hashCode;
    private b.C0007b<requestAppWithAppId> invoke;
    private b.C0007b<R.id.getMax> invokeSuspend;
    private b.C0007b<appxLoadFailed> isInside;
    private b.C0007b<R.id.length> length;
    private b.C0007b<getPropagation> mayLaunchUrl;
    private b.C0007b<canGoBackOrForward> newSession;
    private b.C0007b<setNetworkAvailable> newSessionWithExtras;
    private b.C0007b<onDisconnect> notify;
    private b.C0007b<getPlatformCallback> notifyNotificationWithChannel;
    private b.C0007b<GetAuthCode> onExtraCallback;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> onMessageChannelReady;
    private b.C0007b<BindView.setMax> onNavigationEvent;
    private b.C0007b<setPageCacheCapacity> onPostMessage;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onRelationshipValidationResult;
    private b.C0007b<H5Utils> onTransact;
    private b.C0007b<getCancelable> postMessage;
    private b.C0007b<didExitRegion> read;
    private b.C0007b<parseBatteryPercentage> receiveFile;
    private b.C0007b<getTransitionValues> requestPostMessageChannel;
    private b.C0007b<isTransitionRequired> requestPostMessageChannelWithExtras;
    private b.C0007b<setSceneRoot> setDefaultImpl;
    private b.C0007b<Context> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<getPerformanceTracker> toDoubleRange;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> toFloatRange;
    private b.C0007b<ResourceProviderExtension> toIntRange;
    private b.C0007b<onDescriptorWrite> toString;
    private b.C0007b<getMode> updateVisuals;
    private b.C0007b<getRunningAnimators.getMin> validateRelationship;
    private b.C0007b<OnItemLongClick> valueOf;
    private b.C0007b<setDefaultFontSize> values;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> warmup;
    private b.C0007b<BindInt> write;

    public /* synthetic */ getSetupLock(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r7, byte b2) {
        this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r7);
    }

    private getSetupLock(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r28) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r28;
        this.setMin = r6;
        this.setMax = new length(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.getMin = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.getMax = min2;
        this.length = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.isInside = new valueOf(r6);
        this.equals = new getSetupLock$FastBitmap$CoordinateSystem(r6);
        toString tostring = new toString(r6);
        this.IsOverlapping = tostring;
        this.toIntRange = GriverPrepareInterceptor.AnonymousClass2.create(this.isInside, this.equals, tostring);
        this.toFloatRange = beforeQuery.create(this.isInside, this.equals, this.IsOverlapping);
        this.FastBitmap$CoordinateSystem = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toDoubleRange = new IsOverlapping(r6);
        isInside isinside = new isInside(r6);
        this.values = isinside;
        this.hashCode = getDataRequestNotifier.create(isinside);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.toString = iCustomTabsCallback;
        this.Grayscale$Algorithm = onCharacteristicWrite.create(iCustomTabsCallback, this.isInside, this.equals);
        localIdToBytes create2 = localIdToBytes.create(this.IsOverlapping);
        this.invoke = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.setMax, this.length, this.toIntRange, this.toFloatRange, this.FastBitmap$CoordinateSystem, this.toDoubleRange, this.hashCode, this.Grayscale$Algorithm, create2));
        this.Mean$Arithmetic = min3;
        this.invokeSuspend = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.valueOf = min4;
        this.onNavigationEvent = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.ICustomTabsCallback = invokesuspend;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.isInside, this.equals, invokesuspend);
        this.getCause = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.onNavigationEvent, create3));
        this.create = min5;
        this.b = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.onRelationshipValidationResult = todoublerange;
        this.extraCallback = GriverBizManifest.create(this.isInside, this.equals, todoublerange);
        this.onPostMessage = APWebSettings.PluginState.create(this.values);
        this.extraCallbackWithResult = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        equals equals2 = new equals(r6);
        this.onMessageChannelReady = equals2;
        this.asInterface = onConsoleMessage.create(this.isInside, this.equals, equals2);
        invoke invoke2 = new invoke(r6);
        this.onTransact = invoke2;
        this.ICustomTabsCallback$Default = H5ResourceCORSUtil.AnonymousClass1.create(this.isInside, this.equals, invoke2);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.asBinder = tofloatrange;
        this.ICustomTabsCallback$Stub = capturePropagationValues.getMin(this.ICustomTabsCallback$Default, tofloatrange);
        getSetupLock$Mean$Arithmetic getsetuplock_mean_arithmetic = new getSetupLock$Mean$Arithmetic(r6);
        this.getDefaultImpl = getsetuplock_mean_arithmetic;
        this.ICustomTabsCallback$Stub$Proxy = ScanState.create(this.isInside, this.equals, getsetuplock_mean_arithmetic);
        this.getInterfaceDescriptor = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.getInterfaceDescriptor);
        this.ICustomTabsService = length2;
        this.setDefaultImpl = Transition.MatchOrder.length(this.ICustomTabsCallback$Stub$Proxy, length2);
        this.newSession = setInitialScale.create(this.isInside, this.equals, this.values);
        postUrl create4 = postUrl.create(this.isInside, this.equals, this.values);
        this.newSessionWithExtras = create4;
        this.mayLaunchUrl = getName.setMin(this.newSession, create4, manuallyReleaseCamera.setMax());
        values values2 = new values(r6);
        this.warmup = values2;
        saveAppInfos create5 = saveAppInfos.create(values2);
        this.extraCommand = create5;
        this.requestPostMessageChannel = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.requestPostMessageChannelWithExtras = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.setMax));
        this.postMessage = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.extraCallback, this.onPostMessage, this.extraCallbackWithResult, this.asInterface, this.ICustomTabsCallback$Stub, this.setDefaultImpl, this.mayLaunchUrl, this.requestPostMessageChannel, this.requestPostMessageChannelWithExtras, min6, this.hashCode));
        this.updateVisuals = min7;
        this.validateRelationship = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        hashCode hashcode = new hashCode(r6);
        this.ICustomTabsService$Stub = hashcode;
        this.ICustomTabsService$Default = didRangeBeaconsInRegion.create(this.isInside, this.equals, hashcode);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.setMax);
        this.IPostMessageService = max;
        this.receiveFile = getSystemInfo.setMax(max);
        setMax setmax = new setMax(r6);
        this.ICustomTabsService$Stub$Proxy = setmax;
        setOptionMenu create6 = setOptionMenu.create(setmax);
        this.onExtraCallback = create6;
        this.ITrustedWebActivityCallback = isScrap.getMin(setPropagation.length(this.validateRelationship, this.ICustomTabsService$Default, this.receiveFile, create6, this.toDoubleRange));
        this.IPostMessageService$Stub$Proxy = getLoadsImagesAutomatically.create(this.isInside, this.equals, this.values);
        this.IPostMessageService$Default = setWebContentsDebuggingEnabled.create(this.values);
        installPathExist create7 = installPathExist.create(this.values);
        this.IPostMessageService$Stub = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.validateRelationship, this.ITrustedWebActivityCallback, this.IPostMessageService$Stub$Proxy, this.IPostMessageService$Default, create7));
        this.areNotificationsEnabled = min8;
        this.ITrustedWebActivityCallback$Stub$Proxy = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityCallback$Default = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMax getmax = new getMax(r6);
        this.ITrustedWebActivityCallback$Stub = getmax;
        this.ITrustedWebActivityService = GriverOpenAuthExtension.create(getmax);
        this.getSmallIconId = BLEManager.AnonymousClass2.create(this.isInside, this.equals, this.toString);
        this.cancelNotification = GriverDialogExtension.create(this.isInside, this.equals, this.ITrustedWebActivityCallback$Stub);
        this.getSmallIconBitmap = checkSuffixSupported.create(this.values);
        this.getActiveNotifications = isImage.create(this.values);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Default, startListenScreenshot.setMin(), this.ITrustedWebActivityService, this.getSmallIconId, this.cancelNotification, this.getSmallIconBitmap, this.getActiveNotifications);
        this.notifyNotificationWithChannel = max2;
        this.ITrustedWebActivityService$Stub = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.INotificationSideChannel = BindFont.length(servicesModule);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.notify = onnavigationevent;
        this.ITrustedWebActivityService$Default = onStartBleScan.create(this.isInside, this.equals, onnavigationevent);
        this.ITrustedWebActivityService$Stub$Proxy = onGetBluetoothCharacteristics.create(this.isInside, this.equals, this.notify);
        toIntRange tointrange = new toIntRange(r6);
        this.INotificationSideChannel$Stub$Proxy = tointrange;
        this.cancelAll = matchesBeacon.create(this.ICustomTabsService$Stub, tointrange);
        this.INotificationSideChannel$Stub = validateMac.create(this.isInside, this.equals, this.ICustomTabsService$Stub);
        this.cancel = IntentHandler.create(this.isInside, this.equals, this.ICustomTabsService$Stub, this.INotificationSideChannel$Stub$Proxy);
        this.INotificationSideChannel$Default = toUuid.create(this.values);
        this.read = didDetermineStateForRegion.create(this.ICustomTabsService$Stub);
        getSetupLock$Grayscale$Algorithm getsetuplock_grayscale_algorithm = new getSetupLock$Grayscale$Algorithm(r6);
        this.RemoteActionCompatParcelizer = getsetuplock_grayscale_algorithm;
        this.IconCompatParcelizer = BLEManager.AnonymousClass3.create(getsetuplock_grayscale_algorithm);
        BLEManager.AnonymousClass4 create8 = BLEManager.AnonymousClass4.create(this.RemoteActionCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver = create8;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.setMax, this.INotificationSideChannel, this.onExtraCallback, this.receiveFile, this.ITrustedWebActivityService$Default, this.ITrustedWebActivityService$Stub$Proxy, this.cancelAll, this.INotificationSideChannel$Stub, this.ICustomTabsService$Default, this.cancel, this.INotificationSideChannel$Default, this.read, this.IconCompatParcelizer, create8));
        this.write = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.invokeSuspend, this.b, this.ITrustedWebActivityCallback$Stub$Proxy, this.ITrustedWebActivityService$Stub, min9));
        this.MediaBrowserCompat$ItemReceiver = min10;
        this.MediaBrowserCompat$SearchResultReceiver = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        setMin setmin = new setMin(r28);
        this.MediaDescriptionCompat = setmin;
        this.MediaBrowserCompat$MediaItem = APWebMessagePort.APWebMessageCallback.create(this.isInside, this.equals, setmin);
        this.MediaBrowserCompat$MediaItem$Flags = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create9 = GVLoadingView.create(this.isInside, this.equals, this.ITrustedWebActivityCallback$Stub);
        this.MediaMetadataCompat$LongKey = create9;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$MediaItem$Flags, create9));
        this.MediaMetadataCompat$RatingKey = min11;
        this.MediaMetadataCompat = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 IsOverlapping;
        public OauthModule getMax;
        public ScanQrModule getMin;
        public DeepLinkModule length;
        public RestoreUrlModule setMax;
        public FeatureModule setMin;
        public ServicesModule toFloatRange;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.length.getMax();
            if (max != null) {
                return max;
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

    static class toString implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 getMin;

        toString(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.getMin.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem != null) {
                return FastBitmap$CoordinateSystem;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.setMin.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        isInside(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.setMin.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 length;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            AndroidModel IPostMessageService = this.length.IPostMessageService();
            if (IPostMessageService != null) {
                return IPostMessageService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.setMin.ICustomTabsService();
            if (ICustomTabsService != null) {
                return ICustomTabsService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 getMax;

        equals(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.getMax.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invoke implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 setMin;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.setMin.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 getMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getAppPerfKey ICustomTabsService$Stub$Proxy = this.getMin.ICustomTabsService$Stub$Proxy();
            if (ICustomTabsService$Stub$Proxy != null) {
                return ICustomTabsService$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        values(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.length.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.getMax.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 getMax;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.getMax.invoke();
            if (invoke != null) {
                return invoke;
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

    static class onNavigationEvent implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 length;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.length.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.getMin.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 length;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setSupportZoom ICustomTabsService$Stub = this.length.ICustomTabsService$Stub();
            if (ICustomTabsService$Stub != null) {
                return ICustomTabsService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMin(NotificationActivity notificationActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(notificationActivity, IPostMessageService$Stub$Proxy2);
            applyChanges ICustomTabsCallback$Stub2 = this.setMin.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub2 != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub2;
                appxLoadFailed length2 = this.setMin.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMin.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals2 = this.setMin.updateVisuals();
                        if (updateVisuals2 != null) {
                            matchInfo.length(notificationActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            hexStringToByteArray.setMax(notificationActivity, this.MediaMetadataCompat.get());
                            hexStringToByteArray.setMin(notificationActivity, this.b.get());
                            hexStringToByteArray.length(notificationActivity, this.invokeSuspend.get());
                            hexStringToByteArray.setMax(notificationActivity, this.ITrustedWebActivityCallback$Stub$Proxy.get());
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
}
