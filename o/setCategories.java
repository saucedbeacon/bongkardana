package o;

import android.location.Location;
import id.dana.nearbyme.NearbyMeActivity;

public final class setCategories implements RedDotManager {
    private final NearbyMeActivity setMin;

    public setCategories(NearbyMeActivity nearbyMeActivity) {
        this.setMin = nearbyMeActivity;
    }

    public final void accept(Object obj) {
        NearbyMeActivity.length(this.setMin, (Location) obj);
    }
}
