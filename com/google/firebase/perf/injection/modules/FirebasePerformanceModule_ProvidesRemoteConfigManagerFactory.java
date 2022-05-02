package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import o.getAdapterPosition;

public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements getAdapterPosition<RemoteConfigManager> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final RemoteConfigManager get() {
        return providesRemoteConfigManager(this.module);
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
    }

    public static RemoteConfigManager providesRemoteConfigManager(FirebasePerformanceModule firebasePerformanceModule) {
        RemoteConfigManager providesRemoteConfigManager = firebasePerformanceModule.providesRemoteConfigManager();
        if (providesRemoteConfigManager != null) {
            return providesRemoteConfigManager;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
