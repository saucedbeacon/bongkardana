package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.AnnouncementModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.richview.BannerView;
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
import o.onLeftHiddenState;
import o.style;

public final class RVResourceEnviromentProxy implements StepInterceptor {
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> FastBitmap$CoordinateSystem;
    private b.C0007b<R.styleable> Grayscale$Algorithm;
    private b.C0007b<DataProviderException> ICustomTabsCallback;
    private b.C0007b<addChooseImageCrossOrigin> ICustomTabsCallback$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Stub;
    private b.C0007b<updateFootState> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getScanJobRuntimeMillis> ICustomTabsService;
    private b.C0007b<toUuidString> ICustomTabsService$Default;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsService$Stub;
    private b.C0007b<parseBatteryPercentage> ICustomTabsService$Stub$Proxy;
    private b.C0007b<onAnimationEnd.length> INotificationSideChannel;
    private b.C0007b<Region$1> INotificationSideChannel$Default;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Stub;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<getUniqueId> IPostMessageService;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IPostMessageService$Default;
    private b.C0007b<GetAuthCode> IPostMessageService$Stub;
    private b.C0007b<enableBackButton> IPostMessageService$Stub$Proxy;
    private b.C0007b<setEpicenterCallback> ITrustedWebActivityCallback;
    private b.C0007b<getTargets> ITrustedWebActivityCallback$Default;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getCommonResources> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityService;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Default;
    private b.C0007b<getPlatformCallback> ITrustedWebActivityService$Stub;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<toByteArray> IconCompatParcelizer;
    private b.C0007b<R.id.length> IsOverlapping;
    private b.C0007b<R.id.getMax> Mean$Arithmetic;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<BindInt> MediaDescriptionCompat;
    private b.C0007b<setStartDelay> MediaMetadataCompat;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$BitmapKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$LongKey;
    private b.C0007b<getDuration.length> MediaMetadataCompat$TextKey;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> RemoteActionCompatParcelizer;
    private b.C0007b<getAllInstallFiles> areNotificationsEnabled;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> asBinder;
    private b.C0007b<H5Utils> asInterface;
    private b.C0007b<OnItemLongClick> b;
    private b.C0007b<onWebViewDestory> cancel;
    private b.C0007b<onConnect> cancelAll;
    private b.C0007b<shouldShowRevokeOpenAuthItem> cancelNotification;
    private b.C0007b<BindView.setMax> create;
    private b.C0007b<appxLoadFailed> equals;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> extraCallback;
    private b.C0007b<setBackButton> extraCallbackWithResult;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> extraCommand;
    private b.C0007b<notifyCharacteristicValue> getActiveNotifications;
    private b.C0007b<OnFocusChange> getCause;
    private b.C0007b<setInitTextColor> getDefaultImpl;
    private b.C0007b<getEpicenter> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<method> getMin;
    private b.C0007b<KitUtils> getSmallIconBitmap;
    private b.C0007b<checkBitmap> getSmallIconId;
    private b.C0007b<setDefaultFontSize> hashCode;
    private b.C0007b<requestAppWithAppId> invoke;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> invokeSuspend;
    private b.C0007b<GriverPrepareInterceptor> isInside;
    private b.C0007b<Context> length;
    private b.C0007b<setSceneRoot> mayLaunchUrl;
    private b.C0007b<canGoBackOrForward> newSession;
    private b.C0007b<getPropagation> newSessionWithExtras;
    private b.C0007b<style.getMin> notify;
    private b.C0007b<GriverCreatePromptParam> notifyNotificationWithChannel;
    private b.C0007b<getBlockNetworkImage> onExtraCallback;
    private b.C0007b<setPageCacheCapacity> onMessageChannelReady;
    private b.C0007b<AndroidModel> onNavigationEvent;
    private b.C0007b<MovableFrameLayout> onPostMessage;
    private b.C0007b<BindView.setMin> onRelationshipValidationResult;
    private b.C0007b<onJsBeforeUnload> onTransact;
    private b.C0007b<getCancelable> postMessage;
    private b.C0007b<didExitRegion> read;
    private b.C0007b<getRunningAnimators.getMin> receiveFile;
    private b.C0007b<getTransitionValues> requestPostMessageChannel;
    private b.C0007b<queryAppInfo> requestPostMessageChannelWithExtras;
    private b.C0007b<applySettingsToScheduledJob> setDefaultImpl;
    private b.C0007b<Activity> setMax;
    private final AnnouncementModule setMin;
    private b.C0007b<getPerformanceTracker> toDoubleRange;
    private b.C0007b<ResourceProviderExtension> toFloatRange;
    private b.C0007b<getScheme> toIntRange;
    private b.C0007b<getTinyLocalStorageInfo> toString;
    private b.C0007b<isTransitionRequired> updateVisuals;
    private b.C0007b<getMode> validateRelationship;
    private b.C0007b<onDescriptorWrite> valueOf;
    private b.C0007b<setDataRequestNotifier> values;
    private b.C0007b<setNetworkAvailable> warmup;
    private b.C0007b<onCharacteristicChanged> write;

