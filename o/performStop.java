package o;

import com.google.android.exoplayer2.ui.PlayerControlView;

public final class performStop implements Runnable {
    private final PlayerControlView setMin;

    public performStop(PlayerControlView playerControlView) {
        this.setMin = playerControlView;
    }

    public final void run() {
        this.setMin.hide();
    }
}
