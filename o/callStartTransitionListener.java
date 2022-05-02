package o;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class callStartTransitionListener implements Runnable {
    private final MediaSourceEventListener.MediaLoadData getMin;
    private final MediaSourceEventListener.LoadEventInfo length;
    private final MediaSourceEventListener.EventDispatcher setMax;
    private final MediaSourceEventListener setMin;

    public callStartTransitionListener(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        this.setMax = eventDispatcher;
        this.setMin = mediaSourceEventListener;
        this.length = loadEventInfo;
        this.getMin = mediaLoadData;
    }

    public final void run() {
        this.setMax.lambda$loadCompleted$3(this.setMin, this.length, this.getMin);
    }
}
