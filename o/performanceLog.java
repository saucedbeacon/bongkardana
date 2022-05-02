package o;

import o.b;

public final class performanceLog implements getAdapterPosition<error> {
    private final b.C0007b<errorLog> exploreDanaPreferencesProvider;

    public performanceLog(b.C0007b<errorLog> bVar) {
        this.exploreDanaPreferencesProvider = bVar;
    }

    public final error get() {
        return newInstance(this.exploreDanaPreferencesProvider.get());
    }

    public static performanceLog create(b.C0007b<errorLog> bVar) {
        return new performanceLog(bVar);
    }

    public static error newInstance(errorLog errorlog) {
        return new error(errorlog);
    }
}
