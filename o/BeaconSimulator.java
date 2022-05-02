package o;

import o.b;

public final class BeaconSimulator implements getAdapterPosition<BootstrapNotifier> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<isPacketDistinct> twilioSdkRepositoryProvider;

    public BeaconSimulator(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioSdkRepositoryProvider = bVar3;
    }

    public final BootstrapNotifier get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioSdkRepositoryProvider.get());
    }

    public static BeaconSimulator create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        return new BeaconSimulator(bVar, bVar2, bVar3);
    }

    public static BootstrapNotifier newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isPacketDistinct ispacketdistinct) {
        return new BootstrapNotifier(appxloadfailed, getscheme, ispacketdistinct);
    }
}
