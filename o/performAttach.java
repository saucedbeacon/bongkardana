package o;

import com.google.android.exoplayer2.source.MediaSourceEventListener;

public final class performAttach implements Runnable {
    private final MediaSourceEventListener.EventDispatcher getMax;
    private final MediaSourceEventListener length;
    private final MediaSourceEventListener.MediaLoadData setMax;

    public performAttach(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        this.getMax = eventDispatcher;
        this.length = mediaSourceEventListener;
        this.setMax = mediaLoadData;
    }

    public final void run() {
        this.getMax.lambda$downstreamFormatChanged$8(this.length, this.setMax);
    }
}
