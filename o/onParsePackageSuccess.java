package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.feeds.GlobalFeedsModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.NewPromoBannerModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.richview.NewPromoBannerView;
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
import o.GriverCaptureActivity;
import o.GriverManifest;
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
import o.setTrimPathOffset;
import o.style;

public final class onParsePackageSuccess implements RVWebSocketClient {
    private b.C0007b<setMenus> FastBitmap$CoordinateSystem;
    private b.C0007b<GriverParams> Grayscale$Algorithm;
    private b.C0007b<method> ICustomTabsCallback;
    private b.C0007b<R.styleable> ICustomTabsCallback$Default;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> ICustomTabsCallback$Stub;
    private b.C0007b<AndroidModel> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<OnItemLongClick> ICustomTabsService;
    private b.C0007b<getEpicenter> ICustomTabsService$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsService$Stub;
    private b.C0007b<setInitTextColor> ICustomTabsService$Stub$Proxy;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> IMediaControllerCallback;
    private b.C0007b<setEpicenterCallback> INotificationSideChannel;
    private b.C0007b<APWebSettings.LayoutAlgorithm> INotificationSideChannel$Default;
    private b.C0007b<getAllInstallFiles> INotificationSideChannel$Stub;
    private b.C0007b<getRunningAnimators.setMax> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<applySettingsToScheduledJob> IPostMessageService;
    private b.C0007b<updateFootState> IPostMessageService$Default;
    private b.C0007b<canGoBackOrForward> IPostMessageService$Stub;
    private b.C0007b<setNetworkAvailable> IPostMessageService$Stub$Proxy;
    private b.C0007b<setSceneRoot> ITrustedWebActivityCallback;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> ITrustedWebActivityCallback$Default;
    private b.C0007b<isTransitionRequired> ITrustedWebActivityCallback$Stub;
    private b.C0007b<queryAppInfo> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getTransitionValues> ITrustedWebActivityService;
    private b.C0007b<getBlockNetworkImage> ITrustedWebActivityService$Default;
    private b.C0007b<enableBackButton> ITrustedWebActivityService$Stub;
    private b.C0007b<GetAuthCode> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<shouldShowRevokeOpenAuthItem> IconCompatParcelizer;
    private b.C0007b<GriverAppUpdater> IsOverlapping;
    private b.C0007b<setTrimPathOffset.setMin> Mean$Arithmetic;
    private b.C0007b<notifyCharacteristicValue> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<onDisconnect> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<style.getMin> MediaBrowserCompat$MediaItem;
    private b.C0007b<onAnimationEnd.length> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<getPlatformCallback> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<checkBitmap> MediaDescriptionCompat;
    private b.C0007b<hasSameIdentifiers> MediaMetadataCompat;
    private b.C0007b<Region$1> MediaMetadataCompat$BitmapKey;
    private b.C0007b<onWebViewDestory> MediaMetadataCompat$LongKey;
    private b.C0007b<onConnect> MediaMetadataCompat$RatingKey;
    private b.C0007b<onCharacteristicWriteCompleted> MediaMetadataCompat$TextKey;
    private b.C0007b<convertIntentsToCallbacks> RatingCompat;
    private b.C0007b<didExitRegion> RatingCompat$StarStyle;
    private b.C0007b<onCharacteristicChanged> RatingCompat$Style;
    private b.C0007b<getCommonResources> RemoteActionCompatParcelizer;
    private b.C0007b<getCancelable> areNotificationsEnabled;
    private b.C0007b<onDescriptorWrite> asBinder;
    private b.C0007b<requestAppWithAppId> asInterface;
    private b.C0007b<setTrimPathOffset.setMax> b;
    private b.C0007b<onAnimationEnd.getMin> cancel;
    private b.C0007b<getTargets> cancelAll;
    private b.C0007b<toUuidString> cancelNotification;
    private b.C0007b<R.id.length> create;
    private b.C0007b<toolbarMenuClicked> equals;
    private b.C0007b<getPerformanceTracker> extraCallback;
    private b.C0007b<GriverPrepareInterceptor> extraCallbackWithResult;
    private b.C0007b<OnFocusChange> extraCommand;
    private b.C0007b<getRunningAnimators.getMin> getActiveNotifications;
    private b.C0007b<Activity> getCause;
    private b.C0007b<DataProviderException> getDefaultImpl;
    private b.C0007b<BindView.setMax> getInterfaceDescriptor;
    private b.C0007b<appxLoadFailed> getMax;
    private b.C0007b<setDefaultFontSize> getMin;
    private b.C0007b<OrientationDetector.OrientationListener> getSmallIconBitmap;
    private b.C0007b<getUniqueId> getSmallIconId;
    private b.C0007b<isOverride> hashCode;
    private b.C0007b<doUpdateVisitedHistory> invoke;
    private b.C0007b<onEmbedViewAttachedToWebView> invokeSuspend;
    private b.C0007b<setMinimumLogicalFontSize> isInside;
    private b.C0007b<savePassword> length;
    private b.C0007b<BindView.setMin> mayLaunchUrl;
    private b.C0007b<MovableFrameLayout> newSession;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> newSessionWithExtras;
    private b.C0007b<parseBatteryPercentage> notify;
    private b.C0007b<getMode> notifyNotificationWithChannel;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> onCaptioningEnabledChanged;
    private b.C0007b<toByteArray> onEvent;
    private b.C0007b<getPropagation> onExtraCallback;
    private b.C0007b<setStartDelay> onExtrasChanged;
    private b.C0007b<ResourceProviderExtension> onMessageChannelReady;
    private b.C0007b<setSupportZoom> onMetadataChanged;
    private b.C0007b<getLocalMatrix> onNavigationEvent;
    private b.C0007b<getPath> onPlaybackStateChanged;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> onPostMessage;
    private b.C0007b<AutoTransition.setMax> onQueueChanged;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> onQueueTitleChanged;
    private b.C0007b<getTinyLocalStorageInfo> onRelationshipValidationResult;
    private b.C0007b<GriverCreateDialogParam> onRepeatModeChanged;
    private b.C0007b<BindInt> onSessionDestroyed;
    private b.C0007b<onMessage> onShuffleModeChangedRemoved;
    private b.C0007b<setDataRequestNotifier> onTransact;
    private b.C0007b<getDuration.length> onVolumeInfoChanged;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> postMessage;
    private b.C0007b<GriverCreatePromptParam> read;
    private b.C0007b<getScanJobRuntimeMillis> receiveFile;
    private b.C0007b<H5Utils> requestPostMessageChannel;
    private b.C0007b<addChooseImageCrossOrigin> requestPostMessageChannelWithExtras;
    private b.C0007b<R.id.getMax> setDefaultImpl;
    private b.C0007b<getScheme> setMax;
    private final NewPromoBannerModule setMin;
    private b.C0007b<Context> toDoubleRange;
    private b.C0007b<GriverManifest.AnonymousClass8.length> toFloatRange;
    private b.C0007b<GriverAppXInterceptor.AnonymousClass1> toIntRange;
    private b.C0007b<setReset> toString;
    private b.C0007b<setBackButton> updateVisuals;
    private b.C0007b<onJsBeforeUnload> validateRelationship;
    private b.C0007b<onUnhandledKeyEvent> valueOf;
    private b.C0007b<setOverride> values;
    private b.C0007b<setPageCacheCapacity> warmup;
    private b.C0007b<KitUtils> write;

