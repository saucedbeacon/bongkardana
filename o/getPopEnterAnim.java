package o;

import android.graphics.SurfaceTexture;
import com.google.android.exoplayer2.ui.spherical.SphericalSurfaceView;

public final class getPopEnterAnim implements Runnable {
    private final SphericalSurfaceView getMin;
    private final SurfaceTexture length;

    public getPopEnterAnim(SphericalSurfaceView sphericalSurfaceView, SurfaceTexture surfaceTexture) {
        this.getMin = sphericalSurfaceView;
        this.length = surfaceTexture;
    }

    public final void run() {
        this.getMin.lambda$onSurfaceTextureAvailable$1(this.length);
    }
}
