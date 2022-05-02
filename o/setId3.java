package o;

import o.b;

public final class setId3 implements getAdapterPosition<setBeaconTypeCode> {
    private final b.C0007b<toStringBuilder> savingCategoryRepositoryProvider;
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public setId3(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        this.savingRepositoryProvider = bVar;
        this.savingCategoryRepositoryProvider = bVar2;
    }

    public final setBeaconTypeCode get() {
        return newInstance(this.savingRepositoryProvider.get(), this.savingCategoryRepositoryProvider.get());
    }

    public static setId3 create(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        return new setId3(bVar, bVar2);
    }

    public static setBeaconTypeCode newInstance(getBluetoothName getbluetoothname, toStringBuilder tostringbuilder) {
        return new setBeaconTypeCode(getbluetoothname, tostringbuilder);
    }
}
