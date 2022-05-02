package o;

import id.dana.contract.payqr.OfflinePayModule;
import o.b;
import o.getPageSize;

public final class updateCurrentItem implements getAdapterPosition<getPageSize.setMin> {
    private final b.C0007b<requestTransform> getMax;
    private final OfflinePayModule length;

    private updateCurrentItem(OfflinePayModule offlinePayModule, b.C0007b<requestTransform> bVar) {
        this.length = offlinePayModule;
        this.getMax = bVar;
    }

    public static updateCurrentItem length(OfflinePayModule offlinePayModule, b.C0007b<requestTransform> bVar) {
        return new updateCurrentItem(offlinePayModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getPageSize.setMin max = this.length.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
