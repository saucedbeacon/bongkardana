package id.dana.referral.referraltracker.viewholders;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ReferralDetailHeaderViewHolder_ViewBinding implements Unbinder {
    private View getMax;
    private ReferralDetailHeaderViewHolder length;

    @UiThread
    public ReferralDetailHeaderViewHolder_ViewBinding(final ReferralDetailHeaderViewHolder referralDetailHeaderViewHolder, View view) {
        this.length = referralDetailHeaderViewHolder;
        referralDetailHeaderViewHolder.tvReferralTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f68752131365502, "field 'tvReferralTitle'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f69182131365545, "field 'tvSeeHowItWorksHeader' and method 'doOpenHowItWorks'");
        referralDetailHeaderViewHolder.tvSeeHowItWorksHeader = (TextView) drawDividersHorizontal.getMin(max, R.id.f69182131365545, "field 'tvSeeHowItWorksHeader'", TextView.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                referralDetailHeaderViewHolder.doOpenHowItWorks();
            }
        });
        referralDetailHeaderViewHolder.btnReferralTracker = drawDividersHorizontal.setMin((Button) drawDividersHorizontal.setMin(view, R.id.f36682131362120, "field 'btnReferralTracker'", Button.class), (Button) drawDividersHorizontal.setMin(view, R.id.f36692131362121, "field 'btnReferralTracker'", Button.class));
    }

    @CallSuper
    public final void setMax() {
        ReferralDetailHeaderViewHolder referralDetailHeaderViewHolder = this.length;
        if (referralDetailHeaderViewHolder != null) {
            this.length = null;
            referralDetailHeaderViewHolder.tvReferralTitle = null;
            referralDetailHeaderViewHolder.tvSeeHowItWorksHeader = null;
            referralDetailHeaderViewHolder.btnReferralTracker = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
