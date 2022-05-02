package o;

import id.dana.di.modules.LazadaModule;
import o.GriverSessionDataExtension;

public final class writeKeyWithSingleQuoteIfHasSpecial implements getAdapterPosition<GriverSessionDataExtension.length> {
    private final LazadaModule getMin;

    public static GriverSessionDataExtension.length setMin(LazadaModule lazadaModule) {
        GriverSessionDataExtension.length min = lazadaModule.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverSessionDataExtension.length min = this.getMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
