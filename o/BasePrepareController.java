package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.richview.servicescard.ServiceCardView;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindFont;
import o.BindView;
import o.CameraUtils;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverManifest;
import o.GriverPrepareInterceptor;
import o.H5Event;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.INebulaPage;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.R;
import o.Transition;
import o.b;
import o.getDuration;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.onAnimationEnd;
import o.onNext;
import o.style;

public final class BasePrepareController implements JSONReader {
    private b.C0007b<style.getMin> FastBitmap$CoordinateSystem;
    private b.C0007b<onConnect> Grayscale$Algorithm;
    private b.C0007b<Region$1> ICustomTabsCallback;
    private b.C0007b<Activity> ICustomTabsCallback$Default;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> ICustomTabsCallback$Stub;
    private b.C0007b<R.id.length> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<GriverPrepareInterceptor> ICustomTabsService;
    private b.C0007b<MovableFrameLayout> ICustomTabsService$Default;
    private b.C0007b<BindView.setMin> ICustomTabsService$Stub;
    private b.C0007b<DataProviderException> ICustomTabsService$Stub$Proxy;
    private b.C0007b<onMessage> IMediaControllerCallback;
    private b.C0007b<H5ServiceWorkerControllerProvider> IMediaControllerCallback$Stub;
    private b.C0007b<getEmbededViewProvider> IMediaControllerCallback$Stub$Proxy;
    private b.C0007b<H5DataProvider> IMediaSession;
    private b.C0007b<getPropagation> INotificationSideChannel;
    private b.C0007b<getRunningAnimators.getMin> INotificationSideChannel$Default;
    private b.C0007b<getBlockNetworkImage> INotificationSideChannel$Stub;
    private b.C0007b<setEpicenterCallback> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<OnFocusChange> IPostMessageService;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> IPostMessageService$Default;
    private b.C0007b<H5Utils> IPostMessageService$Stub;
    private b.C0007b<setPageCacheCapacity> IPostMessageService$Stub$Proxy;
    private b.C0007b<onJsBeforeUnload> ITrustedWebActivityCallback;
    private b.C0007b<addChooseImageCrossOrigin> ITrustedWebActivityCallback$Default;
    private b.C0007b<getEpicenter> ITrustedWebActivityCallback$Stub;
    private b.C0007b<applySettingsToScheduledJob> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getAppPerfKey> ITrustedWebActivityService;
    private b.C0007b<getTransitionValues> ITrustedWebActivityService$Default;
    private b.C0007b<isTransitionRequired> ITrustedWebActivityService$Stub;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IconCompatParcelizer;
    private b.C0007b<PdfImageSource.length> IsOverlapping;
    private b.C0007b<parseBatteryPercentage> Mean$Arithmetic;
    private b.C0007b<getTargets> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<shouldShowRevokeOpenAuthItem> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<KitUtils> MediaBrowserCompat$MediaItem;
    private b.C0007b<getCommonResources> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<GriverCreatePromptParam> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<notifyCharacteristicValue> MediaDescriptionCompat;
    private b.C0007b<getPath> MediaMetadataCompat;
    private b.C0007b<onAnimationEnd.length> MediaMetadataCompat$BitmapKey;
    private b.C0007b<getPlatformCallback> MediaMetadataCompat$LongKey;
    private b.C0007b<AutoTransition.setMax> MediaMetadataCompat$RatingKey;
    private b.C0007b<checkBitmap> MediaMetadataCompat$TextKey;
    private b.C0007b<setStartDelay> RatingCompat;
    private b.C0007b<GriverCreateDialogParam> RatingCompat$StarStyle;
    private b.C0007b<setSupportZoom> RatingCompat$Style;
    private b.C0007b<getRunningAnimators.setMax> RemoteActionCompatParcelizer;
    private b.C0007b<enableUCCorePreheadInit> adjustVolume;
    private b.C0007b<getScanJobRuntimeMillis> areNotificationsEnabled;
    private b.C0007b<method> asBinder;
    private b.C0007b<BindInt> asInterface;
    private b.C0007b<onWebViewDestory> b;
    private b.C0007b<getCancelable> cancel;
    private b.C0007b<getMode> cancelAll;
    private b.C0007b<setSceneRoot> cancelNotification;
    private b.C0007b<hasSameIdentifiers> create;
    private b.C0007b<dynamicProxy> equals;
    private b.C0007b<toByteArray> extraCallback;
    private b.C0007b<didExitRegion> extraCallbackWithResult;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> extraCommand;
    private b.C0007b<canGoBackOrForward> getActiveNotifications;
    private b.C0007b<toUuidString> getCause;
    private b.C0007b<ResourceProviderExtension> getDefaultImpl;
    private b.C0007b<sendServiceWorkerPushMessage> getExtras;
    private b.C0007b<hasPageStartButNoInterceptRequest> getFlags;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> getInterfaceDescriptor;
    private b.C0007b<NXH5WebViewClientAdapter> getLaunchPendingIntent;
    private final ServicesModule getMax;
    private b.C0007b<getWebViewCoreSoPath> getMetadata;
    private b.C0007b<appxLoadFailed> getMin;
    private b.C0007b<cannotInitUC> getPackageName;
    private b.C0007b<getRedirectUrl> getPlaybackState;
    private b.C0007b<setEventSource> getQueue;
    private b.C0007b<IH5EmbedViewJSCallback> getQueueTitle;
    private b.C0007b<setH5OverScrollListener> getRatingType;
    private b.C0007b<BLEServiceUnit> getRepeatMode;
    private b.C0007b<setInitTextColor> getSmallIconBitmap;
    private b.C0007b<updateFootState> getSmallIconId;
    private b.C0007b<releaseView> getTag;
    private b.C0007b<getShareUrl> getVolumeAttributes;
    private b.C0007b<enableBackButton> hashCode;
    private b.C0007b<OrientationDetector.OrientationListener> invoke;
    private b.C0007b<onCharacteristicWriteCompleted> invokeSuspend;
    private b.C0007b<onNext.setMin> isCaptioningEnabled;
    private b.C0007b<stringify> isInside;
    private b.C0007b<isDispatcherOnWorkerThread> isTransportControlEnabled;
    private final PrepareException.AnonymousClass1 length;
    private b.C0007b<setDataRequestNotifier> mayLaunchUrl;
    private b.C0007b<getPerformanceTracker> newSession;
    private b.C0007b<onDescriptorWrite> newSessionWithExtras;
    private b.C0007b<queryAppInfo> notify;
    private b.C0007b<setNetworkAvailable> notifyNotificationWithChannel;
    private b.C0007b<isKeepCallback> onCaptioningEnabledChanged;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> onEvent;
    private b.C0007b<setBackButton> onExtraCallback;
    private b.C0007b<getSelectedIndex.length> onExtrasChanged;
    private b.C0007b<onCharacteristicChanged> onMessageChannelReady;
    private b.C0007b<getSelectedIndex.setMax> onMetadataChanged;
    private b.C0007b<getUniqueId> onNavigationEvent;
    private b.C0007b<onStopBleScan> onPlaybackStateChanged;
    private b.C0007b<setDefaultFontSize> onPostMessage;
    private b.C0007b<setOnOptionPickListener> onQueueChanged;
    private b.C0007b<getDuration.length> onQueueTitleChanged;
    private b.C0007b<convertIntentsToCallbacks> onRelationshipValidationResult;
    private b.C0007b<onNext.length> onRepeatModeChanged;
    private b.C0007b<BLETraceMonitor> onSessionDestroyed;
    private b.C0007b<keepCallback> onSessionReady;
    private b.C0007b<H5Event.Builder> onShuffleModeChanged;
    private b.C0007b<ifContainsEmbedSurfaceView> onShuffleModeChangedRemoved;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> onTransact;
    private b.C0007b<ifContainsEmbedView> onVolumeInfoChanged;
    private b.C0007b<OnItemLongClick> postMessage;
    private b.C0007b<onAnimationEnd.getMin> read;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> receiveFile;
    private b.C0007b<isCanceled> registerCallbackListener;
    private b.C0007b<R.styleable> requestPostMessageChannel;
    private b.C0007b<BindView.setMax> requestPostMessageChannelWithExtras;
    private b.C0007b<getInternalContentView> sendCommand;
    private b.C0007b<INebulaPage.H5PageHandler> sendMediaButton;
    private b.C0007b<getTinyLocalStorageInfo> setDefaultImpl;
    private final CheckoutH5EventModule setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<NXH5WebViewAdapter> setVolumeTo;
    private b.C0007b<GetAuthCode> toDoubleRange;
    private b.C0007b<CommonUtil> toFloatRange;
    private b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> toIntRange;
    private b.C0007b<PdfImageSource.setMin> toString;
    private b.C0007b<shouldExit> unregisterCallbackListener;
    private b.C0007b<AndroidModel> updateVisuals;
    private b.C0007b<R.id.getMax> validateRelationship;
    private b.C0007b<onDisconnect> valueOf;
    private b.C0007b<Context> values;
    private b.C0007b<requestAppWithAppId> warmup;
    private b.C0007b<getAllInstallFiles> write;

