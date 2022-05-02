package o;

import o.b;

public final class openUrl implements getAdapterPosition<isBackgroundRunning> {
    private final b.C0007b<getTopActivity> couponDiscountInfoResultMapperProvider;
    private final b.C0007b<convertPlatform> couponPayMethodInfoResultMapperProvider;
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;

    public openUrl(b.C0007b<defaultPlatform> bVar, b.C0007b<getTopActivity> bVar2, b.C0007b<convertPlatform> bVar3) {
        this.currencyAmountResultMapperProvider = bVar;
        this.couponDiscountInfoResultMapperProvider = bVar2;
        this.couponPayMethodInfoResultMapperProvider = bVar3;
    }

    public final isBackgroundRunning get() {
        return newInstance(this.currencyAmountResultMapperProvider.get(), this.couponDiscountInfoResultMapperProvider.get(), this.couponPayMethodInfoResultMapperProvider.get());
    }

    public static openUrl create(b.C0007b<defaultPlatform> bVar, b.C0007b<getTopActivity> bVar2, b.C0007b<convertPlatform> bVar3) {
        return new openUrl(bVar, bVar2, bVar3);
    }

    public static isBackgroundRunning newInstance(defaultPlatform defaultplatform, getTopActivity gettopactivity, convertPlatform convertplatform) {
        return new isBackgroundRunning(defaultplatform, gettopactivity, convertplatform);
    }
}
