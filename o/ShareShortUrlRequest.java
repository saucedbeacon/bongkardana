package o;

import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class ShareShortUrlRequest implements Runnable {
    private final MerchantListAdapter.ViewHolder getMax;

    public ShareShortUrlRequest(MerchantListAdapter.ViewHolder viewHolder) {
        this.getMax = viewHolder;
    }

    public final void run() {
        MerchantListAdapter.ViewHolder.getMin(this.getMax);
    }
}
