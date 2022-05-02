package o;

import id.dana.data.di.NetworkModule;

public final class AppRestartResult implements getAdapterPosition<onHandleWork> {
    private final NetworkModule module;

    public AppRestartResult(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public final onHandleWork get() {
        return provideOkhttpInterceptor(this.module);
    }

    public static AppRestartResult create(NetworkModule networkModule) {
        return new AppRestartResult(networkModule);
    }

    public static onHandleWork provideOkhttpInterceptor(NetworkModule networkModule) {
        onHandleWork provideOkhttpInterceptor = networkModule.provideOkhttpInterceptor();
        if (provideOkhttpInterceptor != null) {
            return provideOkhttpInterceptor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
