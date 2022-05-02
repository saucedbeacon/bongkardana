package o;

import o.b;

public final class setScreenOrientation implements getAdapterPosition<createPageContext> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<BaseTabBar> ipgRegistrationUrlEntityDataFactoryProvider;
    private final b.C0007b<RVScreenOrientationProxy> ipgRegistrationUrlMapperProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getOrigin> userConfigEntityRepositoryProvider;

    public setScreenOrientation(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getOrigin> bVar5, b.C0007b<BaseTabBar> bVar6, b.C0007b<RVScreenOrientationProxy> bVar7) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.userConfigEntityRepositoryProvider = bVar5;
        this.ipgRegistrationUrlEntityDataFactoryProvider = bVar6;
        this.ipgRegistrationUrlMapperProvider = bVar7;
    }

    public final createPageContext get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.userConfigEntityRepositoryProvider.get(), this.ipgRegistrationUrlEntityDataFactoryProvider.get(), this.ipgRegistrationUrlMapperProvider.get());
    }

    public static setScreenOrientation create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getOrigin> bVar5, b.C0007b<BaseTabBar> bVar6, b.C0007b<RVScreenOrientationProxy> bVar7) {
        return new setScreenOrientation(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static createPageContext newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r10, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getOrigin getorigin, BaseTabBar baseTabBar, RVScreenOrientationProxy rVScreenOrientationProxy) {
        return new createPageContext(dialogLayout, r10, backKeyDownPoint, getapplaunchparams, getorigin, baseTabBar, rVScreenOrientationProxy);
    }
}
