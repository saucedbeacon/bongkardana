package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class nextIdent implements getAdapterPosition<setEnvironment> {
    private final ApplicationModule getMin;
    private final b.C0007b<createPageContext> length;

    private nextIdent(ApplicationModule applicationModule, b.C0007b<createPageContext> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static nextIdent setMax(ApplicationModule applicationModule, b.C0007b<createPageContext> bVar) {
        return new nextIdent(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setEnvironment max = this.getMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
