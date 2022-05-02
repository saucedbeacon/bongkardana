package o;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class getExitTransitionCallback implements Runnable {
    private final long getMax;
    private final VideoRendererEventListener.EventDispatcher length;
    private final long setMax;
    private final String setMin;

    public getExitTransitionCallback(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.length = eventDispatcher;
        this.setMin = str;
        this.setMax = j;
        this.getMax = j2;
    }

    public final void run() {
        this.length.lambda$decoderInitialized$1(this.setMin, this.setMax, this.getMax);
    }
}
