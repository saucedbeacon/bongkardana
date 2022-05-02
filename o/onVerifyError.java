package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.feeds.GlobalFeedsModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.home.news.NewsFeedsView;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverManifest;
import o.GriverPrepareInterceptor;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.RVWebSocketManager;
import o.Transition;
import o.b;
import o.getDuration;
import o.getRunningAnimators;
import o.onAnimationEnd;
import o.setTrimPathOffset;
import o.style;

public final class onVerifyError implements RVWebSocketManager.Holder {
    private b.C0007b<applySettingsToScheduledJob> FastBitmap$CoordinateSystem;
    private b.C0007b<setNetworkAvailable> Grayscale$Algorithm;
    private b.C0007b<getPropagation> ICustomTabsCallback;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsCallback$Default;
    private b.C0007b<parseBatteryPercentage> ICustomTabsCallback$Stub;
    private b.C0007b<getPerformanceTracker> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getBlockNetworkImage> ICustomTabsService;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> ICustomTabsService$Default;
    private b.C0007b<GriverPrepareInterceptor> ICustomTabsService$Stub;
    private b.C0007b<ResourceProviderExtension> ICustomTabsService$Stub$Proxy;
    private b.C0007b<getDuration.length> IMediaControllerCallback;
    private b.C0007b<notifyCharacteristicValue> INotificationSideChannel;
    private b.C0007b<style.getMin> INotificationSideChannel$Default;
    private b.C0007b<onConnect> INotificationSideChannel$Stub;
    private b.C0007b<onDisconnect> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<method> IPostMessageService;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> IPostMessageService$Default;
    private b.C0007b<R.styleable> IPostMessageService$Stub;
    private b.C0007b<onDescriptorWrite> IPostMessageService$Stub$Proxy;
    private b.C0007b<getTinyLocalStorageInfo> ITrustedWebActivityCallback;
    private b.C0007b<R.id.getMax> ITrustedWebActivityCallback$Default;
    private b.C0007b<BindView.setMax> ITrustedWebActivityCallback$Stub;
    private b.C0007b<OnItemLongClick> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<DataProviderException> ITrustedWebActivityService;
    private b.C0007b<checkBitmap> ITrustedWebActivityService$Default;
    private b.C0007b<KitUtils> ITrustedWebActivityService$Stub;
    private b.C0007b<getPlatformCallback> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<Region$1> IconCompatParcelizer;
    private b.C0007b<H5Utils> IsOverlapping;
    private b.C0007b<setInitTextColor> Mean$Arithmetic;
    private b.C0007b<toByteArray> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<onCharacteristicChanged> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<didExitRegion> MediaBrowserCompat$MediaItem;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<BindInt> MediaDescriptionCompat;
    private b.C0007b<onMessage> MediaMetadataCompat;
    private b.C0007b<AutoTransition.setMax> MediaMetadataCompat$BitmapKey;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$LongKey;
    private b.C0007b<getPath> MediaMetadataCompat$RatingKey;
    private b.C0007b<setSupportZoom> MediaMetadataCompat$TextKey;
    private b.C0007b<setStartDelay> RatingCompat;
    private b.C0007b<GriverCreateDialogParam> RatingCompat$Style;
    private b.C0007b<convertIntentsToCallbacks> RemoteActionCompatParcelizer;
    private b.C0007b<AndroidModel> areNotificationsEnabled;
    private b.C0007b<enableBackButton> asBinder;
    private b.C0007b<getUniqueId> asInterface;
    private b.C0007b<getTransitionValues> b;
    private b.C0007b<onCharacteristicWriteCompleted> cancel;
    private b.C0007b<onAnimationEnd.length> cancelAll;
    private b.C0007b<onAnimationEnd.getMin> cancelNotification;
    private b.C0007b<isTransitionRequired> create;
    private b.C0007b<setBackButton> equals;
    private b.C0007b<getMode> extraCallback;
    private b.C0007b<Context> extraCallbackWithResult;
    private b.C0007b<getAllInstallFiles> extraCommand;
    private b.C0007b<getCommonResources> getActiveNotifications;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> getCause;
    private b.C0007b<APWebSettings.LayoutAlgorithm> getDefaultImpl;
    private b.C0007b<GetAuthCode> getInterfaceDescriptor;
    private b.C0007b<appxLoadFailed> getMax;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> getMin;
    private b.C0007b<shouldShowRevokeOpenAuthItem> getSmallIconBitmap;
    private b.C0007b<OnFocusChange> getSmallIconId;
    private b.C0007b<getEpicenter> hashCode;
    private b.C0007b<updateFootState> invoke;
    private b.C0007b<canGoBackOrForward> invokeSuspend;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> isInside;
    private b.C0007b<setDefaultFontSize> length;
    private b.C0007b<doUpdateVisitedHistory> mayLaunchUrl;
    private b.C0007b<getTargets> newSession;
    private b.C0007b<getRunningAnimators.setMax> newSessionWithExtras;
    private b.C0007b<GriverCreatePromptParam> notify;
    private b.C0007b<BindView.setMin> notifyNotificationWithChannel;
    private b.C0007b<requestAppWithAppId> onExtraCallback;
    private b.C0007b<setDataRequestNotifier> onMessageChannelReady;
    private b.C0007b<queryAppInfo> onNavigationEvent;
    private b.C0007b<getRunningAnimators.getMin> onPostMessage;
    private b.C0007b<getCancelable> onRelationshipValidationResult;
    private b.C0007b<toUuidString> onTransact;
    private b.C0007b<getLocalMatrix> postMessage;
    private b.C0007b<hasSameIdentifiers> read;
    private b.C0007b<R.id.length> receiveFile;
    private b.C0007b<onUnhandledKeyEvent> requestPostMessageChannel;
    private b.C0007b<setTrimPathOffset.setMax> requestPostMessageChannelWithExtras;
    private b.C0007b<setEpicenterCallback> setDefaultImpl;
    private b.C0007b<MovableFrameLayout> setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<getScanJobRuntimeMillis> toDoubleRange;
    private b.C0007b<setPageCacheCapacity> toFloatRange;
    private b.C0007b<onJsBeforeUnload> toIntRange;
    private b.C0007b<addChooseImageCrossOrigin> toString;
    private b.C0007b<onEmbedViewAttachedToWebView> updateVisuals;
    private b.C0007b<Activity> validateRelationship;
    private b.C0007b<setSceneRoot> valueOf;
    private b.C0007b<getAppPerfKey> values;
    private b.C0007b<setTrimPathOffset.setMin> warmup;
    private b.C0007b<onWebViewDestory> write;

