package o;

import o.b;

public final class eventSource implements getAdapterPosition<isKeepCallback> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDescriptorWrite> userRepositoryProvider;

    public eventSource(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3, b.C0007b<onDescriptorWrite> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
        this.userRepositoryProvider = bVar4;
    }

    public final isKeepCallback get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static eventSource create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3, b.C0007b<onDescriptorWrite> bVar4) {
        return new eventSource(bVar, bVar2, bVar3, bVar4);
    }

    public static isKeepCallback newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory, onDescriptorWrite ondescriptorwrite) {
        return new isKeepCallback(appxloadfailed, getscheme, onwebviewdestory, ondescriptorwrite);
    }
}
