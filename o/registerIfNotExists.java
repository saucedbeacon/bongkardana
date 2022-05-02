package o;

import id.dana.di.modules.ApplicationModule;
import o.ScanJob;
import o.b;

public final class registerIfNotExists implements getAdapterPosition<ScanJob.AnonymousClass1> {
    private final ApplicationModule length;
    private final b.C0007b<getH5AuthParams> setMax;

    private registerIfNotExists(ApplicationModule applicationModule, b.C0007b<getH5AuthParams> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static registerIfNotExists getMin(ApplicationModule applicationModule, b.C0007b<getH5AuthParams> bVar) {
        return new registerIfNotExists(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ScanJob.AnonymousClass1 length2 = this.length.length(this.setMax.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
