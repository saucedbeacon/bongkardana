package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class mappingTo implements getAdapterPosition<requestBeaconData> {
    private final ApplicationModule length;
    private final b.C0007b<k> setMax;

    private mappingTo(ApplicationModule applicationModule, b.C0007b<k> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static mappingTo setMax(ApplicationModule applicationModule, b.C0007b<k> bVar) {
        return new mappingTo(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        requestBeaconData min = this.length.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
