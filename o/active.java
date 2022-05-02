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
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.sendmoney_v2.landing.SendMoneyActivity;
import id.dana.sendmoney_v2.landing.di.module.SendMoneyLandingModule;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AnimationUtil;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverPrepareInterceptor;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.IWorkManagerImplCallback;
import o.ImageObserver;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OpenAPIBridgeExtension;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.Transition;
import o.b;
import o.enqueueWorkRequests;
import o.getDuration;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.getTitleIcon_White;
import o.onAnimationEnd;
import o.style;

public final class active implements ImageObserver.AnonymousClass2 {
    private b.C0007b<IWorkManagerImplCallback.Stub.Proxy.getMax> FastBitmap$CoordinateSystem;
    private b.C0007b<getBeaconSimulator> Grayscale$Algorithm;
    private b.C0007b<GetAuthCode> ICustomTabsCallback;
    private b.C0007b<Context> ICustomTabsCallback$Default;
    private b.C0007b<GriverPrepareInterceptor> ICustomTabsCallback$Stub;
    private b.C0007b<onDescriptorWrite> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<setDataRequestNotifier> ICustomTabsService;
    private b.C0007b<setPageCacheCapacity> ICustomTabsService$Default;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> ICustomTabsService$Stub;
    private b.C0007b<MovableFrameLayout> ICustomTabsService$Stub$Proxy;
    private b.C0007b<Region$1> IMediaControllerCallback;
    private b.C0007b<onMessage> IMediaControllerCallback$Stub;
    private b.C0007b<setStartDelay> IMediaControllerCallback$Stub$Proxy;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> IMediaSession;
    private b.C0007b<isTransitionRequired> INotificationSideChannel;
    private b.C0007b<parseBatteryPercentage> INotificationSideChannel$Default;
    private b.C0007b<OrientationDetector.OrientationListener> INotificationSideChannel$Stub;
    private b.C0007b<getUniqueId> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<setBackButton> IPostMessageService;
    private b.C0007b<getEpicenter> IPostMessageService$Default;
    private b.C0007b<onJsBeforeUnload> IPostMessageService$Stub;
    private b.C0007b<H5Utils> IPostMessageService$Stub$Proxy;
    private b.C0007b<getAppPerfKey> ITrustedWebActivityCallback;
    private b.C0007b<setSceneRoot> ITrustedWebActivityCallback$Default;
    private b.C0007b<updateFootState> ITrustedWebActivityCallback$Stub;
    private b.C0007b<applySettingsToScheduledJob> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getScanJobRuntimeMillis> ITrustedWebActivityService;
    private b.C0007b<getTransitionValues> ITrustedWebActivityService$Default;
    private b.C0007b<getRunningAnimators.getMin> ITrustedWebActivityService$Stub;
    private b.C0007b<getMode> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IconCompatParcelizer;
    private b.C0007b<ResourceDownloadType> IsOverlapping;
    private b.C0007b<addRangeNotifier> Mean$Arithmetic;
    private b.C0007b<getBlockNetworkImage> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<shouldShowRevokeOpenAuthItem> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<notifyCharacteristicValue> MediaBrowserCompat$MediaItem;
    private b.C0007b<getCommonResources> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<GriverCreatePromptParam> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<onAnimationEnd.getMin> MediaDescriptionCompat;
    private b.C0007b<checkBitmap> MediaMetadataCompat;
    private b.C0007b<getPlatformCallback> MediaMetadataCompat$BitmapKey;
    private b.C0007b<onAnimationEnd.length> MediaMetadataCompat$LongKey;
    private b.C0007b<style.getMin> MediaMetadataCompat$RatingKey;
    private b.C0007b<KitUtils> MediaMetadataCompat$TextKey;
    private b.C0007b<onCharacteristicWriteCompleted> RatingCompat;
    private b.C0007b<onWebViewDestory> RatingCompat$StarStyle;
    private b.C0007b<onConnect> RatingCompat$Style;
    private b.C0007b<getAllInstallFiles> RemoteActionCompatParcelizer;
    private b.C0007b<setInitTextColor> areNotificationsEnabled;
    private b.C0007b<Activity> asBinder;
    private b.C0007b<method> asInterface;
    private b.C0007b<getPerformanceTracker> b;
    private b.C0007b<toUuidString> cancel;
    private b.C0007b<setEpicenterCallback> cancelAll;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> cancelNotification;
    private b.C0007b<IWorkManagerImplCallback.Stub.Proxy.getMin> create;
    private b.C0007b<GriverWhiteScreenStageMonitor> equals;
    private b.C0007b<BLETraceMonitor> extraCallback;
    private b.C0007b<onStopBleScan> extraCallbackWithResult;
    private b.C0007b<requestAppWithAppId> extraCommand;
    private b.C0007b<getPropagation> getActiveNotifications;
    private b.C0007b<getSelectedIndex.setMax> getCause;
    private b.C0007b<getTinyLocalStorageInfo> getDefaultImpl;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> getInterfaceDescriptor;
    private b.C0007b<getScheme> getMax;
    private b.C0007b<appxLoadFailed> getMin;
    private b.C0007b<setNetworkAvailable> getSmallIconBitmap;
    private b.C0007b<queryAppInfo> getSmallIconId;
    private b.C0007b<cancelUniqueWork> hashCode;
    private b.C0007b<setManifestCheckingDisabled> invoke;
    private b.C0007b<setBeaconSimulator> invokeSuspend;
    private b.C0007b<BluetoothManifest> isInside;
    private b.C0007b<getTitleIcon_White.getMin> isTransportControlEnabled;
    private b.C0007b<enqueueWorkRequests.setMax> length;
    private b.C0007b<R.id.getMax> mayLaunchUrl;
    private b.C0007b<R.styleable> newSession;
    private b.C0007b<OnItemLongClick> newSessionWithExtras;
    private b.C0007b<getCancelable> notify;
    private b.C0007b<canGoBackOrForward> notifyNotificationWithChannel;
    private b.C0007b<setSupportZoom> onCaptioningEnabledChanged;
    private b.C0007b<hasSameIdentifiers> onEvent;
    private b.C0007b<addChooseImageCrossOrigin> onExtraCallback;
    private b.C0007b<AutoTransition.setMax> onExtrasChanged;
    private b.C0007b<getSelectedIndex.length> onMessageChannelReady;
    private b.C0007b<convertIntentsToCallbacks> onMetadataChanged;
    private b.C0007b<IWorkManagerImplCallback.Default> onNavigationEvent;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> onPlaybackStateChanged;
    private b.C0007b<setOnOptionPickListener> onPostMessage;
    private b.C0007b<didExitRegion> onQueueChanged;
    private b.C0007b<toByteArray> onQueueTitleChanged;
    private b.C0007b<onDisconnect> onRelationshipValidationResult;
    private b.C0007b<BindInt> onRepeatModeChanged;
    private b.C0007b<onCharacteristicChanged> onSessionDestroyed;
    private b.C0007b<GriverCreateDialogParam> onSessionReady;
    private b.C0007b<getDuration.length> onShuffleModeChanged;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> onShuffleModeChangedRemoved;
    private b.C0007b<R.id.length> onTransact;
    private b.C0007b<getPath> onVolumeInfoChanged;
    private b.C0007b<BindView.setMin> postMessage;
    private b.C0007b<getRunningAnimators.setMax> read;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> receiveFile;
    private b.C0007b<updateScanPeriods> registerCallbackListener;
    private b.C0007b<OnFocusChange> requestPostMessageChannel;
    private b.C0007b<BindView.setMax> requestPostMessageChannelWithExtras;
    private b.C0007b<getTitleIcon_White.getMax> sendCommand;
    private b.C0007b<loadThumbPhoto> sendMediaButton;
    private b.C0007b<ResourceProviderExtension> setDefaultImpl;
    private b.C0007b<setDefaultFontSize> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<enqueueWorkRequests.length> toDoubleRange;
    private b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> toFloatRange;
    private b.C0007b<getManifestCheckingDisabled> toIntRange;
    private b.C0007b<setH5ErrorPage> toString;
    private b.C0007b<DataProviderException> updateVisuals;
    private b.C0007b<AndroidModel> validateRelationship;
    private b.C0007b<enableBackButton> valueOf;
    private b.C0007b<fromInt> values;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> warmup;
    private b.C0007b<getTargets> write;

