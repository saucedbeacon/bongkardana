package o;

import id.dana.contract.maintenance.MaintenanceBroadcastModule;
import o.setTabIndicatorColor;

public final class setDrawFullUnderline implements getAdapterPosition<setTabIndicatorColor.setMin> {
    private final MaintenanceBroadcastModule setMin;

    private setDrawFullUnderline(MaintenanceBroadcastModule maintenanceBroadcastModule) {
        this.setMin = maintenanceBroadcastModule;
    }

    public static setDrawFullUnderline length(MaintenanceBroadcastModule maintenanceBroadcastModule) {
        return new setDrawFullUnderline(maintenanceBroadcastModule);
    }

    public final /* synthetic */ Object get() {
        setTabIndicatorColor.setMin length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
