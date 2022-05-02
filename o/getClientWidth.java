package o;

import id.dana.nearbyme.model.ShopModel;
import java.util.Comparator;

final class getClientWidth implements Comparator {
    private final updateAdapter getMin;

    public getClientWidth(updateAdapter updateadapter) {
        this.getMin = updateadapter;
    }

    public final int compare(Object obj, Object obj2) {
        return Double.compare(this.getMin.onPostMessage.getMax((ShopModel) obj2), this.getMin.onPostMessage.getMax((ShopModel) obj));
    }
}
