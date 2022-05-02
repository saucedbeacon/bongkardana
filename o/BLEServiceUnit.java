package o;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.domain.globalnetwork.model.Pay;
import id.dana.model.GnContentModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ColorSchemeModelTemplate;
import o.DialogBridgeExtension;
import o.H5DataProvider;
import o.H5Event;
import o.INebulaPage;
import o.LocationBridgeExtension;
import o.TitleBarRightButtonView;
import o.Workflow;
import o.hasPageStartButNoInterceptRequest;
import o.isCanceled;
import o.onNext;
import o.releaseView;
import org.jetbrains.annotations.NotNull;

@PerActivity
public final class BLEServiceUnit implements onNext.setMin {
    NXH5WebViewAdapter FastBitmap$CoordinateSystem;
    private final ifContainsEmbedView Grayscale$Algorithm;
    private final IRedDotManager ICustomTabsCallback = new IRedDotManager();
    private String ICustomTabsCallback$Default;
    private Context ICustomTabsCallback$Stub;
    shouldExit IsOverlapping;
    getShareUrl Mean$Arithmetic;
    private List<String> asBinder;
    private String asInterface;
    private H5Event.Builder b;
    /* access modifiers changed from: private */
    public final onNext.length create;
    cannotInitUC equals;
    private LocationBridgeExtension.AnonymousClass3 extraCallback;
    private getEmbededViewProvider extraCallbackWithResult;
    private final isKeepCallback getCause;
    GetAuthCode getMax;
    getInternalContentView getMin;
    hasPageStartButNoInterceptRequest hashCode;
    isDispatcherOnWorkerThread invoke;
    isCanceled invokeSuspend;
    setEventSource isInside;
    sendServiceWorkerPushMessage length;
    private H5ServiceWorkerControllerProvider onMessageChannelReady;
    private final ifContainsEmbedSurfaceView onNavigationEvent;
    private keepCallback onPostMessage;
    private H5DataProvider onRelationshipValidationResult;
    private String onTransact;
    INebulaPage.H5PageHandler setMax;
    IH5EmbedViewJSCallback setMin;
    getWebViewCoreSoPath toDoubleRange;
    releaseView toFloatRange;
    NXH5WebViewClientAdapter toIntRange;
    enableUCCorePreheadInit toString;
    getRedirectUrl valueOf;
    setH5OverScrollListener values;

    @Inject
    public BLEServiceUnit(onNext.length length2, ifContainsEmbedView ifcontainsembedview, ifContainsEmbedSurfaceView ifcontainsembedsurfaceview, isKeepCallback iskeepcallback, H5DataProvider h5DataProvider, getEmbededViewProvider getembededviewprovider, H5ServiceWorkerControllerProvider h5ServiceWorkerControllerProvider, keepCallback keepcallback, LocationBridgeExtension.AnonymousClass3 r9, H5Event.Builder builder, Context context) {
        this.create = length2;
        this.Grayscale$Algorithm = ifcontainsembedview;
        this.onNavigationEvent = ifcontainsembedsurfaceview;
        this.getCause = iskeepcallback;
        this.onRelationshipValidationResult = h5DataProvider;
        this.extraCallbackWithResult = getembededviewprovider;
        this.onMessageChannelReady = h5ServiceWorkerControllerProvider;
        this.onPostMessage = keepcallback;
        this.extraCallback = r9;
        this.b = builder;
        this.ICustomTabsCallback$Stub = context;
    }

    public final void length() {
        this.ICustomTabsCallback.getMin(this.Grayscale$Algorithm.execute(null).onErrorReturnItem(Boolean.FALSE).subscribe(new SimpleWorkflowUnit(this)));
    }

    public final void setMax(String str, String str2) {
        this.ICustomTabsCallback.getMin(this.onNavigationEvent.execute(null).onErrorReturnItem(Boolean.FALSE).subscribe(new BLEStateUnit(this, str, str2)));
    }

    public final void length(String str) {
        this.ICustomTabsCallback$Default = str;
        this.ICustomTabsCallback.getMin(this.toDoubleRange.execute(str).doOnError(registerEventHandler.setMin).subscribe());
        this.ICustomTabsCallback.getMin(this.setMax.execute().subscribe(new RedDotManager(this) {
            private final BLEServiceUnit getMin;

            {
                this.getMin = r1;
            }

            public final void accept(Object obj) {
                BLEServiceUnit.setMax(this.getMin, (Boolean) obj);
            }
        }));
        this.create.getMax(toFloatRange(str), str);
        this.ICustomTabsCallback.getMin(this.equals.execute(null).doOnError(new RedDotManager(this) {
            private final BLEServiceUnit getMin;

            {
                this.getMin = r1;
            }

            public final void accept(Object obj) {
                this.getMin.create.getMax(false, "ID");
            }
        }).subscribe(new GriverConfiguration(this)));
    }

