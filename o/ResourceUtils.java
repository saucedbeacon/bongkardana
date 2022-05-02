package o;

import android.app.Activity;
import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.bank.BottomSheetBankListActivity;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.FeatureModule;
import id.dana.contract.services.ServicesModule;
import id.dana.contract.shortener.RestoreUrlModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.modules.BillerX2BModule;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.OauthModule;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.ReferralTrackerModule;
import id.dana.di.modules.RequestMoneyBankListModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.referral.MyReferralDetailActivity;
import id.dana.sendmoney.RecipientActivity;
import o.APWebMessagePort;
import o.APWebSettings;
import o.AutoTransition;
import o.BLEManager;
import o.BindView;
import o.ConstraintProxy$StorageNotLowProxy;
import o.CycledLeScannerForJellyBeanMr2;
import o.GriverAMCSAppUpdater;
import o.GriverBottomPopupDialog;
import o.GriverBridgeCallNotFoundEvent;
import o.GriverPrepareInterceptor;
import o.H5ResourceCORSUtil;
import o.IMultiInstanceInvalidationService;
import o.IWorkManagerImplCallback;
import o.LocationBridgeExtension;
import o.OnPageChange;
import o.OpenAPIBridgeExtension;
import o.OrientationDetector;
import o.PrepareException;
import o.R;
import o.SessionBridgeExtension;
import o.Transition;
import o.b;
import o.enqueueWorkRequests;
import o.getDuration;
import o.getRunningAnimators;
import o.getSelectedIndex;
import o.onAnimationEnd;
import o.primaryKeys;
import o.style;

public final class ResourceUtils implements JSONArray {
    private b.C0007b<setH5ErrorPage> FastBitmap$CoordinateSystem;
    private b.C0007b<setManifestCheckingDisabled> Grayscale$Algorithm;
    private b.C0007b<getPerformanceTracker> ICustomTabsCallback;
    private b.C0007b<Context> ICustomTabsCallback$Default;
    private b.C0007b<GriverPrepareInterceptor> ICustomTabsCallback$Stub;
    private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<getTinyLocalStorageInfo> ICustomTabsService;
    private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> ICustomTabsService$Default;
    private b.C0007b<setBackButton> ICustomTabsService$Stub;
    private b.C0007b<MovableFrameLayout> ICustomTabsService$Stub$Proxy;
    private b.C0007b<Region$1> IMediaControllerCallback;
    private b.C0007b<onMessage> IMediaControllerCallback$Stub;
    private b.C0007b<getDuration.length> IMediaControllerCallback$Stub$Proxy;
    private b.C0007b<LocationBridgeExtension.AnonymousClass2> IMediaSession;
    private b.C0007b<getRunningAnimators.getMin> INotificationSideChannel;
    private b.C0007b<parseBatteryPercentage> INotificationSideChannel$Default;
    private b.C0007b<getUniqueId> INotificationSideChannel$Stub;
    private b.C0007b<setEpicenterCallback> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<setMediaPlaybackRequiresUserGesture> IPostMessageService;
    private b.C0007b<H5Utils> IPostMessageService$Default;
    private b.C0007b<getAppPerfKey> IPostMessageService$Stub;
    private b.C0007b<getEpicenter> IPostMessageService$Stub$Proxy;
    private b.C0007b<onJsBeforeUnload> ITrustedWebActivityCallback;
    private b.C0007b<applySettingsToScheduledJob> ITrustedWebActivityCallback$Default;
    private b.C0007b<setSceneRoot> ITrustedWebActivityCallback$Stub;
    private b.C0007b<setInitTextColor> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<getScanJobRuntimeMillis> ITrustedWebActivityService;
    private b.C0007b<isTransitionRequired> ITrustedWebActivityService$Default;
    private b.C0007b<getTransitionValues> ITrustedWebActivityService$Stub;
    private b.C0007b<getCancelable> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<getBlockNetworkImage> IconCompatParcelizer;
    private b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> IsOverlapping;
    private b.C0007b<enableBackButton> Mean$Arithmetic;
    private b.C0007b<APWebSettings.LayoutAlgorithm> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<notifyCharacteristicValue> MediaBrowserCompat$ItemReceiver;
    private b.C0007b<GriverCreatePromptParam> MediaBrowserCompat$MediaItem;
    private b.C0007b<getCommonResources> MediaBrowserCompat$MediaItem$Flags;
    private b.C0007b<onAnimationEnd.getMin> MediaBrowserCompat$SearchResultReceiver;
    private b.C0007b<shouldShowRevokeOpenAuthItem> MediaDescriptionCompat;
    private b.C0007b<getPlatformCallback> MediaMetadataCompat;
    private b.C0007b<checkBitmap> MediaMetadataCompat$BitmapKey;
    private b.C0007b<onAnimationEnd.length> MediaMetadataCompat$LongKey;
    private b.C0007b<style.getMin> MediaMetadataCompat$RatingKey;
    private b.C0007b<KitUtils> MediaMetadataCompat$TextKey;
    private b.C0007b<onConnect> RatingCompat;
    private b.C0007b<onCharacteristicWriteCompleted> RatingCompat$StarStyle;
    private b.C0007b<onWebViewDestory> RatingCompat$Style;
    private b.C0007b<getRunningAnimators.setMax> RemoteActionCompatParcelizer;
    private b.C0007b<updateFootState> areNotificationsEnabled;
    private b.C0007b<Activity> asBinder;
    private b.C0007b<R.id.length> asInterface;
    private b.C0007b<IWorkManagerImplCallback.Default> b;
    private b.C0007b<OrientationDetector.OrientationListener> cancel;
    private b.C0007b<toUuidString> cancelAll;
    private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> cancelNotification;
    private b.C0007b<getSelectedIndex.setMax> create;
    private b.C0007b<BluetoothManifest> equals;
    private b.C0007b<setOnOptionPickListener> extraCallback;
    private b.C0007b<BLETraceMonitor> extraCallbackWithResult;
    private b.C0007b<requestAppWithAppId> extraCommand;
    private b.C0007b<queryAppInfo> getActiveNotifications;
    private b.C0007b<GetAuthCode> getCause;
    private b.C0007b<onDescriptorWrite> getDefaultImpl;
    private b.C0007b<ResourceProviderExtension> getInterfaceDescriptor;
    private b.C0007b<appxLoadFailed> getMax;
    private b.C0007b<setDefaultFontSize> getMin;
    private b.C0007b<canGoBackOrForward> getSmallIconBitmap;
    private b.C0007b<getPropagation> getSmallIconId;
    private b.C0007b<enqueueWorkRequests.length> hashCode;
    private b.C0007b<addRangeNotifier> invoke;
    private b.C0007b<setBeaconSimulator> invokeSuspend;
    private b.C0007b<ResourceDownloadType> isInside;
    private b.C0007b<enqueueWorkRequests.setMax> length;
    private b.C0007b<OnItemLongClick> mayLaunchUrl;
    private b.C0007b<R.styleable> newSession;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> newSessionWithExtras;
    private b.C0007b<getMode> notify;
    private b.C0007b<setNetworkAvailable> notifyNotificationWithChannel;
    private b.C0007b<BindInt> onCaptioningEnabledChanged;
    private b.C0007b<hasSameIdentifiers> onEvent;
    private b.C0007b<addChooseImageCrossOrigin> onExtraCallback;
    private b.C0007b<getPath> onExtrasChanged;
    private b.C0007b<onStopBleScan> onMessageChannelReady;
    private b.C0007b<convertIntentsToCallbacks> onMetadataChanged;
    private b.C0007b<IWorkManagerImplCallback.Stub.Proxy.getMin> onNavigationEvent;
    private b.C0007b<BLEManager.AnonymousClass2.C00022> onPlaybackStateChanged;
    private b.C0007b<getSelectedIndex.length> onPostMessage;
    private b.C0007b<onCharacteristicChanged> onQueueChanged;
    private b.C0007b<didExitRegion> onQueueTitleChanged;
    private b.C0007b<onDisconnect> onRelationshipValidationResult;
    private b.C0007b<AutoTransition.setMax> onRepeatModeChanged;
    private b.C0007b<toByteArray> onSessionDestroyed;
    private b.C0007b<setStartDelay> onSessionReady;
    private b.C0007b<GriverCreateDialogParam> onShuffleModeChanged;
    private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> onShuffleModeChangedRemoved;
    private b.C0007b<method> onTransact;
    private b.C0007b<setSupportZoom> onVolumeInfoChanged;
    private b.C0007b<OnFocusChange> postMessage;
    private b.C0007b<getTargets> read;
    private b.C0007b<setPageCacheCapacity> receiveFile;
    private b.C0007b<AndroidModel> requestPostMessageChannel;
    private b.C0007b<BindView.setMin> requestPostMessageChannelWithExtras;
    private b.C0007b<setDataRequestNotifier> setDefaultImpl;
    private final PrepareException.AnonymousClass1 setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<cancelUniqueWork> toDoubleRange;
    private b.C0007b<getManifestCheckingDisabled> toFloatRange;
    private b.C0007b<GriverWhiteScreenStageMonitor> toIntRange;
    private b.C0007b<IWorkManagerImplCallback.Stub.Proxy.getMax> toString;
    private b.C0007b<BindView.setMax> updateVisuals;
    private b.C0007b<DataProviderException> validateRelationship;
    private b.C0007b<getBeaconSimulator> valueOf;
    private b.C0007b<fromInt> values;
    private b.C0007b<R.id.getMax> warmup;
    private b.C0007b<getAllInstallFiles> write;

