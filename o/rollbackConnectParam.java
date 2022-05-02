package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.explore.service.ExploreServiceView;
import o.BluetoothLeUtils;
import o.getDuration;

public final class rollbackConnectParam implements getBindingAdapter<ExploreServiceView> {
    @InjectedFieldSignature("id.dana.explore.service.ExploreServiceView.readDeepLinkPropertiesPresenter")
    public static void setMin(ExploreServiceView exploreServiceView, getDuration.length length) {
        exploreServiceView.readDeepLinkPropertiesPresenter = length;
    }

    @InjectedFieldSignature("id.dana.explore.service.ExploreServiceView.presenter")
    public static void length(ExploreServiceView exploreServiceView, BluetoothLeUtils.setMin setmin) {
        exploreServiceView.presenter = setmin;
    }
}
