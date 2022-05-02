package o;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;

public final class getView implements Runnable {
    private final AudioRendererEventListener.EventDispatcher getMax;
    private final DecoderCounters setMax;

    public getView(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.getMax = eventDispatcher;
        this.setMax = decoderCounters;
    }

    public final void run() {
        this.getMax.lambda$enabled$0(this.setMax);
    }
}
