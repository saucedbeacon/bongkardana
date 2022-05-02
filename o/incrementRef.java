package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.RVProxy;

@Singleton
public class incrementRef extends uncheckItems<RVProxy.LazyGetter> {
    private final BigDataChannelManager localReferralEntityData;
    private final isConsumerReady networkReferralEntityData;

    @Inject
    public incrementRef(isConsumerReady isconsumerready, BigDataChannelManager bigDataChannelManager) {
        this.networkReferralEntityData = isconsumerready;
        this.localReferralEntityData = bigDataChannelManager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r6.equals("local") != false) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.RVProxy.LazyGetter createData(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x0008
            int r1 = r6.length()
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            int r2 = o.dispatchOnCancelled.setMax(r1)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            o.onCanceled r4 = new o.onCanceled
            r4.<init>(r1, r2, r3)
            r1 = 1145752395(0x444acb4b, float:811.17645)
            o.onCancelLoad.setMax(r1, r4)
            o.onCancelLoad.getMin(r1, r4)
        L_0x001e:
            r1 = -1
            int r2 = r6.hashCode()
            r4 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r2 == r4) goto L_0x0038
            r0 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r2 == r0) goto L_0x002e
            goto L_0x0041
        L_0x002e:
            java.lang.String r0 = "network"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0038:
            java.lang.String r2 = "local"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            if (r0 == 0) goto L_0x0047
            o.isConsumerReady r6 = r5.networkReferralEntityData
            return r6
        L_0x0047:
            o.BigDataChannelManager r6 = r5.localReferralEntityData
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.incrementRef.createData(java.lang.String):o.RVProxy$LazyGetter");
    }
}
