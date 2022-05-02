package o;

import o.b;

public final class getExtraDataFields implements getAdapterPosition<getDataFields> {
    private final b.C0007b<getId3> requestMoneyRepositoryProvider;

    public getExtraDataFields(b.C0007b<getId3> bVar) {
        this.requestMoneyRepositoryProvider = bVar;
    }

    public final getDataFields get() {
        return newInstance(this.requestMoneyRepositoryProvider.get());
    }

    public static getExtraDataFields create(b.C0007b<getId3> bVar) {
        return new getExtraDataFields(bVar);
    }

    public static getDataFields newInstance(getId3 getid3) {
        return new getDataFields(getid3);
    }
}
