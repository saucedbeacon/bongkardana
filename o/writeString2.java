package o;

import android.content.Context;
import javax.inject.Inject;

public class writeString2 extends uncheckItems<readStringArray2> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final appxLoadFailed executor;
    private final setIsUrgentResource rpcConnector;

    @Inject
    public writeString2(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.executor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.readStringArray2 createData(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3357066(0x33398a, float:4.704251E-39)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1843485230(0x6de15a2e, float:8.7178935E27)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "network"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0024
            r5 = 0
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "mock"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0024
            r5 = 1
            goto L_0x0025
        L_0x0024:
            r5 = -1
        L_0x0025:
            if (r5 == 0) goto L_0x0031
            if (r5 == r2) goto L_0x002b
            r5 = 0
            return r5
        L_0x002b:
            o.readStringList2 r5 = new o.readStringList2
            r5.<init>()
            return r5
        L_0x0031:
            o.getBoolean r5 = new o.getBoolean
            o.setIsUrgentResource r0 = r4.rpcConnector
            o.appxLoadFailed r1 = r4.executor
            o.onAppResume r2 = r4.apSecurityFacade
            android.content.Context r3 = r4.context
            r5.<init>(r0, r1, r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.writeString2.createData(java.lang.String):o.readStringArray2");
    }
}
