package o;

import o.b;

public final class getLongitude implements getAdapterPosition<getLatitude> {
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public getLongitude(b.C0007b<getBluetoothName> bVar) {
        this.savingRepositoryProvider = bVar;
    }

    public final getLatitude get() {
        return newInstance(this.savingRepositoryProvider.get());
    }

    public static getLongitude create(b.C0007b<getBluetoothName> bVar) {
        return new getLongitude(bVar);
    }

    public static getLatitude newInstance(getBluetoothName getbluetoothname) {
        return new getLatitude(getbluetoothname);
    }
}
