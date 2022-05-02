package id.dana.splitbill.view;

import android.view.View;
import android.widget.Button;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.LogoProgressView;
import id.dana.richview.splitbill.AmountDisplayView;
import id.dana.richview.splitbill.BillPayerView;
import id.dana.sendmoney.remarks.NoteView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SplitBillActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SplitBillActivity getMin;
    private View length;

    @UiThread
    public SplitBillActivity_ViewBinding(final SplitBillActivity splitBillActivity, View view) {
        super(splitBillActivity, view);
        this.getMin = splitBillActivity;
        splitBillActivity.advSplitBill = (AmountDisplayView) drawDividersHorizontal.setMin(view, R.id.f34522131361886, "field 'advSplitBill'", AmountDisplayView.class);
        splitBillActivity.rvRemarks = (NoteView) drawDividersHorizontal.setMin(view, R.id.f59752131364560, "field 'rvRemarks'", NoteView.class);
        splitBillActivity.touchBlockerView = drawDividersHorizontal.getMax(view, R.id.f71212131365753, "field 'touchBlockerView'");
        splitBillActivity.logoProgressView = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f57112131364288, "field 'logoProgressView'", LogoProgressView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36852131362137, "field 'btnSplitBill' and method 'onSplitBillClicked'");
        splitBillActivity.btnSplitBill = (Button) drawDividersHorizontal.getMin(max, R.id.f36852131362137, "field 'btnSplitBill'", Button.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillActivity.onSplitBillClicked();
            }
        });
        splitBillActivity.bpvSelection = (BillPayerView) drawDividersHorizontal.setMin(view, R.id.f35232131361969, "field 'bpvSelection'", BillPayerView.class);
        splitBillActivity.vDimHeader = drawDividersHorizontal.getMax(view, R.id.f70932131365725, "field 'vDimHeader'");
        splitBillActivity.vDimBody = drawDividersHorizontal.getMax(view, R.id.f70922131365724, "field 'vDimBody'");
        splitBillActivity.sbpvPayers = (SplitBillPayersView) drawDividersHorizontal.setMin(view, R.id.f60182131364603, "field 'sbpvPayers'", SplitBillPayersView.class);
    }

    public final void setMax() {
        SplitBillActivity splitBillActivity = this.getMin;
        if (splitBillActivity != null) {
            this.getMin = null;
            splitBillActivity.advSplitBill = null;
            splitBillActivity.rvRemarks = null;
            splitBillActivity.touchBlockerView = null;
            splitBillActivity.logoProgressView = null;
            splitBillActivity.btnSplitBill = null;
            splitBillActivity.bpvSelection = null;
            splitBillActivity.vDimHeader = null;
            splitBillActivity.vDimBody = null;
            splitBillActivity.sbpvPayers = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
