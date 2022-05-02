package o;

import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;

final class deserialize implements RedDotDrawable {
    private final RVJsStatTrackService setMin;

    public deserialize(RVJsStatTrackService rVJsStatTrackService) {
        this.setMin = rVJsStatTrackService;
    }

    public final Object apply(Object obj) {
        return this.setMin.transform((F2FPaymentCodeInfo) obj);
    }
}
