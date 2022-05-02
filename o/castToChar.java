package o;

import id.dana.di.modules.MerchantReviewModule;
import o.b;

public final class castToChar implements getAdapterPosition<AESUtil> {
    private final b.C0007b<getWorkerHandler> setMax;

    public static AESUtil getMax(getWorkerHandler getworkerhandler) {
        AESUtil max = MerchantReviewModule.setMax(getworkerhandler);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        AESUtil max = MerchantReviewModule.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
