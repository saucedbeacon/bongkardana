package o;

import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import o.k;

final class setCurrentItem implements getChildren {
    private final List getMin;
    private final List length;

    public setCurrentItem(List list, List list2) {
        this.getMin = list;
        this.length = list2;
    }

    public final boolean test(Object obj) {
        return k.AnonymousClass2.length((ShopModel) obj, this.getMin, this.length);
    }
}
