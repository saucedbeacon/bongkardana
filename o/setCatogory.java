package o;

import com.google.android.gms.location.LocationSettingsResult;
import id.dana.nearbyme.NearbyMeView;

public final class setCatogory implements RedDotManager {
    private final NearbyMeView setMin;

    public setCatogory(NearbyMeView nearbyMeView) {
        this.setMin = nearbyMeView;
    }

    public final void accept(Object obj) {
        NearbyMeView.getMin(this.setMin, (LocationSettingsResult) obj);
    }
}
