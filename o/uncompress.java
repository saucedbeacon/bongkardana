package o;

import o.b;

public final class uncompress implements getAdapterPosition<BleAdvertisement> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<clearDetections> twilioDialogRepositoryProvider;

    public uncompress(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioDialogRepositoryProvider = bVar3;
    }

    public final BleAdvertisement get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioDialogRepositoryProvider.get());
    }

    public static uncompress create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<clearDetections> bVar3) {
        return new uncompress(bVar, bVar2, bVar3);
    }

    public static BleAdvertisement newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, clearDetections cleardetections) {
        return new BleAdvertisement(appxloadfailed, getscheme, cleardetections);
    }
}
