package o;

import o.b;

public final class isDebug implements getAdapterPosition<setAppContext> {
    private final b.C0007b<startPhase> amcsDigitalMoneyEntityDataProvider;
    private final b.C0007b<map2String> defaultDigitalMoneyEntityDataProvider;
    private final b.C0007b<IIPCManager> splitDigitalMoneyEntityDataProvider;

    public isDebug(b.C0007b<startPhase> bVar, b.C0007b<map2String> bVar2, b.C0007b<IIPCManager> bVar3) {
        this.amcsDigitalMoneyEntityDataProvider = bVar;
        this.defaultDigitalMoneyEntityDataProvider = bVar2;
        this.splitDigitalMoneyEntityDataProvider = bVar3;
    }

    public final setAppContext get() {
        return newInstance(this.amcsDigitalMoneyEntityDataProvider.get(), this.defaultDigitalMoneyEntityDataProvider.get(), this.splitDigitalMoneyEntityDataProvider.get());
    }

    public static isDebug create(b.C0007b<startPhase> bVar, b.C0007b<map2String> bVar2, b.C0007b<IIPCManager> bVar3) {
        return new isDebug(bVar, bVar2, bVar3);
    }

    public static setAppContext newInstance(startPhase startphase, map2String map2string, IIPCManager iIPCManager) {
        return new setAppContext(startphase, map2string, iIPCManager);
    }
}
