package o;

import javax.inject.Inject;
import o.AppModel;

public class getContainerInfo extends uncheckItems<setContainerInfo> {
    private final AppModel.AnonymousClass2 localDataSource;
    private final addPlugin networkDataSource;

    @Inject
    public getContainerInfo(addPlugin addplugin, AppModel.AnonymousClass2 r2) {
        this.networkDataSource = addplugin;
        this.localDataSource = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.setContainerInfo createData(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
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
            java.lang.String r0 = "local"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0024
        L_0x0023:
            r3 = -1
        L_0x0024:
            if (r3 == 0) goto L_0x0029
            o.addPlugin r3 = r2.networkDataSource
            return r3
        L_0x0029:
            o.AppModel$2 r3 = r2.localDataSource
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContainerInfo.createData(java.lang.String):o.setContainerInfo");
    }
}
