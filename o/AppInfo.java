package o;

import id.dana.nearbyme.NearbyMeActivity;
import kotlin.jvm.functions.Function1;

public final class AppInfo implements Function1 {
    private final NearbyMeActivity getMin;

    public AppInfo(NearbyMeActivity nearbyMeActivity) {
        this.getMin = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return NearbyMeActivity.isInside(this.getMin, (Integer) obj);
    }
}
