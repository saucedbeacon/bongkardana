package o;

import id.dana.di.modules.ApplicationModule;
import o.RVOpenAuthHelper;
import o.b;

public final class orders implements getAdapterPosition<setModel> {
    private final b.C0007b<RVOpenAuthHelper.a.AnonymousClass1.C00061> length;
    private final ApplicationModule setMin;

    private orders(ApplicationModule applicationModule, b.C0007b<RVOpenAuthHelper.a.AnonymousClass1.C00061> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static orders length(ApplicationModule applicationModule, b.C0007b<RVOpenAuthHelper.a.AnonymousClass1.C00061> bVar) {
        return new orders(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setModel max = this.setMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
