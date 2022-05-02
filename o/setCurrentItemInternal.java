package o;

import id.dana.nearbyme.model.ShopModel;
import java.util.Comparator;

final class setCurrentItemInternal implements Comparator {
    public static final setCurrentItemInternal getMax = new setCurrentItemInternal();

    public final int compare(Object obj, Object obj2) {
        return Double.compare(((ShopModel) obj).toFloatRange, ((ShopModel) obj2).toFloatRange);
    }
}
