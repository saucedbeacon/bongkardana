package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class createAppContext implements getAdapterPosition<finish> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public createAppContext(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final finish get() {
        return provideBranchIoApi(this.module, this.builderProvider.get());
    }

    public static createAppContext create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new createAppContext(apiModule, bVar);
    }

    public static finish provideBranchIoApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        finish provideBranchIoApi = apiModule.provideBranchIoApi(getmin);
        if (provideBranchIoApi != null) {
            return provideBranchIoApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
