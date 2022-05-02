package o;

import id.dana.nearbyme.NearbyMeActivity;
import kotlin.jvm.functions.Function1;

public final class convertAppInfo implements Function1 {
    private final NearbyMeActivity length;

    public convertAppInfo(NearbyMeActivity nearbyMeActivity) {
        this.length = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return this.length.nearbyMerchantLocationSearchView.getSearchedMerchantByPosition(((Integer) obj).intValue());
    }
}
