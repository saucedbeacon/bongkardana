package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.AnnouncementModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.richview.NewBannerView;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
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
import o.onLeftHiddenState;
import o.style;

public final class hitPresetResource implements DefaultWebSocketProxyImpl {
    private b.C0007b<addChooseImageCrossOrigin> FastBitmap$CoordinateSystem;
    private b.C0007b<applySettingsToScheduledJob> Grayscale$Algorithm;
    private b.C0007b<canGoBackOrForward> ICustomTabsCallback;
    private b.C0007b<getUniqueId> ICustomTabsCallback$Default;
    private b.C0007b<getRunningAnimators.getMin> ICustomTabsCallback$Stub;
    private b.C0007b<setEpicenterCallback> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<enableBackButton> ICustomTabsService;
    private b.C0007b<requestAppWithAppId> ICustomTabsService$Default;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> ICustomTabsService$Stub;
    private b.C0007b<getTinyLocalStorageInfo> ICustomTabsService$Stub$Proxy;
    private b.C0007b<onCharacteristicWriteCompleted> INotificationSideChannel;
    private b.C0007b<onWebViewDestory> INotificationSideChannel$Default;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Stub;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> IPostMessageService;
    private b.C0007b<AndroidModel> IPostMessageService$Default;
    private b.C0007b<R.id.getMax> IPostMessageService$Stub;
    private b.C0007b<R.styleable> IPostMessageService$Stub$Proxy;
    private b.C0007b<BindView.setMax> ITrustedWebActivityCallback;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Default;
    private b.C0007b<BindView.setMin> ITrustedWebActivityCallback$Stub;
    private b.C0007b<DataProviderException> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getCommonResources> ITrustedWebActivityService;
    private b.C0007b<getPlatformCallback> ITrustedWebActivityService$Default;
    private b.C0007b<style.getMin> ITrustedWebActivityService$Stub;
    private b.C0007b<onAnimationEnd.length> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> IconCompatParcelizer;
    private b.C0007b<setPageCacheCapacity> IsOverlapping;
    private b.C0007b<updateFootState> Mean$Arithmetic;
    private b.C0007b<didExitRegion> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<BindInt> MediaBrowserCompat$MediaItem;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<onMessage> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<AutoTransition.setMax> MediaDescriptionCompat;
    private b.C0007b<getDuration.length> MediaMetadataCompat$BitmapKey;
    private b.C0007b<setStartDelay> MediaMetadataCompat$LongKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$RatingKey;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$TextKey;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> RemoteActionCompatParcelizer;
    private b.C0007b<OnFocusChange> areNotificationsEnabled;
    private b.C0007b<toUuidString> asBinder;
    private b.C0007b<OrientationDetector.OrientationListener> asInterface;
    private b.C0007b<getPropagation> b;
    private b.C0007b<onConnect> cancel;
    private b.C0007b<Region$1> cancelAll;
    private b.C0007b<KitUtils> cancelNotification;
    private b.C0007b<setNetworkAvailable> create;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> equals;
    private b.C0007b<isTransitionRequired> extraCallback;
    private b.C0007b<Context> extraCallbackWithResult;
    private b.C0007b<getAllInstallFiles> extraCommand;
    private b.C0007b<GriverCreatePromptParam> getActiveNotifications;
    private b.C0007b<queryAppInfo> getCause;
    private b.C0007b<getPerformanceTracker> getDefaultImpl;
    private b.C0007b<parseBatteryPercentage> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private final AnnouncementModule getMin;
    private b.C0007b<checkBitmap> getSmallIconBitmap;
    private b.C0007b<shouldShowRevokeOpenAuthItem> getSmallIconId;
    private b.C0007b<getAppPerfKey> hashCode;
    private b.C0007b<getScanJobRuntimeMillis> invoke;
    private b.C0007b<setSceneRoot> invokeSuspend;
    private b.C0007b<setBackButton> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<getRunningAnimators.setMax> mayLaunchUrl;
    private b.C0007b<getTargets> newSession;
    private b.C0007b<getBlockNetworkImage> newSessionWithExtras;
    private b.C0007b<onDisconnect> notify;
    private b.C0007b<notifyCharacteristicValue> notifyNotificationWithChannel;
    private b.C0007b<OnItemLongClick> onExtraCallback;
    private b.C0007b<setDataRequestNotifier> onMessageChannelReady;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> onNavigationEvent;
    private b.C0007b<getTransitionValues> onPostMessage;
    private b.C0007b<getCancelable> onRelationshipValidationResult;
    private b.C0007b<getMode> onTransact;
    private b.C0007b<Activity> postMessage;
    private b.C0007b<toByteArray> read;
    private b.C0007b<onDescriptorWrite> receiveFile;
    private b.C0007b<ResourceProviderExtension> requestPostMessageChannel;
    private b.C0007b<GriverPrepareInterceptor> requestPostMessageChannelWithExtras;
    private b.C0007b<GetAuthCode> setDefaultImpl;
    private b.C0007b<getScheme> setMax;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> setMin;
    private b.C0007b<H5Utils> toDoubleRange;
    private b.C0007b<setDefaultFontSize> toFloatRange;
    private b.C0007b<MovableFrameLayout> toIntRange;
    private b.C0007b<onJsBeforeUnload> toString;
    private b.C0007b<R.id.length> updateVisuals;
    private b.C0007b<method> validateRelationship;
    private b.C0007b<setInitTextColor> valueOf;
    private b.C0007b<getEpicenter> values;
    private b.C0007b<APWebSettings.LayoutAlgorithm> warmup;
    private b.C0007b<onCharacteristicChanged> write;

