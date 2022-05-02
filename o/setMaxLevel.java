package o;

import id.dana.di.modules.MerchantDanaDealsModule;
import o.UniformOptionMenuPanelExtensionImpl;
import o.b;

public final class setMaxLevel implements getAdapterPosition<UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin> {
    private final b.C0007b<UniformOptionMenuPanelExtensionImpl.AnonymousClass7> getMax;
    private final MerchantDanaDealsModule getMin;

    public static UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin getMax(MerchantDanaDealsModule merchantDanaDealsModule, UniformOptionMenuPanelExtensionImpl.AnonymousClass7 r1) {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin max = merchantDanaDealsModule.getMax(r1);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.getMin max = this.getMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
