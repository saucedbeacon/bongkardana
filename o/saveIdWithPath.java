package o;

import o.b;

public final class saveIdWithPath implements getAdapterPosition<ExecutorType> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<getServiceBeans> payAssetMapperProvider;
    private final b.C0007b<getAppLayoutDirection> payMethodRiskResultMapperProvider;

    public saveIdWithPath(b.C0007b<defaultPlatform> bVar, b.C0007b<getServiceBeans> bVar2, b.C0007b<getAppLayoutDirection> bVar3) {
        this.currencyAmountResultMapperProvider = bVar;
        this.payAssetMapperProvider = bVar2;
        this.payMethodRiskResultMapperProvider = bVar3;
    }

    public final ExecutorType get() {
        return newInstance(this.currencyAmountResultMapperProvider.get(), this.payAssetMapperProvider.get(), this.payMethodRiskResultMapperProvider.get());
    }

    public static saveIdWithPath create(b.C0007b<defaultPlatform> bVar, b.C0007b<getServiceBeans> bVar2, b.C0007b<getAppLayoutDirection> bVar3) {
        return new saveIdWithPath(bVar, bVar2, bVar3);
    }

    public static ExecutorType newInstance(defaultPlatform defaultplatform, getServiceBeans getservicebeans, getAppLayoutDirection getapplayoutdirection) {
        return new ExecutorType(defaultplatform, getservicebeans, getapplayoutdirection);
    }
}
