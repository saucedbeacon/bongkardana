package o;

import o.b;

public final class Stats implements getAdapterPosition<setLoggingEnabled> {
    private final b.C0007b<getBackgroundFlag> userStatementRepositoryProvider;

    public final class Sample implements getAdapterPosition<clearSamples> {
        private final b.C0007b<getBackgroundFlag> userStatementRepositoryProvider;

        public Sample(b.C0007b<getBackgroundFlag> bVar) {
            this.userStatementRepositoryProvider = bVar;
        }

        public final clearSamples get() {
            return newInstance(this.userStatementRepositoryProvider.get());
        }

        public static Sample create(b.C0007b<getBackgroundFlag> bVar) {
            return new Sample(bVar);
        }

        public static clearSamples newInstance(getBackgroundFlag getbackgroundflag) {
            return new clearSamples(getbackgroundflag);
        }
    }

    public Stats(b.C0007b<getBackgroundFlag> bVar) {
        this.userStatementRepositoryProvider = bVar;
    }

    public final setLoggingEnabled get() {
        return newInstance(this.userStatementRepositoryProvider.get());
    }

    public static Stats create(b.C0007b<getBackgroundFlag> bVar) {
        return new Stats(bVar);
    }

    public static setLoggingEnabled newInstance(getBackgroundFlag getbackgroundflag) {
        return new setLoggingEnabled(getbackgroundflag);
    }
}
