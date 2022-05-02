package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldString implements getAdapterPosition<getSourceInfoFromStartupParams> {
    private final b.C0007b<WorkerExceptionPoint> getMin;
    private final ApplicationModule setMax;

    private scanFieldString(ApplicationModule applicationModule, b.C0007b<WorkerExceptionPoint> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static scanFieldString getMin(ApplicationModule applicationModule, b.C0007b<WorkerExceptionPoint> bVar) {
        return new scanFieldString(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getSourceInfoFromStartupParams min = this.setMax.setMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
