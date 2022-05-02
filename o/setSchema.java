package o;

import android.view.View;
import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class setSchema implements View.OnClickListener {
    private final MerchantListAdapter.ViewHolder getMin;
    private final setIcon setMin;

    public setSchema(MerchantListAdapter.ViewHolder viewHolder, setIcon seticon) {
        this.getMin = viewHolder;
        this.setMin = seticon;
    }

    public final void onClick(View view) {
        this.setMin.getMax(Integer.valueOf(this.getMin.getBindingAdapterPosition()));
    }
}