    /* renamed from: o.ResourceUtils$2  reason: invalid class name */
    public final class AnonymousClass2 implements listIterator {
        private b.C0007b<primaryKeys.setMin> IsOverlapping;
        private b.C0007b<fromInt> equals;
        private final PrepareException.AnonymousClass1 getMax;
        private b.C0007b<getIdentifiers> getMin;
        private b.C0007b<getScheme> isInside;
        private b.C0007b<appxLoadFailed> length;
        private b.C0007b<primaryKeys.setMax> setMax;
        private b.C0007b<getId3> setMin;
        private b.C0007b<foreignKeys> toFloatRange;
        private b.C0007b<BleGattService> toIntRange;

        public /* synthetic */ AnonymousClass2(RequestMoneyBankListModule requestMoneyBankListModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(requestMoneyBankListModule, r2);
        }

        private AnonymousClass2(RequestMoneyBankListModule requestMoneyBankListModule, PrepareException.AnonymousClass1 r5) {
            this.getMax = r5;
            this.setMax = isScrap.getMin(pageStart.length(requestMoneyBankListModule));
            getMin getmin = new getMin(r5);
            this.setMin = getmin;
            this.getMin = getDistance.create(getmin);
            this.length = new setMin(r5);
            this.isInside = new getMax(r5);
            length length2 = new length(r5);
            this.equals = length2;
            createConnectedBleDevice create = createConnectedBleDevice.create(this.length, this.isInside, length2);
            this.toIntRange = create;
            insertAndReturnIdsArrayBox max = insertAndReturnIdsArrayBox.setMax(this.setMax, this.getMin, create, mediaBrowser.getMax());
            this.toFloatRange = max;
            this.IsOverlapping = isScrap.getMin(onFetchSuccess.setMax(requestMoneyBankListModule, max));
        }

        /* renamed from: o.ResourceUtils$2$setMax */
        public static final class setMax {
            public PrepareException.AnonymousClass1 setMax;
            public RequestMoneyBankListModule setMin;

            public /* synthetic */ setMax(byte b) {
                this();
            }

            private setMax() {
            }
        }

        /* renamed from: o.ResourceUtils$2$getMin */
        static class getMin implements b.C0007b<getId3> {
            private final PrepareException.AnonymousClass1 getMin;

