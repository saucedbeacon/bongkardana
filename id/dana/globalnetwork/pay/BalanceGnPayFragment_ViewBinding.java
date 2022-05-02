package id.dana.globalnetwork.pay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.pay.BasePayFragment_ViewBinding;
import id.dana.richview.ToggleBalanceView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BalanceGnPayFragment_ViewBinding extends BasePayFragment_ViewBinding {
    private BalanceGnPayFragment length;
    private View setMin;

    @UiThread
    public BalanceGnPayFragment_ViewBinding(final BalanceGnPayFragment balanceGnPayFragment, View view) {
        super(balanceGnPayFragment, view);
        this.length = balanceGnPayFragment;
        balanceGnPayFragment.qrBarcodePayView = (GnBarcodePayView) drawDividersHorizontal.setMin(view, R.id.f56562131364227, "field 'qrBarcodePayView'", GnBarcodePayView.class);
        balanceGnPayFragment.tvFromCurrencySymbol = (TextView) drawDividersHorizontal.setMin(view, R.id.f66412131365268, "field 'tvFromCurrencySymbol'", TextView.class);
        balanceGnPayFragment.toCurrencyText = (TextView) drawDividersHorizontal.setMin(view, R.id.f70052131365635, "field 'toCurrencyText'", TextView.class);
        balanceGnPayFragment.clGnCardInfo = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f39132131362392, "field 'clGnCardInfo'", ConstraintLayout.class);
        balanceGnPayFragment.ivFlag = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48972131363452, "field 'ivFlag'", ImageView.class);
        balanceGnPayFragment.tbvPayContent = (ToggleBalanceView) drawDividersHorizontal.setMin(view, R.id.tbv_pay_content, "field 'tbvPayContent'", ToggleBalanceView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.pay_topup_button, "method 'onClickTopup'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                balanceGnPayFragment.onClickTopup();
            }
        });
    }

    public final void setMax() {
        BalanceGnPayFragment balanceGnPayFragment = this.length;
        if (balanceGnPayFragment != null) {
            this.length = null;
            balanceGnPayFragment.qrBarcodePayView = null;
            balanceGnPayFragment.tvFromCurrencySymbol = null;
            balanceGnPayFragment.toCurrencyText = null;
            balanceGnPayFragment.clGnCardInfo = null;
            balanceGnPayFragment.ivFlag = null;
            balanceGnPayFragment.tbvPayContent = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
