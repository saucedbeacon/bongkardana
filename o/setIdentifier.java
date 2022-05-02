package o;

import id.dana.nearbyme.NearbyMeActivity;
import kotlin.jvm.functions.Function1;

public final class setIdentifier implements Function1 {
    private final NearbyMeActivity setMax;

    public setIdentifier(NearbyMeActivity nearbyMeActivity) {
        this.setMax = nearbyMeActivity;
    }

    public final Object invoke(Object obj) {
        return this.setMax.merchantListView.getMerchantItem(((Integer) obj).intValue());
    }
}
