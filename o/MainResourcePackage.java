package o;

import android.content.Context;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.challenge.pin.PinChallengeFragment;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.contract.promocenter.PromoCategoryModule;
import id.dana.contract.staticqr.GetStaticQrModule;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.PinChallengeModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.di.modules.PromoBannerModule;
import id.dana.domain.qrbarcode.interactor.GetUserStaticQr;
import id.dana.myprofile.ProfileQrisDialogActivity;
import id.dana.playstorereview.PlayStoreReviewActivity;
import id.dana.richview.PromoBannerView;
import id.dana.richview.promocenter.PromoCategoryView;
import o.AppPreDownloadCacheManager;
import o.BackoffPolicy;
import o.BluetoothCrashResolver;
import o.DebugMonitor;
import o.GriverAppUpdater;
import o.GriverAppXInterceptor;
import o.GriverBridgeManifest;
import o.GriverCaptureActivity;
import o.GriverConfigProxy;
import o.GriverMonitor;
import o.OnTouch;
import o.PdfImageSource;
import o.PdfViewerActivity;
import o.PrepareException;
import o.R;
import o.ShareRecyclerAdapter;
import o.ZoomRecyclerView;
import o.b;
import o.getTransitionProperties;
import o.isMainThread;

public final class MainResourcePackage implements ConnectSocketInterceptPoint {
    private b.C0007b<getPerformanceTracker> FastBitmap$CoordinateSystem;
    private b.C0007b<getCommonResources> Grayscale$Algorithm;
    private b.C0007b<createNewStatement> ICustomTabsCallback;
    private b.C0007b<SavedStateRegistry$1> ICustomTabsCallback$Default;
    private b.C0007b<onBatchScanResults> ICustomTabsCallback$Stub;
    private b.C0007b<TypeConverters> ICustomTabsCallback$Stub$Proxy;
    private b.C0007b<SkipQueryVerification> ICustomTabsService;
    private b.C0007b<getCursiveFontFamily> IsOverlapping;
    private b.C0007b<onDescriptorWrite> Mean$Arithmetic;
    private b.C0007b<forceFlush> asBinder;
    private b.C0007b<queryLocalIdByPath> asInterface;
    private b.C0007b<handleTinyAppKeyEvent> b;
    private b.C0007b<onValidateSchema> create;
    private b.C0007b<setDefaultFontSize> equals;
    private b.C0007b<release> extraCallback;
    private b.C0007b<createSplashFragment> extraCallbackWithResult;
    private b.C0007b<H5Utils> getCause;
    private b.C0007b<getIconDrawable> getDefaultImpl;
    private b.C0007b<isMainThread.getMax> getInterfaceDescriptor;
    private b.C0007b<isMainThread.getMin> getMax;
    private b.C0007b<getScheme> getMin;
    private b.C0007b<setDomStorageEnabled> hashCode;
    private b.C0007b<sendData> invoke;
    private b.C0007b<ShareRecyclerAdapter.ShareViewHolder> invokeSuspend;
    private b.C0007b<DebugMonitor> isInside;
    private b.C0007b<appxLoadFailed> length;
    private b.C0007b<GriverSplashFragmentExtension> onMessageChannelReady;
    private b.C0007b<GriverMonitor.AnonymousClass2> onNavigationEvent;
    private b.C0007b<Embedded> onPostMessage;
    private b.C0007b<createQuery> onRelationshipValidationResult;
    private b.C0007b<GriverFileAbilityImpl> onTransact;
    private b.C0007b<onGeolocationPermissionsHidePrompt> setDefaultImpl;
    private b.C0007b<GriverLogger> setMax;
    private final PrepareException.AnonymousClass1 setMin;
    private b.C0007b<Context> toDoubleRange;
    private b.C0007b<setDatabasePath> toFloatRange;
    private b.C0007b<GriverMonitorAnalyticsConfigManager> toIntRange;
    private b.C0007b<clearCache> toString;
    private b.C0007b<GriverCreateDialogParam> valueOf;
    private b.C0007b<UpdateAppCallback> values;

