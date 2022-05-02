package o;

import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class getAppInfos implements MerchantListAdapter.setMin {
    private final NearbyMeActivity setMin;

    public getAppInfos(NearbyMeActivity nearbyMeActivity) {
        this.setMin = nearbyMeActivity;
    }

    public final void getMin(String str) {
        NearbyMeActivity.length(str);
    }
}
