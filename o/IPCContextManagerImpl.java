package o;

import o.b;

public final class IPCContextManagerImpl implements getAdapterPosition<getIpcProxy> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getIpcCallManager> categorizedPromoEntityMapperProvider;
    private final b.C0007b<getServiceBeanManager> categoryEntityMapperProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<exitApp> featureConfigEntityRepositoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<setLocalCallRetryHandler> promoCenterEntityDataFactoryProvider;
    private final b.C0007b<LocalCallManagerImpl> promoEntityMapperProvider;

    public IPCContextManagerImpl(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<setLocalCallRetryHandler> bVar5, b.C0007b<exitApp> bVar6, b.C0007b<LocalCallManagerImpl> bVar7, b.C0007b<getServiceBeanManager> bVar8, b.C0007b<getIpcCallManager> bVar9) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.promoCenterEntityDataFactoryProvider = bVar5;
        this.featureConfigEntityRepositoryProvider = bVar6;
        this.promoEntityMapperProvider = bVar7;
        this.categoryEntityMapperProvider = bVar8;
        this.categorizedPromoEntityMapperProvider = bVar9;
    }

    public final getIpcProxy get() {
        getIpcProxy newInstance = newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.promoCenterEntityDataFactoryProvider.get(), this.featureConfigEntityRepositoryProvider.get());
        call.injectInitMapperDependency(newInstance, this.promoEntityMapperProvider.get(), this.categoryEntityMapperProvider.get(), this.categorizedPromoEntityMapperProvider.get());
        return newInstance;
    }

    public static IPCContextManagerImpl create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<setLocalCallRetryHandler> bVar5, b.C0007b<exitApp> bVar6, b.C0007b<LocalCallManagerImpl> bVar7, b.C0007b<getServiceBeanManager> bVar8, b.C0007b<getIpcCallManager> bVar9) {
        return new IPCContextManagerImpl(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public static getIpcProxy newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, setLocalCallRetryHandler setlocalcallretryhandler, exitApp exitapp) {
        return new getIpcProxy(dialogLayout, r9, backKeyDownPoint, getapplaunchparams, setlocalcallretryhandler, exitapp);
    }
}
