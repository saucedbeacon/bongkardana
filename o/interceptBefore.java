package o;

import android.app.Activity;
import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.login.HoldLoginModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.MixpanelEnableModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.SplashModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.onboarding.splash.SplashActivity;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverMonitor;
import o.GriverOpenAuthExtension;
import o.GriverPrepareInterceptor;
import o.GriverRVConfigServiceImpl;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.ShareRecyclerAdapter;
import o.Slide;
import o.Transition;
import o.b;
import o.getRunningAnimators;
import o.inTransaction;
import o.onAnimationEnd;
import o.registerDataSetObserver;
import o.setMap;
import o.stopMonitorMemoryWarning;
import o.style;

public final class interceptBefore implements readAll {
    private b.C0007b<R.id.length> FastBitmap$CoordinateSystem;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> Grayscale$Algorithm;
    private b.C0007b<onDescriptorWrite> ICustomTabsCallback;
    private b.C0007b<setBackButton> ICustomTabsCallback$Default;
    private b.C0007b<MovableFrameLayout> ICustomTabsCallback$Stub;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getAppPerfKey> ICustomTabsService;
    private b.C0007b<isTransitionRequired> ICustomTabsService$Default;
    private b.C0007b<getMode> ICustomTabsService$Stub;
    private b.C0007b<queryAppInfo> ICustomTabsService$Stub$Proxy;
    private b.C0007b<AutoTransition.length> IMediaControllerCallback;
    private b.C0007b<collect> IMediaControllerCallback$Stub;
    private b.C0007b<StartRMData> IMediaControllerCallback$Stub$Proxy;
    private b.C0007b<applyChanges> IMediaSession;
    private b.C0007b<notifyCharacteristicValue> INotificationSideChannel;
    private b.C0007b<getPlatformCallback> INotificationSideChannel$Default;
    private b.C0007b<onAnimationEnd.length> INotificationSideChannel$Stub;
    private b.C0007b<style.getMin> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<getTransitionValues> IPostMessageService;
    private b.C0007b<toUuidString> IPostMessageService$Default;
    private b.C0007b<getUniqueId> IPostMessageService$Stub;
    private b.C0007b<OrientationDetector.OrientationListener> IPostMessageService$Stub$Proxy;
    private b.C0007b<getRunningAnimators.getMin> ITrustedWebActivityCallback;
    private b.C0007b<GetAuthCode> ITrustedWebActivityCallback$Default;
    private b.C0007b<APWebSettings.LayoutAlgorithm> ITrustedWebActivityCallback$Stub;
    private b.C0007b<enableBackButton> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<setEpicenterCallback> ITrustedWebActivityService;
    private b.C0007b<KitUtils> ITrustedWebActivityService$Default;
    private b.C0007b<checkBitmap> ITrustedWebActivityService$Stub;
    private b.C0007b<GriverCreatePromptParam> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<hasSameIdentifiers> IconCompatParcelizer;
    private b.C0007b<registerDataSetObserver.setMax> IsOverlapping;
    private b.C0007b<getTinyLocalStorageInfo> Mean$Arithmetic;
    private b.C0007b<onConnect> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<toByteArray> MediaBrowserCompat$MediaItem;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<onCharacteristicChanged> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<didExitRegion> MediaDescriptionCompat;
    private b.C0007b<APWebResourceRequest> MediaMetadataCompat;
    private b.C0007b<BindInt> MediaMetadataCompat$BitmapKey;
    private b.C0007b<AutoTransition.setMax> MediaMetadataCompat$LongKey;
    private b.C0007b<getPath> MediaMetadataCompat$RatingKey;
    private b.C0007b<setSupportZoom> MediaMetadataCompat$TextKey;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> RatingCompat;
    private b.C0007b<Slide.GravityFlag> RatingCompat$StarStyle;
    private b.C0007b<GriverOpenAuthExtension.RevokeCallback> RatingCompat$Style;
    private b.C0007b<convertIntentsToCallbacks> RemoteActionCompatParcelizer;
    private b.C0007b<getBatteryInfo> addQueueItemAt;
    private b.C0007b<createBleDevice> adjustVolume;
    private b.C0007b<getBlockNetworkImage> areNotificationsEnabled;
    private b.C0007b<setPageCacheCapacity> asBinder;
    private b.C0007b<BindView.setMin> asInterface;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> b;
    private b.C0007b<onDisconnect> cancel;
    private b.C0007b<onCharacteristicWriteCompleted> cancelAll;
    private b.C0007b<getRunningAnimators.setMax> cancelNotification;
    private b.C0007b<requestAppWithAppId> create;
    private b.C0007b<getItemPosition> equals;
    private b.C0007b<BindView.setMax> extraCallback;
    private b.C0007b<OnItemLongClick> extraCallbackWithResult;
    private b.C0007b<getScanJobRuntimeMillis> extraCommand;
    private b.C0007b<getAllInstallFiles> getActiveNotifications;
    private b.C0007b<R.styleable> getCause;
    private b.C0007b<H5Utils> getDefaultImpl;
    private b.C0007b<setToolbarMenus> getExtras;
    private b.C0007b<BleDevice> getFlags;
    private b.C0007b<onJsBeforeUnload> getInterfaceDescriptor;
    private b.C0007b<disconnectBluetoothDevice> getLaunchPendingIntent;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<GriverMonitor> getMetadata;
    private b.C0007b<appxLoadFailed> getMin;
    private b.C0007b<setDefaultFixedFontSize> getPackageName;
    private b.C0007b<sendData> getPlaybackState;
    private b.C0007b<ShareRecyclerAdapter.ShareViewHolder> getQueue;
    private b.C0007b<success> getQueueTitle;
    private b.C0007b<setMap.getMax> getRatingType;
    private b.C0007b<inTransaction.getMin> getRepeatMode;
    private b.C0007b<inTransaction.getMax> getShuffleMode;
    private b.C0007b<onAnimationEnd.getMin> getSmallIconBitmap;
    private b.C0007b<getCommonResources> getSmallIconId;
    private b.C0007b<pageDown> getTag;
    private b.C0007b<BetterBleServiceImpl> getVolumeAttributes;
    private b.C0007b<method> hashCode;
    private b.C0007b<setDataRequestNotifier> invoke;
    private b.C0007b<setDefaultFontSize> invokeSuspend;
    private b.C0007b<createAllTables> isCaptioningEnabled;
    private b.C0007b<UpdateAppCallback> isInside;
    private b.C0007b<onFirstVisuallyRender> isShuffleModeEnabledRemoved;
    private b.C0007b<GriverCreateDialogParam> isTransportControlEnabled;
    private b.C0007b<getScheme> length;
    private b.C0007b<updateFootState> mayLaunchUrl;
    private b.C0007b<applySettingsToScheduledJob> newSession;
    private b.C0007b<setInitTextColor> newSessionWithExtras;
    private b.C0007b<shouldShowRevokeOpenAuthItem> notify;
    private b.C0007b<getTargets> notifyNotificationWithChannel;
    private b.C0007b<setWebMessageCallback> onCaptioningEnabledChanged;
    private b.C0007b<APWebHistoryItem> onEvent;
    private b.C0007b<parseBatteryPercentage> onExtraCallback;
    private b.C0007b<getMediaPlaybackRequiresUserGesture> onExtrasChanged;
    private b.C0007b<OnFocusChange> onMessageChannelReady;
    private b.C0007b<isInnerApp> onMetadataChanged;
    private b.C0007b<R.id.getMax> onNavigationEvent;
    private b.C0007b<getCursiveFontFamily> onPlaybackStateChanged;
    private b.C0007b<AndroidModel> onPostMessage;
    private b.C0007b<CustomPopMenuExtension> onQueueChanged;
    private b.C0007b<setMap.length> onQueueTitleChanged;
    private b.C0007b<DataProviderException> onRelationshipValidationResult;
    private b.C0007b<clearCache> onRepeatModeChanged;
    private b.C0007b<GriverMonitor.AnonymousClass4> onSessionDestroyed;
    private b.C0007b<GriverParseFailedPoint> onSessionReady;
    private b.C0007b<GVErrorView> onShuffleModeChanged;
    private b.C0007b<GriverInnerConfig> onShuffleModeChangedRemoved;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onTransact;
    private b.C0007b<setBuiltInZoomControls> onVolumeInfoChanged;
    private b.C0007b<setNetworkAvailable> postMessage;
    private b.C0007b<Region$1> read;
    private b.C0007b<getCancelable> receiveFile;
    private b.C0007b<OptionMenu> registerCallbackListener;
    private b.C0007b<stopMonitorMemoryWarning.getMin> removeQueueItem;
    private b.C0007b<setSceneRoot> requestPostMessageChannel;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> requestPostMessageChannelWithExtras;
    private b.C0007b<defaultToolbarMenus> sendCommand;
    private b.C0007b<setBlockNetworkImage> sendMediaButton;
    private b.C0007b<addChooseImageCrossOrigin> setDefaultImpl;
    private b.C0007b<registerDataSetObserver.getMin> setMax;
    private b.C0007b<GriverLogger> setMin;
    private b.C0007b<OpenSettingItem> setVolumeTo;
    private b.C0007b<GriverPrepareInterceptor> toDoubleRange;
    private b.C0007b<Context> toFloatRange;
    private b.C0007b<GriverRVLoggerProxyImpl> toIntRange;
    private b.C0007b<Activity> toString;
    private b.C0007b<createSplashView> unregisterCallbackListener;
    private b.C0007b<canGoBackOrForward> updateVisuals;
    private b.C0007b<getPropagation> validateRelationship;
    private b.C0007b<getPerformanceTracker> valueOf;
    private b.C0007b<ResourceProviderExtension> values;
    private b.C0007b<getEpicenter> warmup;
    private b.C0007b<onWebViewDestory> write;