    public /* synthetic */ hitPresetResource(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, AnnouncementModule announcementModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, announcementModule, r8);
    }

    private hitPresetResource(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, AnnouncementModule announcementModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.getMin = announcementModule;
        this.getMax = r6;
        this.length = new invoke(r6);
        this.setMax = new hashCode(r6);
        toString tostring = new toString(r6);
        this.setMin = tostring;
        this.toIntRange = GriverBizManifest.create(this.length, this.setMax, tostring);
        isInside isinside = new isInside(r6);
        this.toFloatRange = isinside;
        this.IsOverlapping = APWebSettings.PluginState.create(isinside);
        this.isInside = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        toIntRange tointrange = new toIntRange(r6);
        this.equals = tointrange;
        this.toString = onConsoleMessage.create(this.length, this.setMax, tointrange);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.toDoubleRange = invokesuspend;
        this.FastBitmap$CoordinateSystem = H5ResourceCORSUtil.AnonymousClass1.create(this.length, this.setMax, invokesuspend);
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.hashCode = isOverlapping;
        this.values = capturePropagationValues.getMin(this.FastBitmap$CoordinateSystem, isOverlapping);
        hitPresetResource$Mean$Arithmetic hitpresetresource_mean_arithmetic = new hitPresetResource$Mean$Arithmetic(r6);
        this.invoke = hitpresetresource_mean_arithmetic;
        this.Grayscale$Algorithm = ScanState.create(this.length, this.setMax, hitpresetresource_mean_arithmetic);
        this.valueOf = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.valueOf);
        this.Mean$Arithmetic = length2;
        this.invokeSuspend = Transition.MatchOrder.length(this.Grayscale$Algorithm, length2);
        this.ICustomTabsCallback = setInitialScale.create(this.length, this.setMax, this.toFloatRange);
        postUrl create2 = postUrl.create(this.length, this.setMax, this.toFloatRange);
        this.create = create2;
        this.b = getName.setMin(this.ICustomTabsCallback, create2, manuallyReleaseCamera.setMax());
        values values2 = new values(r6);
        this.onNavigationEvent = values2;
        saveAppInfos create3 = saveAppInfos.create(values2);
        this.getCause = create3;
        this.onPostMessage = captureHierarchy.length(create3, OpenInBrowserBridgeExtension.setMax());
        this.extraCallback = isScrap.getMin(getPathMotion.setMin());
        length length3 = new length(r6);
        this.extraCallbackWithResult = length3;
        this.onRelationshipValidationResult = isScrap.getMin(getCancelOnTouchOutside.create(length3));
        getDataRequestNotifier create4 = getDataRequestNotifier.create(this.toFloatRange);
        this.onMessageChannelReady = create4;
        b.C0007b<getMode> min = isScrap.getMin(onDisappear.length(this.toIntRange, this.IsOverlapping, this.isInside, this.toString, this.values, this.invokeSuspend, this.b, this.onPostMessage, this.extraCallback, this.onRelationshipValidationResult, create4));
        this.onTransact = min;
        this.ICustomTabsCallback$Stub = isScrap.getMin(setDuration.getMax(featureModule2, min));
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.asBinder = todoublerange;
        this.ICustomTabsCallback$Default = didRangeBeaconsInRegion.create(this.length, this.setMax, todoublerange);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.extraCallbackWithResult);
        this.asInterface = max;
        this.getInterfaceDescriptor = getSystemInfo.setMax(max);
        getMin getmin = new getMin(r6);
        this.ICustomTabsService = getmin;
        this.setDefaultImpl = setOptionMenu.create(getmin);
        equals equals2 = new equals(r6);
        this.getDefaultImpl = equals2;
        this.ICustomTabsCallback$Stub$Proxy = isScrap.getMin(setPropagation.length(this.ICustomTabsCallback$Stub, this.ICustomTabsCallback$Default, this.getInterfaceDescriptor, this.setDefaultImpl, equals2));
        this.newSessionWithExtras = getLoadsImagesAutomatically.create(this.length, this.setMax, this.toFloatRange);
        this.warmup = setWebContentsDebuggingEnabled.create(this.toFloatRange);
        installPathExist create5 = installPathExist.create(this.toFloatRange);
        this.extraCommand = create5;
        b.C0007b<getTargets> min2 = isScrap.getMin(addViewValues.length(this.ICustomTabsCallback$Stub, this.ICustomTabsCallback$Stub$Proxy, this.newSessionWithExtras, this.warmup, create5));
        this.newSession = min2;
        this.mayLaunchUrl = isScrap.getMin(parseMatchOrder.length(featureModule2, min2));
        b.C0007b<Activity> min3 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.postMessage = min3;
        b.C0007b<method> min4 = isScrap.getMin(type.getMax(min3));
        this.validateRelationship = min4;
        this.updateVisuals = isScrap.getMin(R.integer.setMin(scanQrModule2, min4));
        hitPresetResource$FastBitmap$CoordinateSystem hitpresetresource_fastbitmap_coordinatesystem = new hitPresetResource$FastBitmap$CoordinateSystem(r6);
        this.requestPostMessageChannelWithExtras = hitpresetresource_fastbitmap_coordinatesystem;
        this.requestPostMessageChannel = GriverPrepareInterceptor.AnonymousClass2.create(this.length, this.setMax, hitpresetresource_fastbitmap_coordinatesystem);
        this.IPostMessageService = beforeQuery.create(this.length, this.setMax, this.requestPostMessageChannelWithExtras);
        this.ICustomTabsService$Stub$Proxy = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        b bVar = new b(r6);
        this.receiveFile = bVar;
        this.ICustomTabsService$Stub = onCharacteristicWrite.create(bVar, this.length, this.setMax);
        localIdToBytes create6 = localIdToBytes.create(this.requestPostMessageChannelWithExtras);
        this.ICustomTabsService$Default = create6;
        b.C0007b<R.styleable> min5 = isScrap.getMin(Setter.length(this.extraCallbackWithResult, this.updateVisuals, this.requestPostMessageChannel, this.IPostMessageService, this.ICustomTabsService$Stub$Proxy, this.getDefaultImpl, this.onMessageChannelReady, this.ICustomTabsService$Stub, create6));
        this.IPostMessageService$Stub$Proxy = min5;
        this.IPostMessageService$Stub = isScrap.getMin(R.drawable.setMin(scanQrModule2, min5));
        b.C0007b<OnItemLongClick> min6 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.onExtraCallback = min6;
        this.ITrustedWebActivityCallback = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min6));
        hitPresetResource$Grayscale$Algorithm hitpresetresource_grayscale_algorithm = new hitPresetResource$Grayscale$Algorithm(r6);
        this.IPostMessageService$Default = hitpresetresource_grayscale_algorithm;
        NullBeaconDataFactory create7 = NullBeaconDataFactory.create(this.length, this.setMax, hitpresetresource_grayscale_algorithm);
        this.ITrustedWebActivityCallback$Stub$Proxy = create7;
        b.C0007b<OnFocusChange> min7 = isScrap.getMin(OnEditorAction.getMin(this.ITrustedWebActivityCallback, create7));
        this.areNotificationsEnabled = min7;
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min7));
        OauthModule oauthModule3 = oauthModule;
        this.ITrustedWebActivityCallback$Default = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule3, setTrimPathStart.length()));
        setMin setmin = new setMin(r6);
        this.ITrustedWebActivityService = setmin;
        this.getSmallIconId = GriverOpenAuthExtension.create(setmin);
        this.notifyNotificationWithChannel = BLEManager.AnonymousClass2.create(this.length, this.setMax, this.receiveFile);
        this.getActiveNotifications = GriverDialogExtension.create(this.length, this.setMax, this.ITrustedWebActivityService);
        this.cancelNotification = checkSuffixSupported.create(this.toFloatRange);
        this.getSmallIconBitmap = isImage.create(this.toFloatRange);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Default, startListenScreenshot.setMin(), this.getSmallIconId, this.notifyNotificationWithChannel, this.getActiveNotifications, this.cancelNotification, this.getSmallIconBitmap);
        this.ITrustedWebActivityService$Default = max2;
        this.ITrustedWebActivityService$Stub$Proxy = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule3, max2));
        this.ITrustedWebActivityService$Stub = BindFont.length(servicesModule);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.notify = iCustomTabsCallback;
        this.INotificationSideChannel = onStartBleScan.create(this.length, this.setMax, iCustomTabsCallback);
        this.cancel = onGetBluetoothCharacteristics.create(this.length, this.setMax, this.notify);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.INotificationSideChannel$Default = tofloatrange;
        this.INotificationSideChannel$Stub$Proxy = matchesBeacon.create(this.asBinder, tofloatrange);
        this.cancelAll = validateMac.create(this.length, this.setMax, this.asBinder);
        this.INotificationSideChannel$Stub = IntentHandler.create(this.length, this.setMax, this.asBinder, this.INotificationSideChannel$Default);
        this.read = toUuid.create(this.toFloatRange);
        this.MediaBrowserCompat$CustomActionResultReceiver = didDetermineStateForRegion.create(this.asBinder);
        valueOf valueof = new valueOf(r6);
        this.write = valueof;
        this.IconCompatParcelizer = BLEManager.AnonymousClass3.create(valueof);
        BLEManager.AnonymousClass4 create8 = BLEManager.AnonymousClass4.create(this.write);
        this.RemoteActionCompatParcelizer = create8;
        b.C0007b<BindInt> min8 = isScrap.getMin(OnCheckedChanged.length(this.extraCallbackWithResult, this.ITrustedWebActivityService$Stub, this.setDefaultImpl, this.getInterfaceDescriptor, this.INotificationSideChannel, this.cancel, this.INotificationSideChannel$Stub$Proxy, this.cancelAll, this.ICustomTabsCallback$Default, this.INotificationSideChannel$Stub, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, create8));
        this.MediaBrowserCompat$MediaItem = min8;
        b.C0007b<getPath> min9 = isScrap.getMin(Slide.getMin(this.IPostMessageService$Stub, this.ITrustedWebActivityCallback$Stub, this.mayLaunchUrl, this.ITrustedWebActivityService$Stub$Proxy, min8));
        this.MediaBrowserCompat$ItemReceiver = min9;
        DeepLinkModule deepLinkModule3 = deepLinkModule;
        this.MediaDescriptionCompat = isScrap.getMin(Fade.setMin(deepLinkModule3, min9));
        setMax setmax = new setMax(r6);
        this.MediaBrowserCompat$MediaItem$Flags = setmax;
        this.MediaBrowserCompat$SearchResultReceiver = APWebMessagePort.APWebMessageCallback.create(this.length, this.setMax, setmax);
        this.MediaMetadataCompat$TextKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create9 = GVLoadingView.create(this.length, this.setMax, this.ITrustedWebActivityService);
        this.MediaMetadataCompat$RatingKey = create9;
        b.C0007b<setStartDelay> min10 = isScrap.getMin(setInterpolator.setMin(this.MediaDescriptionCompat, this.MediaBrowserCompat$SearchResultReceiver, this.MediaMetadataCompat$TextKey, create9));
        this.MediaMetadataCompat$LongKey = min10;
        this.MediaMetadataCompat$BitmapKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule3, min10));
    }

    public static final class getMax {
        public DeepLinkModule getMax;
        public OauthModule getMin;
        public ServicesModule isInside;
        public FeatureModule length;
        public ScanQrModule setMax;
        public RestoreUrlModule setMin;
        public PrepareException.AnonymousClass1 toFloatRange;
        public AnnouncementModule toIntRange;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    static class invoke implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMax;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 length;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        toString(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.length.ICustomTabsService();
            if (ICustomTabsService != null) {
                return ICustomTabsService;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class isInside implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        isInside(PrepareException.AnonymousClass1 r1) {
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

    static class invokeSuspend implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 setMin;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.setMin.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 getMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.getMin.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 getMin;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMax;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 length;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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

    static class toFloatRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMax;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 setMin;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    public final void setMin(NewBannerView newBannerView) {
        onCaptureModeReached.setMin(newBannerView, this.mayLaunchUrl.get());
        onCaptureModeReached.getMax(newBannerView, this.MediaMetadataCompat$BitmapKey.get());
        onCaptureModeReached.setMin(newBannerView, this.ITrustedWebActivityCallback$Stub.get());
        onCaptureModeReached.setMax(newBannerView, this.IPostMessageService$Stub.get());
        AnnouncementModule announcementModule = this.getMin;
        onLeftHiddenState.getMin min = parseFeatures.setMin(this.getMin);
        toolbarMenuClicked cause = this.getMax.getCause();
        if (cause != null) {
            onCaptureModeReached.length(newBannerView, serialzeFeatures.setMax(announcementModule, new getItemDelegate(min, new getMenus(cause))));
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