    public /* synthetic */ onParsePackageSuccess(NewPromoBannerModule newPromoBannerModule, GlobalFeedsModule globalFeedsModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r9, byte b2) {
        this(newPromoBannerModule, globalFeedsModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r9);
    }

    private onParsePackageSuccess(NewPromoBannerModule newPromoBannerModule, GlobalFeedsModule globalFeedsModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r30) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r30;
        this.setMin = newPromoBannerModule;
        this.getMax = new ICustomTabsCallback(r6);
        this.setMax = new values(r6);
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.getMin = isOverlapping;
        this.length = overlayVerticalScrollbar.create(this.getMax, this.setMax, isOverlapping);
        this.toFloatRange = getArgument.getMax(newPromoBannerModule);
        valueOf valueof = new valueOf(r6);
        this.toIntRange = valueof;
        this.IsOverlapping = GriverAppUpdater.AnonymousClass1.create(this.getMax, this.setMax, valueof);
        this.isInside = setMinimumFontSize.create(this.getMin);
        setMin setmin = new setMin(r6);
        this.equals = setmin;
        this.hashCode = setRedDot.create(setmin);
        this.toString = getColor.create(this.equals);
        this.values = setIcontype.create(this.equals);
        this.FastBitmap$CoordinateSystem = setColor.create(this.equals);
        this.toDoubleRange = new setMax(r6);
        this.Grayscale$Algorithm = isScrap.getMin(GriverNativeBridge.getMin(this.length, this.toFloatRange, this.IsOverlapping, getTinyLocalStorage.getMin(), this.isInside, this.hashCode, this.toString, this.values, this.FastBitmap$CoordinateSystem, this.toDoubleRange));
        this.Mean$Arithmetic = isScrap.getMin(getGroupName.getMin(globalFeedsModule));
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.invoke = tofloatrange;
        this.valueOf = onReceivedSslError.create(this.getMax, this.setMax, tofloatrange);
        this.invokeSuspend = overScrollBy.create(this.getMax, this.setMax, this.invoke);
        b.C0007b<getLocalMatrix> min = isScrap.getMin(getScaleX.getMax(this.Mean$Arithmetic, this.valueOf, readBLECharacteristicValue.getMax(), this.invokeSuspend));
        this.onNavigationEvent = min;
        this.b = isScrap.getMin(getRotation.setMax(globalFeedsModule, min));
        b.C0007b<Activity> min2 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.getCause = min2;
        b.C0007b<method> min3 = isScrap.getMin(type.getMax(min2));
        this.ICustomTabsCallback = min3;
        this.create = isScrap.getMin(R.integer.setMin(scanQrModule2, min3));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.extraCallbackWithResult = invokesuspend;
        this.onMessageChannelReady = GriverPrepareInterceptor.AnonymousClass2.create(this.getMax, this.setMax, invokesuspend);
        this.onPostMessage = beforeQuery.create(this.getMax, this.setMax, this.extraCallbackWithResult);
        this.onRelationshipValidationResult = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.extraCallback = new isInside(r6);
        this.onTransact = getDataRequestNotifier.create(this.getMin);
        b bVar = new b(r6);
        this.asBinder = bVar;
        this.ICustomTabsCallback$Stub = onCharacteristicWrite.create(bVar, this.getMax, this.setMax);
        localIdToBytes create2 = localIdToBytes.create(this.extraCallbackWithResult);
        this.asInterface = create2;
        b.C0007b<R.styleable> min4 = isScrap.getMin(Setter.length(this.toDoubleRange, this.create, this.onMessageChannelReady, this.onPostMessage, this.onRelationshipValidationResult, this.extraCallback, this.onTransact, this.ICustomTabsCallback$Stub, create2));
        this.ICustomTabsCallback$Default = min4;
        this.setDefaultImpl = isScrap.getMin(R.drawable.setMin(scanQrModule2, min4));
        b.C0007b<OnItemLongClick> min5 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.ICustomTabsService = min5;
        this.getInterfaceDescriptor = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min5));
        onParsePackageSuccess$Mean$Arithmetic onparsepackagesuccess_mean_arithmetic = new onParsePackageSuccess$Mean$Arithmetic(r6);
        this.ICustomTabsCallback$Stub$Proxy = onparsepackagesuccess_mean_arithmetic;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.getMax, this.setMax, onparsepackagesuccess_mean_arithmetic);
        this.getDefaultImpl = create3;
        b.C0007b<OnFocusChange> min6 = isScrap.getMin(OnEditorAction.getMin(this.getInterfaceDescriptor, create3));
        this.extraCommand = min6;
        this.mayLaunchUrl = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min6));
        onParsePackageSuccess$FastBitmap$CoordinateSystem onparsepackagesuccess_fastbitmap_coordinatesystem = new onParsePackageSuccess$FastBitmap$CoordinateSystem(r6);
        this.newSessionWithExtras = onparsepackagesuccess_fastbitmap_coordinatesystem;
        this.newSession = GriverBizManifest.create(this.getMax, this.setMax, onparsepackagesuccess_fastbitmap_coordinatesystem);
        this.warmup = APWebSettings.PluginState.create(this.getMin);
        this.updateVisuals = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        toIntRange tointrange = new toIntRange(r6);
        this.postMessage = tointrange;
        this.validateRelationship = onConsoleMessage.create(this.getMax, this.setMax, tointrange);
        onParsePackageSuccess$Grayscale$Algorithm onparsepackagesuccess_grayscale_algorithm = new onParsePackageSuccess$Grayscale$Algorithm(r6);
        this.requestPostMessageChannel = onparsepackagesuccess_grayscale_algorithm;
        this.requestPostMessageChannelWithExtras = H5ResourceCORSUtil.AnonymousClass1.create(this.getMax, this.setMax, onparsepackagesuccess_grayscale_algorithm);
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.ICustomTabsService$Stub = todoublerange;
        this.ICustomTabsService$Default = capturePropagationValues.getMin(this.requestPostMessageChannelWithExtras, todoublerange);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.receiveFile = onnavigationevent;
        this.IPostMessageService = ScanState.create(this.getMax, this.setMax, onnavigationevent);
        this.ICustomTabsService$Stub$Proxy = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.ICustomTabsService$Stub$Proxy);
        this.IPostMessageService$Default = length2;
        this.ITrustedWebActivityCallback = Transition.MatchOrder.length(this.IPostMessageService, length2);
        this.IPostMessageService$Stub = setInitialScale.create(this.getMax, this.setMax, this.getMin);
        postUrl create4 = postUrl.create(this.getMax, this.setMax, this.getMin);
        this.IPostMessageService$Stub$Proxy = create4;
        this.onExtraCallback = getName.setMin(this.IPostMessageService$Stub, create4, manuallyReleaseCamera.setMax());
        hashCode hashcode = new hashCode(r6);
        this.ITrustedWebActivityCallback$Default = hashcode;
        saveAppInfos create5 = saveAppInfos.create(hashcode);
        this.ITrustedWebActivityCallback$Stub$Proxy = create5;
        this.ITrustedWebActivityService = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min7 = isScrap.getMin(getCancelOnTouchOutside.create(this.toDoubleRange));
        this.areNotificationsEnabled = min7;
        b.C0007b<getMode> min8 = isScrap.getMin(onDisappear.length(this.newSession, this.warmup, this.updateVisuals, this.validateRelationship, this.ICustomTabsService$Default, this.ITrustedWebActivityCallback, this.onExtraCallback, this.ITrustedWebActivityService, this.ITrustedWebActivityCallback$Stub, min7, this.onTransact));
        this.notifyNotificationWithChannel = min8;
        this.getActiveNotifications = isScrap.getMin(setDuration.getMax(featureModule2, min8));
        invoke invoke2 = new invoke(r6);
        this.cancelNotification = invoke2;
        this.getSmallIconId = didRangeBeaconsInRegion.create(this.getMax, this.setMax, invoke2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.toDoubleRange);
        this.getSmallIconBitmap = max;
        this.notify = getSystemInfo.setMax(max);
        length length3 = new length(r6);
        this.ITrustedWebActivityService$Stub = length3;
        setOptionMenu create6 = setOptionMenu.create(length3);
        this.ITrustedWebActivityService$Stub$Proxy = create6;
        this.INotificationSideChannel = isScrap.getMin(setPropagation.length(this.getActiveNotifications, this.getSmallIconId, this.notify, create6, this.extraCallback));
        this.ITrustedWebActivityService$Default = getLoadsImagesAutomatically.create(this.getMax, this.setMax, this.getMin);
        this.INotificationSideChannel$Default = setWebContentsDebuggingEnabled.create(this.getMin);
        installPathExist create7 = installPathExist.create(this.getMin);
        this.INotificationSideChannel$Stub = create7;
        b.C0007b<getTargets> min9 = isScrap.getMin(addViewValues.length(this.getActiveNotifications, this.INotificationSideChannel, this.ITrustedWebActivityService$Default, this.INotificationSideChannel$Default, create7));
        this.cancelAll = min9;
        this.INotificationSideChannel$Stub$Proxy = isScrap.getMin(parseMatchOrder.length(featureModule2, min9));
        this.cancel = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMax getmax = new getMax(r6);
        this.RemoteActionCompatParcelizer = getmax;
        this.IconCompatParcelizer = GriverOpenAuthExtension.create(getmax);
        this.MediaBrowserCompat$CustomActionResultReceiver = BLEManager.AnonymousClass2.create(this.getMax, this.setMax, this.asBinder);
        this.read = GriverDialogExtension.create(this.getMax, this.setMax, this.RemoteActionCompatParcelizer);
        this.write = checkSuffixSupported.create(this.getMin);
        this.MediaDescriptionCompat = isImage.create(this.getMin);
        getFillColor max2 = getFillColor.setMax(this.cancel, startListenScreenshot.setMin(), this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.write, this.MediaDescriptionCompat);
        this.MediaBrowserCompat$SearchResultReceiver = max2;
        this.MediaBrowserCompat$MediaItem$Flags = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.MediaBrowserCompat$MediaItem = BindFont.length(servicesModule);
        getCause getcause = new getCause(r6);
        this.MediaBrowserCompat$ItemReceiver = getcause;
        this.MediaMetadataCompat$TextKey = onStartBleScan.create(this.getMax, this.setMax, getcause);
        this.MediaMetadataCompat$RatingKey = onGetBluetoothCharacteristics.create(this.getMax, this.setMax, this.MediaBrowserCompat$ItemReceiver);
        toString tostring = new toString(r6);
        this.MediaMetadataCompat$LongKey = tostring;
        this.MediaMetadataCompat = matchesBeacon.create(this.cancelNotification, tostring);
        this.MediaMetadataCompat$BitmapKey = validateMac.create(this.getMax, this.setMax, this.cancelNotification);
        this.RatingCompat = IntentHandler.create(this.getMax, this.setMax, this.cancelNotification, this.MediaMetadataCompat$LongKey);
        this.onEvent = toUuid.create(this.getMin);
        this.RatingCompat$StarStyle = didDetermineStateForRegion.create(this.cancelNotification);
        create create8 = new create(r6);
        this.RatingCompat$Style = create8;
        this.IMediaControllerCallback = BLEManager.AnonymousClass3.create(create8);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.RatingCompat$Style);
        this.onQueueTitleChanged = create9;
        b.C0007b<BindInt> min10 = isScrap.getMin(OnCheckedChanged.length(this.toDoubleRange, this.MediaBrowserCompat$MediaItem, this.ITrustedWebActivityService$Stub$Proxy, this.notify, this.MediaMetadataCompat$TextKey, this.MediaMetadataCompat$RatingKey, this.MediaMetadataCompat, this.MediaMetadataCompat$BitmapKey, this.getSmallIconId, this.RatingCompat, this.onEvent, this.RatingCompat$StarStyle, this.IMediaControllerCallback, create9));
        this.onSessionDestroyed = min10;
        b.C0007b<getPath> min11 = isScrap.getMin(Slide.getMin(this.setDefaultImpl, this.mayLaunchUrl, this.INotificationSideChannel$Stub$Proxy, this.MediaBrowserCompat$MediaItem$Flags, min10));
        this.onPlaybackStateChanged = min11;
        DeepLinkModule deepLinkModule3 = deepLinkModule;
        this.onQueueChanged = isScrap.getMin(Fade.setMin(deepLinkModule3, min11));
        equals equals2 = new equals(r6);
        this.onMetadataChanged = equals2;
        this.onShuffleModeChangedRemoved = APWebMessagePort.APWebMessageCallback.create(this.getMax, this.setMax, equals2);
        this.onCaptioningEnabledChanged = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.getMax, this.setMax, this.RemoteActionCompatParcelizer);
        this.onRepeatModeChanged = create10;
        b.C0007b<setStartDelay> min12 = isScrap.getMin(setInterpolator.setMin(this.onQueueChanged, this.onShuffleModeChangedRemoved, this.onCaptioningEnabledChanged, create10));
        this.onExtrasChanged = min12;
        this.onVolumeInfoChanged = isScrap.getMin(ChangeBounds.setMin(deepLinkModule3, min12));
    }

    public static final class getMin {
        public FeatureModule equals;
        public ScanQrModule getMax;
        public NewPromoBannerModule getMin;
        public ServicesModule isInside;
        public GlobalFeedsModule length;
        public DeepLinkModule setMax;
        public RestoreUrlModule setMin;
        public PrepareException.AnonymousClass1 toFloatRange;
        public OauthModule toIntRange;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class ICustomTabsCallback implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMin;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<GriverAppXInterceptor.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAppXInterceptor.AnonymousClass1 b = this.getMax.b();
            if (b != null) {
                return b;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMin implements b.C0007b<toolbarMenuClicked> {
        private final PrepareException.AnonymousClass1 setMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            toolbarMenuClicked cause = this.setMax.getCause();
            if (cause != null) {
                return cause;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class toFloatRange implements b.C0007b<doUpdateVisitedHistory> {
        private final PrepareException.AnonymousClass1 setMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            doUpdateVisitedHistory ICustomTabsCallback = this.setMin.ICustomTabsCallback();
            if (ICustomTabsCallback != null) {
                return ICustomTabsCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 getMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 getMax;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.getMax.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class b implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMin;

        b(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 setMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
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

    static class onNavigationEvent implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 getMax;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 setMax;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.setMax.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class getCause implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMin;

        getCause(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMax;

        create(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onCharacteristicChanged write = this.setMax.write();
            if (write != null) {
                return write;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMin;

        equals(PrepareException.AnonymousClass1 r1) {
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

    public final void getMin(NewPromoBannerView newPromoBannerView) {
        GriverCaptureActivity.AnonymousClass6.length(newPromoBannerView, addMapping.getMin(this.setMin, this.Grayscale$Algorithm.get()));
        GriverCaptureActivity.AnonymousClass6.getMin(newPromoBannerView, this.b.get());
        GriverCaptureActivity.AnonymousClass6.getMax(newPromoBannerView, this.onVolumeInfoChanged.get());
    }
}
