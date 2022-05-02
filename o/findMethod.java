package o;

import java.util.List;
import java.util.Map;

final class findMethod implements RedDotDrawable {
    private final Map setMin;

    public findMethod(Map map) {
        this.setMin = map;
    }

    public final Object apply(Object obj) {
        return invokeMethod.lambda$createMapIterable$2(this.setMin, (List) obj);
    }
}
