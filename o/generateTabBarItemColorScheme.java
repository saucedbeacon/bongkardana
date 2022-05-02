package o;

import o.CommonBackPerform;
import o.b;

public final class generateTabBarItemColorScheme implements getAdapterPosition<getTabBarItemColorModel> {
    private final b.C0007b<RVNativePermissionRequestManager> feedsResultMapperProvider;
    private final b.C0007b<getActiveIcon> homeInfoResultMapperProvider;
    private final b.C0007b<CommonBackPerform.AnonymousClass2> notificationCenterMapperProvider;

    public generateTabBarItemColorScheme(b.C0007b<getActiveIcon> bVar, b.C0007b<RVNativePermissionRequestManager> bVar2, b.C0007b<CommonBackPerform.AnonymousClass2> bVar3) {
        this.homeInfoResultMapperProvider = bVar;
        this.feedsResultMapperProvider = bVar2;
        this.notificationCenterMapperProvider = bVar3;
    }

    public final getTabBarItemColorModel get() {
        return newInstance(this.homeInfoResultMapperProvider.get(), this.feedsResultMapperProvider.get(), this.notificationCenterMapperProvider.get());
    }

    public static generateTabBarItemColorScheme create(b.C0007b<getActiveIcon> bVar, b.C0007b<RVNativePermissionRequestManager> bVar2, b.C0007b<CommonBackPerform.AnonymousClass2> bVar3) {
        return new generateTabBarItemColorScheme(bVar, bVar2, bVar3);
    }

    public static getTabBarItemColorModel newInstance(getActiveIcon getactiveicon, RVNativePermissionRequestManager rVNativePermissionRequestManager, CommonBackPerform.AnonymousClass2 r3) {
        return new getTabBarItemColorModel(getactiveicon, rVNativePermissionRequestManager, r3);
    }
}
