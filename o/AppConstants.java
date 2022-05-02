package o;

import com.google.gson.Gson;
import id.dana.data.di.NetworkModule;

public final class AppConstants implements getAdapterPosition<Gson> {
    private final NetworkModule module;

    public AppConstants(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public final Gson get() {
        return provideGson(this.module);
    }

    public static AppConstants create(NetworkModule networkModule) {
        return new AppConstants(networkModule);
    }

    public static Gson provideGson(NetworkModule networkModule) {
        Gson provideGson = networkModule.provideGson();
        if (provideGson != null) {
            return provideGson;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
