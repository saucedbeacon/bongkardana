package id.dana.richview.splitbill;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import o.drawDividersHorizontal;

public class AmountDisplayView_ViewBinding implements Unbinder {
    private AmountDisplayView length;

    @UiThread
    public AmountDisplayView_ViewBinding(AmountDisplayView amountDisplayView, View view) {
        this.length = amountDisplayView;
        amountDisplayView.ctvAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41262131362612, "field 'ctvAmount'", CurrencyTextView.class);
        amountDisplayView.tvRemainingAmount = (TextView) drawDividersHorizontal.setMin(view, R.id.f68842131365511, "field 'tvRemainingAmount'", TextView.class);
        amountDisplayView.btnChange = (Button) drawDividersHorizontal.setMin(view, R.id.btn_change, "field 'btnChange'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        AmountDisplayView amountDisplayView = this.length;
        if (amountDisplayView != null) {
            this.length = null;
            amountDisplayView.ctvAmount = null;
            amountDisplayView.tvRemainingAmount = null;
            amountDisplayView.btnChange = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
