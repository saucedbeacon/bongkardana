package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.ExploreServiceModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.explore.service.ExploreServiceView;
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
import o.style;

public final class ISnapshotProxy implements StartStep {
    private b.C0007b<setDataRequestNotifier> FastBitmap$CoordinateSystem;
    private b.C0007b<requestAppWithAppId> Grayscale$Algorithm;
    private b.C0007b<BindView.setMax> ICustomTabsCallback;
    private b.C0007b<H5Utils> ICustomTabsCallback$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Stub;
    private b.C0007b<setInitTextColor> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<updateFootState> ICustomTabsService;
    private b.C0007b<toUuidString> ICustomTabsService$Default;
    private b.C0007b<getUniqueId> ICustomTabsService$Stub;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsService$Stub$Proxy;
    private b.C0007b<getPlatformCallback> INotificationSideChannel;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Default;
    private b.C0007b<onWebViewDestory> INotificationSideChannel$Stub;
    private b.C0007b<Region$1> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<parseBatteryPercentage> IPostMessageService;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IPostMessageService$Default;
    private b.C0007b<enableBackButton> IPostMessageService$Stub;
    private b.C0007b<setEpicenterCallback> IPostMessageService$Stub$Proxy;
    private b.C0007b<GetAuthCode> ITrustedWebActivityCallback;
    private b.C0007b<getCommonResources> ITrustedWebActivityCallback$Default;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getAllInstallFiles> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityService;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Default;
    private b.C0007b<onAnimationEnd.length> ITrustedWebActivityService$Stub;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<onCharacteristicChanged> IconCompatParcelizer;
    private b.C0007b<getScheme> IsOverlapping;
    private b.C0007b<R.styleable> Mean$Arithmetic;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<AutoTransition.setMax> MediaBrowserCompat$MediaItem;
    private b.C0007b<BindInt> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<onMessage> MediaDescriptionCompat;
    private b.C0007b<getDuration.length> MediaMetadataCompat;
    private b.C0007b<setStartDelay> MediaMetadataCompat$BitmapKey;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$LongKey;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$TextKey;
    private b.C0007b<toByteArray> RemoteActionCompatParcelizer;
    private b.C0007b<getTargets> areNotificationsEnabled;
    private b.C0007b<addChooseImageCrossOrigin> asBinder;
    private b.C0007b<onJsBeforeUnload> asInterface;
    private b.C0007b<OnFocusChange> b;
    private b.C0007b<onConnect> cancel;
    private b.C0007b<convertIntentsToCallbacks> cancelAll;
    private b.C0007b<shouldShowRevokeOpenAuthItem> cancelNotification;
    private b.C0007b<DataProviderException> create;
    private b.C0007b<ResourceProviderExtension> equals;
    private b.C0007b<setPageCacheCapacity> extraCallback;
    private b.C0007b<MovableFrameLayout> extraCallbackWithResult;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> extraCommand;
    private b.C0007b<KitUtils> getActiveNotifications;
    private b.C0007b<OnItemLongClick> getCause;
    private b.C0007b<getScanJobRuntimeMillis> getDefaultImpl;
    private b.C0007b<applySettingsToScheduledJob> getInterfaceDescriptor;
    private b.C0007b<method> getMax;
    private b.C0007b<Activity> getMin;
    private b.C0007b<notifyCharacteristicValue> getSmallIconBitmap;
    private b.C0007b<checkBitmap> getSmallIconId;
    private b.C0007b<getTinyLocalStorageInfo> hashCode;
    private b.C0007b<onDescriptorWrite> invoke;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> invokeSuspend;
    private b.C0007b<R.id.length> isInside;
    private b.C0007b<Context> length;
    private b.C0007b<getPropagation> mayLaunchUrl;
    private b.C0007b<canGoBackOrForward> newSession;
    private b.C0007b<setNetworkAvailable> newSessionWithExtras;
    private b.C0007b<style.getMin> notify;
    private b.C0007b<GriverCreatePromptParam> notifyNotificationWithChannel;
    private b.C0007b<getBlockNetworkImage> onExtraCallback;
    private b.C0007b<setBackButton> onMessageChannelReady;
    private b.C0007b<AndroidModel> onNavigationEvent;
    private b.C0007b<BindView.setMin> onPostMessage;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onRelationshipValidationResult;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> onTransact;
    private b.C0007b<queryAppInfo> postMessage;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> read;
    private b.C0007b<getRunningAnimators.getMin> receiveFile;
    private b.C0007b<isTransitionRequired> requestPostMessageChannel;
    private b.C0007b<getTransitionValues> requestPostMessageChannelWithExtras;
    private b.C0007b<getEpicenter> setDefaultImpl;
    private final PrepareException.AnonymousClass1 setMax;
    private final ExploreServiceModule setMin;
    private b.C0007b<getPerformanceTracker> toDoubleRange;
    private b.C0007b<appxLoadFailed> toFloatRange;
    private b.C0007b<GriverPrepareInterceptor> toIntRange;
    private b.C0007b<setDefaultFontSize> toString;
    private b.C0007b<getMode> updateVisuals;
    private b.C0007b<getCancelable> validateRelationship;
    private b.C0007b<R.id.getMax> valueOf;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> values;
    private b.C0007b<setSceneRoot> warmup;
    private b.C0007b<didExitRegion> write;