    public /* synthetic */ interceptBefore(SplashModule splashModule, HoldLoginModule holdLoginModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, LogoutModule logoutModule, MixpanelEnableModule mixpanelEnableModule, PrepareException.AnonymousClass1 r11, byte b2) {
        this(splashModule, holdLoginModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, logoutModule, mixpanelEnableModule, r11);
    }

    private interceptBefore(SplashModule splashModule, HoldLoginModule holdLoginModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, LogoutModule logoutModule, MixpanelEnableModule mixpanelEnableModule, PrepareException.AnonymousClass1 r41) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r41;
        this.getMax = r6;
        this.setMax = isScrap.getMin(setViewPagerObserver.setMax(holdLoginModule));
        this.getMin = new getCause(r6);
        this.length = new invoke(r6);
        interceptBefore$FastBitmap$CoordinateSystem interceptbefore_fastbitmap_coordinatesystem = new interceptBefore$FastBitmap$CoordinateSystem(r6);
        this.setMin = interceptbefore_fastbitmap_coordinatesystem;
        this.toIntRange = diagnoseExist.create(this.getMin, this.length, interceptbefore_fastbitmap_coordinatesystem);
        this.toFloatRange = new getMax(r6);
        interceptBefore$Mean$Arithmetic interceptbefore_mean_arithmetic = new interceptBefore$Mean$Arithmetic(r6);
        this.isInside = interceptbefore_mean_arithmetic;
        b.C0007b<getItemPosition> min = isScrap.getMin(setTabIndicatorColorResource.getMin(this.setMax, this.toIntRange, this.toFloatRange, interceptbefore_mean_arithmetic));
        this.equals = min;
        this.IsOverlapping = isScrap.getMin(getPageTitle.length(holdLoginModule, min));
        b.C0007b<Activity> min2 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.toString = min2;
        b.C0007b<method> min3 = isScrap.getMin(type.getMax(min2));
        this.hashCode = min3;
        this.FastBitmap$CoordinateSystem = isScrap.getMin(R.integer.setMin(scanQrModule2, min3));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.toDoubleRange = invokesuspend;
        this.values = GriverPrepareInterceptor.AnonymousClass2.create(this.getMin, this.length, invokesuspend);
        this.Grayscale$Algorithm = beforeQuery.create(this.getMin, this.length, this.toDoubleRange);
        this.Mean$Arithmetic = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.valueOf = new toFloatRange(r6);
        equals equals2 = new equals(r6);
        this.invokeSuspend = equals2;
        this.invoke = getDataRequestNotifier.create(equals2);
        onRelationshipValidationResult onrelationshipvalidationresult = new onRelationshipValidationResult(r6);
        this.ICustomTabsCallback = onrelationshipvalidationresult;
        this.b = onCharacteristicWrite.create(onrelationshipvalidationresult, this.getMin, this.length);
        localIdToBytes create2 = localIdToBytes.create(this.toDoubleRange);
        this.create = create2;
        b.C0007b<R.styleable> min4 = isScrap.getMin(Setter.length(this.toFloatRange, this.FastBitmap$CoordinateSystem, this.values, this.Grayscale$Algorithm, this.Mean$Arithmetic, this.valueOf, this.invoke, this.b, create2));
        this.getCause = min4;
        this.onNavigationEvent = isScrap.getMin(R.drawable.setMin(scanQrModule2, min4));
        b.C0007b<OnItemLongClick> min5 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.extraCallbackWithResult = min5;
        this.extraCallback = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min5));
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.onPostMessage = onnavigationevent;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.getMin, this.length, onnavigationevent);
        this.onRelationshipValidationResult = create3;
        b.C0007b<OnFocusChange> min6 = isScrap.getMin(OnEditorAction.getMin(this.extraCallback, create3));
        this.onMessageChannelReady = min6;
        this.asInterface = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min6));
        hashCode hashcode = new hashCode(r6);
        this.onTransact = hashcode;
        this.ICustomTabsCallback$Stub = GriverBizManifest.create(this.getMin, this.length, hashcode);
        this.asBinder = APWebSettings.PluginState.create(this.invokeSuspend);
        this.ICustomTabsCallback$Default = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.ICustomTabsCallback$Stub$Proxy = todoublerange;
        this.getInterfaceDescriptor = onConsoleMessage.create(this.getMin, this.length, todoublerange);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.getDefaultImpl = iCustomTabsCallback;
        this.setDefaultImpl = H5ResourceCORSUtil.AnonymousClass1.create(this.getMin, this.length, iCustomTabsCallback);
        toString tostring = new toString(r6);
        this.ICustomTabsService = tostring;
        this.warmup = capturePropagationValues.getMin(this.setDefaultImpl, tostring);
        b bVar = new b(r6);
        this.extraCommand = bVar;
        this.newSession = ScanState.create(this.getMin, this.length, bVar);
        this.newSessionWithExtras = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.newSessionWithExtras);
        this.mayLaunchUrl = length2;
        this.requestPostMessageChannel = Transition.MatchOrder.length(this.newSession, length2);
        this.updateVisuals = setInitialScale.create(this.getMin, this.length, this.invokeSuspend);
        postUrl create4 = postUrl.create(this.getMin, this.length, this.invokeSuspend);
        this.postMessage = create4;
        this.validateRelationship = getName.setMin(this.updateVisuals, create4, manuallyReleaseCamera.setMax());
        valueOf valueof = new valueOf(r6);
        this.requestPostMessageChannelWithExtras = valueof;
        saveAppInfos create5 = saveAppInfos.create(valueof);
        this.ICustomTabsService$Stub$Proxy = create5;
        this.IPostMessageService = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.ICustomTabsService$Default = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min7 = isScrap.getMin(getCancelOnTouchOutside.create(this.toFloatRange));
        this.receiveFile = min7;
        b.C0007b<getMode> min8 = isScrap.getMin(onDisappear.length(this.ICustomTabsCallback$Stub, this.asBinder, this.ICustomTabsCallback$Default, this.getInterfaceDescriptor, this.warmup, this.requestPostMessageChannel, this.validateRelationship, this.IPostMessageService, this.ICustomTabsService$Default, min7, this.invoke));
        this.ICustomTabsService$Stub = min8;
        this.ITrustedWebActivityCallback = isScrap.getMin(setDuration.getMax(featureModule2, min8));
        create create6 = new create(r6);
        this.IPostMessageService$Default = create6;
        this.IPostMessageService$Stub = didRangeBeaconsInRegion.create(this.getMin, this.length, create6);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.toFloatRange);
        this.IPostMessageService$Stub$Proxy = max;
        this.onExtraCallback = getSystemInfo.setMax(max);
        getMin getmin = new getMin(r6);
        this.ITrustedWebActivityCallback$Stub$Proxy = getmin;
        setOptionMenu create7 = setOptionMenu.create(getmin);
        this.ITrustedWebActivityCallback$Default = create7;
        this.ITrustedWebActivityService = isScrap.getMin(setPropagation.length(this.ITrustedWebActivityCallback, this.IPostMessageService$Stub, this.onExtraCallback, create7, this.valueOf));
        this.areNotificationsEnabled = getLoadsImagesAutomatically.create(this.getMin, this.length, this.invokeSuspend);
        this.ITrustedWebActivityCallback$Stub = setWebContentsDebuggingEnabled.create(this.invokeSuspend);
        installPathExist create8 = installPathExist.create(this.invokeSuspend);
        this.getActiveNotifications = create8;
        b.C0007b<getTargets> min9 = isScrap.getMin(addViewValues.length(this.ITrustedWebActivityCallback, this.ITrustedWebActivityService, this.areNotificationsEnabled, this.ITrustedWebActivityCallback$Stub, create8));
        this.notifyNotificationWithChannel = min9;
        this.cancelNotification = isScrap.getMin(parseMatchOrder.length(featureModule2, min9));
        this.getSmallIconBitmap = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        setMin setmin = new setMin(r6);
        this.getSmallIconId = setmin;
        this.notify = GriverOpenAuthExtension.create(setmin);
        this.INotificationSideChannel = BLEManager.AnonymousClass2.create(this.getMin, this.length, this.ICustomTabsCallback);
        this.ITrustedWebActivityService$Stub$Proxy = GriverDialogExtension.create(this.getMin, this.length, this.getSmallIconId);
        this.ITrustedWebActivityService$Default = checkSuffixSupported.create(this.invokeSuspend);
        this.ITrustedWebActivityService$Stub = isImage.create(this.invokeSuspend);
        getFillColor max2 = getFillColor.setMax(this.getSmallIconBitmap, startListenScreenshot.setMin(), this.notify, this.INotificationSideChannel, this.ITrustedWebActivityService$Stub$Proxy, this.ITrustedWebActivityService$Default, this.ITrustedWebActivityService$Stub);
        this.INotificationSideChannel$Default = max2;
        this.INotificationSideChannel$Stub = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.INotificationSideChannel$Stub$Proxy = BindFont.length(servicesModule);
        onMessageChannelReady onmessagechannelready = new onMessageChannelReady(r6);
        this.cancel = onmessagechannelready;
        this.cancelAll = onStartBleScan.create(this.getMin, this.length, onmessagechannelready);
        this.MediaBrowserCompat$CustomActionResultReceiver = onGetBluetoothCharacteristics.create(this.getMin, this.length, this.cancel);
        values values2 = new values(r6);
        this.write = values2;
        this.IconCompatParcelizer = matchesBeacon.create(this.IPostMessageService$Default, values2);
        this.read = validateMac.create(this.getMin, this.length, this.IPostMessageService$Default);
        this.RemoteActionCompatParcelizer = IntentHandler.create(this.getMin, this.length, this.IPostMessageService$Default, this.write);
        this.MediaBrowserCompat$MediaItem = toUuid.create(this.invokeSuspend);
        this.MediaDescriptionCompat = didDetermineStateForRegion.create(this.IPostMessageService$Default);
        onPostMessage onpostmessage = new onPostMessage(r6);
        this.MediaBrowserCompat$SearchResultReceiver = onpostmessage;
        this.MediaBrowserCompat$MediaItem$Flags = BLEManager.AnonymousClass3.create(onpostmessage);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaBrowserCompat$ItemReceiver = create9;
        b.C0007b<BindInt> min10 = isScrap.getMin(OnCheckedChanged.length(this.toFloatRange, this.INotificationSideChannel$Stub$Proxy, this.ITrustedWebActivityCallback$Default, this.onExtraCallback, this.cancelAll, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.read, this.IPostMessageService$Stub, this.RemoteActionCompatParcelizer, this.MediaBrowserCompat$MediaItem, this.MediaDescriptionCompat, this.MediaBrowserCompat$MediaItem$Flags, create9));
        this.MediaMetadataCompat$BitmapKey = min10;
        b.C0007b<getPath> min11 = isScrap.getMin(Slide.getMin(this.onNavigationEvent, this.asInterface, this.cancelNotification, this.INotificationSideChannel$Stub, min10));
        this.MediaMetadataCompat$RatingKey = min11;
        this.MediaMetadataCompat$LongKey = isScrap.getMin(Fade.setMin(deepLinkModule2, min11));
        PrepareException.AnonymousClass1 r3 = r41;
        IsOverlapping isOverlapping = new IsOverlapping(r3);
        this.MediaMetadataCompat$TextKey = isOverlapping;
        this.MediaMetadataCompat = APWebMessagePort.create(this.getMin, this.length, isOverlapping);
        this.onEvent = onCustomViewHidden.create(this.getMin, this.length, this.MediaMetadataCompat$TextKey);
        this.RatingCompat$Style = setAlign.create(this.getMin, this.length, this.getSmallIconId);
        onLocationChanged min12 = onLocationChanged.setMin(startListenScreenshot.setMin());
        this.RatingCompat = min12;
        b.C0007b<Slide.GravityFlag> min13 = isScrap.getMin(Transition.getMax(this.MediaMetadataCompat$LongKey, this.MediaMetadataCompat, this.onEvent, this.RatingCompat$Style, min12));
        this.RatingCompat$StarStyle = min13;
        this.IMediaControllerCallback = isScrap.getMin(PathMotion.getMax(deepLinkModule2, min13));
        writeDebugMonitor create10 = writeDebugMonitor.create(this.getMin, this.length, this.setMin, this.write);
        this.onMetadataChanged = create10;
        this.onQueueChanged = isScrap.getMin(onSwitchToBlueTheme.length(create10, this.valueOf, this.toFloatRange));
        this.onQueueTitleChanged = isScrap.getMin(getIdentifier.setMin(splashModule));
        this.onSessionDestroyed = GriverMonitor.AnonymousClass5.create(this.getMin, this.length, this.setMin);
        length length3 = new length(r3);
        this.onPlaybackStateChanged = length3;
        this.onRepeatModeChanged = clearFormData.create(this.getMin, this.length, length3);
        isInside isinside = new isInside(r3);
        this.onExtrasChanged = isinside;
        this.onVolumeInfoChanged = supportZoom.create(this.getMin, this.length, isinside);
        this.onCaptioningEnabledChanged = hasGesture.create(this.MediaMetadataCompat$TextKey);
        this.onShuffleModeChangedRemoved = GriverRVConfigServiceImpl.AnonymousClass1.create(this.invokeSuspend);
        interceptBefore$Grayscale$Algorithm interceptbefore_grayscale_algorithm = new interceptBefore$Grayscale$Algorithm(r3);
        this.IMediaSession = interceptbefore_grayscale_algorithm;
        this.IMediaControllerCallback$Stub$Proxy = SettingsData.create(this.getMin, this.length, interceptbefore_grayscale_algorithm);
        this.IMediaControllerCallback$Stub = getRegionData.create(this.getMin, this.length, this.IMediaSession);
        this.onShuffleModeChanged = GriverLoadingViewExtension.create(this.getMin, this.length, this.getSmallIconId);
        this.onSessionReady = GriverResourcePresetProxy.create(this.getMin, this.length, this.getSmallIconId);
        this.unregisterCallbackListener = GriverLocalAuthDialogExtension.create(this.getMin, this.length, this.getSmallIconId);
        this.sendCommand = optionMenuClicked.create(this.getMin, this.length, this.getSmallIconId);
        this.isTransportControlEnabled = GVLoadingView.create(this.getMin, this.length, this.getSmallIconId);
        this.registerCallbackListener = getRedDot.create(this.getMin, this.length, this.getSmallIconId);
        this.sendMediaButton = setJavaScriptEnabled.create(this.getMin, this.length, this.invokeSuspend);
        this.getPackageName = setAppCacheEnabled.create(this.getMin, this.length, this.invokeSuspend);
        this.getTag = goBackOrForward.create(this.invokeSuspend);
        extraCallback extracallback = new extraCallback(r3);
        this.getLaunchPendingIntent = extracallback;
        this.getVolumeAttributes = notifyCharacteristicValueChange.create(this.getMin, this.length, extracallback);
        this.getFlags = createCharacteristic.create(this.getMin, this.length, this.getLaunchPendingIntent);
        this.adjustVolume = BleGattCharacteristic.create(this.getMin, this.length, this.getLaunchPendingIntent);
        this.getMetadata = getCommonExceptionMap.create(this.getMin, this.length, this.setMin, this.write);
        this.getPlaybackState = onConnectionStateChange.create(this.getMin, this.length, this.ICustomTabsCallback);
        ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1 min14 = ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1.setMin(setAllBucketName.setMax());
        this.getQueue = min14;
        b.C0007b<OpenSettingItem> min15 = isScrap.getMin(AccelerometerSensorService.getMax(this.onQueueTitleChanged, this.onSessionDestroyed, this.onRepeatModeChanged, this.onVolumeInfoChanged, this.onCaptioningEnabledChanged, this.onShuffleModeChangedRemoved, this.IMediaControllerCallback$Stub$Proxy, this.IMediaControllerCallback$Stub, this.onShuffleModeChanged, this.onSessionReady, this.RatingCompat$Style, this.unregisterCallbackListener, this.sendCommand, this.isTransportControlEnabled, this.registerCallbackListener, this.sendMediaButton, this.getPackageName, this.getTag, this.getVolumeAttributes, this.getFlags, this.adjustVolume, this.getMetadata, this.valueOf, this.toFloatRange, this.getPlaybackState, min14));
        this.setVolumeTo = min15;
        this.getRatingType = isScrap.getMin(startFailed.length(splashModule, min15));
        this.getRepeatMode = isScrap.getMin(StringCodec.length(logoutModule));
        toIntRange tointrange = new toIntRange(r3);
        this.getQueueTitle = tointrange;
        ToolbarMenuOption create11 = ToolbarMenuOption.create(tointrange);
        this.getExtras = create11;
        b.C0007b<createAllTables> min16 = isScrap.getMin(dropAllTables.getMin(this.toFloatRange, this.getRepeatMode, this.getMetadata, this.valueOf, create11));
        this.isCaptioningEnabled = min16;
        this.getShuffleMode = isScrap.getMin(getClazz.setMin(logoutModule, min16));
        shouldInterceptResponse create12 = shouldInterceptResponse.create(this.getMin, this.length, this.invokeSuspend);
        this.isShuffleModeEnabledRemoved = create12;
        startMonitorMemoryWarning max3 = startMonitorMemoryWarning.setMax(create12);
        this.addQueueItemAt = max3;
        this.removeQueueItem = castToBytes.length(mixpanelEnableModule, max3);
    }

    public static final class setMax {
        public MixpanelEnableModule IsOverlapping;
        public OauthModule equals;
        public DeepLinkModule getMax;
        public RestoreUrlModule getMin;
        public PrepareException.AnonymousClass1 hashCode;
        public ServicesModule isInside;
        public HoldLoginModule length;
        public ScanQrModule setMax;
        public SplashModule setMin;
        public LogoutModule toFloatRange;
        public FeatureModule toIntRange;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class getCause implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        getCause(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class invokeSuspend implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 setMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
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

    static class onRelationshipValidationResult implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 length;

        onRelationshipValidationResult(PrepareException.AnonymousClass1 r1) {
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

    static class onNavigationEvent implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 getMin;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            AndroidModel IPostMessageService = this.getMin.IPostMessageService();
            if (IPostMessageService != null) {
                return IPostMessageService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class hashCode implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 setMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.setMax.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class ICustomTabsCallback implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 getMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMin;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getAppPerfKey ICustomTabsService$Stub$Proxy = this.setMin.ICustomTabsService$Stub$Proxy();
            if (ICustomTabsService$Stub$Proxy != null) {
                return ICustomTabsService$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class b implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 length;

        b(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    static class create implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 length;

        create(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class onMessageChannelReady implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 getMin;

        onMessageChannelReady(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            onDisconnect RemoteActionCompatParcelizer = this.getMin.RemoteActionCompatParcelizer();
            if (RemoteActionCompatParcelizer != null) {
                return RemoteActionCompatParcelizer;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMax;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class onPostMessage implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMax;

        onPostMessage(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<getMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 getMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getMediaPlaybackRequiresUserGesture cancelNotification = this.getMax.cancelNotification();
            if (cancelNotification != null) {
                return cancelNotification;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class extraCallback implements b.C0007b<disconnectBluetoothDevice> {
        private final PrepareException.AnonymousClass1 getMin;

        extraCallback(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            disconnectBluetoothDevice onMessageChannelReady = this.getMin.onMessageChannelReady();
            if (onMessageChannelReady != null) {
                return onMessageChannelReady;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<success> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    public final void length(SplashActivity splashActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(splashActivity, IPostMessageService$Stub$Proxy2);
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
                            matchInfo.length(splashActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            getPerformanceTracker onTransact2 = this.getMax.onTransact();
                            if (onTransact2 != null) {
                                WifiUtils.getMax(splashActivity, onTransact2);
                                WifiUtils.setMax(splashActivity, isScrap.getMax(this.IsOverlapping));
                                WifiUtils.setMin(splashActivity, isScrap.getMax(this.IMediaControllerCallback));
                                WifiUtils.getMin(splashActivity, this.onQueueChanged.get());
                                WifiUtils.getMax(splashActivity, isScrap.getMax(this.getRatingType));
                                WifiUtils.getMin(splashActivity, isScrap.getMax(this.getShuffleMode));
                                WifiUtils.length(splashActivity, isScrap.getMax(this.removeQueueItem));
                                isAlipayApp onExtrasChanged2 = this.getMax.onExtrasChanged();
                                if (onExtrasChanged2 != null) {
                                    WifiUtils.getMax(splashActivity, onExtrasChanged2);
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
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
