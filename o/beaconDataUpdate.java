package o;

import o.b;

public final class beaconDataUpdate implements getAdapterPosition<BeaconLocalBroadcastProcessor> {
    private final b.C0007b<toStringBuilder> savingCategoryRepositoryProvider;
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public beaconDataUpdate(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        this.savingRepositoryProvider = bVar;
        this.savingCategoryRepositoryProvider = bVar2;
    }

    public final BeaconLocalBroadcastProcessor get() {
        return newInstance(this.savingRepositoryProvider.get(), this.savingCategoryRepositoryProvider.get());
    }

    public static beaconDataUpdate create(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        return new beaconDataUpdate(bVar, bVar2);
    }

    public static BeaconLocalBroadcastProcessor newInstance(getBluetoothName getbluetoothname, toStringBuilder tostringbuilder) {
        return new BeaconLocalBroadcastProcessor(getbluetoothname, tostringbuilder);
    }
}
