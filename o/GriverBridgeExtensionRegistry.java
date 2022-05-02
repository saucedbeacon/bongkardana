package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

final class GriverBridgeExtensionRegistry implements Function1 {
    private final GriverParams getMin;
    private final List setMin;

    public GriverBridgeExtensionRegistry(GriverParams griverParams, List list) {
        this.getMin = griverParams;
        this.setMin = list;
    }

    public final Object invoke(Object obj) {
        return GriverParams.setMax(this.getMin, this.setMin, (List) obj);
    }
}
