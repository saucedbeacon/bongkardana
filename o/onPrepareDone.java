package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.MoreForYouModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.richview.moreforyou.MoreForYouView;
import o.APVideoRecordRsp;
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
import o.getAspectRatio;
import o.getDuration;
import o.getRunningAnimators;
import o.onAnimationEnd;
import o.style;

public final class onPrepareDone implements SubPackageDownloader {
    private b.C0007b<setDefaultFontSize> FastBitmap$CoordinateSystem;
    private b.C0007b<R.styleable> Grayscale$Algorithm;
    private b.C0007b<DataProviderException> ICustomTabsCallback;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> ICustomTabsCallback$Default;
    private b.C0007b<onJsBeforeUnload> ICustomTabsCallback$Stub;
    private b.C0007b<applySettingsToScheduledJob> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<updateFootState> ICustomTabsService;
    private b.C0007b<parseBatteryPercentage> ICustomTabsService$Default;
    private b.C0007b<getUniqueId> ICustomTabsService$Stub;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsService$Stub$Proxy;
    private b.C0007b<getPlatformCallback> INotificationSideChannel;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Default;
    private b.C0007b<onConnect> INotificationSideChannel$Stub;
    private b.C0007b<hasSameIdentifiers> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<toUuidString> IPostMessageService;
    private b.C0007b<enableBackButton> IPostMessageService$Default;
    private b.C0007b<getBlockNetworkImage> IPostMessageService$Stub;
    private b.C0007b<setEpicenterCallback> IPostMessageService$Stub$Proxy;
    private b.C0007b<APWebSettings.LayoutAlgorithm> ITrustedWebActivityCallback;
    private b.C0007b<getCommonResources> ITrustedWebActivityCallback$Default;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getTargets> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getAllInstallFiles> ITrustedWebActivityService;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Default;
    private b.C0007b<style.getMin> ITrustedWebActivityService$Stub;
    private b.C0007b<onCharacteristicWriteCompleted> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<didExitRegion> IconCompatParcelizer;
    private b.C0007b<ResourceProviderExtension> IsOverlapping;
    private b.C0007b<requestAppWithAppId> Mean$Arithmetic;
    private b.C0007b<toByteArray> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<BindInt> MediaBrowserCompat$MediaItem;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<getPath> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<AutoTransition.setMax> MediaDescriptionCompat;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat;
    private b.C0007b<setStartDelay> MediaMetadataCompat$BitmapKey;
    private b.C0007b<getDuration.length> MediaMetadataCompat$LongKey;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$TextKey;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> RemoteActionCompatParcelizer;
    private b.C0007b<onAnimationEnd.getMin> areNotificationsEnabled;
    private b.C0007b<getAppPerfKey> asBinder;
    private b.C0007b<addChooseImageCrossOrigin> asInterface;
    private b.C0007b<OnFocusChange> b;
    private b.C0007b<onWebViewDestory> cancel;
    private b.C0007b<Region$1> cancelAll;
    private b.C0007b<notifyCharacteristicValue> cancelNotification;
    private b.C0007b<BindView.setMax> create;
    private b.C0007b<GriverPrepareInterceptor> equals;
    private b.C0007b<BindView.setMin> extraCallback;
    private b.C0007b<setPageCacheCapacity> extraCallbackWithResult;
    private b.C0007b<getPropagation> extraCommand;
    private b.C0007b<checkBitmap> getActiveNotifications;
    private b.C0007b<AndroidModel> getCause;
    private b.C0007b<setInitTextColor> getDefaultImpl;
    private b.C0007b<getEpicenter> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private final MoreForYouModule getMin;
    private b.C0007b<shouldShowRevokeOpenAuthItem> getSmallIconBitmap;
    private b.C0007b<GriverCreatePromptParam> getSmallIconId;
    private b.C0007b<setDataRequestNotifier> hashCode;
    private b.C0007b<R.id.getMax> invoke;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> invokeSuspend;
    private b.C0007b<R.id.length> isInside;
    private b.C0007b<Context> length;
    private b.C0007b<canGoBackOrForward> mayLaunchUrl;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> newSession;
    private b.C0007b<setSceneRoot> newSessionWithExtras;
    private b.C0007b<onAnimationEnd.length> notify;
    private b.C0007b<KitUtils> notifyNotificationWithChannel;
    private b.C0007b<GetAuthCode> onExtraCallback;
    private b.C0007b<MovableFrameLayout> onMessageChannelReady;
    private b.C0007b<OnItemLongClick> onNavigationEvent;
    private b.C0007b<setBackButton> onPostMessage;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onRelationshipValidationResult;
    private b.C0007b<H5Utils> onTransact;
    private b.C0007b<getTransitionValues> postMessage;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> read;
    private b.C0007b<getRunningAnimators.getMin> receiveFile;
    private b.C0007b<queryAppInfo> requestPostMessageChannel;
    private b.C0007b<getMode> requestPostMessageChannelWithExtras;
    private b.C0007b<getScanJobRuntimeMillis> setDefaultImpl;
    private b.C0007b<Activity> setMax;
    private b.C0007b<method> setMin;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> toDoubleRange;
    private b.C0007b<getScheme> toFloatRange;
    private b.C0007b<appxLoadFailed> toIntRange;
    private b.C0007b<getPerformanceTracker> toString;
    private b.C0007b<isTransitionRequired> updateVisuals;
    private b.C0007b<getCancelable> validateRelationship;
    private b.C0007b<onDescriptorWrite> valueOf;
    private b.C0007b<getTinyLocalStorageInfo> values;
    private b.C0007b<setNetworkAvailable> warmup;
    private b.C0007b<onCharacteristicChanged> write;

