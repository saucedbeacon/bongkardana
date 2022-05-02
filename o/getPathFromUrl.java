package o;

import kotlin.jvm.functions.Function1;

final class getPathFromUrl implements Function1 {
    private final GriverExtensionRegistry getMin;

    public getPathFromUrl(GriverExtensionRegistry griverExtensionRegistry) {
        this.getMin = griverExtensionRegistry;
    }

    public final Object invoke(Object obj) {
        return GriverExtensionRegistry.setMin(this.getMin, (Throwable) obj);
    }
}
