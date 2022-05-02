package o;

import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;

public final class performPause implements Runnable {
    private final SsMediaSource setMax;

    public performPause(SsMediaSource ssMediaSource) {
        this.setMax = ssMediaSource;
    }

    public final void run() {
        this.setMax.startLoadingManifest();
    }
}
