package id.dana.media.exploredana.youtubeplayer;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.google.android.youtube.player.YouTubePlayerView;
import id.dana.R;
import o.drawDividersHorizontal;

public class YoutubePlayerActivity_ViewBinding implements Unbinder {
    private YoutubePlayerActivity getMax;

    @UiThread
    public YoutubePlayerActivity_ViewBinding(YoutubePlayerActivity youtubePlayerActivity, View view) {
        this.getMax = youtubePlayerActivity;
        youtubePlayerActivity.youtubePlayerView = (YouTubePlayerView) drawDividersHorizontal.setMin(view, R.id.f74372131366073, "field 'youtubePlayerView'", YouTubePlayerView.class);
    }

    @CallSuper
    public final void setMax() {
        YoutubePlayerActivity youtubePlayerActivity = this.getMax;
        if (youtubePlayerActivity != null) {
            this.getMax = null;
            youtubePlayerActivity.youtubePlayerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