    public /* synthetic */ RVResourceEnviromentProxy(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, AnnouncementModule announcementModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, announcementModule, r8);
    }

    private RVResourceEnviromentProxy(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, AnnouncementModule announcementModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.setMin = announcementModule;
        this.getMax = r6;
        this.length = new length(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.setMax = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.getMin = min2;
        this.IsOverlapping = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.equals = new valueOf(r6);
        this.toIntRange = new hashCode(r6);
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.isInside = todoublerange;
        this.toFloatRange = GriverPrepareInterceptor.AnonymousClass2.create(this.equals, this.toIntRange, todoublerange);
        this.FastBitmap$CoordinateSystem = beforeQuery.create(this.equals, this.toIntRange, this.isInside);
        this.toString = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toDoubleRange = new toFloatRange(r6);
        toIntRange tointrange = new toIntRange(r6);
        this.hashCode = tointrange;
        this.values = getDataRequestNotifier.create(tointrange);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.valueOf = onnavigationevent;
        this.invokeSuspend = onCharacteristicWrite.create(onnavigationevent, this.equals, this.toIntRange);
        localIdToBytes create2 = localIdToBytes.create(this.isInside);
        this.invoke = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.length, this.IsOverlapping, this.toFloatRange, this.FastBitmap$CoordinateSystem, this.toString, this.toDoubleRange, this.values, this.invokeSuspend, create2));
        this.Grayscale$Algorithm = min3;
        this.Mean$Arithmetic = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.b = min4;
        this.create = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invoke invoke2 = new invoke(r6);
        this.onNavigationEvent = invoke2;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.equals, this.toIntRange, invoke2);
        this.ICustomTabsCallback = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.create, create3));
        this.getCause = min5;
        this.onRelationshipValidationResult = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        toString tostring = new toString(r6);
        this.extraCallback = tostring;
        this.onPostMessage = GriverBizManifest.create(this.equals, this.toIntRange, tostring);
        this.onMessageChannelReady = APWebSettings.PluginState.create(this.hashCode);
        this.extraCallbackWithResult = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.asBinder = isOverlapping;
        this.onTransact = onConsoleMessage.create(this.equals, this.toIntRange, isOverlapping);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.asInterface = invokesuspend;
        this.ICustomTabsCallback$Default = H5ResourceCORSUtil.AnonymousClass1.create(this.equals, this.toIntRange, invokesuspend);
        isInside isinside = new isInside(r6);
        this.ICustomTabsCallback$Stub = isinside;
        this.getInterfaceDescriptor = capturePropagationValues.getMin(this.ICustomTabsCallback$Default, isinside);
        RVResourceEnviromentProxy$Mean$Arithmetic rVResourceEnviromentProxy$Mean$Arithmetic = new RVResourceEnviromentProxy$Mean$Arithmetic(r6);
        this.ICustomTabsService = rVResourceEnviromentProxy$Mean$Arithmetic;
        this.setDefaultImpl = ScanState.create(this.equals, this.toIntRange, rVResourceEnviromentProxy$Mean$Arithmetic);
        this.getDefaultImpl = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.getDefaultImpl);
        this.ICustomTabsCallback$Stub$Proxy = length2;
        this.mayLaunchUrl = Transition.MatchOrder.length(this.setDefaultImpl, length2);
        this.newSession = setInitialScale.create(this.equals, this.toIntRange, this.hashCode);
        postUrl create4 = postUrl.create(this.equals, this.toIntRange, this.hashCode);
        this.warmup = create4;
        this.newSessionWithExtras = getName.setMin(this.newSession, create4, manuallyReleaseCamera.setMax());
        RVResourceEnviromentProxy$FastBitmap$CoordinateSystem rVResourceEnviromentProxy$FastBitmap$CoordinateSystem = new RVResourceEnviromentProxy$FastBitmap$CoordinateSystem(r6);
        this.extraCommand = rVResourceEnviromentProxy$FastBitmap$CoordinateSystem;
        saveAppInfos create5 = saveAppInfos.create(rVResourceEnviromentProxy$FastBitmap$CoordinateSystem);
        this.requestPostMessageChannelWithExtras = create5;
        this.requestPostMessageChannel = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.updateVisuals = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.length));
        this.postMessage = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.onPostMessage, this.onMessageChannelReady, this.extraCallbackWithResult, this.onTransact, this.getInterfaceDescriptor, this.mayLaunchUrl, this.newSessionWithExtras, this.requestPostMessageChannel, this.updateVisuals, min6, this.values));
        this.validateRelationship = min7;
        this.receiveFile = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        values values2 = new values(r6);
        this.ICustomTabsService$Default = values2;
        this.IPostMessageService = didRangeBeaconsInRegion.create(this.equals, this.toIntRange, values2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.length);
        this.ICustomTabsService$Stub = max;
        this.ICustomTabsService$Stub$Proxy = getSystemInfo.setMax(max);
        getMin getmin = new getMin(r6);
        this.IPostMessageService$Stub$Proxy = getmin;
        setOptionMenu create6 = setOptionMenu.create(getmin);
        this.IPostMessageService$Stub = create6;
        this.ITrustedWebActivityCallback = isScrap.getMin(setPropagation.length(this.receiveFile, this.IPostMessageService, this.ICustomTabsService$Stub$Proxy, create6, this.toDoubleRange));
        this.onExtraCallback = getLoadsImagesAutomatically.create(this.equals, this.toIntRange, this.hashCode);
        this.IPostMessageService$Default = setWebContentsDebuggingEnabled.create(this.hashCode);
        installPathExist create7 = installPathExist.create(this.hashCode);
        this.areNotificationsEnabled = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.receiveFile, this.ITrustedWebActivityCallback, this.onExtraCallback, this.IPostMessageService$Default, create7));
        this.ITrustedWebActivityCallback$Default = min8;
        this.ITrustedWebActivityService = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        setMin setmin = new setMin(r6);
        this.ITrustedWebActivityCallback$Stub$Proxy = setmin;
        this.cancelNotification = GriverOpenAuthExtension.create(setmin);
        this.getActiveNotifications = BLEManager.AnonymousClass2.create(this.equals, this.toIntRange, this.valueOf);
        this.notifyNotificationWithChannel = GriverDialogExtension.create(this.equals, this.toIntRange, this.ITrustedWebActivityCallback$Stub$Proxy);
        this.getSmallIconBitmap = checkSuffixSupported.create(this.hashCode);
        this.getSmallIconId = isImage.create(this.hashCode);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Stub, startListenScreenshot.setMin(), this.cancelNotification, this.getActiveNotifications, this.notifyNotificationWithChannel, this.getSmallIconBitmap, this.getSmallIconId);
        this.ITrustedWebActivityService$Stub = max2;
        this.INotificationSideChannel = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.notify = BindFont.length(servicesModule);
        create create8 = new create(r6);
        this.ITrustedWebActivityService$Stub$Proxy = create8;
        this.ITrustedWebActivityService$Default = onStartBleScan.create(this.equals, this.toIntRange, create8);
        this.cancelAll = onGetBluetoothCharacteristics.create(this.equals, this.toIntRange, this.ITrustedWebActivityService$Stub$Proxy);
        equals equals2 = new equals(r6);
        this.cancel = equals2;
        this.INotificationSideChannel$Stub = matchesBeacon.create(this.ICustomTabsService$Default, equals2);
        this.INotificationSideChannel$Default = validateMac.create(this.equals, this.toIntRange, this.ICustomTabsService$Default);
        this.INotificationSideChannel$Stub$Proxy = IntentHandler.create(this.equals, this.toIntRange, this.ICustomTabsService$Default, this.cancel);
        this.IconCompatParcelizer = toUuid.create(this.hashCode);
        this.read = didDetermineStateForRegion.create(this.ICustomTabsService$Default);
        RVResourceEnviromentProxy$Grayscale$Algorithm rVResourceEnviromentProxy$Grayscale$Algorithm = new RVResourceEnviromentProxy$Grayscale$Algorithm(r6);
        this.write = rVResourceEnviromentProxy$Grayscale$Algorithm;
        this.RemoteActionCompatParcelizer = BLEManager.AnonymousClass3.create(rVResourceEnviromentProxy$Grayscale$Algorithm);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.write);
        this.MediaBrowserCompat$CustomActionResultReceiver = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.length, this.notify, this.IPostMessageService$Stub, this.ICustomTabsService$Stub$Proxy, this.ITrustedWebActivityService$Default, this.cancelAll, this.INotificationSideChannel$Stub, this.INotificationSideChannel$Default, this.IPostMessageService, this.INotificationSideChannel$Stub$Proxy, this.IconCompatParcelizer, this.read, this.RemoteActionCompatParcelizer, create9));
        this.MediaDescriptionCompat = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.Mean$Arithmetic, this.onRelationshipValidationResult, this.ITrustedWebActivityService, this.INotificationSideChannel, min9));
        this.MediaBrowserCompat$ItemReceiver = min10;
        this.MediaBrowserCompat$MediaItem$Flags = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        setMax setmax = new setMax(r29);
        this.MediaBrowserCompat$SearchResultReceiver = setmax;
        this.MediaBrowserCompat$MediaItem = APWebMessagePort.APWebMessageCallback.create(this.equals, this.toIntRange, setmax);
        this.MediaMetadataCompat$BitmapKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.equals, this.toIntRange, this.ITrustedWebActivityCallback$Stub$Proxy);
        this.MediaMetadataCompat$LongKey = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$MediaItem$Flags, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat$BitmapKey, create10));
        this.MediaMetadataCompat = min11;
        this.MediaMetadataCompat$TextKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class getMax {
        public AnnouncementModule IsOverlapping;
        public FeatureModule getMax;
        public RestoreUrlModule getMin;
        public ServicesModule isInside;
        public DeepLinkModule length;
        public ScanQrModule setMax;
        public OauthModule setMin;
        public PrepareException.AnonymousClass1 toFloatRange;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        length(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMin;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 setMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.setMin.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem != null) {
                return FastBitmap$CoordinateSystem;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.getMin.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class onNavigationEvent implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMin;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.getMin.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invoke implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 length;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        toString(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.length.ICustomTabsService();
            if (ICustomTabsService != null) {
                return ICustomTabsService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 getMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.getMin.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 getMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.getMin.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getAppPerfKey ICustomTabsService$Stub$Proxy = this.setMax.ICustomTabsService$Stub$Proxy();
            if (ICustomTabsService$Stub$Proxy != null) {
                return ICustomTabsService$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 length;

        values(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.length.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 getMax;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.getMax.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMax;

        create(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.setMax.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMax;

        equals(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.getMax.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
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

    public final void getMax(BannerView bannerView) {
        access$3100.setMax(bannerView, this.MediaMetadataCompat$TextKey.get());
        access$3100.setMin(bannerView, this.Mean$Arithmetic.get());
        access$3100.length(bannerView, this.onRelationshipValidationResult.get());
        access$3100.getMax(bannerView, this.ITrustedWebActivityService.get());
        AnnouncementModule announcementModule = this.setMin;
        onLeftHiddenState.getMin min = parseFeatures.setMin(this.setMin);
        toolbarMenuClicked cause = this.getMax.getCause();
        if (cause != null) {
            access$3100.getMax(bannerView, serialzeFeatures.setMax(announcementModule, new getItemDelegate(min, new getMenus(cause))));
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
