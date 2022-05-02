package o;

import o.b;

public final class setLongitude implements getAdapterPosition<sync> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;

    public setLongitude(b.C0007b<getCommonResources> bVar) {
        this.accountRepositoryProvider = bVar;
    }

    public final sync get() {
        return newInstance(this.accountRepositoryProvider.get());
    }

    public static setLongitude create(b.C0007b<getCommonResources> bVar) {
        return new setLongitude(bVar);
    }

    public static sync newInstance(getCommonResources getcommonresources) {
        return new sync(getcommonresources);
    }
}
