package o;

import kotlin.jvm.functions.Function1;

final class GriverIAPCommonMonitor implements Function1 {
    private final GriverExtensionRegistry setMin;

    public GriverIAPCommonMonitor(GriverExtensionRegistry griverExtensionRegistry) {
        this.setMin = griverExtensionRegistry;
    }

    public final Object invoke(Object obj) {
        return GriverExtensionRegistry.getMax(this.setMin, (Throwable) obj);
    }
}
