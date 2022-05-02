package o;

import o.b;

public final class addMeasurement implements getAdapterPosition<calculateRssi> {
    private final b.C0007b<setModel> activitySharingRepositoryProvider;

    public addMeasurement(b.C0007b<setModel> bVar) {
        this.activitySharingRepositoryProvider = bVar;
    }

    public final calculateRssi get() {
        return newInstance(this.activitySharingRepositoryProvider.get());
    }

    public static addMeasurement create(b.C0007b<setModel> bVar) {
        return new addMeasurement(bVar);
    }

    public static calculateRssi newInstance(setModel setmodel) {
        return new calculateRssi(setmodel);
    }
}
