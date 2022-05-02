package o;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class startPostponedEnterTransition implements Runnable {
    private final MediaSourceEventListener.LoadEventInfo getMax;
    private final MediaSourceEventListener length;
    private final MediaSourceEventListener.EventDispatcher setMax;
    private final MediaSourceEventListener.MediaLoadData setMin;

    public startPostponedEnterTransition(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        this.setMax = eventDispatcher;
        this.length = mediaSourceEventListener;
        this.getMax = loadEventInfo;
        this.setMin = mediaLoadData;
    }

    public final void run() {
        this.setMax.lambda$loadStarted$2(this.length, this.getMax, this.setMin);
    }
}
