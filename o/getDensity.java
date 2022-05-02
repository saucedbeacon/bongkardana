package o;

import o.b;

public final class getDensity implements getAdapterPosition<DimensionUtil> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<RVExtensionService> payMethodViewResultMapperProvider;

    public getDensity(b.C0007b<defaultPlatform> bVar, b.C0007b<RVExtensionService> bVar2) {
        this.currencyAmountResultMapperProvider = bVar;
        this.payMethodViewResultMapperProvider = bVar2;
    }

    public final DimensionUtil get() {
        return newInstance(this.currencyAmountResultMapperProvider.get(), this.payMethodViewResultMapperProvider.get());
    }

    public static getDensity create(b.C0007b<defaultPlatform> bVar, b.C0007b<RVExtensionService> bVar2) {
        return new getDensity(bVar, bVar2);
    }

    public static DimensionUtil newInstance(defaultPlatform defaultplatform, RVExtensionService rVExtensionService) {
        return new DimensionUtil(defaultplatform, rVExtensionService);
    }
}
