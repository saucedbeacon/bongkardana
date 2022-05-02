package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class DefaultFragmentManager implements getAdapterPosition<addInfo> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public DefaultFragmentManager(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final addInfo get() {
        return provideCardQueryNoPrefixApi(this.module, this.builderProvider.get());
    }

    public static DefaultFragmentManager create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new DefaultFragmentManager(apiModule, bVar);
    }

    public static addInfo provideCardQueryNoPrefixApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        addInfo provideCardQueryNoPrefixApi = apiModule.provideCardQueryNoPrefixApi(getmin);
        if (provideCardQueryNoPrefixApi != null) {
            return provideCardQueryNoPrefixApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
