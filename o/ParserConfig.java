package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ParserConfig implements getAdapterPosition<getBeaconSimulator> {
    private final b.C0007b<OneShotRunnable> length;
    private final ApplicationModule setMin;

    private ParserConfig(ApplicationModule applicationModule, b.C0007b<OneShotRunnable> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static ParserConfig getMax(ApplicationModule applicationModule, b.C0007b<OneShotRunnable> bVar) {
        return new ParserConfig(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBeaconSimulator min = this.setMin.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
