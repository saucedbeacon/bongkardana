package o;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;

public final class onPictureInPictureModeChanged implements Runnable {
    private final DecoderCounters getMax;
    private final AudioRendererEventListener.EventDispatcher getMin;

    public onPictureInPictureModeChanged(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.getMin = eventDispatcher;
        this.getMax = decoderCounters;
    }

    public final void run() {
        this.getMin.lambda$disabled$4(this.getMax);
    }
}
