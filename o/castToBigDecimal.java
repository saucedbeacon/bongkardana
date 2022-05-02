package o;

import id.dana.di.modules.MerchantManagementModule;
import o.SystemInfoBridgeExtension;

public final class castToBigDecimal implements getAdapterPosition<SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMin> {
    private final MerchantManagementModule length;

    public static SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMin length(MerchantManagementModule merchantManagementModule) {
        SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMin min = merchantManagementModule.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMin min = this.length.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
