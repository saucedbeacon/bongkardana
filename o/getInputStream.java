package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.globalsearch.GlobalSearchModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.explore.popularplaces.PopularPlacesModule;
import id.dana.explore.view.ExploreDanaFragment;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.CommonAbilityManifest;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverPrepareInterceptor;
import o.GriverTransport;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.ImageLoader;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.RenderLoadingStatusChangePoint;
import o.Transition;
import o.UcService;
import o.b;
import o.getAlpha;
import o.getDuration;
import o.getRunningAnimators;
import o.hexStringToBytes;
import o.onAnimationEnd;
import o.style;

public final class getInputStream implements GriverResourceLoadExtension {
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> FastBitmap$CoordinateSystem;
    private b.C0007b<R.id.getMax> Grayscale$Algorithm;
    private b.C0007b<BindView.setMax> ICustomTabsCallback;
    private b.C0007b<onJsBeforeUnload> ICustomTabsCallback$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Stub;
    private b.C0007b<setInitTextColor> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getScanJobRuntimeMillis> ICustomTabsService;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsService$Default;
    private b.C0007b<getUniqueId> ICustomTabsService$Stub;
    private b.C0007b<getRunningAnimators.getMin> ICustomTabsService$Stub$Proxy;
    private b.C0007b<workerType> IMediaControllerCallback;
    private b.C0007b<GriverRVTransortServiceImpl> IMediaControllerCallback$Stub;
    private b.C0007b<getAlpha.length> IMediaControllerCallback$Stub$Proxy;
    private b.C0007b<downloadPath> IMediaSession;
    private b.C0007b<onAnimationEnd.length> INotificationSideChannel;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Default;
    private b.C0007b<Region$1> INotificationSideChannel$Stub;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<parseBatteryPercentage> IPostMessageService;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IPostMessageService$Default;
    private b.C0007b<enableBackButton> IPostMessageService$Stub;
    private b.C0007b<GetAuthCode> IPostMessageService$Stub$Proxy;
    private b.C0007b<getBlockNetworkImage> ITrustedWebActivityCallback;
    private b.C0007b<getAllInstallFiles> ITrustedWebActivityCallback$Default;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityCallback$Stub;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getTargets> ITrustedWebActivityService;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Default;
    private b.C0007b<style.getMin> ITrustedWebActivityService$Stub;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<onCharacteristicChanged> IconCompatParcelizer;
    private b.C0007b<appxLoadFailed> IsOverlapping;
    private b.C0007b<requestAppWithAppId> Mean$Arithmetic;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<onMessage> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$MediaItem;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<BindInt> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<AutoTransition.setMax> MediaDescriptionCompat;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$BitmapKey;
    private b.C0007b<setStartDelay> MediaMetadataCompat$LongKey;
    private b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> MediaMetadataCompat$RatingKey;
    private b.C0007b<getDuration.length> MediaMetadataCompat$TextKey;
    private b.C0007b<unRegisterStatusListener> RatingCompat;
    private b.C0007b<ImageLoader.AnonymousClass2> RatingCompat$StarStyle;
    private b.C0007b<GriverAccount> RatingCompat$Style;
    private b.C0007b<toByteArray> RemoteActionCompatParcelizer;
    private b.C0007b<getCommonResources> areNotificationsEnabled;
    private b.C0007b<H5Utils> asBinder;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> asInterface;
    private b.C0007b<OnFocusChange> b;
    private b.C0007b<onConnect> cancel;
    private b.C0007b<onWebViewDestory> cancelAll;
    private b.C0007b<KitUtils> cancelNotification;
    private b.C0007b<AndroidModel> create;
    private b.C0007b<ResourceProviderExtension> equals;
    private b.C0007b<MovableFrameLayout> extraCallback;
    private b.C0007b<setBackButton> extraCallbackWithResult;
    private b.C0007b<canGoBackOrForward> extraCommand;
    private b.C0007b<shouldShowRevokeOpenAuthItem> getActiveNotifications;
    private b.C0007b<OnItemLongClick> getCause;
    private b.C0007b<applySettingsToScheduledJob> getDefaultImpl;
    private b.C0007b<getEpicenter> getInterfaceDescriptor;
    private b.C0007b<Activity> getMax;
    private final GlobalSearchModule getMin;
    private b.C0007b<GriverCreatePromptParam> getSmallIconBitmap;
    private b.C0007b<checkBitmap> getSmallIconId;
    private b.C0007b<setDataRequestNotifier> hashCode;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> invoke;
    private b.C0007b<onDescriptorWrite> invokeSuspend;
    private b.C0007b<getScheme> isInside;
    private b.C0007b<hexStringToBytes.getMax> isTransportControlEnabled;
    private final PrepareException.AnonymousClass1 length;
    private b.C0007b<setNetworkAvailable> mayLaunchUrl;
    private b.C0007b<setSceneRoot> newSession;
    private b.C0007b<getPropagation> newSessionWithExtras;
    private b.C0007b<getPlatformCallback> notify;
    private b.C0007b<notifyCharacteristicValue> notifyNotificationWithChannel;
    private b.C0007b<addInitSuccessListener> onCaptioningEnabledChanged;
    private b.C0007b<appendAll> onEvent;
    private b.C0007b<setEpicenterCallback> onExtraCallback;
    private b.C0007b<ShouldLoadUrlPoint> onExtrasChanged;
    private b.C0007b<setPageCacheCapacity> onMessageChannelReady;
    private b.C0007b<createWebViewForNebulaX> onMetadataChanged;
    private b.C0007b<DataProviderException> onNavigationEvent;
    private b.C0007b<onImage> onPlaybackStateChanged;
    private b.C0007b<BindView.setMin> onPostMessage;
    private b.C0007b<onLoadingStatusChanged> onQueueChanged;
    private b.C0007b<ImageLoader.AnonymousClass1> onQueueTitleChanged;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onRelationshipValidationResult;
    private b.C0007b<getAlpha.setMax> onRepeatModeChanged;
    private b.C0007b<shouldLoad> onSessionDestroyed;
    private b.C0007b<evaluateJavascript> onSessionReady;
    private b.C0007b<ParcelImpl> onShuffleModeChanged;
    private b.C0007b<removeInitSuccessListener> onShuffleModeChangedRemoved;
    private b.C0007b<addChooseImageCrossOrigin> onTransact;
    private b.C0007b<getOuterRootPath> onVolumeInfoChanged;
    private b.C0007b<isTransitionRequired> postMessage;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> read;
    private b.C0007b<toUuidString> receiveFile;
    private b.C0007b<hexStringToBytes.setMax> registerCallbackListener;
    private b.C0007b<getMode> requestPostMessageChannel;
    private b.C0007b<queryAppInfo> requestPostMessageChannelWithExtras;
    private b.C0007b<updateFootState> setDefaultImpl;
    private b.C0007b<Context> setMax;
    private b.C0007b<method> setMin;
    private b.C0007b<getPerformanceTracker> toDoubleRange;
    private b.C0007b<R.id.length> toFloatRange;
    private b.C0007b<GriverPrepareInterceptor> toIntRange;
    private b.C0007b<getTinyLocalStorageInfo> toString;
    private b.C0007b<hexStringToBytesInReverse> unregisterCallbackListener;
    private b.C0007b<getTransitionValues> updateVisuals;
    private b.C0007b<getCancelable> validateRelationship;
    private b.C0007b<R.styleable> valueOf;
    private b.C0007b<setDefaultFontSize> values;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> warmup;
    private b.C0007b<didExitRegion> write;

