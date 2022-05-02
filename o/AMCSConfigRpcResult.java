package o;

import id.dana.domain.merchant.MerchantCategoryType;
import java.util.List;
import kotlin.jvm.functions.Function1;

final class AMCSConfigRpcResult implements Function1 {
    private final MerchantCategoryType getMax;
    private final getLastModifiedDate getMin;

    public AMCSConfigRpcResult(getLastModifiedDate getlastmodifieddate, MerchantCategoryType merchantCategoryType) {
        this.getMin = getlastmodifieddate;
        this.getMax = merchantCategoryType;
    }

    public final Object invoke(Object obj) {
        return getLastModifiedDate.getMax(this.getMin, this.getMax, (List) obj);
    }
}
