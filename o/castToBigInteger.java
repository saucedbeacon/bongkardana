package o;

import id.dana.di.modules.MerchantModule;
import o.GetAboutInfoResult;
import o.b;

public final class castToBigInteger implements getAdapterPosition<GetAboutInfoResult.getMax> {
    private final b.C0007b<getLastModifiedDate> getMin;
    private final MerchantModule setMax;

    public static GetAboutInfoResult.getMax getMin(MerchantModule merchantModule, getLastModifiedDate getlastmodifieddate) {
        GetAboutInfoResult.getMax max = merchantModule.setMax(getlastmodifieddate);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GetAboutInfoResult.getMax max = this.setMax.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
