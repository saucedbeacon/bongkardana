package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class newError extends uncheckItems<pushEnginePorxy> {
    private final getAppxDomain localNearbyMeEntityData;
    private final BindingApiContext mockNearbyMeEntityRepositoryData;
    private final BindingExecutor networkNearbyMeEntityData;

    @Inject
    public newError(BindingExecutor bindingExecutor, BindingApiContext bindingApiContext, getAppxDomain getappxdomain) {
        this.networkNearbyMeEntityData = bindingExecutor;
        this.mockNearbyMeEntityRepositoryData = bindingApiContext;
        this.localNearbyMeEntityData = getappxdomain;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.pushEnginePorxy createData(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 3357066(0x33398a, float:4.704251E-39)
            r2 = 1
            if (r0 == r1) goto L_0x0029
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r0 == r1) goto L_0x001f
            r1 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r0 == r1) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            java.lang.String r0 = "network"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "local"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "mock"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x003e
            if (r4 == r2) goto L_0x003b
            o.BindingExecutor r4 = r3.networkNearbyMeEntityData
            return r4
        L_0x003b:
            o.getAppxDomain r4 = r3.localNearbyMeEntityData
            return r4
        L_0x003e:
            o.BindingApiContext r4 = r3.mockNearbyMeEntityRepositoryData
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.newError.createData(java.lang.String):o.pushEnginePorxy");
    }
}
