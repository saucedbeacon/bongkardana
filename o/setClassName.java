package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

final class setClassName implements Function1 {
    private final GriverParams getMin;
    private final List setMin;

    public setClassName(GriverParams griverParams, List list) {
        this.getMin = griverParams;
        this.setMin = list;
    }

    public final Object invoke(Object obj) {
        return GriverParams.getMin(this.getMin, this.setMin, (List) obj);
    }
}
