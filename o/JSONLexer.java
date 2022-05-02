package o;

import id.dana.di.modules.ApplicationModule;
import o.RenderLoadingStatusChangePoint;
import o.b;

public final class JSONLexer implements getAdapterPosition<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> {
    private final ApplicationModule setMax;
    private final b.C0007b<RVFragment> setMin;

    private JSONLexer(ApplicationModule applicationModule, b.C0007b<RVFragment> bVar) {
        this.setMax = applicationModule;
        this.setMin = bVar;
    }

    public static JSONLexer setMin(ApplicationModule applicationModule, b.C0007b<RVFragment> bVar) {
        return new JSONLexer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        RenderLoadingStatusChangePoint.LoadingStatusChangeListener max = this.setMax.getMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
