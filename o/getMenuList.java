package o;

import id.dana.di.modules.RedeemPromoCodeModule;
import o.GriverUpdateProgressExtension;

public final class getMenuList implements getAdapterPosition<GriverUpdateProgressExtension.length> {
    private final RedeemPromoCodeModule length;

    private getMenuList(RedeemPromoCodeModule redeemPromoCodeModule) {
        this.length = redeemPromoCodeModule;
    }

    public static getMenuList setMin(RedeemPromoCodeModule redeemPromoCodeModule) {
        return new getMenuList(redeemPromoCodeModule);
    }

    public final /* synthetic */ Object get() {
        GriverUpdateProgressExtension.length min = this.length.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
