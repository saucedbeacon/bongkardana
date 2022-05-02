package id.dana.promoquest.fragment;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class MissionListFragment_ViewBinding implements Unbinder {
    private MissionListFragment getMax;
    private View setMin;

    @UiThread
    public MissionListFragment_ViewBinding(final MissionListFragment missionListFragment, View view) {
        this.getMax = missionListFragment;
        View max = drawDividersHorizontal.getMax(view, R.id.f36932131362145, "method 'fetchMissions'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                missionListFragment.fetchMissions();
            }
        });
    }

    public final void setMax() {
        if (this.getMax != null) {
            this.getMax = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
