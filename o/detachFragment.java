package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class detachFragment implements getAdapterPosition<setExtUrl> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public detachFragment(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final setExtUrl get() {
        return provideUserEmailAddressApi(this.module, this.builderProvider.get());
    }

    public static detachFragment create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new detachFragment(apiModule, bVar);
    }

    public static setExtUrl provideUserEmailAddressApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        setExtUrl provideUserEmailAddressApi = apiModule.provideUserEmailAddressApi(getmin);
        if (provideUserEmailAddressApi != null) {
            return provideUserEmailAddressApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
