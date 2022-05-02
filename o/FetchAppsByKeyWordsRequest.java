package o;

import android.location.Location;
import id.dana.nearbyme.NewNearbyMeView;

public final class FetchAppsByKeyWordsRequest implements RedDotManager {
    private final NewNearbyMeView length;
    private final boolean setMin;

    public FetchAppsByKeyWordsRequest(NewNearbyMeView newNearbyMeView, boolean z) {
        this.length = newNearbyMeView;
        this.setMin = z;
    }

    public final void accept(Object obj) {
        this.length.onLocationUpdate((Location) obj, this.setMin);
    }
}
