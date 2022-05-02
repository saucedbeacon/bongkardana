package o;

import id.dana.nearbyme.summary.NearbyMeSummaryFragment;

public final class q implements Runnable {
    private final NearbyMeSummaryFragment getMax;

    public q(NearbyMeSummaryFragment nearbyMeSummaryFragment) {
        this.getMax = nearbyMeSummaryFragment;
    }

    public final void run() {
        NearbyMeSummaryFragment.setMax(this.getMax);
    }
}
