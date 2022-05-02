package o;

import id.dana.data.di.NetworkModule;
import okhttp3.logging.HttpLoggingInterceptor;

public final class EmbedType implements getAdapterPosition<HttpLoggingInterceptor> {
    private final NetworkModule module;

    public EmbedType(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public final HttpLoggingInterceptor get() {
        return provideHttpLoggingInterceptor(this.module);
    }

    public static EmbedType create(NetworkModule networkModule) {
        return new EmbedType(networkModule);
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor(NetworkModule networkModule) {
        HttpLoggingInterceptor provideHttpLoggingInterceptor = networkModule.provideHttpLoggingInterceptor();
        if (provideHttpLoggingInterceptor != null) {
            return provideHttpLoggingInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
