package o;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;

public final class restoreChildFragmentState implements Runnable {
    private final Format getMin;
    private final AudioRendererEventListener.EventDispatcher setMax;

    public restoreChildFragmentState(AudioRendererEventListener.EventDispatcher eventDispatcher, Format format) {
        this.setMax = eventDispatcher;
        this.getMin = format;
    }

    public final void run() {
        this.setMax.lambda$inputFormatChanged$2(this.getMin);
    }
}
