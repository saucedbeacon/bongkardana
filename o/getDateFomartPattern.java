package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getDateFomartPattern implements getAdapterPosition<confirm> {
    private final ApplicationModule getMin;
    private final b.C0007b<cancelAnimation> setMax;

    private getDateFomartPattern(ApplicationModule applicationModule, b.C0007b<cancelAnimation> bVar) {
        this.getMin = applicationModule;
        this.setMax = bVar;
    }

    public static getDateFomartPattern length(ApplicationModule applicationModule, b.C0007b<cancelAnimation> bVar) {
        return new getDateFomartPattern(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        confirm max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
