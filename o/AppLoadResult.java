package o;

import id.dana.data.di.NetworkModule;
import o.b;

public final class AppLoadResult implements getAdapterPosition<setParam> {
    private final NetworkModule module;
    private final b.C0007b<setParam> okHttpSSLPinningManagerProvider;

    public AppLoadResult(NetworkModule networkModule, b.C0007b<setParam> bVar) {
        this.module = networkModule;
        this.okHttpSSLPinningManagerProvider = bVar;
    }

    public final setParam get() {
        return provideIOkHttpSSLPinningManager$420e8e4a(this.module, this.okHttpSSLPinningManagerProvider.get());
    }

    public static AppLoadResult create(NetworkModule networkModule, b.C0007b<setParam> bVar) {
        return new AppLoadResult(networkModule, bVar);
    }

    public static setParam provideIOkHttpSSLPinningManager$420e8e4a(NetworkModule networkModule, setParam setparam) {
        setParam provideIOkHttpSSLPinningManager$3c962557 = networkModule.provideIOkHttpSSLPinningManager$3c962557(setparam);
        if (provideIOkHttpSSLPinningManager$3c962557 != null) {
            return provideIOkHttpSSLPinningManager$3c962557;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
