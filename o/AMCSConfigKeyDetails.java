package o;

import id.dana.domain.merchant.MerchantCategoryType;
import kotlin.jvm.functions.Function1;

final class AMCSConfigKeyDetails implements Function1 {
    private final MerchantCategoryType getMax;
    private final getLastModifiedDate setMax;

    public AMCSConfigKeyDetails(getLastModifiedDate getlastmodifieddate, MerchantCategoryType merchantCategoryType) {
        this.setMax = getlastmodifieddate;
        this.getMax = merchantCategoryType;
    }

    public final Object invoke(Object obj) {
        return this.setMax.getMin.length(this.getMax);
    }
}
