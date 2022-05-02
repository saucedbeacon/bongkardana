package o;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class setAnimator implements Runnable {
    private final DecoderCounters getMax;
    private final VideoRendererEventListener.EventDispatcher setMax;

    public setAnimator(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.setMax = eventDispatcher;
        this.getMax = decoderCounters;
    }

    public final void run() {
        this.setMax.lambda$disabled$6(this.getMax);
    }
}
