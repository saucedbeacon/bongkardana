package o;

import o.b;

public final class GVPageContainer implements getAdapterPosition<startShare> {
    private final b.C0007b<success> repositoryProvider;

    public GVPageContainer(b.C0007b<success> bVar) {
        this.repositoryProvider = bVar;
    }

    public final startShare get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static GVPageContainer create(b.C0007b<success> bVar) {
        return new GVPageContainer(bVar);
    }

    public static startShare newInstance(success success) {
        return new startShare(success);
    }
}
