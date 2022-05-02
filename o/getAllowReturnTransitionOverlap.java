package o;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class getAllowReturnTransitionOverlap implements Runnable {
    private final MediaSourceEventListener.EventDispatcher getMin;
    private final MediaSource.MediaPeriodId setMax;
    private final MediaSourceEventListener setMin;

    public getAllowReturnTransitionOverlap(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId) {
        this.getMin = eventDispatcher;
        this.setMin = mediaSourceEventListener;
        this.setMax = mediaPeriodId;
    }

    public final void run() {
        this.getMin.lambda$mediaPeriodReleased$1(this.setMin, this.setMax);
    }
}
