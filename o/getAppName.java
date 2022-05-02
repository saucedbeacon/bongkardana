package o;

import o.b;

public final class getAppName implements getAdapterPosition<convertPlatform> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;

    public getAppName(b.C0007b<defaultPlatform> bVar) {
        this.currencyAmountResultMapperProvider = bVar;
    }

    public final convertPlatform get() {
        return newInstance(this.currencyAmountResultMapperProvider.get());
    }

    public static getAppName create(b.C0007b<defaultPlatform> bVar) {
        return new getAppName(bVar);
    }

    public static convertPlatform newInstance(defaultPlatform defaultplatform) {
        return new convertPlatform(defaultplatform);
    }
}