    public /* synthetic */ onVerifyError(GlobalFeedsModule globalFeedsModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(globalFeedsModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r8);
    }

    private onVerifyError(GlobalFeedsModule globalFeedsModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.getMax = new invokeSuspend(r6);
        this.setMin = new values(r6);
        toString tostring = new toString(r6);
        this.getMin = tostring;
        this.setMax = GriverBizManifest.create(this.getMax, this.setMin, tostring);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.length = tofloatrange;
        this.toFloatRange = APWebSettings.PluginState.create(tofloatrange);
        this.equals = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        equals equals2 = new equals(r6);
        this.isInside = equals2;
        this.toIntRange = onConsoleMessage.create(this.getMax, this.setMin, equals2);
        onVerifyError$Mean$Arithmetic onverifyerror_mean_arithmetic = new onVerifyError$Mean$Arithmetic(r6);
        this.IsOverlapping = onverifyerror_mean_arithmetic;
        this.toString = H5ResourceCORSUtil.AnonymousClass1.create(this.getMax, this.setMin, onverifyerror_mean_arithmetic);
        onVerifyError$FastBitmap$CoordinateSystem onverifyerror_fastbitmap_coordinatesystem = new onVerifyError$FastBitmap$CoordinateSystem(r6);
        this.values = onverifyerror_fastbitmap_coordinatesystem;
        this.hashCode = capturePropagationValues.getMin(this.toString, onverifyerror_fastbitmap_coordinatesystem);
        invoke invoke2 = new invoke(r6);
        this.toDoubleRange = invoke2;
        this.FastBitmap$CoordinateSystem = ScanState.create(this.getMax, this.setMin, invoke2);
        this.Mean$Arithmetic = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.Mean$Arithmetic);
        this.invoke = length2;
        this.valueOf = Transition.MatchOrder.length(this.FastBitmap$CoordinateSystem, length2);
        this.invokeSuspend = setInitialScale.create(this.getMax, this.setMin, this.length);
        postUrl create2 = postUrl.create(this.getMax, this.setMin, this.length);
        this.Grayscale$Algorithm = create2;
        this.ICustomTabsCallback = getName.setMin(this.invokeSuspend, create2, manuallyReleaseCamera.setMax());
        hashCode hashcode = new hashCode(r6);
        this.getCause = hashcode;
        saveAppInfos create3 = saveAppInfos.create(hashcode);
        this.onNavigationEvent = create3;
        this.b = captureHierarchy.length(create3, OpenInBrowserBridgeExtension.setMax());
        this.create = isScrap.getMin(getPathMotion.setMin());
        getMax getmax = new getMax(r6);
        this.extraCallbackWithResult = getmax;
        this.onRelationshipValidationResult = isScrap.getMin(getCancelOnTouchOutside.create(getmax));
        getDataRequestNotifier create4 = getDataRequestNotifier.create(this.length);
        this.onMessageChannelReady = create4;
        b.C0007b<getMode> min = isScrap.getMin(onDisappear.length(this.setMax, this.toFloatRange, this.equals, this.toIntRange, this.hashCode, this.valueOf, this.ICustomTabsCallback, this.b, this.create, this.onRelationshipValidationResult, create4));
        this.extraCallback = min;
        this.onPostMessage = isScrap.getMin(setDuration.getMax(featureModule2, min));
        valueOf valueof = new valueOf(r6);
        this.onTransact = valueof;
        this.asInterface = didRangeBeaconsInRegion.create(this.getMax, this.setMin, valueof);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.extraCallbackWithResult);
        this.ICustomTabsCallback$Default = max;
        this.ICustomTabsCallback$Stub = getSystemInfo.setMax(max);
        getMin getmin = new getMin(r6);
        this.asBinder = getmin;
        this.getInterfaceDescriptor = setOptionMenu.create(getmin);
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.ICustomTabsCallback$Stub$Proxy = isOverlapping;
        this.setDefaultImpl = isScrap.getMin(setPropagation.length(this.onPostMessage, this.asInterface, this.ICustomTabsCallback$Stub, this.getInterfaceDescriptor, isOverlapping));
        this.ICustomTabsService = getLoadsImagesAutomatically.create(this.getMax, this.setMin, this.length);
        this.getDefaultImpl = setWebContentsDebuggingEnabled.create(this.length);
        installPathExist create5 = installPathExist.create(this.length);
        this.extraCommand = create5;
        b.C0007b<getTargets> min2 = isScrap.getMin(addViewValues.length(this.onPostMessage, this.setDefaultImpl, this.ICustomTabsService, this.getDefaultImpl, create5));
        this.newSession = min2;
        this.newSessionWithExtras = isScrap.getMin(parseMatchOrder.length(featureModule2, min2));
        this.warmup = isScrap.getMin(getGroupName.getMin(globalFeedsModule));
        toIntRange tointrange = new toIntRange(r6);
        this.mayLaunchUrl = tointrange;
        this.requestPostMessageChannel = onReceivedSslError.create(this.getMax, this.setMin, tointrange);
        this.updateVisuals = overScrollBy.create(this.getMax, this.setMin, this.mayLaunchUrl);
        b.C0007b<getLocalMatrix> min3 = isScrap.getMin(getScaleX.getMax(this.warmup, this.requestPostMessageChannel, readBLECharacteristicValue.getMax(), this.updateVisuals));
        this.postMessage = min3;
        this.requestPostMessageChannelWithExtras = isScrap.getMin(getRotation.setMax(globalFeedsModule, min3));
        b.C0007b<Activity> min4 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.validateRelationship = min4;
        b.C0007b<method> min5 = isScrap.getMin(type.getMax(min4));
        this.IPostMessageService = min5;
        this.receiveFile = isScrap.getMin(R.integer.setMin(scanQrModule2, min5));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.ICustomTabsService$Stub = todoublerange;
        this.ICustomTabsService$Stub$Proxy = GriverPrepareInterceptor.AnonymousClass2.create(this.getMax, this.setMin, todoublerange);
        this.ICustomTabsService$Default = beforeQuery.create(this.getMax, this.setMin, this.ICustomTabsService$Stub);
        this.ITrustedWebActivityCallback = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        create create6 = new create(r6);
        this.IPostMessageService$Stub$Proxy = create6;
        this.IPostMessageService$Default = onCharacteristicWrite.create(create6, this.getMax, this.setMin);
        localIdToBytes create7 = localIdToBytes.create(this.ICustomTabsService$Stub);
        this.onExtraCallback = create7;
        b.C0007b<R.styleable> min6 = isScrap.getMin(Setter.length(this.extraCallbackWithResult, this.receiveFile, this.ICustomTabsService$Stub$Proxy, this.ICustomTabsService$Default, this.ITrustedWebActivityCallback, this.ICustomTabsCallback$Stub$Proxy, this.onMessageChannelReady, this.IPostMessageService$Default, create7));
        this.IPostMessageService$Stub = min6;
        this.ITrustedWebActivityCallback$Default = isScrap.getMin(R.drawable.setMin(scanQrModule2, min6));
        b.C0007b<OnItemLongClick> min7 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.ITrustedWebActivityCallback$Stub$Proxy = min7;
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min7));
        onVerifyError$Grayscale$Algorithm onverifyerror_grayscale_algorithm = new onVerifyError$Grayscale$Algorithm(r6);
        this.areNotificationsEnabled = onverifyerror_grayscale_algorithm;
        NullBeaconDataFactory create8 = NullBeaconDataFactory.create(this.getMax, this.setMin, onverifyerror_grayscale_algorithm);
        this.ITrustedWebActivityService = create8;
        b.C0007b<OnFocusChange> min8 = isScrap.getMin(OnEditorAction.getMin(this.ITrustedWebActivityCallback$Stub, create8));
        this.getSmallIconId = min8;
        this.notifyNotificationWithChannel = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min8));
        OauthModule oauthModule3 = oauthModule;
        this.cancelNotification = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule3, setTrimPathStart.length()));
        length length3 = new length(r6);
        this.getActiveNotifications = length3;
        this.getSmallIconBitmap = GriverOpenAuthExtension.create(length3);
        this.INotificationSideChannel = BLEManager.AnonymousClass2.create(this.getMax, this.setMin, this.IPostMessageService$Stub$Proxy);
        this.notify = GriverDialogExtension.create(this.getMax, this.setMin, this.getActiveNotifications);
        this.ITrustedWebActivityService$Stub = checkSuffixSupported.create(this.length);
        this.ITrustedWebActivityService$Default = isImage.create(this.length);
        getFillColor max2 = getFillColor.setMax(this.cancelNotification, startListenScreenshot.setMin(), this.getSmallIconBitmap, this.INotificationSideChannel, this.notify, this.ITrustedWebActivityService$Stub, this.ITrustedWebActivityService$Default);
        this.ITrustedWebActivityService$Stub$Proxy = max2;
        this.cancelAll = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule3, max2));
        this.INotificationSideChannel$Default = BindFont.length(servicesModule);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.INotificationSideChannel$Stub$Proxy = iCustomTabsCallback;
        this.cancel = onStartBleScan.create(this.getMax, this.setMin, iCustomTabsCallback);
        this.INotificationSideChannel$Stub = onGetBluetoothCharacteristics.create(this.getMax, this.setMin, this.INotificationSideChannel$Stub$Proxy);
        isInside isinside = new isInside(r6);
        this.write = isinside;
        this.read = matchesBeacon.create(this.onTransact, isinside);
        this.IconCompatParcelizer = validateMac.create(this.getMax, this.setMin, this.onTransact);
        this.RemoteActionCompatParcelizer = IntentHandler.create(this.getMax, this.setMin, this.onTransact, this.write);
        this.MediaBrowserCompat$CustomActionResultReceiver = toUuid.create(this.length);
        this.MediaBrowserCompat$MediaItem = didDetermineStateForRegion.create(this.onTransact);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.MediaBrowserCompat$ItemReceiver = onnavigationevent;
        this.MediaBrowserCompat$SearchResultReceiver = BLEManager.AnonymousClass3.create(onnavigationevent);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$MediaItem$Flags = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.extraCallbackWithResult, this.INotificationSideChannel$Default, this.getInterfaceDescriptor, this.ICustomTabsCallback$Stub, this.cancel, this.INotificationSideChannel$Stub, this.read, this.IconCompatParcelizer, this.asInterface, this.RemoteActionCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, create9));
        this.MediaDescriptionCompat = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.ITrustedWebActivityCallback$Default, this.notifyNotificationWithChannel, this.newSessionWithExtras, this.cancelAll, min9));
        this.MediaMetadataCompat$RatingKey = min10;
        DeepLinkModule deepLinkModule3 = deepLinkModule;
        this.MediaMetadataCompat$BitmapKey = isScrap.getMin(Fade.setMin(deepLinkModule3, min10));
        setMax setmax = new setMax(r6);
        this.MediaMetadataCompat$TextKey = setmax;
        this.MediaMetadataCompat = APWebMessagePort.APWebMessageCallback.create(this.getMax, this.setMin, setmax);
        this.MediaMetadataCompat$LongKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.getMax, this.setMin, this.getActiveNotifications);
        this.RatingCompat$Style = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaMetadataCompat$BitmapKey, this.MediaMetadataCompat, this.MediaMetadataCompat$LongKey, create10));
        this.RatingCompat = min11;
        this.IMediaControllerCallback = isScrap.getMin(ChangeBounds.setMin(deepLinkModule3, min11));
    }

    public static final class setMin {
        public OauthModule IsOverlapping;
        public DeepLinkModule getMax;
        public ScanQrModule getMin;
        public RestoreUrlModule length;
        public FeatureModule setMax;
        public GlobalFeedsModule setMin;
        public ServicesModule toFloatRange;
        public PrepareException.AnonymousClass1 toIntRange;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class invokeSuspend implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMax;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.setMax.ICustomTabsService();
            if (ICustomTabsService != null) {
                return ICustomTabsService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 setMax;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    static class getMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.setMax.onTransact();
            if (onTransact != null) {
                return onTransact;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toIntRange implements b.C0007b<doUpdateVisitedHistory> {
        private final PrepareException.AnonymousClass1 setMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            doUpdateVisitedHistory ICustomTabsCallback = this.setMax.ICustomTabsCallback();
            if (ICustomTabsCallback != null) {
                return ICustomTabsCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 setMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverPrepareInterceptor FastBitmap$CoordinateSystem = this.setMax.FastBitmap$CoordinateSystem();
            if (FastBitmap$CoordinateSystem != null) {
                return FastBitmap$CoordinateSystem;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMin;

        create(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMin;

        isInside(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 length;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMax;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    public final void setMin(NewsFeedsView newsFeedsView) {
        GriverManifest.AnonymousClass55.getMax(newsFeedsView, this.newSessionWithExtras.get());
        GriverManifest.AnonymousClass55.getMin(newsFeedsView, this.requestPostMessageChannelWithExtras.get());
        GriverManifest.AnonymousClass55.length(newsFeedsView, this.IMediaControllerCallback.get());
        GriverManifest.AnonymousClass55.getMax(newsFeedsView, this.notifyNotificationWithChannel.get());
        GriverManifest.AnonymousClass55.setMin(newsFeedsView, this.ITrustedWebActivityCallback$Default.get());
    }
}
