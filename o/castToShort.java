package o;

import id.dana.di.modules.MerchantModule;
import o.GetAboutInfoResult;

public final class castToShort implements getAdapterPosition<GetAboutInfoResult.getMin> {
    private final MerchantModule setMax;

    public static GetAboutInfoResult.getMin getMin(MerchantModule merchantModule) {
        GetAboutInfoResult.getMin min = merchantModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GetAboutInfoResult.getMin min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
