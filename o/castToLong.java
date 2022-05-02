package o;

import id.dana.di.modules.MerchantReviewModule;
import o.b;

public final class castToLong implements getAdapterPosition<BridgeUtils> {
    private final b.C0007b<AESUtil> setMax;

    public static BridgeUtils getMin(AESUtil aESUtil) {
        BridgeUtils min = MerchantReviewModule.setMin(aESUtil);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        BridgeUtils min = MerchantReviewModule.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
