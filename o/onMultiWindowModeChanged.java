package o;

import com.google.android.exoplayer2.audio.AudioRendererEventListener;

public final class onMultiWindowModeChanged implements Runnable {
    private final int getMin;
    private final long length;
    private final AudioRendererEventListener.EventDispatcher setMax;
    private final long setMin;

    public onMultiWindowModeChanged(AudioRendererEventListener.EventDispatcher eventDispatcher, int i, long j, long j2) {
        this.setMax = eventDispatcher;
        this.getMin = i;
        this.length = j;
        this.setMin = j2;
    }

    public final void run() {
        this.setMax.lambda$audioTrackUnderrun$3(this.getMin, this.length, this.setMin);
    }
}
