package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanSymbol implements getAdapterPosition<GriverLogger> {
    private final ApplicationModule getMax;
    private final b.C0007b<EmbedViewHelper> setMin;

    private scanSymbol(ApplicationModule applicationModule, b.C0007b<EmbedViewHelper> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static scanSymbol getMax(ApplicationModule applicationModule, b.C0007b<EmbedViewHelper> bVar) {
        return new scanSymbol(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverLogger min = this.getMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
