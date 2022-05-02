package o;

import o.b;

public final class getId2 implements getAdapterPosition<getManufacturer> {
    private final b.C0007b<getId3> requestMoneyRepositoryProvider;

    public getId2(b.C0007b<getId3> bVar) {
        this.requestMoneyRepositoryProvider = bVar;
    }

    public final getManufacturer get() {
        return newInstance(this.requestMoneyRepositoryProvider.get());
    }

    public static getId2 create(b.C0007b<getId3> bVar) {
        return new getId2(bVar);
    }

    public static getManufacturer newInstance(getId3 getid3) {
        return new getManufacturer(getid3);
    }
}
