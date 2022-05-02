package o;

import android.app.Activity;
import android.content.Context;
import id.dana.bottomsheet.ServicesBottomSheetDialog;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindFont;
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
import o.style;

public final class downloadApp implements isRenderMessageQueue {
    private b.C0007b<onWebViewDestory> FastBitmap$CoordinateSystem;
    private b.C0007b<getUniqueId> Grayscale$Algorithm;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> ICustomTabsCallback;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> ICustomTabsCallback$Default;
    private b.C0007b<getPerformanceTracker> ICustomTabsCallback$Stub;
    private b.C0007b<onDescriptorWrite> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<requestAppWithAppId> ICustomTabsService;
    private b.C0007b<addChooseImageCrossOrigin> ICustomTabsService$Default;
    private b.C0007b<onJsBeforeUnload> ICustomTabsService$Stub;
    private b.C0007b<H5Utils> ICustomTabsService$Stub$Proxy;
    private b.C0007b<getAllInstallFiles> INotificationSideChannel;
    private b.C0007b<onAnimationEnd.getMin> INotificationSideChannel$Default;
    private b.C0007b<getCommonResources> INotificationSideChannel$Stub;
    private b.C0007b<shouldShowRevokeOpenAuthItem> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<getAppPerfKey> IPostMessageService;
    private b.C0007b<setInitTextColor> IPostMessageService$Default;
    private b.C0007b<updateFootState> IPostMessageService$Stub;
    private b.C0007b<getEpicenter> IPostMessageService$Stub$Proxy;
    private b.C0007b<applySettingsToScheduledJob> ITrustedWebActivityCallback;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> ITrustedWebActivityCallback$Default;
    private b.C0007b<setNetworkAvailable> ITrustedWebActivityCallback$Stub;
    private b.C0007b<canGoBackOrForward> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<setSceneRoot> ITrustedWebActivityService;
    private b.C0007b<setEpicenterCallback> ITrustedWebActivityService$Default;
    private b.C0007b<APWebSettings.LayoutAlgorithm> ITrustedWebActivityService$Stub;
    private b.C0007b<getRunningAnimators.getMin> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<KitUtils> IconCompatParcelizer;
    private b.C0007b<getScheme> IsOverlapping;
    private b.C0007b<convertIntentsToCallbacks> Mean$Arithmetic;
    private b.C0007b<getPlatformCallback> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$MediaItem;
    private b.C0007b<onAnimationEnd.length> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<onMessage> MediaDescriptionCompat;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat;
    private b.C0007b<setStartDelay> MediaMetadataCompat$BitmapKey;
    private b.C0007b<getDuration.length> MediaMetadataCompat$LongKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$TextKey;
    private b.C0007b<notifyCharacteristicValue> RemoteActionCompatParcelizer;
    private b.C0007b<getPropagation> areNotificationsEnabled;
    private b.C0007b<ResourceProviderExtension> asBinder;
    private b.C0007b<getTinyLocalStorageInfo> asInterface;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> b;
    private b.C0007b<getTargets> cancel;
    private b.C0007b<getRunningAnimators.setMax> cancelAll;
    private b.C0007b<queryAppInfo> cancelNotification;
    private b.C0007b<didExitRegion> create;
    private b.C0007b<parseBatteryPercentage> equals;
    private b.C0007b<GriverPrepareInterceptor> extraCallback;
    private b.C0007b<Activity> extraCallbackWithResult;
    private b.C0007b<AndroidModel> extraCommand;
    private b.C0007b<getMode> getActiveNotifications;
    private b.C0007b<onCharacteristicChanged> getCause;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> getDefaultImpl;
    private b.C0007b<R.styleable> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<style.getMin> getMin;
    private b.C0007b<getCancelable> getSmallIconBitmap;
    private b.C0007b<isTransitionRequired> getSmallIconId;
    private b.C0007b<onCharacteristicWriteCompleted> hashCode;
    private b.C0007b<hasSameIdentifiers> invoke;
    private b.C0007b<setDefaultFontSize> invokeSuspend;
    private b.C0007b<OrientationDetector.OrientationListener> isInside;
    private b.C0007b<enableBackButton> length;
    private b.C0007b<OnItemLongClick> mayLaunchUrl;
    private b.C0007b<OnFocusChange> newSession;
    private b.C0007b<BindView.setMax> newSessionWithExtras;
    private b.C0007b<getBlockNetworkImage> notify;
    private b.C0007b<getTransitionValues> notifyNotificationWithChannel;
    private b.C0007b<getScanJobRuntimeMillis> onExtraCallback;
    private b.C0007b<BindInt> onMessageChannelReady;
    private b.C0007b<toByteArray> onNavigationEvent;
    private b.C0007b<method> onPostMessage;
    private b.C0007b<R.id.length> onRelationshipValidationResult;
    private b.C0007b<setDataRequestNotifier> onTransact;
    private b.C0007b<setPageCacheCapacity> postMessage;
    private b.C0007b<checkBitmap> read;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> receiveFile;
    private b.C0007b<MovableFrameLayout> requestPostMessageChannel;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> requestPostMessageChannelWithExtras;
    private b.C0007b<R.id.getMax> setDefaultImpl;
    private final ServicesModule setMax;
    private b.C0007b<Context> setMin;
    private b.C0007b<toUuidString> toDoubleRange;
    private b.C0007b<appxLoadFailed> toFloatRange;
    private b.C0007b<GetAuthCode> toIntRange;
    private b.C0007b<onConnect> toString;
    private b.C0007b<setBackButton> updateVisuals;
    private b.C0007b<BindView.setMin> validateRelationship;
    private b.C0007b<Region$1> valueOf;
    private b.C0007b<onDisconnect> values;
    private b.C0007b<DataProviderException> warmup;
    private b.C0007b<GriverCreatePromptParam> write;

