package o;

import id.dana.domain.merchant.MerchantCategoryType;
import java.util.Map;

final class load implements RedDotDrawable {
    private final needPermissionCheck length;
    private final MerchantCategoryType setMin;

    public load(needPermissionCheck needpermissioncheck, MerchantCategoryType merchantCategoryType) {
        this.length = needpermissioncheck;
        this.setMin = merchantCategoryType;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getOrderedNewMerchantCategories$10(this.setMin, (Map) obj);
    }
}
