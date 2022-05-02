package o;

import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;
import com.alipay.iap.android.f2fpay.otp.OtpInitResult;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import o.TitleBarRightButtonView;

public interface getExtensionMetaInfos {
    TitleBarRightButtonView.AnonymousClass1<OtpInitResult> getOtpInitResult();

    TitleBarRightButtonView.AnonymousClass1<F2FPaymentCodeInfo> getPaymentCode();

    TitleBarRightButtonView.AnonymousClass1<F2FPayResult> getPaymentResult();

    TitleBarRightButtonView.AnonymousClass1<Boolean> getQrInitResult();

    void init(String str, int i);

    Boolean pause();

    TitleBarRightButtonView.AnonymousClass1<Boolean> reStart(String str, int i);

    TitleBarRightButtonView.AnonymousClass1<Boolean> setSeedExtra(String str, String str2, int i);

    TitleBarRightButtonView.AnonymousClass1<Boolean> start(String str, int i);

    Boolean stop();
}
