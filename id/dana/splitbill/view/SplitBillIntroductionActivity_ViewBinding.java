package id.dana.splitbill.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SplitBillIntroductionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMax;
    private View getMin;
    private SplitBillIntroductionActivity setMin;

    @UiThread
    public SplitBillIntroductionActivity_ViewBinding(final SplitBillIntroductionActivity splitBillIntroductionActivity, View view) {
        super(splitBillIntroductionActivity, view);
        this.setMin = splitBillIntroductionActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36862131362138, "field 'btnSplitBillEntry' and method 'onSplitBillEntryButtonClick'");
        splitBillIntroductionActivity.btnSplitBillEntry = (Button) drawDividersHorizontal.getMin(max, R.id.f36862131362138, "field 'btnSplitBillEntry'", Button.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillIntroductionActivity.onSplitBillEntryButtonClick();
            }
        });
        splitBillIntroductionActivity.sbhvBillHistories = (SplitBillHistoryView) drawDividersHorizontal.setMin(view, R.id.f60172131364602, "field 'sbhvBillHistories'", SplitBillHistoryView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f58042131364386, "field 'rightButton' and method 'onHelpClick'");
        splitBillIntroductionActivity.rightButton = (TextView) drawDividersHorizontal.getMin(max2, R.id.f58042131364386, "field 'rightButton'", TextView.class);
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillIntroductionActivity.onHelpClick();
            }
        });
    }

    public final void setMax() {
        SplitBillIntroductionActivity splitBillIntroductionActivity = this.setMin;
        if (splitBillIntroductionActivity != null) {
            this.setMin = null;
            splitBillIntroductionActivity.btnSplitBillEntry = null;
            splitBillIntroductionActivity.sbhvBillHistories = null;
            splitBillIntroductionActivity.rightButton = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
