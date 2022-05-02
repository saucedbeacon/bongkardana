package id.dana.splitbill.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.CurrencyTextView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SplitBillDetailsActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View getMin;
    private View length;
    private SplitBillDetailsActivity setMin;

    @UiThread
    public SplitBillDetailsActivity_ViewBinding(final SplitBillDetailsActivity splitBillDetailsActivity, View view) {
        super(splitBillDetailsActivity, view);
        this.setMin = splitBillDetailsActivity;
        splitBillDetailsActivity.llSplitBillDetails = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53782131363934, "field 'llSplitBillDetails'", LinearLayout.class);
        splitBillDetailsActivity.viewSplitBillNotPayer = drawDividersHorizontal.getMax(view, R.id.f73272131365962, "field 'viewSplitBillNotPayer'");
        splitBillDetailsActivity.ctvTotalAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41292131362615, "field 'ctvTotalAmount'", CurrencyTextView.class);
        splitBillDetailsActivity.ivBillStatus = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50892131363644, "field 'ivBillStatus'", ImageView.class);
        splitBillDetailsActivity.tvRemarks = (TextView) drawDividersHorizontal.setMin(view, R.id.f68862131365513, "field 'tvRemarks'", TextView.class);
        splitBillDetailsActivity.payerListView = (PayerListView) drawDividersHorizontal.setMin(view, R.id.f73282131365963, "field 'payerListView'", PayerListView.class);
        splitBillDetailsActivity.ctvPayAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41282131362614, "field 'ctvPayAmount'", CurrencyTextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f72822131365917, "field 'viewPayButton' and method 'onPayButtonClick'");
        splitBillDetailsActivity.viewPayButton = max;
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillDetailsActivity.onPayButtonClick();
            }
        });
        splitBillDetailsActivity.tvAmountTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f64792131365104, "field 'tvAmountTitle'", TextView.class);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36542131362106, "method 'onOkClick'");
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillDetailsActivity.onOkClick();
            }
        });
    }

    public final void setMax() {
        SplitBillDetailsActivity splitBillDetailsActivity = this.setMin;
        if (splitBillDetailsActivity != null) {
            this.setMin = null;
            splitBillDetailsActivity.llSplitBillDetails = null;
            splitBillDetailsActivity.viewSplitBillNotPayer = null;
            splitBillDetailsActivity.ctvTotalAmount = null;
            splitBillDetailsActivity.ivBillStatus = null;
            splitBillDetailsActivity.tvRemarks = null;
            splitBillDetailsActivity.payerListView = null;
            splitBillDetailsActivity.ctvPayAmount = null;
            splitBillDetailsActivity.viewPayButton = null;
            splitBillDetailsActivity.tvAmountTitle = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
