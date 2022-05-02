package o;

import java.util.List;
import java.util.concurrent.Callable;

final class RVPhaseRecorder implements Callable {
    private final List setMax;
    private final RVTraceKey setMin;

    public RVPhaseRecorder(RVTraceKey rVTraceKey, List list) {
        this.setMin = rVTraceKey;
        this.setMax = list;
    }

    public final Object call() {
        return this.setMin.lambda$getSendMoneyMenuItems$0(this.setMax);
    }
}
