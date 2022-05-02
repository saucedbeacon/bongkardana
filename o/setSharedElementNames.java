package o;

import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class setSharedElementNames implements Runnable {
    private final VideoRendererEventListener.EventDispatcher length;
    private final DecoderCounters setMax;

    public setSharedElementNames(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.length = eventDispatcher;
        this.setMax = decoderCounters;
    }

    public final void run() {
        this.length.lambda$enabled$0(this.setMax);
    }
}
