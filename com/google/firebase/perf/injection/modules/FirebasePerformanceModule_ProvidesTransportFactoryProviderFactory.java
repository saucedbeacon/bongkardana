package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements getAdapterPosition<Provider<TransportFactory>> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.module);
    }

    public static FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule);
    }

    public static Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<TransportFactory> providesTransportFactoryProvider = firebasePerformanceModule.providesTransportFactoryProvider();
        if (providesTransportFactoryProvider != null) {
            return providesTransportFactoryProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
