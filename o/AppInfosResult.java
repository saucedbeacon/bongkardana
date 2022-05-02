package o;

import id.dana.nearbyme.NearbyMeActivity;

public final class AppInfosResult implements RedDotManager {
    private final NearbyMeActivity length;

    public AppInfosResult(NearbyMeActivity nearbyMeActivity) {
        this.length = nearbyMeActivity;
    }

    public final void accept(Object obj) {
        NearbyMeActivity.setMax(this.length, (CharSequence) obj);
    }
}
