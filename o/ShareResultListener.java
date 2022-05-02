package o;

import o.b;

public final class ShareResultListener implements getAdapterPosition<GriverShareMenuExtension> {
    private final b.C0007b<success> repositoryProvider;

    public ShareResultListener(b.C0007b<success> bVar) {
        this.repositoryProvider = bVar;
    }

    public final GriverShareMenuExtension get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static ShareResultListener create(b.C0007b<success> bVar) {
        return new ShareResultListener(bVar);
    }

    public static GriverShareMenuExtension newInstance(success success) {
        return new GriverShareMenuExtension(success);
    }
}
