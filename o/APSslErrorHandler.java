package o;

import o.b;

public final class APSslErrorHandler implements getAdapterPosition<APJsResult> {
    private final b.C0007b<confirm> cardRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public APSslErrorHandler(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<confirm> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.cardRepositoryProvider = bVar3;
    }

    public final APJsResult get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.cardRepositoryProvider.get());
    }

    public static APSslErrorHandler create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<confirm> bVar3) {
        return new APSslErrorHandler(bVar, bVar2, bVar3);
    }

    public static APJsResult newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, confirm confirm) {
        return new APJsResult(appxloadfailed, getscheme, confirm);
    }
}
