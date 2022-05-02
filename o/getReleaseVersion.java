package o;

import com.google.android.gms.maps.GoogleMap;
import id.dana.nearbyme.NearbyMeActivity;

public final class getReleaseVersion implements GoogleMap.OnCameraMoveListener {
    private final NearbyMeActivity getMax;

    public getReleaseVersion(NearbyMeActivity nearbyMeActivity) {
        this.getMax = nearbyMeActivity;
    }

    public final void onCameraMove() {
        NearbyMeActivity.length(this.getMax);
    }
}
