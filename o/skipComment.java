package o;

import id.dana.di.modules.ApplicationModule;
import o.GriverExecutors;
import o.b;

public final class skipComment implements getAdapterPosition<GriverExecutors.H5SingleThreadFactory.AnonymousClass1> {
    private final ApplicationModule getMax;
    private final b.C0007b<setTabListener> setMax;

    private skipComment(ApplicationModule applicationModule, b.C0007b<setTabListener> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static skipComment setMin(ApplicationModule applicationModule, b.C0007b<setTabListener> bVar) {
        return new skipComment(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverExecutors.H5SingleThreadFactory.AnonymousClass1 max = this.getMax.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
