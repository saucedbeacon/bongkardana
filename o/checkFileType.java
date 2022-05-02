package o;

import o.b;

public final class checkFileType implements getAdapterPosition<isLocalPath> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<isDynamicDelivery> payAssetRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public checkFileType(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isDynamicDelivery> bVar3, b.C0007b<getCommonResources> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.payAssetRepositoryProvider = bVar3;
        this.accountRepositoryProvider = bVar4;
    }

    public final isLocalPath get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.payAssetRepositoryProvider.get(), this.accountRepositoryProvider.get());
    }

    public static checkFileType create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isDynamicDelivery> bVar3, b.C0007b<getCommonResources> bVar4) {
        return new checkFileType(bVar, bVar2, bVar3, bVar4);
    }

    public static isLocalPath newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isDynamicDelivery isdynamicdelivery, getCommonResources getcommonresources) {
        return new isLocalPath(appxloadfailed, getscheme, isdynamicdelivery, getcommonresources);
    }
}
