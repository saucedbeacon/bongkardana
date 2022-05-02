package o;

import id.dana.di.modules.ReferralTrackerModule;
import o.ConstraintProxy$StorageNotLowProxy;

public final class GriverMonitorConstants implements getAdapterPosition<ConstraintProxy$StorageNotLowProxy.setMax> {
    private final ReferralTrackerModule setMax;

    private GriverMonitorConstants(ReferralTrackerModule referralTrackerModule) {
        this.setMax = referralTrackerModule;
    }

    public static GriverMonitorConstants getMin(ReferralTrackerModule referralTrackerModule) {
        return new GriverMonitorConstants(referralTrackerModule);
    }

    public final /* synthetic */ Object get() {
        ConstraintProxy$StorageNotLowProxy.setMax max = this.setMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
