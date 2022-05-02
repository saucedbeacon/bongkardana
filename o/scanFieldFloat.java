package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldFloat implements getAdapterPosition<isDynamicDelivery> {
    private final b.C0007b<getAccessController> length;
    private final ApplicationModule setMin;

    private scanFieldFloat(ApplicationModule applicationModule, b.C0007b<getAccessController> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static scanFieldFloat setMin(ApplicationModule applicationModule, b.C0007b<getAccessController> bVar) {
        return new scanFieldFloat(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isDynamicDelivery length2 = this.setMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
