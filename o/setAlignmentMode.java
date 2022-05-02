package o;

import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.TraceMetric;

public final class setAlignmentMode implements Runnable {
    private final TraceMetric getMax;
    private final TransportManager length;
    private final ApplicationProcessState setMax;

    public setAlignmentMode(TransportManager transportManager, TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.length = transportManager;
        this.getMax = traceMetric;
        this.setMax = applicationProcessState;
    }

    public final void run() {
        this.length.lambda$log$2(this.getMax, this.setMax);
    }
}
