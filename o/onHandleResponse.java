package o;

import id.dana.domain.merchant.MerchantCategoryType;

final class onHandleResponse implements RedDotDrawable {
    private final MerchantCategoryType getMin;
    private final needPermissionCheck length;

    public onHandleResponse(needPermissionCheck needpermissioncheck, MerchantCategoryType merchantCategoryType) {
        this.length = needpermissioncheck;
        this.getMin = merchantCategoryType;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getDefaultNewMerchantOrders$23(this.getMin, (Throwable) obj);
    }
}
