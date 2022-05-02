package id.dana.richview.leaderboardentry;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class LeaderboardEntryView_ViewBinding implements Unbinder {
    private LeaderboardEntryView getMax;
    private View getMin;

    @UiThread
    public LeaderboardEntryView_ViewBinding(final LeaderboardEntryView leaderboardEntryView, View view) {
        this.getMax = leaderboardEntryView;
        leaderboardEntryView.clContainerLeaderboardEntry = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39242131362403, "field 'clContainerLeaderboardEntry'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f49482131363503, "field 'ivLeaderboardEntry' and method 'onClickEntry'");
        leaderboardEntryView.ivLeaderboardEntry = (ImageView) drawDividersHorizontal.getMin(max, R.id.f49482131363503, "field 'ivLeaderboardEntry'", ImageView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                leaderboardEntryView.onClickEntry();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        LeaderboardEntryView leaderboardEntryView = this.getMax;
        if (leaderboardEntryView != null) {
            this.getMax = null;
            leaderboardEntryView.clContainerLeaderboardEntry = null;
            leaderboardEntryView.ivLeaderboardEntry = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
