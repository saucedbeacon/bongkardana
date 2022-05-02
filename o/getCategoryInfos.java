package o;

import com.google.android.gms.maps.model.Marker;
import id.dana.R;
import id.dana.nearbyme.NearbyMeActivity;

public final class getCategoryInfos implements Runnable {
    private final Marker getMax;
    private final NearbyMeActivity.AnonymousClass7 setMax;

    public getCategoryInfos(NearbyMeActivity.AnonymousClass7 r1, Marker marker) {
        this.setMax = r1;
        this.getMax = marker;
    }

    public final void run() {
        NearbyMeActivity.AnonymousClass7 r0 = this.setMax;
        NearbyMeActivity.access$1900(NearbyMeActivity.this, cancelAll.getMin(NearbyMeActivity.this, R.drawable.ic_dana_bisnis), this.getMax);
    }
}
