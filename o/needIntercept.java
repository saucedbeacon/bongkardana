package o;

import java.util.Map;

final class needIntercept implements RedDotDrawable {
    private final needPermissionCheck setMin;

    public needIntercept(needPermissionCheck needpermissioncheck) {
        this.setMin = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getNewMerchantSubCategoriesMappedToCategory$12((Map) obj);
    }
}