    public /* synthetic */ getInputStream(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, GlobalSearchModule globalSearchModule, PopularPlacesModule popularPlacesModule, PrepareException.AnonymousClass1 r9, byte b2) {
        this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, globalSearchModule, popularPlacesModule, r9);
    }

    private getInputStream(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, GlobalSearchModule globalSearchModule, PopularPlacesModule popularPlacesModule, PrepareException.AnonymousClass1 r32) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r7 = r32;
        this.length = r7;
        this.getMin = globalSearchModule;
        this.setMax = new getMax(r7);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.getMax = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.setMin = min2;
        this.toFloatRange = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.IsOverlapping = new getCause(r7);
        this.isInside = new hashCode(r7);
        valueOf valueof = new valueOf(r7);
        this.toIntRange = valueof;
        this.equals = GriverPrepareInterceptor.AnonymousClass2.create(this.IsOverlapping, this.isInside, valueof);
        this.FastBitmap$CoordinateSystem = beforeQuery.create(this.IsOverlapping, this.isInside, this.toIntRange);
        this.toString = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toDoubleRange = new isInside(r7);
        toFloatRange tofloatrange = new toFloatRange(r7);
        this.values = tofloatrange;
        this.hashCode = getDataRequestNotifier.create(tofloatrange);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r7);
        this.invokeSuspend = onnavigationevent;
        this.invoke = onCharacteristicWrite.create(onnavigationevent, this.IsOverlapping, this.isInside);
        localIdToBytes create2 = localIdToBytes.create(this.toIntRange);
        this.Mean$Arithmetic = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.setMax, this.toFloatRange, this.equals, this.FastBitmap$CoordinateSystem, this.toString, this.toDoubleRange, this.hashCode, this.invoke, create2));
        this.valueOf = min3;
        this.Grayscale$Algorithm = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.getCause = min4;
        this.ICustomTabsCallback = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invokeSuspend invokesuspend = new invokeSuspend(r7);
        this.create = invokesuspend;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.IsOverlapping, this.isInside, invokesuspend);
        this.onNavigationEvent = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.ICustomTabsCallback, create3));
        this.b = min5;
        this.onPostMessage = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        values values2 = new values(r7);
        this.onRelationshipValidationResult = values2;
        this.extraCallback = GriverBizManifest.create(this.IsOverlapping, this.isInside, values2);
        this.onMessageChannelReady = APWebSettings.PluginState.create(this.values);
        this.extraCallbackWithResult = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        toIntRange tointrange = new toIntRange(r7);
        this.asInterface = tointrange;
        this.ICustomTabsCallback$Default = onConsoleMessage.create(this.IsOverlapping, this.isInside, tointrange);
        invoke invoke2 = new invoke(r7);
        this.asBinder = invoke2;
        this.onTransact = H5ResourceCORSUtil.AnonymousClass1.create(this.IsOverlapping, this.isInside, invoke2);
        IsOverlapping isOverlapping = new IsOverlapping(r7);
        this.ICustomTabsCallback$Stub = isOverlapping;
        this.getInterfaceDescriptor = capturePropagationValues.getMin(this.onTransact, isOverlapping);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r7);
        this.ICustomTabsService = iCustomTabsCallback;
        this.getDefaultImpl = ScanState.create(this.IsOverlapping, this.isInside, iCustomTabsCallback);
        this.ICustomTabsCallback$Stub$Proxy = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.ICustomTabsCallback$Stub$Proxy);
        this.setDefaultImpl = length2;
        this.newSession = Transition.MatchOrder.length(this.getDefaultImpl, length2);
        this.extraCommand = setInitialScale.create(this.IsOverlapping, this.isInside, this.values);
        postUrl create4 = postUrl.create(this.IsOverlapping, this.isInside, this.values);
        this.mayLaunchUrl = create4;
        this.newSessionWithExtras = getName.setMin(this.extraCommand, create4, manuallyReleaseCamera.setMax());
        toString tostring = new toString(r7);
        this.warmup = tostring;
        saveAppInfos create5 = saveAppInfos.create(tostring);
        this.requestPostMessageChannelWithExtras = create5;
        this.updateVisuals = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.postMessage = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.setMax));
        this.validateRelationship = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.extraCallback, this.onMessageChannelReady, this.extraCallbackWithResult, this.ICustomTabsCallback$Default, this.getInterfaceDescriptor, this.newSession, this.newSessionWithExtras, this.updateVisuals, this.postMessage, min6, this.hashCode));
        this.requestPostMessageChannel = min7;
        this.ICustomTabsService$Stub$Proxy = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        getInputStream$Mean$Arithmetic getinputstream_mean_arithmetic = new getInputStream$Mean$Arithmetic(r7);
        this.receiveFile = getinputstream_mean_arithmetic;
        this.ICustomTabsService$Stub = didRangeBeaconsInRegion.create(this.IsOverlapping, this.isInside, getinputstream_mean_arithmetic);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.setMax);
        this.ICustomTabsService$Default = max;
        this.IPostMessageService = getSystemInfo.setMax(max);
        setMin setmin = new setMin(r7);
        this.IPostMessageService$Stub = setmin;
        setOptionMenu create6 = setOptionMenu.create(setmin);
        this.IPostMessageService$Stub$Proxy = create6;
        this.onExtraCallback = isScrap.getMin(setPropagation.length(this.ICustomTabsService$Stub$Proxy, this.ICustomTabsService$Stub, this.IPostMessageService, create6, this.toDoubleRange));
        this.ITrustedWebActivityCallback = getLoadsImagesAutomatically.create(this.IsOverlapping, this.isInside, this.values);
        this.IPostMessageService$Default = setWebContentsDebuggingEnabled.create(this.values);
        installPathExist create7 = installPathExist.create(this.values);
        this.ITrustedWebActivityCallback$Default = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.ICustomTabsService$Stub$Proxy, this.onExtraCallback, this.ITrustedWebActivityCallback, this.IPostMessageService$Default, create7));
        this.ITrustedWebActivityService = min8;
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityCallback$Stub$Proxy = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMin getmin = new getMin(r7);
        this.areNotificationsEnabled = getmin;
        this.getActiveNotifications = GriverOpenAuthExtension.create(getmin);
        this.notifyNotificationWithChannel = BLEManager.AnonymousClass2.create(this.IsOverlapping, this.isInside, this.invokeSuspend);
        this.getSmallIconBitmap = GriverDialogExtension.create(this.IsOverlapping, this.isInside, this.areNotificationsEnabled);
        this.cancelNotification = checkSuffixSupported.create(this.values);
        this.getSmallIconId = isImage.create(this.values);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Stub$Proxy, startListenScreenshot.setMin(), this.getActiveNotifications, this.notifyNotificationWithChannel, this.getSmallIconBitmap, this.cancelNotification, this.getSmallIconId);
        this.notify = max2;
        this.INotificationSideChannel = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.ITrustedWebActivityService$Stub = BindFont.length(servicesModule);
        create create8 = new create(r7);
        this.ITrustedWebActivityService$Default = create8;
        this.ITrustedWebActivityService$Stub$Proxy = onStartBleScan.create(this.IsOverlapping, this.isInside, create8);
        this.cancel = onGetBluetoothCharacteristics.create(this.IsOverlapping, this.isInside, this.ITrustedWebActivityService$Default);
        equals equals2 = new equals(r7);
        this.cancelAll = equals2;
        this.INotificationSideChannel$Default = matchesBeacon.create(this.receiveFile, equals2);
        this.INotificationSideChannel$Stub = validateMac.create(this.IsOverlapping, this.isInside, this.receiveFile);
        this.INotificationSideChannel$Stub$Proxy = IntentHandler.create(this.IsOverlapping, this.isInside, this.receiveFile, this.cancelAll);
        this.RemoteActionCompatParcelizer = toUuid.create(this.values);
        this.write = didDetermineStateForRegion.create(this.receiveFile);
        b bVar = new b(r7);
        this.IconCompatParcelizer = bVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = BLEManager.AnonymousClass3.create(bVar);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.IconCompatParcelizer);
        this.read = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.setMax, this.ITrustedWebActivityService$Stub, this.IPostMessageService$Stub$Proxy, this.IPostMessageService, this.ITrustedWebActivityService$Stub$Proxy, this.cancel, this.INotificationSideChannel$Default, this.INotificationSideChannel$Stub, this.ICustomTabsService$Stub, this.INotificationSideChannel$Stub$Proxy, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, create9));
        this.MediaBrowserCompat$SearchResultReceiver = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.Grayscale$Algorithm, this.onPostMessage, this.ITrustedWebActivityCallback$Stub, this.INotificationSideChannel, min9));
        this.MediaBrowserCompat$MediaItem = min10;
        this.MediaDescriptionCompat = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        PrepareException.AnonymousClass1 r3 = r32;
        setMax setmax = new setMax(r3);
        this.MediaBrowserCompat$MediaItem$Flags = setmax;
        this.MediaBrowserCompat$ItemReceiver = APWebMessagePort.APWebMessageCallback.create(this.IsOverlapping, this.isInside, setmax);
        this.MediaMetadataCompat = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.IsOverlapping, this.isInside, this.areNotificationsEnabled);
        this.MediaMetadataCompat$BitmapKey = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaDescriptionCompat, this.MediaBrowserCompat$ItemReceiver, this.MediaMetadataCompat, create10));
        this.MediaMetadataCompat$LongKey = min11;
        this.MediaMetadataCompat$TextKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
        getInputStream$FastBitmap$CoordinateSystem getinputstream_fastbitmap_coordinatesystem = new getInputStream$FastBitmap$CoordinateSystem(r3);
        this.MediaMetadataCompat$RatingKey = getinputstream_fastbitmap_coordinatesystem;
        this.RatingCompat$Style = ImageLoader.create(getinputstream_fastbitmap_coordinatesystem);
        this.RatingCompat = getRenderLoadStatusCode.create(this.MediaMetadataCompat$RatingKey);
        this.RatingCompat$StarStyle = DefaultAccoutExtension.create(this.MediaMetadataCompat$RatingKey);
        toDoubleRange todoublerange = new toDoubleRange(r3);
        this.IMediaControllerCallback = todoublerange;
        this.onEvent = pageUrl.create(this.IsOverlapping, this.isInside, todoublerange);
        this.onMetadataChanged = clearServiceWorkerCacheEnabled.create(this.MediaMetadataCompat$RatingKey);
        this.onPlaybackStateChanged = OutFilePathProxy.create(this.MediaMetadataCompat$RatingKey);
        this.onSessionDestroyed = UcService.UCInitListener.create(this.MediaMetadataCompat$RatingKey);
        this.onQueueTitleChanged = ImageListener.create(this.MediaMetadataCompat$RatingKey);
        this.onQueueChanged = registerStatusListener.create(this.MediaMetadataCompat$RatingKey);
        this.onRepeatModeChanged = isScrap.getMin(NonParcelField.length(globalSearchModule));
        this.onCaptioningEnabledChanged = CommonAbilityManifest.create(this.MediaMetadataCompat$RatingKey);
        this.onVolumeInfoChanged = GriverRVAccountServiceImpl.create(this.MediaMetadataCompat$RatingKey);
        this.onShuffleModeChangedRemoved = CommonAbilityManifest.AnonymousClass1.create(this.MediaMetadataCompat$RatingKey);
        this.onExtrasChanged = UcService.create(this.MediaMetadataCompat$RatingKey);
        this.onSessionReady = goForward.create(this.values, this.receiveFile, this.MediaMetadataCompat$RatingKey);
        getInputStream$Grayscale$Algorithm getinputstream_grayscale_algorithm = new getInputStream$Grayscale$Algorithm(r3);
        this.IMediaSession = getinputstream_grayscale_algorithm;
        GriverTransport.AnonymousClass1 create11 = GriverTransport.AnonymousClass1.create(this.IsOverlapping, this.isInside, getinputstream_grayscale_algorithm);
        this.IMediaControllerCallback$Stub = create11;
        b.C0007b<ParcelImpl> min12 = isScrap.getMin(VersionedParcel$ParcelException.length(this.setMax, this.RatingCompat$Style, this.RatingCompat, this.RatingCompat$StarStyle, this.onEvent, this.write, this.onMetadataChanged, this.onPlaybackStateChanged, this.onSessionDestroyed, this.IPostMessageService$Stub$Proxy, this.onQueueTitleChanged, this.onQueueChanged, this.onRepeatModeChanged, this.onCaptioningEnabledChanged, this.onVolumeInfoChanged, this.onShuffleModeChangedRemoved, this.onExtrasChanged, this.onSessionReady, create11));
        this.onShuffleModeChanged = min12;
        this.IMediaControllerCallback$Stub$Proxy = isScrap.getMin(ParcelField.length(globalSearchModule, min12));
        b.C0007b<hexStringToBytes.getMax> min13 = isScrap.getMin(getManufacturerData.setMax(popularPlacesModule));
        this.isTransportControlEnabled = min13;
        isLocationEnable min14 = isLocationEnable.setMin(min13, this.onExtrasChanged);
        this.unregisterCallbackListener = min14;
        this.registerCallbackListener = isScrap.getMin(hasLocationPermission.length(popularPlacesModule, min14));
    }

    public static final class length {
        public PrepareException.AnonymousClass1 IsOverlapping;
        public FeatureModule getMax;
        public ScanQrModule getMin;
        public ServicesModule isInside;
        public RestoreUrlModule length;
        public DeepLinkModule setMax;
        public OauthModule setMin;
        public PopularPlacesModule toFloatRange;
        public GlobalSearchModule toIntRange;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
        }
    }

    static class getMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            Context max = this.getMax.getMax();
            if (max != null) {
                return max;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
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
        private final PrepareException.AnonymousClass1 setMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 length;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.length.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem != null) {
                return FastBitmap$CoordinateSystem;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMin;

        isInside(PrepareException.AnonymousClass1 r1) {
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

    static class invokeSuspend implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 setMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            AndroidModel IPostMessageService = this.setMin.IPostMessageService();
            if (IPostMessageService != null) {
                return IPostMessageService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMax;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 length;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.setMin.ITrustedWebActivityService$Default();
            if (ITrustedWebActivityService$Default != null) {
                return ITrustedWebActivityService$Default;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        setMin(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.length.Grayscale$Algorithm();
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

    static class b implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 setMin;

        b(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<workerType> {
        private final PrepareException.AnonymousClass1 setMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            workerType smallIconBitmap = this.setMax.getSmallIconBitmap();
            if (smallIconBitmap != null) {
                return smallIconBitmap;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMax(ExploreDanaFragment exploreDanaFragment) {
        onBeaconServiceChange.getMin(exploreDanaFragment, this.MediaMetadataCompat$TextKey.get());
        onBeaconServiceChange.getMax(exploreDanaFragment, this.IMediaControllerCallback$Stub$Proxy.get());
        onBeaconServiceChange.length(exploreDanaFragment, this.registerCallbackListener.get());
        GlobalSearchModule globalSearchModule = this.getMin;
        Context max = this.length.getMax();
        if (max != null) {
            onBeaconServiceChange.getMin(exploreDanaFragment, CustomVersionedParcelable.getMax(globalSearchModule, max));
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
