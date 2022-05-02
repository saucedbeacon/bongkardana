package o;

import android.graphics.SurfaceTexture;
import com.google.android.exoplayer2.ui.spherical.SceneRenderer;

public final class setOnStartEnterTransitionListener implements SurfaceTexture.OnFrameAvailableListener {
    private final SceneRenderer getMax;

    public setOnStartEnterTransitionListener(SceneRenderer sceneRenderer) {
        this.getMax = sceneRenderer;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.getMax.lambda$init$0(surfaceTexture);
    }
}
