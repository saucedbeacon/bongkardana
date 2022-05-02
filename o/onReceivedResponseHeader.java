package o;

import java.util.Map;

final class onReceivedResponseHeader implements RedDotDrawable {
    private final needPermissionCheck setMin;

    public onReceivedResponseHeader(needPermissionCheck needpermissioncheck) {
        this.setMin = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getConfigNewMerchantCategoryIfEmpty$7((Map) obj);
    }
}
