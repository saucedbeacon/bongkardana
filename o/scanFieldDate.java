package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldDate implements getAdapterPosition<UCExist> {
    private final ApplicationModule length;
    private final b.C0007b<ensureManifestFile> setMax;

    private scanFieldDate(ApplicationModule applicationModule, b.C0007b<ensureManifestFile> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static scanFieldDate setMin(ApplicationModule applicationModule, b.C0007b<ensureManifestFile> bVar) {
        return new scanFieldDate(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        UCExist min = this.length.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
