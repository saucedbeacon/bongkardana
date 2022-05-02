package o;

import o.b;

public final class createScanFilterDataForBeaconParser implements getAdapterPosition<ScanFilterUtils> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<isPacketDistinct> twilioSdkRepositoryProvider;

    public createScanFilterDataForBeaconParser(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioSdkRepositoryProvider = bVar3;
    }

    public final ScanFilterUtils get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioSdkRepositoryProvider.get());
    }

    public static createScanFilterDataForBeaconParser create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        return new createScanFilterDataForBeaconParser(bVar, bVar2, bVar3);
    }

    public static ScanFilterUtils newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isPacketDistinct ispacketdistinct) {
        return new ScanFilterUtils(appxloadfailed, getscheme, ispacketdistinct);
    }
}
