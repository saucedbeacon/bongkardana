package o;

import o.b;

public final class setBluetoothAddress implements getAdapterPosition<setManufacturer> {
    private final b.C0007b<toStringBuilder> savingCategoryRepositoryProvider;
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public setBluetoothAddress(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        this.savingRepositoryProvider = bVar;
        this.savingCategoryRepositoryProvider = bVar2;
    }

    public final setManufacturer get() {
        return newInstance(this.savingRepositoryProvider.get(), this.savingCategoryRepositoryProvider.get());
    }

    public static setBluetoothAddress create(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        return new setBluetoothAddress(bVar, bVar2);
    }

    public static setManufacturer newInstance(getBluetoothName getbluetoothname, toStringBuilder tostringbuilder) {
        return new setManufacturer(getbluetoothname, tostringbuilder);
    }
}
