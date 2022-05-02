package o;

import android.location.Location;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.NearbyMerchantLocationSearchView;

public final class AppCategory implements NearbyMerchantLocationSearchView.length {
    private final NearbyMeActivity getMax;

    public AppCategory(NearbyMeActivity nearbyMeActivity) {
        this.getMax = nearbyMeActivity;
    }

    public final void length(Location location) {
        NearbyMeActivity.getMax(this.getMax, location);
    }
}
