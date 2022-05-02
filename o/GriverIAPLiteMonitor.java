package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

final class GriverIAPLiteMonitor implements Function1 {
    private final GriverExtensionRegistry length;
    private final List setMin;

    public GriverIAPLiteMonitor(GriverExtensionRegistry griverExtensionRegistry, List list) {
        this.length = griverExtensionRegistry;
        this.setMin = list;
    }

    public final Object invoke(Object obj) {
        return GriverExtensionRegistry.getMin(this.length, this.setMin, (List) obj);
    }
}
