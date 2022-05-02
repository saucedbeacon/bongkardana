package o;

import java.util.Map;

final class com_alibaba_ariver_engine_api_ExtOpt$20$1 implements RedDotDrawable {
    private final needPermissionCheck setMin;

    public com_alibaba_ariver_engine_api_ExtOpt$20$1(needPermissionCheck needpermissioncheck) {
        this.setMin = needpermissioncheck;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getNewMerchantSubCategoryFromConfig$18((Map) obj);
    }
}
