package o;

import android.app.Activity;
import android.content.Context;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.globalsearch.GlobalSearchBottomSheetModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.globalsearch.view.GlobalSearchBottomSheetDialog;
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
import o.Transition;
import o.b;
import o.getDuration;
import o.getRunningAnimators;
import o.getTranslateY;
import o.onAnimationEnd;
import o.style;

public final class RVSnapshotUtils implements acquireMainJsUrl {
    private b.C0007b<GriverPrepareInterceptor> FastBitmap$CoordinateSystem;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> Grayscale$Algorithm;
    private b.C0007b<R.styleable> ICustomTabsCallback;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> ICustomTabsCallback$Default;
    private b.C0007b<MovableFrameLayout> ICustomTabsCallback$Stub;
    private b.C0007b<getEpicenter> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getScanJobRuntimeMillis> ICustomTabsService;
    private b.C0007b<isTransitionRequired> ICustomTabsService$Default;
    private b.C0007b<getRunningAnimators.getMin> ICustomTabsService$Stub;
    private b.C0007b<getMode> ICustomTabsService$Stub$Proxy;
    private b.C0007b<GriverCreatePromptParam> INotificationSideChannel;
    private b.C0007b<onWebViewDestory> INotificationSideChannel$Default;
    private b.C0007b<onConnect> INotificationSideChannel$Stub;
    private b.C0007b<onDisconnect> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<getCancelable> IPostMessageService;
    private b.C0007b<enableBackButton> IPostMessageService$Default;
    private b.C0007b<OrientationDetector.OrientationListener> IPostMessageService$Stub;
    private b.C0007b<GetAuthCode> IPostMessageService$Stub$Proxy;
    private b.C0007b<parseBatteryPercentage> ITrustedWebActivityCallback;
    private b.C0007b<APWebSettings.LayoutAlgorithm> ITrustedWebActivityCallback$Default;
    private b.C0007b<getTargets> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getAllInstallFiles> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getBlockNetworkImage> ITrustedWebActivityService;
    private b.C0007b<checkBitmap> ITrustedWebActivityService$Default;
    private b.C0007b<KitUtils> ITrustedWebActivityService$Stub;
    private b.C0007b<getPlatformCallback> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<didExitRegion> IconCompatParcelizer;
    private b.C0007b<method> IsOverlapping;
    private b.C0007b<getPerformanceTracker> Mean$Arithmetic;
    private b.C0007b<toByteArray> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<getPath> MediaBrowserCompat$MediaItem;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<BindInt> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<onCharacteristicChanged> MediaDescriptionCompat;
    private b.C0007b<setSupportZoom> MediaMetadataCompat;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat$BitmapKey;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaMetadataCompat$LongKey;
    private b.C0007b<onMessage> MediaMetadataCompat$RatingKey;
    private b.C0007b<AutoTransition.setMax> MediaMetadataCompat$TextKey;
    private b.C0007b<setStartDelay> RatingCompat$Style;
    private b.C0007b<Region$1> RemoteActionCompatParcelizer;
    private b.C0007b<setEpicenterCallback> areNotificationsEnabled;
    private b.C0007b<setBackButton> asBinder;
    private b.C0007b<setPageCacheCapacity> asInterface;
    private b.C0007b<R.id.getMax> b;
    private b.C0007b<style.getMin> cancel;
    private b.C0007b<onCharacteristicWriteCompleted> cancelAll;
    private b.C0007b<onAnimationEnd.getMin> cancelNotification;
    private b.C0007b<BindView.setMax> create;
    private b.C0007b<R.id.length> equals;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> extraCallback;
    private b.C0007b<BindView.setMin> extraCallbackWithResult;
    private b.C0007b<setInitTextColor> extraCommand;
    private b.C0007b<shouldShowRevokeOpenAuthItem> getActiveNotifications;
    private b.C0007b<OnItemLongClick> getCause;
    private b.C0007b<H5Utils> getDefaultImpl;
    private b.C0007b<addChooseImageCrossOrigin> getInterfaceDescriptor;
    private b.C0007b<setStorageProxy> getMax;
    private b.C0007b<getTranslateY.getMax> getMin;
    private b.C0007b<getCommonResources> getSmallIconBitmap;
    private b.C0007b<getRunningAnimators.setMax> getSmallIconId;
    private b.C0007b<ResourceProviderExtension> hashCode;
    private b.C0007b<setDataRequestNotifier> invoke;
    private b.C0007b<setDefaultFontSize> invokeSuspend;
    private b.C0007b<Activity> isInside;
    private b.C0007b<getTranslateY.setMax> length;
    private b.C0007b<canGoBackOrForward> mayLaunchUrl;
    private b.C0007b<updateFootState> newSession;
    private b.C0007b<setSceneRoot> newSessionWithExtras;
    private b.C0007b<onAnimationEnd.length> notify;
    private b.C0007b<notifyCharacteristicValue> notifyNotificationWithChannel;
    private b.C0007b<getDuration.length> onEvent;
    private b.C0007b<getUniqueId> onExtraCallback;
    private b.C0007b<AndroidModel> onMessageChannelReady;
    private b.C0007b<requestAppWithAppId> onNavigationEvent;
    private b.C0007b<DataProviderException> onPostMessage;
    private b.C0007b<OnFocusChange> onRelationshipValidationResult;
    private b.C0007b<onJsBeforeUnload> onTransact;
    private b.C0007b<queryAppInfo> postMessage;
    private b.C0007b<hasSameIdentifiers> read;
    private b.C0007b<toUuidString> receiveFile;
    private b.C0007b<setNetworkAvailable> requestPostMessageChannel;
    private b.C0007b<getPropagation> requestPostMessageChannelWithExtras;
    private b.C0007b<getAppPerfKey> setDefaultImpl;
    private b.C0007b<isValid> setMax;
    private b.C0007b<getRootAlpha> setMin;
    private b.C0007b<getScheme> toDoubleRange;
    private b.C0007b<Context> toFloatRange;
    private b.C0007b<appxLoadFailed> toIntRange;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> toString;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> updateVisuals;
    private b.C0007b<getTransitionValues> validateRelationship;
    private b.C0007b<onDescriptorWrite> valueOf;
    private b.C0007b<getTinyLocalStorageInfo> values;
    private b.C0007b<applySettingsToScheduledJob> warmup;
    private b.C0007b<convertIntentsToCallbacks> write;

