package o;

import o.b;

public final class BeaconData implements getAdapterPosition<setBluetoothName> {
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public BeaconData(b.C0007b<getBluetoothName> bVar) {
        this.savingRepositoryProvider = bVar;
    }

    public final setBluetoothName get() {
        return newInstance(this.savingRepositoryProvider.get());
    }

    public static BeaconData create(b.C0007b<getBluetoothName> bVar) {
        return new BeaconData(bVar);
    }

    public static setBluetoothName newInstance(getBluetoothName getbluetoothname) {
        return new setBluetoothName(getbluetoothname);
    }
}
