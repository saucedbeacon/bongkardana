package o;

import id.dana.nearbyme.adapter.MerchantListAdapter;

public final class BaseOutShareItem implements setIcon {
    private final MerchantListAdapter setMin;

    public BaseOutShareItem(MerchantListAdapter merchantListAdapter) {
        this.setMin = merchantListAdapter;
    }

    public final void getMax(Object obj) {
        this.setMin.setMax.getMax(((Integer) obj).intValue());
    }
}
