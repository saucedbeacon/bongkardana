package o;

import com.google.android.gms.location.LocationSettingsResult;
import id.dana.nearbyme.NewNearbyMeView;

public final class setRelatedEnv implements RedDotManager {
    private final NewNearbyMeView setMax;

    public setRelatedEnv(NewNearbyMeView newNearbyMeView) {
        this.setMax = newNearbyMeView;
    }

    public final void accept(Object obj) {
        NewNearbyMeView.setMin(this.setMax, (LocationSettingsResult) obj);
    }
}
