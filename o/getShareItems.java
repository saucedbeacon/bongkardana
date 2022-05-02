package o;

import o.b;

public final class getShareItems implements getAdapterPosition<ShareParam> {
    private final b.C0007b<success> repositoryProvider;

    public getShareItems(b.C0007b<success> bVar) {
        this.repositoryProvider = bVar;
    }

    public final ShareParam get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static getShareItems create(b.C0007b<success> bVar) {
        return new getShareItems(bVar);
    }

    public static ShareParam newInstance(success success) {
        return new ShareParam(success);
    }
}
