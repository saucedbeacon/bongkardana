package o;

import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.EventDispatcher;

public final class getExitAnim implements EventDispatcher.Event {
    private final long getMax;
    private final long length;
    private final int setMax;

    public getExitAnim(int i, long j, long j2) {
        this.setMax = i;
        this.getMax = j;
        this.length = j2;
    }

    public final void sendTo(Object obj) {
        ((BandwidthMeter.EventListener) obj).onBandwidthSample(this.setMax, this.getMax, this.length);
    }
}
