package o;

import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.model.ShopModel;
import kotlin.jvm.functions.Function1;

public final class DeployAppInfo implements Function1 {
    private final NearbyMeActivity getMin;

    public DeployAppInfo(NearbyMeActivity nearbyMeActivity) {
        this.getMin = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return NearbyMeActivity.access$1100(this.getMin, (ShopModel) obj);
    }
}
