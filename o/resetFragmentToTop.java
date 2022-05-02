package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class resetFragmentToTop implements getAdapterPosition<setBadgeColor> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public resetFragmentToTop(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final setBadgeColor get() {
        return provideHereLookupById(this.module, this.builderProvider.get());
    }

    public static resetFragmentToTop create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new resetFragmentToTop(apiModule, bVar);
    }

    public static setBadgeColor provideHereLookupById(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        setBadgeColor provideHereLookupById = apiModule.provideHereLookupById(getmin);
        if (provideHereLookupById != null) {
            return provideHereLookupById;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
