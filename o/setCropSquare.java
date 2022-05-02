package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.service.favorites.FavoriteServicesView;
import o.setForceFullScreen;

public final class setCropSquare implements getBindingAdapter<FavoriteServicesView> {
    @InjectedFieldSignature("id.dana.service.favorites.FavoriteServicesView.presenter")
    public static void getMin(FavoriteServicesView favoriteServicesView, setForceFullScreen.setMin setmin) {
        favoriteServicesView.presenter = setmin;
    }
}
