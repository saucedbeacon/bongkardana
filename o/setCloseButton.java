package o;

import android.view.View;
import id.dana.referral.referraltracker.viewholders.ReferralDetailHeaderViewHolder;

public final class setCloseButton implements View.OnClickListener {
    private final ReferralDetailHeaderViewHolder getMax;
    private final handlePerformanceLog setMin;

    public setCloseButton(ReferralDetailHeaderViewHolder referralDetailHeaderViewHolder, handlePerformanceLog handleperformancelog) {
        this.getMax = referralDetailHeaderViewHolder;
        this.setMin = handleperformancelog;
    }

    public final void onClick(View view) {
        ReferralDetailHeaderViewHolder.setMax();
    }
}
