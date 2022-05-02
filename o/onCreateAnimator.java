package o;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

public final class onCreateAnimator implements Runnable {
    private final long getMax;
    private final String length;
    private final AudioRendererEventListener.EventDispatcher setMax;
    private final long setMin;

    public onCreateAnimator(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.setMax = eventDispatcher;
        this.length = str;
        this.setMin = j;
        this.getMax = j2;
    }

    public final void run() {
        this.setMax.lambda$decoderInitialized$1(this.length, this.setMin, this.getMax);
    }
}
