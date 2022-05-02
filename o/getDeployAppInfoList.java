package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.NearbyMeView;
import o.setTextSpacing;

public final class getDeployAppInfoList implements getBindingAdapter<NearbyMeView> {
    @InjectedFieldSignature("id.dana.nearbyme.NearbyMeView.presenter")
    public static void length(NearbyMeView nearbyMeView, setTextSpacing.setMin setmin) {
        nearbyMeView.presenter = setmin;
    }
}
