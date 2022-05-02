package o;

import com.google.gson.Gson;
import id.dana.data.di.NetworkModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class EntryInfo implements getAdapterPosition<UtdidDeviceIdProvider.getMin> {
    private final b.C0007b<Gson> gsonProvider;
    private final NetworkModule module;
    private final b.C0007b<generateKey> okHttpClientProvider;

    public EntryInfo(NetworkModule networkModule, b.C0007b<Gson> bVar, b.C0007b<generateKey> bVar2) {
        this.module = networkModule;
        this.gsonProvider = bVar;
        this.okHttpClientProvider = bVar2;
    }

    public final UtdidDeviceIdProvider.getMin get() {
        return provideSecuredRetrofitNameCheckBuilder(this.module, this.gsonProvider.get(), this.okHttpClientProvider.get());
    }

    public static EntryInfo create(NetworkModule networkModule, b.C0007b<Gson> bVar, b.C0007b<generateKey> bVar2) {
        return new EntryInfo(networkModule, bVar, bVar2);
    }

    public static UtdidDeviceIdProvider.getMin provideSecuredRetrofitNameCheckBuilder(NetworkModule networkModule, Gson gson, generateKey generatekey) {
        UtdidDeviceIdProvider.getMin provideSecuredRetrofitNameCheckBuilder = networkModule.provideSecuredRetrofitNameCheckBuilder(gson, generatekey);
        if (provideSecuredRetrofitNameCheckBuilder != null) {
            return provideSecuredRetrofitNameCheckBuilder;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
