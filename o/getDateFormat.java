package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getDateFormat implements getAdapterPosition<GriverBaseManifest> {
    private final ApplicationModule getMin;
    private final b.C0007b<loop> setMin;

    private getDateFormat(ApplicationModule applicationModule, b.C0007b<loop> bVar) {
        this.getMin = applicationModule;
        this.setMin = bVar;
    }

    public static getDateFormat getMax(ApplicationModule applicationModule, b.C0007b<loop> bVar) {
        return new getDateFormat(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverBaseManifest min = this.getMin.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
