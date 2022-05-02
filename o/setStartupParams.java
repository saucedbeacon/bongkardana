package o;

import o.b;

public final class setStartupParams implements getAdapterPosition<isWorkerReady> {
    private final b.C0007b<BridgeCallback> nearbyMeConfigDataFactoryProvider;

    public setStartupParams(b.C0007b<BridgeCallback> bVar) {
        this.nearbyMeConfigDataFactoryProvider = bVar;
    }

    public final isWorkerReady get() {
        return newInstance(this.nearbyMeConfigDataFactoryProvider.get());
    }

    public static setStartupParams create(b.C0007b<BridgeCallback> bVar) {
        return new setStartupParams(bVar);
    }

    public static isWorkerReady newInstance(BridgeCallback bridgeCallback) {
        return new isWorkerReady(bridgeCallback);
    }
}
