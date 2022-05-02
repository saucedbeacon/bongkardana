package o;

import o.b;

public final class setServiceUuid implements getAdapterPosition<setTxPower> {
    private final b.C0007b<isExtraBeaconData> savingConfigRepositoryProvider;

    public setServiceUuid(b.C0007b<isExtraBeaconData> bVar) {
        this.savingConfigRepositoryProvider = bVar;
    }

    public final setTxPower get() {
        return newInstance(this.savingConfigRepositoryProvider.get());
    }

    public static setServiceUuid create(b.C0007b<isExtraBeaconData> bVar) {
        return new setServiceUuid(bVar);
    }

    public static setTxPower newInstance(isExtraBeaconData isextrabeacondata) {
        return new setTxPower(isextrabeacondata);
    }
}
