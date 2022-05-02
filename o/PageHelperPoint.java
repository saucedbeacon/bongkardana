package o;

import android.view.View;
import id.dana.nearbyme.adapter.NearbyPromoAdapter;

public final class PageHelperPoint implements View.OnClickListener {
    private final NearbyPromoAdapter.ViewHolder setMin;

    public PageHelperPoint(NearbyPromoAdapter.ViewHolder viewHolder) {
        this.setMin = viewHolder;
    }

    public final void onClick(View view) {
        NearbyPromoAdapter.ViewHolder.setMax(this.setMin);
    }
}
