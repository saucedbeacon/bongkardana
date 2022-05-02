package o;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class performCreate implements Runnable {
    private final MediaSourceEventListener.MediaLoadData getMax;
    private final MediaSourceEventListener.EventDispatcher getMin;
    private final MediaSource.MediaPeriodId length;
    private final MediaSourceEventListener setMin;

    public performCreate(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        this.getMin = eventDispatcher;
        this.setMin = mediaSourceEventListener;
        this.length = mediaPeriodId;
        this.getMax = mediaLoadData;
    }

    public final void run() {
        this.getMin.lambda$upstreamDiscarded$7(this.setMin, this.length, this.getMax);
    }
}
