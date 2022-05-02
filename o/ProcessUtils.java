package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ProcessUtils extends uncheckItems<RVAccountService> {
    private asyncTraceEnd amcsAddPayMethodConfig;
    private invokeMethod defaultAddPayMethodConfig;
    private unBindStartToken splitAddPayMethodConfig;

    @Inject
    public ProcessUtils(invokeMethod invokemethod, asyncTraceEnd asynctraceend, unBindStartToken unbindstarttoken) {
        this.defaultAddPayMethodConfig = invokemethod;
        this.amcsAddPayMethodConfig = asynctraceend;
        this.splitAddPayMethodConfig = unbindstarttoken;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.RVAccountService createData(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 2997660(0x2dbd9c, float:4.200616E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "local"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "amcs"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x002f
            if (r4 == r2) goto L_0x002c
            o.unBindStartToken r4 = r3.splitAddPayMethodConfig
            return r4
        L_0x002c:
            o.asyncTraceEnd r4 = r3.amcsAddPayMethodConfig
            return r4
        L_0x002f:
            o.invokeMethod r4 = r3.defaultAddPayMethodConfig
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ProcessUtils.createData(java.lang.String):o.RVAccountService");
    }
}
