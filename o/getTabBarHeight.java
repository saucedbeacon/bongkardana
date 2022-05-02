package o;

import o.b;

public final class getTabBarHeight implements getAdapterPosition<RVTabBarImpl> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<getTitleBarHeight> kycAmlEddEntityDataFactoryProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;

    public getTabBarHeight(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getTitleBarHeight> bVar5, b.C0007b<onCallBack> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.kycAmlEddEntityDataFactoryProvider = bVar5;
        this.configEntityDataFactoryProvider = bVar6;
    }

    public final RVTabBarImpl get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.kycAmlEddEntityDataFactoryProvider.get(), this.configEntityDataFactoryProvider.get());
    }

    public static getTabBarHeight create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getTitleBarHeight> bVar5, b.C0007b<onCallBack> bVar6) {
        return new getTabBarHeight(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static RVTabBarImpl newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getTitleBarHeight gettitlebarheight, onCallBack oncallback) {
        return new RVTabBarImpl(dialogLayout, r9, backKeyDownPoint, getapplaunchparams, gettitlebarheight, oncallback);
    }
}
