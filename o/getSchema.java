package o;

import android.view.View;
import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class getSchema implements View.OnClickListener {
    private final setIcon getMin;
    private final MerchantListAdapter.ViewHolder setMax;

    public getSchema(MerchantListAdapter.ViewHolder viewHolder, setIcon seticon) {
        this.setMax = viewHolder;
        this.getMin = seticon;
    }

    public final void onClick(View view) {
        this.getMin.getMax(Integer.valueOf(this.setMax.getBindingAdapterPosition()));
    }
}
