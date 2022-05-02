package id.dana.ipg.tncagreement;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseWebViewActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class IpgTermsAndConditionActivity_ViewBinding extends BaseWebViewActivity_ViewBinding {
    private View getMin;
    private IpgTermsAndConditionActivity setMin;

    @UiThread
    public IpgTermsAndConditionActivity_ViewBinding(final IpgTermsAndConditionActivity ipgTermsAndConditionActivity, View view) {
        super(ipgTermsAndConditionActivity, view);
        this.setMin = ipgTermsAndConditionActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36382131362088, "method 'onAgreeClicked'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                ipgTermsAndConditionActivity.onAgreeClicked();
            }
        });
    }

    public final void setMax() {
        if (this.setMin != null) {
            this.setMin = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
