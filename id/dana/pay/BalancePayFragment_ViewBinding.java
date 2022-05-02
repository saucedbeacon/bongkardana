package id.dana.pay;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.pay.view.QrBarcodePayView;
import id.dana.richview.ToggleBalanceView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BalancePayFragment_ViewBinding extends BasePayFragment_ViewBinding {
    private BalancePayFragment getMax;
    private View getMin;

    @UiThread
    public BalancePayFragment_ViewBinding(final BalancePayFragment balancePayFragment, View view) {
        super(balancePayFragment, view);
        this.getMax = balancePayFragment;
        balancePayFragment.tbvPayContent = (ToggleBalanceView) drawDividersHorizontal.setMin(view, R.id.tbv_pay_content, "field 'tbvPayContent'", ToggleBalanceView.class);
        balancePayFragment.payIdView = (TextView) drawDividersHorizontal.setMin(view, R.id.f56502131364221, "field 'payIdView'", TextView.class);
        balancePayFragment.qrBarcodePayView = (QrBarcodePayView) drawDividersHorizontal.setMin(view, R.id.f56562131364227, "field 'qrBarcodePayView'", QrBarcodePayView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.pay_topup_button, "method 'onClickTopup'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                balancePayFragment.onClickTopup();
            }
        });
    }

    public final void setMax() {
        BalancePayFragment balancePayFragment = this.getMax;
        if (balancePayFragment != null) {
            this.getMax = null;
            balancePayFragment.tbvPayContent = null;
            balancePayFragment.payIdView = null;
            balancePayFragment.qrBarcodePayView = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
