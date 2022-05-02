package o;

import com.google.android.exoplayer2.source.ExtractorMediaPeriod;

public final class dump implements Runnable {
    private final ExtractorMediaPeriod setMin;

    public dump(ExtractorMediaPeriod extractorMediaPeriod) {
        this.setMin = extractorMediaPeriod;
    }

    public final void run() {
        this.setMin.lambda$new$0();
    }
}
