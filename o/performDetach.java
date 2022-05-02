package o;

import com.google.android.exoplayer2.ui.spherical.SphericalSurfaceView;

public final class performDetach implements Runnable {
    private final SphericalSurfaceView getMax;

    public performDetach(SphericalSurfaceView sphericalSurfaceView) {
        this.getMax = sphericalSurfaceView;
    }

    public final void run() {
        this.getMax.lambda$onDetachedFromWindow$0();
    }
}
