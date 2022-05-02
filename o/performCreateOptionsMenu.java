package o;

import com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper;

public final class performCreateOptionsMenu implements Runnable {
    private final HlsSampleStreamWrapper setMax;

    public performCreateOptionsMenu(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.setMax = hlsSampleStreamWrapper;
    }

    public final void run() {
        this.setMax.maybeFinishPrepare();
    }
}
