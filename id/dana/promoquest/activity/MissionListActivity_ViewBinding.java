package id.dana.promoquest.activity;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class MissionListActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View length;
    private MissionListActivity setMin;

    @UiThread
    public MissionListActivity_ViewBinding(final MissionListActivity missionListActivity, View view) {
        super(missionListActivity, view);
        this.setMin = missionListActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f52182131363774, "method 'closeToHome'");
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                missionListActivity.closeToHome();
            }
        });
    }

    public final void setMax() {
        if (this.setMin != null) {
            this.setMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
