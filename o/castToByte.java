package o;

import id.dana.di.modules.MerchantManagementModule;
import o.DiagnosticBridgeExtension;
import o.SystemInfoBridgeExtension;
import o.b;

public final class castToByte implements getAdapterPosition<SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax> {
    private final b.C0007b<DiagnosticBridgeExtension.AnonymousClass1> getMin;
    private final MerchantManagementModule setMin;

    public static SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax getMin(MerchantManagementModule merchantManagementModule, DiagnosticBridgeExtension.AnonymousClass1 r1) {
        SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax max = merchantManagementModule.getMax(r1);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        SystemInfoBridgeExtension.BatteryBroadcastReceiver.getMax max = this.setMin.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
