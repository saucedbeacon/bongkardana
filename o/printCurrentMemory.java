package o;

import o.b;

public final class printCurrentMemory implements getAdapterPosition<TinyAppFileUtils> {
    private final b.C0007b<isDynamicDelivery> payAssetRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public printCurrentMemory(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isDynamicDelivery> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.payAssetRepositoryProvider = bVar3;
    }

    public final TinyAppFileUtils get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.payAssetRepositoryProvider.get());
    }

    public static printCurrentMemory create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isDynamicDelivery> bVar3) {
        return new printCurrentMemory(bVar, bVar2, bVar3);
    }

    public static TinyAppFileUtils newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isDynamicDelivery isdynamicdelivery) {
        return new TinyAppFileUtils(appxloadfailed, getscheme, isdynamicdelivery);
    }
}
