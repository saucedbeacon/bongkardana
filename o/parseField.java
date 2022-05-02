package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class parseField implements getAdapterPosition<NetworkUtils> {
    private final ApplicationModule getMax;
    private final b.C0007b<BaseRenderBridgeImpl> setMax;

    private parseField(ApplicationModule applicationModule, b.C0007b<BaseRenderBridgeImpl> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static parseField setMin(ApplicationModule applicationModule, b.C0007b<BaseRenderBridgeImpl> bVar) {
        return new parseField(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        NetworkUtils max = this.getMax.setMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
