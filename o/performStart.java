package o;

import com.google.android.exoplayer2.source.ads.AdsLoader;

public final class performStart implements Runnable {
    private final AdsLoader setMin;

    public performStart(AdsLoader adsLoader) {
        this.setMin = adsLoader;
    }

    public final void run() {
        this.setMin.detachPlayer();
    }
}
