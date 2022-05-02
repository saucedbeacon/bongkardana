package o;

import android.location.Location;

final class setOnPageChangeListener implements RedDotManager {
    private final updateAdapter getMax;

    public setOnPageChangeListener(updateAdapter updateadapter) {
        this.getMax = updateadapter;
    }

    public final void accept(Object obj) {
        updateAdapter.getMax(this.getMax, (Location) obj);
    }
}
