package o;

import id.dana.contract.homeinfo.HomeInfoModule;
import o.VersionedParcelize;
import o.b;

public final class allowSerialization implements getAdapterPosition<VersionedParcelize.getMax> {
    private final b.C0007b<jetifyAs> setMax;
    private final HomeInfoModule setMin;

    private allowSerialization(HomeInfoModule homeInfoModule, b.C0007b<jetifyAs> bVar) {
        this.setMin = homeInfoModule;
        this.setMax = bVar;
    }

    public static allowSerialization setMin(HomeInfoModule homeInfoModule, b.C0007b<jetifyAs> bVar) {
        return new allowSerialization(homeInfoModule, bVar);
    }

    public final /* synthetic */ Object get() {
        VersionedParcelize.getMax min = this.setMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
