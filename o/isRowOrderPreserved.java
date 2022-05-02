package o;

import com.google.firebase.perf.transport.PendingPerfEvent;
import com.google.firebase.perf.transport.TransportManager;

public final class isRowOrderPreserved implements Runnable {
    private final TransportManager length;
    private final PendingPerfEvent setMin;

    public isRowOrderPreserved(TransportManager transportManager, PendingPerfEvent pendingPerfEvent) {
        this.length = transportManager;
        this.setMin = pendingPerfEvent;
    }

    public final void run() {
        this.length.lambda$finishInitialization$0(this.setMin);
    }
}
