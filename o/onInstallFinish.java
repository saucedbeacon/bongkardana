package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.home.view.ZoomDialog;
import o.AppPreDownloadManager;
import o.AppPreDownloadPackageManager;
import o.H5Event;
import o.INebulaPage;
import o.LocationBridgeExtension;
import o.NetworkUtils;
import o.PrepareException;
import o.b;
import o.getPageSize;
import o.isUserInputEnabled;
import o.onNext;

public final class onInstallFinish implements handlerParameterizedType {
    private b.C0007b<onWebViewDestory> FastBitmap$CoordinateSystem;
    private b.C0007b<AppPreDownloadManager.AnonymousClass2> Grayscale$Algorithm;
    private b.C0007b<isAppIdInPreDownloadConfig> ICustomTabsCallback;
    private b.C0007b<keepCallback> ICustomTabsCallback$Default;
    private b.C0007b<Context> ICustomTabsCallback$Stub;
    private b.C0007b<INebulaPage.H5PageHandler> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<shouldExit> ICustomTabsService;
    private b.C0007b<IH5EmbedViewJSCallback> ICustomTabsService$Default;
    private b.C0007b<GetAuthCode> ICustomTabsService$Stub;
    private b.C0007b<sendServiceWorkerPushMessage> ICustomTabsService$Stub$Proxy;
    private b.C0007b<enableBackButton> IPostMessageService;
    private b.C0007b<getPageSize.getMin> IsOverlapping;
    private b.C0007b<getAppPreDownloadCacheManager> Mean$Arithmetic;
    private b.C0007b<H5Event.Builder> asBinder;
    private b.C0007b<isDispatcherOnWorkerThread> asInterface;
    private b.C0007b<isUserInputEnabled.getMax> b;
    private b.C0007b<onPageScrollStateChanged> create;
    private b.C0007b<requestTransform> equals;
    private b.C0007b<isKeepCallback> extraCallback;
    private b.C0007b<ifContainsEmbedSurfaceView> extraCallbackWithResult;
    private b.C0007b<setEventSource> extraCommand;
    private b.C0007b<uploadMonitorEvent> getCause;
    private b.C0007b<getInternalContentView> getDefaultImpl;
    private b.C0007b<NXH5WebViewClientAdapter> getInterfaceDescriptor;
    private final PrepareException.AnonymousClass1 getMax;
    private b.C0007b<setDefaultFontSize> getMin;
    private b.C0007b<appConfigIsEnable> hashCode;
    private b.C0007b<onDescriptorWrite> invoke;
    private b.C0007b<AppPreDownloadManager.AnonymousClass1> invokeSuspend;
    private b.C0007b<isUserInputEnabled.length> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<hasPageStartButNoInterceptRequest> mayLaunchUrl;
    private b.C0007b<getShareUrl> newSession;
    private b.C0007b<releaseView> newSessionWithExtras;
    private b.C0007b<onNext.setMin> onExtraCallback;
    private b.C0007b<ifContainsEmbedView> onMessageChannelReady;
    private b.C0007b<onNext.length> onNavigationEvent;
    private b.C0007b<getEmbededViewProvider> onPostMessage;
    private b.C0007b<H5DataProvider> onRelationshipValidationResult;
    private b.C0007b<H5ServiceWorkerControllerProvider> onTransact;
    private b.C0007b<enableUCCorePreheadInit> postMessage;
    private b.C0007b<BLEServiceUnit> receiveFile;
    private b.C0007b<getWebViewCoreSoPath> requestPostMessageChannel;
    private b.C0007b<NXH5WebViewAdapter> requestPostMessageChannelWithExtras;
    private b.C0007b<isCanceled> setDefaultImpl;
    private b.C0007b<copyBackForwardList> setMax;
    private b.C0007b<getScheme> setMin;
    private b.C0007b<getDelay> toDoubleRange;
    private b.C0007b<getPageSize.setMin> toFloatRange;
    private b.C0007b<setFireMoment> toIntRange;
    private b.C0007b<syncJsApi> toString;
    private b.C0007b<setH5OverScrollListener> updateVisuals;
    private b.C0007b<getRedirectUrl> validateRelationship;
    private b.C0007b<setRetryCount> valueOf;
    private b.C0007b<NetworkUtils.NetworkDetailCallback> values;
    private b.C0007b<cannotInitUC> warmup;

