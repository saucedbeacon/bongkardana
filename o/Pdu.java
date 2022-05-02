package o;

import o.b;

public final class Pdu implements getAdapterPosition<dataUpdated> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<isPacketDistinct> twilioSdkRepositoryProvider;

    public Pdu(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.twilioSdkRepositoryProvider = bVar3;
    }

    public final dataUpdated get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.twilioSdkRepositoryProvider.get());
    }

    public static Pdu create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<isPacketDistinct> bVar3) {
        return new Pdu(bVar, bVar2, bVar3);
    }

    public static dataUpdated newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, isPacketDistinct ispacketdistinct) {
        return new dataUpdated(appxloadfailed, getscheme, ispacketdistinct);
    }
}
