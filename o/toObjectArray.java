package o;

import id.dana.di.modules.ApplicationModule;
import o.GriverAppXInterceptor;
import o.b;

public final class toObjectArray implements getAdapterPosition<GriverAppXInterceptor.AnonymousClass1> {
    private final b.C0007b<onException> getMax;
    private final ApplicationModule length;

    private toObjectArray(ApplicationModule applicationModule, b.C0007b<onException> bVar) {
        this.length = applicationModule;
        this.getMax = bVar;
    }

    public static toObjectArray getMin(ApplicationModule applicationModule, b.C0007b<onException> bVar) {
        return new toObjectArray(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverAppXInterceptor.AnonymousClass1 max = this.length.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