    public /* synthetic */ onInstallFinish(PayQrModule payQrModule, OfflinePayModule offlinePayModule, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r4, byte b2) {
        this(payQrModule, offlinePayModule, globalNetworkModule, r4);
    }

    private onInstallFinish(PayQrModule payQrModule, OfflinePayModule offlinePayModule, GlobalNetworkModule globalNetworkModule, PrepareException.AnonymousClass1 r36) {
        PrepareException.AnonymousClass1 r1 = r36;
        this.getMax = r1;
        this.length = new toIntRange(r1);
        this.setMin = new isInside(r1);
        length length2 = new length(r1);
        this.getMin = length2;
        this.setMax = clearHistory.create(this.length, this.setMin, length2);
        b.C0007b<getPageSize.getMin> min = isScrap.getMin(FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3.getMin(offlinePayModule));
        this.IsOverlapping = min;
        registerOnPageChangeCallback max = registerOnPageChangeCallback.setMax(this.setMax, min);
        this.equals = max;
        this.toFloatRange = isScrap.getMin(updateCurrentItem.length(offlinePayModule, max));
        this.isInside = isScrap.getMin(unregisterOnPageChangeCallback.setMax(payQrModule));
        IsOverlapping isOverlapping = new IsOverlapping(r1);
        this.toIntRange = isOverlapping;
        this.values = getDetailNetwork.create(this.length, this.setMin, isOverlapping);
        this.toDoubleRange = setDelay.create(this.length, this.setMin, this.toIntRange);
        this.hashCode = ifSyncUpdate.create(this.length, this.setMin, this.getMin);
        getMax getmax = new getMax(r1);
        this.FastBitmap$CoordinateSystem = getmax;
        this.toString = shouldInterceptRequest4ServiceWorker.create(this.length, this.setMin, getmax);
        this.valueOf = getRetryCount.create(this.length, this.setMin, this.toIntRange);
        this.invoke = new equals(r1);
        this.Mean$Arithmetic = getAppPreDownloadPackageManager.create(this.length, this.setMin, AppPreDownloadPackageManager.AnonymousClass1.create(), this.toIntRange, this.invoke);
        this.Grayscale$Algorithm = downloadPackageWithURLString.create(this.length, this.setMin, this.toIntRange);
        this.invokeSuspend = AppPreDownloadPackageManager.create(this.toIntRange);
        this.ICustomTabsCallback = isPreDownloadFileAvailable.create(this.toIntRange);
        zipFilePathForAppPackageURLString create2 = zipFilePathForAppPackageURLString.create(this.length, this.setMin, this.toIntRange);
        this.getCause = create2;
        b.C0007b<onPageScrollStateChanged> min2 = isScrap.getMin(onPageSelected.setMin(this.isInside, this.values, this.toDoubleRange, this.hashCode, this.toString, this.valueOf, this.Mean$Arithmetic, this.Grayscale$Algorithm, this.invokeSuspend, this.ICustomTabsCallback, create2, this.setMax));
        this.create = min2;
        this.b = isScrap.getMin(setUserInputEnabled.getMax(payQrModule, min2));
        this.onNavigationEvent = isScrap.getMin(setTypeKey.setMax(globalNetworkModule));
        this.onMessageChannelReady = INebulaPage.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.extraCallbackWithResult = onReceiveValue.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.extraCallback = eventSource.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem, this.invoke);
        this.onRelationshipValidationResult = has.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.onPostMessage = scriptbizLoadedAndBridgeLoaded.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.onTransact = H5ScrollChangedCallback.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.ICustomTabsCallback$Default = H5Event.AnonymousClass1.create(this.FastBitmap$CoordinateSystem);
        this.asBinder = H5OverScrollListener.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.ICustomTabsCallback$Stub = new getMin(r1);
        this.asInterface = getH5page.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.setDefaultImpl = setTarget.create(this.FastBitmap$CoordinateSystem);
        this.ICustomTabsCallback$Stub$Proxy = setHandler.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.getDefaultImpl = getWebChromeClient.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.ICustomTabsService = setContainsEmbedSurfaceView.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.getInterfaceDescriptor = getWebViewClient.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.newSession = getUcVersion.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.warmup = getUCSdkVersion.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.mayLaunchUrl = createWebView.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.newSessionWithExtras = H5Event.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.extraCommand = getEventSource.create(this.FastBitmap$CoordinateSystem);
        this.validateRelationship = NXUcService.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.requestPostMessageChannel = getUCCoreDownloadUrl.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.requestPostMessageChannelWithExtras = NXH5PageAdapter.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.postMessage = setContainsEmbedView.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.updateVisuals = getWebViewIndex.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        this.ICustomTabsService$Default = getSpecialRestoreView.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        setMin setmin = new setMin(r1);
        this.IPostMessageService = setmin;
        this.ICustomTabsService$Stub = setOptionMenu.create(setmin);
        this.ICustomTabsService$Stub$Proxy = H5ServiceWorkerHook4Bridge.create(this.length, this.setMin, this.FastBitmap$CoordinateSystem);
        b.C0007b<BLEServiceUnit> min3 = isScrap.getMin(getWebSocketURLPrefixForDebug.setMin(this.onNavigationEvent, this.onMessageChannelReady, this.extraCallbackWithResult, this.extraCallback, this.onRelationshipValidationResult, this.onPostMessage, this.onTransact, this.ICustomTabsCallback$Default, LocationBridgeExtension.AnonymousClass4.setMax(), this.asBinder, this.ICustomTabsCallback$Stub, this.asInterface, this.setDefaultImpl, this.ICustomTabsCallback$Stub$Proxy, this.getDefaultImpl, this.ICustomTabsService, this.getInterfaceDescriptor, this.newSession, this.warmup, this.mayLaunchUrl, this.newSessionWithExtras, this.extraCommand, this.validateRelationship, this.requestPostMessageChannel, this.requestPostMessageChannelWithExtras, this.postMessage, this.updateVisuals, this.ICustomTabsService$Default, this.ICustomTabsService$Stub, this.ICustomTabsService$Stub$Proxy));
        this.receiveFile = min3;
        this.onExtraCallback = isScrap.getMin(SerialContext.length(globalNetworkModule, min3));
    }

    public static final class setMax {
        public PayQrModule getMax;
        public OfflinePayModule getMin;
        public PrepareException.AnonymousClass1 setMax;
        public GlobalNetworkModule setMin;

        public /* synthetic */ setMax(byte b) {
            this();
        }

        private setMax() {
        }
    }

    static class toIntRange implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 getMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<getScheme> {
        private final PrepareException.AnonymousClass1 getMin;

        isInside(PrepareException.AnonymousClass1 r1) {
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

    static class length implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 length;

        length(PrepareException.AnonymousClass1 r1) {
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

    static class IsOverlapping implements b.C0007b<setFireMoment> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            setFireMoment IsOverlapping = this.setMax.IsOverlapping();
            if (IsOverlapping != null) {
                return IsOverlapping;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<onWebViewDestory> {
        private final PrepareException.AnonymousClass1 setMax;

        getMax(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 setMax;

        equals(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.setMax.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 getMin;

        getMin(PrepareException.AnonymousClass1 r1) {
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

    static class setMin implements b.C0007b<enableBackButton> {
        private final PrepareException.AnonymousClass1 length;

        setMin(PrepareException.AnonymousClass1 r1) {
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

    public final void setMin(ZoomDialog zoomDialog) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(zoomDialog, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub2 = this.getMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub2 != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub2;
                appxLoadFailed length2 = this.getMax.length();
                if (length2 != null) {
                    appxLoadFailed appxloadfailed = length2;
                    getScheme min = this.getMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals2 = this.getMax.updateVisuals();
                        if (updateVisuals2 != null) {
                            matchInfo.length(zoomDialog, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals2)));
                            AppLifeCycleObserver IPostMessageService$Stub$Proxy2 = this.getMax.IPostMessageService$Stub$Proxy();
                            if (IPostMessageService$Stub$Proxy2 != null) {
                                DefaultHttpRequestAPIExtension.setMin(zoomDialog, IPostMessageService$Stub$Proxy2);
                                DefaultHttpRequestAPIExtension.length(zoomDialog, this.toFloatRange.get());
                                DefaultHttpRequestAPIExtension.length(zoomDialog, this.b.get());
                                DefaultHttpRequestAPIExtension.length(zoomDialog, this.onExtraCallback.get());
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
