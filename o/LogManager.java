package o;

import o.b;

public final class LogManager implements getAdapterPosition<isVerboseLoggingEnabled> {
    private final b.C0007b<getResponseCode> socialGeneralRepositoryProvider;

    public LogManager(b.C0007b<getResponseCode> bVar) {
        this.socialGeneralRepositoryProvider = bVar;
    }

    public final isVerboseLoggingEnabled get() {
        return newInstance(this.socialGeneralRepositoryProvider.get());
    }

    public static LogManager create(b.C0007b<getResponseCode> bVar) {
        return new LogManager(bVar);
    }

    public static isVerboseLoggingEnabled newInstance(getResponseCode getresponsecode) {
        return new isVerboseLoggingEnabled(getresponsecode);
    }
}