            getMin(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                getId3 unregisterCallbackListener = this.getMin.unregisterCallbackListener();
                if (unregisterCallbackListener != null) {
                    return unregisterCallbackListener;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.ResourceUtils$2$setMin */
        static class setMin implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 setMax;

            setMin(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$2$getMax */
        static class getMax implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 getMin;

            getMax(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                getScheme min = this.getMin.getMin();
                if (min != null) {
                    return min;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.ResourceUtils$2$length */
        static class length implements b.C0007b<fromInt> {
            private final PrepareException.AnonymousClass1 getMax;

            length(PrepareException.AnonymousClass1 r1) {
                this.getMax = r1;
            }

            public final /* synthetic */ Object get() {
                fromInt onNavigationEvent = this.getMax.onNavigationEvent();
                if (onNavigationEvent != null) {
                    return onNavigationEvent;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void getMax(BottomSheetBankListActivity bottomSheetBankListActivity) {
            AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy != null) {
                matchInfo.setMin(bottomSheetBankListActivity, IPostMessageService$Stub$Proxy);
                applyChanges ICustomTabsCallback$Stub = this.getMax.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub;
                    appxLoadFailed length2 = this.getMax.length();
                    if (length2 != null) {
                        appxLoadFailed appxloadfailed = length2;
                        getScheme min = this.getMax.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                            if (updateVisuals != null) {
                                matchInfo.length(bottomSheetBankListActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                                tableName.setMax(bottomSheetBankListActivity, this.IsOverlapping.get());
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

    /* renamed from: o.ResourceUtils$1  reason: invalid class name */
    public final class AnonymousClass1 implements retainAll {
        private b.C0007b<Beacon> FastBitmap$CoordinateSystem;
        private b.C0007b<loadUrl> Grayscale$Algorithm;
        private b.C0007b<method> ICustomTabsCallback;
        private b.C0007b<requestAppWithAppId> ICustomTabsCallback$Default;
        private b.C0007b<onDescriptorWrite> ICustomTabsCallback$Stub;
        private b.C0007b<OnItemLongClick> ICustomTabsCallback$Stub$Proxy;
        private b.C0007b<BindView.setMax> ICustomTabsService;
        private b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> ICustomTabsService$Default;
        private b.C0007b<canGoBackOrForward> ICustomTabsService$Stub;
        private b.C0007b<setSceneRoot> ICustomTabsService$Stub$Proxy;
        private b.C0007b<setSupportZoom> IMediaControllerCallback;
        private b.C0007b<getTargets> INotificationSideChannel;
        private b.C0007b<GriverCreatePromptParam> INotificationSideChannel$Default;
        private b.C0007b<KitUtils> INotificationSideChannel$Stub;
        private b.C0007b<shouldShowRevokeOpenAuthItem> INotificationSideChannel$Stub$Proxy;
        private b.C0007b<getPropagation> IPostMessageService;
        private b.C0007b<getMode> IPostMessageService$Default;
        private b.C0007b<isTransitionRequired> IPostMessageService$Stub;
        private b.C0007b<getTransitionValues> IPostMessageService$Stub$Proxy;
        private b.C0007b<getCancelable> ITrustedWebActivityCallback;
        private b.C0007b<getRunningAnimators.getMin> ITrustedWebActivityCallback$Default;
        private b.C0007b<parseBatteryPercentage> ITrustedWebActivityCallback$Stub;
        private b.C0007b<OrientationDetector.OrientationListener> ITrustedWebActivityCallback$Stub$Proxy;
        private b.C0007b<toUuidString> ITrustedWebActivityService;
        private b.C0007b<getAllInstallFiles> ITrustedWebActivityService$Default;
        private b.C0007b<onAnimationEnd.getMin> ITrustedWebActivityService$Stub;
        private b.C0007b<getCommonResources> ITrustedWebActivityService$Stub$Proxy;
        private b.C0007b<style.getMin> IconCompatParcelizer;
        private b.C0007b<setBackButton> IsOverlapping;
        private b.C0007b<MovableFrameLayout> Mean$Arithmetic;
        private b.C0007b<getPlatformCallback> MediaBrowserCompat$CustomActionResultReceiver;
        private b.C0007b<onWebViewDestory> MediaBrowserCompat$ItemReceiver;
        private b.C0007b<convertIntentsToCallbacks> MediaBrowserCompat$MediaItem;
        private b.C0007b<onConnect> MediaBrowserCompat$MediaItem$Flags;
        private b.C0007b<hasSameIdentifiers> MediaBrowserCompat$SearchResultReceiver;
        private b.C0007b<Region$1> MediaDescriptionCompat;
        private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass3> MediaMetadataCompat;
        private b.C0007b<onCharacteristicChanged> MediaMetadataCompat$BitmapKey;
        private b.C0007b<didExitRegion> MediaMetadataCompat$LongKey;
        private b.C0007b<toByteArray> MediaMetadataCompat$RatingKey;
        private b.C0007b<BLEManager.AnonymousClass2.C00022> MediaMetadataCompat$TextKey;
        private b.C0007b<getPath> RatingCompat;
        private b.C0007b<AutoTransition.setMax> RatingCompat$StarStyle;
        private b.C0007b<BindInt> RatingCompat$Style;
        private b.C0007b<onDisconnect> RemoteActionCompatParcelizer;
        private b.C0007b<getUniqueId> areNotificationsEnabled;
        private b.C0007b<R.styleable> asBinder;
        private b.C0007b<R.id.getMax> asInterface;
        private b.C0007b<Context> b;
        private b.C0007b<notifyCharacteristicValue> cancel;
        private b.C0007b<checkBitmap> cancelAll;
        private b.C0007b<enableBackButton> cancelNotification;
        private b.C0007b<GriverPrepareInterceptor> create;
        private b.C0007b<setDefaultFontSize> equals;
        private b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> extraCallback;
        private b.C0007b<getTinyLocalStorageInfo> extraCallbackWithResult;
        private b.C0007b<H5Utils> extraCommand;
        private b.C0007b<getBlockNetworkImage> getActiveNotifications;
        private b.C0007b<Activity> getCause;
        private b.C0007b<OnFocusChange> getDefaultImpl;
        private b.C0007b<AndroidModel> getInterfaceDescriptor;
        private b.C0007b<getScheme> getMax;
        private b.C0007b<appxLoadFailed> getMin;
        private b.C0007b<APWebSettings.LayoutAlgorithm> getSmallIconBitmap;
        private b.C0007b<GetAuthCode> getSmallIconId;
        private b.C0007b<setMediaPlaybackRequiresUserGesture> hashCode;
        private b.C0007b<ConstraintProxy$NetworkStateProxy> invoke;
        private b.C0007b<ConstraintProxy$StorageNotLowProxy.setMin> invokeSuspend;
        private b.C0007b<getDefaultFontSize> isInside;
        private final PrepareException.AnonymousClass1 length;
        private b.C0007b<BindView.setMin> mayLaunchUrl;
        private b.C0007b<setPageCacheCapacity> newSession;
        private b.C0007b<getAppPerfKey> newSessionWithExtras;
        private b.C0007b<getRunningAnimators.setMax> notify;
        private b.C0007b<setEpicenterCallback> notifyNotificationWithChannel;
        private b.C0007b<onMessage> onEvent;
        private b.C0007b<queryAppInfo> onExtraCallback;
        private b.C0007b<ResourceProviderExtension> onMessageChannelReady;
        private b.C0007b<setStartDelay> onMetadataChanged;
        private b.C0007b<R.id.length> onNavigationEvent;
        private b.C0007b<GriverCreateDialogParam> onPlaybackStateChanged;
        private b.C0007b<setDataRequestNotifier> onPostMessage;
        private b.C0007b<getDuration.length> onQueueTitleChanged;
        private b.C0007b<getPerformanceTracker> onRelationshipValidationResult;
        private b.C0007b<LocationBridgeExtension.AnonymousClass2> onSessionDestroyed;
        private b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> onTransact;
        private b.C0007b<getScanJobRuntimeMillis> postMessage;
        private b.C0007b<onAnimationEnd.length> read;
        private b.C0007b<setNetworkAvailable> receiveFile;
        private b.C0007b<applySettingsToScheduledJob> requestPostMessageChannel;
        private b.C0007b<setInitTextColor> requestPostMessageChannelWithExtras;
        private b.C0007b<DataProviderException> setDefaultImpl;
        private b.C0007b<ConstraintProxy$StorageNotLowProxy.setMax> setMax;
        private b.C0007b<GriverBottomPopupDialog.AnonymousClass1> setMin;
        private b.C0007b<CycledLeScannerForJellyBeanMr2> toDoubleRange;
        private b.C0007b<executeGetAuthCode> toFloatRange;
        private b.C0007b<setDistinctPacketsDetectedPerScan> toIntRange;
        private b.C0007b<setMfgReserved> toString;
        private b.C0007b<getEpicenter> updateVisuals;
        private b.C0007b<updateFootState> validateRelationship;
        private b.C0007b<GriverBottomPopupDialog> valueOf;
        private b.C0007b<onJsBeforeUnload> values;
        private b.C0007b<addChooseImageCrossOrigin> warmup;
        private b.C0007b<onCharacteristicWriteCompleted> write;

        public /* synthetic */ AnonymousClass1(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, ReferralTrackerModule referralTrackerModule, PrepareException.AnonymousClass1 r8, byte b2) {
            this(deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, referralTrackerModule, r8);
        }

        private AnonymousClass1(DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, ReferralTrackerModule referralTrackerModule, PrepareException.AnonymousClass1 r29) {
            DeepLinkModule deepLinkModule2 = deepLinkModule;
            ScanQrModule scanQrModule2 = scanQrModule;
            RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
            FeatureModule featureModule2 = featureModule;
            OauthModule oauthModule2 = oauthModule;
            PrepareException.AnonymousClass1 r6 = r29;
            this.length = r6;
            this.setMax = isScrap.getMin(GriverMonitorConstants.getMin(referralTrackerModule));
            this.getMin = new b(r6);
            this.getMax = new hashCode(r6);
            ResourceUtils$1$FastBitmap$CoordinateSystem resourceUtils$1$FastBitmap$CoordinateSystem = new ResourceUtils$1$FastBitmap$CoordinateSystem(r6);
            this.setMin = resourceUtils$1$FastBitmap$CoordinateSystem;
            this.toFloatRange = WalletAPIUtils.create(this.getMin, this.getMax, resourceUtils$1$FastBitmap$CoordinateSystem);
            this.IsOverlapping = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
            toFloatRange tofloatrange = new toFloatRange(r6);
            this.equals = tofloatrange;
            this.isInside = setLoadsImagesAutomatically.create(this.getMin, this.getMax, tofloatrange);
            invokeSuspend invokesuspend = new invokeSuspend(r6);
            this.toIntRange = invokesuspend;
            this.toDoubleRange = CycledLeScannerForJellyBeanMr2.AnonymousClass4.create(this.getMin, this.getMax, invokesuspend);
            IsOverlapping isOverlapping = new IsOverlapping(r6);
            this.hashCode = isOverlapping;
            this.values = onConsoleMessage.create(this.getMin, this.getMax, isOverlapping);
            values values2 = new values(r6);
            this.toString = values2;
            this.FastBitmap$CoordinateSystem = getDistanceCalculator.create(this.getMin, this.getMax, values2);
            this.valueOf = GriverCheckBox.create(this.getMin, this.getMax, this.setMin);
            this.Mean$Arithmetic = GriverBizManifest.create(this.getMin, this.getMax, this.setMin);
            this.Grayscale$Algorithm = getHttpAuthUsernamePassword.create(this.equals);
            ConstraintProxyUpdateReceiver max = ConstraintProxyUpdateReceiver.getMax(this.setMax, clearTinyLocalStorage.getMin(), this.toFloatRange, this.IsOverlapping, this.isInside, this.toDoubleRange, this.values, this.FastBitmap$CoordinateSystem, this.valueOf, this.Mean$Arithmetic, this.Grayscale$Algorithm);
            this.invoke = max;
            this.invokeSuspend = isScrap.getMin(onFetchFailed.setMax(referralTrackerModule, max));
            this.b = new getMax(r6);
            b.C0007b<Activity> min = isScrap.getMin(R.attr.setMax(scanQrModule));
            this.getCause = min;
            b.C0007b<method> min2 = isScrap.getMin(type.getMax(min));
            this.ICustomTabsCallback = min2;
            this.onNavigationEvent = isScrap.getMin(R.integer.setMin(scanQrModule2, min2));
            toDoubleRange todoublerange = new toDoubleRange(r6);
            this.create = todoublerange;
            this.onMessageChannelReady = GriverPrepareInterceptor.AnonymousClass2.create(this.getMin, this.getMax, todoublerange);
            this.extraCallback = beforeQuery.create(this.getMin, this.getMax, this.create);
            this.extraCallbackWithResult = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
            this.onRelationshipValidationResult = new isInside(r6);
            this.onPostMessage = getDataRequestNotifier.create(this.equals);
            onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
            this.ICustomTabsCallback$Stub = onnavigationevent;
            this.onTransact = onCharacteristicWrite.create(onnavigationevent, this.getMin, this.getMax);
            localIdToBytes create2 = localIdToBytes.create(this.create);
            this.ICustomTabsCallback$Default = create2;
            b.C0007b<R.styleable> min3 = isScrap.getMin(Setter.length(this.b, this.onNavigationEvent, this.onMessageChannelReady, this.extraCallback, this.extraCallbackWithResult, this.onRelationshipValidationResult, this.onPostMessage, this.onTransact, create2));
            this.asBinder = min3;
            this.asInterface = isScrap.getMin(R.drawable.setMin(scanQrModule2, min3));
            b.C0007b<OnItemLongClick> min4 = isScrap.getMin(OnPageChange.Callback.setMax());
            this.ICustomTabsCallback$Stub$Proxy = min4;
            this.ICustomTabsService = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min4));
            ResourceUtils$1$Mean$Arithmetic resourceUtils$1$Mean$Arithmetic = new ResourceUtils$1$Mean$Arithmetic(r6);
            this.getInterfaceDescriptor = resourceUtils$1$Mean$Arithmetic;
            NullBeaconDataFactory create3 = NullBeaconDataFactory.create(this.getMin, this.getMax, resourceUtils$1$Mean$Arithmetic);
            this.setDefaultImpl = create3;
            b.C0007b<OnFocusChange> min5 = isScrap.getMin(OnEditorAction.getMin(this.ICustomTabsService, create3));
            this.getDefaultImpl = min5;
            this.mayLaunchUrl = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min5));
            this.newSession = APWebSettings.PluginState.create(this.equals);
            valueOf valueof = new valueOf(r6);
            this.extraCommand = valueof;
            this.warmup = H5ResourceCORSUtil.AnonymousClass1.create(this.getMin, this.getMax, valueof);
            equals equals2 = new equals(r6);
            this.newSessionWithExtras = equals2;
            this.updateVisuals = capturePropagationValues.getMin(this.warmup, equals2);
            ResourceUtils$1$Grayscale$Algorithm resourceUtils$1$Grayscale$Algorithm = new ResourceUtils$1$Grayscale$Algorithm(r6);
            this.postMessage = resourceUtils$1$Grayscale$Algorithm;
            this.requestPostMessageChannel = ScanState.create(this.getMin, this.getMax, resourceUtils$1$Grayscale$Algorithm);
            this.requestPostMessageChannelWithExtras = getTextWidth.length(AUCornerListView.getMax());
            AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.requestPostMessageChannelWithExtras);
            this.validateRelationship = length2;
            this.ICustomTabsService$Stub$Proxy = Transition.MatchOrder.length(this.requestPostMessageChannel, length2);
            this.ICustomTabsService$Stub = setInitialScale.create(this.getMin, this.getMax, this.equals);
            postUrl create4 = postUrl.create(this.getMin, this.getMax, this.equals);
            this.receiveFile = create4;
            this.IPostMessageService = getName.setMin(this.ICustomTabsService$Stub, create4, manuallyReleaseCamera.setMax());
            toString tostring = new toString(r6);
            this.ICustomTabsService$Default = tostring;
            saveAppInfos create5 = saveAppInfos.create(tostring);
            this.onExtraCallback = create5;
            this.IPostMessageService$Stub$Proxy = captureHierarchy.length(create5, OpenInBrowserBridgeExtension.setMax());
            this.IPostMessageService$Stub = isScrap.getMin(getPathMotion.setMin());
            b.C0007b<getCancelable> min6 = isScrap.getMin(getCancelOnTouchOutside.create(this.b));
            this.ITrustedWebActivityCallback = min6;
            b.C0007b<getMode> min7 = isScrap.getMin(onDisappear.length(this.Mean$Arithmetic, this.newSession, this.IsOverlapping, this.values, this.updateVisuals, this.ICustomTabsService$Stub$Proxy, this.IPostMessageService, this.IPostMessageService$Stub$Proxy, this.IPostMessageService$Stub, min6, this.onPostMessage));
            this.IPostMessageService$Default = min7;
            this.ITrustedWebActivityCallback$Default = isScrap.getMin(setDuration.getMax(featureModule2, min7));
            invoke invoke2 = new invoke(r6);
            this.ITrustedWebActivityService = invoke2;
            this.areNotificationsEnabled = didRangeBeaconsInRegion.create(this.getMin, this.getMax, invoke2);
            OrientationDetector.MySensorEventListener.AnonymousClass1 max2 = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.b);
            this.ITrustedWebActivityCallback$Stub$Proxy = max2;
            this.ITrustedWebActivityCallback$Stub = getSystemInfo.setMax(max2);
            setMin setmin = new setMin(r6);
            this.cancelNotification = setmin;
            setOptionMenu create6 = setOptionMenu.create(setmin);
            this.getSmallIconId = create6;
            this.notifyNotificationWithChannel = isScrap.getMin(setPropagation.length(this.ITrustedWebActivityCallback$Default, this.areNotificationsEnabled, this.ITrustedWebActivityCallback$Stub, create6, this.onRelationshipValidationResult));
            this.getActiveNotifications = getLoadsImagesAutomatically.create(this.getMin, this.getMax, this.equals);
            this.getSmallIconBitmap = setWebContentsDebuggingEnabled.create(this.equals);
            installPathExist create7 = installPathExist.create(this.equals);
            this.ITrustedWebActivityService$Default = create7;
            b.C0007b<getTargets> min8 = isScrap.getMin(addViewValues.length(this.ITrustedWebActivityCallback$Default, this.notifyNotificationWithChannel, this.getActiveNotifications, this.getSmallIconBitmap, create7));
            this.INotificationSideChannel = min8;
            this.notify = isScrap.getMin(parseMatchOrder.length(featureModule2, min8));
            OauthModule oauthModule3 = oauthModule;
            this.ITrustedWebActivityService$Stub = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule3, setTrimPathStart.length()));
            length length3 = new length(r6);
            this.ITrustedWebActivityService$Stub$Proxy = length3;
            this.INotificationSideChannel$Stub$Proxy = GriverOpenAuthExtension.create(length3);
            this.cancel = BLEManager.AnonymousClass2.create(this.getMin, this.getMax, this.ICustomTabsCallback$Stub);
            this.INotificationSideChannel$Default = GriverDialogExtension.create(this.getMin, this.getMax, this.ITrustedWebActivityService$Stub$Proxy);
            this.INotificationSideChannel$Stub = checkSuffixSupported.create(this.equals);
            this.cancelAll = isImage.create(this.equals);
            getFillColor max3 = getFillColor.setMax(this.ITrustedWebActivityService$Stub, startListenScreenshot.setMin(), this.INotificationSideChannel$Stub$Proxy, this.cancel, this.INotificationSideChannel$Default, this.INotificationSideChannel$Stub, this.cancelAll);
            this.MediaBrowserCompat$CustomActionResultReceiver = max3;
            this.read = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule3, max3));
            this.IconCompatParcelizer = BindFont.length(servicesModule);
            getCause getcause = new getCause(r6);
            this.RemoteActionCompatParcelizer = getcause;
            this.write = onStartBleScan.create(this.getMin, this.getMax, getcause);
            this.MediaBrowserCompat$MediaItem$Flags = onGetBluetoothCharacteristics.create(this.getMin, this.getMax, this.RemoteActionCompatParcelizer);
            toIntRange tointrange = new toIntRange(r6);
            this.MediaBrowserCompat$ItemReceiver = tointrange;
            this.MediaBrowserCompat$SearchResultReceiver = matchesBeacon.create(this.ITrustedWebActivityService, tointrange);
            this.MediaDescriptionCompat = validateMac.create(this.getMin, this.getMax, this.ITrustedWebActivityService);
            this.MediaBrowserCompat$MediaItem = IntentHandler.create(this.getMin, this.getMax, this.ITrustedWebActivityService, this.MediaBrowserCompat$ItemReceiver);
            this.MediaMetadataCompat$RatingKey = toUuid.create(this.equals);
            this.MediaMetadataCompat$LongKey = didDetermineStateForRegion.create(this.ITrustedWebActivityService);
            create create8 = new create(r6);
            this.MediaMetadataCompat$BitmapKey = create8;
            this.MediaMetadataCompat$TextKey = BLEManager.AnonymousClass3.create(create8);
            BLEManager.AnonymousClass4 create9 = BLEManager.AnonymousClass4.create(this.MediaMetadataCompat$BitmapKey);
            this.MediaMetadataCompat = create9;
            b.C0007b<BindInt> min9 = isScrap.getMin(OnCheckedChanged.length(this.b, this.IconCompatParcelizer, this.getSmallIconId, this.ITrustedWebActivityCallback$Stub, this.write, this.MediaBrowserCompat$MediaItem$Flags, this.MediaBrowserCompat$SearchResultReceiver, this.MediaDescriptionCompat, this.areNotificationsEnabled, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat$RatingKey, this.MediaMetadataCompat$LongKey, this.MediaMetadataCompat$TextKey, create9));
            this.RatingCompat$Style = min9;
            b.C0007b<getPath> min10 = isScrap.getMin(Slide.getMin(this.asInterface, this.mayLaunchUrl, this.notify, this.read, min9));
            this.RatingCompat = min10;
            DeepLinkModule deepLinkModule3 = deepLinkModule;
            this.RatingCompat$StarStyle = isScrap.getMin(Fade.setMin(deepLinkModule3, min10));
            getMin getmin = new getMin(r6);
            this.IMediaControllerCallback = getmin;
            this.onEvent = APWebMessagePort.APWebMessageCallback.create(this.getMin, this.getMax, getmin);
            this.onSessionDestroyed = onLocationChanged.setMin(startListenScreenshot.setMin());
            GVLoadingView create10 = GVLoadingView.create(this.getMin, this.getMax, this.ITrustedWebActivityService$Stub$Proxy);
            this.onPlaybackStateChanged = create10;
            b.C0007b<setStartDelay> min11 = isScrap.getMin(setInterpolator.setMin(this.RatingCompat$StarStyle, this.onEvent, this.onSessionDestroyed, create10));
            this.onMetadataChanged = min11;
            this.onQueueTitleChanged = isScrap.getMin(ChangeBounds.setMin(deepLinkModule3, min11));
        }

        /* renamed from: o.ResourceUtils$1$setMax */
        public static final class setMax {
            public PrepareException.AnonymousClass1 equals;
            public OauthModule getMax;
            public FeatureModule getMin;
            public ServicesModule isInside;
            public RestoreUrlModule length;
            public DeepLinkModule setMax;
            public ScanQrModule setMin;
            public ReferralTrackerModule toFloatRange;

            public /* synthetic */ setMax(byte b) {
                this();
            }

            private setMax() {
            }
        }

        /* renamed from: o.ResourceUtils$1$b */
        static class b implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 setMax;

            b(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$hashCode */
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

        /* renamed from: o.ResourceUtils$1$toFloatRange */
        static class toFloatRange implements b.C0007b<setDefaultFontSize> {
            private final PrepareException.AnonymousClass1 getMax;

            toFloatRange(PrepareException.AnonymousClass1 r1) {
                this.getMax = r1;
            }

            public final /* synthetic */ Object get() {
                setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                if (updateVisuals != null) {
                    return updateVisuals;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.ResourceUtils$1$invokeSuspend */
        static class invokeSuspend implements b.C0007b<setDistinctPacketsDetectedPerScan> {
            private final PrepareException.AnonymousClass1 getMax;

            invokeSuspend(PrepareException.AnonymousClass1 r1) {
                this.getMax = r1;
            }

            public final /* synthetic */ Object get() {
                setDistinctPacketsDetectedPerScan smallIconId = this.getMax.getSmallIconId();
                if (smallIconId != null) {
                    return smallIconId;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.ResourceUtils$1$IsOverlapping */
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

        /* renamed from: o.ResourceUtils$1$values */
        static class values implements b.C0007b<setMfgReserved> {
            private final PrepareException.AnonymousClass1 setMax;

            values(PrepareException.AnonymousClass1 r1) {
                this.setMax = r1;
            }

            public final /* synthetic */ Object get() {
                setMfgReserved receiveFile = this.setMax.receiveFile();
                if (receiveFile != null) {
                    return receiveFile;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.ResourceUtils$1$getMax */
        static class getMax implements b.C0007b<Context> {
            private final PrepareException.AnonymousClass1 getMin;

            getMax(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$toDoubleRange */
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

        /* renamed from: o.ResourceUtils$1$isInside */
        static class isInside implements b.C0007b<getPerformanceTracker> {
            private final PrepareException.AnonymousClass1 length;

            isInside(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$onNavigationEvent */
        static class onNavigationEvent implements b.C0007b<onDescriptorWrite> {
            private final PrepareException.AnonymousClass1 getMax;

            onNavigationEvent(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$valueOf */
        static class valueOf implements b.C0007b<H5Utils> {
            private final PrepareException.AnonymousClass1 setMax;

            valueOf(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$equals */
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

        /* renamed from: o.ResourceUtils$1$toString */
        static class toString implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
            private final PrepareException.AnonymousClass1 length;

            toString(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$invoke */
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

        /* renamed from: o.ResourceUtils$1$setMin */
        static class setMin implements b.C0007b<enableBackButton> {
            private final PrepareException.AnonymousClass1 getMax;

            setMin(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$length */
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

        /* renamed from: o.ResourceUtils$1$getCause */
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

        /* renamed from: o.ResourceUtils$1$toIntRange */
        static class toIntRange implements b.C0007b<onWebViewDestory> {
            private final PrepareException.AnonymousClass1 setMin;

            toIntRange(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$create */
        static class create implements b.C0007b<onCharacteristicChanged> {
            private final PrepareException.AnonymousClass1 length;

            create(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.ResourceUtils$1$getMin */
        static class getMin implements b.C0007b<setSupportZoom> {
            private final PrepareException.AnonymousClass1 getMax;

            getMin(PrepareException.AnonymousClass1 r1) {
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

        public final void getMin(MyReferralDetailActivity myReferralDetailActivity) {
            AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.length.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy2 != null) {
                matchInfo.setMin(myReferralDetailActivity, IPostMessageService$Stub$Proxy2);
                applyChanges ICustomTabsCallback$Stub2 = this.length.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub2 != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub2;
                    appxLoadFailed length2 = this.length.length();
                    if (length2 != null) {
                        appxLoadFailed appxloadfailed = length2;
                        getScheme min = this.length.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals2 = this.length.updateVisuals();
                            if (updateVisuals2 != null) {
                                matchInfo.length(myReferralDetailActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                                SessionBridgeExtension.AnonymousClass1.setMin(myReferralDetailActivity, this.invokeSuspend.get());
                                SessionBridgeExtension.AnonymousClass1.getMax(myReferralDetailActivity, this.onQueueTitleChanged.get());
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

    public /* synthetic */ ResourceUtils(RecipientActivityModule recipientActivityModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, BillerX2BModule billerX2BModule, PrepareException.AnonymousClass1 r10, byte b2) {
        this(recipientActivityModule, bottomSheetOnBoardingModule, deepLinkModule, scanQrModule, restoreUrlModule, featureModule, oauthModule, servicesModule, billerX2BModule, r10);
    }

    private ResourceUtils(RecipientActivityModule recipientActivityModule, BottomSheetOnBoardingModule bottomSheetOnBoardingModule, DeepLinkModule deepLinkModule, ScanQrModule scanQrModule, RestoreUrlModule restoreUrlModule, FeatureModule featureModule, OauthModule oauthModule, ServicesModule servicesModule, BillerX2BModule billerX2BModule, PrepareException.AnonymousClass1 r31) {
        DeepLinkModule deepLinkModule2 = deepLinkModule;
        ScanQrModule scanQrModule2 = scanQrModule;
        RestoreUrlModule restoreUrlModule2 = restoreUrlModule;
        FeatureModule featureModule2 = featureModule;
        OauthModule oauthModule2 = oauthModule;
        PrepareException.AnonymousClass1 r6 = r31;
        this.setMax = r6;
        this.length = isScrap.getMin(GRVMPMoreMenuItemPriority.setMin(recipientActivityModule));
        this.getMax = new b(r6);
        this.setMin = new toString(r6);
        isInside isinside = new isInside(r6);
        this.getMin = isinside;
        this.toFloatRange = setAndroidLScanningDisabled.create(this.getMax, this.setMin, isinside);
        ResourceUtils$Mean$Arithmetic resourceUtils$Mean$Arithmetic = new ResourceUtils$Mean$Arithmetic(r6);
        this.IsOverlapping = resourceUtils$Mean$Arithmetic;
        this.equals = scan.create(this.getMax, this.setMin, resourceUtils$Mean$Arithmetic);
        toDoubleRange todoublerange = new toDoubleRange(r6);
        this.toIntRange = todoublerange;
        this.isInside = setGriverResourcePresetProxy.create(this.getMax, this.setMin, todoublerange);
        setStatusErrorPage create2 = setStatusErrorPage.create(this.getMax, this.setMin, this.toIntRange);
        this.FastBitmap$CoordinateSystem = create2;
        b.C0007b<cancelUniqueWork> min = isScrap.getMin(cancelWorkById.setMax(this.length, this.toFloatRange, this.equals, this.isInside, create2));
        this.toDoubleRange = min;
        this.hashCode = isScrap.getMin(onMenuItemChange.getMax(recipientActivityModule, min));
        this.toString = isScrap.getMin(compareTo.setMax(billerX2BModule));
        ResourceUtils$Grayscale$Algorithm resourceUtils$Grayscale$Algorithm = new ResourceUtils$Grayscale$Algorithm(r6);
        this.values = resourceUtils$Grayscale$Algorithm;
        this.invoke = setForegroundBetweenScanPeriod.create(resourceUtils$Grayscale$Algorithm);
        valueOf valueof = new valueOf(r6);
        this.valueOf = valueof;
        this.invokeSuspend = isAndroidLScanningDisabled.create(valueof);
        this.Grayscale$Algorithm = setsManifestCheckingDisabled.create(this.valueOf);
        getMax getmax = new getMax(r6);
        this.Mean$Arithmetic = getmax;
        this.getCause = setOptionMenu.create(getmax);
        toFloatRange tofloatrange = new toFloatRange(r6);
        this.ICustomTabsCallback = tofloatrange;
        b.C0007b<IWorkManagerImplCallback.Default> min2 = isScrap.getMin(IWorkManagerImplCallback.Stub.setMin(this.toString, this.invoke, this.invokeSuspend, this.Grayscale$Algorithm, this.getCause, tofloatrange, this.isInside));
        this.b = min2;
        this.onNavigationEvent = isScrap.getMin(getPropertyValue.getMin(billerX2BModule, min2));
        this.create = isScrap.getMin(getDateFormatPattern.getMin(bottomSheetOnBoardingModule));
        getCause getcause = new getCause(r6);
        this.onRelationshipValidationResult = getcause;
        this.extraCallbackWithResult = onDeviceFound.create(this.getMax, this.setMin, getcause);
        onDisconnectBLE create3 = onDisconnectBLE.create(this.getMax, this.setMin, this.onRelationshipValidationResult);
        this.onMessageChannelReady = create3;
        onSelected min3 = onSelected.setMin(this.create, this.extraCallbackWithResult, create3);
        this.extraCallback = min3;
        this.onPostMessage = isScrap.getMin(FieldSerializer.getMin(bottomSheetOnBoardingModule, min3));
        this.ICustomTabsCallback$Default = new setMin(r6);
        b.C0007b<Activity> min4 = isScrap.getMin(R.attr.setMax(scanQrModule));
        this.asBinder = min4;
        b.C0007b<method> min5 = isScrap.getMin(type.getMax(min4));
        this.onTransact = min5;
        this.asInterface = isScrap.getMin(R.integer.setMin(scanQrModule2, min5));
        hashCode hashcode = new hashCode(r6);
        this.ICustomTabsCallback$Stub = hashcode;
        this.getInterfaceDescriptor = GriverPrepareInterceptor.AnonymousClass2.create(this.getMax, this.setMin, hashcode);
        this.ICustomTabsCallback$Stub$Proxy = beforeQuery.create(this.getMax, this.setMin, this.ICustomTabsCallback$Stub);
        this.ICustomTabsService = sendStorageToRemote.getMin(IMultiInstanceInvalidationService.Stub.Proxy.getMax());
        this.setDefaultImpl = getDataRequestNotifier.create(this.getMin);
        onPostMessage onpostmessage = new onPostMessage(r6);
        this.getDefaultImpl = onpostmessage;
        this.newSessionWithExtras = onCharacteristicWrite.create(onpostmessage, this.getMax, this.setMin);
        localIdToBytes create4 = localIdToBytes.create(this.ICustomTabsCallback$Stub);
        this.extraCommand = create4;
        b.C0007b<R.styleable> min6 = isScrap.getMin(Setter.length(this.ICustomTabsCallback$Default, this.asInterface, this.getInterfaceDescriptor, this.ICustomTabsCallback$Stub$Proxy, this.ICustomTabsService, this.ICustomTabsCallback, this.setDefaultImpl, this.newSessionWithExtras, create4));
        this.newSession = min6;
        this.warmup = isScrap.getMin(R.drawable.setMin(scanQrModule2, min6));
        b.C0007b<OnItemLongClick> min7 = isScrap.getMin(OnPageChange.Callback.setMax());
        this.mayLaunchUrl = min7;
        this.updateVisuals = isScrap.getMin(ButterKnife.getMin(restoreUrlModule2, min7));
        ICustomTabsCallback iCustomTabsCallback = new ICustomTabsCallback(r6);
        this.requestPostMessageChannel = iCustomTabsCallback;
        NullBeaconDataFactory create5 = NullBeaconDataFactory.create(this.getMax, this.setMin, iCustomTabsCallback);
        this.validateRelationship = create5;
        b.C0007b<OnFocusChange> min8 = isScrap.getMin(OnEditorAction.getMin(this.updateVisuals, create5));
        this.postMessage = min8;
        this.requestPostMessageChannelWithExtras = isScrap.getMin(BindViews.getMax(restoreUrlModule2, min8));
        values values2 = new values(r6);
        this.ICustomTabsService$Default = values2;
        this.ICustomTabsService$Stub$Proxy = GriverBizManifest.create(this.getMax, this.setMin, values2);
        this.receiveFile = APWebSettings.PluginState.create(this.getMin);
        this.ICustomTabsService$Stub = GriverDefaultH5JSAPIPermission.getMax(setAllBucketName.setMax());
        equals equals2 = new equals(r6);
        this.IPostMessageService = equals2;
        this.ITrustedWebActivityCallback = onConsoleMessage.create(this.getMax, this.setMin, equals2);
        invoke invoke2 = new invoke(r6);
        this.IPostMessageService$Default = invoke2;
        this.onExtraCallback = H5ResourceCORSUtil.AnonymousClass1.create(this.getMax, this.setMin, invoke2);
        toIntRange tointrange = new toIntRange(r6);
        this.IPostMessageService$Stub = tointrange;
        this.IPostMessageService$Stub$Proxy = capturePropagationValues.getMin(this.onExtraCallback, tointrange);
        onNavigationEvent onnavigationevent = new onNavigationEvent(r6);
        this.ITrustedWebActivityService = onnavigationevent;
        this.ITrustedWebActivityCallback$Default = ScanState.create(this.getMax, this.setMin, onnavigationevent);
        this.ITrustedWebActivityCallback$Stub$Proxy = getTextWidth.length(AUCornerListView.getMax());
        AUMaxItemCornerListView length2 = AUMaxItemCornerListView.length(setAllBucketName.setMax(), this.ITrustedWebActivityCallback$Stub$Proxy);
        this.areNotificationsEnabled = length2;
        this.ITrustedWebActivityCallback$Stub = Transition.MatchOrder.length(this.ITrustedWebActivityCallback$Default, length2);
        this.getSmallIconBitmap = setInitialScale.create(this.getMax, this.setMin, this.getMin);
        postUrl create6 = postUrl.create(this.getMax, this.setMin, this.getMin);
        this.notifyNotificationWithChannel = create6;
        this.getSmallIconId = getName.setMin(this.getSmallIconBitmap, create6, manuallyReleaseCamera.setMax());
        ResourceUtils$FastBitmap$CoordinateSystem resourceUtils$FastBitmap$CoordinateSystem = new ResourceUtils$FastBitmap$CoordinateSystem(r6);
        this.cancelNotification = resourceUtils$FastBitmap$CoordinateSystem;
        saveAppInfos create7 = saveAppInfos.create(resourceUtils$FastBitmap$CoordinateSystem);
        this.getActiveNotifications = create7;
        this.ITrustedWebActivityService$Stub = captureHierarchy.length(create7, OpenInBrowserBridgeExtension.setMax());
        this.ITrustedWebActivityService$Default = isScrap.getMin(getPathMotion.setMin());
        b.C0007b<getCancelable> min9 = isScrap.getMin(getCancelOnTouchOutside.create(this.ICustomTabsCallback$Default));
        this.ITrustedWebActivityService$Stub$Proxy = min9;
        b.C0007b<getMode> min10 = isScrap.getMin(onDisappear.length(this.ICustomTabsService$Stub$Proxy, this.receiveFile, this.ICustomTabsService$Stub, this.ITrustedWebActivityCallback, this.IPostMessageService$Stub$Proxy, this.ITrustedWebActivityCallback$Stub, this.getSmallIconId, this.ITrustedWebActivityService$Stub, this.ITrustedWebActivityService$Default, min9, this.setDefaultImpl));
        this.notify = min10;
        this.INotificationSideChannel = isScrap.getMin(setDuration.getMax(featureModule2, min10));
        invokeSuspend invokesuspend = new invokeSuspend(r6);
        this.cancelAll = invokesuspend;
        this.INotificationSideChannel$Stub = didRangeBeaconsInRegion.create(this.getMax, this.setMin, invokesuspend);
        OrientationDetector.MySensorEventListener.AnonymousClass1 max = OrientationDetector.MySensorEventListener.AnonymousClass1.getMax(this.ICustomTabsCallback$Default);
        this.cancel = max;
        getSystemInfo max2 = getSystemInfo.setMax(max);
        this.INotificationSideChannel$Default = max2;
        this.INotificationSideChannel$Stub$Proxy = isScrap.getMin(setPropagation.length(this.INotificationSideChannel, this.INotificationSideChannel$Stub, max2, this.getCause, this.ICustomTabsCallback));
        this.IconCompatParcelizer = getLoadsImagesAutomatically.create(this.getMax, this.setMin, this.getMin);
        this.MediaBrowserCompat$CustomActionResultReceiver = setWebContentsDebuggingEnabled.create(this.getMin);
        installPathExist create8 = installPathExist.create(this.getMin);
        this.write = create8;
        b.C0007b<getTargets> min11 = isScrap.getMin(addViewValues.length(this.INotificationSideChannel, this.INotificationSideChannel$Stub$Proxy, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, create8));
        this.read = min11;
        this.RemoteActionCompatParcelizer = isScrap.getMin(parseMatchOrder.length(featureModule2, min11));
        this.MediaBrowserCompat$SearchResultReceiver = isScrap.getMin(GriverDecodeUrlCallback.setMax(oauthModule2, setTrimPathStart.length()));
        length length3 = new length(r6);
        this.MediaBrowserCompat$MediaItem$Flags = length3;
        this.MediaDescriptionCompat = GriverOpenAuthExtension.create(length3);
        this.MediaBrowserCompat$ItemReceiver = BLEManager.AnonymousClass2.create(this.getMax, this.setMin, this.getDefaultImpl);
        this.MediaBrowserCompat$MediaItem = GriverDialogExtension.create(this.getMax, this.setMin, this.MediaBrowserCompat$MediaItem$Flags);
        this.MediaMetadataCompat$TextKey = checkSuffixSupported.create(this.getMin);
        this.MediaMetadataCompat$BitmapKey = isImage.create(this.getMin);
        getFillColor max3 = getFillColor.setMax(this.MediaBrowserCompat$SearchResultReceiver, startListenScreenshot.setMin(), this.MediaDescriptionCompat, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat$TextKey, this.MediaMetadataCompat$BitmapKey);
        this.MediaMetadataCompat = max3;
        this.MediaMetadataCompat$LongKey = isScrap.getMin(GriverBridgeCallNotFoundEvent.BridgeContext.setMax(oauthModule2, max3));
        this.MediaMetadataCompat$RatingKey = BindFont.length(servicesModule);
        this.RatingCompat$StarStyle = onStartBleScan.create(this.getMax, this.setMin, this.onRelationshipValidationResult);
        this.RatingCompat = onGetBluetoothCharacteristics.create(this.getMax, this.setMin, this.onRelationshipValidationResult);
        IsOverlapping isOverlapping = new IsOverlapping(r6);
        this.RatingCompat$Style = isOverlapping;
        this.onEvent = matchesBeacon.create(this.cancelAll, isOverlapping);
        this.IMediaControllerCallback = validateMac.create(this.getMax, this.setMin, this.cancelAll);
        this.onMetadataChanged = IntentHandler.create(this.getMax, this.setMin, this.cancelAll, this.RatingCompat$Style);
        this.onSessionDestroyed = toUuid.create(this.getMin);
        this.onQueueTitleChanged = didDetermineStateForRegion.create(this.cancelAll);
        create create9 = new create(r6);
        this.onQueueChanged = create9;
        this.onPlaybackStateChanged = BLEManager.AnonymousClass3.create(create9);
        BLEManager.AnonymousClass4 create10 = BLEManager.AnonymousClass4.create(this.onQueueChanged);
        this.onShuffleModeChangedRemoved = create10;
        b.C0007b<BindInt> min12 = isScrap.getMin(OnCheckedChanged.length(this.ICustomTabsCallback$Default, this.MediaMetadataCompat$RatingKey, this.getCause, this.INotificationSideChannel$Default, this.RatingCompat$StarStyle, this.RatingCompat, this.onEvent, this.IMediaControllerCallback, this.INotificationSideChannel$Stub, this.onMetadataChanged, this.onSessionDestroyed, this.onQueueTitleChanged, this.onPlaybackStateChanged, create10));
        this.onCaptioningEnabledChanged = min12;
        b.C0007b<getPath> min13 = isScrap.getMin(Slide.getMin(this.warmup, this.requestPostMessageChannelWithExtras, this.RemoteActionCompatParcelizer, this.MediaMetadataCompat$LongKey, min12));
        this.onExtrasChanged = min13;
        this.onRepeatModeChanged = isScrap.getMin(Fade.setMin(deepLinkModule2, min13));
        setMax setmax = new setMax(r31);
        this.onVolumeInfoChanged = setmax;
        this.IMediaControllerCallback$Stub = APWebMessagePort.APWebMessageCallback.create(this.getMax, this.setMin, setmax);
        this.IMediaSession = onLocationChanged.setMin(startListenScreenshot.setMin());
        GVLoadingView create11 = GVLoadingView.create(this.getMax, this.setMin, this.MediaBrowserCompat$MediaItem$Flags);
        this.onShuffleModeChanged = create11;
        b.C0007b<setStartDelay> min14 = isScrap.getMin(setInterpolator.setMin(this.onRepeatModeChanged, this.IMediaControllerCallback$Stub, this.IMediaSession, create11));
        this.onSessionReady = min14;
        this.IMediaControllerCallback$Stub$Proxy = isScrap.getMin(ChangeBounds.setMin(deepLinkModule2, min14));
    }

    public static getMin setMax() {
        return new getMin((byte) 0);
    }

    public static final class getMin {
        public OauthModule IsOverlapping;
        public BillerX2BModule equals;
        public BottomSheetOnBoardingModule getMax;
        public DeepLinkModule getMin;
        public ServicesModule isInside;
        public ScanQrModule length;
        public RestoreUrlModule setMax;
        public RecipientActivityModule setMin;
        public FeatureModule toFloatRange;
        public PrepareException.AnonymousClass1 toIntRange;

        /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class b implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        b(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            appxLoadFailed length = this.getMin.length();
            if (length != null) {
                return length;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toString implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 setMin;

        toString(PrepareException.AnonymousClass1 r1) {
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

    static class toDoubleRange implements b.C0007b<GriverWhiteScreenStageMonitor> {
        private final PrepareException.AnonymousClass1 setMin;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverWhiteScreenStageMonitor ITrustedWebActivityCallback$Stub$Proxy = this.setMin.ITrustedWebActivityCallback$Stub$Proxy();
            if (ITrustedWebActivityCallback$Stub$Proxy != null) {
                return ITrustedWebActivityCallback$Stub$Proxy;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class valueOf implements b.C0007b<getBeaconSimulator> {
        private final PrepareException.AnonymousClass1 length;

        valueOf(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getBeaconSimulator isTransportControlEnabled = this.length.isTransportControlEnabled();
            if (isTransportControlEnabled != null) {
                return isTransportControlEnabled;
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

    static class toFloatRange implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            getPerformanceTracker onTransact = this.setMin.onTransact();
            if (onTransact != null) {
                return onTransact;
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

    static class onPostMessage implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMin;

        onPostMessage(PrepareException.AnonymousClass1 r1) {
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

    static class ICustomTabsCallback implements b.C0007b<AndroidModel> {
        private final PrepareException.AnonymousClass1 getMin;

        ICustomTabsCallback(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 getMax;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
        private final PrepareException.AnonymousClass1 setMax;

        equals(PrepareException.AnonymousClass1 r1) {
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
        private final PrepareException.AnonymousClass1 getMin;

        invoke(PrepareException.AnonymousClass1 r1) {
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

    static class onNavigationEvent implements b.C0007b<getScanJobRuntimeMillis> {
        private final PrepareException.AnonymousClass1 length;

        onNavigationEvent(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.length.ITrustedWebActivityService$Default();
            if (ITrustedWebActivityService$Default != null) {
                return ITrustedWebActivityService$Default;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class invokeSuspend implements b.C0007b<toUuidString> {
        private final PrepareException.AnonymousClass1 length;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            toUuidString requestPostMessageChannelWithExtras = this.length.requestPostMessageChannelWithExtras();
            if (requestPostMessageChannelWithExtras != null) {
                return requestPostMessageChannelWithExtras;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class length implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 setMin;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

    public final void length(RecipientActivity recipientActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.setMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(recipientActivity, IPostMessageService$Stub$Proxy2);
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
                            matchInfo.length(recipientActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            getSourcePath.setMax(recipientActivity, this.hashCode.get());
                            getSourcePath.setMin(recipientActivity, this.onNavigationEvent.get());
                            getSourcePath.getMin(recipientActivity, this.onPostMessage.get());
                            getSourcePath.setMin(recipientActivity, this.IMediaControllerCallback$Stub$Proxy.get());
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
