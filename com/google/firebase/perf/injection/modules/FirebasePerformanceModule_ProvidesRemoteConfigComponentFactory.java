package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements getAdapterPosition<Provider<RemoteConfigComponent>> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final Provider<RemoteConfigComponent> get() {
        return providesRemoteConfigComponent(this.module);
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
    }

    public static Provider<RemoteConfigComponent> providesRemoteConfigComponent(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<RemoteConfigComponent> providesRemoteConfigComponent = firebasePerformanceModule.providesRemoteConfigComponent();
        if (providesRemoteConfigComponent != null) {
            return providesRemoteConfigComponent;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
