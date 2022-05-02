package id.dana.referral.referraltracker.viewholders;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ReferralTrackerEmptyViewHolder_ViewBinding implements Unbinder {
    private ReferralTrackerEmptyViewHolder getMin;

    @UiThread
    public ReferralTrackerEmptyViewHolder_ViewBinding(ReferralTrackerEmptyViewHolder referralTrackerEmptyViewHolder, View view) {
        this.getMin = referralTrackerEmptyViewHolder;
        referralTrackerEmptyViewHolder.ivReferralTrackerEmpty = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50532131363608, "field 'ivReferralTrackerEmpty'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        ReferralTrackerEmptyViewHolder referralTrackerEmptyViewHolder = this.getMin;
        if (referralTrackerEmptyViewHolder != null) {
            this.getMin = null;
            referralTrackerEmptyViewHolder.ivReferralTrackerEmpty = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
