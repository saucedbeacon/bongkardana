package o;

import javax.inject.Inject;
import o.ErrId;
import o.ScheduleExtensionInvoker;

public class SecurityExtensionInvoker extends uncheckItems<ScheduleExtensionInvoker.AnonymousClass3> {
    private final ErrId.ErrCodePermissionForbidden persistenceRecentContactEntityData;

    @Inject
    public SecurityExtensionInvoker(ErrId.ErrCodePermissionForbidden errCodePermissionForbidden) {
        this.persistenceRecentContactEntityData = errCodePermissionForbidden;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.ScheduleExtensionInvoker.AnonymousClass3 createData(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 3357066(0x33398a, float:4.704251E-39)
            if (r0 == r1) goto L_0x0019
            r1 = 103145323(0x625df6b, float:3.1197192E-35)
            if (r0 == r1) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "local"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "mock"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = -1
        L_0x0024:
            if (r3 == 0) goto L_0x002c
            o.ErrId r3 = new o.ErrId
            r3.<init>()
            return r3
        L_0x002c:
            o.ErrId$ErrCodePermissionForbidden r3 = r2.persistenceRecentContactEntityData
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SecurityExtensionInvoker.createData(java.lang.String):o.ScheduleExtensionInvoker$3");
    }
}
