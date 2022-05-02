package o;

import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import o.g;

final class getCurrentItem implements getChildren {
    private final List getMax;
    private final updateAdapter getMin;

    public getCurrentItem(updateAdapter updateadapter, List list) {
        this.getMin = updateadapter;
        this.getMax = list;
    }

    public final boolean test(Object obj) {
        return updateAdapter.setMin((ShopModel) obj, (List<g.AnonymousClass1>) this.getMax);
    }
}
