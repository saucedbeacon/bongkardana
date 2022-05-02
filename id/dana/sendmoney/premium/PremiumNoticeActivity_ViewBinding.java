package id.dana.sendmoney.premium;

import android.view.View;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PremiumNoticeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PremiumNoticeActivity getMax;
    private View getMin;
    private View length;

    @UiThread
    public PremiumNoticeActivity_ViewBinding(final PremiumNoticeActivity premiumNoticeActivity, View view) {
        super(premiumNoticeActivity, view);
        this.getMax = premiumNoticeActivity;
        premiumNoticeActivity.clContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39192131362398, "field 'clContainer'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36992131362151, "method 'goToUpgradeProcess'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                premiumNoticeActivity.goToUpgradeProcess();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f37002131362152, "method 'applyUseCardPayMethod'");
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                premiumNoticeActivity.applyUseCardPayMethod();
            }
        });
    }

    public final void setMax() {
        PremiumNoticeActivity premiumNoticeActivity = this.getMax;
        if (premiumNoticeActivity != null) {
            this.getMax = null;
            premiumNoticeActivity.clContainer = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
