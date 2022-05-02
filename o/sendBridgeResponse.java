package o;

import o.b;

public final class sendBridgeResponse implements getAdapterPosition<SendToWorkerCallback> {
    private final b.C0007b<getAppxDomain> localNearbyMeEntityDataProvider;

    public sendBridgeResponse(b.C0007b<getAppxDomain> bVar) {
        this.localNearbyMeEntityDataProvider = bVar;
    }

    public final SendToWorkerCallback get() {
        return newInstance(this.localNearbyMeEntityDataProvider.get());
    }

    public static sendBridgeResponse create(b.C0007b<getAppxDomain> bVar) {
        return new sendBridgeResponse(bVar);
    }

    public static SendToWorkerCallback newInstance(getAppxDomain getappxdomain) {
        return new SendToWorkerCallback(getappxdomain);
    }
}
