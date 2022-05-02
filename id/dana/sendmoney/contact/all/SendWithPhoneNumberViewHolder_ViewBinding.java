package id.dana.sendmoney.contact.all;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class SendWithPhoneNumberViewHolder_ViewBinding implements Unbinder {
    private SendWithPhoneNumberViewHolder setMin;

    @UiThread
    public SendWithPhoneNumberViewHolder_ViewBinding(SendWithPhoneNumberViewHolder sendWithPhoneNumberViewHolder, View view) {
        this.setMin = sendWithPhoneNumberViewHolder;
        sendWithPhoneNumberViewHolder.rlAdd = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58172131364399, "field 'rlAdd'", RelativeLayout.class);
        sendWithPhoneNumberViewHolder.tvAddNew = (TextView) drawDividersHorizontal.setMin(view, R.id.f64612131365086, "field 'tvAddNew'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SendWithPhoneNumberViewHolder sendWithPhoneNumberViewHolder = this.setMin;
        if (sendWithPhoneNumberViewHolder != null) {
            this.setMin = null;
            sendWithPhoneNumberViewHolder.rlAdd = null;
            sendWithPhoneNumberViewHolder.tvAddNew = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
