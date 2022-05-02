package o;

import o.b;

public final class RVMultimediaProxy implements getAdapterPosition<RVExtensionService> {
    private final b.C0007b<getAppRegion> payChannelResultMapperProvider;
    private final b.C0007b<getAppCurrency> payOptionsResultMapperProvider;

    public RVMultimediaProxy(b.C0007b<getAppCurrency> bVar, b.C0007b<getAppRegion> bVar2) {
        this.payOptionsResultMapperProvider = bVar;
        this.payChannelResultMapperProvider = bVar2;
    }

    public final RVExtensionService get() {
        return newInstance(this.payOptionsResultMapperProvider.get(), this.payChannelResultMapperProvider.get());
    }

    public static RVMultimediaProxy create(b.C0007b<getAppCurrency> bVar, b.C0007b<getAppRegion> bVar2) {
        return new RVMultimediaProxy(bVar, bVar2);
    }

    public static RVExtensionService newInstance(getAppCurrency getappcurrency, getAppRegion getappregion) {
        return new RVExtensionService(getappcurrency, getappregion);
    }
}
