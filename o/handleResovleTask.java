package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class handleResovleTask implements getAdapterPosition<findCalculatorForModelWithLock> {
    private final ApplicationModule getMax;
    private final b.C0007b<RVGroupInit> setMin;

    private handleResovleTask(ApplicationModule applicationModule, b.C0007b<RVGroupInit> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static handleResovleTask length(ApplicationModule applicationModule, b.C0007b<RVGroupInit> bVar) {
        return new handleResovleTask(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        findCalculatorForModelWithLock max = this.getMax.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
