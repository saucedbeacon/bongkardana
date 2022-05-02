package o;

import id.dana.nearbyme.NearbyMerchantLocationSearchView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class getExceedAppIdList {
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[NearbyMerchantLocationSearchView.State.values().length];
        setMin = iArr;
        iArr[NearbyMerchantLocationSearchView.State.INITIAL_MERCHANT_VIEW.ordinal()] = 1;
        setMin[NearbyMerchantLocationSearchView.State.EMPTY_MERCHANT_VIEW.ordinal()] = 2;
        setMin[NearbyMerchantLocationSearchView.State.INITIAL_LOCATION_VIEW.ordinal()] = 3;
        setMin[NearbyMerchantLocationSearchView.State.EMPTY_LOCATION_VIEW.ordinal()] = 4;
        setMin[NearbyMerchantLocationSearchView.State.LOCATION_EMPTY.ordinal()] = 5;
        setMin[NearbyMerchantLocationSearchView.State.LOCATION_EXIST.ordinal()] = 6;
        setMin[NearbyMerchantLocationSearchView.State.MERCHANT_EMPTY.ordinal()] = 7;
        setMin[NearbyMerchantLocationSearchView.State.MERCHANT_EXIST.ordinal()] = 8;
    }
}
