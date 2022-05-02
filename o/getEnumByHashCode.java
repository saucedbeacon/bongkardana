package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class getEnumByHashCode implements getAdapterPosition<onDisconnect> {
    private final ApplicationModule getMax;
    private final b.C0007b<setHttpLinkSubResMimeList> length;

    private getEnumByHashCode(ApplicationModule applicationModule, b.C0007b<setHttpLinkSubResMimeList> bVar) {
        this.getMax = applicationModule;
        this.length = bVar;
    }

    public static getEnumByHashCode setMin(ApplicationModule applicationModule, b.C0007b<setHttpLinkSubResMimeList> bVar) {
        return new getEnumByHashCode(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onDisconnect max = this.getMax.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
