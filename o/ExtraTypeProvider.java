package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ExtraTypeProvider implements getAdapterPosition<onDescriptorRead> {
    private final ApplicationModule setMax;
    private final b.C0007b<ResourcePerceptionRequestPoint> setMin;

    private ExtraTypeProvider(ApplicationModule applicationModule, b.C0007b<ResourcePerceptionRequestPoint> bVar) {
        this.setMax = applicationModule;
        this.setMin = bVar;
    }

    public static ExtraTypeProvider setMax(ApplicationModule applicationModule, b.C0007b<ResourcePerceptionRequestPoint> bVar) {
        return new ExtraTypeProvider(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onDescriptorRead max = this.setMax.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
