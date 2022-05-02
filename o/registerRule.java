package o;

import javax.inject.Inject;
import o.AppUpdaterFactory;

public class registerRule extends uncheckItems<releaseResourcePackages> {
    private final unRegisterRule mockSyncContactEntityData;
    private final AppUpdaterFactory.Rule networkSyncContactEntityData;
    private final AppUpdaterFactory preferencesSyncContactEntityData;

    @Inject
    public registerRule(AppUpdaterFactory appUpdaterFactory, AppUpdaterFactory.Rule rule, unRegisterRule unregisterrule) {
        this.preferencesSyncContactEntityData = appUpdaterFactory;
        this.networkSyncContactEntityData = rule;
        this.mockSyncContactEntityData = unregisterrule;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.releaseResourcePackages createData(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3357066(0x33398a, float:4.704251E-39)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r0 == r1) goto L_0x0020
            r1 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "network"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "local"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "mock"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == 0) goto L_0x0043
            if (r5 == r3) goto L_0x0040
            if (r5 == r2) goto L_0x003d
            r5 = 0
            return r5
        L_0x003d:
            o.unRegisterRule r5 = r4.mockSyncContactEntityData
            return r5
        L_0x0040:
            o.AppUpdaterFactory$Rule r5 = r4.networkSyncContactEntityData
            return r5
        L_0x0043:
            o.AppUpdaterFactory r5 = r4.preferencesSyncContactEntityData
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.registerRule.createData(java.lang.String):o.releaseResourcePackages");
    }
}
