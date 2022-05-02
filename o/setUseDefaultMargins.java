package o;

import com.google.firebase.perf.transport.TransportManager;

public final class setUseDefaultMargins implements Runnable {
    private final TransportManager length;

    public setUseDefaultMargins(TransportManager transportManager) {
        this.length = transportManager;
    }

    public final void run() {
        this.length.lambda$onUpdateAppState$1();
    }
}
