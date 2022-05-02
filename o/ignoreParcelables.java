package o;

import id.dana.contract.homeinfo.HomeInfoModule;
import o.VersionedParcelize;

public final class ignoreParcelables implements getAdapterPosition<VersionedParcelize.setMin> {
    private final HomeInfoModule getMax;

    private ignoreParcelables(HomeInfoModule homeInfoModule) {
        this.getMax = homeInfoModule;
    }

    public static ignoreParcelables setMin(HomeInfoModule homeInfoModule) {
        return new ignoreParcelables(homeInfoModule);
    }

    public final /* synthetic */ Object get() {
        VersionedParcelize.setMin min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
