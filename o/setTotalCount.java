package o;

import com.google.android.gms.maps.GoogleMap;
import id.dana.nearbyme.NearbyMeActivity;

public final class setTotalCount implements GoogleMap.OnCameraMoveStartedListener {
    private final NearbyMeActivity getMin;

    public setTotalCount(NearbyMeActivity nearbyMeActivity) {
        this.getMin = nearbyMeActivity;
    }

    public final void onCameraMoveStarted(int i) {
        NearbyMeActivity.getMin(this.getMin, i);
    }
}
