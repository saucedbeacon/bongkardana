package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ExtraProcessable implements getAdapterPosition<isPacketDistinct> {
    private final b.C0007b<getRuntimeVersion> getMin;
    private final ApplicationModule length;

    private ExtraProcessable(ApplicationModule applicationModule, b.C0007b<getRuntimeVersion> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static ExtraProcessable setMin(ApplicationModule applicationModule, b.C0007b<getRuntimeVersion> bVar) {
        return new ExtraProcessable(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isPacketDistinct min = this.length.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
