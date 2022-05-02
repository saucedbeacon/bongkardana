package o;

import o.b;

public final class onBeaconServiceConnect implements getAdapterPosition<BeaconConsumer> {
    private final b.C0007b<toStringBuilder> savingCategoryRepositoryProvider;
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public onBeaconServiceConnect(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        this.savingRepositoryProvider = bVar;
        this.savingCategoryRepositoryProvider = bVar2;
    }

    public final BeaconConsumer get() {
        return newInstance(this.savingRepositoryProvider.get(), this.savingCategoryRepositoryProvider.get());
    }

    public static onBeaconServiceConnect create(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        return new onBeaconServiceConnect(bVar, bVar2);
    }

    public static BeaconConsumer newInstance(getBluetoothName getbluetoothname, toStringBuilder tostringbuilder) {
        return new BeaconConsumer(getbluetoothname, tostringbuilder);
    }
}
