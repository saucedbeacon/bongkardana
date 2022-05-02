package o;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

public final class requireView implements Runnable {
    private final int setMax;
    private final AudioRendererEventListener.EventDispatcher setMin;

    public requireView(AudioRendererEventListener.EventDispatcher eventDispatcher, int i) {
        this.setMin = eventDispatcher;
        this.setMax = i;
    }

    public final void run() {
        this.setMin.lambda$audioSessionId$5(this.setMax);
    }
}
