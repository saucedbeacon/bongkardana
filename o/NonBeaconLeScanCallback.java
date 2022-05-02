package o;

import o.b;

public final class NonBeaconLeScanCallback implements getAdapterPosition<onNonBeaconLeScan> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<isPacketDistinct> twilioSdkRepositoryProvider;

    public NonBeaconLeScanCallback(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioSdkRepositoryProvider = bVar3;
    }

    public final onNonBeaconLeScan get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioSdkRepositoryProvider.get());
    }

    public static NonBeaconLeScanCallback create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        return new NonBeaconLeScanCallback(bVar, bVar2, bVar3);
    }

    public static onNonBeaconLeScan newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isPacketDistinct ispacketdistinct) {
        return new onNonBeaconLeScan(appxloadfailed, getscheme, ispacketdistinct);
    }
}
