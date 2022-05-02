package o;

import o.b;

public final class initialValue implements getAdapterPosition<CommonUtil> {
    private final b.C0007b<dynamicProxy> playStoreReviewRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public initialValue(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<dynamicProxy> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.playStoreReviewRepositoryProvider = bVar3;
    }

    public final CommonUtil get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.playStoreReviewRepositoryProvider.get());
    }

    public static initialValue create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<dynamicProxy> bVar3) {
        return new initialValue(bVar, bVar2, bVar3);
    }

    public static CommonUtil newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, dynamicProxy dynamicproxy) {
        return new CommonUtil(appxloadfailed, getscheme, dynamicproxy);
    }
}
