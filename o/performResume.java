package o;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

public final class performResume implements Runnable {
    private final AdsMediaSource.ComponentListener getMin;

    public performResume(AdsMediaSource.ComponentListener componentListener) {
        this.getMin = componentListener;
    }

    public final void run() {
        this.getMin.lambda$onAdClicked$1();
    }
}
