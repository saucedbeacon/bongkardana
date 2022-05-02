package o;

import kotlin.jvm.functions.Function1;

final class GriverACCommonMonitor implements Function1 {
    private final GriverExtensionRegistry length;

    public GriverACCommonMonitor(GriverExtensionRegistry griverExtensionRegistry) {
        this.length = griverExtensionRegistry;
    }

    public final Object invoke(Object obj) {
        return GriverExtensionRegistry.length(this.length, (Throwable) obj);
    }
}
