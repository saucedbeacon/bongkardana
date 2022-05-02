package o;

import android.view.View;
import id.dana.nearbyme.summary.NearbyMeSummaryFragment;

public final class n implements View.OnClickListener {
    private final NearbyMeSummaryFragment setMax;

    public n(NearbyMeSummaryFragment nearbyMeSummaryFragment) {
        this.setMax = nearbyMeSummaryFragment;
    }

    public final void onClick(View view) {
        NearbyMeSummaryFragment.getMin(this.setMax);
    }
}
