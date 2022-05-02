package o;

import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class findFragmentByWho implements Runnable {
    private final MediaSource.MediaPeriodId getMax;
    private final MediaSourceEventListener.EventDispatcher length;
    private final MediaSourceEventListener setMin;

    public findFragmentByWho(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId) {
        this.length = eventDispatcher;
        this.setMin = mediaSourceEventListener;
        this.getMax = mediaPeriodId;
    }

    public final void run() {
        this.length.lambda$readingStarted$6(this.setMin, this.getMax);
    }
}
