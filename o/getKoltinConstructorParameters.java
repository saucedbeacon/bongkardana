package o;

import id.dana.di.modules.MerchantDetailReviewModule;
import o.UniformOptionMenuPanelExtensionImpl;
import o.b;

public final class getKoltinConstructorParameters implements getAdapterPosition<UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin> {
    private final b.C0007b<getCancelBtn> getMax;
    private final MerchantDetailReviewModule setMin;

    private getKoltinConstructorParameters(MerchantDetailReviewModule merchantDetailReviewModule, b.C0007b<getCancelBtn> bVar) {
        this.setMin = merchantDetailReviewModule;
        this.getMax = bVar;
    }

    public static getKoltinConstructorParameters getMax(MerchantDetailReviewModule merchantDetailReviewModule, b.C0007b<getCancelBtn> bVar) {
        return new getKoltinConstructorParameters(merchantDetailReviewModule, bVar);
    }

    public final /* synthetic */ Object get() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass3.AnonymousClass1.setMin length = this.setMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
