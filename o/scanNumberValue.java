package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanNumberValue implements getAdapterPosition<GriverWebViewUtils> {
    private final ApplicationModule getMax;
    private final b.C0007b<callMode> length;

    private scanNumberValue(ApplicationModule applicationModule, b.C0007b<callMode> bVar) {
        this.getMax = applicationModule;
        this.length = bVar;
    }

    public static scanNumberValue length(ApplicationModule applicationModule, b.C0007b<callMode> bVar) {
        return new scanNumberValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverWebViewUtils max = this.getMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
