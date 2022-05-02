package o;

import android.view.View;
import id.dana.richview.splitbill.adapter.viewholder.RecentContactPayerViewHolder;
import id.dana.sendmoney.model.RecipientModel;

public final class isLive implements View.OnClickListener {
    private final RecentContactPayerViewHolder getMax;
    private final RecipientModel length;

    public isLive(RecentContactPayerViewHolder recentContactPayerViewHolder, RecipientModel recipientModel) {
        this.getMax = recentContactPayerViewHolder;
        this.length = recipientModel;
    }

    public final void onClick(View view) {
        RecentContactPayerViewHolder.length(this.getMax, this.length);
    }
}
