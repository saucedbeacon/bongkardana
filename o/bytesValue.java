package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class bytesValue implements getAdapterPosition<workerType> {
    private final b.C0007b<needPermissionCheck> getMax;
    private final ApplicationModule setMax;

    private bytesValue(ApplicationModule applicationModule, b.C0007b<needPermissionCheck> bVar) {
        this.setMax = applicationModule;
        this.getMax = bVar;
    }

    public static bytesValue length(ApplicationModule applicationModule, b.C0007b<needPermissionCheck> bVar) {
        return new bytesValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        workerType min = this.setMax.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
