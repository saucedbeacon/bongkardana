package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getExtraTypeProviders implements getAdapterPosition<GriverSplashFragmentExtension> {
    private final ApplicationModule getMin;
    private final b.C0007b<font> length;

    private getExtraTypeProviders(ApplicationModule applicationModule, b.C0007b<font> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static getExtraTypeProviders setMax(ApplicationModule applicationModule, b.C0007b<font> bVar) {
        return new getExtraTypeProviders(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverSplashFragmentExtension max = this.getMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
