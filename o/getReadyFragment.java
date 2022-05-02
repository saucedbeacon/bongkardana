package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class getReadyFragment implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$82$1> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public getReadyFragment(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$82$1 get() {
        return provideLoyaltyApi(this.module, this.builderProvider.get());
    }

    public static getReadyFragment create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new getReadyFragment(apiModule, bVar);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$82$1 provideLoyaltyApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        com_alibaba_ariver_app_api_ExtOpt$82$1 provideLoyaltyApi = apiModule.provideLoyaltyApi(getmin);
        if (provideLoyaltyApi != null) {
            return provideLoyaltyApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
