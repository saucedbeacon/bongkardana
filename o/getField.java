package o;

import java.util.Map;

final class getField implements RedDotDrawable {
    private final Map setMax;
    private final invokeMethod setMin;

    public getField(invokeMethod invokemethod, Map map) {
        this.setMin = invokemethod;
        this.setMax = map;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$createMapIterable$1(this.setMax, (Map.Entry) obj);
    }
}
