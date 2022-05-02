package o;

import android.location.Location;
import o.H5Worker;

final class addOnPageChangeListener implements getChildren {
    private final H5Worker.RenderReadyListener getMax;
    private final updateAdapter setMin;

    public addOnPageChangeListener(updateAdapter updateadapter, H5Worker.RenderReadyListener renderReadyListener) {
        this.setMin = updateadapter;
        this.getMax = renderReadyListener;
    }

    public final boolean test(Object obj) {
        return this.setMin.getMin(this.getMax, (Location) obj);
    }
}
