package o;

import com.google.android.exoplayer2.source.ExtractorMediaPeriod;

public final class setAllowEnterTransitionOverlap implements Runnable {
    private final ExtractorMediaPeriod setMax;

    public setAllowEnterTransitionOverlap(ExtractorMediaPeriod extractorMediaPeriod) {
        this.setMax = extractorMediaPeriod;
    }

    public final void run() {
        this.setMax.maybeFinishPrepare();
    }
}
