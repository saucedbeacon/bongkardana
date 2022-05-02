package o;

import o.b;

public final class getConfigJSONObject implements getAdapterPosition<getConfigJSONArray> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<getScreenWidth> withdrawMethodViewResultMapperProvider;

    public getConfigJSONObject(b.C0007b<defaultPlatform> bVar, b.C0007b<getScreenWidth> bVar2) {
        this.currencyAmountResultMapperProvider = bVar;
        this.withdrawMethodViewResultMapperProvider = bVar2;
    }

    public final getConfigJSONArray get() {
        return newInstance(this.currencyAmountResultMapperProvider.get(), this.withdrawMethodViewResultMapperProvider.get());
    }

    public static getConfigJSONObject create(b.C0007b<defaultPlatform> bVar, b.C0007b<getScreenWidth> bVar2) {
        return new getConfigJSONObject(bVar, bVar2);
    }

    public static getConfigJSONArray newInstance(defaultPlatform defaultplatform, getScreenWidth getscreenwidth) {
        return new getConfigJSONArray(defaultplatform, getscreenwidth);
    }
}
