package o;

import o.b;

public final class getTxPower implements getAdapterPosition<setExtraDataFields> {
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;

    public getTxPower(b.C0007b<fromInt> bVar) {
        this.sendMoneyRepositoryProvider = bVar;
    }

    public final setExtraDataFields get() {
        return newInstance(this.sendMoneyRepositoryProvider.get());
    }

    public static getTxPower create(b.C0007b<fromInt> bVar) {
        return new getTxPower(bVar);
    }

    public static setExtraDataFields newInstance(fromInt fromint) {
        return new setExtraDataFields(fromint);
    }
}