    public final class MainResourceDownloadCallback implements interceptConnectSocket {
        private b.C0007b<ZoomRecyclerView.AnonymousClass1> equals;
        private b.C0007b<BackoffPolicy.setMax> getMax;
        private b.C0007b<GriverResourceManager> getMin;
        private b.C0007b<Context> isInside;
        private b.C0007b<getDefaultSyncJsApiSet> length;
        private b.C0007b<getScheme> setMax;
        private b.C0007b<appxLoadFailed> setMin;
        private b.C0007b<BackoffPolicy.length> toFloatRange;
        private b.C0007b<DirectExecutor> toIntRange;

        public /* synthetic */ MainResourceDownloadCallback(PromoCategoryModule promoCategoryModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(promoCategoryModule, r2);
        }

        private MainResourceDownloadCallback(PromoCategoryModule promoCategoryModule, PrepareException.AnonymousClass1 r5) {
            this.getMax = isScrap.getMin(ExistingPeriodicWorkPolicy.setMin(promoCategoryModule));
            this.setMin = new setMax(r5);
            this.setMax = new setMin(r5);
            getMin getmin = new getMin(r5);
            this.getMin = getmin;
            this.length = GriverPrepareController.create(this.setMin, this.setMax, getmin);
            length length2 = new length(r5);
            this.isInside = length2;
            onAnimationCancel length3 = onAnimationCancel.length(length2);
            this.equals = length3;
            ExistingWorkPolicy max = ExistingWorkPolicy.getMax(this.getMax, this.length, length3, this.isInside);
            this.toIntRange = max;
            this.toFloatRange = isScrap.getMin(ListenableWorker.setMin(promoCategoryModule, max));
        }

        public static final class getMax {
            public PrepareException.AnonymousClass1 length;
            public PromoCategoryModule setMax;

            public /* synthetic */ getMax(byte b) {
                this();
            }

            private getMax() {
            }
        }

        static class setMax implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 setMax;

