package o;

import id.dana.di.modules.MerchantAverageRatingModule;
import o.UniformOptionMenuPanelExtensionImpl;
import o.b;
import o.onSettingChange;

public final class getIncludes implements getAdapterPosition<onSettingChange.length> {
    private final MerchantAverageRatingModule setMax;
    private final b.C0007b<UniformOptionMenuPanelExtensionImpl.AnonymousClass2> setMin;

    private getIncludes(MerchantAverageRatingModule merchantAverageRatingModule, b.C0007b<UniformOptionMenuPanelExtensionImpl.AnonymousClass2> bVar) {
        this.setMax = merchantAverageRatingModule;
        this.setMin = bVar;
    }

    public static getIncludes setMin(MerchantAverageRatingModule merchantAverageRatingModule, b.C0007b<UniformOptionMenuPanelExtensionImpl.AnonymousClass2> bVar) {
        return new getIncludes(merchantAverageRatingModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onSettingChange.length length = this.setMax.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
