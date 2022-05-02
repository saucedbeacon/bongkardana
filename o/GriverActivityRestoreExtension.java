package o;

import id.dana.di.modules.NewNearbyMeModule;
import o.b;
import o.getOffscreenPageLimit;

public final class GriverActivityRestoreExtension implements getAdapterPosition<getOffscreenPageLimit.getMax> {
    private final NewNearbyMeModule getMin;
    private final b.C0007b<setOffscreenPageLimit> setMin;

    private GriverActivityRestoreExtension(NewNearbyMeModule newNearbyMeModule, b.C0007b<setOffscreenPageLimit> bVar) {
        this.getMin = newNearbyMeModule;
        this.setMin = bVar;
    }

    public static GriverActivityRestoreExtension setMin(NewNearbyMeModule newNearbyMeModule, b.C0007b<setOffscreenPageLimit> bVar) {
        return new GriverActivityRestoreExtension(newNearbyMeModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getOffscreenPageLimit.getMax min = this.getMin.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
