package o;

import com.google.firebase.perf.session.gauges.CpuGaugeCollector;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.Executor;

public final class GridLayout implements Runnable {
    private final Timer getMin;
    private final CpuGaugeCollector length;

    public final class LayoutParams implements Executor {
        public static final LayoutParams length = new LayoutParams();

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public GridLayout(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        this.length = cpuGaugeCollector;
        this.getMin = timer;
    }

    public final void run() {
        this.length.lambda$scheduleCpuMetricCollectionOnce$1(this.getMin);
    }
}
