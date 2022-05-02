package o;

import o.b;

public final class isInstalled implements getAdapterPosition<getDownloadFile> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<setStorageProxy> merchantInfoRepositoryProvider;

    public isInstalled(b.C0007b<setStorageProxy> bVar, b.C0007b<getCommonResources> bVar2) {
        this.merchantInfoRepositoryProvider = bVar;
        this.accountRepositoryProvider = bVar2;
    }

    public final getDownloadFile get() {
        return newInstance(this.merchantInfoRepositoryProvider.get(), this.accountRepositoryProvider.get());
    }

    public static isInstalled create(b.C0007b<setStorageProxy> bVar, b.C0007b<getCommonResources> bVar2) {
        return new isInstalled(bVar, bVar2);
    }

    public static getDownloadFile newInstance(setStorageProxy setstorageproxy, getCommonResources getcommonresources) {
        return new getDownloadFile(setstorageproxy, getcommonresources);
    }
}
