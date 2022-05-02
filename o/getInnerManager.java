package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class getInnerManager implements getAdapterPosition<setBadgeSize> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public getInnerManager(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final setBadgeSize get() {
        return provideHereGeocodeApi(this.module, this.builderProvider.get());
    }

    public static getInnerManager create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new getInnerManager(apiModule, bVar);
    }

    public static setBadgeSize provideHereGeocodeApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        setBadgeSize provideHereGeocodeApi = apiModule.provideHereGeocodeApi(getmin);
        if (provideHereGeocodeApi != null) {
            return provideHereGeocodeApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
