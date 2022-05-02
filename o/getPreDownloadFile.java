package o;

import o.b;

public final class getPreDownloadFile implements getAdapterPosition<deletePreDownloadFileByAppId> {
    private final b.C0007b<isRooted> nearbyMeRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getPreDownloadFile(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.nearbyMeRepositoryProvider = bVar3;
    }

    public final deletePreDownloadFileByAppId get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.nearbyMeRepositoryProvider.get());
    }

    public static getPreDownloadFile create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isRooted> bVar3) {
        return new getPreDownloadFile(bVar, bVar2, bVar3);
    }

    public static deletePreDownloadFileByAppId newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isRooted isrooted) {
        return new deletePreDownloadFileByAppId(appxloadfailed, getscheme, isrooted);
    }
}
