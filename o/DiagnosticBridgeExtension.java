package o;

import com.google.android.youtube.player.YouTubePlayer;

public final class DiagnosticBridgeExtension implements YouTubePlayer.PlayerStateChangeListener {
    private final YouTubePlayer getMax;

    public final void onAdStarted() {
    }

    public final void onError(YouTubePlayer.ErrorReason errorReason) {
    }

    public final void onLoading() {
    }

    public final void onVideoEnded() {
    }

    public final void onVideoStarted() {
    }

    public DiagnosticBridgeExtension(YouTubePlayer youTubePlayer) {
        this.getMax = youTubePlayer;
    }

    public final void onLoaded(String str) {
        if (!str.isEmpty()) {
            this.getMax.play();
        }
    }
}
