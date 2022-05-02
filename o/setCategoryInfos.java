package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.NearbyMeActivity;
import o.setTextSpacing;

public final class setCategoryInfos implements getBindingAdapter<NearbyMeActivity> {
    @InjectedFieldSignature("id.dana.nearbyme.NearbyMeActivity.mapHelper")
    public static void getMin(NearbyMeActivity nearbyMeActivity, GriverDefaultLoadingView griverDefaultLoadingView) {
        nearbyMeActivity.mapHelper = griverDefaultLoadingView;
    }

    @InjectedFieldSignature("id.dana.nearbyme.NearbyMeActivity.nearbyAnalyticTracker")
    public static void length(NearbyMeActivity nearbyMeActivity, t tVar) {
        nearbyMeActivity.nearbyAnalyticTracker = tVar;
    }

    @InjectedFieldSignature("id.dana.nearbyme.NearbyMeActivity.presenter")
    public static void setMin(NearbyMeActivity nearbyMeActivity, setTextSpacing.setMin setmin) {
        nearbyMeActivity.presenter = setmin;
    }
}
