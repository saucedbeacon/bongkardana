package o;

import id.dana.di.modules.ApplicationModule;
import o.GriverAMCSAppUpdater;
import o.b;

public final class scanISO8601DateIfMatch implements getAdapterPosition<GriverAMCSAppUpdater.AnonymousClass1> {
    private final ApplicationModule length;
    private final b.C0007b<writeShort> setMin;

    private scanISO8601DateIfMatch(ApplicationModule applicationModule, b.C0007b<writeShort> bVar) {
        this.length = applicationModule;
        this.setMin = bVar;
    }

    public static scanISO8601DateIfMatch length(ApplicationModule applicationModule, b.C0007b<writeShort> bVar) {
        return new scanISO8601DateIfMatch(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverAMCSAppUpdater.AnonymousClass1 max = this.length.getMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
