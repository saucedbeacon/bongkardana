package o;

import o.b;

public final class dumpFile implements getAdapterPosition<stringify> {
    private final b.C0007b<dynamicProxy> playStoreReviewRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public dumpFile(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<dynamicProxy> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.playStoreReviewRepositoryProvider = bVar3;
    }

    public final stringify get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.playStoreReviewRepositoryProvider.get());
    }

    public static dumpFile create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<dynamicProxy> bVar3) {
        return new dumpFile(bVar, bVar2, bVar3);
    }

    public static stringify newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, dynamicProxy dynamicproxy) {
        return new stringify(appxloadfailed, getscheme, dynamicproxy);
    }
}
