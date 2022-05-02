package o;

import o.b;

public final class unbindService implements getAdapterPosition<setMultiFrameBeacon> {
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public unbindService(b.C0007b<getBluetoothName> bVar) {
        this.savingRepositoryProvider = bVar;
    }

    public final setMultiFrameBeacon get() {
        return newInstance(this.savingRepositoryProvider.get());
    }

    public static unbindService create(b.C0007b<getBluetoothName> bVar) {
        return new unbindService(bVar);
    }

    public static setMultiFrameBeacon newInstance(getBluetoothName getbluetoothname) {
        return new setMultiFrameBeacon(getbluetoothname);
    }
}
