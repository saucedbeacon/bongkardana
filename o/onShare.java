package o;

import o.b;

public final class onShare implements getAdapterPosition<BaseShareItem> {
    private final b.C0007b<success> repositoryProvider;

    public onShare(b.C0007b<success> bVar) {
        this.repositoryProvider = bVar;
    }

    public final BaseShareItem get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static onShare create(b.C0007b<success> bVar) {
        return new onShare(bVar);
    }

    public static BaseShareItem newInstance(success success) {
        return new BaseShareItem(success);
    }
}
