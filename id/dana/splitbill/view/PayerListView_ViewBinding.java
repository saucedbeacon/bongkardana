package id.dana.splitbill.view;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class PayerListView_ViewBinding implements Unbinder {
    private PayerListView getMin;

    @UiThread
    public PayerListView_ViewBinding(PayerListView payerListView, View view) {
        this.getMin = payerListView;
        payerListView.tvClosePayer = (TextView) drawDividersHorizontal.setMin(view, R.id.f65202131365145, "field 'tvClosePayer'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        PayerListView payerListView = this.getMin;
        if (payerListView != null) {
            this.getMin = null;
            payerListView.tvClosePayer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