            setMax(PrepareException.AnonymousClass1 r1) {
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

        static class setMin implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 length;

            setMin(PrepareException.AnonymousClass1 r1) {
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

        static class getMin implements b.C0007b<GriverResourceManager> {
            private final PrepareException.AnonymousClass1 length;

            getMin(PrepareException.AnonymousClass1 r1) {
                this.length = r1;
            }

            public final /* synthetic */ Object get() {
                GriverResourceManager INotificationSideChannel = this.length.INotificationSideChannel();
                if (INotificationSideChannel != null) {
                    return INotificationSideChannel;
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

        public final void getMin(PromoCategoryView promoCategoryView) {
            isXiaoMi3.getMax(promoCategoryView, this.toFloatRange.get());
        }
    }

    /* renamed from: o.MainResourcePackage$3  reason: invalid class name */
    public final class AnonymousClass3 implements JSON {
        private b.C0007b<PdfViewerActivity.PageAdapter.AnonymousClass1> IsOverlapping;
        private b.C0007b<PdfImageSource.length> equals;
        private b.C0007b<stringify> getMax;
        private b.C0007b<appxLoadFailed> getMin;
        private b.C0007b<PdfImageSource.setMin> isInside;
        private final PrepareException.AnonymousClass1 length;
        private b.C0007b<getScheme> setMax;
        private b.C0007b<dynamicProxy> setMin;
        private b.C0007b<CommonUtil> toIntRange;

        public /* synthetic */ AnonymousClass3(PlayStoreReviewModules playStoreReviewModules, PrepareException.AnonymousClass1 r2, byte b) {
            this(playStoreReviewModules, r2);
        }

        private AnonymousClass3(PlayStoreReviewModules playStoreReviewModules, PrepareException.AnonymousClass1 r4) {
            this.length = r4;
            this.getMin = new length(r4);
            this.setMax = new getMax(r4);
            setMin setmin = new setMin(r4);
            this.setMin = setmin;
            this.getMax = dumpFile.create(this.getMin, this.setMax, setmin);
            this.toIntRange = initialValue.create(this.getMin, this.setMax, this.setMin);
            b.C0007b<PdfImageSource.length> min = isScrap.getMin(GriverConfigConstants.length(playStoreReviewModules));
            this.equals = min;
            PdfViewerActivity.DividerGridItemDecoration max = PdfViewerActivity.DividerGridItemDecoration.setMax(this.getMax, this.toIntRange, min);
            this.IsOverlapping = max;
            this.isInside = isScrap.getMin(dispatchTouchEvent.setMax(playStoreReviewModules, max));
        }

        /* renamed from: o.MainResourcePackage$3$getMin */
        public static final class getMin {
            public PrepareException.AnonymousClass1 getMax;
            public PlayStoreReviewModules getMin;

            public /* synthetic */ getMin(byte b) {
                this();
            }

            private getMin() {
            }
        }

        /* renamed from: o.MainResourcePackage$3$length */
        static class length implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 getMin;

            length(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$3$getMax */
        static class getMax implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 setMax;

            getMax(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$3$setMin */
        static class setMin implements b.C0007b<dynamicProxy> {
            private final PrepareException.AnonymousClass1 setMin;

            setMin(PrepareException.AnonymousClass1 r1) {
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

        public final void setMax(PlayStoreReviewActivity playStoreReviewActivity) {
            AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.length.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy != null) {
                matchInfo.setMin(playStoreReviewActivity, IPostMessageService$Stub$Proxy);
                applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub;
                    appxLoadFailed length2 = this.length.length();
                    if (length2 != null) {
                        appxLoadFailed appxloadfailed = length2;
                        getScheme min = this.length.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals = this.length.updateVisuals();
                            if (updateVisuals != null) {
                                matchInfo.length(playStoreReviewActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                                destory.setMax(playStoreReviewActivity, this.isInside.get());
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

    /* renamed from: o.MainResourcePackage$1  reason: invalid class name */
    public final class AnonymousClass1 implements toJSONStringWithDateFormat {
        private b.C0007b<setMenus> FastBitmap$CoordinateSystem;
        private b.C0007b<GriverAppUpdater> IsOverlapping;
        private b.C0007b<GriverExtensionRegistry> Mean$Arithmetic;
        private b.C0007b<setMinimumLogicalFontSize> equals;
        private final PromoBannerModule getMax;
        private b.C0007b<setDefaultFontSize> getMin;
        private b.C0007b<setOverride> hashCode;
        private b.C0007b<GriverBridgeManifest.setMax> isInside;
        private b.C0007b<getScheme> length;
        private b.C0007b<savePassword> setMax;
        private b.C0007b<appxLoadFailed> setMin;
        private b.C0007b<isOverride> toDoubleRange;
        private b.C0007b<GriverAppXInterceptor.AnonymousClass1> toFloatRange;
        private b.C0007b<toolbarMenuClicked> toIntRange;
        private b.C0007b<Context> toString;
        private b.C0007b<setReset> values;

        public /* synthetic */ AnonymousClass1(PromoBannerModule promoBannerModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(promoBannerModule, r2);
        }

        private AnonymousClass1(PromoBannerModule promoBannerModule, PrepareException.AnonymousClass1 r12) {
            this.getMax = promoBannerModule;
            this.setMin = new isInside(r12);
            this.length = new length(r12);
            setMin setmin = new setMin(r12);
            this.getMin = setmin;
            this.setMax = overlayVerticalScrollbar.create(this.setMin, this.length, setmin);
            this.isInside = GriverConfigProxy.OnSectionConfigChangeListener.getMin(promoBannerModule);
            IsOverlapping isOverlapping = new IsOverlapping(r12);
            this.toFloatRange = isOverlapping;
            this.IsOverlapping = GriverAppUpdater.AnonymousClass1.create(this.setMin, this.length, isOverlapping);
            this.equals = setMinimumFontSize.create(this.getMin);
            getMax getmax = new getMax(r12);
            this.toIntRange = getmax;
            this.toDoubleRange = setRedDot.create(getmax);
            this.values = getColor.create(this.toIntRange);
            this.hashCode = setIcontype.create(this.toIntRange);
            this.FastBitmap$CoordinateSystem = setColor.create(this.toIntRange);
            this.toString = new getMin(r12);
            this.Mean$Arithmetic = isScrap.getMin(GriverMonitorAnalyticsTriggerExtension.getMax(this.setMax, this.isInside, this.IsOverlapping, this.equals, getTinyLocalStorage.getMin(), this.toDoubleRange, this.values, this.hashCode, this.FastBitmap$CoordinateSystem, this.toString));
        }

        /* renamed from: o.MainResourcePackage$1$setMax */
        public static final class setMax {
            public PromoBannerModule getMax;
            public PrepareException.AnonymousClass1 getMin;

            public /* synthetic */ setMax(byte b) {
                this();
            }

            private setMax() {
            }
        }

        /* renamed from: o.MainResourcePackage$1$isInside */
        static class isInside implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 setMin;

            isInside(PrepareException.AnonymousClass1 r1) {
                this.setMin = r1;
            }

            public final /* synthetic */ Object get() {
                appxLoadFailed length = this.setMin.length();
                if (length != null) {
                    return length;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.MainResourcePackage$1$length */
        static class length implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 length;

            length(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$1$setMin */
        static class setMin implements b.C0007b<setDefaultFontSize> {
            private final PrepareException.AnonymousClass1 setMin;

            setMin(PrepareException.AnonymousClass1 r1) {
                this.setMin = r1;
            }

            public final /* synthetic */ Object get() {
                setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
                if (updateVisuals != null) {
                    return updateVisuals;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.MainResourcePackage$1$IsOverlapping */
        static class IsOverlapping implements b.C0007b<GriverAppXInterceptor.AnonymousClass1> {
            private final PrepareException.AnonymousClass1 length;

            IsOverlapping(PrepareException.AnonymousClass1 r1) {
                this.length = r1;
            }

            public final /* synthetic */ Object get() {
                GriverAppXInterceptor.AnonymousClass1 b = this.length.b();
                if (b != null) {
                    return b;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.MainResourcePackage$1$getMax */
        static class getMax implements b.C0007b<toolbarMenuClicked> {
            private final PrepareException.AnonymousClass1 getMin;

            getMax(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                toolbarMenuClicked cause = this.getMin.getCause();
                if (cause != null) {
                    return cause;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.MainResourcePackage$1$getMin */
        static class getMin implements b.C0007b<Context> {
            private final PrepareException.AnonymousClass1 length;

            getMin(PrepareException.AnonymousClass1 r1) {
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

        public final void getMax(PromoBannerView promoBannerView) {
            GriverCaptureActivity.InnerHandler.length(promoBannerView, GriverConfigProxy.OnConfigChangeListener.getMax(this.getMax, this.Mean$Arithmetic.get()));
        }
    }

    /* renamed from: o.MainResourcePackage$2  reason: invalid class name */
    public final class AnonymousClass2 implements RVWebSocketProxy {
        private b.C0007b<getTransitionProperties.setMax> FastBitmap$CoordinateSystem;
        private b.C0007b<getLocalResponse> IsOverlapping;
        private b.C0007b<GetUserStaticQr> equals;
        private b.C0007b<GriverPrepareInterceptor> getMax;
        private b.C0007b<appxLoadFailed> getMin;
        private b.C0007b<setMediaPlaybackRequiresUserGesture> hashCode;
        private b.C0007b<matchInstances> invoke;
        private b.C0007b<R.dimen> isInside;
        private b.C0007b<OnTouch.length> length;
        private b.C0007b<getScheme> setMax;
        private final PrepareException.AnonymousClass1 setMin;
        private b.C0007b<Context> toDoubleRange;
        private b.C0007b<setDefaultFontSize> toFloatRange;
        private b.C0007b<removeApp> toIntRange;
        private b.C0007b<OnTouch.setMin> toString;
        private b.C0007b<getTransitionProperties.setMin> valueOf;
        private b.C0007b<getDefaultVideoPoster> values;

        public /* synthetic */ AnonymousClass2(GetStaticQrModule getStaticQrModule, GenerateDeepLinkModule generateDeepLinkModule, PrepareException.AnonymousClass1 r3, byte b) {
            this(getStaticQrModule, generateDeepLinkModule, r3);
        }

        private AnonymousClass2(GetStaticQrModule getStaticQrModule, GenerateDeepLinkModule generateDeepLinkModule, PrepareException.AnonymousClass1 r7) {
            this.setMin = r7;
            this.length = isScrap.getMin(Optional.getMax(getStaticQrModule));
            this.getMin = new equals(r7);
            this.setMax = new setMax(r7);
            IsOverlapping isOverlapping = new IsOverlapping(r7);
            this.getMax = isOverlapping;
            this.equals = AppPreDownloadCacheManager.create(this.getMin, this.setMax, isOverlapping);
            getMin getmin = new getMin(r7);
            this.toFloatRange = getmin;
            this.IsOverlapping = appForAppId.create(this.getMin, this.setMax, this.getMax, getmin);
            AppPreDownloadCacheManager.AnonymousClass1.AnonymousClass1 create = AppPreDownloadCacheManager.AnonymousClass1.AnonymousClass1.create(this.getMin, this.setMax, this.toFloatRange);
            this.toIntRange = create;
            b.C0007b<R.dimen> min = isScrap.getMin(R.color.length(this.length, this.equals, this.IsOverlapping, create));
            this.isInside = min;
            this.toString = isScrap.getMin(OnTextChanged$Callback.length(getStaticQrModule, min));
            this.toDoubleRange = new getMax(r7);
            length length2 = new length(r7);
            this.hashCode = length2;
            this.values = getVideoLoadingProgressView.create(this.getMin, this.setMax, length2);
            b.C0007b<getTransitionProperties.setMax> min2 = isScrap.getMin(getInterpolator.getMax(generateDeepLinkModule));
            this.FastBitmap$CoordinateSystem = min2;
            b.C0007b<matchInstances> min3 = isScrap.getMin(matchIds.setMin(this.toDoubleRange, this.values, min2));
            this.invoke = min3;
            this.valueOf = isScrap.getMin(createAnimator.getMin(generateDeepLinkModule, min3));
        }

        /* renamed from: o.MainResourcePackage$2$setMin */
        public static final class setMin {
            public GenerateDeepLinkModule getMax;
            public GetStaticQrModule setMax;
            public PrepareException.AnonymousClass1 setMin;

            public /* synthetic */ setMin(byte b) {
                this();
            }

            private setMin() {
            }
        }

        /* renamed from: o.MainResourcePackage$2$equals */
        static class equals implements b.C0007b<appxLoadFailed> {
            private final PrepareException.AnonymousClass1 length;

            equals(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$2$setMax */
        static class setMax implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 getMin;

            setMax(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$2$IsOverlapping */
        static class IsOverlapping implements b.C0007b<GriverPrepareInterceptor> {
            private final PrepareException.AnonymousClass1 setMax;

            IsOverlapping(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$2$getMin */
        static class getMin implements b.C0007b<setDefaultFontSize> {
            private final PrepareException.AnonymousClass1 setMax;

            getMin(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$2$getMax */
        static class getMax implements b.C0007b<Context> {
            private final PrepareException.AnonymousClass1 length;

            getMax(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.MainResourcePackage$2$length */
        static class length implements b.C0007b<setMediaPlaybackRequiresUserGesture> {
            private final PrepareException.AnonymousClass1 setMin;

            length(PrepareException.AnonymousClass1 r1) {
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

        public final void length(ProfileQrisDialogActivity profileQrisDialogActivity) {
            AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMin.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy != null) {
                matchInfo.setMin(profileQrisDialogActivity, IPostMessageService$Stub$Proxy);
                applyChanges ICustomTabsCallback$Stub = this.setMin.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub;
                    appxLoadFailed length2 = this.setMin.length();
                    if (length2 != null) {
                        appxLoadFailed appxloadfailed = length2;
                        getScheme min = this.setMin.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
                            if (updateVisuals != null) {
                                matchInfo.length(profileQrisDialogActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                                shareTinyAppMsg.getMax(profileQrisDialogActivity, this.toString.get());
                                shareTinyAppMsg.setMax(profileQrisDialogActivity, this.valueOf.get());
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

    public /* synthetic */ MainResourcePackage(PinChallengeModule pinChallengeModule, AuthenticationModule authenticationModule, PrepareException.AnonymousClass1 r3, byte b2) {
        this(pinChallengeModule, authenticationModule, r3);
    }

    private MainResourcePackage(PinChallengeModule pinChallengeModule, AuthenticationModule authenticationModule, PrepareException.AnonymousClass1 r18) {
        PrepareException.AnonymousClass1 r1 = r18;
        this.setMin = r1;
        this.getMax = isScrap.getMin(setExtensionImpl.setMin(pinChallengeModule));
        this.length = new hashCode(r1);
        this.getMin = new MainResourcePackage$FastBitmap$CoordinateSystem(r1);
        isInside isinside = new isInside(r1);
        this.setMax = isinside;
        this.isInside = DebugMonitor.AnonymousClass2.create(this.length, this.getMin, isinside);
        this.toIntRange = GriverMonitor.AnonymousClass7.create(this.length, this.getMin, this.setMax);
        toFloatRange tofloatrange = new toFloatRange(r1);
        this.equals = tofloatrange;
        this.toFloatRange = setAllowFileAccessFromFileURLs.create(this.length, this.getMin, tofloatrange);
        getMax getmax = new getMax(r1);
        this.IsOverlapping = getmax;
        this.toString = clearFormData.create(this.length, this.getMin, getmax);
        this.toDoubleRange = new setMax(r1);
        this.FastBitmap$CoordinateSystem = new equals(r1);
        this.hashCode = setAppCachePath.create(this.equals);
        this.values = new toString(r1);
        length length2 = new length(r1);
        this.Grayscale$Algorithm = length2;
        this.valueOf = GVLoadingView.create(this.length, this.getMin, length2);
        invokeSuspend invokesuspend = new invokeSuspend(r1);
        this.Mean$Arithmetic = invokesuspend;
        this.invoke = onConnectionStateChange.create(this.length, this.getMin, invokesuspend);
        ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1 min = ShareRecyclerAdapter.ShareViewHolder.AnonymousClass1.setMin(setAllBucketName.setMax());
        this.invokeSuspend = min;
        this.create = isScrap.getMin(validateMigration.length(this.getMax, this.isInside, this.toIntRange, this.toFloatRange, this.toString, this.toDoubleRange, this.FastBitmap$CoordinateSystem, this.hashCode, this.values, this.valueOf, this.invoke, min));
        analyticsMonitorEnabled create2 = analyticsMonitorEnabled.create(this.length, this.getMin, this.setMax);
        this.onNavigationEvent = create2;
        this.ICustomTabsCallback = isScrap.getMin(acquire.length(this.toDoubleRange, this.getMax, create2, this.toFloatRange, this.valueOf));
        values values2 = new values(r1);
        this.getCause = values2;
        needAddHeader create3 = needAddHeader.create(this.length, this.getMin, values2);
        this.b = create3;
        this.onRelationshipValidationResult = onPreMigrate.setMax(this.toDoubleRange, this.getMax, create3);
        toIntRange tointrange = new toIntRange(r1);
        this.onMessageChannelReady = tointrange;
        this.extraCallbackWithResult = fail.create(tointrange);
        b.C0007b<Embedded> min2 = isScrap.getMin(CollectionCodec.getMax(authenticationModule));
        this.onPostMessage = min2;
        this.extraCallback = Transaction.setMin(this.toDoubleRange, this.extraCallbackWithResult, this.valueOf, min2, this.getMax);
        IsOverlapping isOverlapping = new IsOverlapping(r1);
        this.onTransact = isOverlapping;
        isLocalIdRes create4 = isLocalIdRes.create(isOverlapping);
        this.asInterface = create4;
        this.ICustomTabsCallback$Default = getParallaxDistance.getMax(this.toDoubleRange, this.getMax, create4);
        toDoubleRange todoublerange = new toDoubleRange(r1);
        this.ICustomTabsCallback$Stub = todoublerange;
        BluetoothCrashResolver.AnonymousClass1 create5 = BluetoothCrashResolver.AnonymousClass1.create(this.length, this.getMin, todoublerange);
        this.asBinder = create5;
        this.ICustomTabsCallback$Stub$Proxy = Recreator.length(create5, this.getMax);
        getMin getmin = new getMin(r1);
        this.setDefaultImpl = getmin;
        GriverBackButtonStyleExtension create6 = GriverBackButtonStyleExtension.create(getmin);
        this.getDefaultImpl = create6;
        getStmt length3 = getStmt.length(this.toDoubleRange, create6, this.getMax);
        this.ICustomTabsService = length3;
        this.getInterfaceDescriptor = isScrap.getMin(getExtensionImpl.getMax(pinChallengeModule, this.create, this.ICustomTabsCallback, this.onRelationshipValidationResult, this.extraCallback, this.ICustomTabsCallback$Default, this.ICustomTabsCallback$Stub$Proxy, length3));
    }

    public static final class setMin {
        public PinChallengeModule getMax;
        public PrepareException.AnonymousClass1 setMax;
        public AuthenticationModule setMin;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class hashCode implements b.C0007b<appxLoadFailed> {
        private final PrepareException.AnonymousClass1 length;

        hashCode(PrepareException.AnonymousClass1 r1) {
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

    static class isInside implements b.C0007b<GriverLogger> {
        private final PrepareException.AnonymousClass1 setMin;

        isInside(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverLogger Mean$Arithmetic = this.setMin.Mean$Arithmetic();
            if (Mean$Arithmetic != null) {
                return Mean$Arithmetic;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toFloatRange implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 setMin;

        toFloatRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMax implements b.C0007b<getCursiveFontFamily> {
        private final PrepareException.AnonymousClass1 setMax;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            getCursiveFontFamily onExtraCallback = this.setMax.onExtraCallback();
            if (onExtraCallback != null) {
                return onExtraCallback;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class setMax implements b.C0007b<Context> {
        private final PrepareException.AnonymousClass1 length;

        setMax(PrepareException.AnonymousClass1 r1) {
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

    static class equals implements b.C0007b<getPerformanceTracker> {
        private final PrepareException.AnonymousClass1 length;

        equals(PrepareException.AnonymousClass1 r1) {
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

    static class toString implements b.C0007b<UpdateAppCallback> {
        private final PrepareException.AnonymousClass1 setMax;

        toString(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            UpdateAppCallback onRepeatModeChanged = this.setMax.onRepeatModeChanged();
            if (onRepeatModeChanged != null) {
                return onRepeatModeChanged;
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

    static class invokeSuspend implements b.C0007b<onDescriptorWrite> {
        private final PrepareException.AnonymousClass1 length;

        invokeSuspend(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onDescriptorWrite doubleRange = this.length.toDoubleRange();
            if (doubleRange != null) {
                return doubleRange;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class values implements b.C0007b<H5Utils> {
        private final PrepareException.AnonymousClass1 setMin;

        values(PrepareException.AnonymousClass1 r1) {
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

    static class toIntRange implements b.C0007b<GriverSplashFragmentExtension> {
        private final PrepareException.AnonymousClass1 setMin;

        toIntRange(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            GriverSplashFragmentExtension MediaDescriptionCompat = this.setMin.MediaDescriptionCompat();
            if (MediaDescriptionCompat != null) {
                return MediaDescriptionCompat;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class IsOverlapping implements b.C0007b<GriverFileAbilityImpl> {
        private final PrepareException.AnonymousClass1 setMax;

        IsOverlapping(PrepareException.AnonymousClass1 r1) {
            this.setMax = r1;
        }

        public final /* synthetic */ Object get() {
            GriverFileAbilityImpl RatingCompat = this.setMax.RatingCompat();
            if (RatingCompat != null) {
                return RatingCompat;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class toDoubleRange implements b.C0007b<onBatchScanResults> {
        private final PrepareException.AnonymousClass1 getMax;

        toDoubleRange(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        public final /* synthetic */ Object get() {
            onBatchScanResults validateRelationship = this.getMax.validateRelationship();
            if (validateRelationship != null) {
                return validateRelationship;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    static class getMin implements b.C0007b<onGeolocationPermissionsHidePrompt> {
        private final PrepareException.AnonymousClass1 length;

        getMin(PrepareException.AnonymousClass1 r1) {
            this.length = r1;
        }

        public final /* synthetic */ Object get() {
            onGeolocationPermissionsHidePrompt onVolumeInfoChanged = this.length.onVolumeInfoChanged();
            if (onVolumeInfoChanged != null) {
                return onVolumeInfoChanged;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMax(PinChallengeFragment pinChallengeFragment) {
        getShortName ITrustedWebActivityCallback$Default = this.setMin.ITrustedWebActivityCallback$Default();
        if (ITrustedWebActivityCallback$Default != null) {
            onPostMigrate.getMin(pinChallengeFragment, ITrustedWebActivityCallback$Default);
            onPostMigrate.getMax(pinChallengeFragment, this.getInterfaceDescriptor.get());
            return;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
