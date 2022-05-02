package o;

import android.graphics.drawable.Drawable;
import android.location.Location;
import id.dana.nearbyme.NearbyMeActivity;
import id.dana.nearbyme.model.ShopModel;

public final class getCategoryId implements Runnable {
    private final ShopModel getMax;
    private final Drawable length;
    private final NearbyMeActivity.AnonymousClass3 setMax;
    private final Location setMin;

    public getCategoryId(NearbyMeActivity.AnonymousClass3 r1, ShopModel shopModel, Drawable drawable, Location location) {
        this.setMax = r1;
        this.getMax = shopModel;
        this.length = drawable;
        this.setMin = location;
    }

    public final void run() {
        NearbyMeActivity.AnonymousClass3 r0 = this.setMax;
        NearbyMeActivity.access$1700(NearbyMeActivity.this, this.getMax, this.length, this.setMin);
    }
}
