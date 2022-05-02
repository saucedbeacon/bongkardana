package o;

import o.b;

public final class getPublishingStatus implements getAdapterPosition<getH5AppFromAppInfo> {
    private final b.C0007b<setStorageProxy> merchantInfoRepositoryProvider;

    public getPublishingStatus(b.C0007b<setStorageProxy> bVar) {
        this.merchantInfoRepositoryProvider = bVar;
    }

    public final getH5AppFromAppInfo get() {
        return newInstance(this.merchantInfoRepositoryProvider.get());
    }

    public static getPublishingStatus create(b.C0007b<setStorageProxy> bVar) {
        return new getPublishingStatus(bVar);
    }

    public static getH5AppFromAppInfo newInstance(setStorageProxy setstorageproxy) {
        return new getH5AppFromAppInfo(setstorageproxy);
    }
}
