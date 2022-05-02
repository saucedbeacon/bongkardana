package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class attachFragment implements getAdapterPosition<isDebugPanelExists> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public attachFragment(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final isDebugPanelExists get() {
        return provideProductInfoFacade(this.module, this.builderProvider.get());
    }

    public static attachFragment create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new attachFragment(apiModule, bVar);
    }

    public static isDebugPanelExists provideProductInfoFacade(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        isDebugPanelExists provideProductInfoFacade = apiModule.provideProductInfoFacade(getmin);
        if (provideProductInfoFacade != null) {
            return provideProductInfoFacade;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
