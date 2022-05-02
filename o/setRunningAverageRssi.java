package o;

import o.b;

public final class setRunningAverageRssi implements getAdapterPosition<fromScanData> {
    private final b.C0007b<setDistanceCalculator> registrationRepositoryProvider;

    public setRunningAverageRssi(b.C0007b<setDistanceCalculator> bVar) {
        this.registrationRepositoryProvider = bVar;
    }

    public final fromScanData get() {
        return newInstance(this.registrationRepositoryProvider.get());
    }

    public static setRunningAverageRssi create(b.C0007b<setDistanceCalculator> bVar) {
        return new setRunningAverageRssi(bVar);
    }

    public static fromScanData newInstance(setDistanceCalculator setdistancecalculator) {
        return new fromScanData(setdistancecalculator);
    }
}
