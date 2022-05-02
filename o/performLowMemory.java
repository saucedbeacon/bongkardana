package o;

import com.google.android.exoplayer2.source.dash.DashMediaSource;

public final class performLowMemory implements Runnable {
    private final DashMediaSource setMin;

    public performLowMemory(DashMediaSource dashMediaSource) {
        this.setMin = dashMediaSource;
    }

    public final void run() {
        this.setMin.lambda$new$0();
    }
}
