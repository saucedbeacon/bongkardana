package id.dana.pay;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.pay.view.BasePayView;
import id.dana.richview.ToggleBalanceView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BalanceQrisPayFragment_ViewBinding extends BasePayFragment_ViewBinding {
    private BalanceQrisPayFragment getMin;
    private View setMin;

    @UiThread
    public BalanceQrisPayFragment_ViewBinding(final BalanceQrisPayFragment balanceQrisPayFragment, View view) {
        super(balanceQrisPayFragment, view);
        this.getMin = balanceQrisPayFragment;
        balanceQrisPayFragment.payIdView = (TextView) drawDividersHorizontal.setMin(view, R.id.f56502131364221, "field 'payIdView'", TextView.class);
        balanceQrisPayFragment.qrBarcodePayView = (BasePayView) drawDividersHorizontal.setMin(view, R.id.f56562131364227, "field 'qrBarcodePayView'", BasePayView.class);
        balanceQrisPayFragment.tbvPayContent = (ToggleBalanceView) drawDividersHorizontal.setMin(view, R.id.tbv_pay_content, "field 'tbvPayContent'", ToggleBalanceView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.pay_topup_button, "method 'onClickTopup'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                balanceQrisPayFragment.onClickTopup();
            }
        });
    }

    public final void setMax() {
        BalanceQrisPayFragment balanceQrisPayFragment = this.getMin;
        if (balanceQrisPayFragment != null) {
            this.getMin = null;
            balanceQrisPayFragment.payIdView = null;
            balanceQrisPayFragment.qrBarcodePayView = null;
            balanceQrisPayFragment.tbvPayContent = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
