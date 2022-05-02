package o;

import com.alipay.iap.android.f2fpay.client.pay.F2FPayResult;

final class EmbedViewMetaInfo implements RedDotDrawable {
    private final RVJsStatTrackService getMin;

    public EmbedViewMetaInfo(RVJsStatTrackService rVJsStatTrackService) {
        this.getMin = rVJsStatTrackService;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((F2FPayResult) obj);
    }
}
