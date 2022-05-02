package o;

import o.b;

public final class getH5ErrorPage implements getAdapterPosition<getErrorUrl> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setTimeoutForContext> recentContactRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getH5ErrorPage(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setTimeoutForContext> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.recentContactRepositoryProvider = bVar3;
    }

    public final getErrorUrl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.recentContactRepositoryProvider.get());
    }

    public static getH5ErrorPage create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setTimeoutForContext> bVar3) {
        return new getH5ErrorPage(bVar, bVar2, bVar3);
    }

    public static getErrorUrl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setTimeoutForContext settimeoutforcontext) {
        return new getErrorUrl(appxloadfailed, getscheme, settimeoutforcontext);
    }
}
