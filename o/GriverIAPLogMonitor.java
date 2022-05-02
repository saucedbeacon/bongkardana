package o;

import java.util.List;
import kotlin.jvm.functions.Function1;

final class GriverIAPLogMonitor implements Function1 {
    private final GriverExtensionRegistry setMax;
    private final List setMin;

    public GriverIAPLogMonitor(GriverExtensionRegistry griverExtensionRegistry, List list) {
        this.setMax = griverExtensionRegistry;
        this.setMin = list;
    }

    public final Object invoke(Object obj) {
        return GriverExtensionRegistry.setMax(this.setMax, this.setMin, (List) obj);
    }
}
