package o;

import id.dana.service.favorites.FavoriteServicesModule;
import o.b;
import o.setForceFullScreen;

public final class setDisplayType implements getAdapterPosition<setForceFullScreen.setMin> {
    private final FavoriteServicesModule getMax;
    private final b.C0007b<setFitSpace> getMin;

    public static setForceFullScreen.setMin setMin(FavoriteServicesModule favoriteServicesModule, setFitSpace setfitspace) {
        setForceFullScreen.setMin max = favoriteServicesModule.getMax(setfitspace);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setForceFullScreen.setMin max = this.getMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
