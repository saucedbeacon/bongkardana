package o;

import o.b;

public final class isExpired implements getAdapterPosition<isTracked> {
    private final b.C0007b<setModel> activitySharingRepositoryProvider;

    public isExpired(b.C0007b<setModel> bVar) {
        this.activitySharingRepositoryProvider = bVar;
    }

    public final isTracked get() {
        return newInstance(this.activitySharingRepositoryProvider.get());
    }

    public static isExpired create(b.C0007b<setModel> bVar) {
        return new isExpired(bVar);
    }

    public static isTracked newInstance(setModel setmodel) {
        return new isTracked(setmodel);
    }
}
