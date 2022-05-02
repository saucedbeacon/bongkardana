package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class BeforeFilter implements getAdapterPosition<GriverSwtich> {
    private final b.C0007b<Event$1> getMax;
    private final ApplicationModule getMin;

    private BeforeFilter(ApplicationModule applicationModule, b.C0007b<Event$1> bVar) {
        this.getMin = applicationModule;
        this.getMax = bVar;
    }

    public static BeforeFilter getMin(ApplicationModule applicationModule, b.C0007b<Event$1> bVar) {
        return new BeforeFilter(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverSwtich max = this.getMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
