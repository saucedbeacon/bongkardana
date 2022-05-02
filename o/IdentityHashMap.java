package o;

import id.dana.di.modules.MerchantDanaDealsModule;
import id.dana.di.modules.MerchantDetailMenuModule;
import o.UniformOptionMenuPanelExtensionImpl;
import o.b;

public final class IdentityHashMap implements getAdapterPosition<UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length> {
    private final MerchantDanaDealsModule setMax;

    public final class Entry implements getAdapterPosition<createPayloadsIfNeeded> {
        private final MerchantDetailMenuModule length;
        private final b.C0007b<getShortName> setMin;

        private Entry(MerchantDetailMenuModule merchantDetailMenuModule, b.C0007b<getShortName> bVar) {
            this.length = merchantDetailMenuModule;
            this.setMin = bVar;
        }

        public static Entry length(MerchantDetailMenuModule merchantDetailMenuModule, b.C0007b<getShortName> bVar) {
            return new Entry(merchantDetailMenuModule, bVar);
        }

        public final /* synthetic */ Object get() {
            createPayloadsIfNeeded length2 = this.length.length(this.setMin.get());
            if (length2 != null) {
                return length2;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length setMax(MerchantDanaDealsModule merchantDanaDealsModule) {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length max = merchantDanaDealsModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        UniformOptionMenuPanelExtensionImpl.AnonymousClass1.AnonymousClass1.length max = this.setMax.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
