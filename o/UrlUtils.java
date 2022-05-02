package o;

import java.util.List;
import java.util.Map;

final class UrlUtils implements RedDotDrawable {
    private final List setMax;

    public UrlUtils(List list) {
        this.setMax = list;
    }

    public final Object apply(Object obj) {
        return parseColorLong.lambda$getMenuItemForEachCategory$4(this.setMax, (Map) obj);
    }
}
