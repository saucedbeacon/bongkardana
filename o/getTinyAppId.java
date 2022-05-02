package o;

import o.b;

public final class getTinyAppId implements getAdapterPosition<getAppKey> {
    private final b.C0007b<getGwUrl> savingConfigEntityDataFactoryProvider;

    public getTinyAppId(b.C0007b<getGwUrl> bVar) {
        this.savingConfigEntityDataFactoryProvider = bVar;
    }

    public final getAppKey get() {
        return newInstance(this.savingConfigEntityDataFactoryProvider.get());
    }

    public static getTinyAppId create(b.C0007b<getGwUrl> bVar) {
        return new getTinyAppId(bVar);
    }

    public static getAppKey newInstance(getGwUrl getgwurl) {
        return new getAppKey(getgwurl);
    }
}
