package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldIntArray implements getAdapterPosition<getMD5Byte> {
    private final b.C0007b<uri> setMax;
    private final ApplicationModule setMin;

    private scanFieldIntArray(ApplicationModule applicationModule, b.C0007b<uri> bVar) {
        this.setMin = applicationModule;
        this.setMax = bVar;
    }

    public static scanFieldIntArray length(ApplicationModule applicationModule, b.C0007b<uri> bVar) {
        return new scanFieldIntArray(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getMD5Byte min = this.setMin.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
