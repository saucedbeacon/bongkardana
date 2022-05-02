package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getLastResolveTask implements getAdapterPosition<success> {
    private final b.C0007b<resolveDrawable> length;
    private final ApplicationModule setMin;

    private getLastResolveTask(ApplicationModule applicationModule, b.C0007b<resolveDrawable> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static getLastResolveTask setMax(ApplicationModule applicationModule, b.C0007b<resolveDrawable> bVar) {
        return new getLastResolveTask(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        success min = this.setMin.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
