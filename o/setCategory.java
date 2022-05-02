package o;

import android.graphics.drawable.Drawable;
import android.location.Location;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.model.ShopModel;

public final class setCategory implements Runnable {
    private final NearbyMeActivity.AnonymousClass9 getMax;
    private final Location getMin;
    private final ShopModel length;
    private final Drawable setMin;

    public setCategory(NearbyMeActivity.AnonymousClass9 r1, ShopModel shopModel, Drawable drawable, Location location) {
        this.getMax = r1;
        this.length = shopModel;
        this.setMin = drawable;
        this.getMin = location;
    }

    public final void run() {
        NearbyMeActivity.AnonymousClass9 r0 = this.getMax;
        NearbyMeActivity.access$1800(NearbyMeActivity.this, this.length, this.setMin, this.getMin);
    }
}
