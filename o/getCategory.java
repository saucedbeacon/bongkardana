package o;

import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import kotlin.jvm.functions.Function1;

public final class getCategory implements MerchantListAdapter.length {
    private final Function1 length;
    private final NearbyMeActivity setMin;

    public getCategory(NearbyMeActivity nearbyMeActivity, Function1 function1) {
        this.setMin = nearbyMeActivity;
        this.length = function1;
    }

    public final void getMax(int i) {
        NearbyMeActivity.setMin(this.setMin, this.length, i);
    }
}
