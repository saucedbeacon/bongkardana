package o;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class getSharedElementTargetNames implements Runnable {
    private final int length;
    private final long setMax;
    private final VideoRendererEventListener.EventDispatcher setMin;

    public getSharedElementTargetNames(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, long j) {
        this.setMin = eventDispatcher;
        this.length = i;
        this.setMax = j;
    }

    public final void run() {
        this.setMin.lambda$droppedFrames$3(this.length, this.setMax);
    }
}
