package o;

import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;

public final class performOptionsMenuClosed implements Runnable {
    private final HlsSampleStreamWrapper getMax;

    public performOptionsMenuClosed(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.getMax = hlsSampleStreamWrapper;
    }

    public final void run() {
        this.getMax.onTracksEnded();
    }
}
