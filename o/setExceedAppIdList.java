package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.nearbyme.NearbyMerchantLocationSearchView;
import o.setTextColor;

public final class setExceedAppIdList implements getBindingAdapter<NearbyMerchantLocationSearchView> {
    @InjectedFieldSignature("id.dana.nearbyme.NearbyMerchantLocationSearchView.presenter")
    public static void getMax(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView, setTextColor.length length) {
        nearbyMerchantLocationSearchView.presenter = length;
    }

    @InjectedFieldSignature("id.dana.nearbyme.NearbyMerchantLocationSearchView.nearbyAnalyticTracker")
    public static void getMin(NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView, t tVar) {
        nearbyMerchantLocationSearchView.nearbyAnalyticTracker = tVar;
    }
}
