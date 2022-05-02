package id.dana.ipg;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class IpgGuideActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private IpgGuideActivity length;
    private View setMin;

    @UiThread
    public IpgGuideActivity_ViewBinding(final IpgGuideActivity ipgGuideActivity, View view) {
        super(ipgGuideActivity, view);
        this.length = ipgGuideActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36702131362122, "method 'refuseRegisterIpg'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                ipgGuideActivity.refuseRegisterIpg();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36032131362049, "method 'agreeRegisterIpg'");
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                ipgGuideActivity.agreeRegisterIpg();
            }
        });
    }

    public final void setMax() {
        if (this.length != null) {
            this.length = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
