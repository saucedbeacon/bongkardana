package id.dana.splitbill.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.socialshare.SocialShareView;
import o.drawDividersHorizontal;

public class SplitBillSummaryActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SplitBillSummaryActivity setMin;

    @UiThread
    public SplitBillSummaryActivity_ViewBinding(SplitBillSummaryActivity splitBillSummaryActivity, View view) {
        super(splitBillSummaryActivity, view);
        this.setMin = splitBillSummaryActivity;
        splitBillSummaryActivity.llBillDetailEmptyState = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53792131363935, "field 'llBillDetailEmptyState'", LinearLayout.class);
        splitBillSummaryActivity.llSplitBillDetails = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53782131363934, "field 'llSplitBillDetails'", LinearLayout.class);
        splitBillSummaryActivity.ivSplitBillStatus = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50892131363644, "field 'ivSplitBillStatus'", ImageView.class);
        splitBillSummaryActivity.ctvTotalAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41292131362615, "field 'ctvTotalAmount'", CurrencyTextView.class);
        splitBillSummaryActivity.tvRemarks = (TextView) drawDividersHorizontal.setMin(view, R.id.f68862131365513, "field 'tvRemarks'", TextView.class);
        splitBillSummaryActivity.payerListView = (PayerListView) drawDividersHorizontal.setMin(view, R.id.f73282131365963, "field 'payerListView'", PayerListView.class);
        splitBillSummaryActivity.ssvSplitBill = (SocialShareView) drawDividersHorizontal.setMin(view, R.id.f61082131364706, "field 'ssvSplitBill'", SocialShareView.class);
        splitBillSummaryActivity.vDimBody = drawDividersHorizontal.getMax(view, R.id.f70922131365724, "field 'vDimBody'");
        splitBillSummaryActivity.nsvSplitBillSummary = (NestedScrollView) drawDividersHorizontal.setMin(view, R.id.f56142131364180, "field 'nsvSplitBillSummary'", NestedScrollView.class);
    }

    public final void setMax() {
        SplitBillSummaryActivity splitBillSummaryActivity = this.setMin;
        if (splitBillSummaryActivity != null) {
            this.setMin = null;
            splitBillSummaryActivity.llBillDetailEmptyState = null;
            splitBillSummaryActivity.llSplitBillDetails = null;
            splitBillSummaryActivity.ivSplitBillStatus = null;
            splitBillSummaryActivity.ctvTotalAmount = null;
            splitBillSummaryActivity.tvRemarks = null;
            splitBillSummaryActivity.payerListView = null;
            splitBillSummaryActivity.ssvSplitBill = null;
            splitBillSummaryActivity.vDimBody = null;
            splitBillSummaryActivity.nsvSplitBillSummary = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
