package o;

import o.b;

public final class pathSecurityCheck implements getAdapterPosition<H5ResourceHandlerUtil> {
    private final b.C0007b<toDigit> notificationCenterRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public pathSecurityCheck(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toDigit> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.notificationCenterRepositoryProvider = bVar3;
    }

    public final H5ResourceHandlerUtil get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.notificationCenterRepositoryProvider.get());
    }

    public static pathSecurityCheck create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toDigit> bVar3) {
        return new pathSecurityCheck(bVar, bVar2, bVar3);
    }

    public static H5ResourceHandlerUtil newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, toDigit todigit) {
        return new H5ResourceHandlerUtil(appxloadfailed, getscheme, todigit);
    }
}
