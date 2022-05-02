package o;

import o.b;

public final class getId1 implements getAdapterPosition<getServiceUuid> {
    private final b.C0007b<getId3> requestMoneyRepositoryProvider;
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;

    public getId1(b.C0007b<getId3> bVar, b.C0007b<fromInt> bVar2) {
        this.requestMoneyRepositoryProvider = bVar;
        this.sendMoneyRepositoryProvider = bVar2;
    }

    public final getServiceUuid get() {
        return newInstance(this.requestMoneyRepositoryProvider.get(), this.sendMoneyRepositoryProvider.get());
    }

    public static getId1 create(b.C0007b<getId3> bVar, b.C0007b<fromInt> bVar2) {
        return new getId1(bVar, bVar2);
    }

    public static getServiceUuid newInstance(getId3 getid3, fromInt fromint) {
        return new getServiceUuid(getid3, fromint);
    }
}
