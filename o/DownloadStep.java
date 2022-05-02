package o;

import android.content.Context;
import dagger.Component;
import id.dana.AppLifeCycleObserver;
import id.dana.ConnectionStatusReceiver;
import id.dana.appshortcut.DanaAppShortcut;
import id.dana.appwidget.DanaIncomeWidgetProvider;
import id.dana.appwidget.DanaQuickActionMediumWidgetProvider;
import id.dana.appwidget.DanaQuickActionWidgetProvider;
import id.dana.appwidget.DanaStatementLargeWidgetProvider;
import id.dana.appwidget.DanaStatementMediumWidgetProvider;
import id.dana.appwidget.DanaStatementWidgetProvider;
import id.dana.appwidget.collectionview.StatementDataProvider;
import id.dana.contract.exploredana.ExploreDanaModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.DanaAppShortcutModule;
import id.dana.di.modules.DanaAppWidgetModule;
import id.dana.di.modules.DonationModule;
import id.dana.di.modules.ExpiryModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.SavingModule;
import id.dana.di.modules.WithdrawSavingModule;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.media.exploredana.exoplayer.ExoPlayerActivity;
import id.dana.richview.boundcard.DanaBalanceCardView;
import id.dana.richview.boundcard.DebitCardView;
import id.dana.richview.donation.DonationView;
import id.dana.richview.exploredana.ExploreDanaView;
import id.dana.savings.withdrawal.WithdrawalSavingBottomSheetDialog;
import id.dana.sendmoney.view.ExpireTimeView;
import id.dana.sendmoney.voucher.VoucherDetailActivity;
import id.dana.tncagreement.TermsAndConditionsActivity;
import kotlin.Metadata;
import o.BLEManager;
import o.GriverPhotoSelectActivity;
import o.H5Event;
import o.INebulaPage;
import o.LocationBridgeExtension;
import o.PrepareException;
import o.PropertyNamingStrategy;
import o.SightCameraView;
import o.SightCameraViewImpl;
import o.b;
import o.onFrameData;
import o.onNext;
import o.updateScreenRotation;
import org.jetbrains.annotations.NotNull;