    public final void setMax(boolean z) {
        String str;
        if (z) {
            str = this.ICustomTabsCallback$Default;
        } else {
            str = "ID";
        }
        this.hashCode.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final void onError(Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getName());
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
            }
        }, hasPageStartButNoInterceptRequest.setMax.forSaveCountryCode(str));
        IsOverlapping(str);
    }

    public final void getMin() {
        this.onMessageChannelReady.execute(new GriverAppVirtualHostProxy<List<String>>() {
            public final /* synthetic */ void onNext(Object obj) {
                BLEServiceUnit.this.length((List<String>) (List) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                BLEServiceUnit.this.length((List<String>) new ArrayList());
            }
        });
    }

    public final void length(List<String> list) {
        String string = this.ICustomTabsCallback$Stub.getString(R.string.google_api_key);
        this.asBinder = list;
        this.ICustomTabsCallback.getMin(this.toFloatRange.execute(releaseView.setMax.forApiKeyAndTracker(string)).doOnError(new fetchAppInfoListByIds(this)).doOnNext(new getGatewaySignKey(this)).subscribe(new RedDotManager(this) {
            private final BLEServiceUnit getMin;

            {
                this.getMin = r1;
            }

            public final void accept(Object obj) {
                this.getMin.create.setMin(this.getMin.getMin((String) obj), (String) obj);
            }
        }));
    }

    public final void getMax() {
        this.onPostMessage.execute(onReceivedIcon.INSTANCE, new getAppendUserAgent(this), setAppendUserAgent.setMin);
    }

    public final void setMin() {
        this.ICustomTabsCallback.getMin(this.equals.execute(null).subscribe(new setGatewaySignKey(this)));
    }

    public final void isInside() {
        setMax((String) null);
    }

    public final void setMax(String str) {
        IRedDotManager iRedDotManager = this.ICustomTabsCallback;
        TitleBarRightButtonView.AnonymousClass1 execute = this.getCause.execute(str);
        onNext.length length2 = this.create;
        Objects.requireNonNull(length2);
        iRedDotManager.getMin(execute.doOnError(new onTrigger(length2)).subscribe(new setOnCompletedListener(this)));
    }

    public final void setMin(String str) {
        this.ICustomTabsCallback.getMin(this.valueOf.execute(str).doOnError(Workflow.OnCompletedListener.length).subscribe());
    }

    public final void getMin(boolean z) {
        this.ICustomTabsCallback.getMin(this.getMin.execute(Boolean.valueOf(z)).subscribe(new addUnit(this)));
    }

    public final void equals() {
        IRedDotManager iRedDotManager = this.ICustomTabsCallback;
        TitleBarRightButtonView.AnonymousClass1 execute = this.IsOverlapping.execute(null);
        onNext.length length2 = this.create;
        Objects.requireNonNull(length2);
        iRedDotManager.getMin(execute.subscribe(new Workflow.OnErrorListener(length2)));
    }

    public final void IsOverlapping() {
        this.ICustomTabsCallback.getMin(this.toIntRange.execute(Boolean.FALSE).subscribe());
    }

    public final void toIntRange() {
        this.ICustomTabsCallback.getMin(this.equals.execute(null).subscribe(new WorkflowUnit(this)));
    }

    public final void toFloatRange() {
        IRedDotManager iRedDotManager = this.ICustomTabsCallback;
        TitleBarRightButtonView.AnonymousClass1 execute = this.toString.execute(null);
        onNext.length length2 = this.create;
        Objects.requireNonNull(length2);
        iRedDotManager.getMin(execute.subscribe(new onCompleted(length2)));
    }

    public final void FastBitmap$CoordinateSystem() {
        this.ICustomTabsCallback.getMin(this.values.execute(Boolean.FALSE).subscribe());
    }

    public final boolean getMin(String str) {
        List<String> list = this.asBinder;
        return list != null && list.contains(str);
    }

    public final void values() {
        this.ICustomTabsCallback.getMin(this.Mean$Arithmetic.execute(onReceivedIcon.INSTANCE).subscribe());
    }

    public final void getMax(String str) {
        this.create.toIntRange();
        this.onRelationshipValidationResult.execute(new GriverAppVirtualHostProxy<String>() {
            public final void onError(Throwable th) {
                super.onError(th);
                BLEServiceUnit.this.create.length(th);
                BLEServiceUnit.this.create.isInside();
            }
        }, H5DataProvider.getMin.forDecodeGnQr(str, "", true));
    }

    public final void toDoubleRange() {
        this.length.execute(new GriverAppVirtualHostProxy<Pay>() {
            public final /* synthetic */ void onNext(@NotNull Object obj) {
                Pay pay = (Pay) obj;
                FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
                StringBuilder sb = new StringBuilder("watchForPayRequest() -> onNext() -> ");
                sb.append(pay.toString());
                instance.log(sb.toString());
                int i = AnonymousClass6.getMin[pay.getPaymentType().ordinal()];
                if (i == 1) {
                    BLEServiceUnit.this.create.getMin(pay.getPaymentString(), pay.isFromMiniProgram());
                } else if (i != 2) {
                    pay.getPaymentType();
                } else {
                    BLEServiceUnit.this.create.getMin(String.format("https://m.dana.id/m/portal/cashier/confirmation?reloadRequest=true&cashierOrderId=%s", new Object[]{pay.getPaymentString()}), pay.isFromMiniProgram());
                }
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, th.getMessage());
                BLEServiceUnit.this.create.getMax();
                FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
                StringBuilder sb = new StringBuilder("watchForPayRequest() -> onError() -> ");
                sb.append(th.getMessage());
                instance.log(sb.toString());
            }
        });
    }

    /* renamed from: o.BLEServiceUnit$6  reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] getMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.alipay.iap.android.wallet.acl.payment.PaymentType[] r0 = com.alipay.iap.android.wallet.acl.payment.PaymentType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                getMin = r0
                com.alipay.iap.android.wallet.acl.payment.PaymentType r1 = com.alipay.iap.android.wallet.acl.payment.PaymentType.CASHIER_URL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = getMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.iap.android.wallet.acl.payment.PaymentType r1 = com.alipay.iap.android.wallet.acl.payment.PaymentType.ORDER_ID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.BLEServiceUnit.AnonymousClass6.<clinit>():void");
        }
    }

    public final void invokeSuspend() {
        this.ICustomTabsCallback.getMin(this.extraCallbackWithResult.execute(onReceivedIcon.INSTANCE).subscribe());
    }

    public final void getMax(boolean z) {
        if (z) {
            onInput.getDefault().post(new ColorSchemeModelTemplate.AnonymousClass1.getMax((PaymentResult) null));
        }
    }

    public final void equals(String str) {
        this.invoke.execute(new GriverAppVirtualHostProxy<String>() {
            public final /* synthetic */ void onNext(@NotNull Object obj) {
                BLEServiceUnit.this.create.getMin((String) obj);
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, th.getMessage());
            }
        }, str);
    }

    public final void isInside(String str) {
        this.invokeSuspend.execute(new isCanceled.getMax(str), new openApp(this), alreadyInitialized.length);
    }

    public final void getMax(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.create.toIntRange();
        this.getMax.execute(GetAuthCode.length.forGetAuthCodeMpAgreements("https://m.dana.id/m/portal", str3, str4, z, str5), new closeApp(this, z), new fetchApps(this, str, str2));
    }

    private void IsOverlapping(String str) {
        if (str != null && !str.isEmpty()) {
            if (!"ID".equals(str)) {
                this.create.getMax(true, str);
                this.create.setMin();
            } else {
                this.invoke.execute(new GriverAppVirtualHostProxy<String>() {
                    public final /* synthetic */ void onNext(@NotNull Object obj) {
                        BLEServiceUnit.this.create.getMin((String) obj);
                    }

                    public final void onError(Throwable th) {
                        updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, th.getMessage());
                    }
                }, "ID");
            }
            setMax(str);
        }
    }

    private static boolean toFloatRange(String str) {
        return !str.equals("ID") && !TextUtils.isEmpty(str);
    }

    private boolean toIntRange(String str) {
        return str != null && str.equals(this.ICustomTabsCallback$Default) && !"ID".equals(str);
    }

    public final void setMax() {
        this.hashCode.dispose();
        this.ICustomTabsCallback.dispose();
        this.setMin.dispose();
        this.getMax.dispose();
        this.onRelationshipValidationResult.dispose();
        this.invoke.dispose();
        this.onMessageChannelReady.dispose();
    }

    static /* synthetic */ Unit length(BLEServiceUnit bLEServiceUnit, List list, String str) {
        if (list.contains(str)) {
            bLEServiceUnit.create.toFloatRange();
        } else {
            bLEServiceUnit.onRelationshipValidationResult.execute(new GriverAppVirtualHostProxy<String>() {
                public final void onError(Throwable th) {
                    super.onError(th);
                    BLEServiceUnit.this.create.length(th);
                }
            }, H5DataProvider.getMin.forDecodeGnQr(bLEServiceUnit.asInterface, bLEServiceUnit.onTransact, false));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void getMax(BLEServiceUnit bLEServiceUnit, String str) {
        if (!bLEServiceUnit.getMin(str)) {
            bLEServiceUnit.hashCode.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final void onError(Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                }
            }, hasPageStartButNoInterceptRequest.setMax.forSaveCountryCode("ID"));
            bLEServiceUnit.getMin(true);
            bLEServiceUnit.ICustomTabsCallback.getMin(bLEServiceUnit.toDoubleRange.execute(str).doOnError(registerBridge.getMin).subscribe(new RedDotManager(bLEServiceUnit, str) {
                private final BLEServiceUnit setMax;
                private final String setMin;

                {
                    this.setMax = r1;
                    this.setMin = r2;
                }

                public final void accept(Object obj) {
                    BLEServiceUnit.setMin(this.setMax, this.setMin, (String) obj);
                }
            }));
        }
        bLEServiceUnit.ICustomTabsCallback.getMin(bLEServiceUnit.FastBitmap$CoordinateSystem.execute(str).doOnError(setOnErrorListener.length).subscribe());
    }

    static /* synthetic */ void setMin(BLEServiceUnit bLEServiceUnit, String str, String str2) {
        if (!"ID".equals(str2) && !TextUtils.isEmpty(str2)) {
            bLEServiceUnit.ICustomTabsCallback.getMin(bLEServiceUnit.Mean$Arithmetic.execute(onReceivedIcon.INSTANCE).subscribe());
            bLEServiceUnit.ICustomTabsCallback.getMin(bLEServiceUnit.valueOf.execute(str).doOnError(Workflow.OnCompletedListener.length).subscribe());
        }
    }

    static /* synthetic */ void getMin(BLEServiceUnit bLEServiceUnit, String str) {
        if (bLEServiceUnit.toIntRange(str)) {
            bLEServiceUnit.IsOverlapping(str);
        } else if ("ID".equals(str)) {
            bLEServiceUnit.create.getMax(false, "ID");
        } else {
            bLEServiceUnit.hashCode.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final void onError(Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                }
            }, hasPageStartButNoInterceptRequest.setMax.forSaveCountryCode(bLEServiceUnit.ICustomTabsCallback$Default));
            String str2 = bLEServiceUnit.ICustomTabsCallback$Default;
            if (str2 != null && !str2.isEmpty()) {
                if (!"ID".equals(str2)) {
                    bLEServiceUnit.create.getMax(true, str2);
                }
                bLEServiceUnit.setMax(str2);
            }
        }
    }

    static /* synthetic */ Unit length(BLEServiceUnit bLEServiceUnit, String str, String str2, Throwable th) {
        updateActionSheetContent.e(DanaLogConstants.TAG.MINI_PROGRAM, th.getMessage());
        bLEServiceUnit.create.isInside();
        if (!(th instanceof GetAuthCode.MissingRequiredUserInfoException)) {
            return null;
        }
        DialogBridgeExtension.AnonymousClass6.getMax((GetAuthCode.MissingRequiredUserInfoException) th, str, str2);
        return null;
    }

    static /* synthetic */ void setMax(BLEServiceUnit bLEServiceUnit, PageProcessPoint pageProcessPoint) {
        onNext.length length2 = bLEServiceUnit.create;
        Intrinsics.checkNotNullParameter(pageProcessPoint, "gnContent");
        length2.setMax(new GnContentModel(pageProcessPoint.getTitle(), pageProcessPoint.getSubtitle(), pageProcessPoint.getButtonTitle(), pageProcessPoint.getImageUrl()), bLEServiceUnit.ICustomTabsCallback$Default.toLowerCase());
    }

    static /* synthetic */ Unit setMax(BLEServiceUnit bLEServiceUnit, boolean z, SplashEntryInfo splashEntryInfo) {
        bLEServiceUnit.create.isInside();
        bLEServiceUnit.create.length(splashEntryInfo, z);
        return null;
    }

    static /* synthetic */ void setMax(BLEServiceUnit bLEServiceUnit, Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            bLEServiceUnit.ICustomTabsCallback.getMin(bLEServiceUnit.b.execute(bLEServiceUnit.ICustomTabsCallback$Default.toLowerCase()).subscribe(new Constant(bLEServiceUnit), new Griver(bLEServiceUnit)));
        }
    }

    static /* synthetic */ void getMin(BLEServiceUnit bLEServiceUnit, String str, String str2, Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            bLEServiceUnit.asInterface = str;
            bLEServiceUnit.onTransact = str2;
            bLEServiceUnit.create.IsOverlapping();
            return;
        }
        bLEServiceUnit.create.setMax();
    }

    static /* synthetic */ Unit getMin(RenderLoadingStatusChangePoint renderLoadingStatusChangePoint, SplashEntryInfo splashEntryInfo) {
        OAuthResult oAuthResult = new OAuthResult();
        oAuthResult.setAuthCode(splashEntryInfo.getAuthCode());
        if (renderLoadingStatusChangePoint.getAuthCallback() == null) {
            return null;
        }
        renderLoadingStatusChangePoint.getAuthCallback().result(oAuthResult);
        return null;
    }

    static /* synthetic */ void getMin(BLEServiceUnit bLEServiceUnit, Boolean bool) {
        if (Boolean.FALSE.equals(bool)) {
            bLEServiceUnit.hashCode.execute(new GriverAppVirtualHostProxy<Boolean>() {
                public final void onError(Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getClass().getName());
                    sb.append(th.getMessage());
                    updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
                }
            }, hasPageStartButNoInterceptRequest.setMax.forSaveCountryCode("ID"));
        }
        bLEServiceUnit.setMin.execute(new GriverAppVirtualHostProxy<RenderLoadingStatusChangePoint>() {
            public final /* synthetic */ void onNext(Object obj) {
                RenderLoadingStatusChangePoint renderLoadingStatusChangePoint = (RenderLoadingStatusChangePoint) obj;
                BLEServiceUnit.this.getMax.execute(GetAuthCode.length.forGetGnAuthCode("https://m.dana.id/m/portal", renderLoadingStatusChangePoint.getClientId(), renderLoadingStatusChangePoint.getScope(), true, cornerRadius.GN_NETWORK_INFO_NAME_LOCAL_MP), new Function1(renderLoadingStatusChangePoint) {
                    private final RenderLoadingStatusChangePoint setMin;

                    {
                        this.setMin = r1;
                    }

                    public final Object invoke(Object obj) {
                        return BLEServiceUnit.getMin(this.setMin, (SplashEntryInfo) obj);
                    }
                }, new Function1(renderLoadingStatusChangePoint) {
                    private final RenderLoadingStatusChangePoint setMax;

                    {
                        this.setMax = r1;
                    }

                    public final Object invoke(Object obj) {
                        return BLEServiceUnit.setMin(this.setMax, (Throwable) obj);
                    }
                });
            }

            public final void onError(Throwable th) {
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, th.getMessage());
            }
        });
    }

    static /* synthetic */ Unit setMin(RenderLoadingStatusChangePoint renderLoadingStatusChangePoint, Throwable th) {
        if (th instanceof GetAuthCode.MissingRequiredUserInfoException) {
            DialogBridgeExtension.AnonymousClass6.getMax((GetAuthCode.MissingRequiredUserInfoException) th, renderLoadingStatusChangePoint.getDisplayName(), renderLoadingStatusChangePoint.getIconUrl());
        }
        updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, th.getMessage());
        renderLoadingStatusChangePoint.getAuthCallback().result(new OAuthResult());
        return null;
    }

    static /* synthetic */ void getMax(BLEServiceUnit bLEServiceUnit, initUC7zSo inituc7zso) {
        bLEServiceUnit.create.setMax(inituc7zso);
        bLEServiceUnit.create.length();
    }

    static /* synthetic */ void setMax(BLEServiceUnit bLEServiceUnit) {
        bLEServiceUnit.create.getMin();
        bLEServiceUnit.setMax(bLEServiceUnit.ICustomTabsCallback$Default);
    }
}
