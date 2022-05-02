package o;

import id.dana.di.modules.ApplicationModule;
import o.RVTabBarImpl;
import o.b;

public final class nextToken implements getAdapterPosition<AbstractPriorityRunnable> {
    private final b.C0007b<RVTabBarImpl.AnonymousClass4> length;
    private final ApplicationModule setMin;

    private nextToken(ApplicationModule applicationModule, b.C0007b<RVTabBarImpl.AnonymousClass4> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static nextToken length(ApplicationModule applicationModule, b.C0007b<RVTabBarImpl.AnonymousClass4> bVar) {
        return new nextToken(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        AbstractPriorityRunnable min = this.setMin.setMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
