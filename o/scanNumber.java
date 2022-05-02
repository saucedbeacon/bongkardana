package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanNumber implements getAdapterPosition<localIdToUrl> {
    private final ApplicationModule length;
    private final b.C0007b<setEventId> setMax;

    private scanNumber(ApplicationModule applicationModule, b.C0007b<setEventId> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static scanNumber getMin(ApplicationModule applicationModule, b.C0007b<setEventId> bVar) {
        return new scanNumber(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        localIdToUrl min = this.length.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
