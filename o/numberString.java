package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class numberString implements getAdapterPosition<getAlwaysShowDiagnosticTool> {
    private final ApplicationModule getMax;
    private final b.C0007b<RVTabBarImpl> setMax;

    private numberString(ApplicationModule applicationModule, b.C0007b<RVTabBarImpl> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static numberString getMax(ApplicationModule applicationModule, b.C0007b<RVTabBarImpl> bVar) {
        return new numberString(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getAlwaysShowDiagnosticTool min = this.getMax.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
