package o;

import o.b;

public final class onReceivedLoginRequest implements getAdapterPosition<getJSBridge> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public onReceivedLoginRequest(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.sendMoneyRepositoryProvider = bVar3;
    }

    public final getJSBridge get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.sendMoneyRepositoryProvider.get());
    }

    public static onReceivedLoginRequest create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<fromInt> bVar3) {
        return new onReceivedLoginRequest(bVar, bVar2, bVar3);
    }

    public static getJSBridge newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, fromInt fromint) {
        return new getJSBridge(appxloadfailed, getscheme, fromint);
    }
}
