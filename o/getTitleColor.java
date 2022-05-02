package o;

import o.b;

public final class getTitleColor implements getAdapterPosition<setTitleColor> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<getTabBarItemColorModel> homeDataResultMapperProvider;
    private final b.C0007b<setDivider> homeInfoEntityDataFactoryProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getActiveIcon> mapperProvider;

    public getTitleColor(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<setDivider> bVar4, b.C0007b<getActiveIcon> bVar5, b.C0007b<getAppLaunchParams> bVar6, b.C0007b<getTabBarItemColorModel> bVar7) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.homeInfoEntityDataFactoryProvider = bVar4;
        this.mapperProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
        this.homeDataResultMapperProvider = bVar7;
    }

    public final setTitleColor get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.homeInfoEntityDataFactoryProvider.get(), this.mapperProvider.get(), this.errorConfigFactoryProvider.get(), this.homeDataResultMapperProvider.get());
    }

    public static getTitleColor create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<setDivider> bVar4, b.C0007b<getActiveIcon> bVar5, b.C0007b<getAppLaunchParams> bVar6, b.C0007b<getTabBarItemColorModel> bVar7) {
        return new getTitleColor(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static setTitleColor newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r10, BackKeyDownPoint backKeyDownPoint, setDivider setdivider, getActiveIcon getactiveicon, getAppLaunchParams getapplaunchparams, getTabBarItemColorModel gettabbaritemcolormodel) {
        return new setTitleColor(dialogLayout, r10, backKeyDownPoint, setdivider, getactiveicon, getapplaunchparams, gettabbaritemcolormodel);
    }
}
