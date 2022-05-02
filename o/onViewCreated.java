package o;

import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.PlayerMessage;

public final class onViewCreated implements Runnable {
    private final ExoPlayerImplInternal setMax;
    private final PlayerMessage setMin;

    public onViewCreated(ExoPlayerImplInternal exoPlayerImplInternal, PlayerMessage playerMessage) {
        this.setMax = exoPlayerImplInternal;
        this.setMin = playerMessage;
    }

    public final void run() {
        this.setMax.lambda$sendMessageToTargetThread$0(this.setMin);
    }
}
