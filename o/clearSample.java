package o;

import o.b;

public final class clearSample implements getAdapterPosition<setSampleIntervalMillis> {
    private final b.C0007b<getBackgroundFlag> userStatementRepositoryProvider;

    public clearSample(b.C0007b<getBackgroundFlag> bVar) {
        this.userStatementRepositoryProvider = bVar;
    }

    public final setSampleIntervalMillis get() {
        return newInstance(this.userStatementRepositoryProvider.get());
    }

    public static clearSample create(b.C0007b<getBackgroundFlag> bVar) {
        return new clearSample(bVar);
    }

    public static setSampleIntervalMillis newInstance(getBackgroundFlag getbackgroundflag) {
        return new setSampleIntervalMillis(getbackgroundflag);
    }
}
