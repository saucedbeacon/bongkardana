package o;

import android.view.View;
import id.dana.richview.boundcard.BoundCardAdapter;
import id.dana.richview.boundcard.DanaCardViewHolder;

public final class CaptureService implements View.OnClickListener {
    private final BoundCardAdapter.setMin getMax;
    private final DanaCardViewHolder getMin;

    public CaptureService(DanaCardViewHolder danaCardViewHolder, BoundCardAdapter.setMin setmin) {
        this.getMin = danaCardViewHolder;
        this.getMax = setmin;
    }

    public final void onClick(View view) {
        DanaCardViewHolder.getMax(this.getMin, this.getMax, view);
    }
}
