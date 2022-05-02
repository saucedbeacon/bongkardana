package o;

import id.dana.service.favorites.FavoriteServicesModule;
import o.setForceFullScreen;

public final class setInitToMaxSquare implements getAdapterPosition<setForceFullScreen.getMin> {
    private final FavoriteServicesModule length;

    public static setForceFullScreen.getMin getMin(FavoriteServicesModule favoriteServicesModule) {
        setForceFullScreen.getMin length2 = favoriteServicesModule.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setForceFullScreen.getMin length2 = this.length.length();
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
