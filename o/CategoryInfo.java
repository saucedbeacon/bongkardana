package o;

import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import kotlin.jvm.functions.Function1;

public final class CategoryInfo implements MerchantListAdapter.setMax {
    private final Function1 length;
    private final NearbyMeActivity setMax;

    public CategoryInfo(NearbyMeActivity nearbyMeActivity, Function1 function1) {
        this.setMax = nearbyMeActivity;
        this.length = function1;
    }

    public final void getMax(int i) {
        NearbyMeActivity.getMax(this.setMax, this.length, i);
    }
}