    public /* synthetic */ RVSnapshotUtils(GlobalSearchBottomSheetModule globalSearchBottomSheetModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r8, byte b2) {
        this(globalSearchBottomSheetModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r8);
    }

    private RVSnapshotUtils(GlobalSearchBottomSheetModule globalSearchBottomSheetModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r29) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r29;
        this.getMin = isScrap.getMin(setTranslateY.setMin(globalSearchBottomSheetModule));
        toString tostring = new toString(r6);
        this.getMax = tostring;
        getAppInfoDaoDescComparator create2 = getAppInfoDaoDescComparator.create(tostring);
        this.setMax = create2;
        setPathData max = setPathData.setMax(this.getMin, create2, canTextInput.length());
        this.setMin = max;
        this.length = isScrap.getMin(getPathData.setMin(globalSearchBottomSheetModule, max));
        this.toFloatRange = new getMax(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.isInside = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.IsOverlapping = min2;
        this.equals = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toIntRange = new RVSnapshotUtils$Grayscale$Algorithm(r6);
        this.toDoubleRange = new hashCode(r6);
        RVSnapshotUtils$FastBitmap$CoordinateSystem rVSnapshotUtils$FastBitmap$CoordinateSystem = new RVSnapshotUtils$FastBitmap$CoordinateSystem(r6);
        this.FastBitmap$CoordinateSystem = rVSnapshotUtils$FastBitmap$CoordinateSystem;
        this.hashCode = GriverPrepareInterceptor.AnonymousClass2.create(this.toIntRange, this.toDoubleRange, rVSnapshotUtils$FastBitmap$CoordinateSystem);
        this.toString = beforeQuery.create(this.toIntRange, this.toDoubleRange, this.FastBitmap$CoordinateSystem);
        this.values = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.Mean$Arithmetic = new toFloatRange(r6);
        toIntRange tointrange = new toIntRange(r6);
        this.invokeSuspend = tointrange;
        this.invoke = getDataRequestNotifier.create(tointrange);
        b bVar = new b(r6);
        this.valueOf = bVar;
        this.Grayscale$Algorithm = onCharacteristicWrite.create(bVar, this.toIntRange, this.toDoubleRange);
        localIdToBytes create3 = localIdToBytes.create(this.FastBitmap$CoordinateSystem);
        this.onNavigationEvent = create3;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.toFloatRange, this.equals, this.hashCode, this.toString, this.values, this.Mean$Arithmetic, this.invoke, this.Grayscale$Algorithm, create3));
        this.ICustomTabsCallback = min3;
        this.b = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.getCause = min4;
        this.create = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invoke invoke2 = new invoke(r6);
        this.onMessageChannelReady = invoke2;
        NullBeaconDataFactory create4 = NullBeaconDataFactory.create(this.toIntRange, this.toDoubleRange, invoke2);
        this.onPostMessage = create4;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.create, create4));
        this.onRelationshipValidationResult = min5;
        this.extraCallbackWithResult = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        values values2 = new values(r6);
        this.extraCallback = values2;
        this.ICustomTabsCallback$Stub = GriverBizManifest.create(this.toIntRange, this.toDoubleRange, values2);
        this.asInterface = APWebSettings.PluginState.create(this.invokeSuspend);
        this.asBinder = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.ICustomTabsCallback$Default = isOverlapping;
        this.onTransact = onConsoleMessage.create(this.toIntRange, this.toDoubleRange, isOverlapping);
        valueOf valueof = new valueOf(r6);
        this.getDefaultImpl = valueof;
        this.getInterfaceDescriptor = H5ResourceCORSUtil.AnonymousClass1.create(this.toIntRange, this.toDoubleRange, valueof);
        equals equals2 = new equals(r6);
        this.setDefaultImpl = equals2;
        this.ICustomTabsCallback$Stub$Proxy = capturePropagationValues.getMin(this.getInterfaceDescriptor, equals2);
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.ICustomTabsService = invokesuspend;
        this.warmup = ScanState.create(this.toIntRange, this.toDoubleRange, invokesuspend);
        this.extraCommand = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.extraCommand);
        this.newSession = length2;
        this.newSessionWithExtras = Transition.MatchOrder.length(this.warmup, length2);
        this.mayLaunchUrl = setInitialScale.create(this.toIntRange, this.toDoubleRange, this.invokeSuspend);
        postUrl create5 = postUrl.create(this.toIntRange, this.toDoubleRange, this.invokeSuspend);
        this.requestPostMessageChannel = create5;
        this.requestPostMessageChannelWithExtras = getName.setMin(this.mayLaunchUrl, create5, manuallyReleaseCamera.setMax());
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.updateVisuals = todoublerange;
        saveAppInfos create6 = saveAppInfos.create(todoublerange);
        this.postMessage = create6;
        this.validateRelationship = captureHierarchy.length(create6, OpenInBrowserBridgeExtension.setMax());
        this.ICustomTabsService$Default = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.toFloatRange));
        this.IPostMessageService = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.ICustomTabsCallback$Stub, this.asInterface, this.asBinder, this.onTransact, this.ICustomTabsCallback$Stub$Proxy, this.newSessionWithExtras, this.requestPostMessageChannelWithExtras, this.validateRelationship, this.ICustomTabsService$Default, min6, this.invoke));
        this.ICustomTabsService$Stub$Proxy = min7;
        this.ICustomTabsService$Stub = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        RVSnapshotUtils$Mean$Arithmetic rVSnapshotUtils$Mean$Arithmetic = new RVSnapshotUtils$Mean$Arithmetic(r6);
        this.receiveFile = rVSnapshotUtils$Mean$Arithmetic;
        this.onExtraCallback = didRangeBeaconsInRegion.create(this.toIntRange, this.toDoubleRange, rVSnapshotUtils$Mean$Arithmetic);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max2 = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.toFloatRange);
        this.IPostMessageService$Stub = max2;
        this.ITrustedWebActivityCallback = getSystemInfo.setMax(max2);
        setMin setmin = new setMin(r6);
        this.IPostMessageService$Default = setmin;
        setOptionMenu create7 = setOptionMenu.create(setmin);
        this.IPostMessageService$Stub$Proxy = create7;
        this.areNotificationsEnabled = isScrap.getMin(setPropagation.length(this.ICustomTabsService$Stub, this.onExtraCallback, this.ITrustedWebActivityCallback, create7, this.Mean$Arithmetic));
        this.ITrustedWebActivityService = getLoadsImagesAutomatically.create(this.toIntRange, this.toDoubleRange, this.invokeSuspend);
        this.ITrustedWebActivityCallback$Default = setWebContentsDebuggingEnabled.create(this.invokeSuspend);
        installPathExist create8 = installPathExist.create(this.invokeSuspend);
        this.ITrustedWebActivityCallback$Stub$Proxy = create8;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.ICustomTabsService$Stub, this.areNotificationsEnabled, this.ITrustedWebActivityService, this.ITrustedWebActivityCallback$Default, create8));
        this.ITrustedWebActivityCallback$Stub = min8;
        this.getSmallIconId = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.cancelNotification = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        length length3 = new length(r6);
        this.getSmallIconBitmap = length3;
        this.getActiveNotifications = GriverOpenAuthExtension.create(length3);
        this.notifyNotificationWithChannel = BLEManager.AnonymousClass2.create(this.toIntRange, this.toDoubleRange, this.valueOf);
        this.INotificationSideChannel = GriverDialogExtension.create(this.toIntRange, this.toDoubleRange, this.getSmallIconBitmap);
        this.ITrustedWebActivityService$Stub = checkSuffixSupported.create(this.invokeSuspend);
        this.ITrustedWebActivityService$Default = isImage.create(this.invokeSuspend);
        getFillColor max3 = getFillColor.setMax(this.cancelNotification, startListenScreenshot.setMin(), this.getActiveNotifications, this.notifyNotificationWithChannel, this.INotificationSideChannel, this.ITrustedWebActivityService$Stub, this.ITrustedWebActivityService$Default);
        this.ITrustedWebActivityService$Stub$Proxy = max3;
        this.notify = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max3));
        this.cancel = BindFont.length(servicesModule);
        getCause getcause = new getCause(r6);
        this.INotificationSideChannel$Stub$Proxy = getcause;
        this.cancelAll = onStartBleScan.create(this.toIntRange, this.toDoubleRange, getcause);
        this.INotificationSideChannel$Stub = onGetBluetoothCharacteristics.create(this.toIntRange, this.toDoubleRange, this.INotificationSideChannel$Stub$Proxy);
        isInside isinside = new isInside(r6);
        this.INotificationSideChannel$Default = isinside;
        this.read = matchesBeacon.create(this.receiveFile, isinside);
        this.RemoteActionCompatParcelizer = validateMac.create(this.toIntRange, this.toDoubleRange, this.receiveFile);
        this.write = IntentHandler.create(this.toIntRange, this.toDoubleRange, this.receiveFile, this.INotificationSideChannel$Default);
        this.MediaBrowserCompat$CustomActionResultReceiver = toUuid.create(this.invokeSuspend);
        this.IconCompatParcelizer = didDetermineStateForRegion.create(this.receiveFile);
        create create9 = new create(r6);
        this.MediaDescriptionCompat = create9;
        this.MediaBrowserCompat$ItemReceiver = BLEManager.AnonymousClass3.create(create9);
        BLEManager.AnonymousClass4 create10 = BLEManager.AnonymousClass4.create(this.MediaDescriptionCompat);
        this.MediaBrowserCompat$MediaItem$Flags = create10;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.toFloatRange, this.cancel, this.IPostMessageService$Stub$Proxy, this.ITrustedWebActivityCallback, this.cancelAll, this.INotificationSideChannel$Stub, this.read, this.RemoteActionCompatParcelizer, this.onExtraCallback, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, create10));
        this.MediaBrowserCompat$SearchResultReceiver = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.b, this.extraCallbackWithResult, this.getSmallIconId, this.notify, min9));
        this.MediaBrowserCompat$MediaItem = min10;
        this.MediaMetadataCompat$TextKey = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        getMin getmin = new getMin(r29);
        this.MediaMetadataCompat = getmin;
        this.MediaMetadataCompat$RatingKey = APWebMessagePort.APWebMessageCallback.create(this.toIntRange, this.toDoubleRange, getmin);
        this.MediaMetadataCompat$LongKey = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create11 = GVLoadingView.create(this.toIntRange, this.toDoubleRange, this.getSmallIconBitmap);
        this.MediaMetadataCompat$BitmapKey = create11;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaMetadataCompat$TextKey, this.MediaMetadataCompat$RatingKey, this.MediaMetadataCompat$LongKey, create11));
        this.RatingCompat$Style = min11;
        this.onEvent = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class setMax {
        public ScanQrModule getMax;
        public GlobalSearchBottomSheetModule getMin;
        public ServicesModule isInside;
        public DeepLinkModule length;
        public FeatureModule setMax;
        public RestoreUrlModule setMin;
        public PrepareException.AnonymousClass1 toFloatRange;
        public OauthModule toIntRange;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class toString implements b.C0007b<setStorageProxy> {
        private final PrepareException.AnonymousClass1 setMin;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setStorageProxy areNotificationsEnabled = this.setMin.areNotificationsEnabled();
            if (areNotificationsEnabled != null) {
                return areNotificationsEnabled;
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

    static class hashCode implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMin;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class invoke implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 getMin;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class values implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 getMin;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setMediaPlaybackRequiresUserGesture IPostMessageService$Stub = this.setMin.IPostMessageService$Stub();
            if (IPostMessageService$Stub != null) {
                return IPostMessageService$Stub;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 getMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.getMax.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 getMax;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class invokeSuspend implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 setMax;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 setMax;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            enableBackButton invoke = this.setMax.invoke();
            if (invoke != null) {
                return invoke;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 getMax;

        getCause(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 setMin;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            onWebViewDestory MediaMetadataCompat$LongKey = this.setMin.MediaMetadataCompat$LongKey();
            if (MediaMetadataCompat$LongKey != null) {
                return MediaMetadataCompat$LongKey;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class create implements b.C0007b<onCharacteristicChanged> {
        private final PrepareException.AnonymousClass1 getMin;

        create(PrepareException.AnonymousClass1 r1) {
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

    public final void setMax(GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog) {
        GriverManifest.AnonymousClass10.getMin(globalSearchBottomSheetDialog, this.length.get());
        GriverManifest.AnonymousClass10.getMax(globalSearchBottomSheetDialog, this.onEvent.get());
        GriverManifest.AnonymousClass10.getMin(globalSearchBottomSheetDialog, this.b.get());
    }
}
