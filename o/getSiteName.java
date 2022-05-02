package o;

import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.Marker;
import id.dana.nearbyme.NearbyMeActivity;

public final class getSiteName implements Runnable {
    private final Marker getMax;
    private final NearbyMeActivity.AnonymousClass7 getMin;
    private final Drawable setMin;

    public getSiteName(NearbyMeActivity.AnonymousClass7 r1, Drawable drawable, Marker marker) {
        this.getMin = r1;
        this.setMin = drawable;
        this.getMax = marker;
    }

    public final void run() {
        NearbyMeActivity.AnonymousClass7 r0 = this.getMin;
        NearbyMeActivity.access$1900(NearbyMeActivity.this, this.setMin, this.getMax);
    }
}
