package o;

import kotlin.jvm.functions.Function1;

final class GriverEmptyMonitor implements Function1 {
    private final GriverExtensionRegistry setMax;

    public GriverEmptyMonitor(GriverExtensionRegistry griverExtensionRegistry) {
        this.setMax = griverExtensionRegistry;
    }

    public final Object invoke(Object obj) {
        return GriverExtensionRegistry.length(this.setMax, (Boolean) obj);
    }
}
