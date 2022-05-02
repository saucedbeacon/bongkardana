package o;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class performActivityCreated implements Runnable {
    private final MediaSourceEventListener.MediaLoadData getMax;
    private final MediaSourceEventListener.EventDispatcher length;
    private final MediaSourceEventListener setMax;
    private final MediaSourceEventListener.LoadEventInfo setMin;

    public performActivityCreated(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        this.length = eventDispatcher;
        this.setMax = mediaSourceEventListener;
        this.setMin = loadEventInfo;
        this.getMax = mediaLoadData;
    }

    public final void run() {
        this.length.lambda$loadCanceled$4(this.setMax, this.setMin, this.getMax);
    }
}
