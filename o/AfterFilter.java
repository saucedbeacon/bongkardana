package o;

import id.dana.di.modules.ApplicationModule;
import o.b;
import o.c;

public final class AfterFilter implements getAdapterPosition<getBackgroundFlag> {
    private final ApplicationModule getMax;
    private final b.C0007b<c.AnonymousClass3> getMin;

    private AfterFilter(ApplicationModule applicationModule, b.C0007b<c.AnonymousClass3> bVar) {
        this.getMax = applicationModule;
        this.getMin = bVar;
    }

    public static AfterFilter getMax(ApplicationModule applicationModule, b.C0007b<c.AnonymousClass3> bVar) {
        return new AfterFilter(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBackgroundFlag length = this.getMax.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
