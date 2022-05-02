package o;

import kotlin.jvm.functions.Function1;
import o.RVConfigService;

final class isBase64Url implements Function1 {
    public static final isBase64Url getMax = new isBase64Url();

    public final Object invoke(Object obj) {
        return ((RVConfigService.OnConfigChangeListener) obj).getEWalletInnovConfig();
    }
}
