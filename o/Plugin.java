package o;

import android.app.Application;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.alipay.iap.android.f2fpay.client.F2FPayClientContext;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayInitializeCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaymentCodeCallback;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent;
import com.alipay.iap.android.f2fpay.extension.IF2FPayDeviceIdGenerator;
import com.alipay.iap.android.f2fpay.extension.IF2FPayLogger;
import com.alipay.iap.android.f2fpay.extension.IF2FPayPaymentCodeGenerator;
import com.alipay.iap.android.f2fpay.extension.IF2FPaySecureStorage;
import com.alipay.iap.android.f2fpay.extension.impl.DefaultSecureStorageImpl;
import com.alipay.iap.android.f2fpay.otp.OtpInitResult;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClient;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClientContext;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class Plugin implements getExtensionMetaInfos {
    private final Application application;
    /* access modifiers changed from: private */
    public final getPerformanceTracker deviceInformationProvider;
    /* access modifiers changed from: private */
    public IComponent<OtpInitResult> otpInitResultPublishSubject = IComponent.setMax();
    private IF2FPayCallbackHolder payCallbackHolder;
    private IMtopProxy payClient;
    private IComponent<F2FPayResult> payResultPublishSubject = IComponent.setMax();
    /* access modifiers changed from: private */
    public IComponent<F2FPaymentCodeInfo> paymentCodeInfoPublishSubject = IComponent.setMax();
    /* access modifiers changed from: private */
    public IComponent<Boolean> qrInitStatusPublishSubject = IComponent.setMax();
    private IF2FPayResultHandleComponent resultHandleComponent;

    @Inject
    public Plugin(Application application2, getPerformanceTracker getperformancetracker) {
        this.application = application2;
        this.deviceInformationProvider = getperformancetracker;
    }

    public void init(String str, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(923765378, oncanceled);
            onCancelLoad.getMin(923765378, oncanceled);
        }
        useMultiplexLink ctokenFromCookie = getAlign.getCtokenFromCookie("m.dana.id");
        StringBuilder sb = new StringBuilder();
        sb.append(ctokenFromCookie);
        sb.append(";Domain=.dana.id;");
        getAlign.setCookie("https://mgs-gw.m.dana.id/mgw.htm", sb.toString());
        ctokenFromCookie.clear();
        UnifierQueryClient.getInstance().initialize(new UnifierQueryClientContext(new SyncProvider()));
        IMtopProxy iMtopProxy = new IMtopProxy(str);
        this.payClient = iMtopProxy;
        IComponent<F2FPayResult> iComponent = this.payResultPublishSubject;
        Objects.requireNonNull(iComponent);
        iMtopProxy.setPayResultCallback(new BoolPositiveResolver(iComponent));
        this.payCallbackHolder = this.payClient.addPaymentCodeCallback(new IF2FPaymentCodeCallback() {
            public final void onPaymentCodeUpdated(F2FPaymentCodeInfo f2FPaymentCodeInfo) {
                Plugin.this.paymentCodeInfoPublishSubject.onNext(f2FPaymentCodeInfo);
            }

            public final void onPaymentCodeGenerateFailed() {
                Plugin.this.paymentCodeInfoPublishSubject.onNext(new F2FPaymentCodeInfo());
            }
        });
        ((IF2FPayInitializeComponent) this.payClient.getComponent(IF2FPayInitializeComponent.class)).addInitializeCallback(new IF2FPayInitializeCallback() {
            public final void onOtpInfoChanged(@NonNull OtpInitResult otpInitResult) {
                Plugin.this.otpInitResultPublishSubject.onNext(otpInitResult);
            }

            public final void onInitializeFailed(String str) {
                updateActionSheetContent.exception("f2fpay", DanaLogConstants.Prefix.QRCODE_INIT_PREFIX, str);
            }

            public final void onInitializeOtpSucceed() {
                Plugin.this.qrInitStatusPublishSubject.onNext(Boolean.TRUE);
            }
        });
        initializeF2FPay(this.application, this.payClient);
        IF2FPayResultHandleComponent iF2FPayResultHandleComponent = (IF2FPayResultHandleComponent) this.payClient.getComponent(IF2FPayResultHandleComponent.class);
        this.resultHandleComponent = iF2FPayResultHandleComponent;
        iF2FPayResultHandleComponent.setRefreshCodeWhenLastCodePayed(false);
        ((IF2FPayPaymentCodeComponent) this.payClient.getComponent(IF2FPayPaymentCodeComponent.class)).setRefreshTimeSeconds(i);
        this.payClient.startF2FPay();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> start(String str, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1217258221, oncanceled);
            onCancelLoad.getMin(1217258221, oncanceled);
        }
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getExtensionsByPoint(this, str, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$start$0(String str, int i) throws Exception {
        if (this.payClient == null) {
            init(str, i);
        }
        this.payClient.startRefreshTask();
        return Boolean.TRUE;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> reStart(String str, int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new RegistryException(this, str, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$reStart$1(String str, int i) throws Exception {
        if (this.payClient == null) {
            init(str, i);
        }
        this.payClient.startRefreshTask();
        return Boolean.TRUE;
    }

    public Boolean pause() {
        IMtopProxy iMtopProxy = this.payClient;
        if (iMtopProxy != null) {
            iMtopProxy.stopRefreshTask();
        }
        return Boolean.TRUE;
    }

    public Boolean stop() {
        try {
            if (this.payClient != null) {
                this.payClient.stopRefreshTask();
                this.payClient.onDestroy();
                this.payClient = null;
            }
            if (this.payCallbackHolder != null) {
                this.payCallbackHolder.removeSelf();
                this.payCallbackHolder = null;
            }
            return Boolean.TRUE;
        } catch (Exception unused) {
            this.payClient = null;
            this.payCallbackHolder = null;
            return Boolean.TRUE;
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<F2FPayResult> getPaymentResult() {
        return this.payResultPublishSubject;
    }

    public TitleBarRightButtonView.AnonymousClass1<F2FPaymentCodeInfo> getPaymentCode() {
        return this.paymentCodeInfoPublishSubject;
    }

    public TitleBarRightButtonView.AnonymousClass1<OtpInitResult> getOtpInitResult() {
        return this.otpInitResultPublishSubject;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getQrInitResult() {
        return this.qrInitStatusPublishSubject;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setSeedExtra(String str, String str2, int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new BoolIntersectionResolver(this, str2, i, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$setSeedExtra$2(String str, int i, String str2) throws Exception {
        if (this.payClient == null) {
            init(str, i);
        }
        this.payClient.setSeedExtra(str2);
        return Boolean.TRUE;
    }

    private void initializeF2FPay(Application application2, IF2FPayClient iF2FPayClient) {
        iF2FPayClient.initialize(application2, new F2FPayClientContext(application2) {
            @NonNull
            public final IF2FPayLogger createPayLogger() {
                return new RVPub();
            }

            @NonNull
            public final IF2FPaySecureStorage createSecureStorage() {
                return new DefaultSecureStorageImpl();
            }

            @NonNull
            public final IF2FPayDeviceIdGenerator createDeviceIdGenerator() {
                return Plugin.this.deviceInformationProvider;
            }

            @NonNull
            public final IF2FPayPaymentCodeGenerator createPaymentCodeGenerator() {
                return new setPerformanceStageReentrantWhiteList();
            }
        });
    }
}
