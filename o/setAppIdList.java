package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.OtherStoreListActivity;
import o.distanceInfluenceForSnapDuration;

public final class setAppIdList implements getBindingAdapter<OtherStoreListActivity> {
    @InjectedFieldSignature("id.dana.nearbyme.OtherStoreListActivity.presenter")
    public static void setMax(OtherStoreListActivity otherStoreListActivity, distanceInfluenceForSnapDuration.getMax getmax) {
        otherStoreListActivity.presenter = getmax;
    }

    @InjectedFieldSignature("id.dana.nearbyme.OtherStoreListActivity.nearbyAnalyticTracker")
    public static void setMin(OtherStoreListActivity otherStoreListActivity, t tVar) {
        otherStoreListActivity.nearbyAnalyticTracker = tVar;
    }
}
