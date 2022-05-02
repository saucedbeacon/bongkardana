package o;

import javax.inject.Inject;

public class getAppLaunchParams extends uncheckItems<AppConfigModel> {
    private final getPages localErrorConfigEntityData;
    private final getPageLaunchParams networkErrorConfigEntityData;

    @Inject
    public getAppLaunchParams(getPageLaunchParams getpagelaunchparams, getPages getpages) {
        this.networkErrorConfigEntityData = getpagelaunchparams;
        this.localErrorConfigEntityData = getpages;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.AppConfigModel createData(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "network"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "local"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x002f
            if (r4 == r2) goto L_0x002c
            o.getPages r4 = r3.localErrorConfigEntityData
            return r4
        L_0x002c:
            o.getPageLaunchParams r4 = r3.networkErrorConfigEntityData
            return r4
        L_0x002f:
            o.getPages r4 = r3.localErrorConfigEntityData
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getAppLaunchParams.createData(java.lang.String):o.AppConfigModel");
    }
}
