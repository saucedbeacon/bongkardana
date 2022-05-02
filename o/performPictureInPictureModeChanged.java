package o;

import com.google.android.exoplayer2.source.ads.AdsMediaSource;

public final class performPictureInPictureModeChanged implements Runnable {
    private final AdsMediaSource.AdLoadException getMax;
    private final AdsMediaSource.ComponentListener getMin;

    public performPictureInPictureModeChanged(AdsMediaSource.ComponentListener componentListener, AdsMediaSource.AdLoadException adLoadException) {
        this.getMin = componentListener;
        this.getMax = adLoadException;
    }

    public final void run() {
        this.getMin.lambda$onAdLoadError$3(this.getMax);
    }
}
