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
import id.dana.di.modules.MissionModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.RedeemQuestModule;
import id.dana.di.modules.RedeemUserMissionModule;
import id.dana.di.modules.TrackQuestModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.promoquest.activity.MissionDetailActivity;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverH5AppInfo;
import o.GriverPrepareInterceptor;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.RxWorker;
import o.Transition;
import o.b;
import o.getDuration;
import o.getRunningAnimators;
import o.getWorkerFactory;
import o.isUsed;
import o.onAnimationEnd;
import o.setForegroundAsync;
import o.style;

public final class AppxResourcePackage implements TemplateBridgeExtension {
    private b.C0007b<onDescriptorWrite> FastBitmap$CoordinateSystem;
    private b.C0007b<R.styleable> Grayscale$Algorithm;
    private b.C0007b<BindView.setMin> ICustomTabsCallback;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Default;
    private b.C0007b<getEpicenter> ICustomTabsCallback$Stub;
    private b.C0007b<updateFootState> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<applySettingsToScheduledJob> ICustomTabsService;
    private b.C0007b<enableBackButton> ICustomTabsService$Default;
    private b.C0007b<parseBatteryPercentage> ICustomTabsService$Stub;
    private b.C0007b<getUniqueId> ICustomTabsService$Stub$Proxy;
    private b.C0007b<OverwritingInputMerger> IMediaControllerCallback;
    private b.C0007b<onConnect> INotificationSideChannel;
    private b.C0007b<onWebViewDestory> INotificationSideChannel$Default;
    private b.C0007b<Region$1> INotificationSideChannel$Stub;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<OrientationDetector.OrientationListener> IPostMessageService;
    private b.C0007b<setEpicenterCallback> IPostMessageService$Default;
    private b.C0007b<GetAuthCode> IPostMessageService$Stub;
    private b.C0007b<getBlockNetworkImage> IPostMessageService$Stub$Proxy;
    private b.C0007b<getAllInstallFiles> ITrustedWebActivityCallback;
    private b.C0007b<getTargets> ITrustedWebActivityCallback$Default;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getCommonResources> ITrustedWebActivityService;
    private b.C0007b<onAnimationEnd.length> ITrustedWebActivityService$Default;
    private b.C0007b<style.getMin> ITrustedWebActivityService$Stub;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> IconCompatParcelizer;
    private b.C0007b<GriverPrepareInterceptor> IsOverlapping;
    private b.C0007b<requestAppWithAppId> Mean$Arithmetic;
    private b.C0007b<onCharacteristicChanged> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem;
    private b.C0007b<getPath> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaDescriptionCompat;
    private b.C0007b<setStartDelay> MediaMetadataCompat;
    private b.C0007b<getDuration.length> MediaMetadataCompat$BitmapKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$LongKey;
    private b.C0007b<getWorkerFactory.length> MediaMetadataCompat$RatingKey;
    private b.C0007b<setGriverAppStorageProxy> MediaMetadataCompat$TextKey;
    private b.C0007b<doWork> RatingCompat;
    private b.C0007b<RxWorker.getMin> RatingCompat$StarStyle;
    private b.C0007b<getWorkerFactory.setMax> RatingCompat$Style;
    private b.C0007b<BindInt> RemoteActionCompatParcelizer;
    private b.C0007b<shouldShowRevokeOpenAuthItem> areNotificationsEnabled;
    private b.C0007b<onJsBeforeUnload> asBinder;
    private b.C0007b<addChooseImageCrossOrigin> asInterface;
    private b.C0007b<BindView.setMax> b;
    private b.C0007b<toByteArray> cancel;
    private b.C0007b<convertIntentsToCallbacks> cancelAll;
    private b.C0007b<GriverCreatePromptParam> cancelNotification;
    private b.C0007b<DataProviderException> create;
    private b.C0007b<getScheme> equals;
    private b.C0007b<setBackButton> extraCallback;
    private b.C0007b<MovableFrameLayout> extraCallbackWithResult;
    private b.C0007b<queryAppInfo> extraCommand;
    private b.C0007b<KitUtils> getActiveNotifications;
    private b.C0007b<OnFocusChange> getCause;
    private b.C0007b<getScanJobRuntimeMillis> getDefaultImpl;
    private b.C0007b<setInitTextColor> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<Activity> getMin;
    private b.C0007b<checkBitmap> getSmallIconBitmap;
    private b.C0007b<getPlatformCallback> getSmallIconId;
    private b.C0007b<setDataRequestNotifier> hashCode;
    private b.C0007b<R.id.getMax> invoke;
    private b.C0007b<OnItemLongClick> invokeSuspend;
    private b.C0007b<ResourceProviderExtension> isInside;
    private b.C0007b<method> length;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> mayLaunchUrl;
    private b.C0007b<canGoBackOrForward> newSession;
    private b.C0007b<setNetworkAvailable> newSessionWithExtras;
    private b.C0007b<onDisconnect> notify;
    private b.C0007b<notifyCharacteristicValue> notifyNotificationWithChannel;
    private b.C0007b<queryAppInfos> onEvent;
    private b.C0007b<APWebSettings.LayoutAlgorithm> onExtraCallback;
    private b.C0007b<getTaskExecutor> onExtrasChanged;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onMessageChannelReady;
    private b.C0007b<startWork> onMetadataChanged;
    private b.C0007b<AndroidModel> onNavigationEvent;
    private b.C0007b<freeMemory> onPlaybackStateChanged;
    private b.C0007b<setPageCacheCapacity> onPostMessage;
    private b.C0007b<setForegroundAsync.length> onQueueChanged;
    private b.C0007b<setForegroundAsync.getMin> onQueueTitleChanged;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> onRelationshipValidationResult;
    private b.C0007b<getTableName> onRepeatModeChanged;
    private b.C0007b<RxWorker.setMin> onSessionDestroyed;
    private b.C0007b<isUsed.getMax> onShuffleModeChangedRemoved;
    private b.C0007b<H5Utils> onTransact;
    private b.C0007b<isUsed.length> onVolumeInfoChanged;
    private b.C0007b<isTransitionRequired> postMessage;
    private b.C0007b<didExitRegion> read;
    private b.C0007b<toUuidString> receiveFile;
    private b.C0007b<getRunningAnimators.getMin> requestPostMessageChannel;
    private b.C0007b<getTransitionValues> requestPostMessageChannelWithExtras;
    private b.C0007b<setSceneRoot> setDefaultImpl;
    private b.C0007b<Context> setMax;
    private b.C0007b<R.id.length> setMin;
    private b.C0007b<getPerformanceTracker> toDoubleRange;
    private b.C0007b<appxLoadFailed> toFloatRange;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> toIntRange;
    private b.C0007b<setDefaultFontSize> toString;
    private b.C0007b<getCancelable> updateVisuals;
    private b.C0007b<getMode> validateRelationship;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> valueOf;
    private b.C0007b<getTinyLocalStorageInfo> values;
    private b.C0007b<getPropagation> warmup;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> write;

