package o;

import o.AppPreDownloadManager;
import o.b;

public final class getAppPreDownloadPackageManager implements getAdapterPosition<getAppPreDownloadCacheManager> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<setFireMoment> qrPayRepositoryProvider;
    private final b.C0007b<AppPreDownloadManager.AnonymousClass3> qrisPaymentDataProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDescriptorWrite> userRepositoryProvider;

    public getAppPreDownloadPackageManager(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<AppPreDownloadManager.AnonymousClass3> bVar3, b.C0007b<setFireMoment> bVar4, b.C0007b<onDescriptorWrite> bVar5) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.qrisPaymentDataProvider = bVar3;
        this.qrPayRepositoryProvider = bVar4;
        this.userRepositoryProvider = bVar5;
    }

    public final getAppPreDownloadCacheManager get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.qrisPaymentDataProvider.get(), this.qrPayRepositoryProvider.get(), this.userRepositoryProvider.get());
    }

    public static getAppPreDownloadPackageManager create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<AppPreDownloadManager.AnonymousClass3> bVar3, b.C0007b<setFireMoment> bVar4, b.C0007b<onDescriptorWrite> bVar5) {
        return new getAppPreDownloadPackageManager(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static getAppPreDownloadCacheManager newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, AppPreDownloadManager.AnonymousClass3 r9, setFireMoment setfiremoment, onDescriptorWrite ondescriptorwrite) {
        return new getAppPreDownloadCacheManager(appxloadfailed, getscheme, r9, setfiremoment, ondescriptorwrite);
    }
}
