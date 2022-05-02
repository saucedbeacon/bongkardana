package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldBoolean implements getAdapterPosition<containsRelativeParentPath> {
    private final b.C0007b<setAppxVersionInWorker> getMin;
    private final ApplicationModule setMax;

    private scanFieldBoolean(ApplicationModule applicationModule, b.C0007b<setAppxVersionInWorker> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static scanFieldBoolean setMin(ApplicationModule applicationModule, b.C0007b<setAppxVersionInWorker> bVar) {
        return new scanFieldBoolean(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        containsRelativeParentPath max = this.setMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
