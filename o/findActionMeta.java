package o;

import id.dana.data.content.mapper.SpaceResultMapper;
import o.b;

public final class findActionMeta implements getAdapterPosition<onException> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getTabBar> contentDeliveryCacheEntityDataFactorProvider;
    private final b.C0007b<getFontBar> contentDeliveryEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<SpaceResultMapper> mapperProvider;
    private final b.C0007b<exitNode> promoEntityDataFactoryProvider;
    private final b.C0007b<getClientVersion> sendMoneyDataFactoryProvider;

    public findActionMeta(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getFontBar> bVar4, b.C0007b<getTabBar> bVar5, b.C0007b<onCallBack> bVar6, b.C0007b<SpaceResultMapper> bVar7, b.C0007b<getAppLaunchParams> bVar8, b.C0007b<exitNode> bVar9, b.C0007b<getClientVersion> bVar10) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.contentDeliveryEntityDataFactoryProvider = bVar4;
        this.contentDeliveryCacheEntityDataFactorProvider = bVar5;
        this.configEntityDataFactoryProvider = bVar6;
        this.mapperProvider = bVar7;
        this.errorConfigFactoryProvider = bVar8;
        this.promoEntityDataFactoryProvider = bVar9;
        this.sendMoneyDataFactoryProvider = bVar10;
    }

    public final onException get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.contentDeliveryEntityDataFactoryProvider.get(), this.contentDeliveryCacheEntityDataFactorProvider.get(), this.configEntityDataFactoryProvider.get(), this.mapperProvider.get(), this.errorConfigFactoryProvider.get(), this.promoEntityDataFactoryProvider.get(), this.sendMoneyDataFactoryProvider.get());
    }

    public static findActionMeta create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getFontBar> bVar4, b.C0007b<getTabBar> bVar5, b.C0007b<onCallBack> bVar6, b.C0007b<SpaceResultMapper> bVar7, b.C0007b<getAppLaunchParams> bVar8, b.C0007b<exitNode> bVar9, b.C0007b<getClientVersion> bVar10) {
        return new findActionMeta(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public static onException newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r13, BackKeyDownPoint backKeyDownPoint, getFontBar getfontbar, getTabBar gettabbar, onCallBack oncallback, SpaceResultMapper spaceResultMapper, getAppLaunchParams getapplaunchparams, exitNode exitnode, getClientVersion getclientversion) {
        return new onException(dialogLayout, r13, backKeyDownPoint, getfontbar, gettabbar, oncallback, spaceResultMapper, getapplaunchparams, exitnode, getclientversion);
    }
}
