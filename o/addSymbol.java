package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class addSymbol implements getAdapterPosition<setDistinctPacketsDetectedPerScan> {
    private final ApplicationModule getMax;
    private final b.C0007b<setAppVersion> setMax;

    private addSymbol(ApplicationModule applicationModule, b.C0007b<setAppVersion> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static addSymbol getMax(ApplicationModule applicationModule, b.C0007b<setAppVersion> bVar) {
        return new addSymbol(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setDistinctPacketsDetectedPerScan length = this.getMax.length(this.setMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
