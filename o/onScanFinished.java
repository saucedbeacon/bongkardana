package o;

import android.view.View;
import id.dana.richview.boundcard.AddCardTextViewHolder;
import id.dana.richview.boundcard.BoundCardAdapter;

public final class onScanFinished implements View.OnClickListener {
    private final AddCardTextViewHolder length;
    private final BoundCardAdapter.setMin setMin;

    public onScanFinished(AddCardTextViewHolder addCardTextViewHolder, BoundCardAdapter.setMin setmin) {
        this.length = addCardTextViewHolder;
        this.setMin = setmin;
    }

    public final void onClick(View view) {
        AddCardTextViewHolder.setMin(this.length, this.setMin, view);
    }
}
