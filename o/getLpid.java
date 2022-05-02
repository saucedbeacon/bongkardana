package o;

import o.b;

public final class getLpid implements getAdapterPosition<getConfigWithProcessCache> {
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<getScreenWidth> withdrawMethodViewResultMapperProvider;

    public getLpid(b.C0007b<getScreenWidth> bVar, b.C0007b<defaultPlatform> bVar2) {
        this.withdrawMethodViewResultMapperProvider = bVar;
        this.currencyAmountResultMapperProvider = bVar2;
    }

    public final getConfigWithProcessCache get() {
        return newInstance(this.withdrawMethodViewResultMapperProvider.get(), this.currencyAmountResultMapperProvider.get());
    }

    public static getLpid create(b.C0007b<getScreenWidth> bVar, b.C0007b<defaultPlatform> bVar2) {
        return new getLpid(bVar, bVar2);
    }

    public static getConfigWithProcessCache newInstance(getScreenWidth getscreenwidth, defaultPlatform defaultplatform) {
        return new getConfigWithProcessCache(getscreenwidth, defaultplatform);
    }
}
