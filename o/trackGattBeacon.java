package o;

import o.b;

public final class trackGattBeacon implements getAdapterPosition<updateTrackingHashes> {
    private final b.C0007b<getResponseCode> socialGeneralRepositoryProvider;

    public trackGattBeacon(b.C0007b<getResponseCode> bVar) {
        this.socialGeneralRepositoryProvider = bVar;
    }

    public final updateTrackingHashes get() {
        return newInstance(this.socialGeneralRepositoryProvider.get());
    }

    public static trackGattBeacon create(b.C0007b<getResponseCode> bVar) {
        return new trackGattBeacon(bVar);
    }

    public static updateTrackingHashes newInstance(getResponseCode getresponsecode) {
        return new updateTrackingHashes(getresponsecode);
    }
}
