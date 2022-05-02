package o;

import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import kotlin.jvm.functions.Function1;

public final class convertAppInfos implements MerchantListAdapter.getMax {
    private final NearbyMeActivity setMax;
    private final Function1 setMin;

    public convertAppInfos(NearbyMeActivity nearbyMeActivity, Function1 function1) {
        this.setMax = nearbyMeActivity;
        this.setMin = function1;
    }

    public final void setMin(int i) {
        NearbyMeActivity.getMin(this.setMax, this.setMin, i);
    }
}