public final class DownloadStep implements readAfter {
    private final PrepareException.AnonymousClass1 setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/DanaAppShortcutComponent;", "", "inject", "", "danaAppShortcut", "Lid/dana/appshortcut/DanaAppShortcut;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DanaAppShortcutModule.class})
    /* renamed from: o.DownloadStep$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void setMax(@NotNull DanaAppShortcut danaAppShortcut);
    }

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ExpiryModule.class})
    public interface MyPluginDownloadCallback {

        @PerActivity
        @Component(dependencies = {PrepareException.AnonymousClass1.class})
        /* renamed from: o.DownloadStep$MyPluginDownloadCallback$1  reason: invalid class name */
        public interface AnonymousClass1 {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/DonationComponent;", "", "inject", "", "donationView", "Lid/dana/richview/donation/DonationView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            @PerActivity
            @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DonationModule.class})
            /* renamed from: o.DownloadStep$MyPluginDownloadCallback$1$1  reason: invalid class name */
            public interface AnonymousClass1 {
                void setMin(@NotNull DonationView donationView);
            }

            void length(ExoPlayerActivity exoPlayerActivity);
        }

        void setMax(ExpireTimeView expireTimeView);
    }

    /* renamed from: o.DownloadStep$3  reason: invalid class name */
    public final class AnonymousClass3 implements PropertyNamingStrategy.AnonymousClass1 {
        private final PrepareException.AnonymousClass1 getMax;

        public /* synthetic */ AnonymousClass3(PrepareException.AnonymousClass1 r1, byte b) {
            this(r1);
        }

        private AnonymousClass3(PrepareException.AnonymousClass1 r1) {
            this.getMax = r1;
        }

        /* renamed from: o.DownloadStep$3$getMax */
        public static final class getMax {
            public PrepareException.AnonymousClass1 length;

            public /* synthetic */ getMax(byte b) {
                this();
            }

            private getMax() {
            }
        }

        public final void setMin(VoucherDetailActivity voucherDetailActivity) {
            AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.getMax.IPostMessageService$Stub$Proxy();
            if (IPostMessageService$Stub$Proxy != null) {
                matchInfo.setMin(voucherDetailActivity, IPostMessageService$Stub$Proxy);
                applyChanges ICustomTabsCallback$Stub = this.getMax.ICustomTabsCallback$Stub();
                if (ICustomTabsCallback$Stub != null) {
                    applyChanges applychanges = ICustomTabsCallback$Stub;
                    appxLoadFailed length = this.getMax.length();
                    if (length != null) {
                        appxLoadFailed appxloadfailed = length;
                        getScheme min = this.getMax.getMin();
                        if (min != null) {
                            getScheme getscheme = min;
                            setDefaultFontSize updateVisuals = this.getMax.updateVisuals();
                            if (updateVisuals != null) {
                                matchInfo.length(voucherDetailActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
                                getShortName ITrustedWebActivityCallback$Default = this.getMax.ITrustedWebActivityCallback$Default();
                                if (ITrustedWebActivityCallback$Default != null) {
                                    fadeInFadeOut.getMax(voucherDetailActivity, ITrustedWebActivityCallback$Default);
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

    public /* synthetic */ DownloadStep(PrepareException.AnonymousClass1 r1, byte b) {
        this(r1);
    }

    private DownloadStep(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final class MyPackageDownloadCallback implements JSONCreator {
        private b.C0007b<setMultiFrameBeacon> IsOverlapping;
        private b.C0007b<getBluetoothName> equals;
        private b.C0007b<onDescriptorWrite> getMax;
        private b.C0007b<Context> getMin;
        private b.C0007b<afterReopen> isInside;
        private b.C0007b<getScheme> length;
        private b.C0007b<appxLoadFailed> setMax;
        private b.C0007b<onFrameData.getMin> setMin;
        private b.C0007b<setDataFields> toFloatRange;
        private b.C0007b<notifyCharacteristicValue> toIntRange;

        @PerActivity
        @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ExploreDanaModule.class})
        /* renamed from: o.DownloadStep$MyPackageDownloadCallback$1  reason: invalid class name */
        public interface AnonymousClass1 {

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lid/dana/di/component/DanaWidgetComponent;", "", "inject", "", "danaQuickActionWidgetProvider", "Lid/dana/appwidget/DanaQuickActionWidgetProvider;", "injectDanaStatementExpenseWidget", "danaStatementWidgetProvider", "Lid/dana/appwidget/DanaStatementWidgetProvider;", "injectDanaStatementIncomeWidget", "danaIncomeWidgetProvider", "Lid/dana/appwidget/DanaIncomeWidgetProvider;", "injectDanaStatementLargeWidget", "danaStatementLargeWidgetProvider", "Lid/dana/appwidget/DanaStatementLargeWidgetProvider;", "injectDanaStatementMediumWidget", "danaStatementMediumWidgetProvider", "Lid/dana/appwidget/DanaStatementMediumWidgetProvider;", "injectMediumQuickActionWidget", "danaQuickActionMedium", "Lid/dana/appwidget/DanaQuickActionMediumWidgetProvider;", "injectStatementDataProvider", "statementDataProvider", "Lid/dana/appwidget/collectionview/StatementDataProvider;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            @PerActivity
            @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DanaAppWidgetModule.class})
            /* renamed from: o.DownloadStep$MyPackageDownloadCallback$1$1  reason: invalid class name */
            public interface AnonymousClass1 {
                void getMax(@NotNull DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider);

                void getMax(@NotNull StatementDataProvider statementDataProvider);

                void getMin(@NotNull DanaIncomeWidgetProvider danaIncomeWidgetProvider);

                void length(@NotNull DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider);

                void setMax(@NotNull DanaQuickActionWidgetProvider danaQuickActionWidgetProvider);

                void setMax(@NotNull DanaStatementWidgetProvider danaStatementWidgetProvider);

                void setMin(@NotNull DanaQuickActionMediumWidgetProvider danaQuickActionMediumWidgetProvider);
            }

            void setMin(ExploreDanaView exploreDanaView);
        }

        public /* synthetic */ MyPackageDownloadCallback(WithdrawSavingModule withdrawSavingModule, PrepareException.AnonymousClass1 r2, byte b) {
            this(withdrawSavingModule, r2);
        }

        private MyPackageDownloadCallback(WithdrawSavingModule withdrawSavingModule, PrepareException.AnonymousClass1 r5) {
            this.setMin = isScrap.getMin(getMerchantId.length(withdrawSavingModule));
            this.getMin = new getMin(r5);
            this.setMax = new length(r5);
            this.length = new setMax(r5);
            toIntRange tointrange = new toIntRange(r5);
            this.getMax = tointrange;
            this.toIntRange = BLEManager.AnonymousClass2.create(this.setMax, this.length, tointrange);
            getMax getmax = new getMax(r5);
            this.equals = getmax;
            this.toFloatRange = setParserIdentifier.create(getmax);
            unbindService create = unbindService.create(this.equals);
            this.IsOverlapping = create;
            this.isInside = isScrap.getMin(startPreview.getMin(this.setMin, this.getMin, this.toIntRange, this.toFloatRange, create));
        }

        public static final class setMin {
            public WithdrawSavingModule getMin;
            public PrepareException.AnonymousClass1 length;

            public /* synthetic */ setMin(byte b) {
                this();
            }

            private setMin() {
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

        static class setMax implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 setMin;

            setMax(PrepareException.AnonymousClass1 r1) {
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

        static class toIntRange implements b.C0007b<onDescriptorWrite> {
            private final PrepareException.AnonymousClass1 setMax;

            toIntRange(PrepareException.AnonymousClass1 r1) {
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

        static class getMax implements b.C0007b<getBluetoothName> {
            private final PrepareException.AnonymousClass1 setMax;

            getMax(PrepareException.AnonymousClass1 r1) {
                this.setMax = r1;
            }

            public final /* synthetic */ Object get() {
                getBluetoothName onCaptioningEnabledChanged = this.setMax.onCaptioningEnabledChanged();
                if (onCaptioningEnabledChanged != null) {
                    return onCaptioningEnabledChanged;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void length(WithdrawalSavingBottomSheetDialog withdrawalSavingBottomSheetDialog) {
            checkFilter.length(withdrawalSavingBottomSheetDialog, this.isInside.get());
        }
    }

    public static final class getMax {
        public PrepareException.AnonymousClass1 getMin;

        public /* synthetic */ getMax(byte b) {
            this();
        }

        private getMax() {
        }
    }

    /* renamed from: o.DownloadStep$2  reason: invalid class name */
    public final class AnonymousClass2 implements flush {
        private b.C0007b<H5Event.Builder> FastBitmap$CoordinateSystem;
        private b.C0007b<INebulaPage.H5PageHandler> Grayscale$Algorithm;
        private b.C0007b<NXH5WebViewClientAdapter> ICustomTabsCallback;
        private b.C0007b<enableBackButton> ICustomTabsCallback$Default;
        private b.C0007b<setH5OverScrollListener> ICustomTabsCallback$Stub;
        private b.C0007b<toStringBuilder> ICustomTabsCallback$Stub$Proxy;
        private b.C0007b<getBluetoothName> ICustomTabsService;
        private b.C0007b<H5DataProvider> IsOverlapping;
        private b.C0007b<shouldExit> Mean$Arithmetic;
        private b.C0007b<IH5EmbedViewJSCallback> asBinder;
        private b.C0007b<sendServiceWorkerPushMessage> asInterface;
        private b.C0007b<releaseView> b;
        private b.C0007b<hasPageStartButNoInterceptRequest> create;
        private b.C0007b<isKeepCallback> equals;
        private b.C0007b<enableUCCorePreheadInit> extraCallback;
        private b.C0007b<getWebViewCoreSoPath> extraCallbackWithResult;
        private b.C0007b<setBeaconTypeCode> extraCommand;
        private b.C0007b<getShareUrl> getCause;
        private b.C0007b<BLEServiceUnit> getDefaultImpl;
        private b.C0007b<onNext.setMin> getInterfaceDescriptor;
        private b.C0007b<getScheme> getMax;
        private final PrepareException.AnonymousClass1 getMin;
        private b.C0007b<getEmbededViewProvider> hashCode;
        private b.C0007b<getInternalContentView> invoke;
        private b.C0007b<isDispatcherOnWorkerThread> invokeSuspend;
        private b.C0007b<ifContainsEmbedSurfaceView> isInside;
        private b.C0007b<onNext.length> length;
        private b.C0007b<setDefaultFontSize> mayLaunchUrl;
        private b.C0007b<setManufacturer> newSession;
        private b.C0007b<notifyCharacteristicValue> newSessionWithExtras;
        private b.C0007b<getRedirectUrl> onMessageChannelReady;
        private b.C0007b<cannotInitUC> onNavigationEvent;
        private b.C0007b<setEventSource> onPostMessage;
        private b.C0007b<NXH5WebViewAdapter> onRelationshipValidationResult;
        private b.C0007b<GetAuthCode> onTransact;
        private b.C0007b<updateScreenRotation.setMin> postMessage;
        private b.C0007b<isExtraBeaconData> requestPostMessageChannel;
        private b.C0007b<SightCameraView.OnScrollListener> requestPostMessageChannelWithExtras;
        private b.C0007b<updateScreenRotation.getMax> setDefaultImpl;
        private b.C0007b<onWebViewDestory> setMax;
        private b.C0007b<appxLoadFailed> setMin;
        private b.C0007b<Context> toDoubleRange;
        private b.C0007b<onDescriptorWrite> toFloatRange;
        private b.C0007b<ifContainsEmbedView> toIntRange;
        private b.C0007b<keepCallback> toString;
        private b.C0007b<setTxPower> updateVisuals;
        private b.C0007b<isCanceled> valueOf;
        private b.C0007b<H5ServiceWorkerControllerProvider> values;
        private b.C0007b<setAllowUniversalAccessFromFileURLs> warmup;

        /* synthetic */ AnonymousClass2(GlobalNetworkModule globalNetworkModule, SavingModule savingModule, PrepareException.AnonymousClass1 r3, byte b2) {
            this(globalNetworkModule, savingModule, r3);
        }

        private AnonymousClass2(GlobalNetworkModule globalNetworkModule, SavingModule savingModule, PrepareException.AnonymousClass1 r36) {
            PrepareException.AnonymousClass1 r1 = r36;
            this.getMin = r1;
            this.length = isScrap.getMin(setTypeKey.setMax(globalNetworkModule));
            this.setMin = new equals(r1);
            this.getMax = new toIntRange(r1);
            getMax getmax = new getMax(r1);
            this.setMax = getmax;
            this.toIntRange = INebulaPage.create(this.setMin, this.getMax, getmax);
            this.isInside = onReceiveValue.create(this.setMin, this.getMax, this.setMax);
            DownloadStep$2$FastBitmap$CoordinateSystem downloadStep$2$FastBitmap$CoordinateSystem = new DownloadStep$2$FastBitmap$CoordinateSystem(r1);
            this.toFloatRange = downloadStep$2$FastBitmap$CoordinateSystem;
            this.equals = eventSource.create(this.setMin, this.getMax, this.setMax, downloadStep$2$FastBitmap$CoordinateSystem);
            this.IsOverlapping = has.create(this.setMin, this.getMax, this.setMax);
            this.hashCode = scriptbizLoadedAndBridgeLoaded.create(this.setMin, this.getMax, this.setMax);
            this.values = H5ScrollChangedCallback.create(this.setMin, this.getMax, this.setMax);
            this.toString = H5Event.AnonymousClass1.create(this.setMax);
            this.FastBitmap$CoordinateSystem = H5OverScrollListener.create(this.setMin, this.getMax, this.setMax);
            this.toDoubleRange = new setMin(r1);
            this.invokeSuspend = getH5page.create(this.setMin, this.getMax, this.setMax);
            this.valueOf = setTarget.create(this.setMax);
            this.Grayscale$Algorithm = setHandler.create(this.setMin, this.getMax, this.setMax);
            this.invoke = getWebChromeClient.create(this.setMin, this.getMax, this.setMax);
            this.Mean$Arithmetic = setContainsEmbedSurfaceView.create(this.setMin, this.getMax, this.setMax);
            this.ICustomTabsCallback = getWebViewClient.create(this.setMin, this.getMax, this.setMax);
            this.getCause = getUcVersion.create(this.setMin, this.getMax, this.setMax);
            this.onNavigationEvent = getUCSdkVersion.create(this.setMin, this.getMax, this.setMax);
            this.create = createWebView.create(this.setMin, this.getMax, this.setMax);
            this.b = H5Event.create(this.setMin, this.getMax, this.setMax);
            this.onPostMessage = getEventSource.create(this.setMax);
            this.onMessageChannelReady = NXUcService.create(this.setMin, this.getMax, this.setMax);
            this.extraCallbackWithResult = getUCCoreDownloadUrl.create(this.setMin, this.getMax, this.setMax);
            this.onRelationshipValidationResult = NXH5PageAdapter.create(this.setMin, this.getMax, this.setMax);
            this.extraCallback = setContainsEmbedView.create(this.setMin, this.getMax, this.setMax);
            this.ICustomTabsCallback$Stub = getWebViewIndex.create(this.setMin, this.getMax, this.setMax);
            this.asBinder = getSpecialRestoreView.create(this.setMin, this.getMax, this.setMax);
            length length2 = new length(r1);
            this.ICustomTabsCallback$Default = length2;
            this.onTransact = setOptionMenu.create(length2);
            this.asInterface = H5ServiceWorkerHook4Bridge.create(this.setMin, this.getMax, this.setMax);
            b.C0007b<BLEServiceUnit> min = isScrap.getMin(getWebSocketURLPrefixForDebug.setMin(this.length, this.toIntRange, this.isInside, this.equals, this.IsOverlapping, this.hashCode, this.values, this.toString, LocationBridgeExtension.AnonymousClass4.setMax(), this.FastBitmap$CoordinateSystem, this.toDoubleRange, this.invokeSuspend, this.valueOf, this.Grayscale$Algorithm, this.invoke, this.Mean$Arithmetic, this.ICustomTabsCallback, this.getCause, this.onNavigationEvent, this.create, this.b, this.onPostMessage, this.onMessageChannelReady, this.extraCallbackWithResult, this.onRelationshipValidationResult, this.extraCallback, this.ICustomTabsCallback$Stub, this.asBinder, this.onTransact, this.asInterface));
            this.getDefaultImpl = min;
            this.getInterfaceDescriptor = isScrap.getMin(SerialContext.length(globalNetworkModule, min));
            this.setDefaultImpl = isScrap.getMin(setInputStream.setMax(savingModule));
            this.ICustomTabsService = new IsOverlapping(r1);
            isInside isinside = new isInside(r1);
            this.ICustomTabsCallback$Stub$Proxy = isinside;
            this.extraCommand = setId3.create(this.ICustomTabsService, isinside);
            this.newSessionWithExtras = BLEManager.AnonymousClass2.create(this.setMin, this.getMax, this.toFloatRange);
            this.newSession = setBluetoothAddress.create(this.ICustomTabsService, this.ICustomTabsCallback$Stub$Proxy);
            getMin getmin = new getMin(r1);
            this.mayLaunchUrl = getmin;
            this.warmup = getAllowUniversalAccessFromFileURLs.create(getmin);
            toFloatRange tofloatrange = new toFloatRange(r1);
            this.requestPostMessageChannel = tofloatrange;
            setServiceUuid create2 = setServiceUuid.create(tofloatrange);
            this.updateVisuals = create2;
            b.C0007b<SightCameraView.OnScrollListener> min2 = isScrap.getMin(SightCameraViewImpl.AnonymousClass1.setMin(this.toDoubleRange, this.setDefaultImpl, this.extraCommand, this.newSessionWithExtras, this.newSession, this.warmup, create2));
            this.requestPostMessageChannelWithExtras = min2;
            this.postMessage = isScrap.getMin(setRequestData.setMin(savingModule, min2));
        }

        /* renamed from: o.DownloadStep$2$setMax */
        public static final class setMax {
            public GlobalNetworkModule getMax;
            public PrepareException.AnonymousClass1 getMin;
            public SavingModule length;

            public /* synthetic */ setMax(byte b) {
                this();
            }

            private setMax() {
            }

            public final flush length() {
                stopIgnoring.setMin(this.getMax, GlobalNetworkModule.class);
                stopIgnoring.setMin(this.length, SavingModule.class);
                stopIgnoring.setMin(this.getMin, PrepareException.AnonymousClass1.class);
                return new AnonymousClass2(this.getMax, this.length, this.getMin, (byte) 0);
            }
        }

        /* renamed from: o.DownloadStep$2$equals */
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

        /* renamed from: o.DownloadStep$2$toIntRange */
        static class toIntRange implements b.C0007b<getScheme> {
            private final PrepareException.AnonymousClass1 length;

            toIntRange(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.DownloadStep$2$getMax */
        static class getMax implements b.C0007b<onWebViewDestory> {
            private final PrepareException.AnonymousClass1 length;

            getMax(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.DownloadStep$2$setMin */
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

        /* renamed from: o.DownloadStep$2$length */
        static class length implements b.C0007b<enableBackButton> {
            private final PrepareException.AnonymousClass1 getMax;

            length(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.DownloadStep$2$IsOverlapping */
        static class IsOverlapping implements b.C0007b<getBluetoothName> {
            private final PrepareException.AnonymousClass1 getMax;

            IsOverlapping(PrepareException.AnonymousClass1 r1) {
                this.getMax = r1;
            }

            public final /* synthetic */ Object get() {
                getBluetoothName onCaptioningEnabledChanged = this.getMax.onCaptioningEnabledChanged();
                if (onCaptioningEnabledChanged != null) {
                    return onCaptioningEnabledChanged;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.DownloadStep$2$isInside */
        static class isInside implements b.C0007b<toStringBuilder> {
            private final PrepareException.AnonymousClass1 getMin;

            isInside(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                toStringBuilder IMediaControllerCallback$Stub = this.getMin.IMediaControllerCallback$Stub();
                if (IMediaControllerCallback$Stub != null) {
                    return IMediaControllerCallback$Stub;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        /* renamed from: o.DownloadStep$2$getMin */
        static class getMin implements b.C0007b<setDefaultFontSize> {
            private final PrepareException.AnonymousClass1 setMin;

            getMin(PrepareException.AnonymousClass1 r1) {
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

        /* renamed from: o.DownloadStep$2$toFloatRange */
        static class toFloatRange implements b.C0007b<isExtraBeaconData> {
            private final PrepareException.AnonymousClass1 getMin;

            toFloatRange(PrepareException.AnonymousClass1 r1) {
                this.getMin = r1;
            }

            public final /* synthetic */ Object get() {
                isExtraBeaconData onSessionReady = this.getMin.onSessionReady();
                if (onSessionReady != null) {
                    return onSessionReady;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable component method");
            }
        }

        public final void getMax(DanaBalanceCardView danaBalanceCardView) {
            getShortName ITrustedWebActivityCallback$Default = this.getMin.ITrustedWebActivityCallback$Default();
            if (ITrustedWebActivityCallback$Default != null) {
                GriverPhotoSelectActivity.AnonymousClass8.getMax(danaBalanceCardView, ITrustedWebActivityCallback$Default);
                GriverPhotoSelectActivity.AnonymousClass8.setMin(danaBalanceCardView, this.getInterfaceDescriptor.get());
                GriverPhotoSelectActivity.AnonymousClass8.setMax(danaBalanceCardView, this.postMessage.get());
                return;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }

        public final void length(DebitCardView debitCardView) {
            getListener.setMax(debitCardView, this.getInterfaceDescriptor.get());
        }
    }

    public final void setMax(TermsAndConditionsActivity termsAndConditionsActivity) {
        AppLifeCycleObserver IPostMessageService$Stub$Proxy = this.setMax.IPostMessageService$Stub$Proxy();
        if (IPostMessageService$Stub$Proxy != null) {
            matchInfo.setMin(termsAndConditionsActivity, IPostMessageService$Stub$Proxy);
            applyChanges ICustomTabsCallback$Stub = this.setMax.ICustomTabsCallback$Stub();
            if (ICustomTabsCallback$Stub != null) {
                applyChanges applychanges = ICustomTabsCallback$Stub;
                appxLoadFailed length = this.setMax.length();
                if (length != null) {
                    appxLoadFailed appxloadfailed = length;
                    getScheme min = this.setMax.getMin();
                    if (min != null) {
                        getScheme getscheme = min;
                        setDefaultFontSize updateVisuals = this.setMax.updateVisuals();
                        if (updateVisuals != null) {
                            matchInfo.length(termsAndConditionsActivity, new ConnectionStatusReceiver(applychanges, new copyBackForwardList(appxloadfailed, getscheme, updateVisuals)));
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
