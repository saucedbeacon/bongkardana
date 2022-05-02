package o;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 18)
public final class considerReleasingGlowsOnScroll extends stopScrollersInternal {
    public Surface getMin;
    public boolean setMax;

    public considerReleasingGlowsOnScroll(isLayoutSuppressed islayoutsuppressed, Surface surface) {
        super(islayoutsuppressed);
        length((Object) surface);
        this.getMin = surface;
        this.setMax = true;
    }

    public considerReleasingGlowsOnScroll(isLayoutSuppressed islayoutsuppressed, SurfaceTexture surfaceTexture) {
        super(islayoutsuppressed);
        length((Object) surfaceTexture);
    }
}
