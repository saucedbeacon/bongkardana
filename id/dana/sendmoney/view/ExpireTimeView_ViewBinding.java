package id.dana.sendmoney.view;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.Group;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ExpireTimeView_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private ExpireTimeView setMin;

    @UiThread
    public ExpireTimeView_ViewBinding(final ExpireTimeView expireTimeView, View view) {
        this.setMin = expireTimeView;
        expireTimeView.groupChangeExpiry = (Group) drawDividersHorizontal.setMin(view, R.id.f44952131363030, "field 'groupChangeExpiry'", Group.class);
        expireTimeView.groupExpiryOption = (Group) drawDividersHorizontal.setMin(view, R.id.f39482131362427, "field 'groupExpiryOption'", Group.class);
        expireTimeView.rgExpiry = (RadioGroup) drawDividersHorizontal.setMin(view, R.id.rg_expiry, "field 'rgExpiry'", RadioGroup.class);
        expireTimeView.tvDescriptionExpire = (TextView) drawDividersHorizontal.setMin(view, R.id.tv_description_expire, "field 'tvDescriptionExpire'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.tv_done_change_expiry, "method 'doneChangeExpiry'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                expireTimeView.doneChangeExpiry();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.btn_change, "method 'changeExpiry'");
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                expireTimeView.changeExpiry();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        ExpireTimeView expireTimeView = this.setMin;
        if (expireTimeView != null) {
            this.setMin = null;
            expireTimeView.groupChangeExpiry = null;
            expireTimeView.groupExpiryOption = null;
            expireTimeView.rgExpiry = null;
            expireTimeView.tvDescriptionExpire = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
