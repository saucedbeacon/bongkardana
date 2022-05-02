package o;

import o.b;

public final class useCancel implements getAdapterPosition<getInvokeType> {
    private final b.C0007b<onDownloadResult> geoFenceRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public useCancel(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDownloadResult> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.geoFenceRepositoryProvider = bVar3;
    }

    public final getInvokeType get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.geoFenceRepositoryProvider.get());
    }

    public static useCancel create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDownloadResult> bVar3) {
        return new useCancel(bVar, bVar2, bVar3);
    }

    public static getInvokeType newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDownloadResult ondownloadresult) {
        return new getInvokeType(appxloadfailed, getscheme, ondownloadresult);
    }
}
