package o;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import java.io.IOException;

public final class performMultiWindowModeChanged implements Runnable {
    private final IOException getMin;
    private final AdsMediaSource.AdPrepareErrorListener length;

    public performMultiWindowModeChanged(AdsMediaSource.AdPrepareErrorListener adPrepareErrorListener, IOException iOException) {
        this.length = adPrepareErrorListener;
        this.getMin = iOException;
    }

    public final void run() {
        this.length.lambda$onPrepareError$0(this.getMin);
    }
}
