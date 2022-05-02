package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class isFinishing implements getAdapterPosition<setAttrData> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public isFinishing(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final setAttrData get() {
        return provideConvertCardIndexNoApi(this.module, this.builderProvider.get());
    }

    public static isFinishing create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new isFinishing(apiModule, bVar);
    }

    public static setAttrData provideConvertCardIndexNoApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        setAttrData provideConvertCardIndexNoApi = apiModule.provideConvertCardIndexNoApi(getmin);
        if (provideConvertCardIndexNoApi != null) {
            return provideConvertCardIndexNoApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
