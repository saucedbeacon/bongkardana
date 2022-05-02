package o;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class postponeEnterTransition implements Runnable {
    private final MediaSource.MediaPeriodId getMax;
    private final MediaSourceEventListener.EventDispatcher setMax;
    private final MediaSourceEventListener setMin;

    public postponeEnterTransition(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId) {
        this.setMax = eventDispatcher;
        this.setMin = mediaSourceEventListener;
        this.getMax = mediaPeriodId;
    }

    public final void run() {
        this.setMax.lambda$mediaPeriodCreated$0(this.setMin, this.getMax);
    }
}
