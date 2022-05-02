package o;

import java.util.List;
import java.util.Map;

final class onJsEngineErrorIntercept implements RedDotDrawable {
    private final Map setMax;

    public onJsEngineErrorIntercept(Map map) {
        this.setMax = map;
    }

    public final Object apply(Object obj) {
        return needPermissionCheck.lambda$getOrderedNewMerchantCategories$9(this.setMax, (List) obj);
    }
}
