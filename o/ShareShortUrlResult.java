package o;

import android.view.View;
import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class ShareShortUrlResult implements View.OnClickListener {
    private final setIcon setMax;
    private final MerchantListAdapter.ViewHolder setMin;

    public ShareShortUrlResult(MerchantListAdapter.ViewHolder viewHolder, setIcon seticon) {
        this.setMin = viewHolder;
        this.setMax = seticon;
    }

    public final void onClick(View view) {
        this.setMax.getMax(Integer.valueOf(this.setMin.getBindingAdapterPosition()));
    }
}
