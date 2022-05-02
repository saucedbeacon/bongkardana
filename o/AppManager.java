package o;

import android.content.Context;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import id.dana.data.di.NetworkModule;
import o.b;

public final class AppManager implements getAdapterPosition<ISSLPinningManager> {
    private final b.C0007b<Context> contextProvider;
    private final NetworkModule module;

    public AppManager(NetworkModule networkModule, b.C0007b<Context> bVar) {
        this.module = networkModule;
        this.contextProvider = bVar;
    }

    public final ISSLPinningManager get() {
        return provideISSLPinningManager(this.module, this.contextProvider.get());
    }

    public static AppManager create(NetworkModule networkModule, b.C0007b<Context> bVar) {
        return new AppManager(networkModule, bVar);
    }

    public static ISSLPinningManager provideISSLPinningManager(NetworkModule networkModule, Context context) {
        ISSLPinningManager provideISSLPinningManager = networkModule.provideISSLPinningManager(context);
        if (provideISSLPinningManager != null) {
            return provideISSLPinningManager;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
