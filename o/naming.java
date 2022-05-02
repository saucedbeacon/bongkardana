package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class naming implements getAdapterPosition<enableBackButton> {
    private final b.C0007b<createColorSelector> getMin;
    private final ApplicationModule length;

    private naming(ApplicationModule applicationModule, b.C0007b<createColorSelector> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static naming getMax(ApplicationModule applicationModule, b.C0007b<createColorSelector> bVar) {
        return new naming(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        enableBackButton max = this.length.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
