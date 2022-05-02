package o;

import o.b;

public final class IntentHandler implements getAdapterPosition<convertIntentsToCallbacks> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public IntentHandler(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3, b.C0007b<onWebViewDestory> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.servicesRepositoryProvider = bVar3;
        this.globalNetworkRepositoryProvider = bVar4;
    }

    public final convertIntentsToCallbacks get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.servicesRepositoryProvider.get(), this.globalNetworkRepositoryProvider.get());
    }

    public static IntentHandler create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3, b.C0007b<onWebViewDestory> bVar4) {
        return new IntentHandler(bVar, bVar2, bVar3, bVar4);
    }

    public static convertIntentsToCallbacks newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring, onWebViewDestory onwebviewdestory) {
        return new convertIntentsToCallbacks(appxloadfailed, getscheme, touuidstring, onwebviewdestory);
    }
}
