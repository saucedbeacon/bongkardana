package o;

import java.util.Map;

final class asyncCheckPermission implements RedDotDrawable {
    private final needPermissionCheck length;

    public asyncCheckPermission(needPermissionCheck needpermissioncheck) {
        this.length = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$getMerchantCategories$3((Map) obj);
    }
}
