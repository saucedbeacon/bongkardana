package o;

import id.dana.contract.maintenance.MaintenanceBroadcastModule;
import o.b;
import o.setTabIndicatorColor;

public final class PagerTitleStrip implements getAdapterPosition<setTabIndicatorColor.getMax> {
    private final b.C0007b<getDrawFullUnderline> getMax;
    private final MaintenanceBroadcastModule setMax;

    private PagerTitleStrip(MaintenanceBroadcastModule maintenanceBroadcastModule, b.C0007b<getDrawFullUnderline> bVar) {
        this.setMax = maintenanceBroadcastModule;
        this.getMax = bVar;
    }

    public static PagerTitleStrip length(MaintenanceBroadcastModule maintenanceBroadcastModule, b.C0007b<getDrawFullUnderline> bVar) {
        return new PagerTitleStrip(maintenanceBroadcastModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setTabIndicatorColor.getMax max = this.setMax.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
