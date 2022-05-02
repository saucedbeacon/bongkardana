package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.HomeReferralModule;
import id.dana.di.modules.MissionSummaryModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.richview.homereferral.HomeReferralView;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverAppUpdater;
import o.GriverAppXInterceptor;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverPrepareInterceptor;
import o.GriverRVAppUpdaterImpl;
import o.GriverResourceLoadExtension;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.LocationBridgeExtension;
import o.MovableFrameLayout;
import o.OnPageChange;
import o.OpenAPIBridgeExtension;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.ScanBridgeExtension;
import o.Transition;
import o.b;
import o.getBackgroundExecutor;
import o.getDuration;
import o.getRunningAnimators;
import o.onAction;
import o.onAnimationEnd;
import o.style;

public final class loadTitleBarSnapshot implements GriverResourceLoadExtension.AnonymousClass2 {
    private b.C0007b<onDescriptorWrite> FastBitmap$CoordinateSystem;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> Grayscale$Algorithm;
    private b.C0007b<DataProviderException> ICustomTabsCallback;
    private b.C0007b<getEpicenter> ICustomTabsCallback$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Stub;
    private b.C0007b<setSceneRoot> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getScanJobRuntimeMillis> ICustomTabsService;
    private b.C0007b<getUniqueId> ICustomTabsService$Default;
    private b.C0007b<enableBackButton> ICustomTabsService$Stub;
    private b.C0007b<toUuidString> ICustomTabsService$Stub$Proxy;
    private b.C0007b<ScanBridgeExtension.AnonymousClass1> IMediaControllerCallback;
    private b.C0007b<onConnect> INotificationSideChannel;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Default;
    private b.C0007b<onWebViewDestory> INotificationSideChannel$Stub;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<OrientationDetector.OrientationListener> IPostMessageService;
    private b.C0007b<getBlockNetworkImage> IPostMessageService$Default;
    private b.C0007b<getAllInstallFiles> IPostMessageService$Stub;
    private b.C0007b<setEpicenterCallback> IPostMessageService$Stub$Proxy;
    private b.C0007b<APWebSettings.LayoutAlgorithm> ITrustedWebActivityCallback;
    private b.C0007b<getTargets> ITrustedWebActivityCallback$Default;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityCallback$Stub;
    private b.C0007b<shouldShowRevokeOpenAuthItem> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityService;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Default;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Stub;
    private b.C0007b<onAnimationEnd.length> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> IconCompatParcelizer;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> IsOverlapping;
    private b.C0007b<R.styleable> Mean$Arithmetic;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$MediaItem;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<getPath> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<setSupportZoom> MediaDescriptionCompat;
    private b.C0007b<getDuration.length> MediaMetadataCompat;
    private b.C0007b<getUserAgentString> MediaMetadataCompat$BitmapKey;
    private b.C0007b<saveAppInfo> MediaMetadataCompat$LongKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$RatingKey;
    private b.C0007b<setStartDelay> MediaMetadataCompat$TextKey;
    private b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> RatingCompat;
    private b.C0007b<getBackgroundExecutor.setMin> RatingCompat$StarStyle;
    private b.C0007b<isRunInForeground> RatingCompat$Style;
    private b.C0007b<didExitRegion> RemoteActionCompatParcelizer;
    private b.C0007b<getCommonResources> areNotificationsEnabled;
    private b.C0007b<onJsBeforeUnload> asBinder;
    private b.C0007b<H5Utils> asInterface;
    private b.C0007b<OnFocusChange> b;
    private b.C0007b<toByteArray> cancel;
    private b.C0007b<Region$1> cancelAll;
    private b.C0007b<GriverCreatePromptParam> cancelNotification;
    private b.C0007b<BindView.setMin> create;
    private b.C0007b<getScheme> equals;
    private b.C0007b<MovableFrameLayout> extraCallback;
    private b.C0007b<setPageCacheCapacity> extraCallbackWithResult;
    private b.C0007b<getPropagation> extraCommand;
    private b.C0007b<checkBitmap> getActiveNotifications;
    private b.C0007b<AndroidModel> getCause;
    private b.C0007b<setInitTextColor> getDefaultImpl;
    private b.C0007b<applySettingsToScheduledJob> getInterfaceDescriptor;
    private b.C0007b<method> getMax;
    private b.C0007b<R.id.length> getMin;
    private b.C0007b<notifyCharacteristicValue> getSmallIconBitmap;
    private b.C0007b<KitUtils> getSmallIconId;
    private b.C0007b<setDefaultFontSize> hashCode;
    private b.C0007b<OnItemLongClick> invoke;
    private b.C0007b<R.id.getMax> invokeSuspend;
    private b.C0007b<GriverPrepareInterceptor> isInside;
    private b.C0007b<Activity> length;
    private b.C0007b<canGoBackOrForward> mayLaunchUrl;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> newSession;
    private b.C0007b<queryAppInfo> newSessionWithExtras;
    private b.C0007b<style.getMin> notify;
    private b.C0007b<getPlatformCallback> notifyNotificationWithChannel;
    private b.C0007b<getBackgroundExecutor.length> onEvent;
    private b.C0007b<GetAuthCode> onExtraCallback;
    private b.C0007b<onAction.length> onExtrasChanged;
    private b.C0007b<setBackButton> onMessageChannelReady;
    private b.C0007b<MovableFrameLayout.AnonymousClass1> onMetadataChanged;
    private b.C0007b<BindView.setMax> onNavigationEvent;
    private b.C0007b<GriverRVAppUpdaterImpl.AnonymousClass1> onPlaybackStateChanged;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onPostMessage;
    private b.C0007b<BluetoothManifest> onQueueChanged;
    private b.C0007b<GriverSwtich> onQueueTitleChanged;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> onRelationshipValidationResult;
    private b.C0007b<GriverAppXInterceptor.AnonymousClass1> onSessionDestroyed;
    private b.C0007b<GriverRVAppInfoManagerImpl> onShuffleModeChangedRemoved;
    private b.C0007b<addChooseImageCrossOrigin> onTransact;
    private b.C0007b<CaptureListener> onVolumeInfoChanged;
    private b.C0007b<getCancelable> postMessage;
    private b.C0007b<onCharacteristicChanged> read;
    private b.C0007b<parseBatteryPercentage> receiveFile;
    private b.C0007b<getRunningAnimators.getMin> requestPostMessageChannel;
    private b.C0007b<getTransitionValues> requestPostMessageChannelWithExtras;
    private b.C0007b<updateFootState> setDefaultImpl;
    private b.C0007b<Context> setMax;
    private final HomeReferralModule setMin;
    private b.C0007b<getPerformanceTracker> toDoubleRange;
    private b.C0007b<appxLoadFailed> toFloatRange;
    private b.C0007b<ResourceProviderExtension> toIntRange;
    private b.C0007b<setDataRequestNotifier> toString;
    private b.C0007b<getMode> updateVisuals;
    private b.C0007b<isTransitionRequired> validateRelationship;
    private b.C0007b<requestAppWithAppId> valueOf;
    private b.C0007b<getTinyLocalStorageInfo> values;
    private b.C0007b<setNetworkAvailable> warmup;
    private b.C0007b<BindInt> write;

