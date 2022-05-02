package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class addResolveTask implements getAdapterPosition<setDefaultFontSize> {
    private final b.C0007b<exitApp> setMax;
    private final ApplicationModule setMin;

    private addResolveTask(ApplicationModule applicationModule, b.C0007b<exitApp> bVar) {
        this.setMin = applicationModule;
        this.setMax = bVar;
    }

    public static addResolveTask setMax(ApplicationModule applicationModule, b.C0007b<exitApp> bVar) {
        return new addResolveTask(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setDefaultFontSize length = this.setMin.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
