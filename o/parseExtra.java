package o;

import id.dana.di.modules.ApplicationModule;
import o.OpenAPIBridgeExtension;
import o.b;

public final class parseExtra implements getAdapterPosition<OpenAPIBridgeExtension.AnonymousClass1.C00041> {
    private final ApplicationModule getMax;
    private final b.C0007b<getChannelId> getMin;

    private parseExtra(ApplicationModule applicationModule, b.C0007b<getChannelId> bVar) {
        this.getMax = applicationModule;
        this.getMin = bVar;
    }

    public static parseExtra setMax(ApplicationModule applicationModule, b.C0007b<getChannelId> bVar) {
        return new parseExtra(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        OpenAPIBridgeExtension.AnonymousClass1.C00041 max = this.getMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
