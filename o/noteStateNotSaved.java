package o;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;

public final class noteStateNotSaved implements Runnable {
    private final AdsMediaSource.ComponentListener length;
    private final AdPlaybackState setMax;

    public noteStateNotSaved(AdsMediaSource.ComponentListener componentListener, AdPlaybackState adPlaybackState) {
        this.length = componentListener;
        this.setMax = adPlaybackState;
    }

    public final void run() {
        this.length.lambda$onAdPlaybackState$0(this.setMax);
    }
}
