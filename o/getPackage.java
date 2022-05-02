package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.payqr.GetPaymentResultModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.pay.PayActivity;
import o.AppPreDownloadManager;
import o.AppPreDownloadPackageManager;
import o.ChooseFileBridgeExtension;
import o.FragmentStateAdapter$5;
import o.H5Event;
import o.INebulaPage;
import o.LocationBridgeExtension;
import o.NetworkUtils;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.ViewPager;
import o.b;
import o.fakeDragBy;
import o.getPageSize;
import o.isUserInputEnabled;
import o.onNext;

public final class getPackage implements closeAllSocket {
    private b.C0007b<getPageSize.getMin> FastBitmap$CoordinateSystem;
    private b.C0007b<getDelay> Grayscale$Algorithm;
    private b.C0007b<AppPreDownloadManager.AnonymousClass2> ICustomTabsCallback;
    private b.C0007b<CommonUtil> ICustomTabsCallback$Default;
    private b.C0007b<dynamicProxy> ICustomTabsCallback$Stub;
    private b.C0007b<TinyAppFileUtils> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<PdfImageSource.setMin> ICustomTabsService;
    private b.C0007b<isKeepCallback> ICustomTabsService$Default;
    private b.C0007b<ifContainsEmbedSurfaceView> ICustomTabsService$Stub;
    private b.C0007b<getEmbededViewProvider> ICustomTabsService$Stub$Proxy;
    private b.C0007b<enableUCCorePreheadInit> INotificationSideChannel;
    private b.C0007b<sendServiceWorkerPushMessage> INotificationSideChannel$Default;
    private b.C0007b<BLEServiceUnit> INotificationSideChannel$Stub;
    private b.C0007b<GriverLogger> INotificationSideChannel$Stub$Proxy;
    private b.C0007b<H5DataProvider> IPostMessageService;
    private b.C0007b<INebulaPage.H5PageHandler> IPostMessageService$Default;
    private b.C0007b<getInternalContentView> IPostMessageService$Stub;
    private b.C0007b<isDispatcherOnWorkerThread> IPostMessageService$Stub$Proxy;
    private b.C0007b<H5Event.Builder> ITrustedWebActivityCallback;
    private b.C0007b<cannotInitUC> ITrustedWebActivityCallback$Default;
    private b.C0007b<shouldExit> ITrustedWebActivityCallback$Stub;
    private b.C0007b<hasPageStartButNoInterceptRequest> ITrustedWebActivityCallback$Stub$Proxy;
    private b.C0007b<NXH5WebViewClientAdapter> ITrustedWebActivityService;
    private b.C0007b<enableBackButton> ITrustedWebActivityService$Default;
    private b.C0007b<GetAuthCode> ITrustedWebActivityService$Stub;
    private b.C0007b<setH5OverScrollListener> ITrustedWebActivityService$Stub$Proxy;
    private b.C0007b<getAppIds> IsOverlapping;
    private b.C0007b<NetworkUtils.NetworkDetailCallback> Mean$Arithmetic;
    private b.C0007b<CustomPopMenuExtension> MediaBrowserCompat$CustomActionResultReceiver;
    private b.C0007b<getShareUrl> areNotificationsEnabled;
    private b.C0007b<stringify> asBinder;
    private b.C0007b<PdfImageSource.length> asInterface;
    private b.C0007b<getAppPreDownloadCacheManager> b;
    private b.C0007b<onNext.setMin> cancel;
    private b.C0007b<isInnerApp> cancelAll;
    private b.C0007b<releaseView> cancelNotification;
    private b.C0007b<onDescriptorWrite> create;
    private b.C0007b<onWebViewDestory> equals;
    private b.C0007b<AppPreDownloadManager.AnonymousClass1> extraCallback;
    private b.C0007b<uploadMonitorEvent> extraCallbackWithResult;
    private b.C0007b<refreshAppPreDownloadConfig> extraCommand;
    private b.C0007b<getRedirectUrl> getActiveNotifications;
    private b.C0007b<setRetryCount> getCause;
    private b.C0007b<fakeDragBy.getMin> getDefaultImpl;
    private b.C0007b<getCommonResources> getInterfaceDescriptor;
    private b.C0007b<setFireMoment> getMax;
    private b.C0007b<appxLoadFailed> getMin;
    private b.C0007b<setEventSource> getSmallIconBitmap;
    private b.C0007b<getWebViewCoreSoPath> getSmallIconId;
    private b.C0007b<FragmentStateAdapter$5.setMin> hashCode;
    private b.C0007b<isUserInputEnabled.length> invoke;
    private b.C0007b<getPageSize.setMin> invokeSuspend;
    private b.C0007b<addPendingMessage> isInside;
    private final PrepareException.AnonymousClass1 length;
    private b.C0007b<isLocalPath> mayLaunchUrl;
    private b.C0007b<getPerformanceTracker> newSession;
    private b.C0007b<H5ServiceWorkerControllerProvider> newSessionWithExtras;
    private b.C0007b<IH5EmbedViewJSCallback> notify;
    private b.C0007b<NXH5WebViewAdapter> notifyNotificationWithChannel;
    private b.C0007b<isCanceled> onExtraCallback;
    private b.C0007b<onPageScrollStateChanged> onMessageChannelReady;
    private b.C0007b<syncJsApi> onNavigationEvent;
    private b.C0007b<isUserInputEnabled.getMax> onPostMessage;
    private b.C0007b<isAppIdInPreDownloadConfig> onRelationshipValidationResult;
    private b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> onTransact;
    private b.C0007b<onNext.length> postMessage;
    private b.C0007b<keepCallback> receiveFile;
    private b.C0007b<pageLeft> requestPostMessageChannel;
    private b.C0007b<fakeDragBy.length> requestPostMessageChannelWithExtras;
    private b.C0007b<isDynamicDelivery> setDefaultImpl;
    private b.C0007b<getScheme> setMax;
    private b.C0007b<FragmentStateAdapter$5.getMax> setMin;
    private b.C0007b<setDefaultFontSize> toDoubleRange;
    private b.C0007b<snapToPage> toFloatRange;
    private b.C0007b<notifyConfigurationChanged> toIntRange;
    private b.C0007b<requestTransform> toString;
    private b.C0007b<Context> updateVisuals;
    private b.C0007b<ifContainsEmbedView> validateRelationship;
    private b.C0007b<appConfigIsEnable> valueOf;
    private b.C0007b<copyBackForwardList> values;
    private b.C0007b<downloadGriverInitApp> warmup;

