package o;

import java.util.Map;

final class com_alibaba_ariver_engine_api_ExtOpt$27$1 implements getChildren {
    private final Map setMax;

    public com_alibaba_ariver_engine_api_ExtOpt$27$1(Map map) {
        this.setMax = map;
    }

    public final boolean test(Object obj) {
        return needPermissionCheck.lambda$getMerchantCategories$2(this.setMax, (String) obj);
    }
}
