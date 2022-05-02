package o;

import java.util.Map;

final class parseDouble implements RedDotDrawable {
    private final Map getMax;
    private final parseColorLong setMin;

    public parseDouble(parseColorLong parsecolorlong, Map map) {
        this.setMin = parsecolorlong;
        this.getMax = map;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$deserializeToSendMoneyHomeMenuEntity$2(this.getMax, (Map.Entry) obj);
    }
}
