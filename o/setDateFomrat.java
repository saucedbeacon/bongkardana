package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class setDateFomrat implements getAdapterPosition<getBuiltInZoomControls> {
    private final b.C0007b<PageContext> getMax;
    private final ApplicationModule setMax;

    private setDateFomrat(ApplicationModule applicationModule, b.C0007b<PageContext> bVar) {
        this.setMax = applicationModule;
        this.getMax = bVar;
    }

    public static setDateFomrat setMax(ApplicationModule applicationModule, b.C0007b<PageContext> bVar) {
        return new setDateFomrat(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBuiltInZoomControls min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
