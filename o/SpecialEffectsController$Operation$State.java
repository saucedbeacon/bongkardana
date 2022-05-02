package o;

import com.google.firebase.perf.session.gauges.CpuGaugeCollector;
import com.google.firebase.perf.util.Timer;

public final class SpecialEffectsController$Operation$State implements Runnable {
    private final CpuGaugeCollector getMin;
    private final Timer setMax;

    public SpecialEffectsController$Operation$State(CpuGaugeCollector cpuGaugeCollector, Timer timer) {
        this.getMin = cpuGaugeCollector;
        this.setMax = timer;
    }

    public final void run() {
        this.getMin.lambda$scheduleCpuMetricCollectionWithRate$0(this.setMax);
    }
}
