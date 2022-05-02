package o;

import android.view.View;
import id.dana.richview.boundcard.BoundCardAdapter;
import id.dana.richview.boundcard.DebitCardViewHolder;

public final class notifyAction implements View.OnClickListener {
    private final BoundCardAdapter.setMin getMax;
    private final DebitCardViewHolder length;

    public notifyAction(DebitCardViewHolder debitCardViewHolder, BoundCardAdapter.setMin setmin) {
        this.length = debitCardViewHolder;
        this.getMax = setmin;
    }

    public final void onClick(View view) {
        DebitCardViewHolder.length(this.length, this.getMax, view);
    }
}
