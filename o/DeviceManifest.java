package o;

import id.dana.nearbyme.summary.NearbyMeSummaryFragment;

public final class DeviceManifest implements Runnable {
    private final NearbyMeSummaryFragment setMax;

    public DeviceManifest(NearbyMeSummaryFragment nearbyMeSummaryFragment) {
        this.setMax = nearbyMeSummaryFragment;
    }

    public final void run() {
        NearbyMeSummaryFragment.getMax(this.setMax);
    }
}
