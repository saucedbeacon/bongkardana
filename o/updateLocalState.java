package o;

import o.b;

public final class updateLocalState implements getAdapterPosition<addLocalRegion> {
    private final b.C0007b<getResponseCode> socialGeneralRepositoryProvider;

    public updateLocalState(b.C0007b<getResponseCode> bVar) {
        this.socialGeneralRepositoryProvider = bVar;
    }

    public final addLocalRegion get() {
        return newInstance(this.socialGeneralRepositoryProvider.get());
    }

    public static updateLocalState create(b.C0007b<getResponseCode> bVar) {
        return new updateLocalState(bVar);
    }

    public static addLocalRegion newInstance(getResponseCode getresponsecode) {
        return new addLocalRegion(getresponsecode);
    }
}
