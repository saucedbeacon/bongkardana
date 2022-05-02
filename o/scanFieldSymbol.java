package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldSymbol implements getAdapterPosition<setFireMoment> {
    private final b.C0007b<DefaultExtensionRegistry> getMax;
    private final ApplicationModule getMin;

    private scanFieldSymbol(ApplicationModule applicationModule, b.C0007b<DefaultExtensionRegistry> bVar) {
        this.getMin = applicationModule;
        this.getMax = bVar;
    }

    public static scanFieldSymbol setMax(ApplicationModule applicationModule, b.C0007b<DefaultExtensionRegistry> bVar) {
        return new scanFieldSymbol(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setFireMoment min = this.getMin.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
