package o;

import o.b;

public final class revokeOpenAuthItemClicked implements getAdapterPosition<getOpenAuthStatus> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;

    public revokeOpenAuthItemClicked(b.C0007b<getCommonResources> bVar) {
        this.accountRepositoryProvider = bVar;
    }

    public final getOpenAuthStatus get() {
        return newInstance(this.accountRepositoryProvider.get());
    }

    public static revokeOpenAuthItemClicked create(b.C0007b<getCommonResources> bVar) {
        return new revokeOpenAuthItemClicked(bVar);
    }

    public static getOpenAuthStatus newInstance(getCommonResources getcommonresources) {
        return new getOpenAuthStatus(getcommonresources);
    }
}
