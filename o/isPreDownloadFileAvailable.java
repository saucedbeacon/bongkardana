package o;

import o.b;

public final class isPreDownloadFileAvailable implements getAdapterPosition<isAppIdInPreDownloadConfig> {
    private final b.C0007b<setFireMoment> qrPayRepositoryProvider;

    public isPreDownloadFileAvailable(b.C0007b<setFireMoment> bVar) {
        this.qrPayRepositoryProvider = bVar;
    }

    public final isAppIdInPreDownloadConfig get() {
        return newInstance(this.qrPayRepositoryProvider.get());
    }

    public static isPreDownloadFileAvailable create(b.C0007b<setFireMoment> bVar) {
        return new isPreDownloadFileAvailable(bVar);
    }

    public static isAppIdInPreDownloadConfig newInstance(setFireMoment setfiremoment) {
        return new isAppIdInPreDownloadConfig(setfiremoment);
    }
}
