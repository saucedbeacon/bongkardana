package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class sub_chars implements getAdapterPosition<GriverKVStorage> {
    private final ApplicationModule getMin;
    private final b.C0007b<registerRenderInitListener> setMin;

    private sub_chars(ApplicationModule applicationModule, b.C0007b<registerRenderInitListener> bVar) {
        this.getMin = applicationModule;
        this.setMin = bVar;
    }

    public static sub_chars setMax(ApplicationModule applicationModule, b.C0007b<registerRenderInitListener> bVar) {
        return new sub_chars(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverKVStorage min = this.getMin.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
