package o;

import id.dana.di.modules.MerchantLatestReviewModule;
import o.getMsg;

public final class isKotlin implements getAdapterPosition<getMsg.getMax> {
    private final MerchantLatestReviewModule getMax;

    private isKotlin(MerchantLatestReviewModule merchantLatestReviewModule) {
        this.getMax = merchantLatestReviewModule;
    }

    public static isKotlin getMax(MerchantLatestReviewModule merchantLatestReviewModule) {
        return new isKotlin(merchantLatestReviewModule);
    }

    public final /* synthetic */ Object get() {
        getMsg.getMax min = this.getMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
