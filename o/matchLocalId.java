package o;

import o.b;

public final class matchLocalId implements getAdapterPosition<GriverRVKVStorageProxyImpl> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<isRooted> repositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public matchLocalId(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.repositoryProvider = bVar3;
    }

    public final GriverRVKVStorageProxyImpl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.repositoryProvider.get());
    }

    public static matchLocalId create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        return new matchLocalId(bVar, bVar2, bVar3);
    }

    public static GriverRVKVStorageProxyImpl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isRooted isrooted) {
        return new GriverRVKVStorageProxyImpl(appxloadfailed, getscheme, isrooted);
    }
}
