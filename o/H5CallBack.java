package o;

import o.b;

public final class H5CallBack implements getAdapterPosition<sendToWeb> {
    private final b.C0007b<onDownloadResult> geoFenceRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public H5CallBack(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDownloadResult> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.geoFenceRepositoryProvider = bVar3;
    }

    public final sendToWeb get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.geoFenceRepositoryProvider.get());
    }

    public static H5CallBack create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDownloadResult> bVar3) {
        return new H5CallBack(bVar, bVar2, bVar3);
    }

    public static sendToWeb newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDownloadResult ondownloadresult) {
        return new sendToWeb(appxloadfailed, getscheme, ondownloadresult);
    }
}
