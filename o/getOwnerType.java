package o;

import id.dana.di.modules.MerchantDetailReviewModule;
import o.ShareMenu;
import o.b;

public final class getOwnerType implements getAdapterPosition<ShareMenu.AnonymousClass1> {
    private final b.C0007b<ShareMenu> getMin;
    private final MerchantDetailReviewModule setMax;

    private getOwnerType(MerchantDetailReviewModule merchantDetailReviewModule, b.C0007b<ShareMenu> bVar) {
        this.setMax = merchantDetailReviewModule;
        this.getMin = bVar;
    }

    public static getOwnerType getMin(MerchantDetailReviewModule merchantDetailReviewModule, b.C0007b<ShareMenu> bVar) {
        return new getOwnerType(merchantDetailReviewModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ShareMenu.AnonymousClass1 max = this.setMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
