package o;

import o.b;

public final class didDetermineStateForRegion implements getAdapterPosition<didExitRegion> {
    private final b.C0007b<toUuidString> repositoryProvider;

    public didDetermineStateForRegion(b.C0007b<toUuidString> bVar) {
        this.repositoryProvider = bVar;
    }

    public final didExitRegion get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static didDetermineStateForRegion create(b.C0007b<toUuidString> bVar) {
        return new didDetermineStateForRegion(bVar);
    }

    public static didExitRegion newInstance(toUuidString touuidstring) {
        return new didExitRegion(touuidstring);
    }
}
