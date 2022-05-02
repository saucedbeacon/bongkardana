package o;

import com.google.android.exoplayer2.ui.PlayerControlView;

public final class performSaveInstanceState implements Runnable {
    private final PlayerControlView getMax;

    public performSaveInstanceState(PlayerControlView playerControlView) {
        this.getMax = playerControlView;
    }

    public final void run() {
        this.getMax.updateProgress();
    }
}
