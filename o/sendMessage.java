package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class sendMessage implements getAdapterPosition<b.AnonymousClass8> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public sendMessage(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final b.AnonymousClass8 get() {
        return provideBokuApi(this.module, this.builderProvider.get());
    }

    public static sendMessage create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new sendMessage(apiModule, bVar);
    }

    public static b.AnonymousClass8 provideBokuApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        b.AnonymousClass8 provideBokuApi = apiModule.provideBokuApi(getmin);
        if (provideBokuApi != null) {
            return provideBokuApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
