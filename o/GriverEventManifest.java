package o;

import android.view.View;
import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class GriverEventManifest implements View.OnClickListener {
    private final MerchantListAdapter.ViewHolder getMin;
    private final setIcon setMax;

    public GriverEventManifest(MerchantListAdapter.ViewHolder viewHolder, setIcon seticon) {
        this.getMin = viewHolder;
        this.setMax = seticon;
    }

    public final void onClick(View view) {
        this.setMax.getMax(Integer.valueOf(this.getMin.getBindingAdapterPosition()));
    }
}
