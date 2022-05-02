package o;

import com.google.android.exoplayer2.video.VideoRendererEventListener;

public final class getSharedElementSourceNames implements Runnable {
    private final float getMax;
    private final VideoRendererEventListener.EventDispatcher getMin;
    private final int length;
    private final int setMax;
    private final int setMin;

    public getSharedElementSourceNames(VideoRendererEventListener.EventDispatcher eventDispatcher, int i, int i2, int i3, float f) {
        this.getMin = eventDispatcher;
        this.length = i;
        this.setMax = i2;
        this.setMin = i3;
        this.getMax = f;
    }

    public final void run() {
        this.getMin.lambda$videoSizeChanged$4(this.length, this.setMax, this.setMin, this.getMax);
    }
}
