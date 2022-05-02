package o;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;

public final class performPrimaryNavigationFragmentChanged implements Runnable {
    private final ExoPlayer getMax;
    private final AdsMediaSource setMax;
    private final AdsMediaSource.ComponentListener setMin;

    public performPrimaryNavigationFragmentChanged(AdsMediaSource adsMediaSource, ExoPlayer exoPlayer, AdsMediaSource.ComponentListener componentListener) {
        this.setMax = adsMediaSource;
        this.getMax = exoPlayer;
        this.setMin = componentListener;
    }

    public final void run() {
        this.setMax.lambda$prepareSourceInternal$0(this.getMax, this.setMin);
    }
}
