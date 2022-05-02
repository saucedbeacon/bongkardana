package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class processExtra implements getAdapterPosition<PageFinishedPoint> {
    private final b.C0007b<playAnimation> length;
    private final ApplicationModule setMax;

    private processExtra(ApplicationModule applicationModule, b.C0007b<playAnimation> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static processExtra getMin(ApplicationModule applicationModule, b.C0007b<playAnimation> bVar) {
        return new processExtra(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        PageFinishedPoint max = this.setMax.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
