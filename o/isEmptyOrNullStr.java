package o;

import android.view.View;
import id.dana.sendmoney.contact.all.SendWithNewNumberViewHolder;

public final class isEmptyOrNullStr implements View.OnClickListener {
    private final SendWithNewNumberViewHolder getMax;

    public isEmptyOrNullStr(SendWithNewNumberViewHolder sendWithNewNumberViewHolder) {
        this.getMax = sendWithNewNumberViewHolder;
    }

    public final void onClick(View view) {
        SendWithNewNumberViewHolder.setMax(this.getMax);
    }
}
