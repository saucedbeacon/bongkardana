package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class setTimeZone implements getAdapterPosition<GriverPrepareInterceptor> {
    private final b.C0007b<getNodeExtensionMap> getMax;
    private final ApplicationModule length;

    private setTimeZone(ApplicationModule applicationModule, b.C0007b<getNodeExtensionMap> bVar) {
        this.length = applicationModule;
        this.getMax = bVar;
    }

    public static setTimeZone getMin(ApplicationModule applicationModule, b.C0007b<getNodeExtensionMap> bVar) {
        return new setTimeZone(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverPrepareInterceptor max = this.length.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
