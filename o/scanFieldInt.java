package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldInt implements getAdapterPosition<shouldBeKeptAsChild> {
    private final b.C0007b<inferTheme> setMax;
    private final ApplicationModule setMin;

    private scanFieldInt(ApplicationModule applicationModule, b.C0007b<inferTheme> bVar) {
        this.setMin = applicationModule;
        this.setMax = bVar;
    }

    public static scanFieldInt getMin(ApplicationModule applicationModule, b.C0007b<inferTheme> bVar) {
        return new scanFieldInt(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        shouldBeKeptAsChild length = this.setMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
