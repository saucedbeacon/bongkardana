package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class createInstance implements getAdapterPosition<setDistanceCalculator> {
    private final ApplicationModule getMax;
    private final b.C0007b<lock> setMin;

    private createInstance(ApplicationModule applicationModule, b.C0007b<lock> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static createInstance setMin(ApplicationModule applicationModule, b.C0007b<lock> bVar) {
        return new createInstance(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setDistanceCalculator min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
