package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getGlobalInstance implements getAdapterPosition<getResponseCode> {
    private final ApplicationModule getMax;
    private final b.C0007b<getApiLevelList> length;

    private getGlobalInstance(ApplicationModule applicationModule, b.C0007b<getApiLevelList> bVar) {
        this.getMax = applicationModule;
        this.length = bVar;
    }

    public static getGlobalInstance setMin(ApplicationModule applicationModule, b.C0007b<getApiLevelList> bVar) {
        return new getGlobalInstance(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getResponseCode length2 = this.getMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
