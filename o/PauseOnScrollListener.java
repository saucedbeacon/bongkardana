package o;

import android.view.View;
import id.dana.sendmoney.contact.all.NoRecentBankViewHolder;
import o.Ignore;

public final class PauseOnScrollListener implements View.OnClickListener {
    private final NoRecentBankViewHolder getMin;
    private final Ignore.setMin setMax;

    public PauseOnScrollListener(NoRecentBankViewHolder noRecentBankViewHolder, Ignore.setMin setmin) {
        this.getMin = noRecentBankViewHolder;
        this.setMax = setmin;
    }

    public final void onClick(View view) {
        this.setMax.length(this.getMin.getAdapterPosition());
    }
}
