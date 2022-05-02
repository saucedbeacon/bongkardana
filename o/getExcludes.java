package o;

import id.dana.di.modules.MerchantAverageRatingModule;
import o.onSettingChange;

public final class getExcludes implements getAdapterPosition<onSettingChange.setMax> {
    private final MerchantAverageRatingModule setMax;

    private getExcludes(MerchantAverageRatingModule merchantAverageRatingModule) {
        this.setMax = merchantAverageRatingModule;
    }

    public static getExcludes setMin(MerchantAverageRatingModule merchantAverageRatingModule) {
        return new getExcludes(merchantAverageRatingModule);
    }

    public final /* synthetic */ Object get() {
        onSettingChange.setMax max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
