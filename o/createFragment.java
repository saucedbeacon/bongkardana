package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class createFragment implements getAdapterPosition<BackPressedPoint> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public createFragment(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final BackPressedPoint get() {
        return provideGeocoderApi(this.module, this.builderProvider.get());
    }

    public static createFragment create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new createFragment(apiModule, bVar);
    }

    public static BackPressedPoint provideGeocoderApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        BackPressedPoint provideGeocoderApi = apiModule.provideGeocoderApi(getmin);
        if (provideGeocoderApi != null) {
            return provideGeocoderApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