    public /* synthetic */ AppxResourcePackage(MissionModule missionModule, RedeemQuestModule redeemQuestModule, TrackQuestModule trackQuestModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, RedeemUserMissionModule redeemUserMissionModule, PrepareException.AnonymousClass1 r11, byte b2) {
        this(missionModule, redeemQuestModule, trackQuestModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, redeemUserMissionModule, r11);
    }

    private AppxResourcePackage(MissionModule missionModule, RedeemQuestModule redeemQuestModule, TrackQuestModule trackQuestModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, RedeemUserMissionModule redeemUserMissionModule, PrepareException.AnonymousClass1 r32) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r32;
        this.getMax = r6;
        this.setMax = new length(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.getMin = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.length = min2;
        this.setMin = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toFloatRange = new AppxResourcePackage$Mean$Arithmetic(r6);
        this.equals = new hashCode(r6);
        AppxResourcePackage$FastBitmap$CoordinateSystem appxResourcePackage$FastBitmap$CoordinateSystem = new AppxResourcePackage$FastBitmap$CoordinateSystem(r6);
        this.IsOverlapping = appxResourcePackage$FastBitmap$CoordinateSystem;
        this.isInside = GriverPrepareInterceptor.AnonymousClass2.create(this.toFloatRange, this.equals, appxResourcePackage$FastBitmap$CoordinateSystem);
        this.toIntRange = beforeQuery.create(this.toFloatRange, this.equals, this.IsOverlapping);
        this.values = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toDoubleRange = new isInside(r6);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.toString = tofloatrange;
        this.hashCode = getDataRequestNotifier.create(tofloatrange);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.FastBitmap$CoordinateSystem = onnavigationevent;
        this.valueOf = onCharacteristicWrite.create(onnavigationevent, this.toFloatRange, this.equals);
        localIdToBytes create2 = localIdToBytes.create(this.IsOverlapping);
        this.Mean$Arithmetic = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.setMax, this.setMin, this.isInside, this.toIntRange, this.values, this.toDoubleRange, this.hashCode, this.valueOf, create2));
        this.Grayscale$Algorithm = min3;
        this.invoke = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.invokeSuspend = min4;
        this.b = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        AppxResourcePackage$Grayscale$Algorithm appxResourcePackage$Grayscale$Algorithm = new AppxResourcePackage$Grayscale$Algorithm(r6);
        this.onNavigationEvent = appxResourcePackage$Grayscale$Algorithm;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.toFloatRange, this.equals, appxResourcePackage$Grayscale$Algorithm);
        this.create = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.b, create3));
        this.getCause = min5;
        this.ICustomTabsCallback = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.onMessageChannelReady = todoublerange;
        this.extraCallbackWithResult = GriverBizManifest.create(this.toFloatRange, this.equals, todoublerange);
        this.onPostMessage = APWebSettings.PluginState.create(this.toString);
        this.extraCallback = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.onRelationshipValidationResult = isOverlapping;
        this.asBinder = onConsoleMessage.create(this.toFloatRange, this.equals, isOverlapping);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.onTransact = invokesuspend;
        this.asInterface = H5ResourceCORSUtil.AnonymousClass1.create(this.toFloatRange, this.equals, invokesuspend);
        toIntRange tointrange = new toIntRange(r6);
        this.ICustomTabsCallback$Default = tointrange;
        this.ICustomTabsCallback$Stub = capturePropagationValues.getMin(this.asInterface, tointrange);
        valueOf valueof = new valueOf(r6);
        this.getDefaultImpl = valueof;
        this.ICustomTabsService = ScanState.create(this.toFloatRange, this.equals, valueof);
        this.getInterfaceDescriptor = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.getInterfaceDescriptor);
        this.ICustomTabsCallback$Stub$Proxy = length2;
        this.setDefaultImpl = Transition.MatchOrder.length(this.ICustomTabsService, length2);
        this.newSession = setInitialScale.create(this.toFloatRange, this.equals, this.toString);
        postUrl create4 = postUrl.create(this.toFloatRange, this.equals, this.toString);
        this.newSessionWithExtras = create4;
        this.warmup = getName.setMin(this.newSession, create4, manuallyReleaseCamera.setMax());
        values values2 = new values(r6);
        this.mayLaunchUrl = values2;
        saveAppInfos create5 = saveAppInfos.create(values2);
        this.extraCommand = create5;
        this.requestPostMessageChannelWithExtras = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.postMessage = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.setMax));
        this.updateVisuals = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.extraCallbackWithResult, this.onPostMessage, this.extraCallback, this.asBinder, this.ICustomTabsCallback$Stub, this.setDefaultImpl, this.warmup, this.requestPostMessageChannelWithExtras, this.postMessage, min6, this.hashCode));
        this.validateRelationship = min7;
        this.requestPostMessageChannel = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        toString tostring = new toString(r6);
        this.receiveFile = tostring;
        this.ICustomTabsService$Stub$Proxy = didRangeBeaconsInRegion.create(this.toFloatRange, this.equals, tostring);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.setMax);
        this.IPostMessageService = max;
        this.ICustomTabsService$Stub = getSystemInfo.setMax(max);
        getMax getmax = new getMax(r6);
        this.ICustomTabsService$Default = getmax;
        setOptionMenu create6 = setOptionMenu.create(getmax);
        this.IPostMessageService$Stub = create6;
        this.IPostMessageService$Default = isScrap.getMin(setPropagation.length(this.requestPostMessageChannel, this.ICustomTabsService$Stub$Proxy, this.ICustomTabsService$Stub, create6, this.toDoubleRange));
        this.IPostMessageService$Stub$Proxy = getLoadsImagesAutomatically.create(this.toFloatRange, this.equals, this.toString);
        this.onExtraCallback = setWebContentsDebuggingEnabled.create(this.toString);
        installPathExist create7 = installPathExist.create(this.toString);
        this.ITrustedWebActivityCallback = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.requestPostMessageChannel, this.IPostMessageService$Default, this.IPostMessageService$Stub$Proxy, this.onExtraCallback, create7));
        this.ITrustedWebActivityCallback$Default = min8;
        this.ITrustedWebActivityCallback$Stub$Proxy = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMin getmin = new getMin(r6);
        this.ITrustedWebActivityService = getmin;
        this.areNotificationsEnabled = GriverOpenAuthExtension.create(getmin);
        this.notifyNotificationWithChannel = BLEManager.AnonymousClass2.create(this.toFloatRange, this.equals, this.FastBitmap$CoordinateSystem);
        this.cancelNotification = GriverDialogExtension.create(this.toFloatRange, this.equals, this.ITrustedWebActivityService);
        this.getActiveNotifications = checkSuffixSupported.create(this.toString);
        this.getSmallIconBitmap = isImage.create(this.toString);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Stub, startListenScreenshot.setMin(), this.areNotificationsEnabled, this.notifyNotificationWithChannel, this.cancelNotification, this.getActiveNotifications, this.getSmallIconBitmap);
        this.getSmallIconId = max2;
        this.ITrustedWebActivityService$Default = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.ITrustedWebActivityService$Stub = BindFont.length(servicesModule);
        create create8 = new create(r6);
        this.notify = create8;
        this.ITrustedWebActivityService$Stub$Proxy = onStartBleScan.create(this.toFloatRange, this.equals, create8);
        this.INotificationSideChannel = onGetBluetoothCharacteristics.create(this.toFloatRange, this.equals, this.notify);
        equals equals2 = new equals(r6);
        this.INotificationSideChannel$Default = equals2;
        this.INotificationSideChannel$Stub$Proxy = matchesBeacon.create(this.receiveFile, equals2);
        this.INotificationSideChannel$Stub = validateMac.create(this.toFloatRange, this.equals, this.receiveFile);
        this.cancelAll = IntentHandler.create(this.toFloatRange, this.equals, this.receiveFile, this.INotificationSideChannel$Default);
        this.cancel = toUuid.create(this.toString);
        this.read = didDetermineStateForRegion.create(this.receiveFile);
        invoke invoke2 = new invoke(r6);
        this.MediaBrowserCompat$CustomActionResultReceiver = invoke2;
        this.IconCompatParcelizer = BLEManager.AnonymousClass3.create(invoke2);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.write = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.setMax, this.ITrustedWebActivityService$Stub, this.IPostMessageService$Stub, this.ICustomTabsService$Stub, this.ITrustedWebActivityService$Stub$Proxy, this.INotificationSideChannel, this.INotificationSideChannel$Stub$Proxy, this.INotificationSideChannel$Stub, this.ICustomTabsService$Stub$Proxy, this.cancelAll, this.cancel, this.read, this.IconCompatParcelizer, create9));
        this.RemoteActionCompatParcelizer = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.invoke, this.ICustomTabsCallback, this.ITrustedWebActivityCallback$Stub$Proxy, this.ITrustedWebActivityService$Default, min9));
        this.MediaBrowserCompat$MediaItem$Flags = min10;
        this.MediaBrowserCompat$SearchResultReceiver = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        setMin setmin = new setMin(r32);
        this.MediaBrowserCompat$ItemReceiver = setmin;
        this.MediaBrowserCompat$MediaItem = APWebMessagePort.APWebMessageCallback.create(this.toFloatRange, this.equals, setmin);
        this.MediaDescriptionCompat = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.toFloatRange, this.equals, this.ITrustedWebActivityService);
        this.MediaMetadataCompat$LongKey = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaDescriptionCompat, create10));
        this.MediaMetadataCompat = min11;
        this.MediaMetadataCompat$BitmapKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
        this.MediaMetadataCompat$RatingKey = isScrap.getMin(GriverJSAPIPermissionProxy.setMin(trackQuestModule));
        GriverAbstractDBHelper create11 = GriverAbstractDBHelper.create(this.toFloatRange, this.equals, this.mayLaunchUrl);
        this.MediaMetadataCompat$TextKey = create11;
        Worker length3 = Worker.length(this.MediaMetadataCompat$RatingKey, create11);
        this.RatingCompat = length3;
        this.RatingCompat$Style = isScrap.getMin(GriverH5AppInfo.UpdatePolicy.setMax(trackQuestModule, length3));
        this.RatingCompat$StarStyle = isScrap.getMin(GriverMenuItem.setMin(redeemQuestModule));
        GriverAppInfoPreDownLoadDBHelper create12 = GriverAppInfoPreDownLoadDBHelper.create(this.toFloatRange, this.equals, this.mayLaunchUrl);
        this.onEvent = create12;
        NetworkType length4 = NetworkType.length(this.RatingCompat$StarStyle, create12);
        this.IMediaControllerCallback = length4;
        this.onSessionDestroyed = isScrap.getMin(canShow.setMax(redeemQuestModule, length4));
        this.onQueueChanged = isScrap.getMin(castToDouble.getMin(missionModule));
        invokeZoomPicker create13 = invokeZoomPicker.create(this.toString);
        this.onPlaybackStateChanged = create13;
        b.C0007b<startWork> min12 = isScrap.getMin(onStopped.getMax(this.onQueueChanged, this.extraCommand, create13, OpenInBrowserBridgeExtension.setMax()));
        this.onMetadataChanged = min12;
        this.onQueueTitleChanged = isScrap.getMin(castToFloat.getMax(missionModule, min12));
        this.onShuffleModeChangedRemoved = isScrap.getMin(OnMenuItemClickListener.getMax(redeemUserMissionModule));
        onUpgrade create14 = onUpgrade.create(this.toFloatRange, this.equals, this.mayLaunchUrl);
        this.onRepeatModeChanged = create14;
        WorkInfo$State max3 = WorkInfo$State.setMax(this.onShuffleModeChangedRemoved, create14);
        this.onExtrasChanged = max3;
        this.onVolumeInfoChanged = isScrap.getMin(GriverMonitorAnalyticsConfigExtension.setMin(redeemUserMissionModule, max3));
    }

    public static final class setMax {
        public ServicesModule IsOverlapping;
        public RedeemUserMissionModule equals;
        public DeepLinkModule getMax;
        public ScanQrModule getMin;
        public OauthModule isInside;
        public MissionModule length;
        public TrackQuestModule setMax;
        public RedeemQuestModule setMin;
        public FeatureModule toFloatRange;
        public RestoreUrlModule toIntRange;
        public PrepareException.AnonymousClass1 toString;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
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

    static class hashCode implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.getMax.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 getMin;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.getMin.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMax;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.setMax.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
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
        private final PrepareException.AnonymousClass1 length;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.length.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 getMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.getMax.ITrustedWebActivityService$Default();
            if (ITrustedWebActivityService$Default != null) {
                return ITrustedWebActivityService$Default;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMin;

        values(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.getMin.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 length;

        toString(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.length.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMax;

        getMin(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 getMax;

        create(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.getMax.RemoteActionCompatParcelizer();
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

    static class invoke implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 setMin;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onCharacteristicChanged write = this.setMin.write();
            if (write != null) {
                return write;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    public final void length(MissionDetailActivity missionDetailActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(missionDetailActivity, IPostMessageService$Stub$Proxy2);
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
                            matchInfo.length(missionDetailActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            DisplayBridgeExtension.getMax(missionDetailActivity, this.MediaMetadataCompat$BitmapKey.get());
                            DisplayBridgeExtension.setMin(missionDetailActivity, this.RatingCompat$Style.get());
                            DisplayBridgeExtension.getMax(missionDetailActivity, this.onSessionDestroyed.get());
                            DisplayBridgeExtension.getMin(missionDetailActivity, this.onQueueTitleChanged.get());
                            DisplayBridgeExtension.length(missionDetailActivity, this.onVolumeInfoChanged.get());
                            getShortName ITrustedWebActivityCallback$Default2 = this.getMax.ITrustedWebActivityCallback$Default();
                            if (ITrustedWebActivityCallback$Default2 != null) {
                                DisplayBridgeExtension.setMin(missionDetailActivity, ITrustedWebActivityCallback$Default2);
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
