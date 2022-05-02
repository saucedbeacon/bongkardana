package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanBoolean implements getAdapterPosition<ResourceReceivedResponsePoint> {
    private final ApplicationModule setMax;
    private final b.C0007b<ResourceInterceptPoint> setMin;

    private scanBoolean(ApplicationModule applicationModule, b.C0007b<ResourceInterceptPoint> bVar) {
        this.setMax = applicationModule;
        this.setMin = bVar;
    }

    public static scanBoolean setMax(ApplicationModule applicationModule, b.C0007b<ResourceInterceptPoint> bVar) {
        return new scanBoolean(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ResourceReceivedResponsePoint min = this.setMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
