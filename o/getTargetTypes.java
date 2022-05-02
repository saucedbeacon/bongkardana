package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

final class getTargetTypes implements Function1 {
    private final Map getMax;
    private final getTargets length;
    private final String setMax;
    private final String setMin;

    public getTargetTypes(getTargets gettargets, Map map, String str, String str2) {
        this.length = gettargets;
        this.getMax = map;
        this.setMax = str;
        this.setMin = str2;
    }

    public final Object invoke(Object obj) {
        return getTargets.setMax(this.length, this.getMax, this.setMax, this.setMin);
    }
}
