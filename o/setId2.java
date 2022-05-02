package o;

import o.Beacon;
import o.b;

public final class setId2 implements getAdapterPosition<Beacon.Builder> {
    private final b.C0007b<toStringBuilder> savingCategoryRepositoryProvider;
    private final b.C0007b<getBluetoothName> savingRepositoryProvider;

    public setId2(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        this.savingRepositoryProvider = bVar;
        this.savingCategoryRepositoryProvider = bVar2;
    }

    public final Beacon.Builder get() {
        return newInstance(this.savingRepositoryProvider.get(), this.savingCategoryRepositoryProvider.get());
    }

    public static setId2 create(b.C0007b<getBluetoothName> bVar, b.C0007b<toStringBuilder> bVar2) {
        return new setId2(bVar, bVar2);
    }

    public static Beacon.Builder newInstance(getBluetoothName getbluetoothname, toStringBuilder tostringbuilder) {
        return new Beacon.Builder(getbluetoothname, tostringbuilder);
    }
}
