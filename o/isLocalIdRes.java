package o;

import o.b;

public final class isLocalIdRes implements getAdapterPosition<queryLocalIdByPath> {
    private final b.C0007b<GriverFileAbilityImpl> merchantManagementRepositoryProvider;

    public isLocalIdRes(b.C0007b<GriverFileAbilityImpl> bVar) {
        this.merchantManagementRepositoryProvider = bVar;
    }

    public final queryLocalIdByPath get() {
        return newInstance(this.merchantManagementRepositoryProvider.get());
    }

    public static isLocalIdRes create(b.C0007b<GriverFileAbilityImpl> bVar) {
        return new isLocalIdRes(bVar);
    }

    public static queryLocalIdByPath newInstance(GriverFileAbilityImpl griverFileAbilityImpl) {
        return new queryLocalIdByPath(griverFileAbilityImpl);
    }
}
