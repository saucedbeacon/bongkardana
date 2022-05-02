package o;

import o.b;

public final class setForegroundBetweenScanPeriod implements getAdapterPosition<addRangeNotifier> {
    private final b.C0007b<fromInt> sendMoneyRepositoryProvider;

    public setForegroundBetweenScanPeriod(b.C0007b<fromInt> bVar) {
        this.sendMoneyRepositoryProvider = bVar;
    }

    public final addRangeNotifier get() {
        return newInstance(this.sendMoneyRepositoryProvider.get());
    }

    public static setForegroundBetweenScanPeriod create(b.C0007b<fromInt> bVar) {
        return new setForegroundBetweenScanPeriod(bVar);
    }

    public static addRangeNotifier newInstance(fromInt fromint) {
        return new addRangeNotifier(fromint);
    }
}