    public /* synthetic */ ISnapshotProxy(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, ExploreServiceModule exploreServiceModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, exploreServiceModule, r8);
    }

    private ISnapshotProxy(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, ExploreServiceModule exploreServiceModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.setMax = r6;
        this.setMin = exploreServiceModule;
        this.length = new getMin(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.getMin = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.getMax = min2;
        this.isInside = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toFloatRange = new invokeSuspend(r6);
        this.IsOverlapping = new toDoubleRange(r6);
        toString tostring = new toString(r6);
        this.toIntRange = tostring;
        this.equals = GriverPrepareInterceptor.AnonymousClass2.create(this.toFloatRange, this.IsOverlapping, tostring);
        this.values = beforeQuery.create(this.toFloatRange, this.IsOverlapping, this.toIntRange);
        this.hashCode = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toDoubleRange = new toFloatRange(r6);
        equals equals2 = new equals(r6);
        this.toString = equals2;
        this.FastBitmap$CoordinateSystem = getDataRequestNotifier.create(equals2);
        create create2 = new create(r6);
        this.invoke = create2;
        this.invokeSuspend = onCharacteristicWrite.create(create2, this.toFloatRange, this.IsOverlapping);
        localIdToBytes create3 = localIdToBytes.create(this.toIntRange);
        this.Grayscale$Algorithm = create3;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.length, this.isInside, this.equals, this.values, this.hashCode, this.toDoubleRange, this.FastBitmap$CoordinateSystem, this.invokeSuspend, create3));
        this.Mean$Arithmetic = min3;
        this.valueOf = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.getCause = min4;
        this.ICustomTabsCallback = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        ISnapshotProxy$Grayscale$Algorithm iSnapshotProxy$Grayscale$Algorithm = new ISnapshotProxy$Grayscale$Algorithm(r6);
        this.onNavigationEvent = iSnapshotProxy$Grayscale$Algorithm;
        NullBeaconDataFactory create4 = NullBeaconDataFactory.create(this.toFloatRange, this.IsOverlapping, iSnapshotProxy$Grayscale$Algorithm);
        this.create = create4;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.ICustomTabsCallback, create4));
        this.b = min5;
        this.onPostMessage = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        hashCode hashcode = new hashCode(r6);
        this.onRelationshipValidationResult = hashcode;
        this.extraCallbackWithResult = GriverBizManifest.create(this.toFloatRange, this.IsOverlapping, hashcode);
        this.extraCallback = APWebSettings.PluginState.create(this.toString);
        this.onMessageChannelReady = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.onTransact = isOverlapping;
        this.asInterface = onConsoleMessage.create(this.toFloatRange, this.IsOverlapping, isOverlapping);
        valueOf valueof = new valueOf(r6);
        this.ICustomTabsCallback$Default = valueof;
        this.asBinder = H5ResourceCORSUtil.AnonymousClass1.create(this.toFloatRange, this.IsOverlapping, valueof);
        toIntRange tointrange = new toIntRange(r6);
        this.ICustomTabsCallback$Stub = tointrange;
        this.setDefaultImpl = capturePropagationValues.getMin(this.asBinder, tointrange);
        invoke invoke2 = new invoke(r6);
        this.getDefaultImpl = invoke2;
        this.getInterfaceDescriptor = ScanState.create(this.toFloatRange, this.IsOverlapping, invoke2);
        this.ICustomTabsCallback$Stub$Proxy = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.ICustomTabsCallback$Stub$Proxy);
        this.ICustomTabsService = length2;
        this.warmup = Transition.MatchOrder.length(this.getInterfaceDescriptor, length2);
        this.newSession = setInitialScale.create(this.toFloatRange, this.IsOverlapping, this.toString);
        postUrl create5 = postUrl.create(this.toFloatRange, this.IsOverlapping, this.toString);
        this.newSessionWithExtras = create5;
        this.mayLaunchUrl = getName.setMin(this.newSession, create5, manuallyReleaseCamera.setMax());
        ISnapshotProxy$FastBitmap$CoordinateSystem iSnapshotProxy$FastBitmap$CoordinateSystem = new ISnapshotProxy$FastBitmap$CoordinateSystem(r6);
        this.extraCommand = iSnapshotProxy$FastBitmap$CoordinateSystem;
        saveAppInfos create6 = saveAppInfos.create(iSnapshotProxy$FastBitmap$CoordinateSystem);
        this.postMessage = create6;
        this.requestPostMessageChannelWithExtras = captureHierarchy.length(create6, OpenInBrowserBridgeExtension.setMax());
        this.requestPostMessageChannel = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.length));
        this.validateRelationship = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.extraCallbackWithResult, this.extraCallback, this.onMessageChannelReady, this.asInterface, this.setDefaultImpl, this.warmup, this.mayLaunchUrl, this.requestPostMessageChannelWithExtras, this.requestPostMessageChannel, min6, this.FastBitmap$CoordinateSystem));
        this.updateVisuals = min7;
        this.receiveFile = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        values values2 = new values(r6);
        this.ICustomTabsService$Default = values2;
        this.ICustomTabsService$Stub = didRangeBeaconsInRegion.create(this.toFloatRange, this.IsOverlapping, values2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.length);
        this.ICustomTabsService$Stub$Proxy = max;
        this.IPostMessageService = getSystemInfo.setMax(max);
        setMax setmax = new setMax(r6);
        this.IPostMessageService$Stub = setmax;
        setOptionMenu create7 = setOptionMenu.create(setmax);
        this.ITrustedWebActivityCallback = create7;
        this.IPostMessageService$Stub$Proxy = isScrap.getMin(setPropagation.length(this.receiveFile, this.ICustomTabsService$Stub, this.IPostMessageService, create7, this.toDoubleRange));
        this.onExtraCallback = getLoadsImagesAutomatically.create(this.toFloatRange, this.IsOverlapping, this.toString);
        this.IPostMessageService$Default = setWebContentsDebuggingEnabled.create(this.toString);
        installPathExist create8 = installPathExist.create(this.toString);
        this.ITrustedWebActivityCallback$Stub$Proxy = create8;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.receiveFile, this.IPostMessageService$Stub$Proxy, this.onExtraCallback, this.IPostMessageService$Default, create8));
        this.areNotificationsEnabled = min8;
        this.ITrustedWebActivityService = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        getMax getmax = new getMax(r6);
        this.ITrustedWebActivityCallback$Default = getmax;
        this.cancelNotification = GriverOpenAuthExtension.create(getmax);
        this.getSmallIconBitmap = BLEManager.AnonymousClass2.create(this.toFloatRange, this.IsOverlapping, this.invoke);
        this.notifyNotificationWithChannel = GriverDialogExtension.create(this.toFloatRange, this.IsOverlapping, this.ITrustedWebActivityCallback$Default);
        this.getActiveNotifications = checkSuffixSupported.create(this.toString);
        this.getSmallIconId = isImage.create(this.toString);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityCallback$Stub, startListenScreenshot.setMin(), this.cancelNotification, this.getSmallIconBitmap, this.notifyNotificationWithChannel, this.getActiveNotifications, this.getSmallIconId);
        this.INotificationSideChannel = max2;
        this.ITrustedWebActivityService$Stub = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.notify = BindFont.length(servicesModule);
        getCause getcause = new getCause(r6);
        this.ITrustedWebActivityService$Stub$Proxy = getcause;
        this.ITrustedWebActivityService$Default = onStartBleScan.create(this.toFloatRange, this.IsOverlapping, getcause);
        this.cancel = onGetBluetoothCharacteristics.create(this.toFloatRange, this.IsOverlapping, this.ITrustedWebActivityService$Stub$Proxy);
        isInside isinside = new isInside(r6);
        this.INotificationSideChannel$Stub = isinside;
        this.INotificationSideChannel$Default = matchesBeacon.create(this.ICustomTabsService$Default, isinside);
        this.INotificationSideChannel$Stub$Proxy = validateMac.create(this.toFloatRange, this.IsOverlapping, this.ICustomTabsService$Default);
        this.cancelAll = IntentHandler.create(this.toFloatRange, this.IsOverlapping, this.ICustomTabsService$Default, this.INotificationSideChannel$Stub);
        this.RemoteActionCompatParcelizer = toUuid.create(this.toString);
        this.write = didDetermineStateForRegion.create(this.ICustomTabsService$Default);
        ISnapshotProxy$Mean$Arithmetic iSnapshotProxy$Mean$Arithmetic = new ISnapshotProxy$Mean$Arithmetic(r6);
        this.IconCompatParcelizer = iSnapshotProxy$Mean$Arithmetic;
        this.MediaBrowserCompat$CustomActionResultReceiver = BLEManager.AnonymousClass3.create(iSnapshotProxy$Mean$Arithmetic);
        BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.IconCompatParcelizer);
        this.read = create9;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.length, this.notify, this.ITrustedWebActivityCallback, this.IPostMessageService, this.ITrustedWebActivityService$Default, this.cancel, this.INotificationSideChannel$Default, this.INotificationSideChannel$Stub$Proxy, this.ICustomTabsService$Stub, this.cancelAll, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, create9));
        this.MediaBrowserCompat$MediaItem$Flags = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.valueOf, this.onPostMessage, this.ITrustedWebActivityService, this.ITrustedWebActivityService$Stub, min9));
        this.MediaBrowserCompat$ItemReceiver = min10;
        this.MediaBrowserCompat$MediaItem = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        setMin setmin = new setMin(r29);
        this.MediaBrowserCompat$SearchResultReceiver = setmin;
        this.MediaDescriptionCompat = APWebMessagePort.APWebMessageCallback.create(this.toFloatRange, this.IsOverlapping, setmin);
        this.MediaMetadataCompat$TextKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create10 = GVLoadingView.create(this.toFloatRange, this.IsOverlapping, this.ITrustedWebActivityCallback$Default);
        this.MediaMetadataCompat$LongKey = create10;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaBrowserCompat$MediaItem, this.MediaDescriptionCompat, this.MediaMetadataCompat$TextKey, create10));
        this.MediaMetadataCompat$BitmapKey = min11;
        this.MediaMetadataCompat = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class length {
        public ServicesModule IsOverlapping;
        public OauthModule getMax;
        public RestoreUrlModule getMin;
        public PrepareException.AnonymousClass1 isInside;
        public ScanQrModule length;
        public DeepLinkModule setMax;
        public FeatureModule setMin;
        public ExploreServiceModule toIntRange;

        public /* synthetic */ length(byte b) {
            this();
        }

        private length() {
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
        private final PrepareException.AnonymousClass1 getMax;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMax;

        equals(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMax;

        create(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 length;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 getMin;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 setMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 getMin;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class setMax implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 getMax;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class getCause implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMax;

        getCause(PrepareException.AnonymousClass1 r1) {
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

    public final void getMax(ExploreServiceView exploreServiceView) {
        rollbackConnectParam.setMin(exploreServiceView, this.MediaMetadataCompat.get());
        ExploreServiceModule exploreServiceModule = this.setMin;
        setDefaultFontSize updateVisuals2 = this.setMax.updateVisuals();
        if (updateVisuals2 != null) {
            setDefaultFontSize setdefaultfontsize = updateVisuals2;
            toUuidString requestPostMessageChannelWithExtras2 = this.setMax.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras2 != null) {
                rollbackConnectParam.length(exploreServiceView, ListSerializer.length(exploreServiceModule, new MyBeaconListener(new setStandardFontFamily(setdefaultfontsize, requestPostMessageChannelWithExtras2), MapSerializer.setMax(this.setMin))));
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
