package o;

import com.alipay.iap.android.f2fpay.otp.OtpInitResult;

final class ExtensionRegistry implements RedDotDrawable {
    public static final ExtensionRegistry setMin = new ExtensionRegistry();

    public final Object apply(Object obj) {
        return DefaultExtensionRegistry.lambda$getOtpInitResult$9((OtpInitResult) obj);
    }
}
