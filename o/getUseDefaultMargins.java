package o;

import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;

public final class getUseDefaultMargins implements Runnable {
    private final String getMin;
    private final ApplicationProcessState length;
    private final GaugeManager setMin;

    public getUseDefaultMargins(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState) {
        this.setMin = gaugeManager;
        this.getMin = str;
        this.length = applicationProcessState;
    }

    public final void run() {
        this.setMin.lambda$startCollectingGauges$0(this.getMin, this.length);
    }
}
