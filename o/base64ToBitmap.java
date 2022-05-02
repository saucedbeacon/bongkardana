package o;

import kotlin.jvm.functions.Function1;
import o.RVConfigService;

final class base64ToBitmap implements Function1 {
    public static final base64ToBitmap getMax = new base64ToBitmap();

    public final Object invoke(Object obj) {
        return ((RVConfigService.OnConfigChangeListener) obj).getEWalletPrefix();
    }
}
