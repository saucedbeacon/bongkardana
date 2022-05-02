package id.dana.globalnetwork.currency;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class CurrencySwitchRichView_ViewBinding implements Unbinder {
    private CurrencySwitchRichView length;

    @UiThread
    public CurrencySwitchRichView_ViewBinding(CurrencySwitchRichView currencySwitchRichView, View view) {
        this.length = currencySwitchRichView;
        currencySwitchRichView.thumbLayout = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f62052131364817, "field 'thumbLayout'", ConstraintLayout.class);
        currencySwitchRichView.trackLayout = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f62622131364880, "field 'trackLayout'", ConstraintLayout.class);
        currencySwitchRichView.tvCurrency = (TextView) drawDividersHorizontal.setMin(view, R.id.f65382131365163, "field 'tvCurrency'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        CurrencySwitchRichView currencySwitchRichView = this.length;
        if (currencySwitchRichView != null) {
            this.length = null;
            currencySwitchRichView.thumbLayout = null;
            currencySwitchRichView.trackLayout = null;
            currencySwitchRichView.tvCurrency = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
