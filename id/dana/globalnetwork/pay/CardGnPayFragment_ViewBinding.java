package id.dana.globalnetwork.pay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.pay.BasePayFragment_ViewBinding;
import o.drawDividersHorizontal;

public class CardGnPayFragment_ViewBinding extends BasePayFragment_ViewBinding {
    private CardGnPayFragment getMin;

    @UiThread
    public CardGnPayFragment_ViewBinding(CardGnPayFragment cardGnPayFragment, View view) {
        super(cardGnPayFragment, view);
        this.getMin = cardGnPayFragment;
        cardGnPayFragment.qrBarcodePayView = (GnBarcodePayView) drawDividersHorizontal.setMin(view, R.id.f56562131364227, "field 'qrBarcodePayView'", GnBarcodePayView.class);
        cardGnPayFragment.referenceText = (TextView) drawDividersHorizontal.setMin(view, R.id.f68692131365496, "field 'referenceText'", TextView.class);
        cardGnPayFragment.tvFromCurrencySymbol = (TextView) drawDividersHorizontal.setMin(view, R.id.f66412131365268, "field 'tvFromCurrencySymbol'", TextView.class);
        cardGnPayFragment.fromCurrencyText = (TextView) drawDividersHorizontal.setMin(view, R.id.f66382131365265, "field 'fromCurrencyText'", TextView.class);
        cardGnPayFragment.toCurrencyText = (TextView) drawDividersHorizontal.setMin(view, R.id.f70052131365635, "field 'toCurrencyText'", TextView.class);
        cardGnPayFragment.rightArrowCurrency = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50612131363616, "field 'rightArrowCurrency'", ImageView.class);
        cardGnPayFragment.tvCurrencyRp = (TextView) drawDividersHorizontal.setMin(view, R.id.f69972131365627, "field 'tvCurrencyRp'", TextView.class);
    }

    public final void setMax() {
        CardGnPayFragment cardGnPayFragment = this.getMin;
        if (cardGnPayFragment != null) {
            this.getMin = null;
            cardGnPayFragment.qrBarcodePayView = null;
            cardGnPayFragment.referenceText = null;
            cardGnPayFragment.tvFromCurrencySymbol = null;
            cardGnPayFragment.fromCurrencyText = null;
            cardGnPayFragment.toCurrencyText = null;
            cardGnPayFragment.rightArrowCurrency = null;
            cardGnPayFragment.tvCurrencyRp = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
