package o;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;

public final class getHost implements Runnable {
    private final TransportContext getMax;
    private final DefaultScheduler getMin;
    private final TransportScheduleCallback setMax;
    private final EventInternal setMin;

    public getHost(DefaultScheduler defaultScheduler, TransportContext transportContext, TransportScheduleCallback transportScheduleCallback, EventInternal eventInternal) {
        this.getMin = defaultScheduler;
        this.getMax = transportContext;
        this.setMax = transportScheduleCallback;
        this.setMin = eventInternal;
    }

    public final void run() {
        this.getMin.lambda$schedule$1(this.getMax, this.setMax, this.setMin);
    }
}
