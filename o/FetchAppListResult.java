package o;

import android.location.Location;
import id.dana.nearbyme.NearbyMeView;

public final class FetchAppListResult implements RedDotManager {
    private final boolean getMax;
    private final NearbyMeView setMin;

    public FetchAppListResult(NearbyMeView nearbyMeView, boolean z) {
        this.setMin = nearbyMeView;
        this.getMax = z;
    }

    public final void accept(Object obj) {
        this.setMin.onLocationUpdate((Location) obj, this.getMax);
    }
}
