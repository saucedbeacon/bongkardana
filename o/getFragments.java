package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class getFragments implements getAdapterPosition<setSelectedColor> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public getFragments(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final setSelectedColor get() {
        return provideHereTokenApi(this.module, this.builderProvider.get());
    }

    public static getFragments create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new getFragments(apiModule, bVar);
    }

    public static setSelectedColor provideHereTokenApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        setSelectedColor provideHereTokenApi = apiModule.provideHereTokenApi(getmin);
        if (provideHereTokenApi != null) {
            return provideHereTokenApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
