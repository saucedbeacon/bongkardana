package id.dana.tncagreement;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseWebViewActivity_ViewBinding;
import id.dana.richview.WebProgressView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class TermsAndConditionsActivity_ViewBinding extends BaseWebViewActivity_ViewBinding {
    private TermsAndConditionsActivity getMin;
    private View length;

    @UiThread
    public TermsAndConditionsActivity_ViewBinding(final TermsAndConditionsActivity termsAndConditionsActivity, View view) {
        super(termsAndConditionsActivity, view);
        this.getMin = termsAndConditionsActivity;
        termsAndConditionsActivity.cbTncAgreement = (CheckBox) drawDividersHorizontal.setMin(view, R.id.f37792131362234, "field 'cbTncAgreement'", CheckBox.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36032131362049, "field 'btnAgree' and method 'onAgreeClicked'");
        termsAndConditionsActivity.btnAgree = (Button) drawDividersHorizontal.getMin(max, R.id.f36032131362049, "field 'btnAgree'", Button.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                termsAndConditionsActivity.onAgreeClicked();
            }
        });
        termsAndConditionsActivity.viewWebProgress = (WebProgressView) drawDividersHorizontal.setMin(view, R.id.f73552131365990, "field 'viewWebProgress'", WebProgressView.class);
    }

    public final void setMax() {
        TermsAndConditionsActivity termsAndConditionsActivity = this.getMin;
        if (termsAndConditionsActivity != null) {
            this.getMin = null;
            termsAndConditionsActivity.cbTncAgreement = null;
            termsAndConditionsActivity.btnAgree = null;
            termsAndConditionsActivity.viewWebProgress = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
