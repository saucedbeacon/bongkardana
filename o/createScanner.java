package o;

import o.b;

public final class createScanner implements getAdapterPosition<setLongScanForcingEnabled> {
    private final b.C0007b<getBackgroundFlag> userStatementRepositoryProvider;

    public createScanner(b.C0007b<getBackgroundFlag> bVar) {
        this.userStatementRepositoryProvider = bVar;
    }

    public final setLongScanForcingEnabled get() {
        return newInstance(this.userStatementRepositoryProvider.get());
    }

    public static createScanner create(b.C0007b<getBackgroundFlag> bVar) {
        return new createScanner(bVar);
    }

    public static setLongScanForcingEnabled newInstance(getBackgroundFlag getbackgroundflag) {
        return new setLongScanForcingEnabled(getbackgroundflag);
    }
}
