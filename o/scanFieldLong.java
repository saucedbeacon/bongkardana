package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldLong implements getAdapterPosition<findCalculatorForModelWithLock> {
    private final ApplicationModule getMax;
    private final b.C0007b<RVGroupInit> setMin;

    private scanFieldLong(ApplicationModule applicationModule, b.C0007b<RVGroupInit> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static scanFieldLong getMax(ApplicationModule applicationModule, b.C0007b<RVGroupInit> bVar) {
        return new scanFieldLong(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        findCalculatorForModelWithLock min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
