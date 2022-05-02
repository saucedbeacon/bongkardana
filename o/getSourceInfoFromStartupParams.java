package o;

import o.TitleBarRightButtonView;

public interface getSourceInfoFromStartupParams {
    TitleBarRightButtonView.AnonymousClass1<Boolean> closeF2FPay();

    TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> getPaymentCode();

    TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> getPaymentResult();

    TitleBarRightButtonView.AnonymousClass1<Boolean> initF2FPay();

    TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> refreshPaymentCode(int i);

    TitleBarRightButtonView.AnonymousClass1<Boolean> setSeedExtra(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> startF2FPay();

    TitleBarRightButtonView.AnonymousClass1<Boolean> startRefreshTask();

    TitleBarRightButtonView.AnonymousClass1<Boolean> stopRefreshTask();
}
