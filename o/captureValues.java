package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

final class captureValues implements Function1 {
    private final String getMax;
    private final String length;
    private final Map setMax;
    private final getTargets setMin;

    public captureValues(getTargets gettargets, Map map, String str, String str2) {
        this.setMin = gettargets;
        this.setMax = map;
        this.length = str;
        this.getMax = str2;
    }

    public final Object invoke(Object obj) {
        return getTargets.length(this.setMin, this.setMax, this.length, this.getMax, (clearExpired) obj);
    }
}
