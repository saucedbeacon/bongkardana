package o;

import id.dana.nearbyme.model.ShopModel;

final class scrollToItem implements getChildren {
    private final updateAdapter getMax;
    private final String length;

    public scrollToItem(updateAdapter updateadapter, String str) {
        this.getMax = updateadapter;
        this.length = str;
    }

    public final boolean test(Object obj) {
        return updateAdapter.getMin((ShopModel) obj, this.length);
    }
}
