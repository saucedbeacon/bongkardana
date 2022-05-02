package id.dana.sendmoney.bank.all;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SendWithNewAccountNumberViewHolder_ViewBinding implements Unbinder {
    private SendWithNewAccountNumberViewHolder setMin;

    @UiThread
    public SendWithNewAccountNumberViewHolder_ViewBinding(SendWithNewAccountNumberViewHolder sendWithNewAccountNumberViewHolder, View view) {
        this.setMin = sendWithNewAccountNumberViewHolder;
        sendWithNewAccountNumberViewHolder.tvAccountNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f64542131365079, "field 'tvAccountNumber'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SendWithNewAccountNumberViewHolder sendWithNewAccountNumberViewHolder = this.setMin;
        if (sendWithNewAccountNumberViewHolder != null) {
            this.setMin = null;
            sendWithNewAccountNumberViewHolder.tvAccountNumber = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
