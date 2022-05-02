package o;

import id.dana.di.modules.CheckoutH5EventModule;
import o.GriverManifest;
import o.b;

public final class getValueFilters implements getAdapterPosition<GriverManifest.AnonymousClass22.getMin> {
    private final CheckoutH5EventModule getMin;
    private final b.C0007b<GriverManifest.AnonymousClass2> setMax;

    public static GriverManifest.AnonymousClass22.getMin getMin(CheckoutH5EventModule checkoutH5EventModule, GriverManifest.AnonymousClass2 r1) {
        GriverManifest.AnonymousClass22.getMin min = checkoutH5EventModule.getMin(r1);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        GriverManifest.AnonymousClass22.getMin min = this.getMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
