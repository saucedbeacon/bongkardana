package id.dana.tncsummary;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.WebProgressView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class TncSummaryActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private View getMin;
    private TncSummaryActivity setMin;

    @UiThread
    public TncSummaryActivity_ViewBinding(final TncSummaryActivity tncSummaryActivity, View view) {
        super(tncSummaryActivity, view);
        this.setMin = tncSummaryActivity;
        tncSummaryActivity.wpvDialogTnc = (WebProgressView) drawDividersHorizontal.setMin(view, R.id.f73982131366034, "field 'wpvDialogTnc'", WebProgressView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f37702131362225, "field 'cbDialogTnc' and method 'onCheckboxChanged'");
        tncSummaryActivity.cbDialogTnc = (CheckBox) drawDividersHorizontal.getMin(max, R.id.f37702131362225, "field 'cbDialogTnc'", CheckBox.class);
        this.getMax = max;
        ((CompoundButton) max).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                tncSummaryActivity.onCheckboxChanged(z);
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36242131362073, "field 'btnDialogTncAgree' and method 'onDialogTncAgree'");
        tncSummaryActivity.btnDialogTncAgree = (Button) drawDividersHorizontal.getMin(max2, R.id.f36242131362073, "field 'btnDialogTncAgree'", Button.class);
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                tncSummaryActivity.onDialogTncAgree();
            }
        });
        tncSummaryActivity.tvDialogTncAgreement = (TextView) drawDividersHorizontal.setMin(view, R.id.f65802131365206, "field 'tvDialogTncAgreement'", TextView.class);
        tncSummaryActivity.tvDialogTncError = (TextView) drawDividersHorizontal.setMin(view, R.id.f65812131365207, "field 'tvDialogTncError'", TextView.class);
        tncSummaryActivity.pbDialogTnc = (ProgressBar) drawDividersHorizontal.setMin(view, R.id.f56602131364232, "field 'pbDialogTnc'", ProgressBar.class);
        tncSummaryActivity.clContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40422131362522, "field 'clContainer'", ConstraintLayout.class);
    }

    public final void setMax() {
        TncSummaryActivity tncSummaryActivity = this.setMin;
        if (tncSummaryActivity != null) {
            this.setMin = null;
            tncSummaryActivity.wpvDialogTnc = null;
            tncSummaryActivity.cbDialogTnc = null;
            tncSummaryActivity.btnDialogTncAgree = null;
            tncSummaryActivity.tvDialogTncAgreement = null;
            tncSummaryActivity.tvDialogTncError = null;
            tncSummaryActivity.pbDialogTnc = null;
            tncSummaryActivity.clContainer = null;
            ((CompoundButton) this.getMax).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            this.getMax = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
