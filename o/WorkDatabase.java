package o;

import id.dana.contract.promotion.InterstitialPromotionBannerModule;
import o.WorkerParameters;
import o.b;

public final class WorkDatabase implements getAdapterPosition<WorkerParameters.getMax> {
    private final InterstitialPromotionBannerModule getMin;
    private final b.C0007b<WorkManagerInitializer> setMin;

    private WorkDatabase(InterstitialPromotionBannerModule interstitialPromotionBannerModule, b.C0007b<WorkManagerInitializer> bVar) {
        this.getMin = interstitialPromotionBannerModule;
        this.setMin = bVar;
    }

    public static WorkDatabase getMin(InterstitialPromotionBannerModule interstitialPromotionBannerModule, b.C0007b<WorkManagerInitializer> bVar) {
        return new WorkDatabase(interstitialPromotionBannerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        WorkerParameters.getMax length = this.getMin.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
