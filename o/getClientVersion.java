package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getClientVersion extends uncheckItems<getConfigBoolean> {
    private final getPathAndHash mockSendMoneyEntityData;
    private final isValidUrl networkSendMoneyEntityData;

    @Inject
    public getClientVersion(isValidUrl isvalidurl, getPathAndHash getpathandhash) {
        this.networkSendMoneyEntityData = isvalidurl;
        this.mockSendMoneyEntityData = getpathandhash;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.getConfigBoolean createData(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 3357066(0x33398a, float:4.704251E-39)
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
            java.lang.String r0 = "mock"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x002e
            if (r4 == r2) goto L_0x002b
            r4 = 0
            return r4
        L_0x002b:
            o.isValidUrl r4 = r3.networkSendMoneyEntityData
            return r4
        L_0x002e:
            o.getPathAndHash r4 = r3.mockSendMoneyEntityData
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClientVersion.createData(java.lang.String):o.getConfigBoolean");
    }
}
