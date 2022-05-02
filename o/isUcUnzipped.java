package o;

import o.b;

public final class isUcUnzipped implements getAdapterPosition<H5UCProvider> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDescriptorWrite> userRepositoryProvider;

    public isUcUnzipped(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3, b.C0007b<onDescriptorWrite> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.globalNetworkRepositoryProvider = bVar3;
        this.userRepositoryProvider = bVar4;
    }

    public final H5UCProvider get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.globalNetworkRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static isUcUnzipped create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onWebViewDestory> bVar3, b.C0007b<onDescriptorWrite> bVar4) {
        return new isUcUnzipped(bVar, bVar2, bVar3, bVar4);
    }

    public static H5UCProvider newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory, onDescriptorWrite ondescriptorwrite) {
        return new H5UCProvider(appxloadfailed, getscheme, onwebviewdestory, ondescriptorwrite);
    }
}