    public /* synthetic */ BasePrepareController(PlayStoreReviewModules playStoreReviewModules, CheckoutH5EventModule checkoutH5EventModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r11, byte b2) {
        this(playStoreReviewModules, checkoutH5EventModule, bottomSheetOnBoardingModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, globalNetworkModule, r11);
    }

    private BasePrepareController(PlayStoreReviewModules playStoreReviewModules, CheckoutH5EventModule checkoutH5EventModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r43) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r43;
        this.length = r6;
        this.setMax = checkoutH5EventModule;
        this.getMax = servicesModule;
        this.getMin = new BasePrepareController$Grayscale$Algorithm(r6);
        this.setMin = new values(r6);
        hashCode hashcode = new hashCode(r6);
        this.equals = hashcode;
        this.isInside = dumpFile.create(this.getMin, this.setMin, hashcode);
        this.toFloatRange = initialValue.create(this.getMin, this.setMin, this.equals);
        b.C0007b<PdfImageSource.length> min = isScrap.getMin(GriverConfigConstants.length(playStoreReviewModules));
        this.IsOverlapping = min;
        PdfViewerActivity.DividerGridItemDecoration max = PdfViewerActivity.DividerGridItemDecoration.setMax(this.isInside, this.toFloatRange, min);
        this.toIntRange = max;
        this.toString = isScrap.getMin(dispatchTouchEvent.setMax(playStoreReviewModules, max));
        this.values = new setMin(r6);
        this.FastBitmap$CoordinateSystem = BindFont.length(servicesModule);
        length length2 = new length(r6);
        this.hashCode = length2;
        this.toDoubleRange = setOptionMenu.create(length2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max2 = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.values);
        this.invoke = max2;
        this.Mean$Arithmetic = getSystemInfo.setMax(max2);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.valueOf = iCustomTabsCallback;
        this.invokeSuspend = onStartBleScan.create(this.getMin, this.setMin, iCustomTabsCallback);
        this.Grayscale$Algorithm = onGetBluetoothCharacteristics.create(this.getMin, this.setMin, this.valueOf);
        this.getCause = new invoke(r6);
        equals equals2 = new equals(r6);
        this.b = equals2;
        this.create = matchesBeacon.create(this.getCause, equals2);
        this.ICustomTabsCallback = validateMac.create(this.getMin, this.setMin, this.getCause);
        this.onNavigationEvent = didRangeBeaconsInRegion.create(this.getMin, this.setMin, this.getCause);
        this.onRelationshipValidationResult = IntentHandler.create(this.getMin, this.setMin, this.getCause, this.b);
        toIntRange tointrange = new toIntRange(r6);
        this.onPostMessage = tointrange;
        this.extraCallback = toUuid.create(tointrange);
        this.extraCallbackWithResult = didDetermineStateForRegion.create(this.getCause);
        getCause getcause = new getCause(r6);
        this.onMessageChannelReady = getcause;
        this.onTransact = BLEManager.AnonymousClass3.create(getcause);
        BLEManager.AnonymousClass4 create2 = BLEManager.AnonymousClass4.create(this.onMessageChannelReady);
        this.ICustomTabsCallback$Stub = create2;
        this.asInterface = isScrap.getMin(OnCheckedChanged.length(this.values, this.FastBitmap$CoordinateSystem, this.toDoubleRange, this.Mean$Arithmetic, this.invokeSuspend, this.Grayscale$Algorithm, this.create, this.ICustomTabsCallback, this.onNavigationEvent, this.onRelationshipValidationResult, this.extraCallback, this.extraCallbackWithResult, this.onTransact, create2));
        b.C0007b<Activity> min2 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.ICustomTabsCallback$Default = min2;
        b.C0007b<method> min3 = isScrap.getMin(type.getMax(min2));
        this.asBinder = min3;
        this.ICustomTabsCallback$Stub$Proxy = isScrap.getMin(R.integer.setMin(scanQrModule2, min3));
        PrepareException.AnonymousClass1 r3 = r43;
        BasePrepareController$FastBitmap$CoordinateSystem basePrepareController$FastBitmap$CoordinateSystem = new BasePrepareController$FastBitmap$CoordinateSystem(r3);
        this.ICustomTabsService = basePrepareController$FastBitmap$CoordinateSystem;
        this.getDefaultImpl = GriverPrepareInterceptor.AnonymousClass2.create(this.getMin, this.setMin, basePrepareController$FastBitmap$CoordinateSystem);
        this.getInterfaceDescriptor = beforeQuery.create(this.getMin, this.setMin, this.ICustomTabsService);
        this.setDefaultImpl = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.newSession = new toFloatRange(r3);
        this.mayLaunchUrl = getDataRequestNotifier.create(this.onPostMessage);
        b bVar = new b(r3);
        this.newSessionWithExtras = bVar;
        this.extraCommand = onCharacteristicWrite.create(bVar, this.getMin, this.setMin);
        localIdToBytes create3 = localIdToBytes.create(this.ICustomTabsService);
        this.warmup = create3;
        b.C0007b<R.styleable> min4 = isScrap.getMin(Setter.length(this.values, this.ICustomTabsCallback$Stub$Proxy, this.getDefaultImpl, this.getInterfaceDescriptor, this.setDefaultImpl, this.newSession, this.mayLaunchUrl, this.extraCommand, create3));
        this.requestPostMessageChannel = min4;
        this.validateRelationship = isScrap.getMin(R.drawable.setMin(scanQrModule2, min4));
        b.C0007b<OnItemLongClick> min5 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.postMessage = min5;
        RestoreUrlModule restoreUrlModule3 = restoreUrlModule;
        this.requestPostMessageChannelWithExtras = isScrap.getMin(ButterKnife.getMin(restoreUrlModule3, min5));
        invokeSuspend invokesuspend = new invokeSuspend(r3);
        this.updateVisuals = invokesuspend;
        NullBeaconDataFactory create4 = NullBeaconDataFactory.create(this.getMin, this.setMin, invokesuspend);
        this.ICustomTabsService$Stub$Proxy = create4;
        b.C0007b<OnFocusChange> min6 = isScrap.getMin(OnEditorAction.getMin(this.requestPostMessageChannelWithExtras, create4));
        this.IPostMessageService = min6;
        this.ICustomTabsService$Stub = isScrap.getMin(BindViews.getMax(restoreUrlModule3, min6));
        toDoubleRange todoublerange = new toDoubleRange(r3);
        this.receiveFile = todoublerange;
        this.ICustomTabsService$Default = GriverBizManifest.create(this.getMin, this.setMin, todoublerange);
        this.IPostMessageService$Stub$Proxy = APWebSettings.PluginState.create(this.onPostMessage);
        this.onExtraCallback = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        isInside isinside = new isInside(r3);
        this.IPostMessageService$Default = isinside;
        this.ITrustedWebActivityCallback = onConsoleMessage.create(this.getMin, this.setMin, isinside);
        BasePrepareController$Mean$Arithmetic basePrepareController$Mean$Arithmetic = new BasePrepareController$Mean$Arithmetic(r3);
        this.IPostMessageService$Stub = basePrepareController$Mean$Arithmetic;
        this.ITrustedWebActivityCallback$Default = H5ResourceCORSUtil.AnonymousClass1.create(this.getMin, this.setMin, basePrepareController$Mean$Arithmetic);
        IsOverlapping isOverlapping = new IsOverlapping(r3);
        this.ITrustedWebActivityService = isOverlapping;
        this.ITrustedWebActivityCallback$Stub = capturePropagationValues.getMin(this.ITrustedWebActivityCallback$Default, isOverlapping);
        valueOf valueof = new valueOf(r3);
        this.areNotificationsEnabled = valueof;
        this.ITrustedWebActivityCallback$Stub$Proxy = ScanState.create(this.getMin, this.setMin, valueof);
        this.getSmallIconBitmap = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length3 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.getSmallIconBitmap);
        this.getSmallIconId = length3;
        this.cancelNotification = Transition.MatchOrder.length(this.ITrustedWebActivityCallback$Stub$Proxy, length3);
        this.getActiveNotifications = setInitialScale.create(this.getMin, this.setMin, this.onPostMessage);
        postUrl create5 = postUrl.create(this.getMin, this.setMin, this.onPostMessage);
        this.notifyNotificationWithChannel = create5;
        this.INotificationSideChannel = getName.setMin(this.getActiveNotifications, create5, manuallyReleaseCamera.setMax());
        toString tostring = new toString(r3);
        this.ITrustedWebActivityService$Stub$Proxy = tostring;
        saveAppInfos create6 = saveAppInfos.create(tostring);
        this.notify = create6;
        this.ITrustedWebActivityService$Default = captureHierarchy.length(create6, OpenInBrowserBridgeExtension.setMax());
        this.ITrustedWebActivityService$Stub = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min7 = isScrap.getMin(getCancelOnTouchOutside.create(this.values));
        this.cancel = min7;
        b.C0007b<getMode> min8 = isScrap.getMin(onDisappear.length(this.ICustomTabsService$Default, this.IPostMessageService$Stub$Proxy, this.onExtraCallback, this.ITrustedWebActivityCallback, this.ITrustedWebActivityCallback$Stub, this.cancelNotification, this.INotificationSideChannel, this.ITrustedWebActivityService$Default, this.ITrustedWebActivityService$Stub, min7, this.mayLaunchUrl));
        this.cancelAll = min8;
        FeatureModule featureModule3 = featureModule;
        b.C0007b<getRunningAnimators.getMin> min9 = isScrap.getMin(setDuration.getMax(featureModule3, min8));
        this.INotificationSideChannel$Default = min9;
        this.INotificationSideChannel$Stub$Proxy = isScrap.getMin(setPropagation.length(min9, this.onNavigationEvent, this.Mean$Arithmetic, this.toDoubleRange, this.newSession));
        this.INotificationSideChannel$Stub = getLoadsImagesAutomatically.create(this.getMin, this.setMin, this.onPostMessage);
        this.IconCompatParcelizer = setWebContentsDebuggingEnabled.create(this.onPostMessage);
        installPathExist create7 = installPathExist.create(this.onPostMessage);
        this.write = create7;
        b.C0007b<getTargets> min10 = isScrap.getMin(addViewValues.length(this.INotificationSideChannel$Default, this.INotificationSideChannel$Stub$Proxy, this.INotificationSideChannel$Stub, this.IconCompatParcelizer, create7));
        this.MediaBrowserCompat$CustomActionResultReceiver = min10;
        this.RemoteActionCompatParcelizer = isScrap.getMin(parseMatchOrder.length(featureModule3, min10));
        OauthModule oauthModule3 = oauthModule;
        this.read = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule3, setTrimPathStart.length()));
        getMin getmin = new getMin(r3);
        this.MediaBrowserCompat$MediaItem$Flags = getmin;
        this.MediaBrowserCompat$ItemReceiver = GriverOpenAuthExtension.create(getmin);
        this.MediaDescriptionCompat = BLEManager.AnonymousClass2.create(this.getMin, this.setMin, this.newSessionWithExtras);
        this.MediaBrowserCompat$SearchResultReceiver = GriverDialogExtension.create(this.getMin, this.setMin, this.MediaBrowserCompat$MediaItem$Flags);
        this.MediaBrowserCompat$MediaItem = checkSuffixSupported.create(this.onPostMessage);
        this.MediaMetadataCompat$TextKey = isImage.create(this.onPostMessage);
        getFillColor max3 = getFillColor.setMax(this.read, startListenScreenshot.setMin(), this.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat$TextKey);
        this.MediaMetadataCompat$LongKey = max3;
        b.C0007b<onAnimationEnd.length> min11 = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule3, max3));
        this.MediaMetadataCompat$BitmapKey = min11;
        b.C0007b<getPath> min12 = isScrap.getMin(Slide.getMin(this.validateRelationship, this.ICustomTabsService$Stub, this.RemoteActionCompatParcelizer, min11, this.asInterface));
        this.MediaMetadataCompat = min12;
        DeepLinkModule deepLinkModule3 = deepLinkModule;
        this.MediaMetadataCompat$RatingKey = isScrap.getMin(Fade.setMin(deepLinkModule3, min12));
        getMax getmax = new getMax(r3);
        this.RatingCompat$Style = getmax;
        this.IMediaControllerCallback = APWebMessagePort.APWebMessageCallback.create(this.getMin, this.setMin, getmax);
        this.onEvent = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create8 = GVLoadingView.create(this.getMin, this.setMin, this.MediaBrowserCompat$MediaItem$Flags);
        this.RatingCompat$StarStyle = create8;
        b.C0007b<setStartDelay> min13 = isScrap.getMin(setInterpolator.setMin(this.MediaMetadataCompat$RatingKey, this.IMediaControllerCallback, this.onEvent, create8));
        this.RatingCompat = min13;
        this.onQueueTitleChanged = isScrap.getMin(ChangeBounds.setMin(deepLinkModule3, min13));
        this.onMetadataChanged = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        this.onSessionDestroyed = onDeviceFound.create(this.getMin, this.setMin, this.valueOf);
        onDisconnectBLE create9 = onDisconnectBLE.create(this.getMin, this.setMin, this.valueOf);
        this.onPlaybackStateChanged = create9;
        onSelected min14 = onSelected.setMin(this.onMetadataChanged, this.onSessionDestroyed, create9);
        this.onQueueChanged = min14;
        this.onExtrasChanged = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min14));
        this.onRepeatModeChanged = isScrap.getMin(setTypeKey.setMax(globalNetworkModule));
        this.onVolumeInfoChanged = INebulaPage.create(this.getMin, this.setMin, this.b);
        this.onShuffleModeChangedRemoved = onReceiveValue.create(this.getMin, this.setMin, this.b);
        this.onCaptioningEnabledChanged = eventSource.create(this.getMin, this.setMin, this.b, this.newSessionWithExtras);
        this.IMediaSession = has.create(this.getMin, this.setMin, this.b);
        this.IMediaControllerCallback$Stub$Proxy = scriptbizLoadedAndBridgeLoaded.create(this.getMin, this.setMin, this.b);
        this.IMediaControllerCallback$Stub = H5ScrollChangedCallback.create(this.getMin, this.setMin, this.b);
        this.onSessionReady = H5Event.AnonymousClass1.create(this.b);
        this.onShuffleModeChanged = H5OverScrollListener.create(this.getMin, this.setMin, this.b);
        this.isTransportControlEnabled = getH5page.create(this.getMin, this.setMin, this.b);
        this.registerCallbackListener = setTarget.create(this.b);
        this.sendMediaButton = setHandler.create(this.getMin, this.setMin, this.b);
        this.sendCommand = getWebChromeClient.create(this.getMin, this.setMin, this.b);
        this.unregisterCallbackListener = setContainsEmbedSurfaceView.create(this.getMin, this.setMin, this.b);
        this.getLaunchPendingIntent = getWebViewClient.create(this.getMin, this.setMin, this.b);
        this.getVolumeAttributes = getUcVersion.create(this.getMin, this.setMin, this.b);
        this.getPackageName = getUCSdkVersion.create(this.getMin, this.setMin, this.b);
        this.getFlags = createWebView.create(this.getMin, this.setMin, this.b);
        this.getTag = H5Event.create(this.getMin, this.setMin, this.b);
        this.getQueue = getEventSource.create(this.b);
        this.getPlaybackState = NXUcService.create(this.getMin, this.setMin, this.b);
        this.getMetadata = getUCCoreDownloadUrl.create(this.getMin, this.setMin, this.b);
        this.setVolumeTo = NXH5PageAdapter.create(this.getMin, this.setMin, this.b);
        this.adjustVolume = setContainsEmbedView.create(this.getMin, this.setMin, this.b);
        this.getRatingType = getWebViewIndex.create(this.getMin, this.setMin, this.b);
        this.getQueueTitle = getSpecialRestoreView.create(this.getMin, this.setMin, this.b);
        this.getExtras = H5ServiceWorkerHook4Bridge.create(this.getMin, this.setMin, this.b);
        b.C0007b<BLEServiceUnit> min15 = isScrap.getMin(getWebSocketURLPrefixForDebug.setMin(this.onRepeatModeChanged, this.onVolumeInfoChanged, this.onShuffleModeChangedRemoved, this.onCaptioningEnabledChanged, this.IMediaSession, this.IMediaControllerCallback$Stub$Proxy, this.IMediaControllerCallback$Stub, this.onSessionReady, LocationBridgeExtension.AnonymousClass4.setMax(), this.onShuffleModeChanged, this.values, this.isTransportControlEnabled, this.registerCallbackListener, this.sendMediaButton, this.sendCommand, this.unregisterCallbackListener, this.getLaunchPendingIntent, this.getVolumeAttributes, this.getPackageName, this.getFlags, this.getTag, this.getQueue, this.getPlaybackState, this.getMetadata, this.setVolumeTo, this.adjustVolume, this.getRatingType, this.getQueueTitle, this.toDoubleRange, this.getExtras));
        this.getRepeatMode = min15;
        this.isCaptioningEnabled = isScrap.getMin(SerialContext.length(globalNetworkModule, min15));
    }

    public static final class setMax {
        public PrepareException.AnonymousClass1 FastBitmap$CoordinateSystem;
        public RestoreUrlModule IsOverlapping;
        public FeatureModule equals;
        public CheckoutH5EventModule getMax;
        public DeepLinkModule getMin;
        public OauthModule isInside;
        public PlayStoreReviewModules length;
        public ScanQrModule setMax;
        public BottomSheetOnBoardingModule setMin;
        public ServicesModule toFloatRange;
        public GlobalNetworkModule toIntRange;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
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

    static class hashCode implements b.C0007b<dynamicProxy> {
        private final PrepareException.AnonymousClass1 setMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            dynamicProxy ITrustedWebActivityCallback = this.setMax.ITrustedWebActivityCallback();
            if (ITrustedWebActivityCallback != null) {
                return ITrustedWebActivityCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 getMax;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMax;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 setMin;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.setMin.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
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

    static class toIntRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class getCause implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 length;

        getCause(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onCharacteristicChanged write = this.length.write();
            if (write != null) {
                return write;
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

    static class b implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMin;

        b(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.setMin.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getCommonResources Grayscale$Algorithm = this.getMin.Grayscale$Algorithm();
            if (Grayscale$Algorithm != null) {
                return Grayscale$Algorithm;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    public final void setMax(ServiceCardView serviceCardView) {
        getPerformanceTracker onTransact2 = this.length.onTransact();
        if (onTransact2 != null) {
            CameraUtils.AnonymousClass1.AnonymousClass1.getMax(serviceCardView, onTransact2);
            CheckoutH5EventModule checkoutH5EventModule = this.setMax;
            appxLoadFailed length2 = this.length.length();
            if (length2 != null) {
                appxLoadFailed appxloadfailed = length2;
                getScheme min = this.length.getMin();
                if (min != null) {
                    getScheme getscheme = min;
                    GriverHttpRequestAPIExtension IPostMessageService$Default2 = this.length.IPostMessageService$Default();
                    if (IPostMessageService$Default2 != null) {
                        CameraUtils.AnonymousClass1.AnonymousClass1.setMax(serviceCardView, getValueFilters.getMin(checkoutH5EventModule, new GriverManifest.AnonymousClass22.getMin(new onCommonConfigChanged(appxloadfailed, getscheme, IPostMessageService$Default2), println.setMin(this.setMax)) {
                            /* access modifiers changed from: private */
                            public final AnonymousClass22.length length;
                            private GriverAppVirtualHostProxy<Boolean> setMax;
                            private final onCommonConfigChanged setMin;

                            {
                                this.setMin = r1;
                                this.length = r2;
                            }

                            public final void length() {
                                GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.setMax;
                                if (griverAppVirtualHostProxy != null) {
                                    griverAppVirtualHostProxy.dispose();
                                    this.setMax = null;
                                }
                            }

                            public final void getMin() {
                                GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.setMax;
                                if (griverAppVirtualHostProxy != null) {
                                    griverAppVirtualHostProxy.dispose();
                                    this.setMax = null;
                                }
                                onCommonConfigChanged oncommonconfigchanged = this.setMin;
                                if (this.setMax == null) {
                                    this.setMax = new GriverAppVirtualHostProxy<Boolean>() {
                                        public final /* synthetic */ void onNext(Object obj) {
                                            AnonymousClass2.this.length.setMin(((Boolean) obj).booleanValue());
                                        }
                                    };
                                }
                                oncommonconfigchanged.execute(this.setMax);
                            }

                            public final void setMax() {
                                GriverAppVirtualHostProxy<Boolean> griverAppVirtualHostProxy = this.setMax;
                                if (griverAppVirtualHostProxy != null) {
                                    griverAppVirtualHostProxy.dispose();
                                    this.setMax = null;
                                }
                                this.setMin.dispose();
                            }
                        }));
                        CameraUtils.AnonymousClass1.AnonymousClass1.getMin(serviceCardView, this.toString.get());
                        CameraUtils.AnonymousClass1.AnonymousClass1.setMax(serviceCardView, BindFont.TypefaceStyle.getMax(this.getMax, this.asInterface.get()));
                        CameraUtils.AnonymousClass1.AnonymousClass1.length(serviceCardView, this.onQueueTitleChanged.get());
                        CameraUtils.AnonymousClass1.AnonymousClass1.setMax(serviceCardView, this.onExtrasChanged.get());
                        CameraUtils.AnonymousClass1.AnonymousClass1.getMin(serviceCardView, this.isCaptioningEnabled.get());
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
}
