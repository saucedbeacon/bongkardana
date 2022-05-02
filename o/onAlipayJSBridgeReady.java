package o;

import id.dana.data.otp.repository.source.smsreceiver.OtpReceiver;
import o.TitleBarRightButtonView;

public final class onAlipayJSBridgeReady implements trackKeyJSAPIInvoke {
    public final TitleBarRightButtonView.AnonymousClass1<getAppxVersionInWorker> verifyOtp(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public final TitleBarRightButtonView.AnonymousClass1<getJsApiDetail4TinyWithT2> sendOtp(String str, String str2, String str3) {
        throw new UnsupportedOperationException();
    }

    public final TitleBarRightButtonView.AnonymousClass1<String> receiveOtp() {
        return OtpReceiver.publishSubjectOtp;
    }
}
