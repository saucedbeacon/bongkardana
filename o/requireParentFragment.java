package o;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;

public final class requireParentFragment implements Runnable {
    private final Uploader getMax;
    private final Runnable getMin;
    private final int length;
    private final TransportContext setMax;

    public requireParentFragment(Uploader uploader, TransportContext transportContext, int i, Runnable runnable) {
        this.getMax = uploader;
        this.setMax = transportContext;
        this.length = i;
        this.getMin = runnable;
    }

    public final void run() {
        this.getMax.lambda$upload$1(this.setMax, this.length, this.getMin);
    }
}
