package o;

import id.dana.data.content.mapper.SpaceResultMapper;
import o.b;

public final class performance implements getAdapterPosition<setIncludeFiles> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getTabBar> contentDeliveryCacheEntityDataFactoryProvider;
    private final b.C0007b<getFontBar> contentDeliveryEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<error> exploreDanaPreferencesDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<SpaceResultMapper> spaceResultMapperProvider;

    public performance(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getFontBar> bVar4, b.C0007b<error> bVar5, b.C0007b<getTabBar> bVar6, b.C0007b<SpaceResultMapper> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.contentDeliveryEntityDataFactoryProvider = bVar4;
        this.exploreDanaPreferencesDataFactoryProvider = bVar5;
        this.contentDeliveryCacheEntityDataFactoryProvider = bVar6;
        this.spaceResultMapperProvider = bVar7;
        this.errorConfigFactoryProvider = bVar8;
    }

    public final setIncludeFiles get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.contentDeliveryEntityDataFactoryProvider.get(), this.exploreDanaPreferencesDataFactoryProvider.get(), this.contentDeliveryCacheEntityDataFactoryProvider.get(), this.spaceResultMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static performance create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getFontBar> bVar4, b.C0007b<error> bVar5, b.C0007b<getTabBar> bVar6, b.C0007b<SpaceResultMapper> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
        return new performance(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static setIncludeFiles newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, getFontBar getfontbar, error error, getTabBar gettabbar, SpaceResultMapper spaceResultMapper, getAppLaunchParams getapplaunchparams) {
        return new setIncludeFiles(dialogLayout, r11, backKeyDownPoint, getfontbar, error, gettabbar, spaceResultMapper, getapplaunchparams);
    }
}
