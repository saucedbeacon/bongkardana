package o;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;

public final class computeScrollVectorForPosition {
    SurfaceTexture setMax;
    SurfaceHolder setMin;

    public computeScrollVectorForPosition(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.setMin = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public computeScrollVectorForPosition(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.setMax = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
