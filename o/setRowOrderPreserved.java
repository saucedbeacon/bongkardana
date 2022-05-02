package o;

import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;

public final class setRowOrderPreserved implements Runnable {
    private final ApplicationProcessState getMax;
    private final NetworkRequestMetric length;
    private final TransportManager setMax;

    public setRowOrderPreserved(TransportManager transportManager, NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.setMax = transportManager;
        this.length = networkRequestMetric;
        this.getMax = applicationProcessState;
    }

    public final void run() {
        this.setMax.lambda$log$3(this.length, this.getMax);
    }
}
