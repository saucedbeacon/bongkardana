package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanIdent implements getAdapterPosition<GriverSecurityManager> {
    private final ApplicationModule getMax;
    private final b.C0007b<isWorkerReady> setMin;

    private scanIdent(ApplicationModule applicationModule, b.C0007b<isWorkerReady> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static scanIdent setMin(ApplicationModule applicationModule, b.C0007b<isWorkerReady> bVar) {
        return new scanIdent(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverSecurityManager max = this.getMax.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
