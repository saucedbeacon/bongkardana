package id.dana.referral.referraltracker.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ReferralTrackerItemsViewHolder_ViewBinding implements Unbinder {
    private ReferralTrackerItemsViewHolder setMin;

    @UiThread
    public ReferralTrackerItemsViewHolder_ViewBinding(ReferralTrackerItemsViewHolder referralTrackerItemsViewHolder, View view) {
        this.setMin = referralTrackerItemsViewHolder;
        referralTrackerItemsViewHolder.ivReferralTrackerActive = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50522131363607, "field 'ivReferralTrackerActive'", ImageView.class);
        referralTrackerItemsViewHolder.ivReferralTrackerRegister = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50542131363609, "field 'ivReferralTrackerRegister'", ImageView.class);
        referralTrackerItemsViewHolder.ivReferralTrackerReward = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50552131363610, "field 'ivReferralTrackerReward'", ImageView.class);
        referralTrackerItemsViewHolder.tvReferralTrackerActive = (TextView) drawDividersHorizontal.setMin(view, R.id.f68762131365503, "field 'tvReferralTrackerActive'", TextView.class);
        referralTrackerItemsViewHolder.tvReferralTrackerNickname = (TextView) drawDividersHorizontal.setMin(view, R.id.f68782131365505, "field 'tvReferralTrackerNickname'", TextView.class);
        referralTrackerItemsViewHolder.tvReferralTrackerPhoneNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68792131365506, "field 'tvReferralTrackerPhoneNumber'", TextView.class);
        referralTrackerItemsViewHolder.tvReferralTrackerRegister = (TextView) drawDividersHorizontal.setMin(view, R.id.f68802131365507, "field 'tvReferralTrackerRegister'", TextView.class);
        referralTrackerItemsViewHolder.tvReferralTrackerReward = (TextView) drawDividersHorizontal.setMin(view, R.id.f68812131365508, "field 'tvReferralTrackerReward'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        ReferralTrackerItemsViewHolder referralTrackerItemsViewHolder = this.setMin;
        if (referralTrackerItemsViewHolder != null) {
            this.setMin = null;
            referralTrackerItemsViewHolder.ivReferralTrackerActive = null;
            referralTrackerItemsViewHolder.ivReferralTrackerRegister = null;
            referralTrackerItemsViewHolder.ivReferralTrackerReward = null;
            referralTrackerItemsViewHolder.tvReferralTrackerActive = null;
            referralTrackerItemsViewHolder.tvReferralTrackerNickname = null;
            referralTrackerItemsViewHolder.tvReferralTrackerPhoneNumber = null;
            referralTrackerItemsViewHolder.tvReferralTrackerRegister = null;
            referralTrackerItemsViewHolder.tvReferralTrackerReward = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
