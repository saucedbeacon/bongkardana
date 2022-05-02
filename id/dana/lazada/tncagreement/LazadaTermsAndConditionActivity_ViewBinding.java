package id.dana.lazada.tncagreement;

import android.view.View;
import android.widget.Button;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseWebViewActivity_ViewBinding;
import id.dana.richview.WebProgressView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class LazadaTermsAndConditionActivity_ViewBinding extends BaseWebViewActivity_ViewBinding {
    private LazadaTermsAndConditionActivity length;
    private View setMin;

    @UiThread
    public LazadaTermsAndConditionActivity_ViewBinding(final LazadaTermsAndConditionActivity lazadaTermsAndConditionActivity, View view) {
        super(lazadaTermsAndConditionActivity, view);
        this.length = lazadaTermsAndConditionActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36402131362090, "field 'btnAgree' and method 'onAgreeCliecked'");
        lazadaTermsAndConditionActivity.btnAgree = (Button) drawDividersHorizontal.getMin(max, R.id.f36402131362090, "field 'btnAgree'", Button.class);
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                lazadaTermsAndConditionActivity.onAgreeCliecked();
            }
        });
        lazadaTermsAndConditionActivity.viewWebProgress = (WebProgressView) drawDividersHorizontal.setMin(view, R.id.f73552131365990, "field 'viewWebProgress'", WebProgressView.class);
    }

    public final void setMax() {
        LazadaTermsAndConditionActivity lazadaTermsAndConditionActivity = this.length;
        if (lazadaTermsAndConditionActivity != null) {
            this.length = null;
            lazadaTermsAndConditionActivity.btnAgree = null;
            lazadaTermsAndConditionActivity.viewWebProgress = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