    public /* synthetic */ getPackage(GetPaymentResultModule getPaymentResultModule, QueryPayMethodModule queryPayMethodModule, PayQrModule payQrModule, OfflinePayModule offlinePayModule, PlayStoreReviewModules playStoreReviewModules, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r7, byte b2) {
        this(getPaymentResultModule, queryPayMethodModule, payQrModule, offlinePayModule, playStoreReviewModules, globalNetworkModule, r7);
    }

    private getPackage(GetPaymentResultModule getPaymentResultModule, QueryPayMethodModule queryPayMethodModule, PayQrModule payQrModule, OfflinePayModule offlinePayModule, PlayStoreReviewModules playStoreReviewModules, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r40) {
        PrepareException.AnonymousClass1 r1 = r40;
        this.length = r1;
        this.setMin = isScrap.getMin(ViewPager.SavedState.setMin(getPaymentResultModule));
        this.getMin = new values(r1);
        this.setMax = new toString(r1);
        getPackage$FastBitmap$CoordinateSystem getpackage_fastbitmap_coordinatesystem = new getPackage$FastBitmap$CoordinateSystem(r1);
        this.getMax = getpackage_fastbitmap_coordinatesystem;
        this.IsOverlapping = setAppIds.create(this.getMin, this.setMax, getpackage_fastbitmap_coordinatesystem);
        equals equals2 = new equals(r1);
        this.equals = equals2;
        this.toIntRange = setUCCoreDownloadUrl.create(this.getMin, this.setMax, equals2);
        H5EmbededViewProvider create2 = H5EmbededViewProvider.create(this.getMin, this.setMax, this.equals);
        this.isInside = create2;
        ViewPager2 min = ViewPager2.setMin(this.setMin, this.IsOverlapping, this.toIntRange, create2);
        this.toFloatRange = min;
        this.hashCode = isScrap.getMin(ViewPager.DecorView.getMax(getPaymentResultModule, min));
        isInside isinside = new isInside(r1);
        this.toDoubleRange = isinside;
        this.values = clearHistory.create(this.getMin, this.setMax, isinside);
        b.C0007b<getPageSize.getMin> min2 = isScrap.getMin(FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.getMin(offlinePayModule));
        this.FastBitmap$CoordinateSystem = min2;
        registerOnPageChangeCallback max = registerOnPageChangeCallback.setMax(this.values, min2);
        this.toString = max;
        this.invokeSuspend = isScrap.getMin(updateCurrentItem.length(offlinePayModule, max));
        this.invoke = isScrap.getMin(unregisterOnPageChangeCallback.setMax(payQrModule));
        this.Mean$Arithmetic = getDetailNetwork.create(this.getMin, this.setMax, this.getMax);
        this.Grayscale$Algorithm = setDelay.create(this.getMin, this.setMax, this.getMax);
        this.valueOf = ifSyncUpdate.create(this.getMin, this.setMax, this.toDoubleRange);
        this.onNavigationEvent = shouldInterceptRequest4ServiceWorker.create(this.getMin, this.setMax, this.equals);
        this.getCause = getRetryCount.create(this.getMin, this.setMax, this.getMax);
        this.create = new hashCode(r1);
        this.b = getAppPreDownloadPackageManager.create(this.getMin, this.setMax, AppPreDownloadPackageManager.AnonymousClass1.create(), this.getMax, this.create);
        this.ICustomTabsCallback = downloadPackageWithURLString.create(this.getMin, this.setMax, this.getMax);
        this.extraCallback = AppPreDownloadPackageManager.create(this.getMax);
        this.onRelationshipValidationResult = isPreDownloadFileAvailable.create(this.getMax);
        zipFilePathForAppPackageURLString create3 = zipFilePathForAppPackageURLString.create(this.getMin, this.setMax, this.getMax);
        this.extraCallbackWithResult = create3;
        b.C0007b<onPageScrollStateChanged> min3 = isScrap.getMin(onPageSelected.setMin(this.invoke, this.Mean$Arithmetic, this.Grayscale$Algorithm, this.valueOf, this.onNavigationEvent, this.getCause, this.b, this.ICustomTabsCallback, this.extraCallback, this.onRelationshipValidationResult, create3, this.values));
        this.onMessageChannelReady = min3;
        this.onPostMessage = isScrap.getMin(setUserInputEnabled.getMax(payQrModule, min3));
        toIntRange tointrange = new toIntRange(r1);
        this.ICustomTabsCallback$Stub = tointrange;
        this.asBinder = dumpFile.create(this.getMin, this.setMax, tointrange);
        this.ICustomTabsCallback$Default = initialValue.create(this.getMin, this.setMax, this.ICustomTabsCallback$Stub);
        b.C0007b<PdfImageSource.length> min4 = isScrap.getMin(GriverConfigConstants.length(playStoreReviewModules));
        this.asInterface = min4;
        PdfViewerActivity.DividerGridItemDecoration max2 = PdfViewerActivity.DividerGridItemDecoration.setMax(this.asBinder, this.ICustomTabsCallback$Default, min4);
        this.onTransact = max2;
        this.ICustomTabsService = isScrap.getMin(dispatchTouchEvent.setMax(playStoreReviewModules, max2));
        this.getDefaultImpl = isScrap.getMin(isFakeDragging.getMin(queryPayMethodModule));
        IsOverlapping isOverlapping = new IsOverlapping(r1);
        this.setDefaultImpl = isOverlapping;
        this.ICustomTabsCallback$Stub$Proxy = printCurrentMemory.create(this.getMin, this.setMax, isOverlapping);
        setMax setmax = new setMax(r1);
        this.getInterfaceDescriptor = setmax;
        this.mayLaunchUrl = checkFileType.create(this.getMin, this.setMax, this.setDefaultImpl, setmax);
        this.extraCommand = availableAppForAppId.create(this.getMin, this.setMax, this.getMax);
        this.newSession = new getMax(r1);
        this.newSessionWithExtras = H5ScrollChangedCallback.create(this.getMin, this.setMax, this.equals);
        this.warmup = getAppInfoAvailableReason.create(this.getMin, this.setMax, this.getMax);
        this.updateVisuals = new setMin(r1);
        b.C0007b<pageLeft> min5 = isScrap.getMin(getChildRectInPagerCoordinates.setMax(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy, this.mayLaunchUrl, ChooseFileBridgeExtension.AnonymousClass2.AnonymousClass1.AnonymousClass1.setMax(), this.ICustomTabsCallback, this.values, this.extraCommand, this.newSession, this.extraCallback, this.newSessionWithExtras, this.warmup, this.updateVisuals));
        this.requestPostMessageChannel = min5;
        this.requestPostMessageChannelWithExtras = isScrap.getMin(endDrag.getMin(queryPayMethodModule, min5));
        this.postMessage = isScrap.getMin(setTypeKey.setMax(globalNetworkModule));
        this.validateRelationship = INebulaPage.create(this.getMin, this.setMax, this.equals);
        this.ICustomTabsService$Stub = onReceiveValue.create(this.getMin, this.setMax, this.equals);
        this.ICustomTabsService$Default = eventSource.create(this.getMin, this.setMax, this.equals, this.create);
        this.IPostMessageService = has.create(this.getMin, this.setMax, this.equals);
        this.ICustomTabsService$Stub$Proxy = scriptbizLoadedAndBridgeLoaded.create(this.getMin, this.setMax, this.equals);
        this.receiveFile = H5Event.AnonymousClass1.create(this.equals);
        this.ITrustedWebActivityCallback = H5OverScrollListener.create(this.getMin, this.setMax, this.equals);
        this.IPostMessageService$Stub$Proxy = getH5page.create(this.getMin, this.setMax, this.equals);
        this.onExtraCallback = setTarget.create(this.equals);
        this.IPostMessageService$Default = setHandler.create(this.getMin, this.setMax, this.equals);
        this.IPostMessageService$Stub = getWebChromeClient.create(this.getMin, this.setMax, this.equals);
        this.ITrustedWebActivityCallback$Stub = setContainsEmbedSurfaceView.create(this.getMin, this.setMax, this.equals);
        this.ITrustedWebActivityService = getWebViewClient.create(this.getMin, this.setMax, this.equals);
        this.areNotificationsEnabled = getUcVersion.create(this.getMin, this.setMax, this.equals);
        this.ITrustedWebActivityCallback$Default = getUCSdkVersion.create(this.getMin, this.setMax, this.equals);
        this.ITrustedWebActivityCallback$Stub$Proxy = createWebView.create(this.getMin, this.setMax, this.equals);
        this.cancelNotification = H5Event.create(this.getMin, this.setMax, this.equals);
        this.getSmallIconBitmap = getEventSource.create(this.equals);
        this.getActiveNotifications = NXUcService.create(this.getMin, this.setMax, this.equals);
        this.getSmallIconId = getUCCoreDownloadUrl.create(this.getMin, this.setMax, this.equals);
        this.notifyNotificationWithChannel = NXH5PageAdapter.create(this.getMin, this.setMax, this.equals);
        this.INotificationSideChannel = setContainsEmbedView.create(this.getMin, this.setMax, this.equals);
        this.ITrustedWebActivityService$Stub$Proxy = getWebViewIndex.create(this.getMin, this.setMax, this.equals);
        this.notify = getSpecialRestoreView.create(this.getMin, this.setMax, this.equals);
        length length2 = new length(r1);
        this.ITrustedWebActivityService$Default = length2;
        this.ITrustedWebActivityService$Stub = setOptionMenu.create(length2);
        this.INotificationSideChannel$Default = H5ServiceWorkerHook4Bridge.create(this.getMin, this.setMax, this.equals);
        b.C0007b<BLEServiceUnit> min6 = isScrap.getMin(getWebSocketURLPrefixForDebug.setMin(this.postMessage, this.validateRelationship, this.ICustomTabsService$Stub, this.ICustomTabsService$Default, this.IPostMessageService, this.ICustomTabsService$Stub$Proxy, this.newSessionWithExtras, this.receiveFile, LocationBridgeExtension.AnonymousClass4.setMax(), this.ITrustedWebActivityCallback, this.updateVisuals, this.IPostMessageService$Stub$Proxy, this.onExtraCallback, this.IPostMessageService$Default, this.IPostMessageService$Stub, this.ITrustedWebActivityCallback$Stub, this.ITrustedWebActivityService, this.areNotificationsEnabled, this.ITrustedWebActivityCallback$Default, this.ITrustedWebActivityCallback$Stub$Proxy, this.cancelNotification, this.getSmallIconBitmap, this.getActiveNotifications, this.getSmallIconId, this.notifyNotificationWithChannel, this.INotificationSideChannel, this.ITrustedWebActivityService$Stub$Proxy, this.notify, this.ITrustedWebActivityService$Stub, this.INotificationSideChannel$Default));
        this.INotificationSideChannel$Stub = min6;
        this.cancel = isScrap.getMin(SerialContext.length(globalNetworkModule, min6));
        toFloatRange tofloatrange = new toFloatRange(r1);
        this.INotificationSideChannel$Stub$Proxy = tofloatrange;
        writeDebugMonitor create4 = writeDebugMonitor.create(this.getMin, this.setMax, tofloatrange, this.equals);
        this.cancelAll = create4;
        this.MediaBrowserCompat$CustomActionResultReceiver = isScrap.getMin(onSwitchToBlueTheme.length(create4, this.newSession, this.updateVisuals));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 equals;
        public GetPaymentResultModule getMax;
        public PlayStoreReviewModules getMin;
        public OfflinePayModule length;
        public PayQrModule setMax;
        public QueryPayMethodModule setMin;
        public GlobalNetworkModule toFloatRange;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class values implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 setMax;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMax;

        toString(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 getMax;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 getMax;

        isInside(PrepareException.AnonymousClass1 r1) {
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

    static class hashCode implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 getMax;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<dynamicProxy> {
        private final PrepareException.AnonymousClass1 setMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            dynamicProxy ITrustedWebActivityCallback = this.setMin.ITrustedWebActivityCallback();
            if (ITrustedWebActivityCallback != null) {
                return ITrustedWebActivityCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<isDynamicDelivery> {
        private final PrepareException.AnonymousClass1 setMin;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            isDynamicDelivery postMessage = this.setMin.postMessage();
            if (postMessage != null) {
                return postMessage;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<getCommonResources> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class getMax implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 setMax;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class toFloatRange implements b.C0007b<GriverLogger> {
        private final PrepareException.AnonymousClass1 length;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            GriverLogger Mean$Arithmetic = this.length.Mean$Arithmetic();
            if (Mean$Arithmetic != null) {
                return Mean$Arithmetic;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(PayActivity payActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.length.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy2 != null) {
            matchInfo.setMin(payActivity, IPostMessageService$Stub$Proxy2);
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
                            matchInfo.length(payActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            AppLifeCycleObserver IPostMessageService$Stub$Proxy3 = this.length.IPostMessageService$Stub$Proxy();
                            if (IPostMessageService$Stub$Proxy3 != null) {
                                copyContentToTemp.getMax(payActivity, IPostMessageService$Stub$Proxy3);
                                copyContentToTemp.setMax(payActivity, this.hashCode.get());
                                copyContentToTemp.getMin(payActivity, this.invokeSuspend.get());
                                copyContentToTemp.getMax(payActivity, this.onPostMessage.get());
                                copyContentToTemp.setMax(payActivity, this.ICustomTabsService.get());
                                copyContentToTemp.getMin(payActivity, this.requestPostMessageChannelWithExtras.get());
                                copyContentToTemp.setMin(payActivity, this.cancel.get());
                                copyContentToTemp.setMax(payActivity, this.MediaBrowserCompat$CustomActionResultReceiver.get());
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
}
