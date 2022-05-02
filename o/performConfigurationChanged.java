package o;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

public final class performConfigurationChanged implements Runnable {
    private final AdsMediaSource.ComponentListener length;

    public performConfigurationChanged(AdsMediaSource.ComponentListener componentListener) {
        this.length = componentListener;
    }

    public final void run() {
        this.length.lambda$onAdTapped$2();
    }
}
