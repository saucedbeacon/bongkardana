package o;

import o.b;

public final class diagnoseExist implements getAdapterPosition<GriverRVLoggerProxyImpl> {
    private final b.C0007b<GriverLogger> loginRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public diagnoseExist(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverLogger> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.loginRepositoryProvider = bVar3;
    }

    public final GriverRVLoggerProxyImpl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.loginRepositoryProvider.get());
    }

    public static diagnoseExist create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverLogger> bVar3) {
        return new diagnoseExist(bVar, bVar2, bVar3);
    }

    public static GriverRVLoggerProxyImpl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverLogger griverLogger) {
        return new GriverRVLoggerProxyImpl(appxloadfailed, getscheme, griverLogger);
    }
}
