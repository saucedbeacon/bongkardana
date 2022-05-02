package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class Feature implements getAdapterPosition<onWebViewDestory> {
    private final ApplicationModule getMax;
    private final b.C0007b<onKeyboardVisible> setMin;

    private Feature(ApplicationModule applicationModule, b.C0007b<onKeyboardVisible> bVar) {
        this.getMax = applicationModule;
        this.setMin = bVar;
    }

    public static Feature setMin(ApplicationModule applicationModule, b.C0007b<onKeyboardVisible> bVar) {
        return new Feature(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onWebViewDestory max = this.getMax.getMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
