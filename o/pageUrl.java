package o;

import o.b;

public final class pageUrl implements getAdapterPosition<appendAll> {
    private final b.C0007b<workerType> merchantCategoriesRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public pageUrl(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<workerType> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.merchantCategoriesRepositoryProvider = bVar3;
    }

    public final appendAll get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.merchantCategoriesRepositoryProvider.get());
    }

    public static pageUrl create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<workerType> bVar3) {
        return new pageUrl(bVar, bVar2, bVar3);
    }

    public static appendAll newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, workerType workertype) {
        return new appendAll(appxloadfailed, getscheme, workertype);
    }
}
