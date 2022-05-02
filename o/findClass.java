package o;

import id.dana.di.modules.MerchantDetailModule;
import o.GriverTransActivity;

public final class findClass implements getAdapterPosition<GriverTransActivity.Lite1.setMin> {
    private final MerchantDetailModule length;

    private findClass(MerchantDetailModule merchantDetailModule) {
        this.length = merchantDetailModule;
    }

    public static findClass length(MerchantDetailModule merchantDetailModule) {
        return new findClass(merchantDetailModule);
    }

    public final /* synthetic */ Object get() {
        GriverTransActivity.Lite1.setMin min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
