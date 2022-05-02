package o;

import android.view.View;
import id.dana.sendmoney.recipient.recent.viewholder.CashoutAgentsViewHolder;
import o.Ignore;

public final class getRightText implements View.OnClickListener {
    private final CashoutAgentsViewHolder getMax;
    private final Ignore.setMin getMin;

    public getRightText(CashoutAgentsViewHolder cashoutAgentsViewHolder, Ignore.setMin setmin) {
        this.getMax = cashoutAgentsViewHolder;
        this.getMin = setmin;
    }

    public final void onClick(View view) {
        this.getMin.length(this.getMax.getAdapterPosition());
    }
}
