package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class WorkerExceptionPoint extends setMinProgress implements getSourceInfoFromStartupParams {
    private final RVJSApiHandlerProxy paymentEntityDataFactory;
    private final access$2300 securityEntityDataFactory;

    @Inject
    public WorkerExceptionPoint(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, RVJSApiHandlerProxy rVJSApiHandlerProxy, access$2300 access_2300, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.paymentEntityDataFactory = rVJSApiHandlerProxy;
        this.securityEntityDataFactory = access_2300;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> initF2FPay() {
        return authenticatedRequest(createSecurityData().offlinePayKey()).flatMap(new HttpRequestResponseHandlePoint(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$initF2FPay$0(String str) throws Exception {
        return createPaymentData().init(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> startF2FPay() {
        return authenticatedRequest(createPaymentData().start());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> closeF2FPay() {
        return createPaymentData().close();
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> getPaymentCode() {
        return authenticatedRequest(createPaymentData().getPaymentCode());
    }

    public TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> getPaymentResult() {
        return authenticatedRequest(createPaymentData().getPaymentResult());
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> refreshPaymentCode(int i) {
        return authenticatedRequest(createPaymentData().refreshPaymentCode(i));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> startRefreshTask() {
        return authenticatedRequest(createPaymentData().startRefresh());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> stopRefreshTask() {
        return createPaymentData().stopRefresh();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setSeedExtra(String str) {
        return authenticatedRequest(createPaymentData().setSeedExtra(str));
    }

    private access$2400 createSecurityData() {
        return this.securityEntityDataFactory.createData("network");
    }

    private getSyncTimeout createPaymentData() {
        return this.paymentEntityDataFactory.createData("network");
    }
}
