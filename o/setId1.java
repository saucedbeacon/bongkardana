package o;

import o.b;

public final class setId1 implements getAdapterPosition<setIdentifiers> {
    private final b.C0007b<toStringBuilder> savingCategoryRepositoryProvider;
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public setId1(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        this.savingRepositoryProvider = bVar;
        this.savingCategoryRepositoryProvider = bVar2;
    }

    public final setIdentifiers get() {
        return newInstance(this.savingRepositoryProvider.get(), this.savingCategoryRepositoryProvider.get());
    }

    public static setId1 create(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        return new setId1(bVar, bVar2);
    }

    public static setIdentifiers newInstance(getBluetoothName getbluetoothname, toStringBuilder tostringbuilder) {
        return new setIdentifiers(getbluetoothname, tostringbuilder);
    }
}
