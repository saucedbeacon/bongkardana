package o;

import id.dana.nearbyrevamp.NewNearbyMeActivity;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class p {
    public static final /* synthetic */ int[] setMax;
    public static final /* synthetic */ int[] setMin;

    static {
        int[] iArr = new int[NewNearbyMeActivity.MapState.values().length];
        setMin = iArr;
        iArr[NewNearbyMeActivity.MapState.SEARCH_RESULT.ordinal()] = 1;
        int[] iArr2 = new int[NewNearbyMeActivity.MapState.values().length];
        setMax = iArr2;
        iArr2[NewNearbyMeActivity.MapState.MERCHANT_OTHER_STORE.ordinal()] = 1;
        setMax[NewNearbyMeActivity.MapState.MERCHANT_LIST.ordinal()] = 2;
    }
}
