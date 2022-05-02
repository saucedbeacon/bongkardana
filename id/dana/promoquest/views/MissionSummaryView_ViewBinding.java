package id.dana.promoquest.views;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class MissionSummaryView_ViewBinding implements Unbinder {
    private View getMin;
    private MissionSummaryView length;

    @UiThread
    public MissionSummaryView_ViewBinding(final MissionSummaryView missionSummaryView, View view) {
        this.length = missionSummaryView;
        View max = drawDividersHorizontal.getMax(view, R.id.f37062131362158, "method 'onViewAllClicked'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                missionSummaryView.onViewAllClicked();
            }
        });
    }

    public final void setMax() {
        if (this.length != null) {
            this.length = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
