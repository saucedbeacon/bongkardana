package o;

import id.dana.nearbyme.NearbyMeActivity;
import kotlin.jvm.functions.Function1;

public final class getTotalCount implements Function1 {
    private final NearbyMeActivity getMin;

    public getTotalCount(NearbyMeActivity nearbyMeActivity) {
        this.getMin = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return this.getMin.nearbyMerchantLocationSearchView.getSearchedMerchantByPosition(((Integer) obj).intValue());
    }
}
