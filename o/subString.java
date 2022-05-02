package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class subString implements getAdapterPosition<getFacade> {
    private final ApplicationModule getMax;
    private final b.C0007b<getUserAgent> length;

    private subString(ApplicationModule applicationModule, b.C0007b<getUserAgent> bVar) {
        this.getMax = applicationModule;
        this.length = bVar;
    }

    public static subString getMax(ApplicationModule applicationModule, b.C0007b<getUserAgent> bVar) {
        return new subString(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getFacade min = this.getMax.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
