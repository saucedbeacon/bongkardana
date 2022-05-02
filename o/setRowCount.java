package o;

import com.google.firebase.perf.session.gauges.MemoryGaugeCollector;
import com.google.firebase.perf.util.Timer;

public final class setRowCount implements Runnable {
    private final MemoryGaugeCollector length;
    private final Timer setMin;

    public setRowCount(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        this.length = memoryGaugeCollector;
        this.setMin = timer;
    }

    public final void run() {
        this.length.lambda$scheduleMemoryMetricCollectionOnce$1(this.setMin);
    }
}
