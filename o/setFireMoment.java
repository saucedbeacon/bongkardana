package o;

import o.TitleBarRightButtonView;

public interface setFireMoment {
    TitleBarRightButtonView.AnonymousClass1<Boolean> getOtpInitResult();

    TitleBarRightButtonView.AnonymousClass1<GriverRpcExtension> getPaymentCode();

    TitleBarRightButtonView.AnonymousClass1<BaseGriverRpcResult> getPaymentResult();

    TitleBarRightButtonView.AnonymousClass1<Boolean> getQrInitResult();

    TitleBarRightButtonView.AnonymousClass1<Boolean> initOfflinePay();

    Boolean pause();

    TitleBarRightButtonView.AnonymousClass1<Boolean> restart();

    TitleBarRightButtonView.AnonymousClass1<Boolean> setSeedExtra(String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> start();

    Boolean stop();
}
