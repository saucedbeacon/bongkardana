package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class checkTabBar implements getAdapterPosition<getNbUrl> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public checkTabBar(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final getNbUrl get() {
        return provideZendeskApi(this.module, this.builderProvider.get());
    }

    public static checkTabBar create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new checkTabBar(apiModule, bVar);
    }

    public static getNbUrl provideZendeskApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        getNbUrl provideZendeskApi = apiModule.provideZendeskApi(getmin);
        if (provideZendeskApi != null) {
            return provideZendeskApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
