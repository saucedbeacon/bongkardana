package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;

@Singleton
public class onCallBack extends uncheckItems<AppMsgReceiver.AnonymousClass2> {
    private final handleMessage amcsConfigEntityData;
    private final AppUtils splitConfigEntityData;

    @Inject
    public onCallBack(handleMessage handlemessage, AppUtils appUtils) {
        this.amcsConfigEntityData = handlemessage;
        this.splitConfigEntityData = appUtils;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.AppMsgReceiver.AnonymousClass2 createData(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            r1 = 2997660(0x2dbd9c, float:4.200616E-39)
            if (r0 == r1) goto L_0x0019
            r1 = 109648666(0x6891b1a, float:5.1573495E-35)
            if (r0 == r1) goto L_0x000f
            goto L_0x0023
        L_0x000f:
            java.lang.String r0 = "split"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 0
            goto L_0x0024
        L_0x0019:
            java.lang.String r0 = "amcs"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0023
            r3 = 1
            goto L_0x0024
        L_0x0023:
            r3 = -1
        L_0x0024:
            if (r3 == 0) goto L_0x0029
            o.handleMessage r3 = r2.amcsConfigEntityData
            return r3
        L_0x0029:
            o.AppUtils r3 = r2.splitConfigEntityData
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onCallBack.createData(java.lang.String):o.AppMsgReceiver$2");
    }
}
