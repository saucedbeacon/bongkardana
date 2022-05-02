package o;

import com.google.gson.Gson;
import id.dana.data.di.NetworkModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class parse implements getAdapterPosition<UtdidDeviceIdProvider.getMin> {
    private final b.C0007b<Gson> gsonProvider;
    private final NetworkModule module;
    private final b.C0007b<generateKey> okHttpClientProvider;

    public parse(NetworkModule networkModule, b.C0007b<Gson> bVar, b.C0007b<generateKey> bVar2) {
        this.module = networkModule;
        this.gsonProvider = bVar;
        this.okHttpClientProvider = bVar2;
    }

    public final UtdidDeviceIdProvider.getMin get() {
        return provideSecuredRetrofitBuilder(this.module, this.gsonProvider.get(), this.okHttpClientProvider.get());
    }

    public static parse create(NetworkModule networkModule, b.C0007b<Gson> bVar, b.C0007b<generateKey> bVar2) {
        return new parse(networkModule, bVar, bVar2);
    }

    public static UtdidDeviceIdProvider.getMin provideSecuredRetrofitBuilder(NetworkModule networkModule, Gson gson, generateKey generatekey) {
        UtdidDeviceIdProvider.getMin provideSecuredRetrofitBuilder = networkModule.provideSecuredRetrofitBuilder(gson, generatekey);
        if (provideSecuredRetrofitBuilder != null) {
            return provideSecuredRetrofitBuilder;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
