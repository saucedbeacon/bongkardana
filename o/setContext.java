package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class setContext implements getAdapterPosition<getSansSerifFontFamily> {
    private final ApplicationModule getMax;
    private final b.C0007b<setIncludeFiles> length;

    private setContext(ApplicationModule applicationModule, b.C0007b<setIncludeFiles> bVar) {
        this.getMax = applicationModule;
        this.length = bVar;
    }

    public static setContext length(ApplicationModule applicationModule, b.C0007b<setIncludeFiles> bVar) {
        return new setContext(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getSansSerifFontFamily length2 = this.getMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