    public /* synthetic */ loadTitleBarSnapshot(HomeReferralModule homeReferralModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, MissionSummaryModule missionSummaryModule, PrepareException.AnonymousClass1 r9, byte b2) {
        this(homeReferralModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, missionSummaryModule, r9);
    }

    private loadTitleBarSnapshot(HomeReferralModule homeReferralModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, MissionSummaryModule missionSummaryModule, PrepareException.AnonymousClass1 r30) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r30;
        this.setMin = homeReferralModule;
        this.setMax = new getMax(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.length = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.getMax = min2;
        this.getMin = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toFloatRange = new onNavigationEvent(r6);
        this.equals = new toString(r6);
        hashCode hashcode = new hashCode(r6);
        this.isInside = hashcode;
        this.toIntRange = GriverPrepareInterceptor.AnonymousClass2.create(this.toFloatRange, this.equals, hashcode);
        this.IsOverlapping = beforeQuery.create(this.toFloatRange, this.equals, this.isInside);
        this.values = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toDoubleRange = new toIntRange(r6);
        equals equals2 = new equals(r6);
        this.hashCode = equals2;
        this.toString = getDataRequestNotifier.create(equals2);
        getCause getcause = new getCause(r6);
        this.FastBitmap$CoordinateSystem = getcause;
        this.Grayscale$Algorithm = onCharacteristicWrite.create(getcause, this.toFloatRange, this.equals);
        localIdToBytes create2 = localIdToBytes.create(this.isInside);
        this.valueOf = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.setMax, this.getMin, this.toIntRange, this.IsOverlapping, this.values, this.toDoubleRange, this.toString, this.Grayscale$Algorithm, create2));
        this.Mean$Arithmetic = min3;
        this.invokeSuspend = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.invoke = min4;
        this.onNavigationEvent = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.getCause = invokesuspend;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.toFloatRange, this.equals, invokesuspend);
        this.ICustomTabsCallback = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.onNavigationEvent, create3));
        this.b = min5;
        this.create = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.onPostMessage = todoublerange;
        this.extraCallback = GriverBizManifest.create(this.toFloatRange, this.equals, todoublerange);
        this.extraCallbackWithResult = APWebSettings.PluginState.create(this.hashCode);
        this.onMessageChannelReady = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.onRelationshipValidationResult = isOverlapping;
        this.asBinder = onConsoleMessage.create(this.toFloatRange, this.equals, isOverlapping);
        valueOf valueof = new valueOf(r6);
        this.asInterface = valueof;
        this.onTransact = H5ResourceCORSUtil.AnonymousClass1.create(this.toFloatRange, this.equals, valueof);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.ICustomTabsCallback$Stub = tofloatrange;
        this.ICustomTabsCallback$Default = capturePropagationValues.getMin(this.onTransact, tofloatrange);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.ICustomTabsService = iCustomTabsCallback;
        this.getInterfaceDescriptor = ScanState.create(this.toFloatRange, this.equals, iCustomTabsCallback);
        this.getDefaultImpl = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.getDefaultImpl);
        this.setDefaultImpl = length2;
        this.ICustomTabsCallback$Stub$Proxy = Transition.MatchOrder.length(this.getInterfaceDescriptor, length2);
        this.mayLaunchUrl = setInitialScale.create(this.toFloatRange, this.equals, this.hashCode);
        postUrl create4 = postUrl.create(this.toFloatRange, this.equals, this.hashCode);
        this.warmup = create4;
        this.extraCommand = getName.setMin(this.mayLaunchUrl, create4, manuallyReleaseCamera.setMax());
        values values2 = new values(r6);
        this.newSession = values2;
        saveAppInfos create5 = saveAppInfos.create(values2);
        this.newSessionWithExtras = create5;
        this.requestPostMessageChannelWithExtras = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.validateRelationship = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.setMax));
        this.postMessage = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.extraCallback, this.extraCallbackWithResult, this.onMessageChannelReady, this.asBinder, this.ICustomTabsCallback$Default, this.ICustomTabsCallback$Stub$Proxy, this.extraCommand, this.requestPostMessageChannelWithExtras, this.validateRelationship, min6, this.toString));
        this.updateVisuals = min7;
        this.requestPostMessageChannel = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        invoke invoke2 = new invoke(r6);
        this.ICustomTabsService$Stub$Proxy = invoke2;
        this.ICustomTabsService$Default = didRangeBeaconsInRegion.create(this.toFloatRange, this.equals, invoke2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.setMax);
        this.IPostMessageService = max;
        this.receiveFile = getSystemInfo.setMax(max);
        setMin setmin = new setMin(r6);
        this.ICustomTabsService$Stub = setmin;
        setOptionMenu create6 = setOptionMenu.create(setmin);
        this.onExtraCallback = create6;
        this.IPostMessageService$Stub$Proxy = isScrap.getMin(setPropagation.length(this.requestPostMessageChannel, this.ICustomTabsService$Default, this.receiveFile, create6, this.toDoubleRange));
        this.IPostMessageService$Default = getLoadsImagesAutomatically.create(this.toFloatRange, this.equals, this.hashCode);
        this.ITrustedWebActivityCallback = setWebContentsDebuggingEnabled.create(this.hashCode);
        installPathExist create7 = installPathExist.create(this.hashCode);
        this.IPostMessageService$Stub = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.requestPostMessageChannel, this.IPostMessageService$Stub$Proxy, this.IPostMessageService$Default, this.ITrustedWebActivityCallback, create7));
        this.ITrustedWebActivityCallback$Default = min8;
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityService = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        length length3 = new length(r6);
        this.areNotificationsEnabled = length3;
        this.ITrustedWebActivityCallback$Stub$Proxy = GriverOpenAuthExtension.create(length3);
        this.getSmallIconBitmap = BLEManager.AnonymousClass2.create(this.toFloatRange, this.equals, this.FastBitmap$CoordinateSystem);
        this.cancelNotification = GriverDialogExtension.create(this.toFloatRange, this.equals, this.areNotificationsEnabled);
        this.getSmallIconId = checkSuffixSupported.create(this.hashCode);
        this.getActiveNotifications = isImage.create(this.hashCode);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityService, startListenScreenshot.setMin(), this.ITrustedWebActivityCallback$Stub$Proxy, this.getSmallIconBitmap, this.cancelNotification, this.getSmallIconId, this.getActiveNotifications);
        this.notifyNotificationWithChannel = max2;
        this.ITrustedWebActivityService$Stub$Proxy = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.notify = BindFont.length(servicesModule);
        b bVar = new b(r6);
        this.ITrustedWebActivityService$Stub = bVar;
        this.ITrustedWebActivityService$Default = onStartBleScan.create(this.toFloatRange, this.equals, bVar);
        this.INotificationSideChannel = onGetBluetoothCharacteristics.create(this.toFloatRange, this.equals, this.ITrustedWebActivityService$Stub);
        isInside isinside = new isInside(r6);
        this.INotificationSideChannel$Stub = isinside;
        this.INotificationSideChannel$Stub$Proxy = matchesBeacon.create(this.ICustomTabsService$Stub$Proxy, isinside);
        this.cancelAll = validateMac.create(this.toFloatRange, this.equals, this.ICustomTabsService$Stub$Proxy);
        this.INotificationSideChannel$Default = IntentHandler.create(this.toFloatRange, this.equals, this.ICustomTabsService$Stub$Proxy, this.INotificationSideChannel$Stub);
        this.cancel = toUuid.create(this.hashCode);
        this.RemoteActionCompatParcelizer = didDetermineStateForRegion.create(this.ICustomTabsService$Stub$Proxy);
        create create8 = new create(r6);
        this.read = create8;
        this.MediaBrowserCompat$CustomActionResultReceiver = BLEManager.AnonymousClass3.create(create8);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.read);
        this.IconCompatParcelizer = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.setMax, this.notify, this.onExtraCallback, this.receiveFile, this.ITrustedWebActivityService$Default, this.INotificationSideChannel, this.INotificationSideChannel$Stub$Proxy, this.cancelAll, this.ICustomTabsService$Default, this.INotificationSideChannel$Default, this.cancel, this.RemoteActionCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, create9));
        this.write = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.invokeSuspend, this.create, this.ITrustedWebActivityCallback$Stub, this.ITrustedWebActivityService$Stub$Proxy, min9));
        this.MediaBrowserCompat$SearchResultReceiver = min10;
        this.MediaBrowserCompat$MediaItem = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        PrepareException.AnonymousClass1 r3 = r30;
        getMin getmin = new getMin(r3);
        this.MediaDescriptionCompat = getmin;
        this.MediaBrowserCompat$MediaItem$Flags = APWebMessagePort.APWebMessageCallback.create(this.toFloatRange, this.equals, getmin);
        this.MediaBrowserCompat$ItemReceiver = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.toFloatRange, this.equals, this.areNotificationsEnabled);
        this.MediaMetadataCompat$RatingKey = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$MediaItem$Flags, this.MediaBrowserCompat$ItemReceiver, create10));
        this.MediaMetadataCompat$TextKey = min11;
        this.MediaMetadataCompat = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
        this.MediaMetadataCompat$BitmapKey = setUserAgentString.create(this.hashCode);
        this.MediaMetadataCompat$LongKey = queryLastInstall.create(this.newSession);
        this.onEvent = isScrap.getMin(getClassFromMapping.getMin(missionSummaryModule));
        setUsed max3 = setUsed.getMax(this.MediaMetadataCompat$BitmapKey, this.MediaMetadataCompat$LongKey, OpenInBrowserBridgeExtension.setMax(), this.onEvent);
        this.RatingCompat$Style = max3;
        this.RatingCompat$StarStyle = isScrap.getMin(castToEnum.getMin(missionSummaryModule, max3));
        loadTitleBarSnapshot$Grayscale$Algorithm loadtitlebarsnapshot_grayscale_algorithm = new loadTitleBarSnapshot$Grayscale$Algorithm(r3);
        this.RatingCompat = loadtitlebarsnapshot_grayscale_algorithm;
        this.IMediaControllerCallback = OpenAPIBridgeExtension.AnonymousClass3.AnonymousClass1.create(this.toFloatRange, this.equals, loadtitlebarsnapshot_grayscale_algorithm);
        this.onQueueChanged = scan.create(this.toFloatRange, this.equals, this.RatingCompat);
        loadTitleBarSnapshot$Mean$Arithmetic loadtitlebarsnapshot_mean_arithmetic = new loadTitleBarSnapshot$Mean$Arithmetic(r3);
        this.onQueueTitleChanged = loadtitlebarsnapshot_mean_arithmetic;
        this.onMetadataChanged = MovableFrameLayout.Helper.create(this.toFloatRange, this.equals, loadtitlebarsnapshot_mean_arithmetic);
        loadTitleBarSnapshot$FastBitmap$CoordinateSystem loadtitlebarsnapshot_fastbitmap_coordinatesystem = new loadTitleBarSnapshot$FastBitmap$CoordinateSystem(r3);
        this.onSessionDestroyed = loadtitlebarsnapshot_fastbitmap_coordinatesystem;
        this.onPlaybackStateChanged = GriverAppUpdater.AnonymousClass2.create(this.toFloatRange, this.equals, loadtitlebarsnapshot_fastbitmap_coordinatesystem);
        this.onShuffleModeChangedRemoved = GriverRVAppUpdaterImpl.create(this.toFloatRange, this.equals, this.onSessionDestroyed);
        this.onExtrasChanged = expandCapacity.getMax(homeReferralModule);
        this.onVolumeInfoChanged = isScrap.getMin(IRecordListener.setMin(this.setMax, this.IMediaControllerCallback, this.onQueueChanged, this.onMetadataChanged, this.onPlaybackStateChanged, this.onShuffleModeChangedRemoved, fixEmptyKeyHeader.getMax(), getSharedPreferenceInfo.getMax(), this.onExtrasChanged));
    }

    public static final class setMax {
        public MissionSummaryModule IsOverlapping;
        public ServicesModule equals;
        public ScanQrModule getMax;
        public DeepLinkModule getMin;
        public OauthModule isInside;
        public HomeReferralModule length;
        public RestoreUrlModule setMax;
        public FeatureModule setMin;
        public PrepareException.AnonymousClass1 toFloatRange;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class getMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class onNavigationEvent implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMax;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.setMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        toString(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 getMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.getMax.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem != null) {
                return FastBitmap$CoordinateSystem;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 length;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class getCause implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMax;

        getCause(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.getMax.toDoubleRange();
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
        private final PrepareException.AnonymousClass1 getMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.getMax.ICustomTabsService();
            if (ICustomTabsService != null) {
                return ICustomTabsService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.setMin.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 getMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.getMax.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMax;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 length;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.length.ITrustedWebActivityService$Default();
            if (ITrustedWebActivityService$Default != null) {
                return ITrustedWebActivityService$Default;
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

    static class invoke implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMax;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 getMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.getMin.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMax;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class b implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 length;

        b(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 setMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.setMax.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMax;

        create(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onCharacteristicChanged write = this.getMax.write();
            if (write != null) {
                return write;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            setSupportZoom ICustomTabsService$Stub = this.setMax.ICustomTabsService$Stub();
            if (ICustomTabsService$Stub != null) {
                return ICustomTabsService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(HomeReferralView homeReferralView) {
        APTakePicRsp.length(homeReferralView, this.MediaMetadataCompat.get());
        APTakePicRsp.getMin(homeReferralView, this.RatingCompat$StarStyle.get());
        APTakePicRsp.getMax(homeReferralView, SerializeConfig.getMax(this.setMin, this.onVolumeInfoChanged.get()));
    }
}
