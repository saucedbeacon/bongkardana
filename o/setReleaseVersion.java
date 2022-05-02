package o;

import id.dana.nearbyme.NearbyMeActivity;
import kotlin.jvm.functions.Function1;

public final class setReleaseVersion implements Function1 {
    private final NearbyMeActivity getMax;

    public setReleaseVersion(NearbyMeActivity nearbyMeActivity) {
        this.getMax = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return NearbyMeActivity.getMin(this.getMax, (Integer) obj);
    }
}
