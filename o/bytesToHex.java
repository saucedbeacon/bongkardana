package o;

import o.BeaconManager;
import o.b;

public final class bytesToHex implements getAdapterPosition<BeaconManager.ConsumerInfo> {
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;

    public bytesToHex(b.C0007b<fromInt> bVar) {
        this.sendMoneyRepositoryProvider = bVar;
    }

    public final BeaconManager.ConsumerInfo get() {
        return newInstance(this.sendMoneyRepositoryProvider.get());
    }

    public static bytesToHex create(b.C0007b<fromInt> bVar) {
        return new bytesToHex(bVar);
    }

    public static BeaconManager.ConsumerInfo newInstance(fromInt fromint) {
        return new BeaconManager.ConsumerInfo(fromint);
    }
}
