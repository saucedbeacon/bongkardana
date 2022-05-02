package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldFloatArray implements getAdapterPosition<GriverResourceManager> {
    private final ApplicationModule length;
    private final b.C0007b<getIpcProxy> setMax;

    private scanFieldFloatArray(ApplicationModule applicationModule, b.C0007b<getIpcProxy> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static scanFieldFloatArray setMin(ApplicationModule applicationModule, b.C0007b<getIpcProxy> bVar) {
        return new scanFieldFloatArray(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverResourceManager min = this.length.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