    public /* synthetic */ active(RecipientActivityModule recipientActivityModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, SendMoneyLandingModule sendMoneyLandingModule, BillerX2BModule billerX2BModule, PrepareException.AnonymousClass1 r11, byte b2) {
        this(recipientActivityModule, bottomSheetOnBoardingModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, sendMoneyLandingModule, billerX2BModule, r11);
    }

    private active(RecipientActivityModule recipientActivityModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, SendMoneyLandingModule sendMoneyLandingModule, BillerX2BModule billerX2BModule, PrepareException.AnonymousClass1 r32) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r32;
        this.setMin = r6;
        this.length = isScrap.getMin(GRVMPMoreMenuItemPriority.setMin(recipientActivityModule));
        this.getMin = new getCause(r6);
        this.getMax = new hashCode(r6);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.setMax = tofloatrange;
        this.toIntRange = setAndroidLScanningDisabled.create(this.getMin, this.getMax, tofloatrange);
        invoke invoke2 = new invoke(r6);
        this.toFloatRange = invoke2;
        this.isInside = scan.create(this.getMin, this.getMax, invoke2);
        active$FastBitmap$CoordinateSystem active_fastbitmap_coordinatesystem = new active$FastBitmap$CoordinateSystem(r6);
        this.equals = active_fastbitmap_coordinatesystem;
        this.IsOverlapping = setGriverResourcePresetProxy.create(this.getMin, this.getMax, active_fastbitmap_coordinatesystem);
        setStatusErrorPage create2 = setStatusErrorPage.create(this.getMin, this.getMax, this.equals);
        this.toString = create2;
        b.C0007b<cancelUniqueWork> min = isScrap.getMin(cancelWorkById.setMax(this.length, this.toIntRange, this.isInside, this.IsOverlapping, create2));
        this.hashCode = min;
        this.toDoubleRange = isScrap.getMin(onMenuItemChange.getMax(recipientActivityModule, min));
        this.FastBitmap$CoordinateSystem = isScrap.getMin(compareTo.setMax(billerX2BModule));
        valueOf valueof = new valueOf(r6);
        this.values = valueof;
        this.Mean$Arithmetic = setForegroundBetweenScanPeriod.create(valueof);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.Grayscale$Algorithm = invokesuspend;
        this.invokeSuspend = isAndroidLScanningDisabled.create(invokesuspend);
        this.invoke = setsManifestCheckingDisabled.create(this.Grayscale$Algorithm);
        setMin setmin = new setMin(r6);
        this.valueOf = setmin;
        this.ICustomTabsCallback = setOptionMenu.create(setmin);
        toIntRange tointrange = new toIntRange(r6);
        this.b = tointrange;
        b.C0007b<IWorkManagerImplCallback.Default> min2 = isScrap.getMin(IWorkManagerImplCallback.Stub.setMin(this.FastBitmap$CoordinateSystem, this.Mean$Arithmetic, this.invokeSuspend, this.invoke, this.ICustomTabsCallback, tointrange, this.IsOverlapping));
        this.onNavigationEvent = min2;
        this.create = isScrap.getMin(getPropertyValue.getMin(billerX2BModule, min2));
        this.getCause = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        create create3 = new create(r6);
        this.onRelationshipValidationResult = create3;
        this.extraCallback = onDeviceFound.create(this.getMin, this.getMax, create3);
        onDisconnectBLE create4 = onDisconnectBLE.create(this.getMin, this.getMax, this.onRelationshipValidationResult);
        this.extraCallbackWithResult = create4;
        onSelected min3 = onSelected.setMin(this.getCause, this.extraCallback, create4);
        this.onPostMessage = min3;
        this.onMessageChannelReady = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min3));
        this.ICustomTabsCallback$Default = new getMax(r6);
        b.C0007b<Activity> min4 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.asBinder = min4;
        b.C0007b<method> min5 = isScrap.getMin(type.getMax(min4));
        this.asInterface = min5;
        this.onTransact = isScrap.getMin(R.integer.setMin(scanQrModule2, min5));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.ICustomTabsCallback$Stub = todoublerange;
        this.setDefaultImpl = GriverPrepareInterceptor.AnonymousClass2.create(this.getMin, this.getMax, todoublerange);
        this.getInterfaceDescriptor = beforeQuery.create(this.getMin, this.getMax, this.ICustomTabsCallback$Stub);
        this.getDefaultImpl = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.ICustomTabsService = getDataRequestNotifier.create(this.setMax);
        onRelationshipValidationResult onrelationshipvalidationresult = new onRelationshipValidationResult(r6);
        this.ICustomTabsCallback$Stub$Proxy = onrelationshipvalidationresult;
        this.warmup = onCharacteristicWrite.create(onrelationshipvalidationresult, this.getMin, this.getMax);
        localIdToBytes create5 = localIdToBytes.create(this.ICustomTabsCallback$Stub);
        this.extraCommand = create5;
        b.C0007b<R.styleable> min6 = isScrap.getMin(Setter.length(this.ICustomTabsCallback$Default, this.onTransact, this.setDefaultImpl, this.getInterfaceDescriptor, this.getDefaultImpl, this.b, this.ICustomTabsService, this.warmup, create5));
        this.newSession = min6;
        this.mayLaunchUrl = isScrap.getMin(R.drawable.setMin(scanQrModule2, min6));
        b.C0007b<OnItemLongClick> min7 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.newSessionWithExtras = min7;
        this.requestPostMessageChannelWithExtras = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min7));
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.validateRelationship = iCustomTabsCallback;
        NullBeaconDataFactory create6 = NullBeaconDataFactory.create(this.getMin, this.getMax, iCustomTabsCallback);
        this.updateVisuals = create6;
        b.C0007b<OnFocusChange> min8 = isScrap.getMin(OnEditorAction.getMin(this.requestPostMessageChannelWithExtras, create6));
        this.requestPostMessageChannel = min8;
        this.postMessage = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min8));
        toString tostring = new toString(r6);
        this.ICustomTabsService$Stub = tostring;
        this.ICustomTabsService$Stub$Proxy = GriverBizManifest.create(this.getMin, this.getMax, tostring);
        this.ICustomTabsService$Default = APWebSettings.PluginState.create(this.setMax);
        this.IPostMessageService = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        isInside isinside = new isInside(r6);
        this.receiveFile = isinside;
        this.IPostMessageService$Stub = onConsoleMessage.create(this.getMin, this.getMax, isinside);
        active$Mean$Arithmetic active_mean_arithmetic = new active$Mean$Arithmetic(r6);
        this.IPostMessageService$Stub$Proxy = active_mean_arithmetic;
        this.onExtraCallback = H5ResourceCORSUtil.AnonymousClass1.create(this.getMin, this.getMax, active_mean_arithmetic);
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.ITrustedWebActivityCallback = isOverlapping;
        this.IPostMessageService$Default = capturePropagationValues.getMin(this.onExtraCallback, isOverlapping);
        b bVar = new b(r6);
        this.ITrustedWebActivityService = bVar;
        this.ITrustedWebActivityCallback$Stub$Proxy = ScanState.create(this.getMin, this.getMax, bVar);
        this.areNotificationsEnabled = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.areNotificationsEnabled);
        this.ITrustedWebActivityCallback$Stub = length2;
        this.ITrustedWebActivityCallback$Default = Transition.MatchOrder.length(this.ITrustedWebActivityCallback$Stub$Proxy, length2);
        this.notifyNotificationWithChannel = setInitialScale.create(this.getMin, this.getMax, this.setMax);
        postUrl create7 = postUrl.create(this.getMin, this.getMax, this.setMax);
        this.getSmallIconBitmap = create7;
        this.getActiveNotifications = getName.setMin(this.notifyNotificationWithChannel, create7, manuallyReleaseCamera.setMax());
        values values2 = new values(r6);
        this.cancelNotification = values2;
        saveAppInfos create8 = saveAppInfos.create(values2);
        this.getSmallIconId = create8;
        this.ITrustedWebActivityService$Default = captureHierarchy.length(create8, OpenInBrowserBridgeExtension.setMax());
        this.INotificationSideChannel = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min9 = isScrap.getMin(getCancelOnTouchOutside.create(this.ICustomTabsCallback$Default));
        this.notify = min9;
        b.C0007b<getMode> min10 = isScrap.getMin(onDisappear.length(this.ICustomTabsService$Stub$Proxy, this.ICustomTabsService$Default, this.IPostMessageService, this.IPostMessageService$Stub, this.IPostMessageService$Default, this.ITrustedWebActivityCallback$Default, this.getActiveNotifications, this.ITrustedWebActivityService$Default, this.INotificationSideChannel, min9, this.ICustomTabsService));
        this.ITrustedWebActivityService$Stub$Proxy = min10;
        this.ITrustedWebActivityService$Stub = isScrap.getMin(setDuration.getMax(featureModule2, min10));
        active$Grayscale$Algorithm active_grayscale_algorithm = new active$Grayscale$Algorithm(r6);
        this.cancel = active_grayscale_algorithm;
        this.INotificationSideChannel$Stub$Proxy = didRangeBeaconsInRegion.create(this.getMin, this.getMax, active_grayscale_algorithm);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.ICustomTabsCallback$Default);
        this.INotificationSideChannel$Stub = max;
        getSystemInfo max2 = getSystemInfo.setMax(max);
        this.INotificationSideChannel$Default = max2;
        this.cancelAll = isScrap.getMin(setPropagation.length(this.ITrustedWebActivityService$Stub, this.INotificationSideChannel$Stub$Proxy, max2, this.ICustomTabsCallback, this.b));
        this.MediaBrowserCompat$CustomActionResultReceiver = getLoadsImagesAutomatically.create(this.getMin, this.getMax, this.setMax);
        this.IconCompatParcelizer = setWebContentsDebuggingEnabled.create(this.setMax);
        installPathExist create9 = installPathExist.create(this.setMax);
        this.RemoteActionCompatParcelizer = create9;
        b.C0007b<getTargets> min11 = isScrap.getMin(addViewValues.length(this.ITrustedWebActivityService$Stub, this.cancelAll, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, create9));
        this.write = min11;
        this.read = isScrap.getMin(parseMatchOrder.length(featureModule2, min11));
        this.MediaDescriptionCompat = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMin getmin = new getMin(r6);
        this.MediaBrowserCompat$MediaItem$Flags = getmin;
        this.MediaBrowserCompat$ItemReceiver = GriverOpenAuthExtension.create(getmin);
        this.MediaBrowserCompat$MediaItem = BLEManager.AnonymousClass2.create(this.getMin, this.getMax, this.ICustomTabsCallback$Stub$Proxy);
        this.MediaBrowserCompat$SearchResultReceiver = GriverDialogExtension.create(this.getMin, this.getMax, this.MediaBrowserCompat$MediaItem$Flags);
        this.MediaMetadataCompat$TextKey = checkSuffixSupported.create(this.setMax);
        this.MediaMetadataCompat = isImage.create(this.setMax);
        getFillColor max3 = getFillColor.setMax(this.MediaDescriptionCompat, startListenScreenshot.setMin(), this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, this.MediaMetadataCompat$TextKey, this.MediaMetadataCompat);
        this.MediaMetadataCompat$BitmapKey = max3;
        this.MediaMetadataCompat$LongKey = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max3));
        this.MediaMetadataCompat$RatingKey = BindFont.length(servicesModule);
        this.RatingCompat = onStartBleScan.create(this.getMin, this.getMax, this.onRelationshipValidationResult);
        this.RatingCompat$Style = onGetBluetoothCharacteristics.create(this.getMin, this.getMax, this.onRelationshipValidationResult);
        equals equals2 = new equals(r6);
        this.RatingCompat$StarStyle = equals2;
        this.onEvent = matchesBeacon.create(this.cancel, equals2);
        this.IMediaControllerCallback = validateMac.create(this.getMin, this.getMax, this.cancel);
        this.onMetadataChanged = IntentHandler.create(this.getMin, this.getMax, this.cancel, this.RatingCompat$StarStyle);
        this.onQueueTitleChanged = toUuid.create(this.setMax);
        this.onQueueChanged = didDetermineStateForRegion.create(this.cancel);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.onSessionDestroyed = onnavigationevent;
        this.onPlaybackStateChanged = BLEManager.AnonymousClass3.create(onnavigationevent);
        BLEManager.AnonymousClass4 create10 = BLEManager.AnonymousClass4.create(this.onSessionDestroyed);
        this.onShuffleModeChangedRemoved = create10;
        b.C0007b<BindInt> min12 = isScrap.getMin(OnCheckedChanged.length(this.ICustomTabsCallback$Default, this.MediaMetadataCompat$RatingKey, this.ICustomTabsCallback, this.INotificationSideChannel$Default, this.RatingCompat, this.RatingCompat$Style, this.onEvent, this.IMediaControllerCallback, this.INotificationSideChannel$Stub$Proxy, this.onMetadataChanged, this.onQueueTitleChanged, this.onQueueChanged, this.onPlaybackStateChanged, create10));
        this.onRepeatModeChanged = min12;
        b.C0007b<getPath> min13 = isScrap.getMin(Slide.getMin(this.mayLaunchUrl, this.postMessage, this.read, this.MediaMetadataCompat$LongKey, min12));
        this.onVolumeInfoChanged = min13;
        this.onExtrasChanged = isScrap.getMin(Fade.setMin(deepLinkModule2, min13));
        setMax setmax = new setMax(r32);
        this.onCaptioningEnabledChanged = setmax;
        this.IMediaControllerCallback$Stub = APWebMessagePort.APWebMessageCallback.create(this.getMin, this.getMax, setmax);
        this.IMediaSession = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create11 = GVLoadingView.create(this.getMin, this.getMax, this.MediaBrowserCompat$MediaItem$Flags);
        this.onSessionReady = create11;
        b.C0007b<setStartDelay> min14 = isScrap.getMin(setInterpolator.setMin(this.onExtrasChanged, this.IMediaControllerCallback$Stub, this.IMediaSession, create11));
        this.IMediaControllerCallback$Stub$Proxy = min14;
        this.onShuffleModeChanged = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min14));
        this.registerCallbackListener = getMonitoredRegions.create(this.getMin, this.getMax, this.values);
        b.C0007b<getTitleIcon_White.getMin> min15 = isScrap.getMin(getLastMonth.setMax(sendMoneyLandingModule));
        this.isTransportControlEnabled = min15;
        getIconListDrawable min16 = getIconListDrawable.setMin(this.registerCallbackListener, min15);
        this.sendMediaButton = min16;
        this.sendCommand = isScrap.getMin(ImageObserver.SafeRunnable.setMax(sendMoneyLandingModule, min16));
    }

    public static final class length {
        public PrepareException.AnonymousClass1 FastBitmap$CoordinateSystem;
        public SendMoneyLandingModule IsOverlapping;
        public FeatureModule equals;
        public DeepLinkModule getMax;
        public ScanQrModule getMin;
        public ServicesModule isInside;
        public RecipientActivityModule length;
        public RestoreUrlModule setMax;
        public BottomSheetOnBoardingModule setMin;
        public OauthModule toFloatRange;
        public BillerX2BModule toIntRange;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getCause implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        getCause(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMax.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMin;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getScheme min = this.setMin.getMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMax;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> {
        private final PrepareException.AnonymousClass1 getMin;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            OpenAPIBridgeExtension.AnonymousClass1.C00041 INotificationSideChannel$Stub$Proxy = this.getMin.INotificationSideChannel$Stub$Proxy();
            if (INotificationSideChannel$Stub$Proxy != null) {
                return INotificationSideChannel$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<fromInt> {
        private final PrepareException.AnonymousClass1 setMin;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            fromInt onNavigationEvent = this.setMin.onNavigationEvent();
            if (onNavigationEvent != null) {
                return onNavigationEvent;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<getBeaconSimulator> {
        private final PrepareException.AnonymousClass1 getMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getBeaconSimulator isTransportControlEnabled = this.getMin.isTransportControlEnabled();
            if (isTransportControlEnabled != null) {
                return isTransportControlEnabled;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.setMin.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class create implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMin;

        create(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.setMin.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.setMin.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 getMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
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

    static class onRelationshipValidationResult implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMax;

        onRelationshipValidationResult(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 length;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 getMax;

        toString(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 length;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.length.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 getMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getAppPerfKey ICustomTabsService$Stub$Proxy = this.getMax.ICustomTabsService$Stub$Proxy();
            if (ICustomTabsService$Stub$Proxy != null) {
                return ICustomTabsService$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class b implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 setMax;

        b(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.setMax.ITrustedWebActivityService$Default();
            if (ITrustedWebActivityService$Default != null) {
                return ITrustedWebActivityService$Default;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMax;

        values(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.setMax.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
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

    static class equals implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMin;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class onNavigationEvent implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMin;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            onCharacteristicChanged write = this.getMin.write();
            if (write != null) {
                return write;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setSupportZoom ICustomTabsService$Stub = this.setMin.ICustomTabsService$Stub();
            if (ICustomTabsService$Stub != null) {
                return ICustomTabsService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void getMax(SendMoneyActivity sendMoneyActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.setMin.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(sendMoneyActivity, IPostMessageService$Stub$Proxy2);
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
                            matchInfo.length(sendMoneyActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            AnimationUtil.OnAnimationRepeatListener.setMin(sendMoneyActivity, this.toDoubleRange.get());
                            AnimationUtil.OnAnimationRepeatListener.getMax(sendMoneyActivity, this.create.get());
                            AnimationUtil.OnAnimationRepeatListener.length(sendMoneyActivity, this.onMessageChannelReady.get());
                            AnimationUtil.OnAnimationRepeatListener.setMin(sendMoneyActivity, this.onShuffleModeChanged.get());
                            AnimationUtil.OnAnimationRepeatListener.setMin(sendMoneyActivity, this.sendCommand.get());
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
