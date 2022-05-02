package id.dana.media.exploredana.exoplayer;

import android.view.View;
import androidx.annotation.UiThread;
import com.google.android.exoplayer2.ui.PlayerView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;

public class ExoPlayerActivity_ViewBinding extends BaseActivity_ViewBinding {
    private ExoPlayerActivity getMin;

    @UiThread
    public ExoPlayerActivity_ViewBinding(ExoPlayerActivity exoPlayerActivity, View view) {
        super(exoPlayerActivity, view);
        this.getMin = exoPlayerActivity;
        exoPlayerActivity.playerView = (PlayerView) drawDividersHorizontal.setMin(view, R.id.f71682131365802, "field 'playerView'", PlayerView.class);
    }

    public final void setMax() {
        ExoPlayerActivity exoPlayerActivity = this.getMin;
        if (exoPlayerActivity != null) {
            this.getMin = null;
            exoPlayerActivity.playerView = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
