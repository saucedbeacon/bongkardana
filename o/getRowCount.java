package o;

import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

public final class getRowCount implements Runnable {
    private final String getMax;
    private final GaugeManager getMin;
    private final ApplicationProcessState length;

    public getRowCount(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.getMin = gaugeManager;
        this.getMax = str;
        this.length = applicationProcessState;
    }

    public final void run() {
        this.getMin.lambda$stopCollectingGauges$1(this.getMax, this.length);
    }
}
