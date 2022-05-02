package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class longValue implements getAdapterPosition<toDigit> {
    private final ApplicationModule length;
    private final b.C0007b<setGoBackCallback> setMax;

    private longValue(ApplicationModule applicationModule, b.C0007b<setGoBackCallback> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static longValue getMin(ApplicationModule applicationModule, b.C0007b<setGoBackCallback> bVar) {
        return new longValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        toDigit max = this.length.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
