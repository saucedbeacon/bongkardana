package o;

import id.dana.di.modules.RedeemUserMissionModule;
import id.dana.di.modules.ReferralModule;
import o.MemoryWarningBridgeExtension;
import o.b;
import o.isUsed;

public final class GriverMonitorAnalyticsConfigExtension implements getAdapterPosition<isUsed.length> {
    private final RedeemUserMissionModule getMax;
    private final b.C0007b<getTaskExecutor> length;

    public final class GriverMonitorConfigFetchCallback implements getAdapterPosition<MemoryWarningBridgeExtension.length> {
        private final b.C0007b<SendUPDMessageExtension> length;
        private final ReferralModule setMax;

        private GriverMonitorConfigFetchCallback(ReferralModule referralModule, b.C0007b<SendUPDMessageExtension> bVar) {
            this.setMax = referralModule;
            this.length = bVar;
        }

        public static GriverMonitorConfigFetchCallback setMin(ReferralModule referralModule, b.C0007b<SendUPDMessageExtension> bVar) {
            return new GriverMonitorConfigFetchCallback(referralModule, bVar);
        }

        public final /* synthetic */ Object get() {
            MemoryWarningBridgeExtension.length min = this.setMax.setMin(this.length.get());
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    private GriverMonitorAnalyticsConfigExtension(RedeemUserMissionModule redeemUserMissionModule, b.C0007b<getTaskExecutor> bVar) {
        this.getMax = redeemUserMissionModule;
        this.length = bVar;
    }

    public static GriverMonitorAnalyticsConfigExtension setMin(RedeemUserMissionModule redeemUserMissionModule, b.C0007b<getTaskExecutor> bVar) {
        return new GriverMonitorAnalyticsConfigExtension(redeemUserMissionModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isUsed.length max = this.getMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
