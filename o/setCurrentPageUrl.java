package o;

import o.b;

public final class setCurrentPageUrl implements getAdapterPosition<setIsvAppId> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;

    public setCurrentPageUrl(b.C0007b<onCallBack> bVar) {
        this.configEntityDataFactoryProvider = bVar;
    }

    public final setIsvAppId get() {
        return newInstance(this.configEntityDataFactoryProvider.get());
    }

    public static setCurrentPageUrl create(b.C0007b<onCallBack> bVar) {
        return new setCurrentPageUrl(bVar);
    }

    public static setIsvAppId newInstance(onCallBack oncallback) {
        return new setIsvAppId(oncallback);
    }
}
