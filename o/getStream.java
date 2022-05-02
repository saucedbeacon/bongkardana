package o;

import android.app.Application;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayOpenCallback;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaymentCodeCallback;
import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;
import com.alipay.iap.android.f2fpay.common.IF2FPayCallbackHolder;
import com.alipay.iap.android.f2fpay.components.IF2FPayPaymentCodeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayResultHandleComponent;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClient;
import com.alipay.plus.android.unipayresult.sdk.client.UnifierQueryClientContext;
import o.TitleBarRightButtonView;

public class getStream implements getSyncTimeout, IF2FPayOpenCallback {
    private final Application application;
    private IF2FPayCallbackHolder mOpenCallbackHolder;
    private IMtopProxy mPayClient;
    private IF2FPayCallbackHolder mPaymentCodeCallbackHolder;
    /* access modifiers changed from: private */
    public final RVJsStatTrackService paymentModelMapper;

    public void onSwitchOffFailed(String str) {
    }

    public void onSwitchOnCanceled() {
    }

    public void onSwitchOnFailed(String str) {
    }

    public getStream(Application application2, RVJsStatTrackService rVJsStatTrackService) {
        this.application = application2;
        this.paymentModelMapper = rVJsStatTrackService;
    }

    public void onSwitchStatusChanged(boolean z, IF2FPayOpenCallback.StatusChangeCausedBy statusChangeCausedBy) {
        if (!z && statusChangeCausedBy == IF2FPayOpenCallback.StatusChangeCausedBy.SwitchOff) {
            this.mOpenCallbackHolder.removeSelf();
            this.mPaymentCodeCallbackHolder.removeSelf();
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> init(String str) {
        useMultiplexLink ctokenFromCookie = getAlign.getCtokenFromCookie("m.dana.id");
        getAlign.setCookie("https://mgs-gw.m.dana.id/mgw.htm", "ctoken=ovdPZJJ1UL8k0xdq;Domain=.alipaydev.com;");
        getAlign.setCookie("https://mgs-gw.m.dana.id/mgw.htm", "ctoken=ovdPZJJ1UL8k0xdq;Domain=.alipay.net;");
        StringBuilder sb = new StringBuilder();
        sb.append(ctokenFromCookie);
        sb.append(";Domain=.dana.id;");
        getAlign.setCookie("https://mgs-gw.m.dana.id/mgw.htm", sb.toString());
        ctokenFromCookie.clear();
        return TitleBarRightButtonView.AnonymousClass1.create(new Resource(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(String str, TitleBarRightButtonView.AnonymousClass2 r5) throws Exception {
        UnifierQueryClient.getInstance().initialize(new UnifierQueryClientContext(new SyncProvider()));
        IMtopProxy iMtopProxy = new IMtopProxy(str);
        this.mPayClient = iMtopProxy;
        ((IF2FPayResultHandleComponent) iMtopProxy.getComponent(IF2FPayResultHandleComponent.class)).setRefreshCodeWhenLastCodePayed(false);
        r5.onNext(Boolean.TRUE);
        r5.onComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> start() {
        return TitleBarRightButtonView.AnonymousClass1.create(new writeJsApiStatToMap(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1(TitleBarRightButtonView.AnonymousClass2 r2) throws Exception {
        this.mOpenCallbackHolder = this.mPayClient.addPayOpenCallback(this);
        this.mPayClient.startF2FPay();
        r2.onNext(Boolean.TRUE);
        r2.onComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> close() {
        return TitleBarRightButtonView.AnonymousClass1.create(new getBytes(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2(TitleBarRightButtonView.AnonymousClass2 r2) throws Exception {
        removePaymentCodeCallback();
        removePaymentResultCallback();
        r2.onNext(Boolean.TRUE);
        r2.onComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> getPaymentCode() {
        return TitleBarRightButtonView.AnonymousClass1.create(new isLocal(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getPaymentCode$3(final TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        try {
            this.mPaymentCodeCallbackHolder = this.mPayClient.addPaymentCodeCallback(new IF2FPaymentCodeCallback() {
                public final void onPaymentCodeUpdated(F2FPaymentCodeInfo f2FPaymentCodeInfo) {
                    r3.onNext(getStream.this.paymentModelMapper.transform(f2FPaymentCodeInfo));
                    r3.onComplete();
                }

                public final void onPaymentCodeGenerateFailed() {
                    r3.onNext(new GriverRpcExtension());
                    r3.onComplete();
                }
            });
        } catch (Exception e) {
            r3.onError(e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> getPaymentResult() {
        return TitleBarRightButtonView.AnonymousClass1.create(new setSourceType(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getPaymentResult$5(TitleBarRightButtonView.AnonymousClass2 r3) throws Exception {
        try {
            this.mPayClient.setPayResultCallback(new getMimeType(this, r3));
        } catch (Exception e) {
            r3.onError(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getPaymentResult$4(TitleBarRightButtonView.AnonymousClass2 r2, F2FPayResult f2FPayResult) {
        r2.onNext(this.paymentModelMapper.transform(f2FPayResult));
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> refreshPaymentCode(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1004815048, oncanceled);
            onCancelLoad.getMin(-1004815048, oncanceled);
        }
        return TitleBarRightButtonView.AnonymousClass1.create(new getEncoding(this, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshPaymentCode$6(final int i, final TitleBarRightButtonView.AnonymousClass2 r4) throws Exception {
        try {
            final IMtopProxy iMtopProxy = this.mPayClient;
            removePaymentCodeCallback();
            this.mPaymentCodeCallbackHolder = iMtopProxy.addPaymentCodeCallback(new IF2FPaymentCodeCallback() {
                public final void onPaymentCodeUpdated(F2FPaymentCodeInfo f2FPaymentCodeInfo) {
                    r4.onNext(getStream.this.paymentModelMapper.transform(f2FPaymentCodeInfo));
                    iMtopProxy.refreshPaymentCode(i);
                    if (i == 0) {
                        r4.onComplete();
                    }
                }

                public final void onPaymentCodeGenerateFailed() {
                    r4.onNext(new GriverRpcExtension());
                    if (i == 0) {
                        r4.onComplete();
                    }
                }
            });
            ((IF2FPayPaymentCodeComponent) iMtopProxy.getComponent(IF2FPayPaymentCodeComponent.class)).setRefreshTimeSeconds(i);
        } catch (Exception e) {
            r4.onError(e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> startRefresh() {
        return TitleBarRightButtonView.AnonymousClass1.create(new setBytes(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$startRefresh$7(TitleBarRightButtonView.AnonymousClass2 r2) throws Exception {
        IMtopProxy iMtopProxy = this.mPayClient;
        if (iMtopProxy != null) {
            iMtopProxy.startRefreshTask();
        }
        r2.onNext(Boolean.TRUE);
        r2.onComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> stopRefresh() {
        return TitleBarRightButtonView.AnonymousClass1.create(new getSourceType(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$stopRefresh$8(TitleBarRightButtonView.AnonymousClass2 r2) throws Exception {
        removePaymentCodeCallback();
        IMtopProxy iMtopProxy = this.mPayClient;
        if (iMtopProxy != null) {
            iMtopProxy.stopRefreshTask();
        }
        r2.onNext(Boolean.TRUE);
        r2.onComplete();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setSeedExtra(String str) {
        this.mPayClient.setSeedExtra(str);
        IMtopProxy iMtopProxy = this.mPayClient;
        if (iMtopProxy != null) {
            iMtopProxy.startRefreshTask();
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.TRUE);
    }

    private void removePaymentCodeCallback() {
        IF2FPayCallbackHolder iF2FPayCallbackHolder = this.mPaymentCodeCallbackHolder;
        if (iF2FPayCallbackHolder != null) {
            iF2FPayCallbackHolder.removeSelf();
        }
    }

    private void removePaymentResultCallback() {
        IMtopProxy iMtopProxy = this.mPayClient;
        if (iMtopProxy != null) {
            iMtopProxy.stopRefreshTask();
        }
    }
}
