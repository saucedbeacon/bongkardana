package o;

import id.dana.nearbyme.NearbyMeActivity;
import kotlin.jvm.functions.Function1;

public final class getCategories implements Function1 {
    private final NearbyMeActivity setMin;

    public getCategories(NearbyMeActivity nearbyMeActivity) {
        this.setMin = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return this.setMin.nearbyMerchantLocationSearchView.getSearchedMerchantByPosition(((Integer) obj).intValue());
    }
}
