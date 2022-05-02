package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class mutable extends uncheckItems<onConsumerReady> {
    private final RVByteBufferPool mockReferralTrackerEntityData;
    private final ImmutableCollection networkReferralTrackerEntityData;

    @Inject
    public mutable(ImmutableCollection immutableCollection, RVByteBufferPool rVByteBufferPool) {
        this.networkReferralTrackerEntityData = immutableCollection;
        this.mockReferralTrackerEntityData = rVByteBufferPool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.onConsumerReady createData(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 3357066(0x33398a, float:4.704251E-39)
            if (r0 == r1) goto L_0x0019
            r1 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r0 == r1) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "network"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "mock"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = -1
        L_0x0024:
            if (r3 == 0) goto L_0x0029
            o.ImmutableCollection r3 = r2.networkReferralTrackerEntityData
            return r3
        L_0x0029:
            o.RVByteBufferPool r3 = r2.mockReferralTrackerEntityData
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mutable.createData(java.lang.String):o.onConsumerReady");
    }
}
