package id.dana.sendmoney.contact.all;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SendWithNewNumberViewHolder_ViewBinding implements Unbinder {
    private SendWithNewNumberViewHolder getMax;

    @UiThread
    public SendWithNewNumberViewHolder_ViewBinding(SendWithNewNumberViewHolder sendWithNewNumberViewHolder, View view) {
        this.getMax = sendWithNewNumberViewHolder;
        sendWithNewNumberViewHolder.tvPhoneNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68152131365442, "field 'tvPhoneNumber'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SendWithNewNumberViewHolder sendWithNewNumberViewHolder = this.getMax;
        if (sendWithNewNumberViewHolder != null) {
            this.getMax = null;
            sendWithNewNumberViewHolder.tvPhoneNumber = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
