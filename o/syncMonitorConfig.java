package o;

import id.dana.di.modules.ReferralModule;
import o.MemoryWarningBridgeExtension;

public final class syncMonitorConfig implements getAdapterPosition<MemoryWarningBridgeExtension.getMax> {
    private final ReferralModule getMax;

    private syncMonitorConfig(ReferralModule referralModule) {
        this.getMax = referralModule;
    }

    public static syncMonitorConfig setMax(ReferralModule referralModule) {
        return new syncMonitorConfig(referralModule);
    }

    public final /* synthetic */ Object get() {
        MemoryWarningBridgeExtension.getMax min = this.getMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
