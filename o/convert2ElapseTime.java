package o;

import o.b;

public final class convert2ElapseTime implements getAdapterPosition<SystemUtils> {
    private final b.C0007b<isDynamicDelivery> payAssetRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public convert2ElapseTime(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isDynamicDelivery> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.payAssetRepositoryProvider = bVar3;
    }

    public final SystemUtils get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.payAssetRepositoryProvider.get());
    }

    public static convert2ElapseTime create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isDynamicDelivery> bVar3) {
        return new convert2ElapseTime(bVar, bVar2, bVar3);
    }

    public static SystemUtils newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isDynamicDelivery isdynamicdelivery) {
        return new SystemUtils(appxloadfailed, getscheme, isdynamicdelivery);
    }
}
