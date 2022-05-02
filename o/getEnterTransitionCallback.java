package o;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class getEnterTransitionCallback implements Runnable {
    private final Format getMin;
    private final VideoRendererEventListener.EventDispatcher length;

    public getEnterTransitionCallback(VideoRendererEventListener.EventDispatcher eventDispatcher, Format format) {
        this.length = eventDispatcher;
        this.getMin = format;
    }

    public final void run() {
        this.length.lambda$inputFormatChanged$2(this.getMin);
    }
}
