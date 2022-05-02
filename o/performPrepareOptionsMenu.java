package o;

import com.google.android.exoplayer2.source.dash.DashMediaSource;

public final class performPrepareOptionsMenu implements Runnable {
    private final DashMediaSource getMin;

    public performPrepareOptionsMenu(DashMediaSource dashMediaSource) {
        this.getMin = dashMediaSource;
    }

    public final void run() {
        this.getMin.startLoadingManifest();
    }
}
