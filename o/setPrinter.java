package o;

import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;

public final class setPrinter implements Runnable {
    private final TransportManager getMax;
    private final ApplicationProcessState getMin;
    private final GaugeMetric length;

    public setPrinter(TransportManager transportManager, GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.getMax = transportManager;
        this.length = gaugeMetric;
        this.getMin = applicationProcessState;
    }

    public final void run() {
        this.getMax.lambda$log$4(this.length, this.getMin);
    }
}
