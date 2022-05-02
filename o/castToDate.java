package o;

import id.dana.di.modules.MerchantReviewModule;
import o.b;

public final class castToDate implements getAdapterPosition<getMac> {
    private final b.C0007b<AESUtil> setMin;

    public static getMac getMin(AESUtil aESUtil) {
        getMac max = MerchantReviewModule.getMax(aESUtil);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getMac max = MerchantReviewModule.getMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
