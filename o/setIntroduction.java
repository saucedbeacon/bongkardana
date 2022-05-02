package o;

import com.google.android.gms.maps.GoogleMap;
import id.dana.nearbyme.NearbyMeActivity;

public final class setIntroduction implements GoogleMap.OnCameraIdleListener {
    private final NearbyMeActivity getMin;

    public setIntroduction(NearbyMeActivity nearbyMeActivity) {
        this.getMin = nearbyMeActivity;
    }

    public final void onCameraIdle() {
        NearbyMeActivity.setMax(this.getMin);
    }
}
