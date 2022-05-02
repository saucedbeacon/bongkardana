package id.dana.pay;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PayActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private PayActivity getMin;
    private View length;
    private View setMin;
    private View toIntRange;

    @UiThread
    public PayActivity_ViewBinding(final PayActivity payActivity, View view) {
        super(payActivity, view);
        this.getMin = payActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f45782131363119, "method 'onClickHelp'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                payActivity.onClickHelp();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f72242131365859, "method 'openGuarantee'");
        this.setMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                payActivity.openGuarantee();
            }
        });
        View max3 = drawDividersHorizontal.getMax(view, R.id.f54272131363985, "method 'dismissActivity'");
        this.length = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                payActivity.dismissActivity();
            }
        });
        View max4 = drawDividersHorizontal.getMax(view, R.id.f41022131362588, "method 'dismissActivity'");
        this.toIntRange = max4;
        max4.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                payActivity.dismissActivity();
            }
        });
    }

    public final void setMax() {
        if (this.getMin != null) {
            this.getMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.toIntRange.setOnClickListener((View.OnClickListener) null);
            this.toIntRange = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
