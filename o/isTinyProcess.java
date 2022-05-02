package o;

import javax.inject.Inject;
import o.IIPCManager;
import o.RVLogger;

public class isTinyProcess extends uncheckItems<RVLogger.AnonymousClass1> {
    private final RVTraceKey amcsRecipientHomeMenuEntityData;
    private final parseColorLong defaultRecipientHomeMenuEntityData;
    private final IIPCManager.Stub splitSendMoneyHomeMenuEntityData;

    @Inject
    public isTinyProcess(RVTraceKey rVTraceKey, IIPCManager.Stub stub, parseColorLong parsecolorlong) {
        this.amcsRecipientHomeMenuEntityData = rVTraceKey;
        this.splitSendMoneyHomeMenuEntityData = stub;
        this.defaultRecipientHomeMenuEntityData = parsecolorlong;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.RVLogger.AnonymousClass1 createData(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 2997660(0x2dbd9c, float:4.200616E-39)
            r2 = 1
            if (r0 == r1) goto L_0x0029
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r0 == r1) goto L_0x001f
            r1 = 109648666(0x6891b1a, float:5.1573495E-35)
            if (r0 == r1) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            java.lang.String r0 = "split"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "local"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "amcs"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x003e
            if (r4 == r2) goto L_0x003b
            o.parseColorLong r4 = r3.defaultRecipientHomeMenuEntityData
            return r4
        L_0x003b:
            o.IIPCManager$Stub r4 = r3.splitSendMoneyHomeMenuEntityData
            return r4
        L_0x003e:
            o.RVTraceKey r4 = r3.amcsRecipientHomeMenuEntityData
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isTinyProcess.createData(java.lang.String):o.RVLogger$1");
    }
}
