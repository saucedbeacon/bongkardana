package o;

import android.app.Activity;
import android.content.Context;
import dagger.Component;
import dagger.internal.InjectedFieldSignature;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.OauthModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.miniprogram.provider.OauthServiceProvider;
import id.dana.miniprogram.tnc.MissingRequiredUserInfoDialogActivity;
import id.dana.miniprogram.tnc.TncMiniProgramDialogActivity;
import kotlin.Metadata;
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
import o.onNext;
import o.style;
import org.jetbrains.annotations.NotNull;

public final class GriverUniformPromptExtension implements AnonymousClass3 {
    private b.C0007b<setDataRequestNotifier> FastBitmap$CoordinateSystem;
    private b.C0007b<R.id.getMax> Grayscale$Algorithm;
    private b.C0007b<DataProviderException> ICustomTabsCallback;
    private b.C0007b<onJsBeforeUnload> ICustomTabsCallback$Default;
    private b.C0007b<getAppPerfKey> ICustomTabsCallback$Stub;
    private b.C0007b<updateFootState> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<setInitTextColor> ICustomTabsService;
    private b.C0007b<parseBatteryPercentage> ICustomTabsService$Default;
    private b.C0007b<OrientationDetector.OrientationListener> ICustomTabsService$Stub;
    private b.C0007b<toUuidString> ICustomTabsService$Stub$Proxy;
    private b.C0007b<onCharacteristicWriteCompleted> INotificationSideChannel;
    private b.C0007b<convertIntentsToCallbacks> INotificationSideChannel$Default;
    private b.C0007b<toByteArray> INotificationSideChannel$Stub;
    private b.C0007b<Region$1> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<getUniqueId> IPostMessageService;
    private b.C0007b<getAllInstallFiles> IPostMessageService$Default;
    private b.C0007b<setEpicenterCallback> IPostMessageService$Stub;
    private b.C0007b<APWebSettings.LayoutAlgorithm> IPostMessageService$Stub$Proxy;
    private b.C0007b<getBlockNetworkImage> ITrustedWebActivityCallback;
    private b.C0007b<shouldShowRevokeOpenAuthItem> ITrustedWebActivityCallback$Default;
    private b.C0007b<getRunningAnimators.setMax> ITrustedWebActivityCallback$Stub;
    private b.C0007b<getTargets> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityService;
    private b.C0007b<onDisconnect> ITrustedWebActivityService$Default;
    private b.C0007b<style.getMin> ITrustedWebActivityService$Stub;
    private b.C0007b<onAnimationEnd.length> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<onCharacteristicChanged> IconCompatParcelizer;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> IsOverlapping;
    private b.C0007b<R.styleable> Mean$Arithmetic;
    private b.C0007b<BindInt> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<setSupportZoom> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> MediaBrowserCompat$MediaItem;
    private b.C0007b<onMessage> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<getPath> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<AutoTransition.setMax> MediaDescriptionCompat;
    private b.C0007b<GriverCreateDialogParam> MediaMetadataCompat;
    private b.C0007b<getDuration.length> MediaMetadataCompat$RatingKey;
    private b.C0007b<setStartDelay> MediaMetadataCompat$TextKey;
    private b.C0007b<didExitRegion> RemoteActionCompatParcelizer;
    private b.C0007b<getCommonResources> areNotificationsEnabled;
    private b.C0007b<H5Utils> asBinder;
    private b.C0007b<addChooseImageCrossOrigin> asInterface;
    private b.C0007b<BindView.setMax> b;
    private b.C0007b<onWebViewDestory> cancel;
    private b.C0007b<hasSameIdentifiers> cancelAll;
    private b.C0007b<getPlatformCallback> cancelNotification;
    private b.C0007b<AndroidModel> create;
    private b.C0007b<ResourceProviderExtension> equals;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> extraCallback;
    private b.C0007b<setPageCacheCapacity> extraCallbackWithResult;
    private b.C0007b<setNetworkAvailable> extraCommand;
    private b.C0007b<GriverCreatePromptParam> getActiveNotifications;
    private b.C0007b<BindView.setMin> getCause;
    private b.C0007b<setSceneRoot> getDefaultImpl;
    private b.C0007b<getScanJobRuntimeMillis> getInterfaceDescriptor;
    private b.C0007b<Context> getMax;
    private b.C0007b<R.id.length> getMin;
    private b.C0007b<checkBitmap> getSmallIconBitmap;
    private b.C0007b<KitUtils> getSmallIconId;
    private b.C0007b<getTinyLocalStorageInfo> hashCode;
    private b.C0007b<OnItemLongClick> invoke;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> invokeSuspend;
    private b.C0007b<getScheme> isInside;
    private b.C0007b<Activity> length;
    private b.C0007b<canGoBackOrForward> mayLaunchUrl;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> newSession;
    private b.C0007b<queryAppInfo> newSessionWithExtras;
    private b.C0007b<onConnect> notify;
    private b.C0007b<notifyCharacteristicValue> notifyNotificationWithChannel;
    private b.C0007b<GetAuthCode> onExtraCallback;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> onMessageChannelReady;
    private b.C0007b<OnFocusChange> onNavigationEvent;
    private b.C0007b<MovableFrameLayout> onPostMessage;
    private b.C0007b<setBackButton> onRelationshipValidationResult;
    private b.C0007b<getEpicenter> onTransact;
    private b.C0007b<isTransitionRequired> postMessage;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> read;
    private b.C0007b<enableBackButton> receiveFile;
    private b.C0007b<getMode> requestPostMessageChannel;
    private b.C0007b<getTransitionValues> requestPostMessageChannelWithExtras;
    private b.C0007b<applySettingsToScheduledJob> setDefaultImpl;
    private final PrepareException.AnonymousClass1 setMax;
    private b.C0007b<method> setMin;
    private b.C0007b<setDefaultFontSize> toDoubleRange;
    private b.C0007b<appxLoadFailed> toFloatRange;
    private b.C0007b<GriverPrepareInterceptor> toIntRange;
    private b.C0007b<onDescriptorWrite> toString;
    private b.C0007b<getRunningAnimators.getMin> updateVisuals;
    private b.C0007b<getCancelable> validateRelationship;
    private b.C0007b<requestAppWithAppId> valueOf;
    private b.C0007b<getPerformanceTracker> values;
    private b.C0007b<getPropagation> warmup;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> write;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/miniprogram/di/MissingRequiredUserInfoComponent;", "", "inject", "", "activity", "Lid/dana/miniprogram/tnc/MissingRequiredUserInfoDialogActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DeepLinkModule.class})
    /* renamed from: o.GriverUniformPromptExtension$3  reason: invalid class name */
    public interface AnonymousClass3 {
        void setMax(@NotNull MissingRequiredUserInfoDialogActivity missingRequiredUserInfoDialogActivity);
    }

    /* renamed from: o.GriverUniformPromptExtension$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<OauthServiceProvider> {
        @InjectedFieldSignature("id.dana.miniprogram.provider.OauthServiceProvider.miniProgramPreference")
        public static void getMax(OauthServiceProvider oauthServiceProvider, setExitPerform setexitperform) {
            oauthServiceProvider.miniProgramPreference = setexitperform;
        }

        @InjectedFieldSignature("id.dana.miniprogram.provider.OauthServiceProvider.remoteGnPaymentEntityData")
        public static void setMin(OauthServiceProvider oauthServiceProvider, DefaultEmbedViewManager defaultEmbedViewManager) {
            oauthServiceProvider.remoteGnPaymentEntityData = defaultEmbedViewManager;
        }
    }

    /* renamed from: o.GriverUniformPromptExtension$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<TncMiniProgramDialogActivity> {
        @InjectedFieldSignature("id.dana.miniprogram.tnc.TncMiniProgramDialogActivity.presenter")
        public static void length(TncMiniProgramDialogActivity tncMiniProgramDialogActivity, onNext.setMin setmin) {
            tncMiniProgramDialogActivity.presenter = setmin;
        }
    }

    public /* synthetic */ GriverUniformPromptExtension(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r7, byte b2) {
        this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, r7);
    }

    private GriverUniformPromptExtension(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, PrepareException.AnonymousClass1 r28) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r28;
        this.setMax = r6;
        this.getMax = new setMin(r6);
        b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.length = min;
        b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
        this.setMin = min2;
        this.getMin = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
        this.toFloatRange = new valueOf(r6);
        this.isInside = new toDoubleRange(r6);
        toString tostring = new toString(r6);
        this.toIntRange = tostring;
        this.equals = GriverPrepareInterceptor.AnonymousClass2.create(this.toFloatRange, this.isInside, tostring);
        this.IsOverlapping = beforeQuery.create(this.toFloatRange, this.isInside, this.toIntRange);
        this.hashCode = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.values = new toFloatRange(r6);
        toIntRange tointrange = new toIntRange(r6);
        this.toDoubleRange = tointrange;
        this.FastBitmap$CoordinateSystem = getDataRequestNotifier.create(tointrange);
        getCause getcause = new getCause(r6);
        this.toString = getcause;
        this.invokeSuspend = onCharacteristicWrite.create(getcause, this.toFloatRange, this.isInside);
        localIdToBytes create2 = localIdToBytes.create(this.toIntRange);
        this.valueOf = create2;
        b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.getMax, this.getMin, this.equals, this.IsOverlapping, this.hashCode, this.values, this.FastBitmap$CoordinateSystem, this.invokeSuspend, create2));
        this.Mean$Arithmetic = min3;
        this.Grayscale$Algorithm = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
        b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.invoke = min4;
        this.b = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.create = invokesuspend;
        NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.toFloatRange, this.isInside, invokesuspend);
        this.ICustomTabsCallback = create3;
        b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.b, create3));
        this.onNavigationEvent = min5;
        this.getCause = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
        hashCode hashcode = new hashCode(r6);
        this.onMessageChannelReady = hashcode;
        this.onPostMessage = GriverBizManifest.create(this.toFloatRange, this.isInside, hashcode);
        this.extraCallbackWithResult = APWebSettings.PluginState.create(this.toDoubleRange);
        this.onRelationshipValidationResult = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.extraCallback = isOverlapping;
        this.ICustomTabsCallback$Default = onConsoleMessage.create(this.toFloatRange, this.isInside, isOverlapping);
        invoke invoke2 = new invoke(r6);
        this.asBinder = invoke2;
        this.asInterface = H5ResourceCORSUtil.AnonymousClass1.create(this.toFloatRange, this.isInside, invoke2);
        equals equals2 = new equals(r6);
        this.ICustomTabsCallback$Stub = equals2;
        this.onTransact = capturePropagationValues.getMin(this.asInterface, equals2);
        GriverUniformPromptExtension$Mean$Arithmetic griverUniformPromptExtension$Mean$Arithmetic = new GriverUniformPromptExtension$Mean$Arithmetic(r6);
        this.getInterfaceDescriptor = griverUniformPromptExtension$Mean$Arithmetic;
        this.setDefaultImpl = ScanState.create(this.toFloatRange, this.isInside, griverUniformPromptExtension$Mean$Arithmetic);
        this.ICustomTabsService = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.ICustomTabsService);
        this.ICustomTabsCallback$Stub$Proxy = length2;
        this.getDefaultImpl = Transition.MatchOrder.length(this.setDefaultImpl, length2);
        this.mayLaunchUrl = setInitialScale.create(this.toFloatRange, this.isInside, this.toDoubleRange);
        postUrl create4 = postUrl.create(this.toFloatRange, this.isInside, this.toDoubleRange);
        this.extraCommand = create4;
        this.warmup = getName.setMin(this.mayLaunchUrl, create4, manuallyReleaseCamera.setMax());
        values values2 = new values(r6);
        this.newSession = values2;
        saveAppInfos create5 = saveAppInfos.create(values2);
        this.newSessionWithExtras = create5;
        this.requestPostMessageChannelWithExtras = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
        this.postMessage = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.getMax));
        this.validateRelationship = min6;
        b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.onPostMessage, this.extraCallbackWithResult, this.onRelationshipValidationResult, this.ICustomTabsCallback$Default, this.onTransact, this.getDefaultImpl, this.warmup, this.requestPostMessageChannelWithExtras, this.postMessage, min6, this.FastBitmap$CoordinateSystem));
        this.requestPostMessageChannel = min7;
        this.updateVisuals = isScrap.getMin(setDuration.getMax(featureModule2, min7));
        GriverUniformPromptExtension$FastBitmap$CoordinateSystem griverUniformPromptExtension$FastBitmap$CoordinateSystem = new GriverUniformPromptExtension$FastBitmap$CoordinateSystem(r6);
        this.ICustomTabsService$Stub$Proxy = griverUniformPromptExtension$FastBitmap$CoordinateSystem;
        this.IPostMessageService = didRangeBeaconsInRegion.create(this.toFloatRange, this.isInside, griverUniformPromptExtension$FastBitmap$CoordinateSystem);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.getMax);
        this.ICustomTabsService$Stub = max;
        this.ICustomTabsService$Default = getSystemInfo.setMax(max);
        getMax getmax = new getMax(r6);
        this.receiveFile = getmax;
        setOptionMenu create6 = setOptionMenu.create(getmax);
        this.onExtraCallback = create6;
        this.IPostMessageService$Stub = isScrap.getMin(setPropagation.length(this.updateVisuals, this.IPostMessageService, this.ICustomTabsService$Default, create6, this.values));
        this.ITrustedWebActivityCallback = getLoadsImagesAutomatically.create(this.toFloatRange, this.isInside, this.toDoubleRange);
        this.IPostMessageService$Stub$Proxy = setWebContentsDebuggingEnabled.create(this.toDoubleRange);
        installPathExist create7 = installPathExist.create(this.toDoubleRange);
        this.IPostMessageService$Default = create7;
        b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.updateVisuals, this.IPostMessageService$Stub, this.ITrustedWebActivityCallback, this.IPostMessageService$Stub$Proxy, create7));
        this.ITrustedWebActivityCallback$Stub$Proxy = min8;
        this.ITrustedWebActivityCallback$Stub = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
        this.ITrustedWebActivityService = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        setMax setmax = new setMax(r6);
        this.areNotificationsEnabled = setmax;
        this.ITrustedWebActivityCallback$Default = GriverOpenAuthExtension.create(setmax);
        this.notifyNotificationWithChannel = BLEManager.AnonymousClass2.create(this.toFloatRange, this.isInside, this.toString);
        this.getActiveNotifications = GriverDialogExtension.create(this.toFloatRange, this.isInside, this.areNotificationsEnabled);
        this.getSmallIconId = checkSuffixSupported.create(this.toDoubleRange);
        this.getSmallIconBitmap = isImage.create(this.toDoubleRange);
        getFillColor max2 = getFillColor.setMax(this.ITrustedWebActivityService, startListenScreenshot.setMin(), this.ITrustedWebActivityCallback$Default, this.notifyNotificationWithChannel, this.getActiveNotifications, this.getSmallIconId, this.getSmallIconBitmap);
        this.cancelNotification = max2;
        this.ITrustedWebActivityService$Stub$Proxy = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max2));
        this.ITrustedWebActivityService$Stub = BindFont.length(servicesModule);
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.ITrustedWebActivityService$Default = iCustomTabsCallback;
        this.INotificationSideChannel = onStartBleScan.create(this.toFloatRange, this.isInside, iCustomTabsCallback);
        this.notify = onGetBluetoothCharacteristics.create(this.toFloatRange, this.isInside, this.ITrustedWebActivityService$Default);
        isInside isinside = new isInside(r6);
        this.cancel = isinside;
        this.cancelAll = matchesBeacon.create(this.ICustomTabsService$Stub$Proxy, isinside);
        this.INotificationSideChannel$Stub$Proxy = validateMac.create(this.toFloatRange, this.isInside, this.ICustomTabsService$Stub$Proxy);
        this.INotificationSideChannel$Default = IntentHandler.create(this.toFloatRange, this.isInside, this.ICustomTabsService$Stub$Proxy, this.cancel);
        this.INotificationSideChannel$Stub = toUuid.create(this.toDoubleRange);
        this.RemoteActionCompatParcelizer = didDetermineStateForRegion.create(this.ICustomTabsService$Stub$Proxy);
        GriverUniformPromptExtension$Grayscale$Algorithm griverUniformPromptExtension$Grayscale$Algorithm = new GriverUniformPromptExtension$Grayscale$Algorithm(r6);
        this.IconCompatParcelizer = griverUniformPromptExtension$Grayscale$Algorithm;
        this.read = BLEManager.AnonymousClass3.create(griverUniformPromptExtension$Grayscale$Algorithm);
        BLEManager.AnonymousClass4 create8 = BLEManager.AnonymousClass4.create(this.IconCompatParcelizer);
        this.write = create8;
        b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.getMax, this.ITrustedWebActivityService$Stub, this.onExtraCallback, this.ICustomTabsService$Default, this.INotificationSideChannel, this.notify, this.cancelAll, this.INotificationSideChannel$Stub$Proxy, this.IPostMessageService, this.INotificationSideChannel$Default, this.INotificationSideChannel$Stub, this.RemoteActionCompatParcelizer, this.read, create8));
        this.MediaBrowserCompat$CustomActionResultReceiver = min9;
        b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.Grayscale$Algorithm, this.getCause, this.ITrustedWebActivityCallback$Stub, this.ITrustedWebActivityService$Stub$Proxy, min9));
        this.MediaBrowserCompat$SearchResultReceiver = min10;
        this.MediaDescriptionCompat = isScrap.getMin(Fade.setMin(deepLinkModule2, min10));
        length length3 = new length(r28);
        this.MediaBrowserCompat$ItemReceiver = length3;
        this.MediaBrowserCompat$MediaItem$Flags = APWebMessagePort.APWebMessageCallback.create(this.toFloatRange, this.isInside, length3);
        this.MediaBrowserCompat$MediaItem = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create9 = GVLoadingView.create(this.toFloatRange, this.isInside, this.areNotificationsEnabled);
        this.MediaMetadataCompat = create9;
        b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.MediaDescriptionCompat, this.MediaBrowserCompat$MediaItem$Flags, this.MediaBrowserCompat$MediaItem, create9));
        this.MediaMetadataCompat$TextKey = min11;
        this.MediaMetadataCompat$RatingKey = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min11));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 IsOverlapping;
        public ServicesModule equals;
        public FeatureModule getMax;
        public ScanQrModule getMin;
        public DeepLinkModule length;
        public OauthModule setMax;
        public RestoreUrlModule setMin;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
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

    static class valueOf implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMax;

        valueOf(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 setMax;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class getCause implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMax;

        getCause(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
        private final PrepareException.AnonymousClass1 setMin;

        hashCode(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.setMin.ICustomTabsService();
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

    static class invoke implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 setMax;

        invoke(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            H5Utils activeNotifications = this.setMax.getActiveNotifications();
            if (activeNotifications != null) {
                return activeNotifications;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class equals implements b.C0007b<getAppPerfKey> {
        private final PrepareException.AnonymousClass1 length;

        equals(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getAppPerfKey ICustomTabsService$Stub$Proxy = this.length.ICustomTabsService$Stub$Proxy();
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

    static class setMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMin;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<onDisconnect> {
        private final PrepareException.AnonymousClass1 setMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<setSupportZoom> {
        private final PrepareException.AnonymousClass1 getMax;

        length(PrepareException.AnonymousClass1 r1) {
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

    public final void setMax(MissingRequiredUserInfoDialogActivity missingRequiredUserInfoDialogActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.setMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(missingRequiredUserInfoDialogActivity, IPostMessageService$Stub$Proxy2);
            applyChanges ICustomTabsCallback$Stub2 = this.setMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub2 != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub2;
                appxLoadFailed length2 = this.setMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.setMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals2 = this.setMax.updateVisuals();
                        if (updateVisuals2 != null) {
                            matchInfo.length(missingRequiredUserInfoDialogActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            EmbedWebViewBridgeExtension.setMax(missingRequiredUserInfoDialogActivity, this.MediaMetadataCompat$RatingKey.get());
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
}
