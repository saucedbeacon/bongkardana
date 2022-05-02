package o;

import android.view.Surface;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class setAnimatingAway implements Runnable {
    private final Surface getMax;
    private final VideoRendererEventListener.EventDispatcher setMin;

    public setAnimatingAway(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.setMin = eventDispatcher;
        this.getMax = surface;
    }

    public final void run() {
        this.setMin.lambda$renderedFirstFrame$5(this.getMax);
    }
}
