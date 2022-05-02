package o;

import id.dana.contract.promotion.InterstitialPromotionBannerModule;
import o.WorkerParameters;

public final class isFinished implements getAdapterPosition<WorkerParameters.length> {
    private final InterstitialPromotionBannerModule setMax;

    private isFinished(InterstitialPromotionBannerModule interstitialPromotionBannerModule) {
        this.setMax = interstitialPromotionBannerModule;
    }

    public static isFinished setMax(InterstitialPromotionBannerModule interstitialPromotionBannerModule) {
        return new isFinished(interstitialPromotionBannerModule);
    }

    public final /* synthetic */ Object get() {
        WorkerParameters.length min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
