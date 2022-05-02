package o;

import com.google.firebase.perf.transport.TransportManager;

public final class getAlignmentMode implements Runnable {
    private final TransportManager length;

    public getAlignmentMode(TransportManager transportManager) {
        this.length = transportManager;
    }

    public final void run() {
        this.length.syncInit();
    }
}
