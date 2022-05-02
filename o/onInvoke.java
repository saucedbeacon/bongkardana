package o;

import java.util.Map;
import java.util.concurrent.Callable;

final class onInvoke implements Callable {
    private final Map getMin;
    private final needPermissionCheck length;

    public onInvoke(needPermissionCheck needpermissioncheck, Map map) {
        this.length = needpermissioncheck;
        this.getMin = map;
    }

    public final Object call() {
        return this.length.lambda$getNewMerchantCategoryFromConfig$15(this.getMin);
    }
}
