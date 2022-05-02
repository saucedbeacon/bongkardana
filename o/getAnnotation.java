package o;

import id.dana.di.modules.MerchantDetailActionInfoModule;
import o.ShareMenu;
import o.b;

public final class getAnnotation implements getAdapterPosition<ShareMenu.AnonymousClass1> {
    private final MerchantDetailActionInfoModule getMin;
    private final b.C0007b<ShareMenu> setMax;

    private getAnnotation(MerchantDetailActionInfoModule merchantDetailActionInfoModule, b.C0007b<ShareMenu> bVar) {
        this.getMin = merchantDetailActionInfoModule;
        this.setMax = bVar;
    }

    public static getAnnotation getMax(MerchantDetailActionInfoModule merchantDetailActionInfoModule, b.C0007b<ShareMenu> bVar) {
        return new getAnnotation(merchantDetailActionInfoModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ShareMenu.AnonymousClass1 min = this.getMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
