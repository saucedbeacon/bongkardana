package o;

import o.b;

public final class setTaskRoot implements getAdapterPosition<setAppModel> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<setReceivedRemoteReady> pocketInfoDataFactoryProvider;
    private final b.C0007b<BaseEmbedView> pocketMapperProvider;

    public setTaskRoot(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<setReceivedRemoteReady> bVar4, b.C0007b<BaseEmbedView> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.pocketInfoDataFactoryProvider = bVar4;
        this.pocketMapperProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
    }

    public final setAppModel get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.pocketInfoDataFactoryProvider.get(), this.pocketMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static setTaskRoot create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<setReceivedRemoteReady> bVar4, b.C0007b<BaseEmbedView> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        return new setTaskRoot(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static setAppModel newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, setReceivedRemoteReady setreceivedremoteready, BaseEmbedView baseEmbedView, getAppLaunchParams getapplaunchparams) {
        return new setAppModel(dialogLayout, r9, backKeyDownPoint, setreceivedremoteready, baseEmbedView, getapplaunchparams);
    }
}
