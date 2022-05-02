package o;

import android.location.Location;
import id.dana.R;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.model.ShopModel;

public final class setCategoryId implements Runnable {
    private final ShopModel getMax;
    private final Location length;
    private final NearbyMeActivity.AnonymousClass9 setMin;

    public setCategoryId(NearbyMeActivity.AnonymousClass9 r1, ShopModel shopModel, Location location) {
        this.setMin = r1;
        this.getMax = shopModel;
        this.length = location;
    }

    public final void run() {
        NearbyMeActivity.AnonymousClass9 r0 = this.setMin;
        NearbyMeActivity.access$1800(NearbyMeActivity.this, this.getMax, cancelAll.getMin(NearbyMeActivity.this, R.drawable.ic_dana_bisnis), this.length);
    }
}
