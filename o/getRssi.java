package o;

import o.b;

public final class getRssi implements getAdapterPosition<getBeaconTypeCode> {
    private final b.C0007b<getId3> requestMoneyRepositoryProvider;

    public getRssi(b.C0007b<getId3> bVar) {
        this.requestMoneyRepositoryProvider = bVar;
    }

    public final getBeaconTypeCode get() {
        return newInstance(this.requestMoneyRepositoryProvider.get());
    }

    public static getRssi create(b.C0007b<getId3> bVar) {
        return new getRssi(bVar);
    }

    public static getBeaconTypeCode newInstance(getId3 getid3) {
        return new getBeaconTypeCode(getid3);
    }
}
