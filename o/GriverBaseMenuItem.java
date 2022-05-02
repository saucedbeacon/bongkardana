package o;

import id.dana.di.modules.RedeemPromoCodeModule;
import o.GriverUpdateProgressExtension;
import o.b;

public final class GriverBaseMenuItem implements getAdapterPosition<GriverUpdateProgressExtension.getMax> {
    private final b.C0007b<GriverChooseFileExtensionImpl> length;
    private final RedeemPromoCodeModule setMin;

    private GriverBaseMenuItem(RedeemPromoCodeModule redeemPromoCodeModule, b.C0007b<GriverChooseFileExtensionImpl> bVar) {
        this.setMin = redeemPromoCodeModule;
        this.length = bVar;
    }

    public static GriverBaseMenuItem getMax(RedeemPromoCodeModule redeemPromoCodeModule, b.C0007b<GriverChooseFileExtensionImpl> bVar) {
        return new GriverBaseMenuItem(redeemPromoCodeModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverUpdateProgressExtension.getMax max = this.setMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
