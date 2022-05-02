package o;

import com.google.android.exoplayer2.source.MediaSourceEventListener;
import java.io.IOException;

public final class performViewCreated implements Runnable {
    private final MediaSourceEventListener getMax;
    private final MediaSourceEventListener.LoadEventInfo getMin;
    private final boolean isInside;
    private final MediaSourceEventListener.MediaLoadData length;
    private final MediaSourceEventListener.EventDispatcher setMax;
    private final IOException setMin;

    public performViewCreated(MediaSourceEventListener.EventDispatcher eventDispatcher, MediaSourceEventListener mediaSourceEventListener, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.setMax = eventDispatcher;
        this.getMax = mediaSourceEventListener;
        this.getMin = loadEventInfo;
        this.length = mediaLoadData;
        this.setMin = iOException;
        this.isInside = z;
    }

    public final void run() {
        this.setMax.lambda$loadError$5(this.getMax, this.getMin, this.length, this.setMin, this.isInside);
    }
}
