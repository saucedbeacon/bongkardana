package o;

import android.app.Activity;
import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.DecodeQrImageModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.di.modules.UserBankModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.requestmoney.RequestMoneyActivity;
import id.dana.scanner.ScannerFragment;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.GriverAMCSAppUpdater;
import o.GriverAuthGuideContentExtension;
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
import o.callback;
import o.getDuration;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.onAnimationEnd;
import o.onNext;
import o.publishImageAction;
import o.style;

public final class PackageParseUtils implements getObject {
    private b.C0007b<BLETraceMonitor> IsOverlapping;
    private b.C0007b<onDisconnect> equals;
    private b.C0007b<appxLoadFailed> getMax;
    private final UserBankModule getMin;
    private b.C0007b<setOnOptionPickListener> isInside;
    private b.C0007b<getSelectedIndex.setMax> length;
    private final PrepareException.AnonymousClass1 setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<getSelectedIndex.length> toFloatRange;
    private b.C0007b<onStopBleScan> toIntRange;

    public /* synthetic */ PackageParseUtils(UserBankModule userBankModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, PrepareException.AnonymousClass1 r3, byte b) {
        this(userBankModule, bottomSheetOnBoardingModule, r3);
    }

    private PackageParseUtils(UserBankModule userBankModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, PrepareException.AnonymousClass1 r4) {
        this.setMax = r4;
        this.getMin = userBankModule;
        this.length = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        this.getMax = new setMin(r4);
        this.setMin = new setMax(r4);
        length length2 = new length(r4);
        this.equals = length2;
        this.IsOverlapping = onDeviceFound.create(this.getMax, this.setMin, length2);
        onDisconnectBLE create = onDisconnectBLE.create(this.getMax, this.setMin, this.equals);
        this.toIntRange = create;
        onSelected min = onSelected.setMin(this.length, this.IsOverlapping, create);
        this.isInside = min;
        this.toFloatRange = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min));
    }

    public static final class getMax {
        public BottomSheetOnBoardingModule length;
        public PrepareException.AnonymousClass1 setMax;
        public UserBankModule setMin;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class setMin implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 getMax;

        length(PrepareException.AnonymousClass1 r1) {
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

    public final class a implements getBigDecimal {
        private b.C0007b<PdfImageSource.length> FastBitmap$CoordinateSystem;
        private b.C0007b<GriverPrepareInterceptor> Grayscale$Algorithm;
        private b.C0007b<setDataRequestNotifier> ICustomTabsCallback;
        private b.C0007b<ifContainsEmbedSurfaceView> ICustomTabsCallback$Default;
        private b.C0007b<isKeepCallback> ICustomTabsCallback$Stub;
        private b.C0007b<H5ServiceWorkerControllerProvider> ICustomTabsCallback$Stub$Proxy;
        private b.C0007b<getEmbededViewProvider> ICustomTabsService;
        private b.C0007b<enableUCCorePreheadInit> ICustomTabsService$Default;
        private b.C0007b<setEventSource> ICustomTabsService$Stub;
        private b.C0007b<getRedirectUrl> ICustomTabsService$Stub$Proxy;
        private b.C0007b<OrientationDetector.OrientationListener> IMediaControllerCallback;
        private b.C0007b<style.getMin> IMediaControllerCallback$Stub;
        private b.C0007b<onDisconnect> IMediaControllerCallback$Stub$Proxy;
        private b.C0007b<onCharacteristicWriteCompleted> IMediaSession;
        private b.C0007b<onJsBeforeUnload> INotificationSideChannel;
        private b.C0007b<getScanJobRuntimeMillis> INotificationSideChannel$Default;
        private b.C0007b<getEpicenter> INotificationSideChannel$Stub;
        private b.C0007b<getAppPerfKey> INotificationSideChannel$Stub$Proxy;
        private b.C0007b<NXH5WebViewAdapter> IPostMessageService;
        private b.C0007b<setH5OverScrollListener> IPostMessageService$Default;
        private b.C0007b<enableBackButton> IPostMessageService$Stub;
        private b.C0007b<sendServiceWorkerPushMessage> IPostMessageService$Stub$Proxy;
        private b.C0007b<IH5EmbedViewJSCallback> ITrustedWebActivityCallback;
        private b.C0007b<AndroidModel> ITrustedWebActivityCallback$Default;
        private b.C0007b<onNext.setMin> ITrustedWebActivityCallback$Stub;
        private b.C0007b<BindView.setMax> ITrustedWebActivityCallback$Stub$Proxy;
        private b.C0007b<BLEServiceUnit> ITrustedWebActivityService;
        private b.C0007b<setBackButton> ITrustedWebActivityService$Default;
        private b.C0007b<H5Utils> ITrustedWebActivityService$Stub;
        private b.C0007b<setMediaPlaybackRequiresUserGesture> ITrustedWebActivityService$Stub$Proxy;
        private b.C0007b<setSceneRoot> IconCompatParcelizer;
        private b.C0007b<OnItemSelected$Callback> IsOverlapping;
        private b.C0007b<method> Mean$Arithmetic;
        private b.C0007b<setInitTextColor> MediaBrowserCompat$CustomActionResultReceiver;
        private b.C0007b<getTransitionValues> MediaBrowserCompat$ItemReceiver;
        private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> MediaBrowserCompat$MediaItem;
        private b.C0007b<isTransitionRequired> MediaBrowserCompat$MediaItem$Flags;
        private b.C0007b<getPropagation> MediaBrowserCompat$SearchResultReceiver;
        private b.C0007b<queryAppInfo> MediaDescriptionCompat;
        private b.C0007b<getMode> MediaMetadataCompat;
        private b.C0007b<getRunningAnimators.getMin> MediaMetadataCompat$BitmapKey;
        private b.C0007b<getCancelable> MediaMetadataCompat$LongKey;
        private b.C0007b<getUniqueId> MediaMetadataCompat$RatingKey;
        private b.C0007b<toUuidString> MediaMetadataCompat$TextKey;
        private b.C0007b<APWebSettings.LayoutAlgorithm> RatingCompat;
        private b.C0007b<parseBatteryPercentage> RatingCompat$StarStyle;
        private b.C0007b<setEpicenterCallback> RatingCompat$Style;
        private b.C0007b<setNetworkAvailable> RemoteActionCompatParcelizer;
        private b.C0007b<onMessage> adjustVolume;
        private b.C0007b<OnItemLongClick> areNotificationsEnabled;
        private b.C0007b<onWebViewDestory> asBinder;
        private b.C0007b<ifContainsEmbedView> asInterface;
        private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> b;
        private b.C0007b<addChooseImageCrossOrigin> cancel;
        private b.C0007b<applySettingsToScheduledJob> cancelAll;
        private b.C0007b<MovableFrameLayout> cancelNotification;
        private b.C0007b<getPerformanceTracker> create;
        private b.C0007b<callback.setMax> equals;
        private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> extraCallback;
        private b.C0007b<onDescriptorWrite> extraCallbackWithResult;
        private b.C0007b<getInternalContentView> extraCommand;
        private b.C0007b<DataProviderException> getActiveNotifications;
        private b.C0007b<setDefaultFontSize> getCause;
        private b.C0007b<H5DataProvider> getDefaultImpl;
        private b.C0007b<getDuration.length> getExtras;
        private b.C0007b<BLEManager.AnonymousClass2.C00022> getFlags;
        private b.C0007b<keepCallback> getInterfaceDescriptor;
        private b.C0007b<BindInt> getLaunchPendingIntent;
        private b.C0007b<callback.getMin> getMax;
        private b.C0007b<getPath> getMetadata;
        private b.C0007b<Context> getMin;
        private b.C0007b<onCharacteristicChanged> getPackageName;
        private b.C0007b<LocationBridgeExtension.AnonymousClass2> getPlaybackState;
        private b.C0007b<AutoTransition.setMax> getQueue;
        private b.C0007b<BLETraceMonitor> getQueueTitle;
        private b.C0007b<getSelectedIndex.setMax> getRatingType;
        private b.C0007b<GriverCreateDialogParam> getRepeatMode;
        private b.C0007b<onStopBleScan> getShuffleMode;
        private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> getSmallIconBitmap;
        private b.C0007b<OnFocusChange> getSmallIconId;
        private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> getTag;
        private b.C0007b<didExitRegion> getVolumeAttributes;
        private b.C0007b<PdfImageSource.setMin> hashCode;
        private b.C0007b<ResourceProviderExtension> invoke;
        private b.C0007b<R.id.length> invokeSuspend;
        private b.C0007b<setStartDelay> isCaptioningEnabled;
        private b.C0007b<getScheme> isInside;
        private b.C0007b<setOnOptionPickListener> isShuffleModeEnabledRemoved;
        private b.C0007b<Region$1> isTransportControlEnabled;
        private b.C0007b<decodeByImageDecoder> length;
        private b.C0007b<isDispatcherOnWorkerThread> mayLaunchUrl;
        private b.C0007b<shouldExit> newSession;
        private b.C0007b<isCanceled> newSessionWithExtras;
        private b.C0007b<setPageCacheCapacity> notify;
        private b.C0007b<BindView.setMin> notifyNotificationWithChannel;
        private b.C0007b<GriverCreatePromptParam> onCaptioningEnabledChanged;
        private b.C0007b<getBlockNetworkImage> onEvent;
        private b.C0007b<GetAuthCode> onExtraCallback;
        private b.C0007b<shouldShowRevokeOpenAuthItem> onExtrasChanged;
        private b.C0007b<requestAppWithAppId> onMessageChannelReady;
        private b.C0007b<getCommonResources> onMetadataChanged;
        private b.C0007b<getTinyLocalStorageInfo> onNavigationEvent;
        private b.C0007b<getRunningAnimators.setMax> onPlaybackStateChanged;
        private b.C0007b<R.styleable> onPostMessage;
        private b.C0007b<getTargets> onQueueChanged;
        private b.C0007b<onAnimationEnd.getMin> onQueueTitleChanged;
        private b.C0007b<R.id.getMax> onRelationshipValidationResult;
        private b.C0007b<KitUtils> onRepeatModeChanged;
        private b.C0007b<getAllInstallFiles> onSessionDestroyed;
        private b.C0007b<getPlatformCallback> onSessionReady;
        private b.C0007b<onAnimationEnd.length> onShuffleModeChanged;
        private b.C0007b<checkBitmap> onShuffleModeChangedRemoved;
        private b.C0007b<onNext.length> onTransact;
        private b.C0007b<notifyCharacteristicValue> onVolumeInfoChanged;
        private b.C0007b<hasPageStartButNoInterceptRequest> postMessage;
        private b.C0007b<updateFootState> read;
        private b.C0007b<getWebViewCoreSoPath> receiveFile;
        private b.C0007b<convertIntentsToCallbacks> registerCallbackListener;
        private b.C0007b<getSelectedIndex.length> removeQueueItem;
        private b.C0007b<releaseView> requestPostMessageChannel;
        private b.C0007b<getShareUrl> requestPostMessageChannelWithExtras;
        private b.C0007b<hasSameIdentifiers> sendCommand;
        private b.C0007b<onConnect> sendMediaButton;
        private b.C0007b<H5Event.Builder> setDefaultImpl;
        private final CheckoutH5EventModule setMax;
        private final PrepareException.AnonymousClass1 setMin;
        private b.C0007b<setSupportZoom> setVolumeTo;
        private b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> toDoubleRange;
        private b.C0007b<dynamicProxy> toFloatRange;
        private b.C0007b<appxLoadFailed> toIntRange;
        private b.C0007b<stringify> toString;
        private b.C0007b<toByteArray> unregisterCallbackListener;
        private b.C0007b<NXH5WebViewClientAdapter> updateVisuals;
        private b.C0007b<cannotInitUC> validateRelationship;
        private b.C0007b<Activity> valueOf;
        private b.C0007b<CommonUtil> values;
        private b.C0007b<INebulaPage.H5PageHandler> warmup;
        private b.C0007b<canGoBackOrForward> write;

        public /* synthetic */ a(ScanQrModule scanQrModule, DecodeQrImageModule decodeQrImageModule, DeepLinkModule deepLinkModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PlayStoreReviewModules playStoreReviewModules, CheckoutH5EventModule checkoutH5EventModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r12, byte b2) {
            this(scanQrModule, decodeQrImageModule, deepLinkModule, restoreUrlModule, featureModule, oauthModule, servicesModule, playStoreReviewModules, checkoutH5EventModule, bottomSheetOnBoardingModule, globalNetworkModule, r12);
        }

        private a(ScanQrModule scanQrModule, DecodeQrImageModule decodeQrImageModule, DeepLinkModule deepLinkModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PlayStoreReviewModules playStoreReviewModules, CheckoutH5EventModule checkoutH5EventModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r49) {
            ScanQrModule scanQrModule2 = scanQrModule;
            DeepLinkModule deepLinkModule2 = deepLinkModule;
            RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
            FeatureModule featureModule2 = featureModule;
            OauthModule oauthModule2 = oauthModule;
            PrepareException.AnonymousClass1 r6 = r49;
            this.setMin = r6;
            this.setMax = checkoutH5EventModule;
            this.getMax = isScrap.getMin(OnPageChange.setMin(decodeQrImageModule));
            getMin getmin = new getMin(r6);
            this.getMin = getmin;
            decodeBitmap min = decodeBitmap.getMin(getmin);
            this.length = min;
            b.C0007b<OnItemSelected$Callback> min2 = isScrap.getMin(R.setMax(this.getMax, min, this.getMin));
            this.IsOverlapping = min2;
            this.equals = isScrap.getMin(OnLongClick.setMax(decodeQrImageModule, min2));
            this.toIntRange = new invokeSuspend(r6);
            this.isInside = new toDoubleRange(r6);
            PackageParseUtils$a$FastBitmap$CoordinateSystem packageParseUtils$a$FastBitmap$CoordinateSystem = new PackageParseUtils$a$FastBitmap$CoordinateSystem(r6);
            this.toFloatRange = packageParseUtils$a$FastBitmap$CoordinateSystem;
            this.toString = dumpFile.create(this.toIntRange, this.isInside, packageParseUtils$a$FastBitmap$CoordinateSystem);
            this.values = initialValue.create(this.toIntRange, this.isInside, this.toFloatRange);
            b.C0007b<PdfImageSource.length> min3 = isScrap.getMin(GriverConfigConstants.length(playStoreReviewModules));
            this.FastBitmap$CoordinateSystem = min3;
            PdfViewerActivity.DividerGridItemDecoration max = PdfViewerActivity.DividerGridItemDecoration.setMax(this.toString, this.values, min3);
            this.toDoubleRange = max;
            this.hashCode = isScrap.getMin(dispatchTouchEvent.setMax(playStoreReviewModules, max));
            b.C0007b<Activity> min4 = isScrap.getMin(R.attr.setMax(scanQrModule));
            this.valueOf = min4;
            b.C0007b<method> min5 = isScrap.getMin(type.getMax(min4));
            this.Mean$Arithmetic = min5;
            this.invokeSuspend = isScrap.getMin(R.integer.setMin(scanQrModule2, min5));
            values values2 = new values(r6);
            this.Grayscale$Algorithm = values2;
            this.invoke = GriverPrepareInterceptor.AnonymousClass2.create(this.toIntRange, this.isInside, values2);
            this.b = beforeQuery.create(this.toIntRange, this.isInside, this.Grayscale$Algorithm);
            this.onNavigationEvent = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
            this.create = new equals(r6);
            toFloatRange tofloatrange = new toFloatRange(r6);
            this.getCause = tofloatrange;
            this.ICustomTabsCallback = getDataRequestNotifier.create(tofloatrange);
            create create2 = new create(r6);
            this.extraCallbackWithResult = create2;
            this.extraCallback = onCharacteristicWrite.create(create2, this.toIntRange, this.isInside);
            localIdToBytes create3 = localIdToBytes.create(this.Grayscale$Algorithm);
            this.onMessageChannelReady = create3;
            b.C0007b<R.styleable> min6 = isScrap.getMin(Setter.length(this.getMin, this.invokeSuspend, this.invoke, this.b, this.onNavigationEvent, this.create, this.ICustomTabsCallback, this.extraCallback, create3));
            this.onPostMessage = min6;
            this.onRelationshipValidationResult = isScrap.getMin(R.drawable.setMin(scanQrModule2, min6));
            this.onTransact = isScrap.getMin(setTypeKey.setMax(globalNetworkModule));
            IsOverlapping isOverlapping = new IsOverlapping(r6);
            this.asBinder = isOverlapping;
            this.asInterface = INebulaPage.create(this.toIntRange, this.isInside, isOverlapping);
            this.ICustomTabsCallback$Default = onReceiveValue.create(this.toIntRange, this.isInside, this.asBinder);
            this.ICustomTabsCallback$Stub = eventSource.create(this.toIntRange, this.isInside, this.asBinder, this.extraCallbackWithResult);
            this.getDefaultImpl = has.create(this.toIntRange, this.isInside, this.asBinder);
            this.ICustomTabsService = scriptbizLoadedAndBridgeLoaded.create(this.toIntRange, this.isInside, this.asBinder);
            this.ICustomTabsCallback$Stub$Proxy = H5ScrollChangedCallback.create(this.toIntRange, this.isInside, this.asBinder);
            this.getInterfaceDescriptor = H5Event.AnonymousClass1.create(this.asBinder);
            this.setDefaultImpl = H5OverScrollListener.create(this.toIntRange, this.isInside, this.asBinder);
            this.mayLaunchUrl = getH5page.create(this.toIntRange, this.isInside, this.asBinder);
            this.newSessionWithExtras = setTarget.create(this.asBinder);
            this.warmup = setHandler.create(this.toIntRange, this.isInside, this.asBinder);
            this.extraCommand = getWebChromeClient.create(this.toIntRange, this.isInside, this.asBinder);
            this.newSession = setContainsEmbedSurfaceView.create(this.toIntRange, this.isInside, this.asBinder);
            this.updateVisuals = getWebViewClient.create(this.toIntRange, this.isInside, this.asBinder);
            this.requestPostMessageChannelWithExtras = getUcVersion.create(this.toIntRange, this.isInside, this.asBinder);
            this.validateRelationship = getUCSdkVersion.create(this.toIntRange, this.isInside, this.asBinder);
            this.postMessage = createWebView.create(this.toIntRange, this.isInside, this.asBinder);
            this.requestPostMessageChannel = H5Event.create(this.toIntRange, this.isInside, this.asBinder);
            this.ICustomTabsService$Stub = getEventSource.create(this.asBinder);
            this.ICustomTabsService$Stub$Proxy = NXUcService.create(this.toIntRange, this.isInside, this.asBinder);
            this.receiveFile = getUCCoreDownloadUrl.create(this.toIntRange, this.isInside, this.asBinder);
            this.IPostMessageService = NXH5PageAdapter.create(this.toIntRange, this.isInside, this.asBinder);
            this.ICustomTabsService$Default = setContainsEmbedView.create(this.toIntRange, this.isInside, this.asBinder);
            this.IPostMessageService$Default = getWebViewIndex.create(this.toIntRange, this.isInside, this.asBinder);
            this.ITrustedWebActivityCallback = getSpecialRestoreView.create(this.toIntRange, this.isInside, this.asBinder);
            length length2 = new length(r6);
            this.IPostMessageService$Stub = length2;
            this.onExtraCallback = setOptionMenu.create(length2);
            this.IPostMessageService$Stub$Proxy = H5ServiceWorkerHook4Bridge.create(this.toIntRange, this.isInside, this.asBinder);
            b.C0007b<BLEServiceUnit> min7 = isScrap.getMin(getWebSocketURLPrefixForDebug.setMin(this.onTransact, this.asInterface, this.ICustomTabsCallback$Default, this.ICustomTabsCallback$Stub, this.getDefaultImpl, this.ICustomTabsService, this.ICustomTabsCallback$Stub$Proxy, this.getInterfaceDescriptor, LocationBridgeExtension.AnonymousClass4.setMax(), this.setDefaultImpl, this.getMin, this.mayLaunchUrl, this.newSessionWithExtras, this.warmup, this.extraCommand, this.newSession, this.updateVisuals, this.requestPostMessageChannelWithExtras, this.validateRelationship, this.postMessage, this.requestPostMessageChannel, this.ICustomTabsService$Stub, this.ICustomTabsService$Stub$Proxy, this.receiveFile, this.IPostMessageService, this.ICustomTabsService$Default, this.IPostMessageService$Default, this.ITrustedWebActivityCallback, this.onExtraCallback, this.IPostMessageService$Stub$Proxy));
            this.ITrustedWebActivityService = min7;
            this.ITrustedWebActivityCallback$Stub = isScrap.getMin(SerialContext.length(globalNetworkModule, min7));
            b.C0007b<OnItemLongClick> min8 = isScrap.getMin(OnPageChange.Callback.setMax());
            this.areNotificationsEnabled = min8;
            this.ITrustedWebActivityCallback$Stub$Proxy = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min8));
            PackageParseUtils$a$Mean$Arithmetic packageParseUtils$a$Mean$Arithmetic = new PackageParseUtils$a$Mean$Arithmetic(r6);
            this.ITrustedWebActivityCallback$Default = packageParseUtils$a$Mean$Arithmetic;
            NullBeaconDataFactory create4 = NullBeaconDataFactory.create(this.toIntRange, this.isInside, packageParseUtils$a$Mean$Arithmetic);
            this.getActiveNotifications = create4;
            b.C0007b<OnFocusChange> min9 = isScrap.getMin(OnEditorAction.getMin(this.ITrustedWebActivityCallback$Stub$Proxy, create4));
            this.getSmallIconId = min9;
            this.notifyNotificationWithChannel = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min9));
            toString tostring = new toString(r6);
            this.getSmallIconBitmap = tostring;
            this.cancelNotification = GriverBizManifest.create(this.toIntRange, this.isInside, tostring);
            this.notify = APWebSettings.PluginState.create(this.getCause);
            this.ITrustedWebActivityService$Default = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
            toIntRange tointrange = new toIntRange(r6);
            this.ITrustedWebActivityService$Stub$Proxy = tointrange;
            this.INotificationSideChannel = onConsoleMessage.create(this.toIntRange, this.isInside, tointrange);
            invoke invoke2 = new invoke(r6);
            this.ITrustedWebActivityService$Stub = invoke2;
            this.cancel = H5ResourceCORSUtil.AnonymousClass1.create(this.toIntRange, this.isInside, invoke2);
            isInside isinside = new isInside(r6);
            this.INotificationSideChannel$Stub$Proxy = isinside;
            this.INotificationSideChannel$Stub = capturePropagationValues.getMin(this.cancel, isinside);
            PackageParseUtils$a$Grayscale$Algorithm packageParseUtils$a$Grayscale$Algorithm = new PackageParseUtils$a$Grayscale$Algorithm(r6);
            this.INotificationSideChannel$Default = packageParseUtils$a$Grayscale$Algorithm;
            this.cancelAll = ScanState.create(this.toIntRange, this.isInside, packageParseUtils$a$Grayscale$Algorithm);
            this.MediaBrowserCompat$CustomActionResultReceiver = getTextWidth.length(AUCornerListView.getMax());
            AUMaxItemCornerListView length3 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.MediaBrowserCompat$CustomActionResultReceiver);
            this.read = length3;
            this.IconCompatParcelizer = Transition.MatchOrder.length(this.cancelAll, length3);
            this.write = setInitialScale.create(this.toIntRange, this.isInside, this.getCause);
            postUrl create5 = postUrl.create(this.toIntRange, this.isInside, this.getCause);
            this.RemoteActionCompatParcelizer = create5;
            this.MediaBrowserCompat$SearchResultReceiver = getName.setMin(this.write, create5, manuallyReleaseCamera.setMax());
            hashCode hashcode = new hashCode(r6);
            this.MediaBrowserCompat$MediaItem = hashcode;
            saveAppInfos create6 = saveAppInfos.create(hashcode);
            this.MediaDescriptionCompat = create6;
            this.MediaBrowserCompat$ItemReceiver = captureHierarchy.length(create6, OpenInBrowserBridgeExtension.setMax());
            this.MediaBrowserCompat$MediaItem$Flags = isScrap.getMin(getPathMotion.setMin());
            b.C0007b<getCancelable> min10 = isScrap.getMin(getCancelOnTouchOutside.create(this.getMin));
            this.MediaMetadataCompat$LongKey = min10;
            b.C0007b<getMode> min11 = isScrap.getMin(onDisappear.length(this.cancelNotification, this.notify, this.ITrustedWebActivityService$Default, this.INotificationSideChannel, this.INotificationSideChannel$Stub, this.IconCompatParcelizer, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem$Flags, min10, this.ICustomTabsCallback));
            this.MediaMetadataCompat = min11;
            this.MediaMetadataCompat$BitmapKey = isScrap.getMin(setDuration.getMax(featureModule2, min11));
            valueOf valueof = new valueOf(r6);
            this.MediaMetadataCompat$TextKey = valueof;
            this.MediaMetadataCompat$RatingKey = didRangeBeaconsInRegion.create(this.toIntRange, this.isInside, valueof);
            OrientationDetector.MySensorEventListener.AnonymousClass1 max2 = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.getMin);
            this.IMediaControllerCallback = max2;
            getSystemInfo max3 = getSystemInfo.setMax(max2);
            this.RatingCompat$StarStyle = max3;
            this.RatingCompat$Style = isScrap.getMin(setPropagation.length(this.MediaMetadataCompat$BitmapKey, this.MediaMetadataCompat$RatingKey, max3, this.onExtraCallback, this.create));
            this.onEvent = getLoadsImagesAutomatically.create(this.toIntRange, this.isInside, this.getCause);
            this.RatingCompat = setWebContentsDebuggingEnabled.create(this.getCause);
            installPathExist create7 = installPathExist.create(this.getCause);
            this.onSessionDestroyed = create7;
            b.C0007b<getTargets> min12 = isScrap.getMin(addViewValues.length(this.MediaMetadataCompat$BitmapKey, this.RatingCompat$Style, this.onEvent, this.RatingCompat, create7));
            this.onQueueChanged = min12;
            this.onPlaybackStateChanged = isScrap.getMin(parseMatchOrder.length(featureModule2, min12));
            this.onQueueTitleChanged = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
            getMax getmax = new getMax(r6);
            this.onMetadataChanged = getmax;
            this.onExtrasChanged = GriverOpenAuthExtension.create(getmax);
            this.onVolumeInfoChanged = BLEManager.AnonymousClass2.create(this.toIntRange, this.isInside, this.extraCallbackWithResult);
            this.onCaptioningEnabledChanged = GriverDialogExtension.create(this.toIntRange, this.isInside, this.onMetadataChanged);
            this.onRepeatModeChanged = checkSuffixSupported.create(this.getCause);
            this.onShuffleModeChangedRemoved = isImage.create(this.getCause);
            getFillColor max4 = getFillColor.setMax(this.onQueueTitleChanged, startListenScreenshot.setMin(), this.onExtrasChanged, this.onVolumeInfoChanged, this.onCaptioningEnabledChanged, this.onRepeatModeChanged, this.onShuffleModeChangedRemoved);
            this.onSessionReady = max4;
            this.onShuffleModeChanged = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max4));
            this.IMediaControllerCallback$Stub = BindFont.length(servicesModule);
            onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
            this.IMediaControllerCallback$Stub$Proxy = onnavigationevent;
            this.IMediaSession = onStartBleScan.create(this.toIntRange, this.isInside, onnavigationevent);
            this.sendMediaButton = onGetBluetoothCharacteristics.create(this.toIntRange, this.isInside, this.IMediaControllerCallback$Stub$Proxy);
            this.sendCommand = matchesBeacon.create(this.MediaMetadataCompat$TextKey, this.asBinder);
            this.isTransportControlEnabled = validateMac.create(this.toIntRange, this.isInside, this.MediaMetadataCompat$TextKey);
            this.registerCallbackListener = IntentHandler.create(this.toIntRange, this.isInside, this.MediaMetadataCompat$TextKey, this.asBinder);
            this.unregisterCallbackListener = toUuid.create(this.getCause);
            this.getVolumeAttributes = didDetermineStateForRegion.create(this.MediaMetadataCompat$TextKey);
            getCause getcause = new getCause(r6);
            this.getPackageName = getcause;
            this.getFlags = BLEManager.AnonymousClass3.create(getcause);
            BLEManager.AnonymousClass4 create8 = BLEManager.AnonymousClass4.create(this.getPackageName);
            this.getTag = create8;
            b.C0007b<BindInt> min13 = isScrap.getMin(OnCheckedChanged.length(this.getMin, this.IMediaControllerCallback$Stub, this.onExtraCallback, this.RatingCompat$StarStyle, this.IMediaSession, this.sendMediaButton, this.sendCommand, this.isTransportControlEnabled, this.MediaMetadataCompat$RatingKey, this.registerCallbackListener, this.unregisterCallbackListener, this.getVolumeAttributes, this.getFlags, create8));
            this.getLaunchPendingIntent = min13;
            b.C0007b<getPath> min14 = isScrap.getMin(Slide.getMin(this.onRelationshipValidationResult, this.notifyNotificationWithChannel, this.onPlaybackStateChanged, this.onShuffleModeChanged, min13));
            this.getMetadata = min14;
            this.getQueue = isScrap.getMin(Fade.setMin(deepLinkModule2, min14));
            setMin setmin = new setMin(r49);
            this.setVolumeTo = setmin;
            this.adjustVolume = APWebMessagePort.APWebMessageCallback.create(this.toIntRange, this.isInside, setmin);
            this.getPlaybackState = onLocationChanged.setMin(startListenScreenshot.setMin());
            GVLoadingView create9 = GVLoadingView.create(this.toIntRange, this.isInside, this.onMetadataChanged);
            this.getRepeatMode = create9;
            b.C0007b<setStartDelay> min15 = isScrap.getMin(setInterpolator.setMin(this.getQueue, this.adjustVolume, this.getPlaybackState, create9));
            this.isCaptioningEnabled = min15;
            this.getExtras = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min15));
            this.getRatingType = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
            this.getQueueTitle = onDeviceFound.create(this.toIntRange, this.isInside, this.IMediaControllerCallback$Stub$Proxy);
            onDisconnectBLE create10 = onDisconnectBLE.create(this.toIntRange, this.isInside, this.IMediaControllerCallback$Stub$Proxy);
            this.getShuffleMode = create10;
            onSelected min16 = onSelected.setMin(this.getRatingType, this.getQueueTitle, create10);
            this.isShuffleModeEnabledRemoved = min16;
            this.removeQueueItem = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min16));
        }

        public static final class setMax {
            public PlayStoreReviewModules IsOverlapping;
            public CheckoutH5EventModule equals;
            public DecodeQrImageModule getMax;
            public RestoreUrlModule getMin;
            public BottomSheetOnBoardingModule isInside;
            public FeatureModule length;
            public DeepLinkModule setMax;
            public ScanQrModule setMin;
            public GlobalNetworkModule toDoubleRange;
            public ServicesModule toFloatRange;
            public OauthModule toIntRange;
            public PrepareException.AnonymousClass1 values;

            public /* synthetic */ setMax(byte b) {
                this();
            }

            private setMax() {
            }
        }

        static class getMin implements b.C0007b<Context> {
            private final PrepareException.AnonymousClass1 setMin;

            getMin(PrepareException.AnonymousClass1 r1) {
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

        static class invokeSuspend implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 length;

            invokeSuspend(PrepareException.AnonymousClass1 r1) {
                this.length = r1;
            }

            public final /* synthetic */ Object get() {
                appxLoadFailed length2 = this.length.length();
                if (length2 != null) {
                    return length2;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        static class toDoubleRange implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 getMax;

            toDoubleRange(PrepareException.AnonymousClass1 r1) {
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

        static class values implements b.C0007b<GriverPrepareInterceptor> {
            private final PrepareException.AnonymousClass1 getMax;

            values(PrepareException.AnonymousClass1 r1) {
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

        static class equals implements b.C0007b<getPerformanceTracker> {
            private final PrepareException.AnonymousClass1 setMax;

            equals(PrepareException.AnonymousClass1 r1) {
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

        static class IsOverlapping implements b.C0007b<onWebViewDestory> {
            private final PrepareException.AnonymousClass1 length;

            IsOverlapping(PrepareException.AnonymousClass1 r1) {
                this.length = r1;
            }

            public final /* synthetic */ Object get() {
                onWebViewDestory MediaMetadataCompat$LongKey = this.length.MediaMetadataCompat$LongKey();
                if (MediaMetadataCompat$LongKey != null) {
                    return MediaMetadataCompat$LongKey;
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

        static class toString implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
            private final PrepareException.AnonymousClass1 getMin;

            toString(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.getMin.ICustomTabsService();
                if (ICustomTabsService != null) {
                    return ICustomTabsService;
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

        static class isInside implements b.C0007b<getAppPerfKey> {
            private final PrepareException.AnonymousClass1 getMin;

            isInside(PrepareException.AnonymousClass1 r1) {
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

        static class hashCode implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
            private final PrepareException.AnonymousClass1 length;

            hashCode(PrepareException.AnonymousClass1 r1) {
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

        static class valueOf implements b.C0007b<toUuidString> {
            private final PrepareException.AnonymousClass1 setMax;

            valueOf(PrepareException.AnonymousClass1 r1) {
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

        static class getMax implements b.C0007b<getCommonResources> {
            private final PrepareException.AnonymousClass1 setMax;

            getMax(PrepareException.AnonymousClass1 r1) {
                this.setMax = r1;
            }

            public final /* synthetic */ Object get() {
                getCommonResources Grayscale$Algorithm = this.setMax.Grayscale$Algorithm();
                if (Grayscale$Algorithm != null) {
                    return Grayscale$Algorithm;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        static class onNavigationEvent implements b.C0007b<onDisconnect> {
            private final PrepareException.AnonymousClass1 setMax;

            onNavigationEvent(PrepareException.AnonymousClass1 r1) {
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

        static class getCause implements b.C0007b<onCharacteristicChanged> {
            private final PrepareException.AnonymousClass1 getMin;

            getCause(PrepareException.AnonymousClass1 r1) {
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

        public final void getMax(ScannerFragment scannerFragment) {
            DecodeOptions.getMax(scannerFragment, this.equals.get());
            CheckoutH5EventModule checkoutH5EventModule = this.setMax;
            appxLoadFailed length2 = this.setMin.length();
            if (length2 != null) {
                appxLoadFailed appxloadfailed = length2;
                getScheme min = this.setMin.getMin();
                if (min != null) {
                    getScheme getscheme = min;
                    GriverHttpRequestAPIExtension IPostMessageService$Default2 = this.setMin.IPostMessageService$Default();
                    if (IPostMessageService$Default2 != null) {
                        DecodeOptions.getMax(scannerFragment, getValueFilters.getMin(checkoutH5EventModule, new GriverManifest.AnonymousClass22.getMin(new onCommonConfigChanged(appxloadfailed, getscheme, IPostMessageService$Default2), println.setMin(this.setMax)) {
                            public final AnonymousClass22.length length;
                            private GriverAppVirtualHostProxy<Boolean> setMax;
                            private final onCommonConfigChanged setMin;

                            public final void length(
/*
Method generation error in method: o.GriverManifest.2.length():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverManifest.2.length():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            public final void getMin(
/*
Method generation error in method: o.GriverManifest.2.getMin():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverManifest.2.getMin():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/

                            public final void setMax(
/*
Method generation error in method: o.GriverManifest.2.setMax():void, dex: classes3.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverManifest.2.setMax():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        }));
                        DecodeOptions.getMin(scannerFragment, this.hashCode.get());
                        DecodeOptions.length(scannerFragment, this.onRelationshipValidationResult.get());
                        DecodeOptions.getMax(scannerFragment, this.ITrustedWebActivityCallback$Stub.get());
                        DecodeOptions.setMax(scannerFragment, this.getExtras.get());
                        DecodeOptions.setMin(scannerFragment, this.notifyNotificationWithChannel.get());
                        DecodeOptions.length(scannerFragment, this.onPlaybackStateChanged.get());
                        DecodeOptions.setMax(scannerFragment, this.onRelationshipValidationResult.get());
                        DecodeOptions.getMin(scannerFragment, new setH5Page());
                        DecodeOptions.setMin(scannerFragment, this.removeQueueItem.get());
                        return;
                    }
                    throw new NullPointerException("Cannot return null from a non-@Nullable component method");
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(RequestMoneyActivity requestMoneyActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(requestMoneyActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length2 = this.setMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(requestMoneyActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                            UserBankModule userBankModule = this.getMin;
                            publishImageAction.length min2 = GriverAuthGuideContentExtension.AuthGuideContent.setMin(this.getMin);
                            setDefaultFontSize updateVisuals2 = this.setMax.updateVisuals();
                            if (updateVisuals2 != null) {
                                getCertificate getcertificate = new getCertificate(updateVisuals2);
                                PageFinishedPoint IMediaSession = this.setMax.IMediaSession();
                                if (IMediaSession != null) {
                                    PageErrorPoint pageErrorPoint = new PageErrorPoint(IMediaSession);
                                    PageFinishedPoint IMediaSession2 = this.setMax.IMediaSession();
                                    if (IMediaSession2 != null) {
                                        GriverWebViewReceivedErrorExtension griverWebViewReceivedErrorExtension = new GriverWebViewReceivedErrorExtension(IMediaSession2);
                                        PageFinishedPoint IMediaSession3 = this.setMax.IMediaSession();
                                        if (IMediaSession3 != null) {
                                            titleBarCreated titlebarcreated = new titleBarCreated(IMediaSession3);
                                            PageFinishedPoint IMediaSession4 = this.setMax.IMediaSession();
                                            if (IMediaSession4 != null) {
                                                GriverImageService.length(requestMoneyActivity, GriverH5LoadProgressPoint.getMin(userBankModule, new onFling(min2, getcertificate, pageErrorPoint, griverWebViewReceivedErrorExtension, titlebarcreated, new pageAbnoraml(IMediaSession4))));
                                                GriverImageService.getMax(requestMoneyActivity, this.toFloatRange.get());
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
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
