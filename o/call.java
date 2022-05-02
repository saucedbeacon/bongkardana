package o;

import o.b;

public final class call implements getBindingAdapter<getIpcProxy> {
    private final b.C0007b<getIpcCallManager> categorizedPromoEntityMapperProvider;
    private final b.C0007b<getServiceBeanManager> categoryEntityMapperProvider;
    private final b.C0007b<LocalCallManagerImpl> promoEntityMapperProvider;

    public call(b.C0007b<LocalCallManagerImpl> bVar, b.C0007b<getServiceBeanManager> bVar2, b.C0007b<getIpcCallManager> bVar3) {
        this.promoEntityMapperProvider = bVar;
        this.categoryEntityMapperProvider = bVar2;
        this.categorizedPromoEntityMapperProvider = bVar3;
    }

    public static getBindingAdapter<getIpcProxy> create(b.C0007b<LocalCallManagerImpl> bVar, b.C0007b<getServiceBeanManager> bVar2, b.C0007b<getIpcCallManager> bVar3) {
        return new call(bVar, bVar2, bVar3);
    }

    public final void injectMembers(getIpcProxy getipcproxy) {
        injectInitMapperDependency(getipcproxy, this.promoEntityMapperProvider.get(), this.categoryEntityMapperProvider.get(), this.categorizedPromoEntityMapperProvider.get());
    }

    public static void injectInitMapperDependency(getIpcProxy getipcproxy, LocalCallManagerImpl localCallManagerImpl, getServiceBeanManager getservicebeanmanager, getIpcCallManager getipccallmanager) {
        getipcproxy.initMapperDependency(localCallManagerImpl, getservicebeanmanager, getipccallmanager);
    }
}
