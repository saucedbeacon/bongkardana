package o;

import java.util.List;
import java.util.Map;

final class parseInt implements RedDotDrawable {
    private final Map getMax;

    public parseInt(Map map) {
        this.getMax = map;
    }

    public final Object apply(Object obj) {
        return parseColorLong.lambda$convertJsonToMenuItem$0(this.getMax, (List) obj);
    }
}
