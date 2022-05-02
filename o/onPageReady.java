package o;

import id.dana.data.di.NetworkModule;
import o.translateSingleFrame;

public final class onPageReady implements getAdapterPosition<translateSingleFrame.length> {
    private final NetworkModule module;

    public onPageReady(NetworkModule networkModule) {
        this.module = networkModule;
    }

    public final translateSingleFrame.length get() {
        return provideEventListenerFactory(this.module);
    }

    public static onPageReady create(NetworkModule networkModule) {
        return new onPageReady(networkModule);
    }

    public static translateSingleFrame.length provideEventListenerFactory(NetworkModule networkModule) {
        translateSingleFrame.length provideEventListenerFactory = networkModule.provideEventListenerFactory();
        if (provideEventListenerFactory != null) {
            return provideEventListenerFactory;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
