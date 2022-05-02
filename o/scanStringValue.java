package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanStringValue implements getAdapterPosition<GriverFileAbilityImpl> {
    private final b.C0007b<DebugPanelBridgeExtension> getMax;
    private final ApplicationModule getMin;

    private scanStringValue(ApplicationModule applicationModule, b.C0007b<DebugPanelBridgeExtension> bVar) {
        this.getMin = applicationModule;
        this.getMax = bVar;
    }

    public static scanStringValue setMin(ApplicationModule applicationModule, b.C0007b<DebugPanelBridgeExtension> bVar) {
        return new scanStringValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverFileAbilityImpl length = this.getMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
