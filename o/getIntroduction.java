package o;

import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import java.util.List;

public final class getIntroduction implements MerchantListAdapter.getMin {
    private final NearbyMeActivity length;

    public getIntroduction(NearbyMeActivity nearbyMeActivity) {
        this.length = nearbyMeActivity;
    }

    public final void setMin(List list) {
        this.length.showPromoBottomSheet(list);
    }
}
