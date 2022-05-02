package id.dana.referral.referraltracker.viewholders;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ReferralDetailBodyViewHolder_ViewBinding implements Unbinder {
    private View equals;
    private View getMax;
    private View getMin;
    private View length;
    private ReferralDetailBodyViewHolder setMin;

    @UiThread
    public ReferralDetailBodyViewHolder_ViewBinding(final ReferralDetailBodyViewHolder referralDetailBodyViewHolder, View view) {
        this.setMin = referralDetailBodyViewHolder;
        referralDetailBodyViewHolder.tvReferralCode = (TextView) drawDividersHorizontal.setMin(view, R.id.f68712131365498, "field 'tvReferralCode'", TextView.class);
        referralDetailBodyViewHolder.tvReferralShareCode = (TextView) drawDividersHorizontal.setMin(view, R.id.f68732131365500, "field 'tvReferralShareCode'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36822131362134, "method 'doShareReferralCode'");
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                referralDetailBodyViewHolder.doShareReferralCode(view);
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f66742131365301, "method 'doOpenHowItWorks'");
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                referralDetailBodyViewHolder.doOpenHowItWorks();
            }
        });
        View max3 = drawDividersHorizontal.getMax(view, R.id.f36152131362064, "method 'doCopyReferral'");
        this.getMin = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                referralDetailBodyViewHolder.doCopyReferral();
            }
        });
        View max4 = drawDividersHorizontal.getMax(view, R.id.f50492131363604, "method 'doCopyReferralBox'");
        this.equals = max4;
        max4.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                referralDetailBodyViewHolder.doCopyReferralBox();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        ReferralDetailBodyViewHolder referralDetailBodyViewHolder = this.setMin;
        if (referralDetailBodyViewHolder != null) {
            this.setMin = null;
            referralDetailBodyViewHolder.tvReferralCode = null;
            referralDetailBodyViewHolder.tvReferralShareCode = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.equals.setOnClickListener((View.OnClickListener) null);
            this.equals = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
