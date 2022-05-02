package o;

import javax.inject.Inject;
import o.CommonBackPerform;

public class getTabBarItemColorModel extends setSpeed<IpcServerUtils, GriverConfig> {
    private final RVNativePermissionRequestManager feedsResultMapper;
    private final getActiveIcon homeInfoResultMapper;
    private final CommonBackPerform.AnonymousClass2 notificationCenterMapper;

    @Inject
    public getTabBarItemColorModel(getActiveIcon getactiveicon, RVNativePermissionRequestManager rVNativePermissionRequestManager, CommonBackPerform.AnonymousClass2 r3) {
        this.homeInfoResultMapper = getactiveicon;
        this.feedsResultMapper = rVNativePermissionRequestManager;
        this.notificationCenterMapper = r3;
    }

    /* access modifiers changed from: protected */
    public GriverConfig map(IpcServerUtils ipcServerUtils) {
        if (ipcServerUtils == null) {
            return null;
        }
        GriverConfig griverConfig = new GriverConfig();
        griverConfig.setHomeInfoResponse(this.homeInfoResultMapper.transform(ipcServerUtils.getHomeInfoResult()));
        griverConfig.setFeeds(this.feedsResultMapper.apply(ipcServerUtils.getFeedsResult()));
        griverConfig.setHasNewResponse(this.notificationCenterMapper.transform(ipcServerUtils.getHasNewResult()));
        griverConfig.setSpace(ipcServerUtils.getSpace());
        return griverConfig;
    }
}
