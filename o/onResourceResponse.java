package o;

import java.util.Map;

final class onResourceResponse implements RedDotDrawable {
    private final needPermissionCheck getMin;

    public onResourceResponse(needPermissionCheck needpermissioncheck) {
        this.getMin = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getConfigNewMerchantSubCategoryIfEmpty$11((Map) obj);
    }
}
