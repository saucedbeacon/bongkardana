package o;

import o.b;

public final class newSampleInterval implements getAdapterPosition<getSamples> {
    private final b.C0007b<getBackgroundFlag> userStatementRepositoryProvider;

    public newSampleInterval(b.C0007b<getBackgroundFlag> bVar) {
        this.userStatementRepositoryProvider = bVar;
    }

    public final getSamples get() {
        return newInstance(this.userStatementRepositoryProvider.get());
    }

    public static newSampleInterval create(b.C0007b<getBackgroundFlag> bVar) {
        return new newSampleInterval(bVar);
    }

    public static getSamples newInstance(getBackgroundFlag getbackgroundflag) {
        return new getSamples(getbackgroundflag);
    }
}
