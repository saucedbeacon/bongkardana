package o;

import o.b;

public final class getBridgeExtensions implements getAdapterPosition<getAccessController> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<preload> globalNetworkDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getEmbedViews> payAssetEntityDataFactoryProvider;
    private final b.C0007b<getServiceBeans> payAssetMapperProvider;

    public getBridgeExtensions(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getEmbedViews> bVar4, b.C0007b<onCallBack> bVar5, b.C0007b<getServiceBeans> bVar6, b.C0007b<getAppLaunchParams> bVar7, b.C0007b<preload> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.payAssetEntityDataFactoryProvider = bVar4;
        this.configEntityDataFactoryProvider = bVar5;
        this.payAssetMapperProvider = bVar6;
        this.errorConfigFactoryProvider = bVar7;
        this.globalNetworkDataFactoryProvider = bVar8;
    }

    public final getAccessController get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.payAssetEntityDataFactoryProvider.get(), this.configEntityDataFactoryProvider.get(), this.payAssetMapperProvider.get(), this.errorConfigFactoryProvider.get(), this.globalNetworkDataFactoryProvider.get());
    }

    public static getBridgeExtensions create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getEmbedViews> bVar4, b.C0007b<onCallBack> bVar5, b.C0007b<getServiceBeans> bVar6, b.C0007b<getAppLaunchParams> bVar7, b.C0007b<preload> bVar8) {
        return new getBridgeExtensions(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static getAccessController newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, getEmbedViews getembedviews, onCallBack oncallback, getServiceBeans getservicebeans, getAppLaunchParams getapplaunchparams, preload preload) {
        return new getAccessController(dialogLayout, r11, backKeyDownPoint, getembedviews, oncallback, getservicebeans, getapplaunchparams, preload);
    }
}
