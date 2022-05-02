package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class checkMapResolve implements getAdapterPosition<getShortName> {
    private final ApplicationModule setMax;
    private final b.C0007b<onCallBack> setMin;

    private checkMapResolve(ApplicationModule applicationModule, b.C0007b<onCallBack> bVar) {
        this.setMax = applicationModule;
        this.setMin = bVar;
    }

    public static checkMapResolve length(ApplicationModule applicationModule, b.C0007b<onCallBack> bVar) {
        return new checkMapResolve(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getShortName min = this.setMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
