package o;

import id.dana.di.modules.CheckoutH5EventModule;
import o.GriverManifest;

public final class println implements getAdapterPosition<GriverManifest.AnonymousClass22.length> {
    private final CheckoutH5EventModule getMin;

    public static GriverManifest.AnonymousClass22.length setMin(CheckoutH5EventModule checkoutH5EventModule) {
        GriverManifest.AnonymousClass22.length max = checkoutH5EventModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverManifest.AnonymousClass22.length max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
