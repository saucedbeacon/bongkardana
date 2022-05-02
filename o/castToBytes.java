package o;

import id.dana.di.modules.MixpanelEnableModule;
import o.b;
import o.stopMonitorMemoryWarning;

public final class castToBytes implements getAdapterPosition<stopMonitorMemoryWarning.getMin> {
    private final MixpanelEnableModule getMin;
    private final b.C0007b<getBatteryInfo> setMax;

    private castToBytes(MixpanelEnableModule mixpanelEnableModule, b.C0007b<getBatteryInfo> bVar) {
        this.getMin = mixpanelEnableModule;
        this.setMax = bVar;
    }

    public static castToBytes length(MixpanelEnableModule mixpanelEnableModule, b.C0007b<getBatteryInfo> bVar) {
        return new castToBytes(mixpanelEnableModule, bVar);
    }

    public static stopMonitorMemoryWarning.getMin setMax(MixpanelEnableModule mixpanelEnableModule, getBatteryInfo getbatteryinfo) {
        stopMonitorMemoryWarning.getMin min = mixpanelEnableModule.getMin(getbatteryinfo);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        stopMonitorMemoryWarning.getMin min = this.getMin.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
