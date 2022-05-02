package o;

import o.b;

public final class startMonitoringBeaconsInRegion implements getAdapterPosition<requestStateForRegion> {
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;

    public startMonitoringBeaconsInRegion(b.C0007b<fromInt> bVar) {
        this.sendMoneyRepositoryProvider = bVar;
    }

    public final requestStateForRegion get() {
        return newInstance(this.sendMoneyRepositoryProvider.get());
    }

    public static startMonitoringBeaconsInRegion create(b.C0007b<fromInt> bVar) {
        return new startMonitoringBeaconsInRegion(bVar);
    }

    public static requestStateForRegion newInstance(fromInt fromint) {
        return new requestStateForRegion(fromint);
    }
}
