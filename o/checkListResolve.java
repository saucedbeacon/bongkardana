package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class checkListResolve implements getAdapterPosition<setAllowFileAccess> {
    private final ApplicationModule getMax;
    private final b.C0007b<ParamUtils> setMin;

    private checkListResolve(ApplicationModule applicationModule, b.C0007b<ParamUtils> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static checkListResolve getMin(ApplicationModule applicationModule, b.C0007b<ParamUtils> bVar) {
        return new checkListResolve(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setAllowFileAccess min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