    public /* synthetic */ onPrepareDone(MoreForYouModule moreForYouModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(moreForYouModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r8);
    }

    private onPrepareDone(MoreForYouModule moreForYouModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.getMin = moreForYouModule;
        this.getMax = r6;
        this.length = new setMax(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.setMax = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.setMin = min2;
        this.isInside = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toIntRange = new onPrepareDone$Grayscale$Algorithm(r6);
        this.toFloatRange = new onPrepareDone$FastBitmap$CoordinateSystem(r6);
        hashCode hashcode = new hashCode(r6);
        this.equals = hashcode;
        this.IsOverlapping = GriverPrepareInterceptor.AnonymousClass2.create(this.toIntRange, this.toFloatRange, hashcode);
        this.toDoubleRange = beforeQuery.create(this.toIntRange, this.toFloatRange, this.equals);
        this.values = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.toString = new isInside(r6);
        equals equals2 = new equals(r6);
        this.FastBitmap$CoordinateSystem = equals2;
        this.hashCode = getDataRequestNotifier.create(equals2);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.valueOf = iCustomTabsCallback;
        this.invokeSuspend = onCharacteristicWrite.create(iCustomTabsCallback, this.toIntRange, this.toFloatRange);
        localIdToBytes create2 = localIdToBytes.create(this.equals);
        this.Mean$Arithmetic = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.length, this.isInside, this.IsOverlapping, this.toDoubleRange, this.values, this.toString, this.hashCode, this.invokeSuspend, create2));
        this.Grayscale$Algorithm = min3;
        this.invoke = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.onNavigationEvent = min4;
        this.create = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.getCause = invokesuspend;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.toIntRange, this.toFloatRange, invokesuspend);
        this.ICustomTabsCallback = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.create, create3));
        this.b = min5;
        this.extraCallback = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        toString tostring = new toString(r6);
        this.onRelationshipValidationResult = tostring;
        this.onMessageChannelReady = GriverBizManifest.create(this.toIntRange, this.toFloatRange, tostring);
        this.extraCallbackWithResult = APWebSettings.PluginState.create(this.FastBitmap$CoordinateSystem);
        this.onPostMessage = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.ICustomTabsCallback$Default = tofloatrange;
        this.ICustomTabsCallback$Stub = onConsoleMessage.create(this.toIntRange, this.toFloatRange, tofloatrange);
        onPrepareDone$Mean$Arithmetic onpreparedone_mean_arithmetic = new onPrepareDone$Mean$Arithmetic(r6);
        this.onTransact = onpreparedone_mean_arithmetic;
        this.asInterface = H5ResourceCORSUtil.AnonymousClass1.create(this.toIntRange, this.toFloatRange, onpreparedone_mean_arithmetic);
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.asBinder = isOverlapping;
        this.getInterfaceDescriptor = capturePropagationValues.getMin(this.asInterface, isOverlapping);
        valueOf valueof = new valueOf(r6);
        this.setDefaultImpl = valueof;
        this.ICustomTabsCallback$Stub$Proxy = ScanState.create(this.toIntRange, this.toFloatRange, valueof);
        this.getDefaultImpl = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.getDefaultImpl);
        this.ICustomTabsService = length2;
        this.newSessionWithExtras = Transition.MatchOrder.length(this.ICustomTabsCallback$Stub$Proxy, length2);
        this.mayLaunchUrl = setInitialScale.create(this.toIntRange, this.toFloatRange, this.FastBitmap$CoordinateSystem);
        postUrl create4 = postUrl.create(this.toIntRange, this.toFloatRange, this.FastBitmap$CoordinateSystem);
        this.warmup = create4;
        this.extraCommand = getName.setMin(this.mayLaunchUrl, create4, manuallyReleaseCamera.setMax());
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.newSession = todoublerange;
        saveAppInfos create5 = saveAppInfos.create(todoublerange);
        this.requestPostMessageChannel = create5;
        this.postMessage = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.updateVisuals = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.length));
        this.validateRelationship = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.onMessageChannelReady, this.extraCallbackWithResult, this.onPostMessage, this.ICustomTabsCallback$Stub, this.getInterfaceDescriptor, this.newSessionWithExtras, this.extraCommand, this.postMessage, this.updateVisuals, min6, this.hashCode));
        this.requestPostMessageChannelWithExtras = min7;
        this.receiveFile = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        values values2 = new values(r6);
        this.IPostMessageService = values2;
        this.ICustomTabsService$Stub = didRangeBeaconsInRegion.create(this.toIntRange, this.toFloatRange, values2);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.length);
        this.ICustomTabsService$Stub$Proxy = max;
        this.ICustomTabsService$Default = getSystemInfo.setMax(max);
        getMax getmax = new getMax(r6);
        this.IPostMessageService$Default = getmax;
        setOptionMenu create6 = setOptionMenu.create(getmax);
        this.onExtraCallback = create6;
        this.IPostMessageService$Stub$Proxy = isScrap.getMin(setPropagation.length(this.receiveFile, this.ICustomTabsService$Stub, this.ICustomTabsService$Default, create6, this.toString));
        this.IPostMessageService$Stub = getLoadsImagesAutomatically.create(this.toIntRange, this.toFloatRange, this.FastBitmap$CoordinateSystem);
        this.ITrustedWebActivityCallback = setWebContentsDebuggingEnabled.create(this.FastBitmap$CoordinateSystem);
        installPathExist create7 = installPathExist.create(this.FastBitmap$CoordinateSystem);
        this.ITrustedWebActivityService = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.receiveFile, this.IPostMessageService$Stub$Proxy, this.IPostMessageService$Stub, this.ITrustedWebActivityCallback, create7));
        this.ITrustedWebActivityCallback$Stub$Proxy = min8;
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.areNotificationsEnabled = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        length length3 = new length(r6);
        this.ITrustedWebActivityCallback$Default = length3;
        this.getSmallIconBitmap = GriverOpenAuthExtension.create(length3);
        this.cancelNotification = BLEManager.AnonymousClass2.create(this.toIntRange, this.toFloatRange, this.valueOf);
        this.getSmallIconId = GriverDialogExtension.create(this.toIntRange, this.toFloatRange, this.ITrustedWebActivityCallback$Default);
        this.notifyNotificationWithChannel = checkSuffixSupported.create(this.FastBitmap$CoordinateSystem);
        this.getActiveNotifications = isImage.create(this.FastBitmap$CoordinateSystem);
        getFillColor max2 = getFillColor.setMax(this.areNotificationsEnabled, startListenScreenshot.setMin(), this.getSmallIconBitmap, this.cancelNotification, this.getSmallIconId, this.notifyNotificationWithChannel, this.getActiveNotifications);
        this.INotificationSideChannel = max2;
        this.notify = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.ITrustedWebActivityService$Stub = BindFont.length(servicesModule);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.ITrustedWebActivityService$Default = onnavigationevent;
        this.ITrustedWebActivityService$Stub$Proxy = onStartBleScan.create(this.toIntRange, this.toFloatRange, onnavigationevent);
        this.INotificationSideChannel$Stub = onGetBluetoothCharacteristics.create(this.toIntRange, this.toFloatRange, this.ITrustedWebActivityService$Default);
        toIntRange tointrange = new toIntRange(r6);
        this.cancel = tointrange;
        this.INotificationSideChannel$Stub$Proxy = matchesBeacon.create(this.IPostMessageService, tointrange);
        this.cancelAll = validateMac.create(this.toIntRange, this.toFloatRange, this.IPostMessageService);
        this.INotificationSideChannel$Default = IntentHandler.create(this.toIntRange, this.toFloatRange, this.IPostMessageService, this.cancel);
        this.MediaBrowserCompat$CustomActionResultReceiver = toUuid.create(this.FastBitmap$CoordinateSystem);
        this.IconCompatParcelizer = didDetermineStateForRegion.create(this.IPostMessageService);
        invoke invoke2 = new invoke(r6);
        this.write = invoke2;
        this.read = BLEManager.AnonymousClass3.create(invoke2);
        BLEManager.AnonymousClass4 create8 = BLEManager.AnonymousClass4.create(this.write);
        this.RemoteActionCompatParcelizer = create8;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.length, this.ITrustedWebActivityService$Stub, this.onExtraCallback, this.ICustomTabsService$Default, this.ITrustedWebActivityService$Stub$Proxy, this.INotificationSideChannel$Stub, this.INotificationSideChannel$Stub$Proxy, this.cancelAll, this.ICustomTabsService$Stub, this.INotificationSideChannel$Default, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.read, create8));
        this.MediaBrowserCompat$MediaItem = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.invoke, this.extraCallback, this.ITrustedWebActivityCallback$Stub, this.notify, min9));
        this.MediaBrowserCompat$SearchResultReceiver = min10;
        this.MediaDescriptionCompat = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        getMin getmin = new getMin(r29);
        this.MediaBrowserCompat$ItemReceiver = getmin;
        this.MediaBrowserCompat$MediaItem$Flags = APWebMessagePort.APWebMessageCallback.create(this.toIntRange, this.toFloatRange, getmin);
        this.MediaMetadataCompat$TextKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create9 = GVLoadingView.create(this.toIntRange, this.toFloatRange, this.ITrustedWebActivityCallback$Default);
        this.MediaMetadataCompat = create9;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaDescriptionCompat, this.MediaBrowserCompat$MediaItem$Flags, this.MediaMetadataCompat$TextKey, create9));
        this.MediaMetadataCompat$BitmapKey = min11;
        this.MediaMetadataCompat$LongKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class setMin {
        public MoreForYouModule getMax;
        public RestoreUrlModule getMin;
        public PrepareException.AnonymousClass1 isInside;
        public FeatureModule length;
        public DeepLinkModule setMax;
        public ScanQrModule setMin;
        public OauthModule toFloatRange;
        public ServicesModule toIntRange;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class setMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<GriverPrepareInterceptor> {
        private final PrepareException.AnonymousClass1 length;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMax;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            AndroidModel IPostMessageService = this.setMax.IPostMessageService();
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

    static class toFloatRange implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class valueOf implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 setMin;

        valueOf(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 setMin;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMax;

        length(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMin;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMax;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMax;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class getMin implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 setMax;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    public final void setMax(MoreForYouView moreForYouView) {
        MoreForYouModule moreForYouModule = this.getMin;
        getAspectRatio.length length2 = castToBoolean.length(this.getMin);
        GriverKVStorage IMediaControllerCallback$Stub$Proxy = this.getMax.IMediaControllerCallback$Stub$Proxy();
        if (IMediaControllerCallback$Stub$Proxy != null) {
            APVideoRecordRsp.RecordPhase.getMax(moreForYouView, castToJavaBean.setMax(moreForYouModule, new getQuality(length2, new GriverDefaultSecurityExtension(IMediaControllerCallback$Stub$Proxy), new isKeepPreview())));
            APVideoRecordRsp.RecordPhase.getMax(moreForYouView, this.MediaMetadataCompat$LongKey.get());
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