    public /* synthetic */ downloadApp(ServicesModule servicesModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, PrepareException.AnonymousClass1 r7, byte b2) {
        this(servicesModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, r7);
    }

    private downloadApp(ServicesModule servicesModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.setMax = servicesModule;
        this.getMax = r6;
        this.setMin = new setMin(r6);
        this.getMin = BindFont.length(servicesModule);
        length length2 = new length(r6);
        this.length = length2;
        this.toIntRange = setOptionMenu.create(length2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.setMin);
        this.isInside = max;
        this.equals = getSystemInfo.setMax(max);
        this.toFloatRange = new valueOf(r6);
        this.IsOverlapping = new hashCode(r6);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.values = iCustomTabsCallback;
        this.hashCode = onStartBleScan.create(this.toFloatRange, this.IsOverlapping, iCustomTabsCallback);
        this.toString = onGetBluetoothCharacteristics.create(this.toFloatRange, this.IsOverlapping, this.values);
        this.toDoubleRange = new values(r6);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.FastBitmap$CoordinateSystem = tofloatrange;
        this.invoke = matchesBeacon.create(this.toDoubleRange, tofloatrange);
        this.valueOf = validateMac.create(this.toFloatRange, this.IsOverlapping, this.toDoubleRange);
        this.Grayscale$Algorithm = didRangeBeaconsInRegion.create(this.toFloatRange, this.IsOverlapping, this.toDoubleRange);
        this.Mean$Arithmetic = IntentHandler.create(this.toFloatRange, this.IsOverlapping, this.toDoubleRange, this.FastBitmap$CoordinateSystem);
        toIntRange tointrange = new toIntRange(r6);
        this.invokeSuspend = tointrange;
        this.onNavigationEvent = toUuid.create(tointrange);
        this.create = didDetermineStateForRegion.create(this.toDoubleRange);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.getCause = invokesuspend;
        this.ICustomTabsCallback = BLEManager.AnonymousClass3.create(invokesuspend);
        BLEManager.AnonymousClass4 create2 = BLEManager.AnonymousClass4.create(this.getCause);
        this.b = create2;
        this.onMessageChannelReady = isScrap.getMin(OnCheckedChanged.length(this.setMin, this.getMin, this.toIntRange, this.equals, this.hashCode, this.toString, this.invoke, this.valueOf, this.Grayscale$Algorithm, this.Mean$Arithmetic, this.onNavigationEvent, this.create, this.ICustomTabsCallback, create2));
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.extraCallbackWithResult = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.onPostMessage = min2;
        this.onRelationshipValidationResult = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        PrepareException.AnonymousClass1 r3 = r29;
        toDoubleRange todoublerange = new toDoubleRange(r3);
        this.extraCallback = todoublerange;
        this.asBinder = GriverPrepareInterceptor.AnonymousClass2.create(this.toFloatRange, this.IsOverlapping, todoublerange);
        this.ICustomTabsCallback$Default = beforeQuery.create(this.toFloatRange, this.IsOverlapping, this.extraCallback);
        this.asInterface = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.ICustomTabsCallback$Stub = new isInside(r3);
        this.onTransact = getDataRequestNotifier.create(this.invokeSuspend);
        b bVar = new b(r3);
        this.ICustomTabsCallback$Stub$Proxy = bVar;
        this.getDefaultImpl = onCharacteristicWrite.create(bVar, this.toFloatRange, this.IsOverlapping);
        localIdToBytes create3 = localIdToBytes.create(this.extraCallback);
        this.ICustomTabsService = create3;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.setMin, this.onRelationshipValidationResult, this.asBinder, this.ICustomTabsCallback$Default, this.asInterface, this.ICustomTabsCallback$Stub, this.onTransact, this.getDefaultImpl, create3));
        this.getInterfaceDescriptor = min3;
        this.setDefaultImpl = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.mayLaunchUrl = min4;
        RestoreUrlModule restoreUrlModule3 = restoreUrlModule;
        this.newSessionWithExtras = isScrap.getMin(ButterKnife.getMin(restoreUrlModule3, min4));
        downloadApp$Grayscale$Algorithm downloadapp_grayscale_algorithm = new downloadApp$Grayscale$Algorithm(r3);
        this.extraCommand = downloadapp_grayscale_algorithm;
        NullBeaconDataFactory create4 = NullBeaconDataFactory.create(this.toFloatRange, this.IsOverlapping, downloadapp_grayscale_algorithm);
        this.warmup = create4;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.newSessionWithExtras, create4));
        this.newSession = min5;
        this.validateRelationship = isScrap.getMin(BindViews.getMax(restoreUrlModule3, min5));
        downloadApp$FastBitmap$CoordinateSystem downloadapp_fastbitmap_coordinatesystem = new downloadApp$FastBitmap$CoordinateSystem(r3);
        this.requestPostMessageChannelWithExtras = downloadapp_fastbitmap_coordinatesystem;
        this.requestPostMessageChannel = GriverBizManifest.create(this.toFloatRange, this.IsOverlapping, downloadapp_fastbitmap_coordinatesystem);
        this.postMessage = APWebSettings.PluginState.create(this.invokeSuspend);
        this.updateVisuals = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        equals equals2 = new equals(r3);
        this.receiveFile = equals2;
        this.ICustomTabsService$Stub = onConsoleMessage.create(this.toFloatRange, this.IsOverlapping, equals2);
        downloadApp$Mean$Arithmetic downloadapp_mean_arithmetic = new downloadApp$Mean$Arithmetic(r3);
        this.ICustomTabsService$Stub$Proxy = downloadapp_mean_arithmetic;
        this.ICustomTabsService$Default = H5ResourceCORSUtil.AnonymousClass1.create(this.toFloatRange, this.IsOverlapping, downloadapp_mean_arithmetic);
        IsOverlapping isOverlapping = new IsOverlapping(r3);
        this.IPostMessageService = isOverlapping;
        this.IPostMessageService$Stub$Proxy = capturePropagationValues.getMin(this.ICustomTabsService$Default, isOverlapping);
        invoke invoke2 = new invoke(r3);
        this.onExtraCallback = invoke2;
        this.ITrustedWebActivityCallback = ScanState.create(this.toFloatRange, this.IsOverlapping, invoke2);
        this.IPostMessageService$Default = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length3 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.IPostMessageService$Default);
        this.IPostMessageService$Stub = length3;
        this.ITrustedWebActivityService = Transition.MatchOrder.length(this.ITrustedWebActivityCallback, length3);
        this.ITrustedWebActivityCallback$Stub$Proxy = setInitialScale.create(this.toFloatRange, this.IsOverlapping, this.invokeSuspend);
        postUrl create5 = postUrl.create(this.toFloatRange, this.IsOverlapping, this.invokeSuspend);
        this.ITrustedWebActivityCallback$Stub = create5;
        this.areNotificationsEnabled = getName.setMin(this.ITrustedWebActivityCallback$Stub$Proxy, create5, manuallyReleaseCamera.setMax());
        toString tostring = new toString(r3);
        this.ITrustedWebActivityCallback$Default = tostring;
        saveAppInfos create6 = saveAppInfos.create(tostring);
        this.cancelNotification = create6;
        this.notifyNotificationWithChannel = captureHierarchy.length(create6, OpenInBrowserBridgeExtension.setMax());
        this.getSmallIconId = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.setMin));
        this.getSmallIconBitmap = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.requestPostMessageChannel, this.postMessage, this.updateVisuals, this.ICustomTabsService$Stub, this.IPostMessageService$Stub$Proxy, this.ITrustedWebActivityService, this.areNotificationsEnabled, this.notifyNotificationWithChannel, this.getSmallIconId, min6, this.onTransact));
        this.getActiveNotifications = min7;
        FeatureModule featureModule3 = featureModule;
        b.C0007b<getRunningAnimators.getMin> min8 = isScrap.getMin(setDuration.getMax(featureModule3, min7));
        this.ITrustedWebActivityService$Stub$Proxy = min8;
        this.ITrustedWebActivityService$Default = isScrap.getMin(setPropagation.length(min8, this.Grayscale$Algorithm, this.equals, this.toIntRange, this.ICustomTabsCallback$Stub));
        this.notify = getLoadsImagesAutomatically.create(this.toFloatRange, this.IsOverlapping, this.invokeSuspend);
        this.ITrustedWebActivityService$Stub = setWebContentsDebuggingEnabled.create(this.invokeSuspend);
        installPathExist create7 = installPathExist.create(this.invokeSuspend);
        this.INotificationSideChannel = create7;
        b.C0007b<getTargets> min9 = isScrap.getMin(addViewValues.length(this.ITrustedWebActivityService$Stub$Proxy, this.ITrustedWebActivityService$Default, this.notify, this.ITrustedWebActivityService$Stub, create7));
        this.cancel = min9;
        this.cancelAll = isScrap.getMin(parseMatchOrder.length(featureModule3, min9));
        OauthModule oauthModule3 = oauthModule;
        this.INotificationSideChannel$Default = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule3, setTrimPathStart.length()));
        getMax getmax = new getMax(r3);
        this.INotificationSideChannel$Stub = getmax;
        this.INotificationSideChannel$Stub$Proxy = GriverOpenAuthExtension.create(getmax);
        this.RemoteActionCompatParcelizer = BLEManager.AnonymousClass2.create(this.toFloatRange, this.IsOverlapping, this.ICustomTabsCallback$Stub$Proxy);
        this.write = GriverDialogExtension.create(this.toFloatRange, this.IsOverlapping, this.INotificationSideChannel$Stub);
        this.IconCompatParcelizer = checkSuffixSupported.create(this.invokeSuspend);
        this.read = isImage.create(this.invokeSuspend);
        getFillColor max2 = getFillColor.setMax(this.INotificationSideChannel$Default, startListenScreenshot.setMin(), this.INotificationSideChannel$Stub$Proxy, this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer, this.read);
        this.MediaBrowserCompat$CustomActionResultReceiver = max2;
        b.C0007b<onAnimationEnd.length> min10 = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule3, max2));
        this.MediaBrowserCompat$MediaItem$Flags = min10;
        b.C0007b<getPath> min11 = isScrap.getMin(Slide.getMin(this.setDefaultImpl, this.validateRelationship, this.cancelAll, min10, this.onMessageChannelReady));
        this.MediaBrowserCompat$MediaItem = min11;
        DeepLinkModule deepLinkModule3 = deepLinkModule;
        this.MediaBrowserCompat$ItemReceiver = isScrap.getMin(Fade.setMin(deepLinkModule3, min11));
        setMax setmax = new setMax(r3);
        this.MediaBrowserCompat$SearchResultReceiver = setmax;
        this.MediaDescriptionCompat = APWebMessagePort.APWebMessageCallback.create(this.toFloatRange, this.IsOverlapping, setmax);
        this.MediaMetadataCompat = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create8 = GVLoadingView.create(this.toFloatRange, this.IsOverlapping, this.INotificationSideChannel$Stub);
        this.MediaMetadataCompat$TextKey = create8;
        b.C0007b<setStartDelay> min12 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat, this.MediaMetadataCompat, create8));
        this.MediaMetadataCompat$BitmapKey = min12;
        this.MediaMetadataCompat$LongKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule3, min12));
    }

    public static final class getMin {
        public ServicesModule getMax;
        public DeepLinkModule getMin;
        public FeatureModule length;
        public ScanQrModule setMax;
        public RestoreUrlModule setMin;
        public PrepareException.AnonymousClass1 toFloatRange;
        public OauthModule toIntRange;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class setMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 setMin;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 length;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMax;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class toFloatRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class invokeSuspend implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 getMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 length;

        equals(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 setMin;

        invoke(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 getMax;

        toString(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.getMax.requestPostMessageChannel();
            if (requestPostMessageChannel != null) {
                return requestPostMessageChannel;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMin;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 getMin;

        setMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            setSupportZoom ICustomTabsService$Stub = this.getMin.ICustomTabsService$Stub();
            if (ICustomTabsService$Stub != null) {
                return ICustomTabsService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(ServicesBottomSheetDialog servicesBottomSheetDialog) {
        createInvalidationTracker.getMax(servicesBottomSheetDialog, BindFont.TypefaceStyle.getMax(this.setMax, this.onMessageChannelReady.get()));
        getPerformanceTracker onTransact2 = this.getMax.onTransact();
        if (onTransact2 != null) {
            createInvalidationTracker.setMin(servicesBottomSheetDialog, onTransact2);
            createInvalidationTracker.setMax(servicesBottomSheetDialog, this.MediaMetadataCompat$LongKey.get());
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
